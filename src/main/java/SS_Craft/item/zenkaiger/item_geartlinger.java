package SS_Craft.item.zenkaiger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.item.zyuranger.item_dino_medal;
import SS_Craft.model.model_belt;
import SS_Craft.model.model_belt_plus;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Tuple;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_geartlinger extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public String Armor;
	
	public item_geartlinger (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, String armor)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		Armor=armor;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}

	public item_geartlinger (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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
				
				if (this == SentaiItems60.zenkaizer_geartlinger)
				{
					armorModel.belt=new ItemStack(SentaiItems60.zenkaizer_belt);
				}
				else if (this == SentaiItems60.twokaizer_geardalinger || this == SentaiItems60.twokai_flint_geardalinger)
				{
					armorModel.belt=new ItemStack(SentaiItems60.twokaizer_belt);
				}
				else if (this == SentaiItems60.stacaeser_geartozinger)
				{
					armorModel.belt=new ItemStack(SentaiItems60.stacaesar_belt);
				}
				else if (this == SentaiItems60.hakaizer_belt)
				{
					armorModel.belt=stack;
				}
				else if (this == SentaiItems60.mecha_dark_gear)
				{
					if (this.get_core(stack)==0)
					{
						armorModel.belt=new ItemStack(SentaiItems20.goranger_logo);
					}
					else if (this.get_core(stack)==1)
					{
						armorModel.belt=new ItemStack(SentaiItems20.jakq_belt);
					}
					else if (this.get_core(stack)==45)
					{
						armorModel.belt=new ItemStack(SentaiItems60.donbro_buckle);
					}
					else
					{
						armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
					}
				}
				else
				{
					if (this != SentaiItems60.zenkaizer_geartlinger)
					{
						if (this.get_core(stack)==1)
						{
							armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
						}
						else if (this == SentaiItems60.magine_geartlinger)
						{
							armorModel.belt=new ItemStack(SentaiItems60.zenkai_magine_belt);
						}
						else
						{
							armorModel.belt=new ItemStack(SentaiItems60.zenkai_juran_belt);
						}
					}
					else
					{
						armorModel.belt=new ItemStack(SentaiItems60.zenkai_juran_belt);
					}
				}
				
				if (this.get_effect(stack)==3)
				{
					armorModel.wings=new ItemStack(SentaiItems60.zenkai_zyuoh_wings);
				}
				else if (this == SentaiItems60.mecha_dark_gear && this.get_core(stack)==29)
				{
					armorModel.wings=new ItemStack(SentaiItems40.magi_king_wings);
				}
				else if (this == SentaiItems60.hakaizer_belt)
				{
					if (living.getHeldItem(EnumHand.OFF_HAND).getItem()==SentaiItems60.v_merang || living.getHeldItem(EnumHand.MAIN_HAND).getItem()==SentaiItems60.v_merang || this.get_core(stack)==1)
					{
						armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems60.hakaizer_wings);
					}
				}
				else
				{
					armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
				}
				
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

	public static int get_core(ItemStack itemstack)
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
		item_geartlinger belt = (item_geartlinger)itemstack.getItem();
		
		if (belt.Armor!=null)
		{
			return itemstack.hasTagCompound() ? item_zenkai_gear.ARMOR[itemstack.getTagCompound().getInteger("armor")] : belt.Armor;
		}
		return itemstack.hasTagCompound() ? item_zenkai_gear.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("armor", flag);
	}

	public static int  get_effect(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("effect") :0;
	}

	public static void set_effect(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("effect", flag);
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems60.zenkaiger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems60.zenkaiger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems60.zenkaiger_head)
								{
									if(this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<1000){

										this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.zenkaizer_geartlinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 6,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 6,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.juran_geartlinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gaon_geartlinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.magine_geartlinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.LUCK,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.vroon_geartlinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokaizer_geardalinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.stacaeser_geartozinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.hakaizer_belt)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.red_geartlinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.twokai_flint_geardalinger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (this.get_lock(armor)=="cutanner")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
									}
									if (this.get_lock(armor)=="ricky")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
									}
									if (this.get_lock(armor)=="super")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 6,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 6,true,false));
									}
									if (this.get_effect(armor)==1)
									{
										if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) < 1000)
										{
											player.fallDistance=0;
											if (player.isSneaking())
											{
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
											}
										}
										else
										{
											this.set_eftTime(armor, 0);
											this.set_effect(armor, 0);
										}
									}
									if (this.get_effect(armor)==2)
									{
										if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) < 1000)
										{
											if (player.isSneaking())
											{
												Vec3d look = player.getLookVec();
												player.motionX=look.x/5;
												player.motionZ=look.z/5;
											}
										}
										else
										{
											this.set_eftTime(armor, 0);
											this.set_effect(armor, 0);
										}
									}
									if (this.get_effect(armor)==3)
									{
										if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) < 1000)
										{
											
										}
										else
										{
											this.set_eftTime(armor, 0);
											this.set_effect(armor, 0);
										}
									}
									if (this.get_effect(armor)==4)
									{
										if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) < 1000)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_BIG,20, 3,true,false));
										}
										else
										{
											this.set_eftTime(armor, 0);
											this.set_effect(armor, 0);
										}
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
		return SentaiItems60.blank_sentai_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}