package SS_Craft.item.kakuranger;


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


public class item_kakure_medal extends Item implements IHasModel
{
	public int num;

	public item_kakure_medal(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems20.ninjaman_urn)
			{
				if (item_doron_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))>0)
				{

					item_doron_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else
				{
					item_doron_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}