package SS_Craft.item.gokaiger;


import SS_Craft.RiderItems;
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


public class item_ranger_key extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static String[] ARMOR= new String[] {"blank","gokai_gold_mode"};
	
	public item_ranger_key(int form,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=form;

	    setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	public item_ranger_key(String name,int arms)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num2=arms;

	    setUnlocalizedName(name);
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_mobirates)
			{
				item_mobirates belt = (item_mobirates) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (this == RiderItems.gold_anchor_key) 
				{
					item_mobirates.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					item_mobirates.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else
				{
					item_mobirates.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					item_mobirates.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}