package SS_Craft.item.kyuranger;


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


public class item_kyutama extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static String[] ARMOR= new String[] {"blank","kyu_ikkakuju_arm","kyu_pegasus","kyu_taiyou_mode","kyu_tsuki_mode"};
	
	public item_kyutama(int form,String name)
	{
		super();
		this.setMaxDamage(0);

		num=form;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	public item_kyutama(String name, int arms) 
	{
		super();
		this.setMaxDamage(0);

		num2=arms;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_seiza_blaster)
			{
				item_seiza_blaster belt = (item_seiza_blaster) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				
				if (num > 0)
				{
					if (this == RiderItems.saiko_kyutama)
					{
						if (belt == RiderItems.red_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == RiderItems.dark_kyutama)
					{
						if (belt == RiderItems.silver_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
					else if (this == RiderItems.yagyuu_jubee_mask)
					{
						if (belt == RiderItems.black_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
					else if (this == RiderItems.ryu_skill_kyutama)
					{
						if (belt == RiderItems.commander_ryutsueder)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
					else
					{
						if (belt != RiderItems.gold_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
				}
				if (num2 > 0)
				{
					if (belt != RiderItems.houou_blade_shield | belt != RiderItems.commander_ryutsueder | belt != RiderItems.black_seiza_blaster)
					{
						item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
					}
				}
				else
				{
					item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
					item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.seiza_blaster)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.shishi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.red_seiza_blaster));
					}
					if (this == RiderItems.sasori_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.orange_seiza_blaster));
					}
					if (this == RiderItems.ookami_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.blue_seiza_blaster));
					}
					if (this == RiderItems.tenbin_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.gold_seiza_blaster));
					}
					if (this == RiderItems.oushi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.black_seiza_blaster));
					}
					if (this == RiderItems.hebitsukai_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.silver_seiza_blaster));
					}
					if (this == RiderItems.chameleon_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.green_seiza_blaster));
					}
					if (this == RiderItems.washi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.pink_seiza_blaster));
					}
					if (this == RiderItems.kajiki_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.yellow_seiza_blaster));
					}
					if (this == RiderItems.koguma_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.sky_blue_seiza_blaster));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.ryutsueder)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.ryu_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.commander_ryutsueder));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.houou_shield)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.houou_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.houou_blade_shield));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== RiderItems.dark_seiza_blaster)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == RiderItems.dark_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(RiderItems.metal_dark_seiza_blaster));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}