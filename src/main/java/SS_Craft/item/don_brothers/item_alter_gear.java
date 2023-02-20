package SS_Craft.item.don_brothers;


import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class item_alter_gear extends Item implements IHasModel
{
	public int num;
	
	public item_alter_gear(int armor,String name)
	{
		super();
		this.setMaxDamage(0);

		num=armor;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
    @Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_don_blaster)
			{
				item_don_blaster belt = (item_don_blaster) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
			
				if (belt == SentaiItems60.momotarou_don_blaster)
				{
					if (this == SentaiItems60.don_momotarou_avatarou_gear_alter)
					{
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_don_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_don_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else if (item_don_blaster.get_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0)
					{
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
				else if (belt == SentaiItems60.toradora_ryuko_no_geki)
				{
					if (this == SentaiItems60.don_doragoku_avatarou_gear_alter)
					{
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_don_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else if (item_don_blaster.get_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0)
					{
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
				else if (belt == SentaiItems60.murasame_ninjark_sword)
				{
					if (this == SentaiItems60.don_murasame_avatarou_gear_alter)
					{
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_don_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else if (item_don_blaster.get_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0)
					{
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}