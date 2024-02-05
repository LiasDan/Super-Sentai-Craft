package com.liasdan.supersentaicraft.items.others;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.Lists;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.client.RangerArmorRenderer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.registries.RegistryObject;
public class RangerChangerItem extends RangerArmorItem{

	public String armorNamePrefix;
	public RangerFormChangeItem Base_Form_Item;
	private ArrayList<RangerFormChangeItem> Extra_Base_Form_Item;
	public String Rider;
	public Item HEAD;
	public Item TORSO;
	public Item LEGS; 
	public int Num_Base_Form_Item = 1;
	public String BELT_TEXT;


	public RangerChangerItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, ArmorItem.Type.BOOTS, properties);

		Rider=rider;
		Base_Form_Item=((RangerFormChangeItem)baseFormItem.get());
		HEAD=head.get();
		TORSO=torso.get(); 
		LEGS=legs.get();

	}


	@Override
	public void onArmorTick(ItemStack stack, Level level, Player player)
	{

		if (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == LEGS){
			if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == TORSO){
				if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == HEAD){
					if (player.getItemBySlot(EquipmentSlot.FEET).getItem() == this){

						for (int n = 0; n < Num_Base_Form_Item; n++)
						{
							List<MobEffectInstance> potionEffectList = get_Form_Item(player.getItemBySlot(EquipmentSlot.FEET),n+1).getPotionEffectList();
							for (int i = 0; i < potionEffectList.size(); i++)
							{
								//player.setInvisible(true);
								player.addEffect(new MobEffectInstance(potionEffectList.get(i).getEffect(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
							}
						}
					}
				}
			}
		}

	}


	public RangerChangerItem Add_Extra_Base_Form_Items(RegistryObject<Item> item) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get());
		Num_Base_Form_Item=2;
		return this;
	}

	public RangerChangerItem Override_belt_text(String belt) {
		BELT_TEXT = belt;
		return this;
	}

	public RangerChangerItem Add_Extra_Base_Form_Items(RegistryObject<Item> item,RegistryObject<Item> item2) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get(),(RangerFormChangeItem)item2.get());
		Num_Base_Form_Item=3;
		return this;
	}

	public RangerChangerItem Add_Extra_Base_Form_Items(RegistryObject<Item> item,RegistryObject<Item> item2,RegistryObject<Item> item3) {
		Extra_Base_Form_Item= Lists.newArrayList((RangerFormChangeItem)item.get(),(RangerFormChangeItem)item2.get(),(RangerFormChangeItem)item3.get());
		Num_Base_Form_Item=4;
		return this;
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			private RangerArmorRenderer renderer;

			@Override
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
					EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
				this.renderer = new RangerArmorRenderer(livingEntity, equipmentSlot);

				this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
				return this.renderer;
			}
		});
	}


	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String riderName)
	{

		boolean fly = !rider.onGround();

		if (equipmentSlot == EquipmentSlot.FEET) {
			String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
			if (((RangerChangerItem)itemstack.getItem()).BELT_TEXT==null) {
				belt = get_Form_Item(itemstack,1).getBeltTex();
			}
			return "belts/"+belt;
		}
		else return riderName+get_Form_Item(itemstack,1).getFormName(fly);

	}


	public ResourceLocation getModelResource(ItemStack itemstack,RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		return new ResourceLocation(SuperSentaiCraftCore.MODID, get_Form_Item(itemstack, 1).get_Model());
	}
	
	public ResourceLocation getBeltModelResource(ItemStack itemstack,RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		return new ResourceLocation(SuperSentaiCraftCore.MODID, get_Form_Item(itemstack, 1).getBeltModel());
	}

	public ResourceLocation getAnimationResource(ItemStack itemstack,RangerArmorItem animatable, EquipmentSlot slot) {
		return new ResourceLocation(SuperSentaiCraftCore.MODID, "animations/ranger.animation.json");
	}


	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
		if (!itemstack.hasTag())
		{
			itemstack.setTag(new CompoundTag());
		}
		if (itemstack.getItem() instanceof RangerChangerItem) {
			((RangerChangerItem)itemstack.getItem()).Extra_set_Form_Item(itemstack, ITEM, SLOT);

			itemstack.getTag().putInt("slot"+SLOT, Item.getId(ITEM));
		}
	}

	public void Extra_set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
	}

	public  boolean getPartsForSlot(EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
		}
		case CHEST -> {
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
		}
		case LEGS -> {

			if (part =="rightLeg") return true;
			if (part =="leftLeg") return true;
		}
		default -> {}
		}
		return false;
	}




	public static RangerFormChangeItem get_Form_Item(ItemStack itemstack,int SLOT)
	{

		RangerChangerItem belt = (RangerChangerItem)itemstack.getItem();
		RangerFormChangeItem Base_Form_Item = belt.Base_Form_Item;

		if (SLOT == 2) {
			Base_Form_Item =belt.Extra_Base_Form_Item.get(0);
		}else if (SLOT == 3) {
			Base_Form_Item =belt.Extra_Base_Form_Item.get(1);
		}else if (SLOT == 4) {
			Base_Form_Item =belt.Extra_Base_Form_Item.get(2);
		}

		if (!itemstack.hasTag())
		{
			return  Base_Form_Item;
		}else if (Item.byId(itemstack.getTag().getInt("slot"+SLOT))instanceof RangerFormChangeItem){
			return (RangerFormChangeItem) Item.byId(itemstack.getTag().getInt("slot"+SLOT));
		}else{
			return Base_Form_Item;
		}
	}




}