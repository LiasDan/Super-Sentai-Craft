package com.liasdan.supersentaicraft.blocks;

import java.util.function.Supplier;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RangerBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperSentaiCraftCore.MODID);
	
	public static final RegistryObject<Block> GINGAMAN_ORE = registerBlock("gingaman_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)).AddToTabList(RangerTabs.BLOCKS));

	public static final RegistryObject<Block> DEEPSLATE_GINGAMAN_ORE = registerBlock("deepslate_gingaman_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)).AddToTabList(RangerTabs.BLOCKS));
	
	public static final RegistryObject<Block> SHINKENGER_ORE = registerBlock("shinkenger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)).AddToTabList(RangerTabs.BLOCKS));

	public static final RegistryObject<Block> DEEPSLATE_SHINKENGER_ORE = registerBlock("deepslate_shinkenger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)).AddToTabList(RangerTabs.BLOCKS));
	
	public static final RegistryObject<Block> RYUSOULGER_ORE = registerBlock("ryusoulger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)).AddToTabList(RangerTabs.BLOCKS));

	public static final RegistryObject<Block> DEEPSLATE_RYUSOULGER_ORE = registerBlock("deepslate_ryusoulger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)).AddToTabList(RangerTabs.BLOCKS));

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block ){
		return  OtherItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
	
}
