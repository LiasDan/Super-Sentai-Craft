package SS_Craft.item.lupatranger;


import SS_Craft.SentaiItems60;
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

				if (this == SentaiItems60.gold_x_train)
				{
					if (belt != SentaiItems60.lupin_x_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9);
					}
					else if (belt == SentaiItems60.lupin_x_changer)
					{
						item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == SentaiItems60.silver_x_train)
				{	
					if (belt == SentaiItems60.lupin_x_changer)
					{
						item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == SentaiItems60.jackpot_striker)
				{
					if (belt == SentaiItems60.red_vs_changer || belt == SentaiItems60.blue_vs_changer || belt == SentaiItems60.yellow_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == SentaiItems60.good_striker)
				{
					if (belt == SentaiItems60.ichigou_vs_changer || belt == SentaiItems60.nigou_vs_changer || belt == SentaiItems60.sangou_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (this == SentaiItems60.victory_striker)
				{
					if (belt == SentaiItems60.red_vs_changer || belt == SentaiItems60.blue_vs_changer || belt == SentaiItems60.yellow_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (belt == SentaiItems60.lupin_x_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.vs_changer)
						{
							item_vs_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
				}
				else if (this == SentaiItems60.siren_striker)
				{
					if (belt == SentaiItems60.ichigou_vs_changer || belt == SentaiItems60.nigou_vs_changer || belt == SentaiItems60.sangou_vs_changer)
					{
						item_vs_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (belt == SentaiItems60.lupin_x_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.vs_changer)
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

				if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.vs_changer)
				{
					if (belt != SentaiItems60.gaisorg_changer | belt != SentaiItems60.brown_changer)
					{
						if (this == SentaiItems60.gold_x_train)
						{
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9);
						}
						else if (this == SentaiItems60.victory_striker)
						{
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),10);
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else if (this == SentaiItems60.siren_striker)
						{
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),11);
							item_ryusoul_changer.set_vs(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else if (this == SentaiItems60.jackpot_striker | this == SentaiItems60.good_striker)
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
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.vs_changer)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.red_dial_fighter)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.red_vs_changer));
					}
					if (this == SentaiItems60.blue_dial_fighter)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.blue_vs_changer));
					}
					if (this == SentaiItems60.yellow_dial_fighter)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.yellow_vs_changer));
					}
					if (this == SentaiItems60.ichigou_trigger_machine)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.ichigou_vs_changer));
					}
					if (this == SentaiItems60.nigou_trigger_machine)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.nigou_vs_changer));
					}
					if (this == SentaiItems60.sangou_trigger_machine)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.sangou_vs_changer));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}