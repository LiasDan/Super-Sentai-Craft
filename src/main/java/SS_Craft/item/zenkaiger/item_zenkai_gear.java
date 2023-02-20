package SS_Craft.item.zenkaiger;


import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.don_brothers.item_don_blaster;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
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


public class item_zenkai_gear extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static final String[] ARMOR = new String[] {"blank","base","cutanner","ricky","denzi_punch","super"};
	
	public item_zenkai_gear(int armor,String name)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_geartlinger)
			{
				item_geartlinger belt = (item_geartlinger) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
			
				if (belt != SentaiItems60.zenkaizer_geartlinger && belt != SentaiItems60.twokaizer_geardalinger && belt != SentaiItems60.stacaeser_geartozinger && belt != SentaiItems60.red_geartlinger && belt != SentaiItems60.hakaizer_belt && belt != SentaiItems60.twokai_flint_geardalinger)
				{
					if (this == SentaiItems60.metallic_zenkai_juran_gear || this == SentaiItems60.metallic_zenkai_gaon_gear || this == SentaiItems60.metallic_zenkai_magine_gear || this == SentaiItems60.metallic_zenkai_vroon_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems60.zenkaizer_geartlinger)
				{
					if (this == SentaiItems60.zenkai_zyu_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems60.twokaizer_geardalinger)
				{
					if (this == SentaiItems60.twokai_cutanner_gear || this == SentaiItems60.twokai_ricky_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (this == SentaiItems60.zenkai_zyu_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5);
					}
					else
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
				}
				else if (belt == SentaiItems60.stacaeser_geartozinger || belt == SentaiItems60.hakaizer_belt)
				{
					if (this == SentaiItems60.tojiru_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems60.twokai_flint_geardalinger)
				{
					if (this == SentaiItems60.twokai_cutanner_gear || this == SentaiItems60.twokai_ricky_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.geartlinger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.zenkaizer_gear)
					{
						if (playerIn.inventory.hasItemStack(new ItemStack(SentaiItems60.zenkaizer_black_avatarou_gear)))
						{
							playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.black_geartlinger));
						}
						else
						{
							playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.zenkaizer_geartlinger));
						}
					}
					if (this == SentaiItems60.zenkai_juran_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.juran_geartlinger));
					}
					if (this == SentaiItems60.zenkai_gaon_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.gaon_geartlinger));
					}
					if (this == SentaiItems60.zenkai_magine_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.magine_geartlinger));
					}
					if (this == SentaiItems60.zenkai_vroon_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.vroon_geartlinger));
					}
					if (this == SentaiItems60.zenkai_red_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.red_geartlinger));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.geardalinger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.twokaizer_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.twokaizer_geardalinger));
					}
					else if (this == SentaiItems60.twokai_flint_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.twokai_flint_geardalinger));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.geartozinger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.stacaesar_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.stacaeser_geartozinger));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_don_blaster)
			{
				if (this == SentaiItems60.zenkaizer_gear)
				{
					playerIn.dropItem(SentaiItems60.zenkaiger_avatarou_gear, 1);
				}

				if (!playerIn.capabilities.isCreativeMode)
				{
					if(handIn==EnumHand.MAIN_HAND)
					{
						playerIn.getHeldItemMainhand().shrink(1);			
					}
					else
					{
						playerIn.getHeldItemOffhand().shrink(1);	
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}