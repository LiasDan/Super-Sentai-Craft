package com.liasdan.supersentaicraft.items.others;


import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.liasdan.supersentaicraft.items.OtherItems;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class RangerFormChangeItem extends BaseItem {

	private String FORM_NAME;
	private int Slot =1;
	private List<MobEffectInstance> potionEffectList;
	private int BELT;
	private List<Item> NEEDITEM = new ArrayList<Item>();
	protected String RIDER_NAME;
	private String BELT_TEX;
	private String UPDATED_MODEL;
	private String UPDATED_BELT;
	private String FLYING_MODEL;
	private Boolean FLYING_TEXT = false;
	private Item SHIFT_ITEM = Items.APPLE;
	private Item SWITCH_ITEM;
	private List<RangerFormChangeItem> alternative = new ArrayList<RangerFormChangeItem>();
	private RangerFormChangeItem alsoChange2ndSlot;
	public String[] compatibilityList= new String[] {""};


	public RangerFormChangeItem( Properties properties,int belt,String formName,String ridername,String beltTex, MobEffectInstance... effects) {
		super( properties);

		potionEffectList = Lists.newArrayList(effects);
		FORM_NAME = formName;
		BELT_TEX = beltTex;
		BELT = belt;
		RIDER_NAME = ridername;
	}

	public List<MobEffectInstance> getPotionEffectList() {
		return potionEffectList;
	}

	public int getBelt() {
		return BELT;
	}

	public String getFormName(Boolean isFlaying) {
		if (isFlaying&FLYING_TEXT) return FORM_NAME+"_wing";
		else return FORM_NAME;
	}


	public String getBeltTex() {
		return BELT_TEX;
	}

	public String get_Model() {
		if (UPDATED_MODEL!=null) return UPDATED_MODEL;
		return "geo/ranger.geo.json";
	}

	public String getBeltModel() {
		if (UPDATED_BELT!=null) return UPDATED_BELT;
		return "geo/rangerbelt.geo.json";
	}

	public String get_FlyingModel() {
		return FLYING_MODEL;
	}
	public Boolean HasWingsIfFlying() {
		return FLYING_TEXT;
	}
	
	public RangerFormChangeItem alsoChange2ndSlot(Item item) {
		alsoChange2ndSlot=  (RangerFormChangeItem) item;
		return this;
	}

	public RangerFormChangeItem ChangeModel(String model) {
		UPDATED_MODEL=model;
		return this;
	}

	public RangerFormChangeItem ChangeBeltModel(String beltmodel) {
		UPDATED_BELT=beltmodel;
		return this;
	}
	
	public RangerFormChangeItem ChangeSlot(int slot) {
		Slot=slot;
		return this;
	}

	public RangerFormChangeItem ifFlyingModelResource(String model) {
		FLYING_TEXT=true;
		FLYING_MODEL=model;
		return this;
	}

	public RangerFormChangeItem addAlternative( Item item) {
		alternative.add((RangerFormChangeItem) item);
		return this;
	}
	
	public RangerFormChangeItem addNeedItem( Item item) {
		NEEDITEM.add(item);
		return this;
	}

	public RangerFormChangeItem addShiftForm(Item item) {
		SHIFT_ITEM=item;
		return this;
	}
	
	public RangerFormChangeItem addSwitchForm(Item item) {
		SWITCH_ITEM=item;
		return this;
	}
	
	public BaseItem AddCompatibilityList(String[] List) {
		 compatibilityList=List;
		return this;
	}

	public Boolean iscompatible(String rider) {
		
		for (int i = 0; i < compatibilityList.length; i++)
		{
			if (compatibilityList[i]==rider){
				return true;
			}
		}
		
		return false;
	}
	
	public Boolean CanChange(Player player,RangerChangerItem belt) {

		if (this == OtherItems.BLANK_FORM.get()) {
			return true;
		}
		else if(belt.Rider!=RIDER_NAME&!iscompatible(belt.Rider)) {
			return false;
		}
		if (!NEEDITEM.isEmpty()) {
			for (int i = 0; i < NEEDITEM.size(); i++)
			{
				if (player.getInventory().countItem(NEEDITEM.get(i))==0){
					return false;
				}
			}
		}
		return true;
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RangerChangerItem belt) {

			if (SHIFT_ITEM instanceof RangerFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RangerFormChangeItem)SHIFT_ITEM).use(p_41128_, p_41129_, p_41130_);
			}
			else if (CanChange(p_41129_,belt)) {
				if (alsoChange2ndSlot !=null)RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),alsoChange2ndSlot, 2);

				if (SWITCH_ITEM!=null&RangerChangerItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET), Slot)==this) RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),SWITCH_ITEM, Slot);
					else RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),this, Slot);
			
			}else if(!alternative.isEmpty()){

				for (int i = 0; i < alternative.size(); i++)
				{
					RangerFormChangeItem alternativeItem_form_change = alternative.get(i);
					alternativeItem_form_change.use(p_41128_, p_41129_, p_41130_);
				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());

	}
}

/**
	public Item getWing() {
		return WINGS;
	}


	public boolean getNeedItem(Player  playerIn) {
		boolean NEED = true;
		if (NEEDSITEM.isEmpty()){
			NEED=true;
		}
		else {
			for (int i = 0; i < NEEDSITEM.size(); i++)
			{
				if (!playerIn.inventory.hasItemStack(new ItemStack(NEEDSITEM.get(i)))){
						(new ItemStack(NEEDSITEM.get(i)))){
					NEED=false;
				}
			}
		}
		return NEED;
	}


	public RiderFormChangeItem addWing(Item wings) {
		WINGS = wings;
		return this;
	}
	public RiderFormChangeItem ShiftForm(Item ShiftItem) {
		STIFT_ITEM = ShiftItem;
		return this;
	}

	public RiderFormChangeItem addAlternative(RiderFormChangeItem alternativeItem) {
		alternative.add(alternativeItem);
		return this;
	}
	public RiderFormChangeItem addNeedItem(Item needitem) {
		NEEDSITEM.add(needitem);
		return this;
	}



 **/
