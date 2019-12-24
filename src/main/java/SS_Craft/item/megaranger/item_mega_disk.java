package SS_Craft.item.megaranger;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class item_mega_disk extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","mega_tector"};

	public item_mega_disk(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_digitaizer)
			{
				item_digitaizer belt = (item_digitaizer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				item_digitaizer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}