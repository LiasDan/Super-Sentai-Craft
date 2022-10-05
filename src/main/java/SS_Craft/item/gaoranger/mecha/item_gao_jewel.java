package SS_Craft.item.gaoranger.mecha;


import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha;
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


public class item_gao_jewel extends Item implements IHasModel
{
	public int num;
	public String num2;

	public item_gao_jewel(int armor,String name,String part)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_gaoranger_mecha)
			{
				item_gaoranger_mecha belt = (item_gaoranger_mecha) playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem();

				if (belt == SentaiItems40.gao_king_head)
				{
					if (this == SentaiItems40.gao_shark_jewel || this == SentaiItems40.gao_tiger_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == SentaiItems40.gao_eagle_jewel || this == SentaiItems40.gao_bison_jewel)
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (this == SentaiItems40.gao_lion_jewel || this == SentaiItems40.gao_lion_black_jewel || this == SentaiItems40.gao_lion_blue_jewel || this == SentaiItems40.gao_lion_white_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "right")
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left")
					{
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "legs")
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
				}
				else if (belt == SentaiItems40.gao_knight_head)
				{
					if (this == SentaiItems40.gao_shark_jewel || this == SentaiItems40.gao_tiger_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == SentaiItems40.gao_eagle_jewel || this == SentaiItems40.gao_bison_jewel)
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (num2 == "right")
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left")
					{
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "legs")
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
				}
				else if (belt == SentaiItems40.gao_muscle_head)
				{
					if (this == SentaiItems40.gao_bear_jewel || this == SentaiItems40.gao_polar_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == SentaiItems40.gao_eagle_jewel || this == SentaiItems40.gao_bison_jewel)
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (this == SentaiItems40.gao_gorilla_jewel || this == SentaiItems40.gao_ape_jewel)
					{
						item_gaoranger_mecha.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "right")
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left")
					{
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "legs")
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
				}
				else if (belt == SentaiItems40.gao_hunter_head || belt == SentaiItems40.gao_hunter_blue_moon_head)
				{
					if (this == SentaiItems40.gao_hammerhead_jewel || this == SentaiItems40.gao_wolf_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (num2 == "right")
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left")
					{
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
				}
				else if (belt == SentaiItems40.gao_icarus_head)
				{
					if (this == SentaiItems40.gao_giraffe_jewel || this == SentaiItems40.gao_deers_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == SentaiItems40.gao_rhinos_jewel || this == SentaiItems40.gao_madillo_jewel)
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (num2 == "right")
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left")
					{
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "legs")
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
				}
				else if (belt == SentaiItems40.gao_god_head)
				{
					if (this == SentaiItems40.gao_sawshark_jewel || this == SentaiItems40.gao_jaguar_jewel)
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),0);
					}
					else if (this == SentaiItems40.gao_buffalo_jewel)
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD), 0);
					}
					else if (num2 == "right")
					{
						item_gaoranger_mecha.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "left")
					{
						item_gaoranger_mecha.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
					else if (num2 == "legs")
					{
						item_gaoranger_mecha.set_leg(playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD),num);
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}