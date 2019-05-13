package SS_Craft.item;



import java.util.Vector;

import javax.annotation.Nullable;

import com.google.common.collect.Multimap;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.carranger.item_accel_changer;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_gun extends ItemBow  implements IHasModel
{
	 private final float attackDamage;
	    private final Item.ToolMaterial material;

	
	public Item_gun(String name,ToolMaterial par2EnumToolMaterial)
	{
		super();
		this.material = par2EnumToolMaterial;
		 this.attackDamage = 3.0F + material.getAttackDamage();
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		
		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
			@SideOnly(Side.CLIENT)
	           public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	           {
					if (stack.getItem() == RiderItems.vs_changer)
					{
						if (entityIn == null)
		                {
		                    return 0.0F;
		                }
						else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vs_changer)
							{
								if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "lupin_tricolor")
									return 7;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "patran_ugou")
									return 8;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "lupin_scissor")
									return 9;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "pat_crane")
									return 10;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "lupin_magic")
									return 11;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "pat_splash")
									return 12;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "victory")
									return 13;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "pat_siren")
									return 14;
								else if (item_vs_changer.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "blank")
								{
									if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.red_vs_changer && item_vs_changer.get_lock(stack) == "blank")
										return 1;
									else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.blue_vs_changer && item_vs_changer.get_lock(stack) == "blank")
										return 2;
									else 	if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.yellow_vs_changer && item_vs_changer.get_lock(stack) == "blank")
										return 3;
									else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ichigou_vs_changer && item_vs_changer.get_lock(stack) == "blank")
										return 4;
									else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nigou_vs_changer && item_vs_changer.get_lock(stack) == "blank")
										return 5;
									else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sangou_vs_changer && item_vs_changer.get_lock(stack) == "blank")
										return 6;
								}
							}
							else
							{
								return 0;
							}
						
							return 0;
						}
					
						return 0;
					}
					if (stack.getItem() == RiderItems.seiza_blaster)
	        		{

	        			if (entityIn == null)
		                {
		                    return 0.0F;
		                }
	        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_seiza_blaster)
							{
								if (item_seiza_blaster.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "blank")
								{	
									if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.orange_seiza_blaster)
										return 2;
								}
								if (item_seiza_blaster.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "kyu_ikkakuju_arm")
									return 11;
							}
							else
							{
								return 0;
							}
							
							return 0;
						}
						
						return 0;
		            }
	        		if (stack.getItem() == RiderItems.x_changer)
					{
						if (entityIn == null)
		                {
		                    return 0.0F;
		                }
						else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_vs_changer)
							{
								if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.patran_x_changer)
								{
									return 1;
								}
							}
							else
							{
								return 0;
							}
							
							return 0;
						}
						
						return 0;
					}
	        		if (stack.getItem() == RiderItems.beast_attack_rod_red || stack.getItem() == RiderItems.beast_attack_rod_blue || stack.getItem() == RiderItems.beast_attack_rod_yellow || stack.getItem() == RiderItems.beast_attack_rod_pink || stack.getItem() == RiderItems.beast_attack_rod_green)
	        		{
	        			if (entityIn == null)
		                {
		                    return 0.0F;
		                }
	        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ginga_brace)
							{
								if (item_ginga_brace.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == "beast_armor_shine")
									return 1;
							}
							else
							{
								return 0;
							}
							
							return 0;
						}
						
						return 0;
		            }
					return 0;
			}
		});
	}
	

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.BOW;
	}

	

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_masking_brace)
			{
				if (this==RiderItems.laser_magnum_gun)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.laser_magnum_gun, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.laser_magnum_sword));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_turbo_brace)
			{
				if (this==RiderItems.turbo_laser_gun)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.turbo_laser_gun, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.turbo_laser_sword));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_accel_changer)
			{
				if (this==RiderItems.auto_blaster)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.auto_blaster, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.auto_punisher));
					}
				}
				else if (this==RiderItems.auto_punisher)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.auto_punisher, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.auto_blaster));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ginga_brace)
			{
				if (this==RiderItems.bull_riot_gun)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.bull_riot_gun, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.bull_riot));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_g_phone)
			{
				if (this == RiderItems.gao_mane_buster)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.gao_mane_buster, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.gao_mane_buster_final));
					}
				}
				else if (this == RiderItems.gao_mane_buster_final)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.gao_mane_buster_final, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.gao_mane_buster));
					}
				}
				else if (this == RiderItems.falcon_summoner)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.falcon_summoner, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.falcon_summoner_arrow));
					}
				}
				else if (this == RiderItems.falcon_summoner_arrow)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.falcon_summoner_arrow, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.falcon_summoner));
					}
				}
			}
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_accellular)
			{
				if (this==RiderItems.dual_crusher_mixer)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.dual_crusher_mixer, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.dual_crusher_drill));
					}
				}
				else if (this==RiderItems.dual_crusher_drill)
				{
					if (playerIn.isSneaking())
					{
						playerIn.inventory.clearMatchingItems(RiderItems.dual_crusher_drill, 0, 1, null);
						playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(RiderItems.dual_crusher_mixer));
					}
				}
			}
		}
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		boolean flag = true;

		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
		if (ret != null) return ret;

		if (!playerIn.capabilities.isCreativeMode && !flag)
		{
			return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
		}
		else
		{
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}

	
	/**
	 * Called when the player stops using an Item (stops holding the right mouse button).
	 */
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
	{
		if (entityLiving instanceof EntityPlayer)
		{
			 EntityPlayer playerIn = (EntityPlayer)entityLiving;

			if (!worldIn.isRemote)
			{
					Vec3d look =  playerIn.getLookVec();
					ItemArrow itemarrow = (ItemArrow) Items.ARROW;
					EntityArrow fireball = itemarrow.createArrow(worldIn, new ItemStack(Items.ARROW), playerIn);
					fireball.setPosition(playerIn.posX + look.x * 1.6,playerIn.posY + 1,playerIn.posZ + look.z * 1.6);
					fireball.motionX = look.x*3;
					fireball.motionY = look.y*3;
					fireball.motionZ = look.z*3;
					fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
					worldIn.spawnEntity(fireball);
					if (! playerIn.capabilities.isCreativeMode){
					
				}
			}

			playerIn.addStat(StatList.getObjectUseStats(this));
		}
	}

    /**
     * Returns the amount of damage this item will deal. One heart of damage is equal to 2 damage points.
     */
    public float getAttackDamage()
    {
        return this.material.getAttackDamage();
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.WEB)
        {
            return 15.0F;
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }

    /**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        if ((double)state.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(2, entityLiving);
        }

        return true;
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return blockIn.getBlock() == Blocks.WEB;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return this.material.getEnchantability();
    }

    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName()
    {
        return this.material.toString();
    }

    /**
     * Return whether this item is repairable in an anvil.
     *  
     * @param toRepair the {@code ItemStack} being repaired
     * @param repair the {@code ItemStack} being used to perform the repair
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = this.material.getRepairItemStack();
        if (!mat.isEmpty() && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
        }

        return multimap;
    }
}