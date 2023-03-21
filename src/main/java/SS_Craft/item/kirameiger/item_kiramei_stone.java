package SS_Craft.item.kirameiger;


import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.kyuranger.item_seiza_blaster;
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


public class item_kiramei_stone extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static final String[] ARMOR = new String[] {"blank","go","go_center"};
	
	public item_kiramei_stone(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_kiramei_changer)
			{
				item_kiramei_changer belt = (item_kiramei_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
			
				if (belt == SentaiItems60.shiny_kiramei_changer & this == SentaiItems60.shiny_kiramei_stone)
				{
					if (item_kiramei_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 0)
					{
						item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else
					{
						item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (belt == SentaiItems60.yodon_changer & this == SentaiItems60.dark_kiramei_stone)
				{
					if (item_kiramei_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 0)
					{
						item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else
					{
						item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else if (num == 0)
				{
					if (belt != SentaiItems60.red_kiramei_changer || belt != SentaiItems60.shiny_kiramei_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.kiraful_go_arrow)
						{
							if (item_kiramei_changer.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "go")
							{
								item_kiramei_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
							}
							else
							{
								item_kiramei_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							}
						}
						else
						{
							item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_kiramei_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						}
					}
					else
					{
						item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_kiramei_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
				}
				else
				{
					item_kiramei_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					item_kiramei_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}