package com.liasdan.supersentaicraft.items.sentai_10.sun_vulcan;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.sentai_10.SunVulcanItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class VulcanBraceItem extends RangerChangerItem{

	public VulcanBraceItem (Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}
	
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName)
	{
		String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
		
		boolean fly = !rider.onGround();
		
		if (equipmentSlot == EquipmentSlot.FEET) {
			if (!isTransformed(rider)) {
				if (this == SunVulcanItems.EAGLE_VULCAN_BRACE.get()) return "belts/vulcan_brace_eagle";
				if (this == SunVulcanItems.SHARK_VULCAN_BRACE.get()) return "belts/vulcan_brace_shark";
				if (this == SunVulcanItems.PANTHER_VULCAN_BRACE.get()) return "belts/vulcan_brace_panther";
				return "blank";
			}
			else {
				if (rider.getMainHandItem().getItem() == SunVulcanItems.VULCAN_STICK.get()) {
					belt = get_Form_Item(itemstack, 1).getBeltTex() + "_empty";
				} else if (((RangerChangerItem) itemstack.getItem()).BELT_TEXT == null) {
					belt = get_Form_Item(itemstack, 1).getBeltTex();
				}
				return "belts/" + belt;
			}
		}
		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	@Override
	public ResourceLocation getBeltModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		if (!isTransformed(rider)) return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/right_brace.geo.json");
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, 1).getBeltModel());
	}
}