package SS_Craft.mobs.allies;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
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

public class entity_ex_aid extends EntityGolem
{
	private float field_70926_e;
	private float field_70924_f;
	private int attackTimer;

	/** true is the wolf is wet else false */
	private boolean isShaking;
	private boolean field_70928_h;

	public static Item ItemStack;

	public entity_ex_aid(World par1World)
	{
		super(par1World);

		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(Item.getByNameOrId("kamenridercraft4th:ex_aidhead")));
        this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(Item.getByNameOrId("kamenridercraft4th:ex_aidtroso")));
        this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(Item.getByNameOrId("kamenridercraft4th:ex_aidlegs")));   
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(Item.getByNameOrId("kamenridercraft4th:gamer_driver_ex_aid")));
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(Item.getByNameOrId("kamenridercraft4th:gashacon_breaker")));
		
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWander(this, 0.4F));
		this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, Item.getByNameOrId("kamenridercraft4th:mighty_action_x_gashat"), false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, false, true, new Predicate<EntityLiving>()
        {
            public boolean apply(@Nullable EntityLiving p_apply_1_)
            {
                return p_apply_1_ != null && IMob.VISIBLE_MOB_SELECTOR.apply(p_apply_1_) && !(p_apply_1_ instanceof EntityCreeper);
            }
        }));
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

			this.dropItem(SentaiItems60.ex_aid_kyutama, 1);

		}

	}
}
