package SS_Craft.item.zyuohger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.shinkenger.item_secret_disk;
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
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

public class item_zyuoh_changer extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_zyuoh_changer (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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
				
				if (this == SentaiItems40.zyuoh_the_light)
				{
					armorModel.belt=new ItemStack(SentaiItems40.zyuoh_the_world_belt);
				}
				else
				{
					armorModel.belt=new ItemStack(SentaiItems40.zyuohger_belt);
				}
				
				if (this == SentaiItems40.eagle_zyuoh_changer)
				{
					if ((living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying)) && this.get_core(stack)==0)
					{
						armorModel.wings=new ItemStack(SentaiItems40.zyuoh_eagle_wing);
					}
					else if(this.get_core(stack)==3)
					{
						armorModel.wings=new ItemStack(SentaiItems40.zyuoh_eagle_wing);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
					}
				}
				else if (this == SentaiItems40.zyuoh_changer_final)
				{
					if ((living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying)) && this.get_core(stack)==0)
					{
						armorModel.wings=new ItemStack(SentaiItems40.zyuoh_bird_wing);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
					}
				}
				else if (this == SentaiItems40.condor_zyuoh_changer)
				{
					if ((living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying)) && this.get_core(stack)==0)
					{
						armorModel.wings=new ItemStack(SentaiItems40.zyuoh_condor_wing);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
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
		return itemstack.hasTagCompound() ? item_zyuoh_cube.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.zyuohger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.zyuohger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.zyuohger_head)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.eagle_zyuoh_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										
										if (this.get_core(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
										}
										else if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
										}
										else if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
											
											if (player.isInWater())
											{
												if (player.isSneaking())
												{
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
												}
											}
										}
										else if (this.get_core(armor)==3)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,20, 2,true,false));
											if (player.isInWater())
											{
												if (player.isSneaking())
												{
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
												}
											}
										}
										else if (this.get_core(armor)==4)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.shark_zyuoh_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,20, 2,true,false));
										if (player.isInWater())
										{
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
											
											if (player.isSneaking())
											{
											Vec3d look = player.getLookVec();
											player.motionX=look.x/2;
											player.motionY=look.y/2;
											player.motionZ=look.z/2;
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.lion_zyuoh_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.elephant_zyuoh_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.tiger_zyuoh_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.zyuoh_the_light)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
										
										if (this.get_core(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										}
										else if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										}
										else if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.zyuoh_changer_final)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										
										if (this.get_core(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
										}
										else if (this.get_core(armor)==1)
										{
											player.removePotionEffect(MobEffects.STRENGTH);
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
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
		return SentaiItems40.king_s_credential == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}