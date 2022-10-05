package SS_Craft.item.gaoranger.mecha;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.item.sentai_armor_base.item_mecha;
import SS_Craft.item.sentai_armor_base.item_mecha_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
import SS_Craft.item.shinkenger.item_secret_disk;
import SS_Craft.model.BipedLockseed;
import SS_Craft.model.model_belt;
import SS_Craft.model.model_belt_plus;
import SS_Craft.model.tokuArmorModel;
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_gaoranger_mecha extends item_mecha
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public static final String[] GaoKing = {"","_blue","_black","_white"};
	public static final String[] GaoMuscle = {"","_ape"};
	public static final String[] GaoHunter = {"","_evil"};
	public static final String[] Right= {"","gao_shark","gao_giraffe","gao_polar","gao_hammerhead","gao_sawshark","gao_panda"};
	public static final String[] Left= {"","gao_tiger","gao_deers","gao_bear","gao_wolf","gao_jaguar"};
	public static final String[] Legs= {"","gao_king","gao_icarus","gao_god"};

	public item_gaoranger_mecha (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_mecha_changer)SentaiItems20.blanknomecha,SentaiItems40.gao_king_torso, SentaiItems40.gao_king_legs, SentaiItems40.gao_king_boots, SentaiItems20.mecha_gear);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.HEAD);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.HEAD));
		this.maxStackSize = 1;
		Rider=rider;
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
				
				armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
				
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
	
	public static int get_right(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("right") : 0;
	}
	
	public static void set_right(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("right", flag);
	}
	
	public static int get_left(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("left") : 0;
	}
	
	public static void set_left(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("left", flag);
	}
	
	public static int get_leg(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("leg") : 0;
	}
	
	public static void set_leg(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("leg", flag);
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.gao_king_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.gao_king_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gao_king_boots)
								{
									if (this.get_effect(armor)==1)
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_BIG,20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_king_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_muscle_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										if (this.get_right(armor)==0||this.get_left(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_hunter_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_hunter_blue_moon_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_icarus_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 3,true,false));

										if (this.get_leg(armor)==0)
										{
											player.removePotionEffect(MobEffects.SLOWNESS);
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										}
										if (this.get_right(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_god_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 6,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_knight_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
									}
									if (this.get_left(armor)==2)
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
									}
									if (this.get_right(armor)==2)
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
									}
									if (this.get_right(armor)==3|this.get_right(armor)==6|this.get_left(armor)==3)
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
									}
									if (this.get_leg(armor)==3)
									{
										player.removePotionEffect(MobEffects.SLOWNESS);
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
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
		return SentaiItems20.mecha_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()instanceof item_mecha)
			{
				String rider = ((item_gaoranger_mecha)player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).Rider;
				
				if (num==1||num==8)
				{
					if (rider == "gao_king")
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+GaoKing[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+ext;
					}
					else if (rider == "gao_muscle")
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+GaoMuscle[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+ext;
					}
					else if (rider == "gao_hunter" || rider == "gao_hunter_blue_moon")
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+GaoHunter[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+ext;
					}
					else
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+ext;
					}
				}
				else if (num==5)
				{
					if (this.get_right(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))==0)
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+ext;
					}
					else
					{
						return Refercence.MODID+":textures/armor/mecha/"+Right[item_gaoranger_mecha.get_right(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+".png";
					}
				}
				else if (num==2)
				{
					if (this.get_left(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))==0)
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+ext;
					}
					else
					{
						return Refercence.MODID+":textures/armor/mecha/"+Left[item_gaoranger_mecha.get_left(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+".png";
					}
				}
				else if (num==3||num==6||num==7)
				{
					if (rider == "gao_hunter" || rider == "gao_hunter_blue_moon")
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+GaoHunter[item_gaoranger_mecha.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+ext;
					}
					else if (this.get_leg(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))==0)
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+ext;
					}
					else
					{
						return Refercence.MODID+":textures/armor/mecha/"+Legs[item_gaoranger_mecha.get_leg(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD))]+ext;
					}
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					if (rider == "gao_god")
					{
						return Refercence.MODID+":textures/armor/mecha/"+rider+"_extra.png";
					}
					else
					{
						return "blank";
					}
				}
				else
				{
					return "blank";
				}
			}
			else
			{
				return "blank";
			}
		}
		else
		{
			return "blank";
		}
	}
}