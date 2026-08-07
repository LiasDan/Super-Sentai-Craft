package com.liasdan.supersentaicraft.items.sentai_50.boonboomger;

import com.liasdan.supersentaicraft.items.sentai_50.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
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

public class BoonboomChangerItem extends RangerChangerItem{

	public BoonboomChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		Has_basic_belt_info=false;
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String riderName)
	{
		boolean fly = rider instanceof Player player && player.getAbilities().flying;

		if (equipmentSlot == EquipmentSlot.FEET) {
			String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
			if (!isTransformed(rider)) {
				if (get_Form_Item(itemstack, 1).getBeltTex()=="boonboomger_belt") belt = "boonboom_changer";
				else belt = "blank";
			}
			else {
				if (((RangerChangerItem)itemstack.getItem()).BELT_TEXT==null) {
					belt = get_Form_Item(itemstack,1).getBeltTex();
				}
			}
			return "belts/"+belt;
		}
		else return get_Form_Item(itemstack,1).getRangerName(riderName)+get_Form_Item(itemstack,1).getFormName(fly);
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		Item formItem = this.get_Form_Item(stack, 1);

		if (formItem== BoonboomgerItems.CHAMPION_CHANGER.get()) {
			if (this == BoonboomgerItems.RED_BOONBOOM_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_red.form"));
			if (this == BoonboomgerItems.BLUE_BOONBOOM_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_blue.form"));
			if (this == BoonboomgerItems.PINK_BOONBOOM_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_pink.form"));
		}
		else if (formItem== BoonboomgerItems.CHAMPION_CHANGER_2.get()) {
			if (this == BoonboomgerItems.BLACK_BOONBOOM_BOOSTER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_black.form"));
			if (this == BoonboomgerItems.ORANGE_BOONBOOM_BOOSTER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_orange.form"));
		}
		else {
			tooltipComponents.add(Component.translatable(formItem.toString() + ".form"));
		}
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}
}