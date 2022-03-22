package SS_Craft.item.lupatranger;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.ryusoulger.item_ryusoul;
import SS_Craft.model.model_belt;
import SS_Craft.model.model_belt_plus;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_vs_changer extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_vs_changer (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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
				
				armorModel.belt=new ItemStack(SentaiItems60.lupat_belt);
				
				if (item_vs_changer.get_lock(stack)=="lupin_scissor")
				{
					if (living.getHeldItem(EnumHand.OFF_HAND).getItem()==SentaiItems60.blade_boomerang || living.getHeldItem(EnumHand.MAIN_HAND).getItem()==SentaiItems60.blade_boomerang)
					{
						armorModel.wings=new ItemStack(SentaiItems20.blanknoitem);
					}
					else
					{
						armorModel.wings=new ItemStack(SentaiItems60.blade_boomerang_wing);
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
		return itemstack.hasTagCompound() ? item_vs_vehicle.ARMOR[itemstack.getTagCompound().getInteger("armor")] : "blank";
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("armor", flag);
	}
	
	public static String get_soul(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? item_ryusoul.ARMOR[itemstack.getTagCompound().getInteger("soul")] : "blank";
	}
	
	public static void set_soul(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("soul", flag);
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == SentaiItems60.lupat_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == SentaiItems60.lupat_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == SentaiItems60.lupat_head)
								{
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.red_vs_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.blue_vs_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.yellow_vs_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.lupin_x_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.ichigou_vs_changer || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.ichigou_girl_vs_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 1,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.nigou_vs_changer || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.nigou_girl_vs_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 1,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.sangou_vs_changer || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.sangou_guy_vs_changer)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 1,true,false));
									}
									if (this.get_core(armor)==1)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 1,true,false));
									}
									if (this.get_lock(armor)=="lupin_tricolor")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
									}
									if (this.get_lock(armor)=="patran_ugou")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 1,true,false));
									}
									if (this.get_lock(armor)=="lupin_scissor")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
										player.removePotionEffect(MobEffects.SPEED);
									}
									if (this.get_lock(armor)=="pat_crane")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
									}
									if (this.get_lock(armor)=="lupin_magic")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
									}
									if (this.get_lock(armor)=="pat_splash")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 2,true,false));
									}
									if (this.get_lock(armor)=="victory")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 2,true,false));
									}
									if (this.get_lock(armor)=="pat_siren")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_tsuyo_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_nobi_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20 , 1,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_omo_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20 , 1,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_haya_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_kata_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20 , 1,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_kusa_soul")
									{
										player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
										player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+1, player.posZ, 0.0D, 0.0D, 0.0D);
										player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+0.5, player.posZ, 0.0D, 0.0D, 0.0D);
									}
									if(this.get_soul(armor)=="ryusoul_mie_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20 , 3,true,false));
									}
									
									if(this.get_soul(armor)=="ryusoul_mukimuki_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_mist_soul")
									{
										player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
										player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+1, player.posZ, 0.0D, 0.0D, 0.0D);
										player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+0.5, player.posZ, 0.0D, 0.0D, 0.0D);
									}
									if(this.get_soul(armor)=="ryusoul_karu_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_gyaku_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20 , 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_migake_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_kunkun_soul")
									{
										
									}
									if(this.get_soul(armor)=="ryusoul_pukupuku_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_kakure_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_mawari_soul")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 20 , 3,true,false));
									}
									if(this.get_soul(armor)=="ryusoul_nemu_soul")
									{
										if (player.isSneaking())
										{
											world.setWorldTime(6000);
										}
									}
									if(this.get_soul(armor)=="ryusoul_kawaki_soul")
									{
										if (player.onGround)
								        {
											BlockPos pos = player.getPosition();
								            float f = (float)Math.min(16, 2);
								            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos(0, 0, 0);

								            for (BlockPos.MutableBlockPos blockpos$mutableblockpos1 : BlockPos.getAllInBoxMutable(pos.add((double)(-f), -1.0D, (double)(-f)), pos.add((double)f, -1.0D, (double)f)))
								            {
								                if (blockpos$mutableblockpos1.distanceSqToCenter(player.posX, player.posY, player.posZ) <= (double)(f * f))
								                {
								                    blockpos$mutableblockpos.setPos(blockpos$mutableblockpos1.getX(), blockpos$mutableblockpos1.getY() + 1, blockpos$mutableblockpos1.getZ());
								                    IBlockState iblockstate = world.getBlockState(blockpos$mutableblockpos);

								                    if (iblockstate.getMaterial() == Material.AIR)
								                    {
								                        IBlockState iblockstate1 = world.getBlockState(blockpos$mutableblockpos1);

								                        if (iblockstate1.getMaterial() == Material.WATER && (iblockstate1.getBlock() == net.minecraft.init.Blocks.WATER || iblockstate1.getBlock() == net.minecraft.init.Blocks.FLOWING_WATER) && ((Integer)iblockstate1.getValue(BlockLiquid.LEVEL)).intValue() == 0 && world.mayPlace(Blocks.AIR, blockpos$mutableblockpos1, false, EnumFacing.DOWN, (Entity)null))
								                        {
								                            world.setBlockState(blockpos$mutableblockpos1, Blocks.AIR.getDefaultState());
								                            world.scheduleUpdate(blockpos$mutableblockpos1.toImmutable(), Blocks.AIR, MathHelper.getInt(player.getRNG(), 60, 120));
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
		return SentaiItems60.blank_striker == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}