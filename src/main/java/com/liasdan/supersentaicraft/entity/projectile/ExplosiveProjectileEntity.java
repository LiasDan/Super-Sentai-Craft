package com.liasdan.supersentaicraft.entity.projectile;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.GorangerItems;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class ExplosiveProjectileEntity extends ThrowableItemProjectile{
	private int POWER = 1;
	
	public ExplosiveProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}
	
	public ExplosiveProjectileEntity(Level pLevel) {
		super(MobsCore.EXPLOSIVE_PROJECTILE.get(), pLevel);
	}
	
	public ExplosiveProjectileEntity(Level pLevel, LivingEntity livingEntity,int power) {
		super(MobsCore.EXPLOSIVE_PROJECTILE.get(), livingEntity, pLevel);
		this.POWER = power;
	}

	@Override
	protected Item getDefaultItem() {
		return GorangerItems.EARRING_BOMB.get();
	}
	
	@Override
	protected void onHit(HitResult pResult) {
		super.onHit(pResult);
	    if (!this.level().isClientSide) {
	    	boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level(), this.getOwner());
	    	this.level().explode(this, this.getX(), this.getY(), this.getZ(), (float)POWER, flag, Level.ExplosionInteraction.MOB);
	    	this.discard();
	    }
	}
}