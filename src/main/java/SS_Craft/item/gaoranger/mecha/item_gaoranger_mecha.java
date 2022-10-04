package SS_Craft.item.gaoranger.mecha;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
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

public class item_gaoranger_mecha extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_gaoranger_mecha (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.HEAD);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.HEAD);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.HEAD));
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
	
	public static String get_right(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? item_gao_jewel.RIGHT[itemstack.getTagCompound().getInteger("right")] : "blank";
	}
	
	public static void set_right(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("right", flag);
	}
	
	public static String get_left(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? item_gao_jewel.LEFT[itemstack.getTagCompound().getInteger("left")] : "blank";
	}
	
	public static void set_left(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("left", flag);
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
										
										if (this.get_core(armor)==1|this.get_core(armor)==4|this.get_core(armor)==7|this.get_core(armor)==10)
										{
											player.removePotionEffect(MobEffects.SLOWNESS);
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										}
										if (this.get_right(armor)=="gao_polar"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="gao_bear")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="gao_giraffe")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="gao_deers")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_muscle_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										if (this.get_core(armor)==1|this.get_core(armor)==4)
										{
											player.removePotionEffect(MobEffects.SLOWNESS);
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										}
										if (this.get_right(armor)=="blank"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="gao_giraffe")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="gao_deers")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
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
										
										if (this.get_right(armor)=="gao_polar"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="gao_bear")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="gao_giraffe")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="gao_deers")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_hunter_blue_moon_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 3,true,false));
										
										if (this.get_right(armor)=="gao_polar"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="gao_bear")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="gao_giraffe")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="gao_deers")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
										}
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

										if (this.get_core(armor)==0)
										{
											player.removePotionEffect(MobEffects.SLOWNESS);
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										}
										if (this.get_right(armor)=="gao_polar"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="gao_bear")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="blank")
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

										if (this.get_core(armor)==2)
										{
											player.removePotionEffect(MobEffects.SLOWNESS);
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										}
										if (this.get_right(armor)=="gao_polar"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="gao_bear")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="gao_giraffe")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="gao_deers")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.gao_knight_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));

										if (this.get_right(armor)=="gao_polar"|this.get_right(armor)=="gao_panda"|this.get_left(armor)=="gao_bear")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 4,true,false));
										}
										if (this.get_right(armor)=="gao_giraffe")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 20, 2,true,false));
										}
										if (this.get_left(armor)=="gao_deers")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 3,true,false));
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
		return SentaiItems20.mecha_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}