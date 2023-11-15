package com.liasdan.supersentaicraft.events;

import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.footsoldier.ZoldersEntity;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SuperSentaiCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCommonEvents {

	@Mod.EventBusSubscriber(modid = SuperSentaiCraftCore.MODID)
	
	public static class ForgeEvents {
		@SubscribeEvent
	    public static void entitySpawnRestriction(SpawnPlacementRegisterEvent event) {
	        event.register(MobsCore.ZOLDERS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);	      
	  }
	  
		@SubscribeEvent
		public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
			event.put(MobsCore.ZOLDERS.get(), ZoldersEntity.setAttributes());
		}
	}
}