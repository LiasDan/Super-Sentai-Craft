package com.liasdan.supersentaicraft.entity.boss;

import java.util.Random;

import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
import com.liasdan.supersentaicraft.items.MobsItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GaisoulgEntity extends BaseFootsoldierEntity {
	
    public GaisoulgEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="ld_gaisoulg";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(RyusoulgerItems.RYUSOULGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(RyusoulgerItems.RYUSOULGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(RyusoulgerItems.RYUSOULGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(RyusoulgerItems.GAISOULG_CHANGER.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(RyusoulgerItems.GAISOUL_KEN.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(RyusoulgerItems.GAISOUL_SHIELD.get()));
    }

    public static AttributeSupplier setAttributes() {
    
    	//.add(ForgeMod.ATTACK_RANGE.get(),2)
        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 35.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 4.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 30.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
}