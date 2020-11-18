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

public class entity_gaisorg extends EntityBossBase
//implements IBossDisplayData
{
	public entity_gaisorg(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.gaisoul_ken));
		this.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,new ItemStack(RiderItems.gaisoul_shield));
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.ryusoulger_torso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.ryusoulger_head));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.gaisorg_changer));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.ryusoulger_legs));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();

		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4000000238418579D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(3.0D);

	}

	protected boolean shouldBurnInDay()
	{
		return false;
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote)
		{
			this.dropItem(RiderItems.gai_soul, 1);
			this.dropItem(RiderItems.blank_ryusoul, 5);
			
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.byubyu_soul, 1);
				break;
			case 1:
				this.dropItem(RiderItems.max_ryusoul, 1);
				break;
			case 2:
				this.dropItem(RiderItems.gaisoul_ken, 1);
				break;
			}
		}
	}
}
