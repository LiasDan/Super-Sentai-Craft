package SS_Craft.item.turboranger;


import SS_Craft.RiderItems;
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


public class item_fairy_power extends Item implements IHasModel
{
	public int num;

	public item_fairy_power(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_turbo_brace)
			{
				item_turbo_brace belt = (item_turbo_brace) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (item_turbo_brace.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))>0)
				{

					item_turbo_brace.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else
				{
					item_turbo_brace.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}