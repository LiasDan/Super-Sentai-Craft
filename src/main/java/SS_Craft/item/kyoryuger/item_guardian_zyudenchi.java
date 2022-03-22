package SS_Craft.item.kyoryuger;

import java.util.List;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.blocks.zyudenchi_charger;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyoryuger;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.bikes.EntityBikeBase;
import SS_Craft.mobs.bikes.entity_deinochaser;
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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class item_guardian_zyudenchi extends Item implements IHasModel
{
	public int num;
	
	public item_guardian_zyudenchi(int effect,String name)
	{
		super();
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
		this.setMaxDamage(0);

		num=effect;
	}
	
	public item_guardian_zyudenchi(String name)
	{
		super();
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
		this.setMaxDamage(0);
	}

	public item_guardian_zyudenchi AddToKyoryugerZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.kyoryuger.add(this);
		}
		return this;
	}

	public item_guardian_zyudenchi AddToDebothZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.deboth.add(this);
		}
		return this;
	}

	public item_guardian_zyudenchi AddToBraveZyudenchi(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			zyudenchi_charger.brave.add(this);
		}
		return this;
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_gaburivolver)
			{
				if ((this.get_ammo(par1ItemStack)==100))
				{
					if (num == 1)
					{
						entity_deinochaser bike = new entity_deinochaser(worldIn);
						
						bike.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						worldIn.spawnEntity(bike);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 2)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 1000, 2,true,false));
					}
					if (num == 3)
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_FIRE_SLASH, 1000, 0,true,false));
					}
					if (num == 4)
					{
						playerIn.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,playerIn.posX,playerIn.posY, playerIn.posZ, 0.0D, 0.0D, 0.0D);
						playerIn.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,playerIn.posX,playerIn.posY+1, playerIn.posZ, 0.0D, 0.0D, 0.0D);
						playerIn.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,playerIn.posX,playerIn.posY+0.5, playerIn.posZ, 0.0D, 0.0D, 0.0D);
					}
					if (num == 5)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 1000, 2,true,false));
					}
					if (num == 6)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 1000, 2,true,false));
					}
					if (num == 7)
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SLASH_BOOST, 1000, 2,true,false));
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_SHOT_BOOST, 1000, 2,true,false));
					}
					if (num == 8)
					{
						entity_kyoryuger kyoryuger = new entity_kyoryuger(worldIn);

						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.black_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.green_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.pink_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.cyan_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.grey_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.violet_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.gaburicalibur));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gold_gaburichanger
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_gaburichanger)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.zandar_thunder));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburichanger));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.silver_giga_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.silver_giga_gaburivolver));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.feather_edge));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.giga_gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.cyan_spirit_zyudenchi
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.grey_spirit_zyudenchi)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.death_flute_buster)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.death_flute_buster));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.flute_buster));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_red_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.future_red_gaburivolver));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.gabutyra_fang));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_black_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.future_black_gaburivolver));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.parasa_shot));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_blue_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.future_blue_gaburivolver));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.stego_shield));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_green_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.future_green_gaburivolver));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.zakutor_slasher));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.future_pink_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.future_pink_gaburivolver));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.drice_lance));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.red_gabu_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.black_gabu_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.blue_gabu_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.green_gabu_gaburivolver
								|| playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.pink_gabu_gaburivolver)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.gabu_gabucalibur));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gabu_gaburivolver));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.gold_gabu_gabuchanger)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.gold_gabu_gabuchanger));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.zandar_thunder));
							kyoryuger.replaceItemInInventory(99,new ItemStack(SentaiItems40.gabu_gabuchanger));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.chaos_stone)
						{
							kyoryuger.replaceItemInInventory(100,new ItemStack(SentaiItems40.chaos_stone));
							kyoryuger.replaceItemInInventory(98,new ItemStack(SentaiItems40.chaos_calibur));
							
							kyoryuger.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
							worldIn.spawnEntity(kyoryuger);
						}
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
					if (num == 9)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 5,true,false));
					}
					if (num == 10)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 1000, 2,true,false));
					}
					if (num == 11)
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_FLY_POTION, 1000, 2,true,false));
					}
					if (num == 12)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 10,true,false));
					}
					if (num == 13)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.POISON, 1000, 2,true,false));
					}
					if (num == 14)
					{
						playerIn.addPotionEffect(new PotionEffect(PotionCore.SS_PUNCH_BOOST, 1000, 5,true,false));
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
		tooltip.add(TextFormatting.BLUE + "Brave: "+ get_ammo(stack)+"%");
		//tooltip.add(TextFormatting.RED + "");
		if (GuiScreen.isShiftKeyDown())
		{
			if (num == 1)
			{
				tooltip.add(TextFormatting.YELLOW + "Summons DeinoChaser bike.");
			}
			if (num == 2)
			{
				tooltip.add(TextFormatting.DARK_PURPLE + "Gives the user Saturation.");
			}
			if (num == 3)
			{
				tooltip.add(TextFormatting.DARK_RED + "Allows to user to shoot flaming arrows.");
			}
			if (num == 4)
			{
				tooltip.add(TextFormatting.RED + "Summons smokes.");
			}
			if (num == 5)
			{
				tooltip.add(TextFormatting.YELLOW + "Makes the user dizzy.");
			}
			if (num == 6)
			{
				tooltip.add(TextFormatting.AQUA + "Gives the user Slowness.");
			}
			if (num == 7)
			{
				tooltip.add(TextFormatting.RED + "Enhances the user weapons's knockback");
			}
			if (num == 8)
			{
				tooltip.add(TextFormatting.GRAY + "Summons a copy of the user.");
			}
			if (num == 9)
			{
				tooltip.add(TextFormatting.GREEN + "Enhances the user's speed.");
			}
			if (num == 10)
			{
				tooltip.add(TextFormatting.DARK_BLUE + "Turns the user invisible.");
			}
			if (num == 11)
			{
				tooltip.add(TextFormatting.AQUA + "Gives the user the ability to fly.");
			}
			if (num == 12)
			{
				tooltip.add(TextFormatting.DARK_GRAY + "Enhances the user's defence.");
			}
			if (num == 13)
			{
				tooltip.add(TextFormatting.RED + "Poisons the user.");
			}
			if (num == 14)
			{
				tooltip.add(TextFormatting.YELLOW + "Enchances the user's attacks.");
			}
		}
		else tooltip.add(TextFormatting.UNDERLINE+"<<Shift for more info>>");
	}
}