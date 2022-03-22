package SS_Craft.item.dekaranger;


import SS_Craft.SentaiItems40;
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


public class item_sp_badge extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","swat","battlizer_armor","fire_squad_armor"};

	public item_sp_badge(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_sp_license)
			{
				item_sp_license belt = (item_sp_license) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt==SentaiItems40.break_brace_throttle|belt==SentaiItems40.master_license|belt==SentaiItems40.swan_sp_license
						|belt==SentaiItems40.bright_brace_throttle|belt==SentaiItems40.gold_sp_license
						|belt==SentaiItems40.neo_red_sp_license|belt==SentaiItems40.neo_yellow_sp_license)
				{
					item_sp_license.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				if (num>1)
				{
					if (belt==SentaiItems40.red_sp_license)
					{
						item_sp_license.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_sp_license.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else
				{
					item_sp_license.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					item_sp_license.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}