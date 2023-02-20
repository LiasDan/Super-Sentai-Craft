package SS_Craft.item.don_brothers;


import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.zenkaiger.item_sentai_gear;
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
	public int num3;
	public int num4;
	public boolean alter = false;
	public boolean sixth = false;
	
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

	public item_avatarou_gear alter(int team)
	{
		alter=true;
		num3=team;
		return this;
	}
	
	public Item alter_gear()
	{
		Item[] AlterGear = new Item[] {SentaiItems60.gokaiger_avatarou_gear_alter,SentaiItems60.go_busters_avatarou_gear_alter,SentaiItems60.kyoryuger_avatarou_gear_alter,
				SentaiItems60.toqger_avatarou_gear_alter,SentaiItems60.ninninger_avatarou_gear_alter,SentaiItems60.zyuohger_avatarou_gear_alter,SentaiItems60.kyuranger_avatarou_gear_alter,
				SentaiItems60.lupinranger_avatarou_gear_alter,SentaiItems60.patranger_avatarou_gear_alter,SentaiItems60.ryusoulger_avatarou_gear_alter,
				SentaiItems60.kirameiger_avatarou_gear_alter,SentaiItems60.zenkaiger_avatarou_gear_alter};
		return AlterGear[num3];
	}

	public item_avatarou_gear sixth(int member)
	{
		sixth=true;
		num4=member;
		return this;
	}
	
	public Item sixth_gear()
	{
		Item[] SixthGear = new Item[] {SentaiItems60.dragon_ranger_avatarou_gear,SentaiItems60.kiba_ranger_avatarou_gear,SentaiItems60.gokai_silver_avatarou_gear,
				SentaiItems60.beet_buster_avatarou_gear,SentaiItems60.kyoryu_gold_avatarou_gear,SentaiItems60.toq_6gou_avatarou_gear,SentaiItems60.star_ninger_avatarou_gear,
				SentaiItems60.zyuoh_the_world_avatarou_gear,SentaiItems60.houou_soldier_avatarou_gear,SentaiItems60.lupin_x_avatarou_gear,SentaiItems60.patren_x_avatarou_gear,
				SentaiItems60.ryusoul_gold_avatarou_gear,SentaiItems60.kiramei_silver_avatarou_gear,SentaiItems60.twokaizer_avatarou_gear};
		return SixthGear[num4];
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
			
				if (belt == SentaiItems60.momotarou_don_blaster)
				{
					if (item_don_blaster.get_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						if (alter==true)
						{
							if (!worldIn.isRemote)
							{
								playerIn.dropItem(alter_gear(), 1);
								
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
					}
					else
					{
						item_don_blaster.set_avatar(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						item_don_blaster.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_don_blaster.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
				}
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
						item_don_blaster.set_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					if (item_don_blaster.get_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						if (alter==true)
						{
							if (!worldIn.isRemote)
							{
								playerIn.dropItem(alter_gear(), 1);
								
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
					}
					if (item_don_blaster.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0||item_don_blaster.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						if (sixth==true)
						{
							if (!worldIn.isRemote)
							{
								playerIn.dropItem(sixth_gear(), 1);
								
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
					}
				}
				else if (belt == SentaiItems60.murasame_ninjark_sword)
				{
					if (item_don_blaster.get_alter(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1)
					{
						if (alter==true)
						{
							if (!worldIn.isRemote)
							{
								playerIn.dropItem(alter_gear(), 1);
								
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
					}
					else
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
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}