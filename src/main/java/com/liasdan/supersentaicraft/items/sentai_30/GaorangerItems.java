package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_30.gaoranger.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class GaorangerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static String[] ARMS= new String[] {"gao_muscle","gao_hunter","gao_hunter_blue_moon","gao_icarus","gao_god","gao_knight"};
	public static String[] LEGS= new String[] {"gao_muscle","gao_knight","gao_icarus","gao_god"};
	public static String[] LEGS_BISON= new String[] {"gao_icarus","gao_god"};
	public static String[] LEGS_EAGLE= new String[] {"gao_muscle","gao_knight"};

	public static List<Item> GaoStriker= new ArrayList<Item>();

	public static final DeferredItem<Item> GAORANGER_LOGO = ITEMS.register("gaoranger_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));
    
	public static final DeferredItem<Item> EMPTY_GAO_JEWEL = ITEMS.register("empty_gao_jewel",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> UNFINISHED_GAO_GOD_JEWEL = ITEMS.register("unfinished_gao_god_jewel",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));
	public static final DeferredItem<Item> EMPTY_GAO_GOD_JEWEL = ITEMS.register("empty_gao_god_jewel",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LION_JEWEL_KING = ITEMS.register("gao_lion_jewel_king",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_king","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)));

	public static final DeferredItem<Item> GAO_LION_JEWEL = ITEMS.register("gao_lion_jewel",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_red","gao_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
					.addAlternative(GAO_LION_JEWEL_KING.get()).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_EAGLE_JEWEL = ITEMS.register("gao_eagle_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_yellow","gao_yellow_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_SHARK_JEWEL_KING = ITEMS.register("gao_shark_jewel_king",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_shark","gao_king","blank")
					.ChangeSlot(3).AddCompatibilityList(ARMS));

	public static final DeferredItem<Item> GAO_SHARK_JEWEL = ITEMS.register("gao_shark_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_blue","gao_blue_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
					.addAlternative(GAO_SHARK_JEWEL_KING.get()).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_BISON_JEWEL_KING = ITEMS.register("gao_bison_jewel_king",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_bison","gao_king","blank")
					.ChangeSlot(5).AddCompatibilityList(LEGS_BISON));

	public static final DeferredItem<Item> GAO_BISON_JEWEL_OTHERS = ITEMS.register("gao_bison_jewel_others",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_eagle_bison","gao_muscle","blank")
					.ChangeSlot(5).AddCompatibilityList(LEGS_EAGLE));

	public static final DeferredItem<Item> GAO_BISON_JEWEL = ITEMS.register("gao_bison_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_black","gao_black_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
					.addAlternative(GAO_BISON_JEWEL_KING.get()).addAlternative(GAO_BISON_JEWEL_OTHERS.get())
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_TIGER_JEWEL_KING = ITEMS.register("gao_tiger_jewel_king",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_tiger","gao_king","blank")
					.ChangeSlot(4).AddCompatibilityList(ARMS));

	public static final DeferredItem<Item> GAO_TIGER_JEWEL = ITEMS.register("gao_tiger_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_white","gao_white_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
					.addAlternative(GAO_TIGER_JEWEL_KING.get()).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_WOLF_JEWEL_KING = ITEMS.register("gao_wolf_jewel_king",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_wolf","gao_king","blank")
					.ChangeSlot(4).AddCompatibilityList(ARMS));

	public static final DeferredItem<Item> GAO_WOLF_JEWEL = ITEMS.register("gao_wolf_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_silver","gao_silver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
					.addAlternative(GAO_WOLF_JEWEL_KING.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_ELEPHANT_JEWEL = ITEMS.register("gao_elephant_jewel",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_GIRAFFE_JEWEL = ITEMS.register("gao_giraffe_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_giraffe","gao_king","blank",
					new MobEffectInstance(EffectCore.SLASH, 40, 3,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 2,true,false))
					.ChangeSlot(3).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_BEAR_JEWEL = ITEMS.register("gao_bear_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_bear","gao_king","blank",
					new MobEffectInstance(EffectCore.PUNCH, 40, 4,true,false))
					.ChangeSlot(4).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_POLAR_JEWEL = ITEMS.register("gao_polar_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_polar","gao_king","blank",
					new MobEffectInstance(EffectCore.PUNCH, 40, 4,true,false))
					.ChangeSlot(3).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_GORILLA_JEWEL = ITEMS.register("gao_gorilla_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_muscle", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_HAMMERHEAD_JEWEL = ITEMS.register("gao_hammerhead_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_hammerhead","gao_king","blank")
					.ChangeSlot(3).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LIGATOR_JEWEL_BLUE_MOON = ITEMS.register("gao_ligator_jewel_blue_moon",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_hunter_blue_moon", "ligator_blade_blue_moon",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 3,true,false)).ChangeBeltModel("gao_hunter.geo.json"));

	public static final DeferredItem<Item> GAO_LIGATOR_JEWEL = ITEMS.register("gao_ligator_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_hunter", "ligator_blade",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeBeltModel("gao_hunter.geo.json").ChangeModel("ranger.geo.json")
			.addAlternative(GAO_LIGATOR_JEWEL_BLUE_MOON.get()).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LIGATOR_JEWEL_BLUE_MOON_EVIL = ITEMS.register("gao_ligator_jewel_blue_moon_evil",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_evil","gao_hunter_blue_moon", "ligator_blade_blue_moon",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 3,true,false)).ChangeBeltModel("gao_hunter.geo.json"));

	public static final DeferredItem<Item> GAO_LIGATOR_JEWEL_EVIL = ITEMS.register("gao_ligator_jewel_evil",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_evil","gao_hunter", "ligator_blade",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeBeltModel("gao_hunter.geo.json"));

	public static final DeferredItem<Item> GAO_RHINOS_JEWEL = ITEMS.register("gao_rhinos_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_striker","gao_king","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false))
					.ChangeSlot(5).AddCompatibilityList(LEGS).AddToList(GaoStriker).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_MADILLO_JEWEL = ITEMS.register("gao_madillo_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_striker","gao_king","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false))
					.ChangeSlot(5).AddCompatibilityList(LEGS).AddToList(GaoStriker).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_KONG_JEWEL = ITEMS.register("gao_kong_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_knight", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_DEERS_JEWEL = ITEMS.register("gao_deers_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_deers","gao_king","blank",
					new MobEffectInstance(EffectCore.SLASH, 40, 3,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 3,true,false))
					.ChangeSlot(4).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_FALCON_JEWEL = ITEMS.register("gao_falcon_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_icarus", "gao_icarus_wings",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeBeltModel("rangerwingbelt.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LEON_JEWEL = ITEMS.register("gao_leon_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_god", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 6,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 3,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 3,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_CONDOR_JEWEL = ITEMS.register("gao_condor_jewel",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_SAWSHARK_JEWEL = ITEMS.register("gao_sawshark_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_sawshark","gao_king","blank")
					.ChangeSlot(3).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_BUFFALO_JEWEL = ITEMS.register("gao_buffalo_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_buffalo","gao_king","blank")
					.ChangeSlot(5).AddCompatibilityList(LEGS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_JAGUAR_JEWEL = ITEMS.register("gao_jaguar_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_jaguar","gao_king","blank")
					.ChangeSlot(4).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_PANDA_JEWEL = ITEMS.register("gao_panda_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"gao_panda","gao_king","blank",
					new MobEffectInstance(EffectCore.PUNCH, 40, 4,true,false))
					.ChangeSlot(3).AddCompatibilityList(ARMS).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_APE_JEWEL = ITEMS.register("gao_ape_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ape","gao_knight", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LION_JEWEL_BLUE = ITEMS.register("gao_lion_blue_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_blue","gao_king","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LION_JEWEL_BLACK = ITEMS.register("gao_lion_black_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_black","gao_king","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LION_JEWEL_WHITE = ITEMS.register("gao_lion_white_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_white","gao_king","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAORANGER_HELMET = ITEMS.register("gaoranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
    public static final DeferredItem<Item> GAORANGER_CHESTPLATE = ITEMS.register("gaoranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
    public static final DeferredItem<Item> GAORANGER_LEGGINGS = ITEMS.register("gaoranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
    
    public static final DeferredItem<Item> RED_G_PHONE = ITEMS.register("red_g_phone",
    		() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_red", GAO_LION_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> YELLOW_G_PHONE = ITEMS.register("yellow_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_yellow", GAO_EAGLE_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> BLUE_G_PHONE = ITEMS.register("blue_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_blue", GAO_SHARK_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> BLACK_G_PHONE = ITEMS.register("black_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_black", GAO_BISON_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> WHITE_G_PHONE = ITEMS.register("white_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_white", GAO_TIGER_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> G_BRACE_PHONE = ITEMS.register("g_brace_phone",
			() -> new GBracePhoneItem(ArmorMaterials.DIAMOND,"gao_silver", GAO_WOLF_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

    public static final DeferredItem<SwordItem> JUUOUKEN = ITEMS.register("beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> JUUOUKEN_LION = ITEMS.register("lion_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_EAGLE = ITEMS.register("eagle_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_SHARK = ITEMS.register("shark_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_BISON = ITEMS.register("bison_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_TIGER = ITEMS.register("tiger_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> LION_FANG = ITEMS.register("lion_fang",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> LION_FANG_CLAW = ITEMS.register("lion_fang_claw",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> LION_FANG_CLAW1 = ITEMS.register("lion_fang_claw1",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<BaseBlasterItem> GAO_MANE_BUSTER = ITEMS.register("gao_mane_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsChargeWeapon().AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> EAGLE_SWORD = ITEMS.register("eagle_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> SHARK_CUTTER = ITEMS.register("shark_cutter",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> BISON_AXE = ITEMS.register("bison_axe",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> TIGER_BATON = ITEMS.register("tiger_baton",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> HAJA_HYAKUJUUKEN = ITEMS.register("evil_crushing_hundred_beast_sword",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<BaseBlasterItem> GAO_HUSTLER_ROD = ITEMS.register("gao_hustler_rod",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<BaseBlasterItem> FALCON_SUMMONER = ITEMS.register("falcon_summoner",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsChargeWeapon().AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> MIKAZUKIKEN = ITEMS.register("mikazukiken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> FLUTE_KNIFE = ITEMS.register("flute_knife",
			() -> new FluteKnifeItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<Item> GAO_KING_BOOTS = ITEMS.register("gao_king_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> GAO_KING_LEGGINGS = ITEMS.register("gao_king_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> GAO_KING_CHESTPLATE = ITEMS.register("gao_king_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

    public static final DeferredItem<Item> GAO_KING_HELMET = ITEMS.register("gao_king_head",
            () -> new GaoKingItem(ArmorMaterials.NETHERITE,"gao_king",GAO_LION_JEWEL_KING,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_SHARK_JEWEL_KING,GAO_TIGER_JEWEL_KING,GAO_BISON_JEWEL_KING).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<Item> GAO_MUSCLE_HELMET = ITEMS.register("gao_muscle_head",
			() -> new GaoKingItem(ArmorMaterials.NETHERITE,"gao_muscle",GAO_GORILLA_JEWEL,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_POLAR_JEWEL,GAO_BEAR_JEWEL,GAO_BISON_JEWEL_OTHERS).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<Item> GAO_HUNTER_HELMET = ITEMS.register("gao_hunter_head",
			() -> new GaoHunterItem(ArmorMaterials.NETHERITE,"gao_hunter",GAO_LIGATOR_JEWEL,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_HAMMERHEAD_JEWEL,GAO_WOLF_JEWEL_KING).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<Item> GAO_HUNTER_BLUE_MOON_HELMET = ITEMS.register("gao_hunter_blue_moon_head",
			() -> new GaoHunterItem(ArmorMaterials.NETHERITE,"gao_hunter_blue_moon",GAO_LIGATOR_JEWEL_BLUE_MOON,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_HAMMERHEAD_JEWEL,GAO_WOLF_JEWEL_KING).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<Item> GAO_ICARUS_HELMET = ITEMS.register("gao_icarus_head",
			() -> new GaoKingItem(ArmorMaterials.NETHERITE,"gao_icarus",GAO_FALCON_JEWEL,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_GIRAFFE_JEWEL,GAO_DEERS_JEWEL,GAO_RHINOS_JEWEL).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<Item> GAO_GOD_HELMET = ITEMS.register("gao_god_head",
			() -> new GaoKingItem(ArmorMaterials.NETHERITE,"gao_god",GAO_LEON_JEWEL,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_SAWSHARK_JEWEL,GAO_JAGUAR_JEWEL,GAO_BUFFALO_JEWEL).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<Item> GAO_KNIGHT_HELMET = ITEMS.register("gao_knight_head",
			() -> new GaoKingItem(ArmorMaterials.NETHERITE,"gao_knight",GAO_KONG_JEWEL,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM,GAO_SHARK_JEWEL_KING,GAO_TIGER_JEWEL_KING,GAO_BISON_JEWEL_OTHERS).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

    public static final DeferredItem<SwordItem> FIN_BLADE = ITEMS.register("fin_blade",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<SwordItem> ELEPHANT_SWORD = ITEMS.register("elephant_sword",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<Item> ELEPHANT_SHIELD = ITEMS.register("elephant_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<SwordItem> MUSCLE_ANCHOR = ITEMS.register("muscle_anchor",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<SwordItem> LIGATOR_BLADE = ITEMS.register("ligator_blade",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<SwordItem> LIGATOR_BLADE_BLUE_MOON = ITEMS.register("ligator_blade_blue_moon",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}