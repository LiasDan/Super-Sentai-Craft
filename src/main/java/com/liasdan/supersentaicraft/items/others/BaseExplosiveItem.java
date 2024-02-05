package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.entity.projectile.ExplosiveProjectileEntity;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BaseExplosiveItem extends Item {
	private int POWER = 1;
	
	public BaseExplosiveItem(Properties pProperties, int power) {
		super(pProperties);
		this.POWER = power;
	}

	public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
	      ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
	      pLevel.playSound((Player)null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), 
	    		  SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));
	      
	      if (!pLevel.isClientSide) {
	    	 ExplosiveProjectileEntity EarringBomb = new ExplosiveProjectileEntity(pLevel, pPlayer, POWER);
	         EarringBomb.setItem(itemstack);
	         EarringBomb.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 1.0F);
	         pLevel.addFreshEntity(EarringBomb);
	      }
	      
	      pPlayer.awardStat(Stats.ITEM_USED.get(this));
	      if (!pPlayer.getAbilities().instabuild) {
	         itemstack.shrink(1);
	      }

	      return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
	   }

	public BaseExplosiveItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}
}
