package SS_Craft.item.lupatranger;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
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


public class item_vs_vehicle extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","lupin_tricolor","patran_ugou","lupin_scissor","pat_crane","lupin_magic","pat_splash","victory","pat_siren","pat_gold"};

	public item_vs_vehicle(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vs_changer)
			{
				item_vs_changer belt = (item_vs_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (this == RiderItems.gold_x_train)
				{
					if (belt != RiderItems.lupin_x_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9);
					}
					else if (belt == RiderItems.lupin_x_changer)
					{
						item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == RiderItems.silver_x_train)
				{	
					if (belt == RiderItems.lupin_x_changer)
					{
						item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == RiderItems.jackpot_striker)
				{
					if (belt == RiderItems.red_vs_changer || belt == RiderItems.blue_vs_changer || belt == RiderItems.yellow_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == RiderItems.good_striker)
				{
					if (belt == RiderItems.ichigou_vs_changer || belt == RiderItems.nigou_vs_changer || belt == RiderItems.sangou_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == RiderItems.victory_striker)
				{
					if (belt == RiderItems.red_vs_changer || belt == RiderItems.blue_vs_changer || belt == RiderItems.yellow_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (belt == RiderItems.lupin_x_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.vs_changer)
						{
							item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
				}
				else if (this == RiderItems.siren_striker)
				{
					if (belt == RiderItems.ichigou_vs_changer || belt == RiderItems.nigou_vs_changer || belt == RiderItems.sangou_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (belt == RiderItems.lupin_x_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.vs_changer)
						{
							item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
				}
				else 
				{
					item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ryusoul_changer)
			{
				item_ryusoul_changer belt = (item_ryusoul_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.vs_changer)
				{
					if (belt != RiderItems.gaisorg_changer | belt != RiderItems.brown_changer)
					{
						if (this == RiderItems.gold_x_train)
						{
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9);
						}
						else if (this == RiderItems.victory_striker)
						{
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),10);
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else if (this == RiderItems.siren_striker)
						{
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),11);
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else if (this == RiderItems.jackpot_striker | this == RiderItems.good_striker)
						{
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.vs_changer)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.red_dial_fighter)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.red_vs_changer));
					}
					if (this == RiderItems.blue_dial_fighter)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.blue_vs_changer));
					}
					if (this == RiderItems.yellow_dial_fighter)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.yellow_vs_changer));
					}
					if (this == RiderItems.ichigou_trigger_machine)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.ichigou_vs_changer));
					}
					if (this == RiderItems.nigou_trigger_machine)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.nigou_vs_changer));
					}
					if (this == RiderItems.sangou_trigger_machine)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.sangou_vs_changer));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}