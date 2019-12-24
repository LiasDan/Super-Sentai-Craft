package SS_Craft.item.gokaiger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.lupatranger.item_vs_vehicle;
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

public class item_mobirates extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_mobirates (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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
				
				Item[] form= new Item[] {RiderItems.gokaiger_belt,RiderItems.akaranger_belt,RiderItems.jakq_belt,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.vul_eagle_belt,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.carranger_belt,RiderItems.blanknoitem,RiderItems.gingaman_logo,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.gaoranger_belt,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.shinkenger_belt,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem};
				
				armorModel.belt=new ItemStack(form[item_mobirates.get_core(stack)]);
				
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
		return itemstack.hasTagCompound() ? item_ranger_key.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.kawarimono_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.kawarimono_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.kawarimono_head)
								{
									Potion FLY = Potion.getPotionFromResourceLocation("tokuPotions"+ ":" + "fly");
									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.red_mobirates)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										
										if (this.get_core(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										}
										else if (this.get_core(armor)==1)
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
										else if (this.get_core(armor)==2)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, true, false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										}
										else if (this.get_core(armor)==5)
										{
											player.addPotionEffect(new PotionEffect(FLY,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 2,true,false));
										}
										else if (this.get_core(armor)==11)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										}
										else if (this.get_core(armor)==20)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 3,true,false));
										}
										else if (this.get_core(armor)==22)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 20, 2,true,false));
										}
										else if (this.get_core(armor)==25)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										}
										else if (this.get_core(armor)==33)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2, true, false));
										}
										else if (this.get_core(armor)==38)
										{
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, true, false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false));
										}
									}
									if (this.get_lock(armor)=="gokai_gold_mode")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 3,true,false));
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
}