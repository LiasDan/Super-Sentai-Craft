package SS_Craft.item.go_busters;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.sentai_armor_base.item_form_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.model.model_belt;
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

public class item_morphin_brace extends item_sentai_changer
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_morphin_brace (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems40.go_busters_head, SentaiItems40.go_busters_torso, SentaiItems40.go_busters_legs, SentaiItems40.enetron);
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
				model_belt armorModel = new model_belt();
				
				armorModel.belt=new ItemStack(SentaiItems40.go_busters_belt);
				
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
		return itemstack.hasTagCompound() ? item_enetron.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.go_busters_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.go_busters_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.go_busters_head)
								{
									if(item_morphin_brace.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100)
									{
										item_morphin_brace.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_morphin_brace.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_morphin_brace || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.cheetah_morphin_brace)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
										
										if (item_morphin_brace.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45)
										{
											if (player.isSneaking())
											{
												Vec3d look = player.getLookVec();
												player.motionX=look.x*5;
												player.motionY=look.y;
												player.motionZ=look.z*5;
												item_morphin_brace.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_morphin_brace || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gorilla_morphin_brace)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.yellow_morphin_brace || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.rabbit_morphin_brace)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										
										if (player.getFoodStats().getFoodLevel()<=5)
										{
											if (player.isCreative()==false)
											{
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 10,true,false));
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.beet_morphin_blaster || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.beetle_morphin_blaster || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.beet_enter_morphin_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.stag_morphin_blaster)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.puma_morphin_brace)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
										
										if (item_morphin_brace.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45)
										{
											if (player.isSneaking())
											{
												Vec3d look = player.getLookVec();
												player.motionX=look.x*5;
												player.motionY=look.y;
												player.motionZ=look.z*5;
												item_morphin_brace.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.hippopotamus_morphin_brace)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
									}
									if (this.get_lock(armor)=="_powered_custom" || this.get_lock(armor)=="_animal_perfect")
									{
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_morphin_brace || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.cheetah_morphin_brace)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 5,true,false));
										}
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_morphin_brace || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gorilla_morphin_brace)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										}
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.yellow_morphin_brace || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.rabbit_morphin_brace)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false));
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
		return SentaiItems40.enetron == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_sentai_changer)
			{
				String rider = ((item_morphin_brace)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
				if (num==1||num==2||num==5||num==7||num==3||num==6||num==8)
				{
					return Refercence.MODID+":textures/armor/"+rider+ext;
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					if (this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="_animal_perfect")
					{
						return Refercence.MODID+":textures/armor/"+rider+this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
					}
					else if (this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="blank")
					{
						return Refercence.MODID+":textures/armor/"+rider+this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+ext;
					}
					else if (this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="blank")
					{
						return "blank";
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