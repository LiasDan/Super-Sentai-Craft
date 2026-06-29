package com.liasdan.supersentaicraft.items.sentai_30.gaoranger;

import com.liasdan.supersentaicraft.items.sentai_30.GaorangerItems;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class GaoHunterItem extends MechaGattaiItem {

	public GaoHunterItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> torso, DeferredItem<Item> legs, DeferredItem<Item> boot, Properties properties) {
		super(material, rider, baseFormItem, torso, legs, boot, properties);
		Unlimited_Textures=3;
		Has_basic_belt_info=false;
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		Item formItem = this.get_Form_Item(stack, 1);
		Item formItem2 = this.get_Form_Item(stack, 3);
		Item formItem3 = this.get_Form_Item(stack, 4);

		String right_arm = "";
		String left_arm = "";

		if (formItem2 == GaorangerItems.GAO_GIRAFFE_JEWEL.get())
			right_arm = "supersentaicraft:gao_spear.form";
		if ((formItem2 == GaorangerItems.GAO_POLAR_JEWEL.get()|formItem2 == GaorangerItems.GAO_PANDA_JEWEL.get())&formItem3 == GaorangerItems.GAO_BEAR_JEWEL.get())
			right_arm = "supersentaicraft:gao_double_knuckle.form";
		else if (formItem2 == GaorangerItems.GAO_POLAR_JEWEL.get()|formItem2 == GaorangerItems.GAO_PANDA_JEWEL.get())
			right_arm = "supersentaicraft:gao_knuckle_r.form";
		else if (formItem3 == GaorangerItems.GAO_BEAR_JEWEL.get())
			left_arm = "supersentaicraft:gao_knuckle_l.form";
		if (formItem3 == GaorangerItems.GAO_DEERS_JEWEL.get())
			left_arm = "supersentaicraft:gao_cross_horn.form";

		tooltipComponents.add(Component.literal(Component.translatable(formItem.toString() + ".form").getString()
				+ Component.translatable(right_arm).getString() + Component.translatable(left_arm).getString()));
		tooltipComponents.add(Component.literal(Component.translatable(formItem2.toString() + ".form").getString()));
		tooltipComponents.add(Component.literal(Component.translatable(formItem3.toString() + ".form").getString()));

		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}

	@Override
	public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num)
	{
		boolean fly = rider instanceof Player player && player.getAbilities().flying;

		if(num==2) return get_Form_Item(itemstack,3).getFormName(fly);
		else if(num==3) return get_Form_Item(itemstack,4).getFormName(fly);
		else return riderName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
		boolean fly = !rider.onGround();

		String belt = ((MechaGattaiItem)itemstack.getItem()).BELT_TEXT;

		if (equipmentSlot == EquipmentSlot.HEAD) {
			if (rider.getMainHandItem().getItem()== GaorangerItems.LIGATOR_BLADE.get() ||
					rider.getMainHandItem().getItem()==GaorangerItems.LIGATOR_BLADE_BLUE_MOON.get()) {
				belt = "blank";
			}
			else if (!this.isTransformed(rider)) {
				belt = "blank";
			}
			else if (rangerName == "gao_hunter") {
				belt = "ligator_blade";
			}
			else if (rangerName == "gao_hunter_blue_moon") {
				belt = "ligator_blade_blue_moon";
			}
			else belt = "blank";
			return belt;
		}

		if (equipmentSlot == EquipmentSlot.FEET) return get_Form_Item(itemstack,3).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.CHEST) return get_Form_Item(itemstack,4).getFormName(fly);
		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
			case FEET,LEGS,CHEST ->{
				return true;
			}
			default -> {}
		}
		return false;
	}
}