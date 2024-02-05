package com.liasdan.supersentaicraft.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FrostedIceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;


public class FrostWalkerEffect extends MobEffect {


	public FrostWalkerEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		if (pLivingEntity.onGround()) {
			BlockPos pos = pLivingEntity.blockPosition();
			
	         BlockState blockstate = Blocks.FROSTED_ICE.defaultBlockState();
	         int i = Math.min(16, 2);
	         BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

	         for(BlockPos blockpos : BlockPos.betweenClosed(pos.offset(-i, -1, -i), pos.offset(i, -1, i))) {
	            if (blockpos.closerToCenterThan(pLivingEntity.position(), (double)i)) {
	               blockpos$mutableblockpos.set(blockpos.getX(), blockpos.getY() + 1, blockpos.getZ());
	               BlockState blockstate1 = pLivingEntity.level().getBlockState(blockpos$mutableblockpos);
	               if (blockstate1.isAir()) {
	                  BlockState blockstate2 = pLivingEntity.level().getBlockState(blockpos);
	                  if (blockstate2 == FrostedIceBlock.meltsInto() && blockstate.canSurvive(pLivingEntity.level(), blockpos) && pLivingEntity.level().isUnobstructed(blockstate, blockpos, CollisionContext.empty()) && !net.minecraftforge.event.ForgeEventFactory.onBlockPlace(pLivingEntity, net.minecraftforge.common.util.BlockSnapshot.create(pLivingEntity.level().dimension(), pLivingEntity.level(), blockpos), net.minecraft.core.Direction.UP)) {
	                	  pLivingEntity.level().setBlockAndUpdate(blockpos, blockstate);
	                	  pLivingEntity.level().scheduleTick(blockpos, Blocks.FROSTED_ICE, Mth.nextInt(pLivingEntity.getRandom(), 60, 120));
	                  }
	               }
	            }
	         }
		}
	}

	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}