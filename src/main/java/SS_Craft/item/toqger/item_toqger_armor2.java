package SS_Craft.item.toqger;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems40;
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

public class item_toqger_armor2 extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	
	public static final String[] ToQ_Transfer= new String[] {"","toq_1gou","toq_2gou","toq_3gou","toq_4gou","toq_5gou","toq_6gou","toq_7gou"};
	public static final String[] ToQ_Extra= new String[] {"","","","","","","","","_white","_safari","_darkness","_rainbow"};
	public static final String[] ToQ_Gender= new String[] {"_guy","_girl"};
	public static final String[] ToQ_Color= new String[] {"","_red","_blue","_yellow","_green","_pink","_orange","_violet"};
	
	public item_toqger_armor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_toq_changer)
				{
					String rider = ((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if (rider=="yami_0gou")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+"_1.png";
						}
					}
					if (rider=="toq_6gou"||rider=="toq_7gou")
					{
						if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
						{
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+rider+"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
							{
								return Refercence.MODID+":textures/armor/"+rider+"_1.png";
							}
						}
						else if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>=1&&item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<=7)
						{
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+rider+ToQ_Color[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
							{
								return Refercence.MODID+":textures/armor/"+rider+ToQ_Color[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
							}
						}
					}
					else
					{
						if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
						{
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+rider+ToQ_Gender[((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Gender]+"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
							{
								return Refercence.MODID+":textures/armor/"+rider+ToQ_Gender[((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Gender]+"_1.png";
							}
						}
						else if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>=1&&item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<=7)
						{
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+ToQ_Transfer[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ToQ_Gender[((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Gender]+"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
							{
								return Refercence.MODID+":textures/armor/"+ToQ_Transfer[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ToQ_Gender[((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Gender]+"_1.png";
							}
						}
						else if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>=8)
						{
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+rider+ToQ_Extra[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
							{
								return Refercence.MODID+":textures/armor/"+rider+ToQ_Extra[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+"_1.png";
							}
						}
						else
						{
							if (slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+rider+"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
							{
								return Refercence.MODID+":textures/armor/"+rider+"_1.png";
							}
						}
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
			if(stack.getItem() instanceof item_toqger_armor2)
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
		return SentaiItems40.blank_ressha == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}