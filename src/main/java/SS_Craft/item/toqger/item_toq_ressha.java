package SS_Craft.item.toqger;


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


public class item_toq_ressha extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static String[] ARMOR= new String[] {"blank","toq_hyper"};
	
	public item_toq_ressha(int form,int armor,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=form;
		num2=armor;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_toq_changer)
			{
				item_toq_changer belt = (item_toq_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (num == 1)
				{
					if (belt == RiderItems.ichigou_toq_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 2)
				{
					if (belt == RiderItems.nigou_toq_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 3)
				{
					if (belt == RiderItems.sangou_toq_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 4)
				{
					if (belt == RiderItems.yongou_toq_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 5)
				{
					if (belt == RiderItems.gogou_toq_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 6)
				{
					if (belt == RiderItems.rokugou_appli_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 7)
				{
					if (belt == RiderItems.nanagou_appli_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (num == 8)
				{	
					if (belt!=RiderItems.rokugou_appli_changer||belt!=RiderItems.nanagou_appli_changer)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else if (belt == RiderItems.ichigou_toq_changer)
				{
					if (playerIn.isSneaking())
					{
						if (num2 == 1)
						{
							if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.red_ressha))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.blue_ressha))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.yellow_ressha))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.green_ressha))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.pink_ressha))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.build_ressha)))
							{
								item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 11);
								item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
							}
							else
							{
								item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
								item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
							}
						}
					}
					else if (num == 10 || this == RiderItems.lion_ressha)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}

				}
				else if (belt == RiderItems.nigou_toq_changer)
				{
					if (this==RiderItems.eagle_ressha)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
				else if (belt == RiderItems.sangou_toq_changer)
				{
					if (this==RiderItems.wildcat_ressha)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
				else if (belt == RiderItems.yongou_toq_changer)
				{
					if (this==RiderItems.alligator_ressha)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
				else if (belt == RiderItems.gogou_toq_changer)
				{
					if (this==RiderItems.panda_ressha)
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
					else
					{
						item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
				else 
				{
					item_toq_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					item_toq_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}