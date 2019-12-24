package SS_Craft.item.ryusoulger;


import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
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


public class item_ryusoul extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static String[] ARMOR= new String[] {"blank","ryusoul_tsuyo_soul","ryusoul_nobi_soul","ryusoul_omo_soul","ryusoul_haya_soul","ryusoul_kata_soul","blank","ryusoul_kusa_soul","ryusoul_mie_soul","ryusoul_mukimuki_soul","blank","ryusoul_mabushi_soul","ryusoul_mist_soul","ryusoul_karu_soul","ryusoul_gyaku_soul","blank","ryusoul_migake_soul","ryusoul_kunkun_soul","ryusoul_pukupuku_soul","ryusoul_kakure_soul","blank","ryusoul_nemu_soul","ryusoul_mawari_soul","ryusoul_kawaki_soul","blank"};
	public static String[] SOUL = new String[] {"blank","ryusoul_meramera","ryusoul_biribiri","ryusoul_kurayami","ryusoul_kagayaki","ryusoul_cosmo","blank","ryusoul_dosshin"};
	
	public item_ryusoul(int armor,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=armor;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	public item_ryusoul(String name,int soul)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num2=soul;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ryusoul_changer)
			{
				item_ryusoul_changer belt = (item_ryusoul_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if  (num >= 1)
				{
					if (belt == RiderItems.gold_mosa_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.mosa_changer)
						{
							item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (belt == RiderItems.gaisorg_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.gaisoul_ken)
						{
							item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.ryusoul_ken)
						{
							item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
				}
				if (num2 >= 1)
				{
					if (belt == RiderItems.gold_mosa_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.mosa_changer)
						{
							item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
					else if (belt == RiderItems.gaisorg_changer)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.gaisoul_ken)
						{
							item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
					else
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.ryusoul_ken)
						{
							item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
				}
				else
				{
					item_ryusoul_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					item_ryusoul_changer.set_soul(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.mosa_changer)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.gold_ryusoul)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.gold_mosa_changer));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.gaisoul_ken)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.gai_soul)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.gaisorg_changer));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}