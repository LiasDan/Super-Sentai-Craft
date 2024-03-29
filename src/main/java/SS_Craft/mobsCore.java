package SS_Craft;

import SS_Craft.mobs.Boss.entity_bio_hunter_silva;
import SS_Craft.mobs.Boss.entity_brave_kyoryu_gold;
import SS_Craft.mobs.Boss.entity_chaos_ryuger;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import SS_Craft.mobs.Boss.entity_dark_shishi_red;
import SS_Craft.mobs.Boss.entity_death_ryuger;
import SS_Craft.mobs.Boss.entity_doctor_kemp;
import SS_Craft.mobs.Boss.entity_doctor_mazenda;
import SS_Craft.mobs.Boss.entity_doctor_obular;
import SS_Craft.mobs.Boss.entity_dogold;
import SS_Craft.mobs.Boss.entity_don_murasame;
import SS_Craft.mobs.Boss.entity_dragon_ranger;
import SS_Craft.mobs.Boss.entity_gaisorg;
import SS_Craft.mobs.Boss.entity_gedou_shinken_red;
import SS_Craft.mobs.Boss.entity_hakaizer;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import SS_Craft.mobs.Boss.entity_neo_deka_red;
import SS_Craft.mobs.Boss.entity_neo_deka_yellow;
import SS_Craft.mobs.Boss.entity_rouki;
import SS_Craft.mobs.Boss.entity_ryusoul_moria;
import SS_Craft.mobs.Boss.entity_signalman_evil;
import SS_Craft.mobs.Boss.entity_nouto;
import SS_Craft.mobs.Boss.entity_stacaesar;
import SS_Craft.mobs.Boss.entity_yami_0gou;
import SS_Craft.mobs.Henchmen.entity_anaroids;
import SS_Craft.mobs.Henchmen.entity_anounis;
import SS_Craft.mobs.Henchmen.entity_barmias_black;
import SS_Craft.mobs.Henchmen.entity_barmias_white;
import SS_Craft.mobs.Henchmen.entity_bechats;
import SS_Craft.mobs.Henchmen.entity_buglars;
import SS_Craft.mobs.Henchmen.entity_cotpotros;
import SS_Craft.mobs.Henchmen.entity_crimers;
import SS_Craft.mobs.Henchmen.entity_cutmen;
import SS_Craft.mobs.Henchmen.entity_dorodoros;
import SS_Craft.mobs.Henchmen.entity_droans;
import SS_Craft.mobs.Henchmen.entity_drunns;
import SS_Craft.mobs.Henchmen.entity_dustlers;
import SS_Craft.mobs.Henchmen.entity_golems1;
import SS_Craft.mobs.Henchmen.entity_golems2;
import SS_Craft.mobs.Henchmen.entity_grinams;
import SS_Craft.mobs.Henchmen.entity_igaroids;
import SS_Craft.mobs.Henchmen.entity_imps;
import SS_Craft.mobs.Henchmen.entity_indavers_blue;
import SS_Craft.mobs.Henchmen.entity_indavers_green;
import SS_Craft.mobs.Henchmen.entity_indavers_white;
import SS_Craft.mobs.Henchmen.entity_jimmers;
import SS_Craft.mobs.Henchmen.entity_karths;
import SS_Craft.mobs.Henchmen.entity_kudakks;
import SS_Craft.mobs.Henchmen.entity_kunekunes;
import SS_Craft.mobs.Henchmen.entity_kuros;
import SS_Craft.mobs.Henchmen.entity_machinemen;
import SS_Craft.mobs.Henchmen.entity_mechaclones;
import SS_Craft.mobs.Henchmen.entity_moebas;
import SS_Craft.mobs.Henchmen.entity_nanashis;
import SS_Craft.mobs.Henchmen.entity_orgettes;
import SS_Craft.mobs.Henchmen.entity_pordermen;
import SS_Craft.mobs.Henchmen.entity_rinshis;
import SS_Craft.mobs.Henchmen.entity_spotmen;
import SS_Craft.mobs.Henchmen.entity_ugatz;
import SS_Craft.mobs.Henchmen.entity_ulars;
import SS_Craft.mobs.Henchmen.entity_unglers;
import SS_Craft.mobs.Henchmen.entity_wumpers_blue;
import SS_Craft.mobs.Henchmen.entity_wumpers_green;
import SS_Craft.mobs.Henchmen.entity_wumpers_pink;
import SS_Craft.mobs.Henchmen.entity_wumpers_white;
import SS_Craft.mobs.Henchmen.entity_yartots;
import SS_Craft.mobs.Henchmen.entity_zolders;
import SS_Craft.mobs.Henchmen.entity_zolohs;
import SS_Craft.mobs.Henchmen.entity_zorimas;
import SS_Craft.mobs.allies.entity_don_momotarou;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyoryuger;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.allies.entity_mecha_dark_gear;
import SS_Craft.mobs.bikes.entity_deinochaser;
import SS_Craft.mobs.bikes.entity_garu_bike;
import SS_Craft.mobs.mini_boss.entity_batsuroids;
import SS_Craft.mobs.mini_boss.entity_dora_sphinx;
import SS_Craft.mobs.mini_boss.entity_pumpkin_rapper;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import SS_Craft.util.Refercence;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class mobsCore 
{
	public static int MobID = 1000;

	public static void Addmob()
	{
		//01 Goranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZoldersMob"),entity_zolders.class, "ZoldersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xa1a1a1);
		EntityRegistry.addSpawn(entity_zolders.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//02 J.A.K.Q
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CrimersMob"),entity_crimers.class, "CrimersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x878583, 0x121212);
		EntityRegistry.addSpawn(entity_crimers.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//03 Battle Fever
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CutmenMob"),entity_cutmen.class, "CutmenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x878583, 0x121212);
		EntityRegistry.addSpawn(entity_cutmen.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//04 Denziman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DustlersMob"),entity_dustlers.class, "DustlersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xdedede);
		EntityRegistry.addSpawn(entity_dustlers.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//05 Sun Vulcan
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MachinemenMob"),entity_machinemen.class, "MachinemenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xb81200);
		EntityRegistry.addSpawn(entity_machinemen.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//06 Goggle V
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SpotmenMob"),entity_spotmen.class, "SpotmenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xde9c3a, 0x1e471d);
		EntityRegistry.addSpawn(entity_spotmen.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//08 Bioman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MechaclonesMob"),entity_mechaclones.class, "MechaclonesMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xadadad);
		EntityRegistry.addSpawn(entity_mechaclones.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BioHunterSilvaMob"),entity_bio_hunter_silva.class, "BioHunterSilvaMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xadadad, 0x121212);
		
		//10 Flashman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZolohsMob"),entity_zolohs.class, "ZolohsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd50000, 0x000000);
		EntityRegistry.addSpawn(entity_zolohs.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134));
		
		//11 Maskman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":UnglersMob"),entity_unglers.class, "UnglersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xdcc568);
		EntityRegistry.addSpawn(entity_unglers.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134));
		
		//12 Liveman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":JimmersMob"),entity_jimmers.class, "JimmersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x5d8c20, 0xf5ebb8);
		EntityRegistry.addSpawn(entity_jimmers.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DoctorKempMob"),entity_doctor_kemp.class, "DoctorKempMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x38c7fa, 0x0093c9);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DoctorMazendaMob"),entity_doctor_mazenda.class, "DoctorMazendaMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0d0d0d, 0xba0000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DoctorObularMob"),entity_doctor_obular.class, "DoctorObularMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x212121, 0x0f0f0f);

		//13 Turboranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":UlarsMob"),entity_ulars.class, "UlarsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xcccccc);
		EntityRegistry.addSpawn(entity_ulars.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":UlarCaptainMob"),entity_ular_captain.class, "UlarCaptainMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xb71c1c, 0xcccccc);

		//15 Jetman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GrinamsMob"),entity_grinams.class, "GrinamsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xe8d633);
		EntityRegistry.addSpawn(entity_grinams.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//16 Zyuranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GolemsMob1"),entity_golems1.class, "GolemsMob1", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x878583, 0x696969);
		EntityRegistry.addSpawn(entity_golems1.class,  15, 1, 3, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(6),Biome.getBiome(134));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GolemsMob2"),entity_golems2.class, "GolemsMob2", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x878583, 0x696969);
		EntityRegistry.addSpawn(entity_golems2.class,  15, 1, 3, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(6),Biome.getBiome(134));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DoraSphinxMob"),entity_dora_sphinx.class, "DoraSphinxMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x9c9c9c, 0xdb961f);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":PumpkinRapperMob"),entity_pumpkin_rapper.class, "PumpkinRapperMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe85500, 0x077419);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DragonRangerMob"),entity_dragon_ranger.class, "DragonRangerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x099c3a, 0xf09700);

		//17 Dairanger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CotpotrosMob"),entity_cotpotros.class, "CotpotrosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xf0f0f0);
		EntityRegistry.addSpawn(entity_cotpotros.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//18 Kakuranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DorodorosMob"),entity_dorodoros.class, "DorodorosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x03a9f4, 0xd9d9d9);
		EntityRegistry.addSpawn(entity_dorodoros.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		//20 Carranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":WumpersBlueMob"),entity_wumpers_blue.class, "WumpersBlueMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x03a9f4, 0xbd66a6);
		EntityRegistry.addSpawn(entity_wumpers_blue.class,  15, 1, 2, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":WumpersGreenMob"),entity_wumpers_green.class, "WumpersGreenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x2da131, 0xbd66a6);
		EntityRegistry.addSpawn(entity_wumpers_green.class,  15, 1, 2, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":WumpersPinkMob"),entity_wumpers_pink.class, "WumpersPinkMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe60b71, 0xbd66a6);
		EntityRegistry.addSpawn(entity_wumpers_pink.class,  15, 1, 2, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":WumpersWhiteMob"),entity_wumpers_white.class, "WumpersWhiteMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xffffff, 0xbd66a6);
		EntityRegistry.addSpawn(entity_wumpers_white.class,  15, 1, 1, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SignalmanEvilMob"),entity_signalman_evil.class, "SignalmanEvilMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1323af, 0xffffff);
		
		//21 Megaranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KunekunesMob"),entity_kunekunes.class, "KunekunesMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd500f9, 0xd9a702);
		EntityRegistry.addSpawn(entity_kunekunes.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		//22 Gingaman
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":YartotsMob"),entity_yartots.class, "YartotsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xde7002, 0x2e1100);
		EntityRegistry.addSpawn(entity_yartots.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		//23 GoGo-V
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ImpsMob"),entity_imps.class, "ImpsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0x850202);
		EntityRegistry.addSpawn(entity_imps.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//25 Gaoranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":OrgettesMob"),entity_orgettes.class, "OrgettesMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x334a33, 0x8a1e34);
		EntityRegistry.addSpawn(entity_orgettes.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RoukiMob"),entity_rouki.class, "RoukiMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0b0b0b, 0x7d7d7d);
		
		//27 Abaranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BarmiasBlackMob"),entity_barmias_black.class, "BarmiasBlackMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0x1f8a1c);
		EntityRegistry.addSpawn(entity_barmias_black.class,  15, 1, 3, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BarmiasWhiteMob"),entity_barmias_white.class, "BarmiasWhiteMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe8eaf6, 0x0072c9);
		EntityRegistry.addSpawn(entity_barmias_white.class,  15, 1, 3, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//28 Dekaranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":AnaroidsMob"),entity_anaroids.class, "AnaroidsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0a0a0a, 0xdedede);
		EntityRegistry.addSpawn(entity_anaroids.class,  15, 1, 3,EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":IgaroidsMob"),entity_igaroids.class, "IgaroidsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xf24900, 0x0a0a0a);
		EntityRegistry.addSpawn(entity_igaroids.class,  15, 1, 3, EnumCreatureType.MONSTER,Biome.getBiome(8));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BatsuroidsMob"),entity_batsuroids.class, "BatsuroidsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x00a1ff, 0x0a0a0a);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NeoDekaRedMob"),entity_neo_deka_red.class, "NeoDekaRedMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x780000, 0x363636);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NeoDekaYellowMob"),entity_neo_deka_yellow.class, "NeoDekaYellowMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xffbb00, 0x363636);
				
		//30 Boukenger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KarthsMob"),entity_karths.class, "KarthsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xa6a6a6, 0x000000);
		EntityRegistry.addSpawn(entity_karths.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		//31 Gekiranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RinshisMob"),entity_rinshis.class, "RinshisMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x7a2e01, 0x121212);
		EntityRegistry.addSpawn(entity_rinshis.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//32 Go-Onger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":UgatzMob"),entity_ugatz.class, "UgatzMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xa6a6a6, 0x8a3b13);
		EntityRegistry.addSpawn(entity_ugatz.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//33 Shinkenger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NanashisMob"),entity_nanashis.class, "NanashisMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd6ba00, 0xa61a0b);
		EntityRegistry.addSpawn(entity_nanashis.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GedouShinkenRedMob"),entity_gedou_shinken_red.class, "GedouShinkenRedMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0f0f0f, 0xf00000);
		
		//36 Go-Busters
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BuglarsMob"),entity_buglars.class, "BuglarsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe60b71, 0x999794);
		EntityRegistry.addSpawn(entity_buglars.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(8));
		
		//36-37 Akibaranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DroansMob"),entity_droans.class, "DroansMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xffffff, 0x0099ff);
		EntityRegistry.addSpawn(entity_droans.class,  15, 1, 3, EnumCreatureType.MONSTER,Biome.getBiome(8));
		
		//37 Kyoryuger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZorimasMob"),entity_zorimas.class, "ZorimasMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe8eaf6, 0x10751b);
		EntityRegistry.addSpawn(entity_zorimas.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167),Biome.getBiome(8));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DogoldMob"),entity_dogold.class, "DogoldMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x823f15, 0xffd500);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DeathRyugerMob"),entity_death_ryuger.class, "DeathRyugerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x000e6b, 0xb31515);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BraveKyoryuGold"),entity_brave_kyoryu_gold.class, "BraveKyoryuGold", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc79f3b, 0x06175e);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ChaosRyugerMob"),entity_chaos_ryuger.class, "ChaosRyugerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x360c0f, 0xe8a710);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DeinochaserMob"),entity_deinochaser.class, "DeinochaserMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xf2de00, 0x111111);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KyoryugerMob"),entity_kyoryuger.class, "KyoryugerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xb31515, 0xe8a710);
		
		//38 ToQger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KurosMob"),entity_kuros.class, "KurosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0a0a0a, 0xeeeeee);
		EntityRegistry.addSpawn(entity_kuros.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Yami0gouMob"),entity_yami_0gou.class, "Yami0gouMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1a1a1a, 0x111111);
		
		//40 Zyuohger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MoebasMob"),entity_moebas.class, "MoebasMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x07357a, 0xaf8802);
		EntityRegistry.addSpawn(entity_moebas.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		
		//41 Kyuranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":IndaversBlueMob"),entity_indavers_blue.class, "IndaversBlueMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0x0072c9);
		EntityRegistry.addSpawn(entity_indavers_blue.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":IndaversGreenMob"),entity_indavers_green.class, "IndaversGreenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0x87e03a);
		EntityRegistry.addSpawn(entity_indavers_green.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":IndaversWhiteMob"),entity_indavers_white.class, "IndaversWhiteMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x121212, 0xeeeeee);
		EntityRegistry.addSpawn(entity_indavers_white.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":HebitsukaiMetalMob"),entity_hebitsukai_metal.class, "HebitsukaiMetalMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc7c7c7, 0x941246);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DarkShishiRedMob"),entity_dark_shishi_red.class, "DarkShishiRedMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x101010, 0xd20000);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KyurangersMob"),entity_kyuranger.class, "KyurangersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd20000, 0x101010);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GaruBikeMob"),entity_garu_bike.class, "GaruBikeMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1f1387, 0x101010);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ExAidMob"),entity_ex_aid.class, "ExAidMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe4007f, 0xa3f900);
		
		//42 Lupinranger VS Patranger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":PordermenMob"),entity_pordermen.class, "PordermenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x369e86, 0xe8e8e7);
		EntityRegistry.addSpawn(entity_pordermen.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		//43 Ryusoulger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DrunnsMob"),entity_drunns.class, "DrunnsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xbfbcb9, 0xc1a800);
		EntityRegistry.addSpawn(entity_drunns.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GaisorgMob"),entity_gaisorg.class, "GaisorgMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x56007f, 0x9c9c9c);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RyusoulMoriaMob"),entity_ryusoul_moria.class, "RyusoulMoriaMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xccca97, 0x303030);
		
		//44 Kirameiger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BechatsMob"),entity_bechats.class, "BechatsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x795548, 0x416e26);
		EntityRegistry.addSpawn(entity_bechats.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DarkKirameiSilverMob"),entity_dark_kiramei_silver.class, "DarkKirameiSilverMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe0e0e0, 0xd16100);
	
		//45 Zenkaiger
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KudakksMob"),entity_kudakks.class, "KudakksMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd6d6d6, 0x000000);
		EntityRegistry.addSpawn(entity_kudakks.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":StacaesarMob"),entity_stacaesar.class, "StacaesarMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x9800c6, 0xab1608);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":HakaizerMob"),entity_hakaizer.class, "HakaizerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xb3b3b3, 0xe02020);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MechaDarkGearMob"),entity_mecha_dark_gear.class, "MechaDarkGearMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd20000, 0x101010);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DonMomotarouMob"),entity_don_momotarou.class, "DonMomotarouMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd20000, 0x101010);
	
		//46 DonBrothers
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":AnounisMob"),entity_anounis.class, "AnounisMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x8c8375, 0xffd500);
		EntityRegistry.addSpawn(entity_anounis.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(18),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(131),Biome.getBiome(133),Biome.getBiome(140),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(6),Biome.getBiome(134),Biome.getBiome(2),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(130),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NoutoMob"),entity_nouto.class, "NoutoMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x000539, 0x0d0d83);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DonMurasameMob"),entity_don_murasame.class, "DonMurasameMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x9800c6, 0xab1608);
	}
	
	public static int newMobID()
	{
		MobID=MobID+1; 
		return MobID;
	}
}
