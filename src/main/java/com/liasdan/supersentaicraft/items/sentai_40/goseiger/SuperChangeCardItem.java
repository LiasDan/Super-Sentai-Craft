package com.liasdan.supersentaicraft.items.sentai_40.goseiger;

import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.GoseigerItems;
import com.liasdan.supersentaicraft.items.sentai_40.ShinkengerItems;
import com.liasdan.supersentaicraft.items.sentai_50.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.sentai_50.LuPatRangerItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SuperChangeCardItem extends BaseItem {

    public String ranger;

    public SuperChangeCardItem(Properties properties,String ranger) {
        super(properties);
        this.ranger = ranger;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {

        ItemStack itemstack = player.getItemInHand(usedHand);

        if (!level.isClientSide() && player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem belt && belt.isTransformed(player)) {
            if (ranger.equals(((RangerChangerItem) player.getItemBySlot(EquipmentSlot.FEET).getItem()).Rider)) {
                if (player.getInventory().countItem(GoseigerItems.GOSEI_TENSWORD.get())!=0) {
                    ((RangerFormChangeItem) ShinkengerItems.SUPER_DISK_GOSEI.get()).use(level,player,usedHand);
                }
            }
        }
        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }
}
