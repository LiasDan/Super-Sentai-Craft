package SS_Craft.item.akibaranger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.boukenger.item_bouken_spirit;
import SS_Craft.item.dekaranger.item_sp_license;
import SS_Craft.item.sentai_armor_base.item_form_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.item.zyuranger.item_dino_medal;
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

public class item_moe_moe_z_cune extends item_sentai_changer
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public static String[] ARMOR= new String[] {"blank","_super"};

	public item_moe_moe_z_cune (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name, par2EnumArmorMaterial,4,rider,(item_form_changer)SentaiItems20.blanknoform,SentaiItems40.akibaranger_head, SentaiItems40.akibaranger_torso, SentaiItems40.akibaranger_legs, SentaiItems40.akibaranger_logo);
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
				
				if (this == SentaiItems40.china_aura_changer || this == SentaiItems40.akiba_changer)
				{
					armorModel.belt=new ItemStack(SentaiItems20.dairanger_belt);
				}
				else if (this == SentaiItems40.red_dino_buckler || this == SentaiItems40.green_dino_buckler)
				{
					armorModel.belt=stack;
				}
				else
				{
					armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
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
		item_moe_moe_z_cune belt = (item_moe_moe_z_cune)itemstack.getItem();

		return itemstack.hasTagCompound() ? item_moe_moe_z_cune.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.akibaranger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.akibaranger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.akibaranger_head)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_moe_moe_z_cune)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_moe_moe_z_cune)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_s2_moe_moe_z_cune)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.yellow_moe_moe_z_cune)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.yellow_s2_moe_moe_z_cune)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.china_aura_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FIRE_PUNCH,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.akiba_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FIRE_PUNCH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_dino_buckler)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.green_dino_buckler)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
									}
									if (this.get_core(armor)==1)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
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
	
	public String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_sentai_changer)
			{
				String rider = ((item_moe_moe_z_cune)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
				if (num==1||num==2||num==5||num==7||num==3||num==6||num==8)
				{
					return Refercence.MODID+":textures/armor/"+rider+ext;
				}
				else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14)
				{
					if (rider=="akiba_white")
					{
						return Refercence.MODID+":textures/armor/"+rider+"_base"+ext;
					}
					if (rider=="green_powerful_ranger")
					{
						return Refercence.MODID+":textures/armor/zyu_full_dragon_shield"+ext;
					}
					if (item_moe_moe_z_cune.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 1)
					{
						return Refercence.MODID+":textures/armor/"+rider+"_super"+ext;
					}
					if (item_moe_moe_z_cune.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 0)
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