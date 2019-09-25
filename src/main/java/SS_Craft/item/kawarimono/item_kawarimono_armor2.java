package SS_Craft.item.kawarimono;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gokaiger.item_mobirates;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.toqger.item_toq_changer;
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

public class item_kawarimono_armor2 extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	
	//                                                  {0          ,1          ,2          ,3             ,4          ,5          ,6           ,7         ,8        ,9              ,10         ,11        ,12          ,13         ,14        ,15        ,16              ,17           ,18         ,19      ,20         ,21        ,22         ,23      ,24        ,25       ,26             ,27         ,28        ,29        ,30          ,31        ,32         ,33           ,34         ,35          ,36          ,37        ,38          };
	public static final String[] GokaiRed= new String[] {"gokai_red","akaranger","spade_ace","battle_japan","denzi_red","vul_eagle","goggle_red","dyna_red","red_one","change_dragon","red_flash","red_mask","red_falcon","red_turbo","five_red","red_hawk","tyranno_ranger","ryuu_ranger","ninja_red","oh_red","red_racer","mega_red","ginga_red","go_red","time_red","gao_red","hurricane_red","abare_red","deka_red","magi_red","bouken_red","geki_red","go_on_red","shinken_red","gosei_red","red_buster","kyoryu_red","toq_1gou","aka_ninger"};

	public item_kawarimono_armor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		
        setUnlocalizedName(name);
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
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_mobirates)
				{
					String rider = ((item_mobirates)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+GokaiRed[item_mobirates.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
					{
						return Refercence.MODID+":textures/armor/"+GokaiRed[item_mobirates.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
					}
					
					return Refercence.MODID+":textures/armor/blank.png";
				}
				else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ninja_ichibantou)
				{
					String rider = ((item_ninja_ichibantou)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+rider+"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
					{
						return Refercence.MODID+":textures/armor/"+rider+"_1.png";
					}
				}
				else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_seiza_blaster)
				{
					String rider = ((item_seiza_blaster)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+rider+"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
					{
						return Refercence.MODID+":textures/armor/"+rider+"_1.png";
					}
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
			if(stack.getItem() instanceof item_kawarimono_armor2)
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

}