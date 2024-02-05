package com.liasdan.supersentaicraft.items.ryusoulger;

import java.util.List;

import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
public class RyusoulCaliburItem extends BaseSwordItem {
	
	public RyusoulCaliburItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RangerChangerItem belt) {
			
			if (belt!=RyusoulgerItems.GAISOULG_CHANGER.get() | belt!=RyusoulgerItems.BROWN_CHANGER.get() | belt!=RyusoulgerItems.MORIA_RYUSOUL_CHANGER.get())
			{
				if (this==RyusoulgerItems.RYUSOUL_CALIBUR.get())
				{
					if (p_41129_.isShiftKeyDown())
					{
						if (RangerChangerItem.get_Form_Item(BELT, 2).getFormName(false)=="ryusoul_noblesse") ((RangerFormChangeItem)belt.Base_Form_Item).use(p_41128_, p_41129_, p_41130_);
						else ((RangerFormChangeItem)RyusoulgerItems.NOBLESSE.get()).use(p_41128_, p_41129_, p_41130_);
						
					}
				}
				
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}