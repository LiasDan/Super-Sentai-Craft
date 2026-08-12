package com.liasdan.supersentaicraft.entity.boss;

import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
import com.liasdan.supersentaicraft.items.sentai_30.GingamanItems;
import com.liasdan.supersentaicraft.items.sentai_40.GoseigerItems;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class DarkGoseiKnightEntity extends BaseFootsoldierEntity {

    private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(Component.translatable(getDisplayName().getString()).withStyle(ChatFormatting.GRAY), BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS));

    public DarkGoseiKnightEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="ld_gosei_knight";
        LocalDate localdate = LocalDate.now();
        int i = localdate.get(ChronoField.DAY_OF_MONTH);
        int j = localdate.get(ChronoField.MONTH_OF_YEAR);
        if (j == 6 && i == 22) {
            this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
            this.armorDropChances[EquipmentSlot.HEAD.getIndex()] = 0.0F;
        }
        else this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(GoseigerItems.GOSEIGER_HELMET.get()));

        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(GoseigerItems.GOSEIGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(GoseigerItems.GOSEIGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoseigerItems.LEON_CELLULAR_DARK.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(GoseigerItems.LEON_LASER.get()));
    }


    protected void customServerAiStep() {
        super.customServerAiStep();
        this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
    }


    public void readAdditionalSaveData(CompoundTag p_31474_) {
        super.readAdditionalSaveData(p_31474_);
        if (this.hasCustomName()) {
            this.bossEvent.setName(this.getDisplayName());
        }
    }

    public void setCustomName(@Nullable Component p_31476_) {
        super.setCustomName(p_31476_);
        this.bossEvent.setName(this.getDisplayName());
    }

    public void startSeenByPlayer(ServerPlayer p_31483_) {
        super.startSeenByPlayer(p_31483_);
        this.bossEvent.addPlayer(p_31483_);
    }

    public void stopSeenByPlayer(ServerPlayer p_31488_) {
        super.stopSeenByPlayer(p_31488_);
        this.bossEvent.removePlayer(p_31488_);
    }


    public static AttributeSupplier.Builder setAttributes() {

        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED,(double)0.2F)
                .add(Attributes.ATTACK_DAMAGE, 15.0D)
                .add(Attributes.ARMOR, 4.0D)
                .add(Attributes.MAX_HEALTH, 50.0D);
    }
}