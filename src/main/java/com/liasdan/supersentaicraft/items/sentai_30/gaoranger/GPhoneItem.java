package com.liasdan.supersentaicraft.items.sentai_30.gaoranger;

import com.liasdan.supersentaicraft.items.sentai_30.GaorangerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class GPhoneItem extends RangerChangerItem{

	public GPhoneItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}
	
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName)
	{
		String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
		
		boolean fly = !rider.onGround();
		
		if (equipmentSlot == EquipmentSlot.FEET) {
				if (rider.getMainHandItem().getItem()== GaorangerItems.JUUOUKEN.get()
						||rider.getMainHandItem().getItem()== GaorangerItems.JUUOUKEN_LION.get()
						||rider.getMainHandItem().getItem()== GaorangerItems.JUUOUKEN_EAGLE.get()
						||rider.getMainHandItem().getItem()== GaorangerItems.JUUOUKEN_SHARK.get()
						||rider.getMainHandItem().getItem()== GaorangerItems.JUUOUKEN_BISON.get()
						||rider.getMainHandItem().getItem()== GaorangerItems.JUUOUKEN_TIGER.get()) {
					belt = get_Form_Item(itemstack,1).getBeltTex()+"_empty";
				}
				else if (((RangerChangerItem)itemstack.getItem()).BELT_TEXT==null) {
					belt = get_Form_Item(itemstack,1).getBeltTex();
				}
				return "belts/"+belt;
		}
		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
	}
}