package SS_Craft.item.gaoranger.mecha;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.go_onger.item_go_phone;
import SS_Craft.item.maskman.item_masking_brace;
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

public class item_gaoranger_mecha_armor2 extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	
	public static final String[] GaoKing = {"","_striker","_god","_blue","_blue_striker","_blue_god","_black","_black_striker","_black_god","_white","_white_striker","_white_god"};
	public static final String[] GaoMuscle = {"","_striker","_god","_ape","_ape_striker","_ape_god"};
	public static final String[] GaoHunter = {"","_evil"};
	public static final String[] GaoHunterBlueMoon = {"","_evil"};
	public static final String[] GaoIcarus = {"","_king","_god"};
	public static final String[] GaoGod = {"","_king","_striker"};

	public item_gaoranger_mecha_armor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof item_gaoranger_mecha)
				{
					String rider = ((item_gaoranger_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).Rider;

					if (rider == "gao_king")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoKing[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoKing[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_1.png";
						}
					}
					else if (rider == "gao_muscle" || rider == "gao_knight")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoMuscle[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoMuscle[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_1.png";
						}
					}
					else if (rider == "gao_hunter")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoHunter[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoHunter[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_1.png";
						}
					}
					else if (rider == "gao_hunter_blue_moon")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoHunterBlueMoon[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoHunterBlueMoon[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_1.png";
						}
					}
					else if (rider == "gao_icarus")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoIcarus[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoIcarus[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_1.png";
						}
					}
					else if (rider == "gao_god")
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoGod[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider+GaoGod[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))] +"_1.png";
						}
					}
					else
					{
						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider +"_2.png";
						}
						if (slot == EntityEquipmentSlot.FEET||slot == EntityEquipmentSlot.CHEST  )
						{
							return Refercence.MODID+":textures/armor/mecha/"+rider +"_1.png";
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
			if(stack.getItem() instanceof item_gaoranger_mecha_armor2)
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
		return RiderItems.mecha_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}