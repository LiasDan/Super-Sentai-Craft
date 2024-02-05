package com.liasdan.supersentaicraft.items.ryusoulger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.MaskmanItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
public class GaisoulKenItem extends RangerChangerItem{

	public GaisoulKenItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}
	
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName)
	{
		String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
		
		boolean fly = !rider.onGround();
		
		if (equipmentSlot == EquipmentSlot.FEET) {
			if (rider.getMainHandItem().getItem()==RyusoulgerItems.RYUSOUL_KEN.get() ||
					rider.getMainHandItem().getItem()==RyusoulgerItems.RYUSOUL_CALIBUR.get()) {
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