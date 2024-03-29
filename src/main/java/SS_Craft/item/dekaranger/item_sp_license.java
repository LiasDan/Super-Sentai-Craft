package SS_Craft.item.dekaranger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.go_onger.item_go_phone;
import SS_Craft.item.kirameiger.item_kiramei_changer;
import SS_Craft.item.sentai_armor_base.item_form_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
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
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_sp_license extends item_sentai_changer
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public static final String[] DekaRed= new String[] {"","","_battlizer"};
	
	public item_sp_license (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems40.dekaranger_head, SentaiItems40.dekaranger_torso, SentaiItems40.dekaranger_legs, SentaiItems40.dekaranger_badge);
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
				
				if (this == SentaiItems40.fs_license)
				{
					armorModel.belt=new ItemStack(SentaiItems40.deka_fire_squad_belt);
				}
				else if (this == SentaiItems40.master_license)
				{
					armorModel.belt=new ItemStack(SentaiItems40.deka_master_belt);
				}
				else if (this == SentaiItems40.break_brace_throttle|this == SentaiItems40.bright_brace_throttle)
				{
					armorModel.belt=new ItemStack(SentaiItems40.deka_break_belt);
				}
				else
				{
					armorModel.belt=new ItemStack(SentaiItems40.dekaranger_belt);
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
		String rider = ((item_sp_license)itemstack.getItem()).Rider;
		
		return itemstack.hasTagCompound() ? item_sp_badge.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.dekaranger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.dekaranger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.dekaranger_head)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.fs_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.green_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.yellow_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.pink_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.break_brace_throttle)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.master_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.swan_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.bright_brace_throttle)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gold_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.neo_red_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.neo_yellow_sp_license)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 20, 2,true,false));
									}
									if (this.get_lock(armor) == "swat")
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
									}
									if (this.get_lock(armor) == "battlizer_armor")
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
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
		return SentaiItems40.dekaranger_badge == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_sentai_changer)
			{
				String rider = ((item_sp_license)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
				if (num==1||num==2||num==5||num==7||num==3||num==6||num==8)
				{
					if (rider=="deka_red")
					{
						return Refercence.MODID+":textures/armor/"+rider+DekaRed[item_sp_license.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))]+ext;
					}
					if (rider=="neo_deka_red")
					{
						return Refercence.MODID+":textures/armor/deka_red"+ext;
					}
					if (rider=="neo_deka_yellow")
					{
						return Refercence.MODID+":textures/armor/deka_yellow"+ext;
					}
					else
					{
						return Refercence.MODID+":textures/armor/"+rider+ext;
					}
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					if (rider == "deka_red_fire_squad")
					{
						return Refercence.MODID+":textures/armor/deka_red_fire_squad_armor.png";
					}
					else if (rider == "neo_deka_red")
					{
						return Refercence.MODID+":textures/armor/deka_red_swat"+ext;
					}
					else if (rider == "neo_deka_yellow")
					{
						return Refercence.MODID+":textures/armor/deka_yellow_swat"+ext;
					}
					else if (item_sp_license.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="blank")
					{
						return Refercence.MODID+":textures/armor/"+rider+"_"+item_sp_license.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+ext;
					}
					else if (item_sp_license.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="blank")
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