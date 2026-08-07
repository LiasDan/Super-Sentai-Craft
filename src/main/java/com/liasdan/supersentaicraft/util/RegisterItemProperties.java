package com.liasdan.supersentaicraft.util;

import com.liasdan.supersentaicraft.items.sentai_30.GingamanItems;
import com.liasdan.supersentaicraft.items.sentai_40.GoseigerItems;
import com.liasdan.supersentaicraft.items.sentai_40.goseiger.TensouderItem;
import com.liasdan.supersentaicraft.items.sentai_50.KingOhgerItems;
import com.liasdan.supersentaicraft.items.sentai_50.LuPatRangerItems;
import com.liasdan.supersentaicraft.items.sentai_50.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.sentai_30.gingaman.GingaBraceItem;
import com.liasdan.supersentaicraft.items.sentai_50.king_ohger.OhgerCaliburItem;
import com.liasdan.supersentaicraft.items.sentai_50.king_ohger.OhgerCaliburZeroItem;
import com.liasdan.supersentaicraft.items.sentai_50.lupatranger.VSChangerItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_50.ryusoulger.MosaChangerItem;
import com.liasdan.supersentaicraft.items.sentai_50.ryusoulger.RyusoulChangerItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

import static com.liasdan.supersentaicraft.SuperSentaiCraftCore.*;

public class RegisterItemProperties {
    public static void addCustomItemProperties() {
        registerSwordGunItems();
        registerShieldItems();
        registerMultiWeaponItems();
        registerChargedWeaponItems();
        registerFormWeaponItems();
        registerChangeChangerItems();
    }

    private static final ResourceLocation BLOCKING_PROPERTY_RESLOC = ResourceLocation.parse("blocking");

