package com.liasdan.supersentaicraft.events;

import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.footsoldier.ZoldersEntity;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SuperSentaiCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCommonEvents {
	
	@Mod.EventBusSubscriber(modid = SuperSentaiCraftCore.MODID)
	public static class ForgeEvents {
		@SuppressWarnings({ "removal", "deprecation" })
		@SubscribeEvent
		public static void addChangeSize(EntityEvent.Size event) {
			if (event.getEntity() instanceof Player entity) {
				if (entity.isAddedToWorld()) { 
					
					float size = 1;
					
					if (entity.hasEffect(EffectCore.BIG.get())&!entity.hasEffect(EffectCore.SMALL.get())) { 
						size= size*((entity.getEffect(EffectCore.BIG.get()).getAmplifier())+1);
					}
					else  if (!entity.hasEffect(EffectCore.BIG.get())&entity.hasEffect(EffectCore.SMALL.get())) {
						size=(float) (size/2);
					}
					event.setNewSize(entity.getDimensions(entity.getPose()).scale(size),true);
					event.setNewEyeHeight(((float)entity.getEyeHeight(entity.getPose())*size));
					//event.setNewEyeHeight(((float)Player.DEFAULT_EYE_HEIGHT*size));
				}
			}
		}

		@SubscribeEvent
		public static void addRenderLivingEvent(RenderLivingEvent.Pre event) {
			float size = 1;
			
			if (event.getEntity().hasEffect(EffectCore.BIG.get())&!event.getEntity().hasEffect(EffectCore.SMALL.get())) { 
				size= size*((event.getEntity().getEffect(EffectCore.BIG.get()).getAmplifier())+1);
			}
			else  if (!event.getEntity().hasEffect(EffectCore.BIG.get())&event.getEntity().hasEffect(EffectCore.SMALL.get())) {
				size=(float) (size/2);
			}
			
			float size2 = size;
			
			if (event.getEntity().hasEffect(EffectCore.FLAT.get())) { 
				size2= 0.1f;
			}
			if (event.getEntity() instanceof Player player) {
				player.self().getAttributeValue(ForgeMod.BLOCK_REACH.get());
			}

			event.getPoseStack().scale(size,size,size2);
		}

		@SubscribeEvent
		public static void addRenderPlayerEvent(RenderPlayerEvent.Pre event) {


		}

		@SubscribeEvent
		public static void addCustomTrades(VillagerTradesEvent event) {
			//if(event.getType() == VillagerProfession.LIBRARIAN) {
			//	Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
			//	ItemStack stack = new ItemStack(Ichigo_Rider_Items.RIDER3_VS_THE_DEMON_OF_GENERAL_BLACK.get(), 1);
			//	int villagerLevel = 1;
			//
			//	trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
			//			new ItemStack(Items.EMERALD, 2),
			//			stack,10,8,0.02F));
			//}
		}
	}
	
	@SubscribeEvent
	public static void entitySpawnRestriction(SpawnPlacementRegisterEvent event) {
		event.register(MobsCore.ZOLDERS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		
		event.register(MobsCore.UNGLERS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		
		event.register(MobsCore.YARTOTS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);	 
		
		event.register(MobsCore.NANASHIS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);	 
		
		event.register(MobsCore.DRUNNS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);	 	       
	}
	  
	@SubscribeEvent
	public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
		event.put(MobsCore.ZOLDERS.get(), ZoldersEntity.setAttributes());
		
		event.put(MobsCore.UNGLERS.get(), ZoldersEntity.setAttributes());
		
		event.put(MobsCore.YARTOTS.get(), ZoldersEntity.setAttributes());
		
		event.put(MobsCore.NANASHIS.get(), ZoldersEntity.setAttributes());
		event.put(MobsCore.GEDOU_SHINKEN_RED.get(), ZoldersEntity.setAttributes());
		
		event.put(MobsCore.DRUNNS.get(), ZoldersEntity.setAttributes());
		event.put(MobsCore.GAISOULG.get(), ZoldersEntity.setAttributes());
		event.put(MobsCore.RYUSOUL_MORIA.get(), ZoldersEntity.setAttributes());
	}
}