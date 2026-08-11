package com.liasdan.supersentaicraft.items.sentai_50.ryusoulger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.*;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import com.liasdan.supersentaicraft.items.sentai_50.LuPatRangerItems;
import com.liasdan.supersentaicraft.items.sentai_50.RyusoulgerItems;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class RyusoulChangerItem extends RangerChangerItem{

	public RyusoulChangerItem (Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		Has_basic_belt_info=false;
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		Item formItem = this.get_Form_Item(stack, 1);
		Item formItem2 = this.get_Form_Item(stack, 2);

        if (formItem== LuPatRangerItems.VICTORY_STRIKER.get()) {
            if (this == RyusoulgerItems.RED_RYUSOUL_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_ryusoul_red.form"));
            if (this == RyusoulgerItems.BLUE_RYUSOUL_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_ryusoul_blue.form"));
            if (this == RyusoulgerItems.PINK_RYUSOUL_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_ryusoul_pink.form"));
            if (this == RyusoulgerItems.GREEN_RYUSOUL_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_ryusoul_green.form"));
            if (this == RyusoulgerItems.BLACK_RYUSOUL_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_ryusoul_black.form"));
            if (this == RyusoulgerItems.GOLD_MOSA_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_ryusoul_gold.form"));
        }
        else if (formItem2==RyusoulgerItems.NOBLESSE.get() | formItem2==LuPatRangerItems.SIREN_STRIKER.get()) {
			tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem2.toString() + ".form").getString()
					+ " " + Component.translatable(formItem.toString() + ".form").getString()));
		}
		else if (formItem2== OtherItems.BLANK_FORM.get()) tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem.toString() + ".form").getString()));
		else {
			tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem.toString() + ".form").getString()));
			tooltipComponents.add(Component.literal(Component.translatable(formItem2.toString() + ".form").getString()));
		}
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}
	
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName)
	{
		String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;

		boolean fly = rider instanceof Player player && player.getAbilities().flying;
		
		if (equipmentSlot == EquipmentSlot.FEET) {
			if (!isTransformed(rider)) {
				return "belts/ryusoul_changer";
			}
			else {
				if (rider.getMainHandItem().getItem() == RyusoulgerItems.RYUSOUL_KEN.get()) {
					if (get_Form_Item(itemstack, 1).getBeltTex() == "lupinranger_belt") belt = "lupinranger_belt";
					else belt = get_Form_Item(itemstack, 1).getBeltTex() + "_empty";
				} else if (((RangerChangerItem) itemstack.getItem()).BELT_TEXT == null) {
					belt = get_Form_Item(itemstack, 1).getBeltTex();
				}
				return "belts/" + belt;
			}
		}
		else if (equipmentSlot == EquipmentSlot.HEAD) {
			if (get_Form_Item(itemstack,2).getFormName(fly)=="") return "blank";
			else if (get_Form_Item(itemstack,2).getFormName(fly)=="lupat_scissor") {
				if (rider.getMainHandItem().getItem()== LuPatRangerItems.BLADE_BOOMERANG.get()) return "blank";
				else return get_Form_Item(itemstack,2).getFormName(fly);
			}
			else return get_Form_Item(itemstack,2).getFormName(fly);
		}
		
		else return get_Form_Item(itemstack,1).getRangerName(rangerName)+get_Form_Item(itemstack,1).getFormName(fly);
	}
	
	public ResourceLocation getModelResource(ItemStack itemstack,RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		int num = 1;
		if (slot == EquipmentSlot.HEAD)num=2;
		
		if (get_Form_Item(itemstack, 1).HasWingsIfFlying() && rider.getAttribute(AttributeRegistry.WINGS_OUT).getBaseValue()==1){
			return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, num).get_FlyingModel(this.Rider));
		}else   
			return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, num).get_Model(this.Rider));

	}

	@Override
	public ResourceLocation getBeltModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		if (!isTransformed(rider)) return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/left_brace.geo.json");
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, 1).getBeltModel());
	}
	
	public  boolean getPartsForSlot(ItemStack itemBySlot, EquipmentSlot currentSlot, String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			if (part =="rightLeg") return true;
			if (part =="leftLeg") return true;
		}
		case CHEST -> {
			if (part =="head") return true;
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
}