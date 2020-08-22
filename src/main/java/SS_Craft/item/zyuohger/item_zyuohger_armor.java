package SS_Craft.item.zyuohger;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gokaiger.item_mobirates;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.toqger.item_toq_changer;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.model.BipedLockseed;
import SS_Craft.model.tokuArmorModel;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_zyuohger_armor extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public static final String[] ZyuohEagle= new String[] {"zyuoh_eagle","zyuoh_gorilla","zyuoh_whale","zyuoh_eagle_great_instinct_awakened","zyuoh_condor"};
	public static final String[] ZyuohTheWorld= new String[] {"","_crocodile","_wolf"};
	public static final String[] ZyuohBird= new String[] {"zyuoh_bird","zyuoh_condor"};
	
	public item_zyuohger_armor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zyuoh_changer)
				{
					String rider = ((item_zyuoh_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if (rider == "zyuoh_eagle")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+ZyuohEagle[item_zyuoh_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+ZyuohEagle[item_zyuoh_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
						}
					}
					else if (rider == "zyuoh_the_world")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+rider+ZyuohTheWorld[item_zyuoh_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+rider+ZyuohTheWorld[item_zyuoh_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
						}
					}
					else if (rider == "zyuoh_bird")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+ZyuohBird[item_zyuoh_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/"+ZyuohBird[item_zyuoh_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
						}
					}
					else
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

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_zyuohger_armor)
			{
				tokuArmorModel armorModel = new tokuArmorModel();
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
				
				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}

		return null;
	}
}