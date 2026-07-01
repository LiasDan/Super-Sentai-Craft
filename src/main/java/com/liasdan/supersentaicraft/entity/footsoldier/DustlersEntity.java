package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DustlersEntity extends BaseFootsoldierEntity {

    public DustlersEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="dustler";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.DUSTLERS_SICKLE.get()));
    }
}