package SS_Craft.item.go_onger.mecha;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.shinkenger.item_secret_disk;
import SS_Craft.model.BipedLockseed;
import SS_Craft.model.model_belt;
import SS_Craft.model.tokuArmorModel;
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
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_go_onger_mecha extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_go_onger_mecha (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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
				model_belt armorModel = new model_belt();
				
				armorModel.belt=new ItemStack(RiderItems.blanknoitem);
				
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
	
	public static String get_right(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? item_engine_soul.RIGHT[itemstack.getTagCompound().getInteger("right")] : "blank";
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
		return itemstack.hasTagCompound() ? item_engine_soul.LEFT[itemstack.getTagCompound().getInteger("left")] : "blank";
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.engine_oh_legs)
						{
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.engine_oh_torso)
							{
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.engine_oh_boots)
								{
									if (this.get_left(armor)=="birca"|this.get_right(armor)=="birca")
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 3,true,false));
									}
									if (this.get_left(armor)=="gunpherd"|this.get_right(armor)=="gunpherd")
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 3,true,false));
										
										if (player.isSneaking())
										{
											if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2)
											{
												Vec3d look = player.getLookVec();
												ItemArrow itemarrow = (ItemArrow) Items.ARROW;
												EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
												fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
												fireball.motionX = look.x*3;
												fireball.motionY = look.y*3;
												fireball.motionZ = look.z*3;
												world.spawnEntity(fireball);
												this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}	
										}
									}
									if (this.get_right(armor)=="toripter")
									{
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 4,true,false));
									}
									if (this.get_left(armor)=="jetras")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
									}
									if (this.get_right(armor)=="t_line")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 5,true,false));
									}
									if (this.get_left(armor)=="k_line")
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.engine_oh_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.gunbir_oh_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));

										if (this.get_left(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 3,true,false));
										}
										if (this.get_right(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 3,true,false));
											
											if (player.isSneaking())
											{
												if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2)
												{
													Vec3d look = player.getLookVec();
													ItemArrow itemarrow = (ItemArrow) Items.ARROW;
													EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
													fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
													fireball.motionX = look.x*3;
													fireball.motionY = look.y*3;
													fireball.motionZ = look.z*3;
													world.spawnEntity(fireball);
													this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}	
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.engine_oh_g6_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 3,true,false));
										
										if (player.isSneaking())
										{
											if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2)
											{
												Vec3d look = player.getLookVec();
												ItemArrow itemarrow = (ItemArrow) Items.ARROW;
												EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
												fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
												fireball.motionX = look.x*3;
												fireball.motionY = look.y*3;
												fireball.motionZ = look.z*3;
												world.spawnEntity(fireball);
												this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}	
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.seikuu_oh_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 3,true,false));
										
										if (this.get_right(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 4,true,false));
										}
										if (this.get_left(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.engine_oh_g9_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										
										if (player.isSneaking())
										{
											if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2)
											{
												Vec3d look = player.getLookVec();
												ItemArrow itemarrow = (ItemArrow) Items.ARROW;
												EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
												fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
												fireball.motionX = look.x*3;
												fireball.motionY = look.y*3;
												fireball.motionZ = look.z*3;
												world.spawnEntity(fireball);
												this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}	
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.kyoretsu_oh_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
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
								                            world.setBlockState(blockpos$mutableblockpos1, Blocks.ICE.getDefaultState());
								                            world.scheduleUpdate(blockpos$mutableblockpos1.toImmutable(), Blocks.AIR, MathHelper.getInt(player.getRNG(), 60, 120));
								                        }
								                    }
								                }
								            }
								        }
										
										if (this.get_right(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 5,true,false));
										}
										if (this.get_left(armor)=="blank")
										{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.engine_oh_g12_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 5,true,false));
										
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
								                            world.setBlockState(blockpos$mutableblockpos1, Blocks.ICE.getDefaultState());
								                            world.scheduleUpdate(blockpos$mutableblockpos1.toImmutable(), Blocks.AIR, MathHelper.getInt(player.getRNG(), 60, 120));
								                        }
								                    }
								                }
								            }
								        }
										if (player.isSneaking())
										{
											if (this.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2)
											{
												Vec3d look = player.getLookVec();
												ItemArrow itemarrow = (ItemArrow) Items.ARROW;
												EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
												fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
												fireball.motionX = look.x*3;
												fireball.motionY = look.y*3;
												fireball.motionZ = look.z*3;
												world.spawnEntity(fireball);
												this.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
											}	
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.engine_daishogun_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 5,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST,20, 3,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.skydor_engine_oh_head)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));

										player.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION,20, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 3,true,false));
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
		return RiderItems.mecha_gear == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}