package SS_Craft.item.shinkenger;


import SS_Craft.RiderItems;
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
		this.setHasSubtypes(true);
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
				
				if (num==0)
				{
					if (belt==RiderItems.sushi_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.kyoryumaru_sakanamaru)
						{
							item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);	
							
							playerIn.inventory.clearMatchingItems(RiderItems.kyoryumaru_sakanamaru, 0, 1, null);
							
							if (!worldIn.isRemote)
							{
								EntityItem item = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.hyper_disk, 1));
								worldIn.spawnEntity(item);
								EntityItem item1 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.sakanamaru, 1));
								worldIn.spawnEntity(item1);
							}
						}
						else
						{
							item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);	
							
							playerIn.inventory.clearMatchingItems(RiderItems.kyoryumaru, 0, 1, null);
							
							if (!worldIn.isRemote)
							{
								EntityItem item = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.hyper_disk, 1));
								worldIn.spawnEntity(item);
								EntityItem item1 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(RiderItems.shinkenmaru, 1));
								worldIn.spawnEntity(item1);
							}
						}
					}
				}
				if (num==1)
				{
					if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.inromaru)
					{
						item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (num==2)
				{
					if (belt==RiderItems.sushi_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.sakanamaru)
						{
							item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);	
							
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.hyper_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.kyoryumaru_sakanamaru));
						}	
					}
					else
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
						{
							item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.hyper_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.kyoryumaru));
						}
					}
				}
				else if (num==3)
				{
					if (belt==RiderItems.red_shodophone)
					{
						item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else
				{
					item_shodophone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.red_go_phone)
			{
				if (num==2)
				{
					item_go_phone.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
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