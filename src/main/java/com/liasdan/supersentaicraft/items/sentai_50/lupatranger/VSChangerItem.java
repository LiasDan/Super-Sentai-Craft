package com.liasdan.supersentaicraft.items.sentai_50.lupatranger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.sentai_50.LuPatRangerItems;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class VSChangerItem extends RangerChangerItem{

	public VSChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		Has_basic_belt_info=false;
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		Item formItem = this.get_Form_Item(stack, 1);
		Item formItem2 = this.get_Form_Item(stack, 2);

		if (formItem==LuPatRangerItems.VICTORY_STRIKER.get()) {
			if (this == LuPatRangerItems.RED_VS_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_lupin_red.form"));
			if (this == LuPatRangerItems.BLUE_VS_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_lupin_blue.form"));
			if (this == LuPatRangerItems.YELLOW_VS_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:super_lupin_yellow.form"));
		}
		else if (formItem2==LuPatRangerItems.SIREN_STRIKER.get()) {
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
		
		boolean fly = !rider.onGround();
		
		if (equipmentSlot == EquipmentSlot.FEET) {
			if (!isTransformed(rider)) {
				return "blank";
			}
			else {
				if (((RangerChangerItem) itemstack.getItem()).BELT_TEXT == null) {
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
			else if (get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_tsuyo_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_nobi_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_omo_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_haya_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kata_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kike_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kusa_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_mie_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_mukimuki_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_chiisa_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_mabushi_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_mist_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_karu_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_gyaku_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kotae_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_migake_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kunkun_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_pukupuku_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kakure_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_fue_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_nemu_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_mawari_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_kawaki_soul"|
					get_Form_Item(itemstack,2).getFormName(fly)=="ryusoul_yawaraka_soul") return "blank";
			else return get_Form_Item(itemstack,2).getFormName(fly);
		}
		
		else return get_Form_Item(itemstack,1).getRangerName(rangerName)+get_Form_Item(itemstack,1).getFormName(fly);
	}

	public ResourceLocation getModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		int num = 1;
		if (slot == EquipmentSlot.HEAD)num=2;

		if (get_Form_Item(itemstack,num).get_Model(this.Rider)=="geo/rangerwing.geo.json") {
			return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/rangerwing.geo.json");
		}
		else return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+get_Form_Item(itemstack, num).get_Model(this.Rider));
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