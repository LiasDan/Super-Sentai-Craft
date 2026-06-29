package com.liasdan.supersentaicraft.items.others;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.summon.BaseSummonEntity;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.CustomData;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import com.google.common.collect.Lists;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.client.MechaArmorRenderer;
import com.liasdan.supersentaicraft.items.client.RangerArmorRenderer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;

public class MechaGattaiItem extends MechaArmorItem {

	public String armorNamePrefix;
	public RangerFormChangeItem Base_Form_Item;
	private ArrayList<RangerFormChangeItem> Extra_Base_Form_Item;
	public String Rider;
	public Item TORSO;
	public Item LEGS; 
	public Item BOOTS;
	public int Num_Base_Form_Item = 1;
	public String BELT_TEXT;

	public Boolean Has_basic_belt_info = true;
	public Boolean Show_belt_form_info = true;

	public int Unlimited_Textures = 0;


	public MechaGattaiItem (Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item>torso, DeferredItem<Item> legs, DeferredItem<Item> boot, Properties properties)
	{
		super(material, ArmorItem.Type.HELMET, properties);

		Rider=rider;
		Base_Form_Item=((RangerFormChangeItem)baseFormItem.get());
		TORSO=torso.get(); 
		LEGS=legs.get();
		BOOTS=boot.get();

	}

	public boolean isTransformed(LivingEntity player) {
		if (!(player.getItemBySlot(EquipmentSlot.HEAD).getItem()instanceof MechaGattaiItem))return false;
		return player.getItemBySlot(EquipmentSlot.FEET).getItem()==BOOTS.asItem()
				&&player.getItemBySlot(EquipmentSlot.CHEST).getItem()==TORSO.asItem()
				&&player.getItemBySlot(EquipmentSlot.LEGS).getItem()==LEGS.asItem()
				&&player.getItemBySlot(EquipmentSlot.HEAD).getItem()==this;
	}

	public static boolean isTransforming(LivingEntity player) {
		if (!(player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem)) return false;
		return player.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue()!=0;
	}

	public static double getRenderType(ItemStack stack) {
		double form_double = 1;
		return form_double ;
	}

	public void beltTick(ItemStack stack, Level level, LivingEntity player, int slotId) {
		if (stack.has(DataComponents.CUSTOM_DATA)) {
			CompoundTag tag = stack.get(DataComponents.CUSTOM_DATA).getUnsafe();
			if (tag.getBoolean("Update_form") && slotId == 39) OnformChange(stack, player, tag);
			if (!isTransformed(player) || slotId != 39) tag.putBoolean("Update_form", true);
			if (isTransformed(player)) tag.putDouble("render_type", getRenderType(stack));
			if (!isTransformed(player)) tag.putDouble("render_type", 0);

		} else {
			set_Update_Form(stack);
		}
	}

