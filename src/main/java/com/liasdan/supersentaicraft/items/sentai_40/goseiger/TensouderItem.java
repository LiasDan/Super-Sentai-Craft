package com.liasdan.supersentaicraft.items.sentai_40.goseiger;

import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_40.GoseigerItems;
import com.liasdan.supersentaicraft.items.sentai_40.ShinkengerItems;
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

public class TensouderItem extends RangerChangerItem{

	public TensouderItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}
	
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName)
	{
		String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
		
		boolean fly = !rider.onGround();
		
		if (equipmentSlot == EquipmentSlot.FEET) {
			if (rider.getMainHandItem().getItem()== GoseigerItems.GOSEI_BLASTER.get() ||
					rider.getMainHandItem().getItem()==GoseigerItems.GOSEI_BLASTER_DRAGON.get() ||
					rider.getMainHandItem().getItem()==GoseigerItems.GOSEI_BLASTER_PHOENIX.get() ||
					rider.getMainHandItem().getItem()==GoseigerItems.GOSEI_BLASTER_SNAKE.get() ||
					rider.getMainHandItem().getItem()==GoseigerItems.GOSEI_BLASTER_TIGER.get() ||
					rider.getMainHandItem().getItem()==GoseigerItems.GOSEI_BLASTER_SHARK.get()) {
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