package com.liasdan.supersentaicraft.loot;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.mojang.serialization.Codec;

import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
	
	public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS=
			DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, SuperSentaiCraftCore.MODID);
	
	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_SUS_ITEM =
			LOOT_MODIFIER_SERIALIZERS.register("add_sus_items", AddSusItemModifier.CODEC);
	
	public static void register(IEventBus bus) {
		LOOT_MODIFIER_SERIALIZERS.register(bus);
	}
}
