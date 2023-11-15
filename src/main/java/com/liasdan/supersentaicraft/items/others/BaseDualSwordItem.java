package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.items.GorangerItems;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
public class BaseDualSwordItem extends SwordItem {

	private Item RepairItem = GorangerItems.GORANGER_LOGO.get();
	
	private Boolean Triple = false;
	
	public BaseDualSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
		
		ModClientEvents.MULTI_WEAPON_ITEM.add(this);
	}

	public BaseDualSwordItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}

	public BaseDualSwordItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		if (p_41129_.isShiftKeyDown()) {
			if (Triple == true) {
				if (get_mode(itemstack)==1) {
					set_mode(itemstack,2);
				}
				else if (get_mode(itemstack)==2) {
					set_mode(itemstack,0);
				}
				else {
					set_mode(itemstack,1);
				}
			}
			else {
				if (get_mode(itemstack)==1) {
					set_mode(itemstack,0);
				}
				else {
					set_mode(itemstack,1);
				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
	
	public static void set_mode(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTag())
		{
			itemstack.setTag(new CompoundTag());
		}
		itemstack.getTag().putInt("mode", flag);
	}
	
	public static int get_mode(ItemStack itemstack) {
		return itemstack.hasTag() ? itemstack.getTag().getInt("mode"): 0;
	}
	
	public BaseDualSwordItem IsTripleWeapon() {
		Triple = true;
		return this;
	}
}