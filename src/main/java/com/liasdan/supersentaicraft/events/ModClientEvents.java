package com.liasdan.supersentaicraft.events;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.client.renderer.BasicEntityRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownShurikenRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownWeaponRenderer;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.GingamanItems;
import com.liasdan.supersentaicraft.items.gingaman.GingaBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SuperSentaiCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {

	private static ResourceLocation BLOCKING_PROPERTY_RESLOC = new ResourceLocation(SuperSentaiCraftCore.MODID, "blocking");

	public static List<Item> SWORD_GUN_ITEM= new ArrayList<Item>();

	public static List<Item> SHIELD_ITEM= new ArrayList<Item>();

	public static List<Item> MULTI_WEAPON_ITEM= new ArrayList<Item>();
	
	public static List<Item> FORM_WEAPON_ITEM= new ArrayList<Item>();

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {

		event.enqueueWork(() -> {
	
			for (int i = 0; i < SWORD_GUN_ITEM.size(); i++) {
				ItemProperties.register(SWORD_GUN_ITEM.get(i), new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
					if (p_174637_ == null) {
						return 0.0F;
					} else {
						return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
					}
				});
			}
			
			for (int i = 0; i < SHIELD_ITEM.size(); i++) {
				ItemProperties.register(SHIELD_ITEM.get(i), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
					return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
				});
			}
			
			for (int i = 0; i < MULTI_WEAPON_ITEM.size(); i++) {
				ItemProperties.register(MULTI_WEAPON_ITEM.get(i), new ResourceLocation("pull"), ($itemStack, $level, $entity, $seed) -> {
					return BaseDualSwordItem.get_mode($itemStack);
				});
			}
			
			for (int i = 0; i < FORM_WEAPON_ITEM.size(); i++) {
				ItemProperties.register(FORM_WEAPON_ITEM.get(i), new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
					if (p_174637_ == null) {
						return 0.0F;
					}
					else if (p_174637_.getItemBySlot(EquipmentSlot.FEET)!= null) {
						if (p_174637_.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GingaBraceItem) {
							ItemStack belt = p_174637_.getItemBySlot(EquipmentSlot.FEET);
							if (p_174635_.getItem() == GingamanItems.JUUGEKIBOU_RED.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_GREEN.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_BLUE.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_YELLOW.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_PINK.get()) {
								if (GingaBraceItem.get_Form_Item(belt, 1).getBeltTex()=="beast_armor_shine_belt") return p_174637_.getUseItem() != p_174635_ ? 2.0F : 3.0F;
								else return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
							}
							else if (p_174635_.getItem() == GingamanItems.SEIJUUKEN.get()) {
								if (GingaBraceItem.get_Form_Item(belt, 1).getBeltTex()=="beast_armor_shine_belt") return 1;
								else return 0;
							}
						}
						else {
							return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
						}
						return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
					}
					return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
					//return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
				});
			}
		});
	}


	@SubscribeEvent
	public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MobsCore.ZOLDERS.get(), BasicEntityRenderer::new);
		
		event.registerEntityRenderer(MobsCore.EXPLOSIVE_PROJECTILE.get(), ThrownItemRenderer::new);	   
		event.registerEntityRenderer(MobsCore.WEAPON_PROJECTILE.get(), ThrownWeaponRenderer::new);	
		event.registerEntityRenderer(MobsCore.SHURIKEN_PROJECTILE.get(), ThrownShurikenRenderer::new);
	}
}