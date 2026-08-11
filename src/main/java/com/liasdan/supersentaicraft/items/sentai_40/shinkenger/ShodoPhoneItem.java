package com.liasdan.supersentaicraft.items.sentai_40.shinkenger;

import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.sentai_40.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class ShodoPhoneItem extends RangerChangerItem{

	public ShodoPhoneItem (Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		Has_basic_belt_info=false;
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		Item formItem = this.get_Form_Item(stack, 1);
		Item formItem2 = this.get_Form_Item(stack, 2);

		if (formItem2== OtherItems.BLANK_FORM.get()) tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem.toString() + ".form").getString()));
		else {
			tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem2.toString() + ".form").getString()
					+ " " + Component.translatable(formItem.toString() + ".form").getString()));
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
				if (rider.getMainHandItem().getItem() == ShinkengerItems.SHINKENMARU.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.REKKA_DAIZANTOU.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.WATER_ARROW.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.HEAVEN_FAN.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.WOOD_SPEAR.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.LAND_SLICER.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.SUPER_SHINKENMARU.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.KYORYUMARU.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.KYORYUMARU_SAKANAMARU.get() ||
						rider.getMainHandItem().getItem() == ShinkengerItems.SUPER_MOGYUU_BAZOOKA.get()) {
					belt = get_Form_Item(itemstack, 1).getBeltTex() + "_empty";
				} else if (((RangerChangerItem) itemstack.getItem()).BELT_TEXT == null) {
					belt = get_Form_Item(itemstack, 1).getBeltTex();
				}
				return "belts/" + belt;
			}
		}
		else if (equipmentSlot == EquipmentSlot.HEAD) {
			if (get_Form_Item(itemstack,2).getFormName(fly)=="") return "blank";
			else return get_Form_Item(itemstack,2).getFormName(fly);
		}
		
		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
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