	public void giveEffects(LivingEntity player) {
		if (isTransformed(player)) {
			for (int n = 0; n < Num_Base_Form_Item; n++) {
				RangerFormChangeItem form = get_Form_Item(player.getItemBySlot(EquipmentSlot.HEAD), n + 1);
				List<MobEffectInstance> potionEffectList = form.getPotionEffectList();
				for (MobEffectInstance effect : potionEffectList) {
					if ((effect.getEffect() != MobEffects.DAMAGE_BOOST&&
							effect.getEffect() != MobEffects.DIG_SPEED&&
							effect.getEffect() != MobEffects.REGENERATION&&
							effect.getEffect() != MobEffects.DAMAGE_RESISTANCE&&
							effect.getEffect() != MobEffects.MOVEMENT_SPEED&&
							effect.getEffect() != EffectCore.SLASH&&
							effect.getEffect() != EffectCore.PUNCH)
							||(player instanceof BaseSummonEntity
							&&(effect.getEffect() != MobEffects.DAMAGE_RESISTANCE || effect.getAmplifier() < 3))
							||player instanceof Player) {
						player.addEffect(new MobEffectInstance(effect.getEffect(), effect.getDuration(), effect.getAmplifier(), true, false));
					}
				}
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
		if (entity instanceof LivingEntity livingEntity && stack == livingEntity.getItemBySlot(EquipmentSlot.HEAD)) {
			this.beltTick(stack, level, livingEntity, slotId);
			this.giveEffects(livingEntity);
		} else if (entity instanceof
				LivingEntity player) {
			if (stack.has(DataComponents.CUSTOM_DATA)) {
				if (!isTransformed(player) || slotId != 39) {
					Consumer<CompoundTag> data = form -> {
						form.putBoolean("rider_kicking", false);
						form.putDouble("rider_kick_cooldown", 200);
						form.putDouble("rider_kick_tick", 0);
						form.putBoolean("Update_form", true);
					};
					CustomData.update(DataComponents.CUSTOM_DATA, stack, data);
				}
			}
		}
	}

	public void OnformChange(ItemStack itemstack, LivingEntity player,CompoundTag  tag) {
		if (isTransformed(player)) {
			OnTransformation(itemstack, player);
			Consumer<CompoundTag> data = form -> {
				form.putBoolean("Update_form", false);
				form.putDouble("render_type", getRenderType(itemstack));
			};
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, data);
			player.getAttribute(AttributeRegistry.IS_TRANSFORMING).setBaseValue(30);
			player.getAttribute(AttributeRegistry.CAPE_ROT).setBaseValue(0);
			player.getAttribute(AttributeRegistry.WHEEL_ROT).setBaseValue(0);
			player.getAttribute(AttributeRegistry.BALL_ROT).setBaseValue(0);
		}
	}

	public void OnTransformation(ItemStack itemstack, LivingEntity player) {
		if(isTransformed(player) && !player.level().isClientSide()) {
			for (int n = 0; n < Num_Base_Form_Item; n++) {
				RangerFormChangeItem form = get_Form_Item(itemstack, n + 1);
				form.OnTransformation(itemstack, player);
			}
		}
	}

	public MechaGattaiItem Add_Extra_Base_Form_Items(DeferredItem<Item> item) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get());
		Num_Base_Form_Item=2;
		return this;
	}

	public MechaGattaiItem Override_belt_text(String belt) {
		BELT_TEXT = belt;
		return this;
	}

	public MechaGattaiItem Add_Extra_Base_Form_Items(DeferredItem<Item> item,DeferredItem<Item> item2) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get(),(RangerFormChangeItem)item2.get());
		Num_Base_Form_Item=3;
		return this;
	}

	public MechaGattaiItem Add_Extra_Base_Form_Items(DeferredItem<Item> item,DeferredItem<Item> item2,DeferredItem<Item> item3) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get(),(RangerFormChangeItem)item2.get(),(RangerFormChangeItem)item3.get());
		Num_Base_Form_Item=4;
		return this;
	}

	public MechaGattaiItem Add_Extra_Base_Form_Items(DeferredItem<Item> item,DeferredItem<Item> item2,DeferredItem<Item> item3,DeferredItem<Item> item4) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get(),(RangerFormChangeItem)item2.get(),(RangerFormChangeItem)item3.get(),(RangerFormChangeItem)item4.get());
		Num_Base_Form_Item=5;
		return this;
	}

	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String riderName)
	{
		boolean fly = rider.getAttribute(AttributeRegistry.WINGS_OUT).getBaseValue() == 1;

		if (equipmentSlot == EquipmentSlot.HEAD) {
			String belt = ((MechaGattaiItem)itemstack.getItem()).BELT_TEXT;
			if (((MechaGattaiItem)itemstack.getItem()).BELT_TEXT==null) {
				belt = get_Form_Item(itemstack,1).getBeltTex();
			}
			return belt;
		}
		else return get_Form_Item(itemstack,1).getRangerName(riderName)+get_Form_Item(itemstack,1).getFormName(fly);

	}

	public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName ,int num)
	{
		return "blank";
	}

	public ResourceLocation getModelResource(ItemStack itemstack,MechaArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		if (get_Form_Item(itemstack, 1).HasWingsIfFlying() && rider.getAttribute(AttributeRegistry.WINGS_OUT).getBaseValue()==1){
			return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, 1).get_FlyingModel(this.Rider));
		}
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, 1).get_Model(this.Rider));
	}
	
	public ResourceLocation getBeltModelResource(ItemStack itemstack,MechaArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, 1).getBeltModel());
	}

	public ResourceLocation getAnimationResource(ItemStack itemstack,MechaArmorItem animatable, EquipmentSlot slot) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "animations/ranger.animation.json");
	}

	public void setCustomAnimations(MechaArmorItem an, long instanceId, AnimationState<MechaArmorItem> state) {

	}

	public boolean getGlowForSlot(ItemStack itemstack,EquipmentSlot currentSlot, LivingEntity livingEntity) {
		if (currentSlot == EquipmentSlot.HEAD) return get_Form_Item(itemstack, 1).get_Is_Belt_Glowing();
		else if (isTransformed(livingEntity)) return get_Form_Item(itemstack, 1).get_Is_Glowing();
		return false;
	}

	public static void set_Update_Form(ItemStack itemstack)
	{
		if (!itemstack.has(DataComponents.CUSTOM_DATA)) {
			itemstack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
		}
		if (itemstack.getItem() instanceof MechaGattaiItem) {
			Consumer<CompoundTag> data = form -> {
				form.putBoolean("Update_form", true);
				form.putDouble("render_type2", 1);
			};
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, data);
		}
	}

	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT) {
		if (!itemstack.has(DataComponents.CUSTOM_DATA)) {
			itemstack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
		}
		if (itemstack.getItem() instanceof MechaGattaiItem driver) {
			CompoundTag tag = new CompoundTag();
			Consumer<CompoundTag> data = form ->
			{
				if (!form.getString("slot_tex" + SLOT).equals(ITEM.toString())) {
					form.putString("slot_tex" + SLOT, ITEM.toString());
					form.putBoolean("Update_form", true);
					form.putDouble("render_type2", 1);
				}
			};

			data.accept(tag);
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, data);
			driver.Extra_set_Form_Item(itemstack, ITEM, SLOT, tag);
		}
	}

	public void Extra_set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT, CompoundTag tag)
	{
	}

	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {
		switch (currentSlot) {
			case FEET ->{
				return true;
			}case LEGS,CHEST ->{
				return false;
			}
			default -> {}
		}
		return false;
	}




	public static RangerFormChangeItem get_Form_Item(ItemStack itemstack,int SLOT)
	{
		MechaGattaiItem belt = (MechaGattaiItem)itemstack.getItem();
		RangerFormChangeItem Base_Form_Item = (SLOT>=2 ? belt.Extra_Base_Form_Item.get(SLOT-2) : belt.Base_Form_Item);

		if (itemstack.has(DataComponents.CUSTOM_DATA)) {
			CompoundTag tag = itemstack.get(DataComponents.CUSTOM_DATA).getUnsafe();
			ResourceLocation Used_Form_Item = ResourceLocation.parse(tag.getString("slot_tex" + SLOT));
			if (BuiltInRegistries.ITEM.get(Used_Form_Item) instanceof RangerFormChangeItem formItem) {
				return formItem;
			}
		}
		return Base_Form_Item;
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		if (Has_basic_belt_info) {
			if (Show_belt_form_info) {
				{
					Item formItem = this.get_Form_Item(stack, 1);
					tooltipComponents.add(Component.translatable(formItem.toString() + ".form"));
				}
			}
		}
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}

	public boolean HasCape(ItemStack itemstack) {
		for (int n = 0; n < Num_Base_Form_Item; n++) {
			if(get_Form_Item(itemstack, n + 1).get_has_cape())return true;
		}
		return false;
	}

}