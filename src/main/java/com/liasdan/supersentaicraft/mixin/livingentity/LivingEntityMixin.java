package com.liasdan.supersentaicraft.mixin.livingentity;

import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.w3c.dom.ranges.Range;

import static com.liasdan.supersentaicraft.util.AnimationUtil.canPose;
import static com.liasdan.supersentaicraft.util.AnimationUtil.stopPosing;
import static com.liasdan.supersentaicraft.world.data_attachments.AttachmentTypeRegistry.IS_POSING;
import static com.liasdan.supersentaicraft.world.data_attachments.AttachmentTypeRegistry.POSE_COOLDOWN;

@Mixin(value = LivingEntity.class, priority = 899)
public class LivingEntityMixin {
    int oldBlockX = ((LivingEntity) (Object) this).getBlockX();
    int oldBlockZ = ((LivingEntity) (Object) this).getBlockZ();

    @Inject(method = "tick", at = @At("TAIL"))
    public void post_Tick(CallbackInfo ci) {
        var rider = ((LivingEntity) (Object) this);
        if (rider.getData(IS_POSING)  && ((LivingEntity) (Object) this).level() instanceof ServerLevel) {
            if (!canPose(rider) || this.oldBlockX != rider.getBlockX() || this.oldBlockZ != rider.getBlockZ()) {
                stopPosing(rider);
            }
        } else if (rider.getData(POSE_COOLDOWN) > 0 && ((LivingEntity) (Object) this).level() instanceof ServerLevel) {
            rider.setData(POSE_COOLDOWN, rider.getData(POSE_COOLDOWN) - 1);
        }
        this.oldBlockX = rider.getBlockX();
        this.oldBlockZ = rider.getBlockZ();

//        if (rider instanceof Player) {
//            if (rider.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem belt) {
//                belt.riderKickTick(rider.getItemBySlot(EquipmentSlot.FEET), rider.level(), rider, 36);
//            }
//        }

        if (!(rider instanceof Player)) {
            if (rider.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem belt) {
                belt.beltTick(rider.getItemBySlot(EquipmentSlot.FEET), rider.level(), rider, 36);
//              belt.riderKickTick(rider.getItemBySlot(EquipmentSlot.FEET), rider.level(), rider, 36);
                belt.giveEffects(rider);
            }
            if (rider.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem belt) {
                belt.beltTick(rider.getItemBySlot(EquipmentSlot.HEAD), rider.level(), rider, 39);
//              belt.riderKickTick(rider.getItemBySlot(EquipmentSlot.FEET), rider.level(), rider, 36);
                belt.giveEffects(rider);
            }
        }

    }
}
