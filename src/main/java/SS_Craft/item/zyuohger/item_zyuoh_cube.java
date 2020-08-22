package SS_Craft.item.zyuohger;


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


public class item_zyuoh_cube extends Item implements IHasModel
{
	public int num;
	
	public item_zyuoh_cube(int form,String name)
	{
		super();
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zyuoh_changer)
			{
				item_zyuoh_changer belt = (item_zyuoh_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
	
				if (belt == RiderItems.eagle_zyuoh_changer)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==RiderItems.eagle_cube)
						{
							if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.whale_change_gun)) && playerIn.inventory.hasItemStack(new ItemStack(RiderItems.gorilla_cube)))
							{
								item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
							}
						}
					}
					else if (this == RiderItems.gorilla_cube)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (this == RiderItems.condor_cube)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);
					}
					else
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (belt == RiderItems.zyuoh_the_light)
				{
					if (this == RiderItems.crocodile_cube || this == RiderItems.wolf_cube)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (belt == RiderItems.zyuoh_changer_final)
				{
					if (this == RiderItems.condor_cube)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
			}
		}
		
	    playerIn.setActiveHand(handIn);
	    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}