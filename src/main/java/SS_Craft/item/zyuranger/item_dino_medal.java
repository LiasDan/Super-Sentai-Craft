package SS_Craft.item.zyuranger;

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


public class item_dino_medal extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","zyu_dragon_shield","zyu_dragon_band","zyu_full_dragon_shield"};

	public item_dino_medal(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_dino_buckler)
			{
				item_dino_buckler belt = (item_dino_buckler) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt == RiderItems.dragon_dino_buckler || belt == RiderItems.armed_tyranno_dino_buckler)
				{
					if (this == RiderItems.zyuranger_medal)
					{
						item_dino_buckler.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
					}
					else if (this == RiderItems.dragon_medal)
					{
						item_dino_buckler.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
					}
					else if (this != RiderItems.dragon_medal || this != RiderItems.zyuranger_medal)
					{
						item_dino_buckler.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
					}
				}
				else
				{
					item_dino_buckler.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}