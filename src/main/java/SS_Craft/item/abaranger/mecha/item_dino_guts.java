package SS_Craft.item.abaranger.mecha;


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


public class item_dino_guts extends Item implements IHasModel
{
	public int num;
	public String num2;
	public static String[] RIGHT= new String[] {"blank","abaren_nagurus","abaren_veilus","abaren_galer"};
	public static String[] LEFT= new String[] {"blank","abaren_nokodon","abaren_rokkiru","abaren_nokodon_fire"};

	public item_dino_guts(int armor,String name,String part)
	{
		super();
		this.setMaxDamage(0);

		num=armor;
		num2=part;

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
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_abaranger_mecha)
			{
				item_abaranger_mecha belt = (item_abaranger_mecha) playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem();

				if (belt == RiderItems.killer_oh_head)
				{
					if (this == RiderItems.top_dino_guts)
					{
						item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else
					{
						if (num2 == "right")
						{
							item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left")
						{
							item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt == RiderItems.abaren_oh_head)
				{
					if (this == RiderItems.top_dino_guts)
					{
						item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else
					{
						if (num2 == "right")
						{
							item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left")
						{
							if (item_abaranger_mecha.get_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD))=="abaren_galer")
							{
								item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
								item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
							}
							else
							{
								item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
							}
						}
						else
						{
							item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else
				{
					item_abaranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					item_abaranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}