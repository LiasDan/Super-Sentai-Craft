package SS_Craft.item;


import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_ore extends Item implements IHasModel
{

    public Item_ore(String name)
    {
        super();
        this.setMaxDamage(0);
        maxStackSize = 64;
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

    }
    
    /**public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_shodophone)
			{
				item_shodophone belt = (item_shodophone) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				
				if (belt == RiderItems.red_shodophone)
				{
					if (this ==  RiderItems.common_disk)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
						{
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.common_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.rekka_daizantou));
						}
					}
				}
				if (belt == RiderItems.blue_shodophone)
				{
					if (this ==  RiderItems.common_disk)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
						{
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.common_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.water_arrow));
						}
					}
				}
				if (belt == RiderItems.pink_shodophone)
				{
					if (this ==  RiderItems.common_disk)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
						{
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.common_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.heaven_fan));
						}
					}
				}
				if (belt == RiderItems.green_shodophone)
				{
					if (this ==  RiderItems.common_disk)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
						{
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.common_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.wood_spear));
						}
					}
				}
				if (belt == RiderItems.yellow_shodophone)
				{
					if (this ==  RiderItems.common_disk)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
						{
							playerIn.inventory.offHandInventory.clear();
							playerIn.inventory.clearMatchingItems(RiderItems.common_disk, 0, 1, null);
							playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.land_slicer));
						}
					}
				}
				if (this == RiderItems.inromaru)
				{
					if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.shinkenmaru)
					{
						playerIn.inventory.offHandInventory.clear();
						playerIn.inventory.clearMatchingItems(RiderItems.inromaru, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.super_shinkenmaru));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }**/

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	}
