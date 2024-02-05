package com.liasdan.supersentaicraft.entity.boss;

import java.util.Random;

import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
import com.liasdan.supersentaicraft.items.MobsItems;
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

public class GedouShinkenRedEntity extends BaseFootsoldierEntity {
	
	public static final Item[] weapon = new Item[] {ShinkengerItems.SHINKENMARU.get(),ShinkengerItems.REKKA_DAIZANTOU.get()};
	
    public GedouShinkenRedEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="ld_gedou_shinken_red";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ShinkengerItems.SHINKENGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ShinkengerItems.SHINKENGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ShinkengerItems.SHINKENGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(ShinkengerItems.RED_SHODOPHONE.get()));

        Random generator = new Random();
		int rand = generator.nextInt(weapon.length);

        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(weapon[rand]));
    }

    public void tick() {
    	super.tick();
    	RangerChangerItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), ShinkengerItems.GEDOU_DISK.get(), 1);
    	RangerChangerItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), ShinkengerItems.GEDOU_DISK.get(), 2);
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