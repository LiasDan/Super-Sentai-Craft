package SS_Craft.item.kyuranger;

import java.util.List;

import javax.annotation.Nullable;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.bikes.EntityBikeBase;
import SS_Craft.mobs.bikes.entity_garu_bike;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class item_skill_kyutama extends Item implements IHasModel
{
	public int num;
	
	public item_skill_kyutama(int effect,String name)
	{
		super();
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
		this.setMaxDamage(0);

		num=effect;
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==100){
			return true;
		}else{
			return !true;
		}
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			ItemStack par1ItemStack= playerIn.getHeldItem(handIn);
			
			if (!worldIn.isRemote) {
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_seiza_blaster)
			{
				if ((this.get_ammo(par1ItemStack)==100))
				{
					if (num == 1)
					{
						worldIn.setWorldTime(worldIn.getWorldTime()*2);
					}
					if (num == 2)
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.black_seiza_blaster)
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 4,true,false));
						}
						else
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 2,true,false));
						}
					}
					if (num == 3)
					{
						playerIn.dropItem(Items.WATER_BUCKET, 1);
					}
					if (num == 4)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 2,true,false));
					}
					if (num == 5)
					{
						playerIn.dropItem(Items.MAP, 1);
					}
					if (num == 6)
					{
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sky_blue_seiza_blaster)
						{
							playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_BIG, 1000, 0,true,false));
							playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 2,true,false));
							playerIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 1000, 2,true,false));
						}
					}
					if (num == 7)
					{
						playerIn.dropItem(Items.FISH, 1);
					}
					if (num == 8)
					{
						playerIn.dropItem(Items.SHIELD, 1);
					}
					if (num == 9)
					{
						entity_kyuranger kyuranger  = new entity_kyuranger(worldIn);

						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.red_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.red_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_sword));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.blue_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.blue_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_claw));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.orange_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.orange_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_spear));
				    		kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gold_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.gold_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_crossbow));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							kyuranger.tasks.removeTask(kyuranger.aiAttackMelee);
							kyuranger.tasks.addTask(2, kyuranger.aiArrowAttack);
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.black_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.black_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_axe));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.silver_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.silver_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_sickle));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.green_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.green_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_rapier));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.pink_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.pink_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_shot));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							kyuranger.tasks.removeTask(kyuranger.aiAttackMelee);
							kyuranger.tasks.addTask(2, kyuranger.aiArrowAttack);
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.yellow_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.yellow_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_slasher));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.commander_ryutsueder)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.commander_ryutsueder));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.ryutsueder));
							kyuranger.replaceItemInInventory(99,null);
							kyuranger.tasks.addTask(2, kyuranger.aiArrowAttack);
							kyuranger.tasks.addTask(3, kyuranger.aiAttackOnCollide);
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sky_blue_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.sky_blue_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_spear));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.houou_blade_shield)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.houou_blade_shield));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.houou_blade));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.houou_shield));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.metal_dark_seiza_blaster)
						{
							kyuranger.replaceItemInInventory(100,new ItemStack(RiderItems.metal_dark_seiza_blaster));
							kyuranger.replaceItemInInventory(98,new ItemStack(RiderItems.dark_kyu_sickle));
							kyuranger.replaceItemInInventory(99,new ItemStack(RiderItems.dark_seiza_blaster));
							
							kyuranger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyuranger);
						}
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 10)
					{
						playerIn.trySleep(new BlockPos(playerIn.posX, playerIn.posY, playerIn.posZ));
						if (playerIn.isPlayerSleeping())
						{
							worldIn.setWorldTime(1000);
						}
					}
					if (num == 11)
					{
						Vec3d look = playerIn.getLookVec();

						int par4 = (int) (playerIn.posX + look.x * 3);
						int par5 = (int) (playerIn.posY);
						int par6 = (int) (playerIn.posZ + look.z * 3);
						int Xice;
						int Yice;
						int Zice;
						
						net.minecraft.block.Block type = Blocks.WATER;
						
						if (!worldIn.isRemote)
						{
							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
						}
					}
					if (num == 12)
					{
						playerIn.dropItem(Items.GOLDEN_HELMET, 1);
					}
					if (num == 13)
					{
						EntityHorse horse = new EntityHorse(worldIn);
						
						horse.setTamedBy(playerIn);
						horse.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(horse);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 14)
					{
						Vec3d look =  playerIn.getLookVec();
						ItemArrow itemarrow = (ItemArrow) Items.ARROW;
						EntityArrow fireball = itemarrow.createArrow(worldIn, new ItemStack(Items.ARROW), playerIn);
						fireball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 1.0F);
						fireball.motionX = look.x*3;
						fireball.motionY = look.y*3;
						fireball.motionZ = look.z*3;
						fireball.setDamage(10);
						fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
						
						worldIn.spawnEntity(fireball);
					}
					if (num == 15)
					{
						Vec3d look = playerIn.getLookVec();

						int par4 = (int) (playerIn.posX + look.x * 3);
						int par5 = (int) (playerIn.posY);
						int par6 = (int) (playerIn.posZ + look.z * 3);
						int Xice;
						int Yice;
						int Zice;
						
						net.minecraft.block.Block type = Blocks.WATER;
						
						if (!worldIn.isRemote)
						{
							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
						}
					}
					if (num == 16)
					{
						playerIn.dropItem(Items.SNOWBALL, 16);
					}
					if (num == 17)
					{
						playerIn.dropItem(Item.getItemFromBlock(Blocks.LADDER), 4);
					}
					if (num == 18)
					{
						Vec3d look = playerIn.getLookVec();

						int par4 = (int) (playerIn.posX + look.x* 3);
						int par5 = (int) (playerIn.posY);
						int par6 = (int) (playerIn.posZ + look.z* 3);
						int Xice;
						int Yice;
						int Zice;
						net.minecraft.block.Block type = Blocks.WEB;

						if (!worldIn.isRemote)
						{
							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (worldIn.isAirBlock(new BlockPos(par4, par5+1, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}
					}
					if (num == 19)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 2,true,false));
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 2,true,false));
					}
					if (num == 20)
					{
						item_seiza_blaster.set_effect(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 2);
						
						if (playerIn.isInWater())
						{
							playerIn.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,1000, 2,true,false));
							playerIn.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,1000, 2,true,false));
						}
					}
					if (num == 21)
					{
						if (!playerIn.isRiding() && !playerIn.isBeingRidden() && playerIn.isNonBoss())
						{
							
						}
						if (playerIn.dimension==0)
						{
							playerIn.changeDimension(1);
						}
						else
						{
							playerIn.changeDimension(0);
						}
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 22)
					{
						Vec3d look = playerIn.getLookVec();

						int par4 = (int) (playerIn.posX + look.x* 3);
						int par5 = (int) (playerIn.posY);
						int par6 = (int) (playerIn.posZ + look.z* 3);
						int Xice;
						int Yice;
						int Zice;
						
						net.minecraft.block.Block type = Blocks.JUKEBOX;
						
						if (!worldIn.isRemote)
						{
							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6)))
							{
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
						}
					}
					if (num == 23)
					{
						EntityParrot parrot = new EntityParrot(worldIn);
						
						parrot.setTamedBy(playerIn);
						parrot.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(parrot);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 24)
					{
						playerIn.dropItem(Items.PAINTING, 1);
					}
					if (num == 25)
					{
						entity_garu_bike bike = new entity_garu_bike(worldIn);
						
						bike.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(bike);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 26)
					{
						playerIn.dropItem(Items.BUCKET, 1);
					}
					if (num == 27)
					{
						EntityWolf wolf = new EntityWolf(worldIn);
						
						wolf.setTamedBy(playerIn);
						wolf.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(wolf);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 28) 
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000, 2,true,false));
					}
					if (num == 29)
					{
						playerIn.dropItem(Items.IRON_PICKAXE, 1);
					}
					if (num == 30)
					{
						EntityEnderPearl entityenderpearl = new EntityEnderPearl(worldIn, playerIn);
						entityenderpearl.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
			            worldIn.spawnEntity(entityenderpearl);
					}
					if (num == 31)
					{
						playerIn.dropItem(RiderItems.rokubungi, 1);
					}
					if (num == 32)
					{
						playerIn.dropItem(RiderItems.hachibungi, 1);
					}
					if (num == 33)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 1000, 2,true,false));
					}
					if (num == 34)
					{
						playerIn.dropItem(Item.getItemFromBlock(Blocks.FURNACE), 1);
					}
					if (num == 35)
					{
						playerIn.dropItem(RiderItems.jyogi, 1);
					}
					if (num == 36)
					{
						playerIn.dropItem(RiderItems.compass_kyu, 1);
					}
					if (num == 37)
					{
						entity_ex_aid ex_aid  = new entity_ex_aid(worldIn);
						
						ex_aid.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(ex_aid);
					}
				}
				this.set_ammo(playerIn.getHeldItem(handIn),0);
			}
			this.set_ammo(playerIn.getHeldItem(handIn),0);
		}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
    
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
	{
		if (entityLiving instanceof EntityPlayer)
		{
			 EntityPlayer playerIn = (EntityPlayer)entityLiving;

			if (!worldIn.isRemote)
			{
				if (num == 14)
				{
					Vec3d look =  playerIn.getLookVec();
					ItemArrow itemarrow = (ItemArrow) Items.ARROW;
					EntityArrow fireball = itemarrow.createArrow(worldIn, new ItemStack(Items.ARROW), playerIn);
					fireball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 1.0F);
					fireball.motionX = look.x*3;
					fireball.motionY = look.y*3;
					fireball.motionZ = look.z*3;
					fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
					
					worldIn.spawnEntity(fireball);
					if (! playerIn.capabilities.isCreativeMode){
					
					}	
					
					fireball.setDamage(fireball.getDamage() + (double)2 * 0.5D + 0.5D);
				}
			}
		}
	}
    
    public static int get_ammo(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("Ammo") : 0;
	}

	public static void set_ammo(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("Ammo", flag);
	}
	
	public void onUpdate(ItemStack par1ItemStack, World worldIn, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<100){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}
	
	/**
     * allows items to add custom lines of information to the mouseover description
     */
	@Override
    @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add(TextFormatting.BLUE + "Kyu Energy: "+ get_ammo(stack)+"%");
		//tooltip.add(TextFormatting.RED + "");
		
		if (GuiScreen.isShiftKeyDown())
		{
			if (num == 1)
			{
				tooltip.add(TextFormatting.RED + "Allows the user to speeds up time.");
			}
			if (num == 2)
			{
				tooltip.add(TextFormatting.GREEN + "Increases the user's speed. When OushiBlack used it, it increases his strength.");
			}
			if (num == 3)
			{
				tooltip.add(TextFormatting.GOLD + "Gives the user a water bucket.");
			}
			if (num == 4)
			{
				tooltip.add(TextFormatting.AQUA + "Enhances the user's physical strength.");
			}
			if (num == 5)
			{
				tooltip.add(TextFormatting.YELLOW + "Gives the user an empty map.");
			}
			if (num == 6)
			{
				tooltip.add(TextFormatting.AQUA + "Used to enlarge Koguma Skyblue into a giant.");
			}
			if (num == 7)
			{
				tooltip.add(TextFormatting.AQUA + "Gives the user a raw fish.");
			}
			if (num == 8)
			{
				tooltip.add(TextFormatting.GREEN + "Gives the user a shield.");
			}
			if (num == 9)
			{
				tooltip.add(TextFormatting.GREEN + "Creates a clone of the user. Usable only once.");
			}
			if (num == 10)
			{
				tooltip.add(TextFormatting.YELLOW + "Allows the user to sleep.");
			}
			if (num == 11)
			{
				tooltip.add(TextFormatting.AQUA + "Places a block of water.");
			}
			if (num == 12)
			{
				tooltip.add(TextFormatting.YELLOW + "Gives the user a golden helmet.");
			}
			if (num == 13)
			{
				tooltip.add(TextFormatting.BLUE + "Summons a tamed horse");
			}
			if (num == 14)
			{
				tooltip.add(TextFormatting.YELLOW + "Shoots a powerful arrow.");
			}
			if (num == 15)
			{
				tooltip.add(TextFormatting.WHITE + "Places a block of water.");
			}
			if (num == 16)
			{
				tooltip.add(TextFormatting.BLUE + "Gives the user a stack of snowball.");
			}
			if (num == 17)
			{
				tooltip.add(TextFormatting.GREEN + "Gives the user some ladders.");
			}
			if (num == 18)
			{
				tooltip.add(TextFormatting.WHITE + "Places two spider web that would make a mob stuck.");
			}
			if (num == 19)
			{
				tooltip.add(TextFormatting.GREEN + "Increases the user's speed and strength.");
			}
			if (num == 20)
			{
				tooltip.add(TextFormatting.GREEN + "Allows the user to swim rapidly by sneaking.");
			}
			if (num == 21)
			{
				tooltip.add(TextFormatting.WHITE + "Allows the user to teleport to The End. Usable only once.");
			}
			if (num == 22)
			{
				tooltip.add(TextFormatting.YELLOW + "Places a jukebox.");
			}
			if (num == 23)
			{
				tooltip.add(TextFormatting.WHITE + "Summons a tamed parrot");
			}
			if (num == 24)
			{
				tooltip.add(TextFormatting.GOLD + "Gives the user a painting.");
			}
			if (num == 25)
			{
				tooltip.add(TextFormatting.YELLOW + "Summons OokamiBlue as a bike.");
			}
			if (num == 26)
			{
				tooltip.add(TextFormatting.AQUA + "Gives the user an empty bucket.");
			}
			if (num == 27)
			{
				tooltip.add(TextFormatting.YELLOW + "Summons a tamed wolf.");
			}
			if (num == 28) 
			{
				tooltip.add(TextFormatting.LIGHT_PURPLE + "Enhances the user's jumping ability.");
			}
			if (num == 29)
			{
				tooltip.add(TextFormatting.LIGHT_PURPLE + "Gives the user an iron pickaxe.");
			}
			if (num == 30)
			{
				tooltip.add(TextFormatting.LIGHT_PURPLE + "Allows the user to teleport by throwing an ender pearl.");
			}
			if (num == 31)
			{
				tooltip.add(TextFormatting.GREEN + "Gives the user a sextant.");
			}
			if (num == 32)
			{
				tooltip.add(TextFormatting.YELLOW + "Gives the user an octant.");
			}
			if (num == 33)
			{
				tooltip.add(TextFormatting.YELLOW + "Turns the user invisible.");
			}
			if (num == 34)
			{
				tooltip.add(TextFormatting.YELLOW + "Gives the user an octant.");
			}
			if (num == 35)
			{
				tooltip.add(TextFormatting.GREEN + "Gives the user a ruler.");
			}
			if (num == 36)
			{
				tooltip.add(TextFormatting.WHITE + "Gives the user a chalkboard compass.");
			}
			if (num == 37)
			{
				tooltip.add(TextFormatting.LIGHT_PURPLE + "Summons Kamen Rider Ex-Aid.");
			}
		}
		else tooltip.add(TextFormatting.UNDERLINE+"<<Shift for more info>>");
	}
}