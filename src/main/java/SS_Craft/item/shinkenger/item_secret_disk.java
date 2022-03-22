package SS_Craft.item.shinkenger;


import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.go_onger.item_go_phone;
import SS_Craft.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class item_secret_disk extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","shinken_super_mode","shinken_hyper_mode","shinken_gedou_mode"};

	public item_secret_disk(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_shodophone)
			{
				item_shodophone belt = (item_shodophone) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				
				if (num==1)
				{
					if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.inromaru)
					{
						item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (num==2)
				{
					if (belt==SentaiItems40.sushi_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.sakanamaru)
						{
							item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}	
					}
					else
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.shinkenmaru)
						{
							item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
				}
				else if (num==3)
				{
					if (belt==SentaiItems40.red_shodophone)
					{
						item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else
				{
					item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==SentaiItems40.red_go_phone)
			{
				if (num==2)
				{
					if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.mantan_sword)
					{
						item_go_phone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (item_go_phone.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="shinken_hyper_mode")
				{
					item_go_phone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}