package SS_Craft.item;


import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.abaranger.mecha.item_abaranger_mecha;
import SS_Craft.item.battle_fever.mecha.item_battle_fever_mecha;
import SS_Craft.item.denziman.mecha.item_denziman_mecha;
import SS_Craft.item.gaoranger.mecha.item_gaoranger_mecha;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha;
import SS_Craft.item.goranger.item_goranger_belt;
import SS_Craft.item.jetman.item_cross_changer;
import SS_Craft.item.kakuranger.item_doron_changer;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.sun_vulcan.mecha.item_sun_vulcan_mecha;
import SS_Craft.item.zenkaiger.item_geartlinger;
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


public class item_super_sentai_logo extends Item implements IHasModel
{
	public item_super_sentai_logo(String name)
	{
		super();
		this.setMaxDamage(0);

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_abaranger_mecha)
			{
				if (playerIn.isSneaking())
				{
					item_abaranger_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 0);
				}
				else
				{
					item_abaranger_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_battle_fever_mecha)
			{
				if (playerIn.isSneaking())
				{
					item_battle_fever_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 0);
				}
				else
				{
					item_battle_fever_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_denziman_mecha)
			{
				if (playerIn.isSneaking())
				{
					item_denziman_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 0);
				}
				else
				{
					item_denziman_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_gaoranger_mecha)
			{
				if (playerIn.isSneaking())
				{
					item_gaoranger_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 0);
				}
				else
				{
					item_gaoranger_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_go_onger_mecha)
			{
				if (playerIn.isSneaking())
				{
					item_go_onger_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 0);
				}
				else
				{
					item_go_onger_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_sun_vulcan_mecha)
			{
				if (playerIn.isSneaking())
				{
					item_sun_vulcan_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 0);
				}
				else
				{
					item_sun_vulcan_mecha.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems20.ninjaman_urn)
			{
				if (playerIn.isSneaking())
				{
					item_doron_changer.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 0);
				}
				else
				{
					item_doron_changer.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 1);
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_geartlinger)
			{
				if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.red_geartlinger && playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() != SentaiItems60.stacaeser_geartozinger)
				{
					if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.zenkaizer_geartlinger)
					{
						if (item_geartlinger.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
						{
							if (playerIn.isSneaking())
							{
								item_geartlinger.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 0);
							}
							else
							{
								item_geartlinger.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 4);
							}
						}
					}
					else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
					{
						if (item_geartlinger.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="super")
						{
							if (playerIn.isSneaking())
							{
								item_geartlinger.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 0);
							}
							else
							{
								item_geartlinger.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 4);
							}
						}
					}
					else
					{
						if (playerIn.isSneaking())
						{
							item_geartlinger.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 0);
						}
						else
						{
							item_geartlinger.set_effect((playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)), 4);
						}
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}