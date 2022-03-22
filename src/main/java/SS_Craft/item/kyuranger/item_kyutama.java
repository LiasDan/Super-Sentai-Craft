package SS_Craft.item.kyuranger;


import SS_Craft.SentaiItems60;
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
					if (this == SentaiItems60.saiko_kyutama)
					{
						if (belt == SentaiItems60.red_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						if (belt == SentaiItems60.dark_red_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems60.dark_kyutama)
					{
						if (belt == SentaiItems60.silver_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
					else if (this == SentaiItems60.yagyuu_jubee_mask)
					{
						if (belt == SentaiItems60.black_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
					else if (this == SentaiItems60.ryu_skill_kyutama)
					{
						if (belt == SentaiItems60.commander_ryutsueder)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
					}
					else if (this == SentaiItems60.halloween_kyutama)
					{
						if (belt == SentaiItems60.houou_blade_shield || belt == SentaiItems60.red_seiza_blaster)
						{
							if (item_seiza_blaster.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==3)
							{
								item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);
								item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							}
							else
							{
								item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
								item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							}
						}
						else if (belt == SentaiItems60.commander_ryutsueder || belt == SentaiItems60.sky_blue_seiza_blaster)
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);	
						}
						else
						{
							item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						
					}
					else
					{
						item_seiza_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_seiza_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (num2 > 0)
				{
					if (belt != SentaiItems60.houou_blade_shield | belt != SentaiItems60.commander_ryutsueder | belt != SentaiItems60.black_seiza_blaster)
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
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.seiza_blaster)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.shishi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.red_seiza_blaster));
					}
					if (this == SentaiItems60.sasori_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.orange_seiza_blaster));
					}
					if (this == SentaiItems60.ookami_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.blue_seiza_blaster));
					}
					if (this == SentaiItems60.tenbin_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.gold_seiza_blaster));
					}
					if (this == SentaiItems60.oushi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.black_seiza_blaster));
					}
					if (this == SentaiItems60.hebitsukai_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.silver_seiza_blaster));
					}
					if (this == SentaiItems60.chameleon_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.green_seiza_blaster));
					}
					if (this == SentaiItems60.washi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.pink_seiza_blaster));
					}
					if (this == SentaiItems60.kajiki_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.yellow_seiza_blaster));
					}
					if (this == SentaiItems60.koguma_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.sky_blue_seiza_blaster));
					}
					if (this == SentaiItems60.dark_shishi_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.dark_red_seiza_blaster));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.ryutsueder)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.ryu_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.commander_ryutsueder));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.houou_shield)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.houou_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.houou_blade_shield));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems60.dark_seiza_blaster)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems60.dark_kyutama)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems60.metal_dark_seiza_blaster));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}