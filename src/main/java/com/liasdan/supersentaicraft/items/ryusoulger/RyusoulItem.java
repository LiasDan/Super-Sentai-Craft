package com.liasdan.supersentaicraft.items.ryusoulger;

import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RyusoulItem extends RangerFormChangeItem {

	public RyusoulItem( Properties properties,int belt,String formName,String ridername,String beltTex, MobEffectInstance... effects) {
		super( properties, belt, formName, ridername, beltTex, effects);
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RangerChangerItem belt) {

			if (SHIFT_ITEM instanceof RangerFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RangerFormChangeItem)SHIFT_ITEM).use(p_41128_, p_41129_, p_41130_);
			}
			else if (CanChange(p_41129_,belt,BELT)) {
				if (this == RyusoulgerItems.MAX_RYUSOUL.get())
				{
					if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==RyusoulgerItems.MAX_RYUSOUL_CHANGER.get())
					{
						if (BELT.getItem() == RyusoulgerItems.RED_RYUSOUL_CHANGER.get()) RangerChangerItem.set_Form_Item(BELT,this, Slot);
					}
				}
				else if (this == RyusoulgerItems.NOBLESSE.get() | this == RyusoulgerItems.RED_RYUSOUL.get() | this == RyusoulgerItems.BLUE_RYUSOUL.get() | this == RyusoulgerItems.PINK_RYUSOUL.get()
						| this == RyusoulgerItems.GREEN_RYUSOUL.get() | this == RyusoulgerItems.BLACK_RYUSOUL.get())
				{
					RangerChangerItem.set_Form_Item(BELT,this, Slot);
				}
				else if (BELT.getItem() == RyusoulgerItems.RED_RYUSOUL_CHANGER.get() | 
						BELT.getItem() == RyusoulgerItems.BLUE_RYUSOUL_CHANGER.get() | 
						BELT.getItem() == RyusoulgerItems.PINK_RYUSOUL_CHANGER.get() |	
						BELT.getItem() == RyusoulgerItems.GREEN_RYUSOUL_CHANGER.get() | 
						BELT.getItem() == RyusoulgerItems.BLACK_RYUSOUL_CHANGER.get()) {
					
					if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==RyusoulgerItems.RYUSOUL_KEN.get())
					{
						RangerChangerItem.set_Form_Item(BELT,this, Slot);
					}
				}
				else RangerChangerItem.set_Form_Item(BELT,this, Slot);
			
			}else if(!alternative.isEmpty()){

				for (int i = 0; i < alternative.size(); i++)
				{
					RangerFormChangeItem alternativeItem_form_change = alternative.get(i);
					alternativeItem_form_change.use(p_41128_, p_41129_, p_41130_);
				}
			}
		}
		if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==RyusoulgerItems.MOSA_CHANGER.get())
		{
			if (BELT.isEmpty())
			{
				if (this == RyusoulgerItems.GOLD_RYUSOUL.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(RyusoulgerItems.GOLD_MOSA_CHANGER.get()));
				}
			}
		}
		if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==RyusoulgerItems.GAISOUL_KEN.get())
		{
			if (BELT.isEmpty())
			{
				if (this == RyusoulgerItems.GAI_SOUL.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(RyusoulgerItems.GAISOULG_CHANGER.get()));
				}
			}
		}
		if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==RyusoulgerItems.BROWN_RYUSOUL_KEN.get())
		{
			if (BELT.isEmpty())
			{
				if (this == RyusoulgerItems.BROWN_RYUSOUL.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(RyusoulgerItems.BROWN_CHANGER.get()));
				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}