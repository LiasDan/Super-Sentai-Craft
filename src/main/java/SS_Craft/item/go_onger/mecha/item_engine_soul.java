package SS_Craft.item.go_onger.mecha;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
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


public class item_engine_soul extends Item implements IHasModel
{
	public int num;
	public String num2;
	public static String[] RIGHT= new String[] {"blank","birca","gunpherd","toripter","t_line"};
	public static String[] LEFT= new String[] {"blank","birca","gunpherd","jetras","k_line"};

	public item_engine_soul(int armor,String name,String part)
	{
		super();
		this.setMaxDamage(0);

		num=armor;
		num2=part;

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
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_go_onger_mecha)
			{
				item_go_onger_mecha belt = (item_go_onger_mecha) playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem();

				if (belt.Rider == "seikuu_oh")
				{
					if (this == RiderItems.birca_soul)
					{
						item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),1);
					}
					else if (this == RiderItems.gunpherd_soul)
					{
						item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),2);
					}
					else if (this == RiderItems.toripter_soul || this == RiderItems.jetras_soul)
					{
						item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else
					{
						if (num2 == "right")
						{
							item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt.Rider == "gunbir_oh")
				{
					if (this == RiderItems.birca_soul || this == RiderItems.gunpherd_soul)
					{
						item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else
					{
						if (num2 == "right")
						{
							item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else if (num2 == "left") 
						{
							item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
						}
						else
						{
							item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
							item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						}
					}
				}
				else if (belt.Rider == "engine_oh")
				{
					if (num2 == "right")
					{
						item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left") 
					{
						item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else
					{
						item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
				}
				else
				{
					item_go_onger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					item_go_onger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}