package SS_Craft.item.kyuranger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gokaiger.item_ranger_key;
import SS_Craft.item.lupatranger.item_vs_changer;
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

public class item_seiza_blaster extends item_sentai_changer
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	
	public static final String[] Kyuranger= new String[] {"","_ya","_orion","_halloween","_halloween1"};
	public static final String[] OushiBlack= new String[] {"oushi_black","oushi_black_ya","yagyuu_jubee","oushi_black_halloween"};
	public static final String[] HebitsukaiSilver= new String[] {"hebitsukai_silver","hebitsukai_silver_ya","hebitsukai_metal_good","hebitsukai_silver_halloween"};
	public static final String[] RyuCommander= new String[] {"ryu_commander","ryu_commander_ya","ryu_violet"};
	public static final String[] DarkShishiRed = new String[] {"","_orion"};

	public item_seiza_blaster (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems60.kyuranger_head, SentaiItems60.kyuranger_torso, SentaiItems60.kyuranger_legs, SentaiItems60.blank_kyutama);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
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
				
				if ((this == SentaiItems60.commander_ryutsueder & this.get_core(stack)!=1) | (this == SentaiItems60.red_seiza_blaster & this.get_core(stack)==2) | (this == SentaiItems60.dark_red_seiza_blaster & this.get_core(stack)==1))
				{
					armorModel.belt=new ItemStack(SentaiItems60.ryu_buckle);
				}
				else if (this.get_core(stack)==1)
				{
					armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
				}
				else
				{
					armorModel.belt=new ItemStack(SentaiItems60.kyu_buckle);
				}
				
				if (this == SentaiItems60.pink_seiza_blaster)
				{
					if ((living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying)) & (this.get_core(stack)==0 | this.get_core(stack)==3))
					{
						armorModel.wings=new ItemStack(SentaiItems60.washi_pink_wing);
					}
					else if (this.get_core(stack)==0 | this.get_core(stack)==3)
					{
						armorModel.wings=new ItemStack(SentaiItems60.washi_pink_wing_close);
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
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 1000;
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
		return itemstack.hasTagCompound() ? item_kyutama.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems60.kyuranger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems60.kyuranger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems60.kyuranger_head)
								{
									if(this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<1000){

										this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.red_seiza_blaster)
									{
										if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.LUCK,20, 5,true,false));
										}
										else
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.LUCK,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.orange_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.blue_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.gold_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.black_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.silver_seiza_blaster)
									{
										if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										}
										else
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.green_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.pink_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.yellow_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.commander_ryutsueder)
									{
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										}
										else
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.sky_blue_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.houou_blade_shield)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.metal_dark_seiza_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.dark_red_seiza_blaster)
									{
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 4,true,false));
										}
										else
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
									}
									if (this.get_lock(armor)=="kyu_ikkakuju_arm")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
									}
									if (this.get_lock(armor)=="kyu_pegasus")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
									}
									if (this.get_lock(armor)=="kyu_taiyou_mode")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));;
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
									}
									if (this.get_lock(armor)=="kyu_tsuki_mode")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
									}
									if (this.get_effect(armor)==2)
									{
										if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) < 1000)
										{
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
		return SentaiItems60.blank_kyutama == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_sentai_changer)
			{
				String rider = ((item_seiza_blaster)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
				if (num==1||num==2||num==5||num==7||num==3||num==6||num==8)
				{
					if (rider == "hebitsukai_metal_evil")
					{
						return Refercence.MODID+":textures/armor/"+rider+ext;
					}
					else if (rider == "hebitsukai_silver")
					{
						return Refercence.MODID+":textures/armor/"+HebitsukaiSilver[item_seiza_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (rider == "oushi_black")
					{
						return Refercence.MODID+":textures/armor/"+OushiBlack[item_seiza_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (rider == "ryu_commander")
					{
						return Refercence.MODID+":textures/armor/"+RyuCommander[item_seiza_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else if (rider == "dark_shishi_red")
					{
						return Refercence.MODID+":textures/armor/"+rider+DarkShishiRed[item_seiza_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					else
					{
						return Refercence.MODID+":textures/armor/"+rider+Kyuranger[item_seiza_blaster.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					if (item_seiza_blaster.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kyu_pegasus")
					{
						return Refercence.MODID+":textures/armor/"+item_seiza_blaster.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+ext;
					}
					else if (item_seiza_blaster.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="kyu_pegasus")
					{
						if (num==4)
						{
							return "blank";
						}
						else 
						{
							return Refercence.MODID+":textures/armor/"+item_seiza_blaster.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
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
		else
		{
			return "blank";
		}
	}
}