    private static void registerSwordGunItems() {
        for (int i = 0; i < SWORD_GUN_ITEM.size(); i++) {
            ItemProperties.register(SWORD_GUN_ITEM.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
                if ($entity == null) {
                    return 0.0F;
                } else {
                    return $entity.getUseItem() != $itemStack ? 0.0F : (float)($itemStack.getUseDuration($entity) - $entity.getUseItemRemainingTicks()) / 1.0F;
                }
            });
        }
    }

    private static void registerShieldItems() {
        for (int i = 0; i < SHIELD_ITEM.size(); i++) {
            ItemProperties.register(SHIELD_ITEM.get(i), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
            });
        }
    }

    private static void registerMultiWeaponItems() {
        for (int i = 0; i < MULTI_WEAPON_ITEM.size(); i++) {
            ItemProperties.register(MULTI_WEAPON_ITEM.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
                return BaseDualSwordItem.get_mode($itemStack);
            });
        }
    }

    private static void registerChargedWeaponItems() {
        for (int i = 0; i < CHARGED_WEAPON.size(); i++) {
            ItemProperties.register(CHARGED_WEAPON.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
                if (BaseBlasterItem.get_mode($itemStack) == 30) return 1;
                return 0;
            });
        }
    }

    private static void registerFormWeaponItems() {
        for (int i = 0; i < FORM_WEAPON_ITEM.size(); i++) {
            ItemProperties.register(FORM_WEAPON_ITEM.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
                if ($entity == null) {
                    return 0.0F;
                }
                else if ($entity.getItemBySlot(EquipmentSlot.FEET)!= null) {
                    ItemStack belt = $entity.getItemBySlot(EquipmentSlot.FEET);
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GingaBraceItem) {
                        if ($itemStack.getItem() == GingamanItems.JUUGEKIBOU_RED.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_GREEN.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_BLUE.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_YELLOW.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_PINK.get()) {
                            if (GingaBraceItem.get_Form_Item(belt, 2).getBeltTex()=="beast_armor_shine_belt") return $entity.getUseItem() != $itemStack ? 2.0F : 3.0F;
                            else return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
                        }
                        if ($itemStack.getItem() == GingamanItems.SEIJUUKEN.get()) {
                            if (GingaBraceItem.get_Form_Item(belt, 2).getBeltTex()=="beast_armor_shine_belt") return 1;
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof VSChangerItem) {
                        if ($itemStack.getItem() == LuPatRangerItems.VS_CHANGER.get()) {
                            if (VSChangerItem.get_Form_Item(belt,1).getFormName(false)=="_tricolor") return 7;
                            else if (VSChangerItem.get_Form_Item(belt,1).getFormName(false)=="_ugou") return 8;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_scissor") return 9;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_crane") return 10;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_magic") return 11;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_splash") return 12;
                            else if (VSChangerItem.get_Form_Item(belt,1).getFormName(false)=="_super") return 13;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_siren") return 14;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_gold") return 15;
                            else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="") {
                                if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.RED_VS_CHANGER.get()) return 1;
                                else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.BLUE_VS_CHANGER.get()) return 2;
                                else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.YELLOW_VS_CHANGER.get()) return 3;
                                else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.ICHIGOU_VS_CHANGER.get()) return 4;
                                else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.NIGOU_VS_CHANGER.get()) return 5;
                                else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.SANGOU_VS_CHANGER.get()) return 6;
                            }
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.LUPAT_X_CHANGER.get()) {
                        if ($itemStack.getItem() == LuPatRangerItems.X_CHANGER.get()){
                            if (RangerChangerItem.get_Form_Item(belt, 1).getBeltTex()=="lupinranger_belt") return 1;
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RyusoulChangerItem) {
                        if ($itemStack.getItem() == RyusoulgerItems.MAX_RYUSOUL_CHANGER.get()) {
                            if (RyusoulChangerItem.get_Form_Item(belt, 1).getFormName(false)=="_max") return 1;
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof MosaChangerItem) {

                        if ($itemStack.getItem() == RyusoulgerItems.MOSA_CHANGER.get()) {
                            if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==RyusoulgerItems.GOLD_MOSA_CHANGER.get()){
                                if (MosaChangerItem.get_Form_Item(belt, 2).getFormName(false)!="") return 2;
                                else return 1;
                            }
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof OhgerCaliburItem) {

                        if ($itemStack.getItem() == KingOhgerItems.OHGER_CROWN_LANCE.get()) {
                            if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==KingOhgerItems.KUWAGATA_OHGER_CALIBUR.get()){
                                if (OhgerCaliburItem.get_Form_Item(belt, 1).getFormName(false)!="") return 1;
                                else return 0;
                            }
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof OhgerCaliburZeroItem) {

                        if ($itemStack.getItem() == KingOhgerItems.OHGER_CROWN_LANCE.get()) {
                            if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==KingOhgerItems.OH_KUWAGATA_OHGER_CALIBUR_ZERO.get()){
                                if (OhgerCaliburZeroItem.get_Form_Item(belt, 1).getFormName(false)!="") return 1;
                                else return 0;
                            }
                            else return 0;
                        }
                    }
                    if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()== KingOhgerItems.SPIDER_KUMONO_SLAYER.get()) {
                        if ($itemStack.getItem() == KingOhgerItems.KUMONO_SLAYER.get()){
                            if (RangerChangerItem.get_Form_Item(belt, 1).getFormName(false)=="") return 1;
                        }
                        else return 0;
                    }
                    else {
                        return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
                    }
                    return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
                }
                return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
            });
        }
    }

    private static void registerChangeChangerItems() {
        for (int i = 0; i < CHANGE_CHANGER_TEXTURE.size(); i++) {
            ItemProperties.register(CHANGE_CHANGER_TEXTURE.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
                if ($entity == null) {
                    return 0.0F;
                } else {
                    if ($itemStack.getItem() == LuPatRangerItems.LUPAT_X_CHANGER.get()) {
                        if (RangerChangerItem.get_Form_Item($itemStack, 1).getBeltTex() == "lupinranger_belt") return 1;
                        else return 0;
                    }
                }
                return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
                //return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
            });
        }
    }
}