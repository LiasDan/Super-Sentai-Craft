package SS_Craft.item.zenkaiger;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
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
			
				if (belt != RiderItems.zenkaizer_geartlinger && belt != RiderItems.twokaizer_geardalinger && belt != RiderItems.stacaeser_geartozinger && belt != RiderItems.red_geartlinger)
				{
					if (this == RiderItems.metallic_zenkai_juran_gear || this == RiderItems.metallic_zenkai_gaon_gear || this == RiderItems.metallic_zenkai_magine_gear || this == RiderItems.metallic_zenkai_vroon_gear)
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
				else if (belt == RiderItems.zenkaizer_geartlinger)
				{
					if (this == RiderItems.zenkai_zyu_gear)
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
				else if (belt == RiderItems.twokaizer_geardalinger)
				{
					if (this == RiderItems.twokai_cutanner_gear || this == RiderItems.twokai_ricky_gear)
					{
						item_geartlinger.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_geartlinger.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					}
					else if (this == RiderItems.zenkai_zyu_gear)
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
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.geartlinger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.zenkaizer_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.zenkaizer_geartlinger));
					}
					if (this == RiderItems.zenkai_juran_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.juran_geartlinger));
					}
					if (this == RiderItems.zenkai_gaon_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.gaon_geartlinger));
					}
					if (this == RiderItems.zenkai_magine_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.magine_geartlinger));
					}
					if (this == RiderItems.zenkai_vroon_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.vroon_geartlinger));
					}
					if (this == RiderItems.zenkai_red_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.red_geartlinger));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.geardalinger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.twokaizer_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.twokaizer_geardalinger));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.geartozinger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.stacaesar_gear)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.stacaeser_geartozinger));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}