package com.liasdan.supersentaicraft;

import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.GingamanItems;
import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.MaskmanItems;
import com.liasdan.supersentaicraft.items.MobsItems;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.ShinkengerItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(SuperSentaiCraftCore.MODID)
public class SuperSentaiCraftCore {

	public static final String MODID="supersentaicraft";

	public SuperSentaiCraftCore() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		RangerTabs.register(modEventBus);
		OtherItems.register(modEventBus);
		GorangerItems.register(modEventBus);
		MaskmanItems.register(modEventBus);
		GingamanItems.register(modEventBus);
		ShinkengerItems.register(modEventBus);
		//RyusoulgerItems.register(modEventBus);
		MobsItems.register(modEventBus);
		MobsCore.register(modEventBus);
		MobsCore.MOBLIST.register(modEventBus);
		EffectCore.register(modEventBus);
		//PotionCore.register(modEventBus);
		//RangerBlocks.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		//ModLootModifiers.register(modEventBus);
		modEventBus.addListener(this::addCreative);
		//modEventBus.addListener(this::commonSetup);
	}


	/** private void commonSetup(final FMLCommonSetupEvent event) {

	        event.enqueueWork(() -> {
	        	//((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(Rider_Blocks.BLUE_ROSE.getId(), Rider_Blocks.POTTED_BLUE_ROSE);
	            RiderVillagers.registerPOIs();
	        });
	    }**/

	private void addCreative(BuildCreativeModeTabContentsEvent event) {
		RangerTabs.AddItemsToTabs(event);
	}



	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {	
			
		}
	}
}