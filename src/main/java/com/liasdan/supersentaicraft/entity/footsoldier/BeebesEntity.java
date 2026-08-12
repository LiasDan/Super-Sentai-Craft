package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BeebesEntity extends BaseFootsoldierEntity {

    public BeebesEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="beebe";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.BEEBE_KNIFE.get()));
    }

    public void remove(Entity.RemovalReason p_149847_) {
        if ( this.isDeadOrDying()) {
            if (this.random.nextInt(5) == 1) {
                BaseFootsoldierEntity boss = MobsCore.DARK_GOSEI_KNIGHT.get().create(this.level());
                if (boss != null) {
                    boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                    this.level().addFreshEntity(boss);

                    if (this.getLastAttacker()instanceof Player){
                        Player playerIn = (Player) this.getLastAttacker();
                        playerIn.sendSystemMessage(Component.translatable("<Dark Gosei Knight>Change Card! Tensou!").withStyle(ChatFormatting.GRAY));
                    }
                }
            }
        }
        super.remove(p_149847_);
    }
}