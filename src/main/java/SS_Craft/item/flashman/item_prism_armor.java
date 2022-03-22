package SS_Craft.item.flashman;

import SS_Craft.SentaiItems20;
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


public class item_prism_armor extends Item implements IHasModel
{
	public int num;

	public item_prism_armor(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_prism_flash)
			{
				item_prism_flash belt = (item_prism_flash) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (item_prism_flash.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 1)
				{
					item_prism_flash.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
				}
				else
				{
					if (this == SentaiItems20.prism_kaizer)
					{
						if (belt == SentaiItems20.green_prism_flash)
						{
							item_prism_flash.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
					if (this == SentaiItems20.prism_boots)
					{
						if (belt == SentaiItems20.pink_prism_flash)
						{
							item_prism_flash.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}