package SS_Craft.item.kyoryuger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.blocks.zyudenchi_charger;
import SS_Craft.item.go_onger.mecha.item_engine_soul;
import SS_Craft.item.gokaiger.item_ranger_key;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.item.zyuranger.item_dino_medal;
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
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_gaburivolver extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public String Armor;

	public item_gaburivolver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, String armor)
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

	public item_gaburivolver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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

	public item_gaburivolver AddToKyoryugerZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.kyoryuger.add(this);
		}
		return this;
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
				
				if (this == SentaiItems40.cyan_spirit_zyudenchi | this == SentaiItems40.grey_spirit_zyudenchi)
				{
					armorModel.belt=new ItemStack(SentaiItems40.spirit_mo_buckle);
				}
				else if (this == SentaiItems40.gold_gaburichanger | this == SentaiItems40.gold_gabu_gabuchanger | (this == SentaiItems40.future_gaburichanger & this.get_core(stack)==0))
				{
					armorModel.belt=new ItemStack(SentaiItems40.gold_mo_buckle);
				}
				else if (this == SentaiItems40.chaos_stone)
				{
					armorModel.belt=new ItemStack(SentaiItems20.blanknoitem);
				}
				else
				{
					armorModel.belt=new ItemStack(SentaiItems40.mo_buckle);
				}
				
				if (this == SentaiItems40.silver_giga_gaburivolver)
				{
					if ((living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying)))
					{
						armorModel.wings=new ItemStack(SentaiItems40.kyoryu_silver_wings);
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
		return itemstack.hasTagCompound() ? item_zyudenchi.BOTH[itemstack.getTagCompound().getInteger("armor")] : "blank";
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("armor", flag);
	}
	
	public static String get_right(ItemStack itemstack)
	{	
		item_gaburivolver belt = (item_gaburivolver)itemstack.getItem();

		if (belt.Armor!=null)
		{
			return itemstack.hasTagCompound() ? item_zyudenchi.RIGHT[itemstack.getTagCompound().getInteger("right")] : belt.Armor;
		}
		else 
		{
			return itemstack.hasTagCompound() ? item_zyudenchi.RIGHT[itemstack.getTagCompound().getInteger("right")] : "blank";
		}
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
		return itemstack.hasTagCompound() ? item_zyudenchi.LEFT[itemstack.getTagCompound().getInteger("left")] : "blank";
	}
	
	public static void set_left(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("left", flag);
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems40.kyoryuger_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems40.kyoryuger_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems40.kyoryuger_head)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_gaburivolver
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_gabu_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER,20, 2,true,false));
										}
										if (this.get_core(armor)==4)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HUNGER,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
										}
										if (this.get_core(armor)==5)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 20, 5,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.black_gaburivolver
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.black_gabu_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_gaburivolver
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_gabu_gaburivolver
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_blue_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER,20, 2,true,false));
										}
										if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.green_gaburivolver
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.green_gabu_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.pink_gaburivolver
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.pink_gabu_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gold_gaburichanger
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gold_gabu_gabuchanger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER,20, 2,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.cyan_gaburivolver 
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.cyan_spirit_zyudenchi)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.grey_gaburivolver 
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.grey_spirit_zyudenchi)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.violet_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.silver_giga_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.death_flute_buster
											|| player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.chaos_stone)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_red_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
											player.removePotionEffect(MobEffects.FIRE_RESISTANCE);
										}
										if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 20, 5,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_black_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
											player.removePotionEffect(MobEffects.NIGHT_VISION);
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_green_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 2,true,false));
											player.removePotionEffect(MobEffects.JUMP_BOOST);
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_pink_gaburivolver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
											player.removePotionEffect(MobEffects.SPEED);
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_gaburichanger)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										
										if (this.get_core(armor)==1)
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20, 2,true,false));
											player.removePotionEffect(PotionCore.SS_FLY_POTION);
											player.removePotionEffect(PotionCore.SS_SLASH_BOOST);
										}
									}
									if (this.get_right(armor)=="kyoryu_armed_on" || this.get_right(armor)=="kyoryu_gaburu_armed_on")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 20, 4,true,false));
									}
									if (this.get_lock(armor)=="kyoryu_deinosgrander" || this.get_lock(armor)=="kyoryu_gaburu_armed_on2")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
									}
									if (this.get_right(armor)=="kyoryu_plezuon_rocket")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20, 3,true,false));
									}
									if (this.get_right(armor)=="kyoryu_red_carnival_parasagun")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 5,true,false));
									}
									if (this.get_right(armor)=="kyoryu_red_carnival_stegotchi")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
									}
									if (this.get_left(armor)=="kyoryu_red_carnival_zakutor")
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 5,true,false));
									}
									if (this.get_left(armor)=="kyoryu_red_carnival_dricera")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
									}
									if (this.get_right(armor)=="kyoryu_red_carnival_ankydon")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
									}
									if (this.get_left(armor)=="kyoryu_red_carnival_bunpachy")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 6,true,false));
									}
									if (this.get_right(armor)=="kyoryu_red_carnival_plezuon")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20, 5,true,false));
									}
									if (this.get_left(armor)=="kyoryu_red_carnival_tobaspino")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 5,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 5,true,false));
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
}