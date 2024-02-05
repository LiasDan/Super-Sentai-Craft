package com.liasdan.supersentaicraft.items;

import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.entity.MobsCore;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RangerTabs {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
			SuperSentaiCraftCore.MODID) ;
	
    /*public static RegistryObject<CreativeModeTab> RiderMiscTab = CREATIVE_MODE_TABS.register("ssc999", () -> 
    		CreativeModeTab.builder().icon(() -> new ItemStack(OtherItems.RIDER_CIRCUIT.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
    		.title(Component.literal("Misc Rider Items")).build());
    		
    public static RegistryObject<CreativeModeTab> RiderblockTab = CREATIVE_MODE_TABS.register("krc_999_blocks_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Rider_Blocks.PURE_GAIA_MEMORY_BLOCK.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Rider Blocks")).build());*/
	
    public static RegistryObject<CreativeModeTab> GorangerTab = CREATIVE_MODE_TABS.register("ssc001", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(GorangerItems.GORANGER_HELMET.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_goranger_items.png"))
			.title(Component.literal("Himistsu Sentai Goranger")).build());
    
    public static RegistryObject<CreativeModeTab> MaskmanTab = CREATIVE_MODE_TABS.register("ssc011", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(MaskmanItems.MASKMAN_HELMET.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_maskman_items.png"))
			.title(Component.literal("Hikari Sentai Maskman")).build());
    
    public static RegistryObject<CreativeModeTab> GingamanTab = CREATIVE_MODE_TABS.register("ssc022", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(GingamanItems.GINGAMAN_HELMET.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_gingaman_items.png"))
			.title(Component.literal("Seijuu Sentai Gingaman")).build());

    public static RegistryObject<CreativeModeTab> ShinkengerTab = CREATIVE_MODE_TABS.register("ssc033", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(ShinkengerItems.SHINKENGER_HELMET.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_shinkenger_items.png"))
			.title(Component.literal("Samurai Sentai Shinkenger")).build());
    
    public static RegistryObject<CreativeModeTab> RyusoulgerTab = CREATIVE_MODE_TABS.register("ssc044", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(RyusoulgerItems.RYUSOULGER_HELMET.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_ryusoulger_items.png"))
			.title(Component.literal("Kishiryu Sentai Ryusoulger")).build());

    public static RegistryObject<CreativeModeTab> MiscTab = CREATIVE_MODE_TABS.register("ssc900", () -> 
    		CreativeModeTab.builder().icon(() -> new ItemStack(OtherItems.SUPER_SENTAI_LOGO.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_misc_items.png"))
    		.title(Component.literal("Misc Sentai Items")).build());
    
    public static RegistryObject<CreativeModeTab> BlockTab = CREATIVE_MODE_TABS.register("ssc901", () ->
    		CreativeModeTab.builder().icon(() -> new ItemStack(RangerBlocks.RYUSOULGER_ORE.get())).withBackgroundLocation(new ResourceLocation(SuperSentaiCraftCore.MODID+":textures/gui/tab_misc_items.png"))
    		.title(Component.literal("Misc Sentai Blocks")).build());
    
    public static List<Item> GORANGER= new ArrayList<Item>();

    public static List<Item> MASKMAN= new ArrayList<Item>();
    
    public static List<Item> GINGAMAN= new ArrayList<Item>();
    
    public static List<Item> SHINKENGER= new ArrayList<Item>();
    
    public static List<Item> RYUSOULGER= new ArrayList<Item>();
    
    public static List<Item> MISC= new ArrayList<Item>();
    
    public static List<Block> BLOCKS= new ArrayList<Block>();
    
    public static void register(IEventBus eventBus) {
    	CREATIVE_MODE_TABS.register(eventBus);
    }
    
    public static void AddItemsToTabs(BuildCreativeModeTabContentsEvent event){

		if(event.getTab() == RangerTabs.GorangerTab.get()) {
			for (int i = 0; i < RangerTabs.GORANGER.size(); i++)
			{
				event.accept( RangerTabs.GORANGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.MaskmanTab.get()) {
			for (int i = 0; i < RangerTabs.MASKMAN.size(); i++)
			{
				event.accept( RangerTabs.MASKMAN.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.GingamanTab.get()) {
			for (int i = 0; i < RangerTabs.GINGAMAN.size(); i++)
			{
				event.accept( RangerTabs.GINGAMAN.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.ShinkengerTab.get()) {
			for (int i = 0; i < RangerTabs.SHINKENGER.size(); i++)
			{
				event.accept( RangerTabs.SHINKENGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.RyusoulgerTab.get()) {
			for (int i = 0; i < RangerTabs.RYUSOULGER.size(); i++)
			{
				event.accept( RangerTabs.RYUSOULGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.MiscTab.get()) {

			event.accept(MobsCore.ZOLDERS_SPAWN_EGG);

			event.accept(MobsCore.UNGLERS_SPAWN_EGG);

			event.accept(MobsCore.YARTOTS_SPAWN_EGG);

			event.accept(MobsCore.NANASHIS_SPAWN_EGG);
			event.accept(MobsCore.GEDOU_SHINKEN_RED_SPAWN_EGG);

			event.accept(MobsCore.DRUNNS_SPAWN_EGG);
			event.accept(MobsCore.GAISOULG_SPAWN_EGG);
			event.accept(MobsCore.RYUSOUL_MORIA_SPAWN_EGG);
			
			for (int i = 0; i < RangerTabs.MISC.size(); i++)
			{
				event.accept( RangerTabs.MISC.get(i));
			}
		}
		else if(event.getTab() == RangerTabs.BlockTab.get()) {
			for (int i = 0; i < RangerTabs.BLOCKS.size(); i++)
			{
				event.accept( RangerTabs.BLOCKS.get(i));
			}

		}


    	
    }
    
}