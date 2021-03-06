package SS_Craft.mobs.Boss;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class entity_bio_hunter_silva extends EntityBossBase implements IRangedAttackMob
//implements IBossDisplayData
{
    private static final DataParameter<Boolean> SWINGING_ARMS = EntityDataManager.<Boolean>createKey(AbstractSkeleton.class, DataSerializers.BOOLEAN);

	public final EntityAIAttackRanged aiArrowAttack = new EntityAIAttackRanged(this, 1.25D, 20, 10.0F); 
	
    public entity_bio_hunter_silva(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.bi_buster));
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.bioman_torso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.bioman_head));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.bio_hunter_silva_belt));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.bioman_legs));
		
		this.tasks.addTask(2, aiArrowAttack);
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		
      this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80.0D);
      this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
      this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
      this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);

	}

	protected boolean shouldBurnInDay()
	{
		return false;
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote)
		{
			this.dropItem(RiderItems.bio_hunter_silva_belt, 1);
			this.dropItem(RiderItems.bioman_logo, 5);
		}
		switch (this.rand.nextInt(5))
		{   		   	    		
		case 0:
			this.dropItem(RiderItems.bi_buster, 1);
			break;
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

    @SideOnly(Side.CLIENT)
    public boolean isSwingingArms()
    {
        return ((Boolean)this.dataManager.get(SWINGING_ARMS)).booleanValue();
    }

    public void setSwingingArms(boolean swingingArms)
    {
        this.dataManager.set(SWINGING_ARMS, Boolean.valueOf(swingingArms));
    }
}
