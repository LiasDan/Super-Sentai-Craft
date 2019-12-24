package SS_Craft.item.kyuranger;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.shinkenger.item_shodophone;
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


public class item_kyutama extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","kyu_ikkakuju_arm"};
	
	public item_kyutama(int form,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=form;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_seiza_blaster)
			{
				item_seiza_blaster belt = (item_seiza_blaster) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.seiza_blaster)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.sasori_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.orange_seiza_blaster));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}