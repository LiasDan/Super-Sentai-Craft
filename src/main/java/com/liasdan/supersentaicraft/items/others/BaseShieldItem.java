package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.items.GorangerItems;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;

public class BaseShieldItem extends ShieldItem {

	private Item RepairItem = GorangerItems.GORANGER_LOGO.get();
	
	public BaseShieldItem(Properties prop) {
		super(prop);
		ModClientEvents.SHIELD_ITEM.add(this);

	}

	public BaseShieldItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}

	public BaseShieldItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	   @Override
	   public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
	      return net.minecraftforge.common.ToolActions.DEFAULT_SHIELD_ACTIONS.contains(toolAction);
	   }
}