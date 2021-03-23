package SS_Craft.item.toqger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gokaiger.item_ranger_key;
import SS_Craft.model.model_belt;
import SS_Craft.model.model_belt_plus;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_toq_changer extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	int Gender;

	public item_toq_changer (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	
	public item_toq_changer (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int gender)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		Gender=gender;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
			return !true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				model_belt_plus armorModel = new model_belt_plus();
				
				armorModel.belt=new ItemStack(RiderItems.toq_buckle);
				
				//armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.FEET;
				//armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.FEET;
				
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

	public static int get_eftTime(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 100;
	}

	public static void set_eftTime(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("eftTime", flag);
	}

	public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}
	
	public static String get_lock(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? item_toq_ressha.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("armor", flag);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) 
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null)
		{
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null)
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null)
				{
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
					{
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.toqger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.toqger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.toqger_head)
								{
									if (this.get_core(armor)==8)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 20, 1,true,false));
										player.removePotionEffect(MobEffects.STRENGTH);
										player.removePotionEffect(MobEffects.SPEED);
										player.removePotionEffect(MobEffects.RESISTANCE);
										player.removePotionEffect(MobEffects.JUMP_BOOST);
										player.removePotionEffect(MobEffects.HASTE);
									}
									if (this.get_lock(armor)=="toq_hyper")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ichigou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==9)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										}
										if (this.get_core(armor)==10)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 5,true,false));
										}
										if (this.get_core(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nigou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==9)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sangou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==9)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.yongou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==9)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gogou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										
										if (this.get_core(armor)==9)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 1,true,false));
											player.removePotionEffect(MobEffects.SPEED);
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.rokugou_appli_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nanagou_appli_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zerogou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 5,true,false));
									}
								}
							}
						}
					}
				}
			}
		}		
	}
	
	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return RiderItems.blank_ressha == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}