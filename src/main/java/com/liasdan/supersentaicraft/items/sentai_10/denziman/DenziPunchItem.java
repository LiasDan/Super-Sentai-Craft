package com.liasdan.supersentaicraft.items.sentai_10.denziman;

import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.sentai_10.DenzimanItems;
import com.liasdan.supersentaicraft.items.sentai_50.BoonboomgerItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class DenziPunchItem extends BaseSwordItem {

    public DenziPunchItem(Tier toolTier, int Atk, float Spd, Properties prop) {
        super(toolTier, Atk, Spd, prop);
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int num, boolean flag) {
        if (entity instanceof Player playerIn) {
            if (playerIn.getItemInHand(InteractionHand.MAIN_HAND).getItem() == DenzimanItems.DENZI_PUNCH.get())
                playerIn.addEffect(new MobEffectInstance(EffectCore.THUNDERPUNCH,40,2));
            if (playerIn.getItemInHand(InteractionHand.OFF_HAND).getItem() == DenzimanItems.DENZI_PUNCH1.get())
                playerIn.addEffect(new MobEffectInstance(EffectCore.THUNDERPUNCH,40,2));
        }
    }
}
