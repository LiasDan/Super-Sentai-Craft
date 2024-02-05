package com.liasdan.supersentaicraft.items.shinkenger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.MaskmanItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
public class ShodoPhoneItem extends RangerChangerItem{

	public ShodoPhoneItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}
	
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName)
	{
		String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
		
		boolean fly = !rider.onGround();
		
		if (equipmentSlot == EquipmentSlot.FEET) {
				if (rider.getMainHandItem().getItem()==ShinkengerItems.SHINKENMARU.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.REKKA_DAIZANTOU.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.WATER_ARROW.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.HEAVEN_FAN.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.WOOD_SPEAR.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.LAND_SLICER.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.SUPER_SHINKENMARU.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.KYORYUMARU.get() ||
						rider.getMainHandItem().getItem()==ShinkengerItems.KYORYUMARU_SAKANAMARU.get()) {
					belt = get_Form_Item(itemstack,1).getBeltTex()+"_empty";
				}
				else if (((RangerChangerItem)itemstack.getItem()).BELT_TEXT==null) {
					belt = get_Form_Item(itemstack,1).getBeltTex();
				}
				return "belts/"+belt;
		}
		else if (equipmentSlot == EquipmentSlot.HEAD) {
			if (get_Form_Item(itemstack,2).getFormName(fly)=="") return "blank";
			else if (get_Form_Item(itemstack,2).getFormName(fly)=="_gedou") return rangerName+get_Form_Item(itemstack,2).getFormName(fly);
			else return get_Form_Item(itemstack,2).getFormName(fly);
		}
		
		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
	}
	
	public  boolean getPartsForSlot(EquipmentSlot currentSlot,String  part) {

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