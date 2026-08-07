package com.liasdan.supersentaicraft.items.sentai_50.gozyuger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.sentai_50.GozyugerItems;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class TegaSwordItem extends RangerChangerItem{

	public TegaSwordItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
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
			if (get_Form_Item(itemstack,1) == GozyugerItems.WILD_GOZYU_WOLF_RING.get()) return "blank";
			if (get_Form_Item(itemstack,1) == GozyugerItems.RYOU_TEGA_SWORD_RING.get()) return "blank";
			if (get_Form_Item(itemstack,2) == GozyugerItems.RYOU_TEGA_SWORD_RING_OTHERS.get()) return "gozyu_tega_sword";
            if (this == GozyugerItems.LEON_TEGA_SWORD.get())
                if (get_Form_Item(itemstack,1) == GozyugerItems.GOZYU_LEON_RING.get()) return rangerName+"_armor";
                else return rangerName+"_armor2";
			else return rangerName+"_armor";
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