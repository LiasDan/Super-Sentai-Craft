package SS_Craft.mobs.Boss;


import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;

import SS_Craft.RiderItems;
import SS_Craft.item.shinkenger.item_shodophone;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class entity_gedou_shinken_red extends EntityBossBase
//implements IBossDisplayData
{
	public static final Item[] weapon = new Item[] {RiderItems.super_shinkenmaru,RiderItems.rekka_daizantou,RiderItems.super_shinkenmaru,RiderItems.rekka_daizantou,RiderItems.super_shinkenmaru};
	
	public entity_gedou_shinken_red(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.shinkenmaru));
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.shinkenger_torso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.shinkenger_head));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.red_shodophone));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.shinkenger_legs));
	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		if (this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.red_shodophone)
		{
			item_shodophone.set_lock(this.getItemStackFromSlot(EntityEquipmentSlot.FEET), 3);
		}
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
			this.dropItem(RiderItems.gedou_disk, 1);
			this.dropItem(RiderItems.common_disk, 5);
		}
	}
}
