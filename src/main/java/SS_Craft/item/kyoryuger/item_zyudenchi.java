package SS_Craft.item.kyoryuger;


import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.blocks.zyudenchi_charger;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
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


public class item_zyudenchi extends Item implements IHasModel
{
	public int num;
	public int num2;
	public static String[] RIGHT= new String[] {"blank","kyoryu_armed_on","kyoryu_gaburu_armed_on","kyoryu_plezuon_rocket","kyoryu_red_carnival_parasagun","kyoryu_red_carnival_stegotchi","kyoryu_red_carnival_ankydon","kyoryu_red_carnival_plezuon"};
	public static String[] LEFT= new String[] {"blank","kyoryu_red_carnival_zakutor","kyoryu_red_carnival_dricera","kyoryu_red_carnival_bunpachy","kyoryu_red_carnival_tobaspino"};
	public static String[] BOTH= new String[] {"blank","kyoryu_deinosgrander","kyoryu_gaburu_armed_on2"};
	
	public item_zyudenchi(int form,String name)
	{
		super();
		this.setMaxDamage(0);

		num=form;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	public item_zyudenchi(String name, int arms) 
	{
		super();
		this.setMaxDamage(0);

		num2=arms;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	public item_zyudenchi(String name)
	{
		super();
		this.setMaxDamage(0);
	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	public item_zyudenchi AddToKyoryugerZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.kyoryuger.add(this);
		}
		return this;
	}

	public item_zyudenchi AddToDebothZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.deboth.add(this);
		}
		return this;
	}

	public item_zyudenchi AddToBraveZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.brave.add(this);
		}
		return this;
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_gaburivolver)
			{
				item_gaburivolver belt = (item_gaburivolver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				
				if (belt == SentaiItems40.red_gaburivolver)
				{
					if (this == SentaiItems40.deboth_gabutyra_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.carnival_zyudenchi)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==SentaiItems40.gabutyra_de_carnival)
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.gabutyra_zyudenchi)
					{
						if (playerIn.isSneaking())
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.double_gabutyra_zyudenchi || this == SentaiItems40.deinosgrander_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.spirit_plezuon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (item_gaburivolver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5)
					{
						if (this == SentaiItems40.parasagun_zyudenchi)
						{
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);
						}
						if (this == SentaiItems40.stegotchi_zyudenchi)
						{
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5);
						}
						if (this == SentaiItems40.zakutor_zyudenchi)
						{
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						}
						if (this == SentaiItems40.dricera_zyudenchi)
						{
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
						}
						if (this == SentaiItems40.ankydon_zyudenchi)
						{
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6);
						}
						if (this == SentaiItems40.bunpachy_zyudenchi)
						{
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
						}
						if (this == SentaiItems40.plezuon_zyudenchi)
						{
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),7);
						}
						if (this == SentaiItems40.tobaspino_zyudenchi)
						{
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);
						}
					}
				}
				if (belt == SentaiItems40.black_gaburivolver)
				{
					if (this == SentaiItems40.deboth_parasagun_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.parasagun_zyudenchi)
					{
						if (playerIn.isSneaking())
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.deinosgrander_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.spirit_plezuon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.blue_gaburivolver)
				{
					if (this == SentaiItems40.deboth_stegotchi_zyudenchi || this == SentaiItems40.ghost_stegotchi_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.stegotchi_zyudenchi)
					{
						if (playerIn.isSneaking())
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.deinosgrander_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.spirit_plezuon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.green_gaburivolver)
				{
					if (this == SentaiItems40.deboth_zakutor_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.zakutor_zyudenchi)
					{
						if (playerIn.isSneaking())
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.deinosgrander_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.spirit_plezuon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.pink_gaburivolver)
				{
					if (this == SentaiItems40.deboth_dricera_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.dricera_zyudenchi)
					{
						if (playerIn.isSneaking())
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.deinosgrander_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.spirit_plezuon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.gold_gaburichanger)
				{
					if (this == SentaiItems40.deboth_pteragordon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.spirit_pteragordon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.pteragordon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.violet_gaburivolver)
				{
					if (this == SentaiItems40.plezuon_zyudenchi)
					{
						if (item_gaburivolver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==3)
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
						else
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
						}
					}
				}
				if (belt == SentaiItems40.future_red_gaburivolver)
				{
					if (this == SentaiItems40.carnival_zyudenchi)
					{
						if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()==SentaiItems40.gabutyra_de_carnival)
						{
							item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}
					}
					else if (this == SentaiItems40.gabutyra_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (this == SentaiItems40.tobaspino_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
					else if (item_gaburivolver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==3)
					{
						if (this == SentaiItems40.parasagun_zyudenchi)
						{
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);
						}
						if (this == SentaiItems40.stegotchi_zyudenchi)
						{
							item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5);
						}
						if (this == SentaiItems40.zakutor_zyudenchi)
						{
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						}
						if (this == SentaiItems40.dricera_zyudenchi)
						{
							item_gaburivolver.set_left(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
						}
					}
				}
				if (belt == SentaiItems40.future_black_gaburivolver)
				{
					if (this == SentaiItems40.parasagun_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else if (this == SentaiItems40.bragigas_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.future_green_gaburivolver)
				{
					if (this == SentaiItems40.zakutor_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else if (this == SentaiItems40.bunpachy_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.future_pink_gaburivolver)
				{
					if (this == SentaiItems40.dricera_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else if (this == SentaiItems40.ankydon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
				if (belt == SentaiItems40.future_gaburichanger)
				{
					if (this == SentaiItems40.pteragordon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
					else if (this == SentaiItems40.plezuon_zyudenchi)
					{
						item_gaburivolver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
						item_gaburivolver.set_right(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.gaburivolver)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems40.gabutyra_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.red_gaburivolver));
					}
					if (this == SentaiItems40.parasagun_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.black_gaburivolver));
					}
					if (this == SentaiItems40.stegotchi_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.blue_gaburivolver));
					}
					if (this == SentaiItems40.zakutor_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.green_gaburivolver));
					}
					if (this == SentaiItems40.dricera_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.pink_gaburivolver));
					}
					if (this == SentaiItems40.ankydon_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.cyan_gaburivolver));
					}
					if (this == SentaiItems40.bunpachy_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.grey_gaburivolver));
					}
					if (this == SentaiItems40.plezuon_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.violet_gaburivolver));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.gaburichanger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems40.pteragordon_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.gold_gaburichanger));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.giga_gaburivolver)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems40.bragigas_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.silver_giga_gaburivolver));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.gabu_gaburivolver)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems40.guntyra_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.red_gabu_gaburivolver));
					}
					if (this == SentaiItems40.stegonsaw_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.black_gabu_gaburivolver));
					}
					if (this == SentaiItems40.shovecera_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.blue_gabu_gaburivolver));
					}
					if (this == SentaiItems40.parasaser_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.green_gabu_gaburivolver));
					}
					if (this == SentaiItems40.rapx_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.pink_gabu_gaburivolver));
					}
				}
			}
			if (playerIn.getHeldItem(EnumHand.OFF_HAND).getItem()== SentaiItems40.gabu_gabuchanger)
			{
				ItemStack itemstack = playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET);

				if (itemstack.isEmpty())
				{
					if (this == SentaiItems40.pteravolton_zyudenchi)
					{
						playerIn.setItemStackToSlot(EntityEquipmentSlot.FEET,  new ItemStack(SentaiItems40.gold_gabu_gabuchanger));
					}
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}