package SS_Craft.mobs.allies;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import SS_Craft.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class entity_kyuranger extends EntityGolem implements IRangedAttackMob
{
	private float field_70926_e;
	private float field_70924_f;
	private int attackTimer;

	/** true is the wolf is wet else false */
	private boolean isShaking;
	private boolean field_70928_h;
	
	 public final EntityAIAttackMelee aiAttackMelee = new EntityAIAttackMelee(this, 1.0D, true);
	public final EntityAIAttackMelee aiAttackOnCollide = new EntityAIAttackMelee(this, 1.2D, false);
	public final EntityAIAttackRanged aiArrowAttack = new EntityAIAttackRanged(this, 1.25D, 20, 10.0F);

	public static Item ItemStack;

	public entity_kyuranger(World par1World)
	{
		super(par1World);

		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.kyuranger_head));
        this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.kyuranger_torso));
        this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.kyuranger_legs));   
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.red_seiza_blaster));
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.kyu_sword));
		this.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,new ItemStack(RiderItems.seiza_blaster));
		
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWander(this, 0.4F));
		this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, RiderItems.seiza_blaster, false));
		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, RiderItems.ryutsueder, false));
		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, RiderItems.houou_blade, false));
		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, RiderItems.houou_shield, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, false, true, new Predicate<EntityLiving>()
        {
            public boolean apply(@Nullable EntityLiving p_apply_1_)
            {
                return p_apply_1_ != null && IMob.VISIBLE_MOB_SELECTOR.apply(p_apply_1_) && !(p_apply_1_ instanceof EntityCreeper);
            }
        }));
	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		
		if (this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()!=null)
		{
		switch (this.rand.nextInt(9999999))
		{
		case 0:
			this.replaceItemInInventory(100,new ItemStack(RiderItems.red_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_sword));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
		case 1:
			this.replaceItemInInventory(100,new ItemStack(RiderItems.blue_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_claw));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
		case 2:
			this.replaceItemInInventory(100,new ItemStack(RiderItems.orange_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_spear));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
		
		case 3:
			this.replaceItemInInventory(100,new ItemStack(RiderItems.gold_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_crossbow));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
    		this.tasks.removeTask(this.aiAttackMelee);
    		this.tasks.addTask(2, this.aiArrowAttack);
			break;
			
		case 4:
			this.replaceItemInInventory(100,new ItemStack(RiderItems.black_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_axe));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
			
		case 5:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.silver_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_sickle));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
			
		case 6:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.green_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_rapier));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
			
		case 7:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.pink_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_shot));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
    		this.tasks.removeTask(this.aiAttackMelee);
    		this.tasks.addTask(2, this.aiArrowAttack);
			break;
			
		case 8:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.yellow_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_slasher));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
			
		case 9:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.commander_ryutsueder));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.ryutsueder));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.blanknoitem));
    		this.tasks.addTask(2, this.aiArrowAttack);
    		this.tasks.addTask(3, this.aiAttackOnCollide);
			break;
			
		case 10:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.sky_blue_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.kyu_spear));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.seiza_blaster));
			break;
			
		case 11:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.houou_blade_shield));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.houou_blade));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.houou_shield));
			break;
			
		case 12:
    		this.replaceItemInInventory(100,new ItemStack(RiderItems.metal_dark_seiza_blaster));
    		this.replaceItemInInventory(98,new ItemStack(RiderItems.dark_kyu_sickle));
    		this.replaceItemInInventory(99,new ItemStack(RiderItems.dark_seiza_blaster));
			break;
		}
		}
	}
	
	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	}

	public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.attackTimer > 0)
        {
            --this.attackTimer;
        }
    }
	
	protected void collideWithEntity(Entity entityIn)
    {
        if (entityIn instanceof IMob && !(entityIn instanceof EntityCreeper) && this.getRNG().nextInt(20) == 0)
        {
            this.setAttackTarget((EntityLivingBase)entityIn);
        }

        super.collideWithEntity(entityIn);
    }

	/**
	 * Determines if an entity can be despawned, used on idle far away entities
	 */
	protected boolean canDespawn()
	{
		return true;
	}


	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	protected float getSoundPitch()
	{
		return 1.5F;
	}
	
	public boolean canAttackClass(Class <? extends EntityLivingBase > cls)
    {
        return cls == EntityCreeper.class ? false : super.canAttackClass(cls);
    }
	
	public boolean attackEntityAsMob(Entity entityIn)
    {
        this.attackTimer = 10;
        this.world.setEntityState(this, (byte)4);
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

        if (flag)
        {
            entityIn.motionY += 0.4000000059604645D;
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.futago_kyutama, 1);

		}

	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) 
	{
		 EntityArrow entityarrow = this.getArrow(distanceFactor);
	     double d0 = target.posX - this.posX;
	     double d1 = target.getEntityBoundingBox().minY + (double)(target.height / 3.0F) - entityarrow.posY;
	     double d2 = target.posZ - this.posZ;
	     double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
	     entityarrow.shoot(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
	     this.playSound(SoundEvents.ENTITY_SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	     this.world.spawnEntity(entityarrow);
	}

    protected EntityArrow getArrow(float p_190726_1_)
    {
        EntityTippedArrow entitytippedarrow = new EntityTippedArrow(this.world, this);
        entitytippedarrow.setEnchantmentEffectsFromEntity(this, p_190726_1_);
        return entitytippedarrow;
    }

	@Override
	public void setSwingingArms(boolean swingingArms) {
		// TODO Auto-generated method stub
		
	}
	
}
