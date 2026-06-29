package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.others.*;

import com.liasdan.supersentaicraft.sounds.ModSounds;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OtherItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static String[] SentaiRobo = new String[] {"battle_fever_robo","dai_denzin","sun_vulcan_robo","gao_king","gao_muscle","gao_hunter",
			"gao_hunter_blue_moon","gao_icarus","gao_god","gao_knight","zubaan"};

	public static final DeferredItem<Item> BASE_SWORD = ITEMS.register("base_sword",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> MECHA_GEAR = ITEMS.register("mecha_gear",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> BASE_MECHA_SWORD = ITEMS.register("base_mecha_sword",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> BLANK_FORM = ITEMS.register("blank_form",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","",""));

	public static final DeferredItem<Item> SUPER_SENTAI_LOGO = ITEMS.register("super_sentai_logo",
			() -> new RangerFormChangeItem(new Item.Properties(), 0, "", "", "",
					new MobEffectInstance(EffectCore.BIG, 40, 2,true,false))
					.ChangeSlot(2).addSwitchForm(BLANK_FORM.get()).AddCompatibilityList(SentaiRobo).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> SUPER_SENTAI_BOOK = ITEMS.register("super_sentai_book",
			() -> new SuperSentaiBookItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> SUSUME_GORANGER_MUSIC_DISC = ITEMS.register("susume_goranger_music_disc",
			() -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SUSUME_GORANGER_KEY).stacksTo(1)));

	public static final DeferredItem<Item> TAIYOU_SENTAI_SUN_VULCAN_MUSIC_DISC = ITEMS.register("taiyou_sentai_sun_vulcan_music_disc",
			() -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.TAIYOU_SENTAI_SUN_VULCAN_KEY).stacksTo(1)));

	public static final DeferredItem<Item> HIKARI_SENTAI_MASKMAN_MUSIC_DISC = ITEMS.register("hikari_sentai_maskman_music_disc",
			() -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HIKARI_SENTAI_MASKMAN_KEY).stacksTo(1)));

	public static final DeferredItem<Item> GAORANGER_HOERO_MUSIC_DISC = ITEMS.register("gaoranger_hoero_music_disc",
			() -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.GAORANGER_HOERO_KEY).stacksTo(1)));

	public static final DeferredItem<Item> SAMURAI_SENTAI_SHINKENGER_MUSIC_DISC = ITEMS.register("samurai_sentai_shinkenger_music_disc",
			() -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SAMURAI_SENTAI_SHINKENGER_KEY).stacksTo(1)));

	public static final DeferredItem<Item> WINNER_GOZYUGER_MUSIC_DISC = ITEMS.register("winner_gozyuger_music_disc",
			() -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.WINNER_GOZYUGER_KEY).stacksTo(1)));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}