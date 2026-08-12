package com.liasdan.supersentaicraft.entity;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.ally.ZubaanEntity;
import com.liasdan.supersentaicraft.entity.boss.*;
import com.liasdan.supersentaicraft.entity.footsoldier.*;
import com.liasdan.supersentaicraft.entity.projectile.ExplosiveProjectileEntity;
import com.liasdan.supersentaicraft.entity.projectile.ShurikenProjectileEntity;
import com.liasdan.supersentaicraft.entity.projectile.WeaponProjectileEntity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MobsCore {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
	public static final DeferredRegister<EntityType<?>> MOBLIST = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SuperSentaiCraftCore.MODID);
	
	//01 Goranger
	public static final DeferredHolder<EntityType<?>, EntityType<ZoldersEntity>> ZOLDERS = MOBLIST.register("zolder",
            () -> EntityType.Builder.of(ZoldersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zolder"));
    
    public static final DeferredItem<DeferredSpawnEggItem> ZOLDERS_SPAWN_EGG = ITEMS.register("zolder_spawn_egg",
            () -> new DeferredSpawnEggItem(ZOLDERS,0xffffff, 0x151515, new Item.Properties()));

	//02 JAKQ
	public static final DeferredHolder<EntityType<?>, EntityType<CrimersEntity>> CRIMERS = MOBLIST.register("crimer",
			() -> EntityType.Builder.of(CrimersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":crimer"));

	public static final DeferredItem<DeferredSpawnEggItem> CRIMERS_SPAWN_EGG = ITEMS.register("crimer_spawn_egg",
			() -> new DeferredSpawnEggItem(CRIMERS,0xffffff, 0x151515, new Item.Properties()));

	//03 Battle Fever
	public static final DeferredHolder<EntityType<?>, EntityType<CutmenEntity>> CUTMEN = MOBLIST.register("cutman",
			() -> EntityType.Builder.of(CutmenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":cutman"));

	public static final DeferredItem<DeferredSpawnEggItem> CUTMEN_SPAWN_EGG = ITEMS.register("cutman_spawn_egg",
			() -> new DeferredSpawnEggItem(CUTMEN,0xffffff, 0x151515, new Item.Properties()));

	//04 Denziman
	public static final DeferredHolder<EntityType<?>, EntityType<DustlersEntity>> DUSTLERS = MOBLIST.register("dustler",
			() -> EntityType.Builder.of(DustlersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dustler"));

	public static final DeferredItem<DeferredSpawnEggItem> DUSTLERS_SPAWN_EGG = ITEMS.register("dustler_spawn_egg",
			() -> new DeferredSpawnEggItem(DUSTLERS,0xffffff, 0x151515, new Item.Properties()));

	//05 Sun Vulcan
	public static final DeferredHolder<EntityType<?>, EntityType<MachinemenEntity>> MACHINEMEN = MOBLIST.register("machineman",
			() -> EntityType.Builder.of(MachinemenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":machineman"));

	public static final DeferredItem<DeferredSpawnEggItem> MACHINEMEN_SPAWN_EGG = ITEMS.register("machineman_spawn_egg",
			() -> new DeferredSpawnEggItem(MACHINEMEN,0xffffff, 0x151515, new Item.Properties()));

	//11 Maskman
	public static final DeferredHolder<EntityType<?>, EntityType<UnglersEntity>> UNGLERS = MOBLIST.register("ungler",
            () -> EntityType.Builder.of(UnglersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ungler"));
    
    public static final DeferredItem<DeferredSpawnEggItem> UNGLERS_SPAWN_EGG = ITEMS.register("ungler_spawn_egg",
			() -> new DeferredSpawnEggItem(UNGLERS,0xffffff, 0x151515, new Item.Properties()));

	//13 Turboranger
	public static final DeferredHolder<EntityType<?>, EntityType<UlarsEntity>> ULARS = MOBLIST.register("ular",
			() -> EntityType.Builder.of(UlarsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ular"));

	public static final DeferredItem<DeferredSpawnEggItem> ULARS_SPAWN_EGG = ITEMS.register("ular_spawn_egg",
			() -> new DeferredSpawnEggItem(ULARS,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<UlarCaptainEntity>> ULAR_CAPTAIN = MOBLIST.register("ular_captain",
			() -> EntityType.Builder.of(UlarCaptainEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ular_captain"));

	public static final DeferredItem<DeferredSpawnEggItem> ULAR_CAPTAIN_SPAWN_EGG = ITEMS.register("ular_captain_spawn_egg",
			() -> new DeferredSpawnEggItem(ULAR_CAPTAIN,0xffffff, 0x151515, new Item.Properties()));

	//20 Carranger
	public static final DeferredHolder<EntityType<?>, EntityType<WumpersEntity>> WUMPERS = MOBLIST.register("wumper",
			() -> EntityType.Builder.of(WumpersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":wumper"));

	public static final DeferredItem<DeferredSpawnEggItem> WUMPERS_SPAWN_EGG = ITEMS.register("wumper_spawn_egg",
			() -> new DeferredSpawnEggItem(WUMPERS,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<SignalmanEvilEntity>> SIGNALMAN_EVIL = MOBLIST.register("signalman_evil",
			() -> EntityType.Builder.of(SignalmanEvilEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":signalman_evil"));

	public static final DeferredItem<DeferredSpawnEggItem> SIGNALMAN_EVIL_SPAWN_EGG = ITEMS.register("signalman_evil_spawn_egg",
			() -> new DeferredSpawnEggItem(SIGNALMAN_EVIL,0xffffff, 0x151515, new Item.Properties()));

	//22 Gingaman
	public static final DeferredHolder<EntityType<?>, EntityType<YartotsEntity>> YARTOTS = MOBLIST.register("yartots",
			() -> EntityType.Builder.of(YartotsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":yartots"));

	public static final DeferredItem<DeferredSpawnEggItem> YARTOTS_SPAWN_EGG = ITEMS.register("yartots_spawn_egg",
			() -> new DeferredSpawnEggItem(YARTOTS,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<BlackKnightEntity>> BLACK_KNIGHT = MOBLIST.register("black_knight",
			() -> EntityType.Builder.of(BlackKnightEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":black_knight"));

	public static final DeferredItem<DeferredSpawnEggItem> BLACK_KNIGHT_SPAWN_EGG = ITEMS.register("black_knight_spawn_egg",
			() -> new DeferredSpawnEggItem(BLACK_KNIGHT,0xffffff, 0x151515, new Item.Properties()));

	//23 GoGo-V
	public static final DeferredHolder<EntityType<?>, EntityType<ImpsEntity>> IMPS = MOBLIST.register("imps",
			() -> EntityType.Builder.of(ImpsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":imps"));

	public static final DeferredItem<DeferredSpawnEggItem> IMPS_SPAWN_EGG = ITEMS.register("imps_spawn_egg",
			() -> new DeferredSpawnEggItem(IMPS,0xffffff, 0x151515, new Item.Properties()));

	//25 Gaoranger
	public static final DeferredHolder<EntityType<?>, EntityType<OrgettesEntity>> ORGETTES = MOBLIST.register("orgettes",
			() -> EntityType.Builder.of(OrgettesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":orgettes"));

	public static final DeferredItem<DeferredSpawnEggItem> ORGETTES_SPAWN_EGG = ITEMS.register("orgettes_spawn_egg",
			() -> new DeferredSpawnEggItem(ORGETTES,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DukeOrgRoukiEntity>> DUKE_ORG_ROUKI = MOBLIST.register("duke_org_rouki",
			() -> EntityType.Builder.of(DukeOrgRoukiEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":duke_org_rouki"));

	public static final DeferredItem<DeferredSpawnEggItem> DUKE_ORG_ROUKI_SPAWN_EGG = ITEMS.register("duke_org_rouki_spawn_egg",
			() -> new DeferredSpawnEggItem(DUKE_ORG_ROUKI,0xffffff, 0x151515, new Item.Properties()));

    //30 Boukenger
    public static final DeferredHolder<EntityType<?>, EntityType<CursesEntity>> CURSES = MOBLIST.register("curse",
            () -> EntityType.Builder.of(CursesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":curse"));

    public static final DeferredItem<DeferredSpawnEggItem> CURSES_SPAWN_EGG = ITEMS.register("curse_spawn_egg",
            () -> new DeferredSpawnEggItem(CURSES,0xffffff, 0x151515, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<JaryuuEntity>> JARYUU = MOBLIST.register("jaryuu",
            () -> EntityType.Builder.of(JaryuuEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":jaryuu"));

    public static final DeferredItem<DeferredSpawnEggItem> JARYUU_SPAWN_EGG = ITEMS.register("jaryuu_spawn_egg",
            () -> new DeferredSpawnEggItem(JARYUU,0xffffff, 0x151515, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<RyuuwonEntity>> RYUUWON = MOBLIST.register("ryuuwon",
            () -> EntityType.Builder.of(RyuuwonEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ryuuwon"));

    public static final DeferredItem<DeferredSpawnEggItem> RYUUWON_SPAWN_EGG = ITEMS.register("ryuuwon_spawn_egg",
            () -> new DeferredSpawnEggItem(RYUUWON,0xffffff, 0x151515, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<ZubaanEntity>> ZUBAAN = MOBLIST.register("zubaan",
            () -> EntityType.Builder.of(ZubaanEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zubaan"));

    public static final DeferredItem<DeferredSpawnEggItem> ZUBAAN_SPAWN_EGG = ITEMS.register("zubaan_spawn_egg",
            () -> new DeferredSpawnEggItem(ZUBAAN,0xffffff, 0x151515, new Item.Properties()));

    //33 Shinkenger
	public static final DeferredHolder<EntityType<?>, EntityType<NanashisEntity>> NANASHIS = MOBLIST.register("nanashi",
            () -> EntityType.Builder.of(NanashisEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":nanashi"));
    
    public static final DeferredItem<DeferredSpawnEggItem> NANASHIS_SPAWN_EGG = ITEMS.register("nanashi_spawn_egg",
			() -> new DeferredSpawnEggItem(NANASHIS,0xffffff, 0x151515, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<GedouShinkenRedEntity>> GEDOU_SHINKEN_RED = MOBLIST.register("gedou_shinken_red",
            () -> EntityType.Builder.of(GedouShinkenRedEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":gedou_shinken_red"));
    
    public static final DeferredItem<DeferredSpawnEggItem> GEDOU_SHINKEN_RED_SPAWN_EGG = ITEMS.register("gedou_shinken_red_spawn_egg",
			() -> new DeferredSpawnEggItem(GEDOU_SHINKEN_RED,0xffffff, 0x151515, new Item.Properties()));

	//33 Shinkenger
	public static final DeferredHolder<EntityType<?>, EntityType<BeebesEntity>> BEEBES = MOBLIST.register("beebe",
			() -> EntityType.Builder.of(BeebesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":beebe"));

	public static final DeferredItem<DeferredSpawnEggItem> BEEBES_SPAWN_EGG = ITEMS.register("beebe_spawn_egg",
			() -> new DeferredSpawnEggItem(BEEBES,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DarkGoseiKnightEntity>> DARK_GOSEI_KNIGHT = MOBLIST.register("dark_gosei_knight",
			() -> EntityType.Builder.of(DarkGoseiKnightEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dark_gosei_knight"));

	public static final DeferredItem<DeferredSpawnEggItem> DARK_GOSEI_KNIGHT_SPAWN_EGG = ITEMS.register("dark_gosei_knight_spawn_egg",
			() -> new DeferredSpawnEggItem(DARK_GOSEI_KNIGHT,0xffffff, 0x151515, new Item.Properties()));

	//36 Go-Busters
	public static final DeferredHolder<EntityType<?>, EntityType<BuglersEntity>> BUGLERS = MOBLIST.register("bugler",
			() -> EntityType.Builder.of(BuglersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":bugler"));

	public static final DeferredItem<DeferredSpawnEggItem> BUGLERS_SPAWN_EGG = ITEMS.register("bugler_spawn_egg",
			() -> new DeferredSpawnEggItem(BUGLERS,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DarkBusterEntity>> DARK_BUSTER = MOBLIST.register("dark_buster",
			() -> EntityType.Builder.of(DarkBusterEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dark_buster"));

	public static final DeferredItem<DeferredSpawnEggItem> DARK_BUSTER_SPAWN_EGG = ITEMS.register("dark_buster_spawn_egg",
			() -> new DeferredSpawnEggItem(DARK_BUSTER,0xffffff, 0x151515, new Item.Properties()));

	//42 LuPat
	public static final DeferredHolder<EntityType<?>, EntityType<PordermenEntity>> PORDERMEN = MOBLIST.register("porderman",
			() -> EntityType.Builder.of(PordermenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":porderman"));

	public static final DeferredItem<DeferredSpawnEggItem> PORDERMEN_SPAWN_EGG = ITEMS.register("porderman_spawn_egg",
			() -> new DeferredSpawnEggItem(PORDERMEN,0xffffff, 0x151515, new Item.Properties()));


	//43 Ryusoulger
	public static final DeferredHolder<EntityType<?>, EntityType<DrunnsEntity>> DRUNNS = MOBLIST.register("drunn",
            () -> EntityType.Builder.of(DrunnsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":drunn"));
    
    public static final DeferredItem<DeferredSpawnEggItem> DRUNNS_SPAWN_EGG = ITEMS.register("drunn_spawn_egg",
			() -> new DeferredSpawnEggItem(DRUNNS,0xffffff, 0x151515, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<GaisoulgEntity>> GAISOULG = MOBLIST.register("gaisoulg",
            () -> EntityType.Builder.of(GaisoulgEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":gaisoulg"));
    
    public static final DeferredItem<DeferredSpawnEggItem> GAISOULG_SPAWN_EGG = ITEMS.register("gaisoulg_spawn_egg",
			() -> new DeferredSpawnEggItem(GAISOULG,0xffffff, 0x151515, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<RyusoulMoriaEntity>> RYUSOUL_MORIA = MOBLIST.register("ryusoul_moria",
            () -> EntityType.Builder.of(RyusoulMoriaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ryusoul_moria"));
    
    public static final DeferredItem<DeferredSpawnEggItem> RYUSOUL_MORIA_SPAWN_EGG = ITEMS.register("ryusoul_moria_spawn_egg",
			() -> new DeferredSpawnEggItem(RYUSOUL_MORIA,0xffffff, 0x151515, new Item.Properties()));

	//47 King-Ohger
	public static final DeferredHolder<EntityType<?>, EntityType<SanagimsEntity>> SANAGIMS = MOBLIST.register("sanagim",
			() -> EntityType.Builder.of(SanagimsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":sanagim"));

	public static final DeferredItem<DeferredSpawnEggItem> SANAGIMS_SPAWN_EGG = ITEMS.register("sanagim_spawn_egg",
			() -> new DeferredSpawnEggItem(SANAGIMS,0xffffff, 0x151515, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<OhKuwagataOhgerEntity>> OH_KUWAGATA_OHGER = MOBLIST.register("oh_kuwagata_ohger",
			() -> EntityType.Builder.of(OhKuwagataOhgerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":oh_kuwagata_ohger"));

	public static final DeferredItem<DeferredSpawnEggItem> OH_KUWAGATA_OHGER_SPAWN_EGG = ITEMS.register("oh_kuwagata_ohger_spawn_egg",
			() -> new DeferredSpawnEggItem(OH_KUWAGATA_OHGER,0xffffff, 0x151515, new Item.Properties()));

	//48 Boonboomger
	public static final DeferredHolder<EntityType<?>, EntityType<NejirettasEntity>> NEJIRETTAS = MOBLIST.register("nejiretta",
			() -> EntityType.Builder.of(NejirettasEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":nejiretta"));

	public static final DeferredItem<DeferredSpawnEggItem> NEJIRETTAS_SPAWN_EGG = ITEMS.register("nejiretta_spawn_egg",
			() -> new DeferredSpawnEggItem(NEJIRETTAS,0xffffff, 0x151515, new Item.Properties()));


	public static final DeferredHolder<EntityType<?>, EntityType<ExplosiveProjectileEntity>> EXPLOSIVE_PROJECTILE =
			MOBLIST.register("explosive_projectile",() -> EntityType.Builder.<ExplosiveProjectileEntity>of(ExplosiveProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":explosive_projectile"));
	
	public static final DeferredHolder<EntityType<?>, EntityType<WeaponProjectileEntity>> WEAPON_PROJECTILE =
			MOBLIST.register("weapon_projectile",() -> EntityType.Builder.<WeaponProjectileEntity>of(WeaponProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":weapon_projectile"));
	
	public static final DeferredHolder<EntityType<?>, EntityType<ShurikenProjectileEntity>> SHURIKEN_PROJECTILE =
			MOBLIST.register("shuriken_projectile",() -> EntityType.Builder.<ShurikenProjectileEntity>of(ShurikenProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":shuriken_projectile"));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
