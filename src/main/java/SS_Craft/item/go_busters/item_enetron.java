package SS_Craft.item.go_busters;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.lupatranger.item_vs_changer;
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


public class item_enetron extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","_powered_custom", "_animal_perfect"};

	public item_enetron(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_morphin_brace)
			{
				item_morphin_brace belt = (item_morphin_brace) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (num==1)
				{
					if (belt == RiderItems.red_morphin_brace || belt == RiderItems.blue_morphin_brace || belt == RiderItems.yellow_morphin_brace)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (belt == RiderItems.cheetah_morphin_brace || belt == RiderItems.gorilla_morphin_brace || belt == RiderItems.rabbit_morphin_brace)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
					}
				}
				else
				{
					item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}