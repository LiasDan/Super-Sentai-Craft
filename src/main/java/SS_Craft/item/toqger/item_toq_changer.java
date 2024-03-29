package SS_Craft.item.toqger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.gokaiger.item_ranger_key;
import SS_Craft.item.sentai_armor_base.item_form_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
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

public class item_toq_changer extends item_sentai_changer
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	int Gender;
	
	public static final String[] ToQ_Transfer= new String[] {"","toq_1gou","toq_2gou","toq_3gou","toq_4gou","toq_5gou","toq_6gou","toq_7gou"};
	public static final String[] ToQ_Extra= new String[] {"","","","","","","","","_white","_safari","_darkness","_rainbow"};
	public static final String[] ToQ_Gender= new String[] {"_guy","_girl"};
	public static final String[] ToQ_Color= new String[] {"","_red","_blue","_yellow","_green","_pink","_orange","_violet"};

	public item_toq_changer (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems40.toqger_head, SentaiItems40.toqger_torso, SentaiItems40.toqger_legs, SentaiItems40.blank_ressha);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
	}
	
	public item_toq_changer (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int gender)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems40.toqger_head, SentaiItems40.toqger_torso, SentaiItems40.toqger_legs, SentaiItems40.blank_ressha);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		Gender=gender;
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
				
				armorModel.belt=new ItemStack(SentaiItems40.toq_buckle);
				
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.toqger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.toqger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.toqger_head)
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
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.ichigou_toq_changer)
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
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 5,true,false));
										}
										if (this.get_core(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.nigou_toq_changer)
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
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.sangou_toq_changer)
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
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.yongou_toq_changer)
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
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gogou_toq_changer)
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
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.rokugou_appli_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.nanagou_appli_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.zerogou_toq_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
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
		return SentaiItems40.blank_ressha == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_sentai_changer)
			{
				String rider = ((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
				if (num==1||num==2||num==5||num==7||num==3||num==6||num==8)
				{
					if (rider=="yami_0gou")
					{
						return Refercence.MODID+":textures/armor/"+rider+ext;
					}
					if (rider=="toq_6gou"||rider=="toq_7gou")
					{
						if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
						{
							return Refercence.MODID+":textures/armor/"+rider+ext;
						}
						else if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>=1&&item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<=7)
						{
							return Refercence.MODID+":textures/armor/"+rider+ToQ_Color[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
						}
					}
					else
					{
						if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0)
						{
							return Refercence.MODID+":textures/armor/"+rider+ToQ_Gender[((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Gender]+ext;
						}
						else if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>=1&&item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<=7)
						{
							return Refercence.MODID+":textures/armor/"+ToQ_Transfer[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ToQ_Gender[((item_toq_changer)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Gender]+ext;						}
						else if (item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))>=8)
						{
							return Refercence.MODID+":textures/armor/"+rider+ToQ_Extra[item_toq_changer.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
						}
						else
						{
							return Refercence.MODID+":textures/armor/"+rider+ext;
						}
					}
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					return Refercence.MODID+":textures/armor/"+item_toq_changer.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+ext;
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
		return "blank";
	}
}