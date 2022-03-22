package SS_Craft.item.zenkaiger;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.model.BipedLockseed;
import SS_Craft.model.tokuArmorModel;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_zenkaiger_armor2 extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public static final String[] Zenkaiger= new String[] {"","_normal","_jetman"};
	public static final String[] Zenkaizer= new String[] {"","_super","_jetman"};
	public static final String[] Twokaizer= new String[] {"","_jetman"};
	public static final String[] Stacaesar= new String[] {"","_kyoka"};
	public static final String[] Hakaizer= new String[] {"","_kai"};
	public static final String[] Mecha= new String[] {"akaranger","spade_ace","battle_fever_robo","dai_denzin","sun_vulcan_robo","goggle_robo","dyna_robo","bio_robo","change_robo","flash_king","great_five","live_robo","turbo_robo","five_robo","jet_icarus","dai_zyujin","ryusei_oh","muteki_shogun","ohranger_robo","rv_robo","galaxy_mega","gingai_oh","victory_robo","time_robo_alpha","gao_king","senpuu_jin","abaren_oh","dekaranger_robo","magi_king","dai_bouken","geki_tohja","engine_oh","shinken_oh","gosei_great","gokai_oh","go_buster_oh","kyoryu_zin","toq_oh","shuriken_jin","zyuoh_king","kyuren_oh","lupin_kaiser","pat_kaiser","kishiryu_oh","kiramei_zin","don_momotarou"};
												   //{1          ,2          ,3                  ,4           ,5                ,6            ,7          ,8         ,9            ,10          ,11          ,12         ,13          ,14         ,15          ,16          ,17         ,18             ,19             ,20       ,21           ,22         ,23            ,24               ,25        ,26          ,27         ,28               ,29         ,30          ,31          ,32         ,33          ,34           ,35        ,36            ,37          ,38      ,39            ,40          ,41         ,42            ,43          ,44           ,45           ,46             };

	public item_zenkaiger_armor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase){
			
			EntityLivingBase player = ((EntityLivingBase)entity);

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_geartlinger)
				{
					String rider = ((item_geartlinger)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
					
					if (rider == "zenkaizer")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+Zenkaizer[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+Zenkaizer[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
						}
					}
					else if (rider == "twokaizer")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+Twokaizer[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+Twokaizer[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
						}
					}
					else if (rider == "zenkai_juran" || rider == "zenkai_gaon" || rider == "zenkai_magine" || rider == "zenkai_vroon")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+Zenkaiger[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+Zenkaiger[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
						}
					}
					else if (rider == "stacaesar")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+Stacaesar[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+Stacaesar[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
						}
					}
					else if (rider == "hakaizer")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+Hakaizer[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+Hakaizer[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
						}
					}
					else if (rider == "mecha")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+Mecha[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/mecha/"+Mecha[item_geartlinger.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
						}
					}
					else
					{
						if (slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider +"_1.png";
						}
					}
					
					return Refercence.MODID+":textures/armor/blank.png";
				}
			}
			else
			{
				return Refercence.MODID+":textures/armor/blank.png";
			}
		}
		
		return Refercence.MODID+":textures/armor/blank.png";
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_zenkaiger_armor2)
			{ 
				tokuArmorModel armorModel = new tokuArmorModel();

				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;

				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.CHEST;


				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				armorModel.swingProgress = living.swingProgress;

				return armorModel;
			}
		}
	
		return null;
	}

	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}
	
	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return SentaiItems60.blank_sentai_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}