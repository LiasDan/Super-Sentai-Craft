package SS_Craft.item.zyuohger;

import java.util.Vector;

import javax.annotation.Nullable;

import com.google.common.collect.Multimap;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.carranger.item_accel_changer;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gekiranger.item_geki_changer;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import SS_Craft.potion.PotionCore;
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
import net.minecraft.entity.effect.EntityLightningBolt;
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
import net.minecraft.potion.PotionEffect;
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

public class item_whale_change_gun extends ItemBow  implements IHasModel
{
	 private final float attackDamage;
	    private final Item.ToolMaterial material;

	
	public item_whale_change_gun(String name,ToolMaterial par2EnumToolMaterial)
	{
		super();
		this.material = par2EnumToolMaterial;
		 this.attackDamage = 3.0F + material.getAttackDamage();
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		
		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
			@SideOnly(Side.CLIENT)
	           public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	           {
					if (stack.getItem() == SentaiItems40.whale_change_gun)
					{
						if (entityIn == null)
		                {
		                    return 0.0F;
		                }
	        			else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zyuoh_changer)
							{
								if (item_zyuoh_changer.get_core(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 2)
									return 1;
								if (item_zyuoh_changer.get_core(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)) == 3)
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
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems40.eagle_zyuoh_changer)
			{	
				if (this==SentaiItems40.whale_change_gun)
				{
					if (playerIn.isSneaking()&&item_zyuoh_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=2)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 2);
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}
					else if (playerIn.isSneaking()&&item_zyuoh_changer.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==2)
					{
						item_zyuoh_changer.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
						item_zyuoh_changer.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
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
					fireball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 1.0F);
					fireball.motionX = look.x*3;
					fireball.motionY = look.y*3;
					fireball.motionZ = look.z*3;
					fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
					
					if (playerIn.isPotionActive(PotionCore.SS_FIRE_SLASH))
					{
						fireball.setFire(100);
					}
					if (playerIn.isPotionActive(PotionCore.SS_SHOT_BOOST))
					{
						fireball.setKnockbackStrength(3);
					}
					
					int K = (int) this.attackDamage;
					fireball.setDamage(fireball.getDamage() + (double)K * 0.5D + 0.5D);
					fireball.setKnockbackStrength(K);
					
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
		return SentaiItems40.king_s_credential == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
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