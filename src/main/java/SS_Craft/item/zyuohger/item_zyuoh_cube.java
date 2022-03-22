package SS_Craft.item.zyuohger;


import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
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


public class item_zyuoh_cube extends Item implements IHasModel
{
	public int num;
	public static String[] ARMOR= new String[] {"blank","yasei_kaihou","yasei_dai_kaihou"};
	
	public item_zyuoh_cube(int form,String name)
	{
		super();
		this.setMaxDamage(0);

		num=form;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zyuoh_changer)
			{
				item_zyuoh_changer belt = (item_zyuoh_changer) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
	
				if (belt == SentaiItems40.eagle_zyuoh_changer)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==SentaiItems40.eagle_cube)
						{
							if (playerIn.inventory.hasItemStack(new ItemStack(SentaiItems40.whale_change_gun)) && playerIn.inventory.hasItemStack(new ItemStack(SentaiItems40.gorilla_cube)))
							{
								item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
								item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
							}
						}
					}
					else if (this == SentaiItems40.gorilla_cube)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems40.shark_zyuoh_changer)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==SentaiItems40.shark_cube)
						{
							item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						}
					}
					else
					{
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems40.lion_zyuoh_changer)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==SentaiItems40.lion_cube)
						{
							item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						}
					}
					else
					{
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems40.elephant_zyuoh_changer)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==SentaiItems40.elephant_cube)
						{
							item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						}
					}
					else
					{
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems40.tiger_zyuoh_changer)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==SentaiItems40.tiger_cube)
						{
							item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						}
					}
					else
					{
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				else if (belt == SentaiItems40.zyuoh_the_light)
				{
					if (playerIn.isSneaking()) 
					{
						if (this==SentaiItems40.rhinos_cube)
						{
							if (playerIn.inventory.hasItemStack(new ItemStack(SentaiItems40.crocodile_cube)) && playerIn.inventory.hasItemStack(new ItemStack(SentaiItems40.wolf_cube)))
							{
								item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
								item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
							}
						}
					}
					else if (this == SentaiItems40.crocodile_cube || this == SentaiItems40.wolf_cube)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
			}
		}
		
	    playerIn.setActiveHand(handIn);
	    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}