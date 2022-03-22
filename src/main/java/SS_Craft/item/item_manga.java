package SS_Craft.item;


import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.goranger.item_goranger_belt;
import SS_Craft.item.jetman.item_cross_changer;
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


public class item_manga extends Item implements IHasModel
{
	public int num;

	public item_manga(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_goranger_belt)
			{
				item_goranger_belt belt = (item_goranger_belt) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (item_goranger_belt.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))>0)
				{

					item_goranger_belt.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else
				{
					item_goranger_belt.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_cross_changer)
			{
				item_cross_changer belt = (item_cross_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt == SentaiItems20.green_cross_changer || belt == SentaiItems20.black_cross_changer)
				{
					item_cross_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else if (item_cross_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))>0)
				{

					item_cross_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else
				{
					item_cross_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}