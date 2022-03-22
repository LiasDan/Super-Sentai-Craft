package SS_Craft.item.ninninger;


import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.lupatranger.item_vs_changer;
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


public class item_nin_shuriken extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","_chouzetsu"};
	
	public item_nin_shuriken(int form,String name)
	{
		super();
		this.setMaxDamage(0);

		num=form;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ninja_ichibantou)
			{
				item_ninja_ichibantou belt = (item_ninja_ichibantou) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				item_ninja_ichibantou.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems20.ninja_ichibantou)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems20.aka_ninger_shuriken)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems20.aka_ninja_ichibantou));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}