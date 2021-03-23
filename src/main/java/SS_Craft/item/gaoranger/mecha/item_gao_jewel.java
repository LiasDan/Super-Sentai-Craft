package SS_Craft.item.gaoranger.mecha;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha;
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


public class item_gao_jewel extends Item implements IHasModel
{
	public int num;
	public String num2;
	public static String[] RIGHT= new String[] {"blank","gao_shark","gao_giraffe","gao_polar","gao_hammerhead","gao_sawshark","gao_panda"};
	public static String[] LEFT= new String[] {"blank","gao_tiger","gao_deers","gao_bear","gao_wolf","gao_jaguar"};

	public item_gao_jewel(int armor,String name,String part)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_gaoranger_mecha)
			{
				item_gaoranger_mecha belt = (item_gaoranger_mecha) playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem();

				if (belt == RiderItems.gao_king_head)
				{
					if (this == RiderItems.gao_shark_jewel || this == RiderItems.gao_tiger_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == RiderItems.gao_eagle_jewel || this == RiderItems.gao_bison_jewel)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_blue_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 3);
						}
						else if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_black_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 6);
						}
						else if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_white_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 9);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
						}
					}
					else if (this == RiderItems.gao_rhinos_jewel || this == RiderItems.gao_madillo_jewel)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_blue_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 4);
						}
						else if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_black_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 7);
						}
						else if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_white_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 10);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 1);
						}
					}
					else if (this == RiderItems.gao_buffalo_jewel)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_blue_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 5);
						}
						else if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_black_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 8);
						}
						else if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_lion_white_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 11);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 2);
						}
					}
					else
					{
						if (num2 == "right")
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt == RiderItems.gao_knight_head)
				{
					if (this == RiderItems.gao_shark_jewel || this == RiderItems.gao_tiger_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == RiderItems.gao_eagle_jewel || this == RiderItems.gao_bison_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (this == RiderItems.gao_rhinos_jewel || this == RiderItems.gao_madillo_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 1);
					}
					else if (this == RiderItems.gao_buffalo_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 2);
					}
					else
					{
						if (num2 == "right")
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt == RiderItems.gao_muscle_head)
				{
					if (this == RiderItems.gao_bear_jewel || this == RiderItems.gao_polar_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == RiderItems.gao_eagle_jewel || this == RiderItems.gao_bison_jewel)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_ape_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 3);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
						}
					}
					else if (this == RiderItems.gao_rhinos_jewel || this == RiderItems.gao_madillo_jewel)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_ape_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 4);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 1);
						}
					}
					else if (this == RiderItems.gao_buffalo_jewel)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gao_ape_jewel)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 5);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 2);
						}
					}
					else
					{
						if (num2 == "right")
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt == RiderItems.gao_hunter_head || belt == RiderItems.gao_hunter_blue_moon_head)
				{
					if (this == RiderItems.gao_hammerhead_jewel || this == RiderItems.gao_wolf_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == RiderItems.flute_knife)
					{
						if (item_gaoranger_mecha.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD))==1)
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
						}
						else
						{
							item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 1);
						}
					}
					else
					{
						if (num2 == "right")
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt == RiderItems.gao_icarus_head)
				{
					if (this == RiderItems.gao_giraffe_jewel || this == RiderItems.gao_deers_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == RiderItems.gao_rhinos_jewel || this == RiderItems.gao_madillo_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (this == RiderItems.gao_bison_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 1);
					}
					else if (this == RiderItems.gao_buffalo_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 2);
					}
					else
					{
						if (num2 == "right")
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt == RiderItems.gao_god_head)
				{
					if (this == RiderItems.gao_sawshark_jewel || this == RiderItems.gao_jaguar_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == RiderItems.gao_buffalo_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (this == RiderItems.gao_bison_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 1);
					}
					else if (this == RiderItems.gao_rhinos_jewel || this == RiderItems.gao_madillo_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 2);
					}
					else
					{
						if (num2 == "right")
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else
				{
					item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}