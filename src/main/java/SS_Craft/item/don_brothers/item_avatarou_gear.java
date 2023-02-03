package SS_Craft.item.don_brothers;


import SS_Craft.SentaiItems60;
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


public class item_avatarou_gear extends Item implements IHasModel
{
	public int num;
	public int num2;
	
	public item_avatarou_gear(int armor,String name)
	{
		super();
		this.setMaxDamage(0);

		num=armor;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}

	public item_avatarou_gear(String name,int form)
	{
		super();
		this.setMaxDamage(0);

		num2=form;

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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_don_blaster)
			{
				item_don_blaster belt = (item_don_blaster) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
			
				if (belt == SentaiItems60.saru_don_blaster)
				{
					if (num == 46 || num == 43)
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				}
				else if (belt == SentaiItems60.oni_don_blaster)
				{
					if (num == 2 || num == 3 || num == 9 || num == 37 || num == 43 || num == 44 || num == 46)
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				}
				else if (belt == SentaiItems60.inu_don_blaster)
				{
					if (num == 1 || num == 2 || num == 4 || num == 5 || num == 8 || num == 10 || num == 17 || num == 19 || num == 20 || num == 22 || num == 23 || num == 24 || num == 26 || num == 28 || num == 29 || num == 31 || num == 33 || num == 35 || num == 36 || num == 38 || num == 39 || num == 40 || num == 42 || num == 43 || num == 45 || num == 46)
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				}
				else if (belt == SentaiItems60.kiji_don_blaster)
				{
					if (num == 5 || num == 12 || num == 15 || num == 18 || num == 25 || num == 26 || num == 27 || num == 31 || num == 32 || num == 36 || num == 40 || num == 42 || num == 46)
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				}
				else if (belt == SentaiItems60.toradora_ryuko_no_geki)
				{
					if (num2 != 0)
					{
						item_don_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
				else if (belt == SentaiItems60.murasame_ninjark_sword)
				{
					if (num == 27)
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
					else
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
				else
				{
					item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}