package SS_Craft.item.sentai_armor_base;


import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;


public class item_mecha_changer extends Item implements IHasModel
{

	private String FORM_NAME;
	private List<PotionEffect> potionEffectList;
	private Item BELT;
	private List<Item> NEEDSITEM = new ArrayList<Item>();
	protected  Class<? extends item_mecha> BELTCLASS;
	protected String RIDER_NAME;
	private Item WINGS = SentaiItems20.blanknoitem;
	private Item STIFT_ITEM = SentaiItems20.blanknoitem;
	private String REND2;
	private List<item_mecha_changer> alternative = new ArrayList<item_mecha_changer>();

	public item_mecha_changer(String name,Class<? extends item_mecha> beltClass,Item belt,String formName,String ridername,PotionEffect... effects)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		potionEffectList = Lists.newArrayList(effects);
		FORM_NAME = formName;
		BELT = belt;
		BELTCLASS = beltClass;
		RIDER_NAME = ridername;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	public List<PotionEffect> getPotionEffectList() {
		return potionEffectList;
	}

	public Item getBelt() {
		return BELT;
	}

	public Item getWing() {
		return WINGS;
	}
	public boolean getNeedItem(EntityPlayer playerIn) {
		boolean NEED = true;
		if (NEEDSITEM.isEmpty()){
			NEED=true;
		}
		else {
			for (int i = 0; i < NEEDSITEM.size(); i++)
			{
				if (!playerIn.inventory.hasItemStack(new ItemStack(NEEDSITEM.get(i)))){
					NEED=false;
				}
			}
		}
		return NEED;
	}
	public item_mecha_changer addWing(Item wings) {
		WINGS = wings;
		return this;
	}
	public item_mecha_changer ShiftForm(Item ShiftItem) {
		STIFT_ITEM = ShiftItem;
		return this;
	}
	public item_mecha_changer addAlternative(item_mecha_changer alternativeItem) {
		alternative.add(alternativeItem);
		return this;
	}
	public item_mecha_changer addNeedItem(Item needitem) {
		NEEDSITEM.add(needitem);
		return this;
	}
	public item_mecha_changer Rend2ndLyer(String lyer) {
		REND2 = lyer;
		return this;
	}
	public String get2ndLyer() {

		return REND2!= null? REND2:"blank";
	}

	public String getFormName() {
		return FORM_NAME;
	}


	public  item_mecha_changer keep_item()
	{
		this.setContainerItem(this);
		getContainerItem();
		return this;
	}





	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (!playerIn.inventory.armorInventory.get(4).isEmpty()) {
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem().getClass()==BELTCLASS) {

				if (STIFT_ITEM != SentaiItems20.blanknoitem&playerIn.isSneaking()) {
					STIFT_ITEM.onItemRightClick(worldIn, playerIn, handIn);
				} else if(((item_mecha) playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).Rider.equals(RIDER_NAME)){
					if(getNeedItem(playerIn))
						item_mecha.set_Form_Item(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),this, 4);

				} else if(!alternative.isEmpty()){

					for (int i = 0; i < alternative.size(); i++)
					{
						item_mecha_changer alternativeItem_form_change = alternative.get(i);
						alternativeItem_form_change.onItemRightClick(worldIn, playerIn, handIn);
					}
				}
			}

		}
		playerIn.setActiveHand(handIn);

		return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}