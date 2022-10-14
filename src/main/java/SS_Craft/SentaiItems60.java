package SS_Craft;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import SS_Craft.blocks.custom.BlockType;
import SS_Craft.blocks.custom.CustomBlock;
import SS_Craft.blocks.custom.Property;
import SS_Craft.blocks.decor_block;
import SS_Craft.blocks.ore_block;
import SS_Craft.item.*;
import SS_Craft.item.abaranger.item_dino_brace;
import SS_Craft.item.abaranger.item_sty_riser;
import SS_Craft.item.abaranger.item_sty_riser_shield;
import SS_Craft.item.abaranger.mecha.item_abaranger_mecha;
import SS_Craft.item.abaranger.mecha.item_dino_guts;
import SS_Craft.item.akibaranger.item_akibaranger_armor;
import SS_Craft.item.akibaranger.item_akibaranger_armor2;
import SS_Craft.item.akibaranger.item_moe_moe_z_cune;
import SS_Craft.item.akibaranger.item_munyu_munyu_zubaan;
import SS_Craft.item.battle_fever.item_battleceiver;
import SS_Craft.item.battle_fever.mecha.item_battle_fever_mecha;
import SS_Craft.item.bioman.item_bioman_armor;
import SS_Craft.item.bioman.item_bioman_armor2;
import SS_Craft.item.bioman.item_techno_brace;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.boukenger.item_bouken_spirit;
import SS_Craft.item.carranger.item_accel_changer;
import SS_Craft.item.dairanger.item_aura_changer;
import SS_Craft.item.dekaranger.item_dekaranger_armor;
import SS_Craft.item.dekaranger.item_dekaranger_armor2;
import SS_Craft.item.dekaranger.item_sp_badge;
import SS_Craft.item.dekaranger.item_sp_license;
import SS_Craft.item.denziman.item_denzi_punch;
import SS_Craft.item.denziman.item_denzi_ring;
import SS_Craft.item.denziman.mecha.item_denziman_mecha;
import SS_Craft.item.flashman.item_prism_armor;
import SS_Craft.item.flashman.item_prism_flash;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gaoranger.mecha.item_flute_knife;
import SS_Craft.item.gaoranger.mecha.item_gao_jewel;
import SS_Craft.item.gaoranger.mecha.item_gaoranger_mecha;
import SS_Craft.item.gekiranger.item_geki_changer;
import SS_Craft.item.gekiranger.item_super_geki_claw;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.gingaman.item_ginga_medal;
import SS_Craft.item.go_busters.item_enetron;
import SS_Craft.item.go_busters.item_morphin_brace;
import SS_Craft.item.go_onger.item_go_phone;
import SS_Craft.item.go_onger.mecha.item_engine_soul;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha;
import SS_Craft.item.goggle_v.item_goggle_brace;
import SS_Craft.item.gogo_v.item_gogo_brace;
import SS_Craft.item.gogo_v.item_v_mode_brace;
import SS_Craft.item.gokaiger.item_mobirates;
import SS_Craft.item.gokaiger.item_ranger_key;
import SS_Craft.item.goranger.item_goranger_belt;
import SS_Craft.item.jakq.item_powered_capsule;
import SS_Craft.item.jetman.item_cross_changer;
import SS_Craft.item.kakuranger.item_doron_changer;
import SS_Craft.item.kakuranger.item_kakuranger_armor;
import SS_Craft.item.kakuranger.item_kakuranger_armor2;
import SS_Craft.item.kakuranger.item_kakure_medal;
import SS_Craft.item.kawarimono.item_kawarimono_armor;
import SS_Craft.item.kawarimono.item_kawarimono_armor2;
import SS_Craft.item.kirameiger.item_kanaema_stone;
import SS_Craft.item.kirameiger.item_kiraful_go_arrow;
import SS_Craft.item.kirameiger.item_kiramei_changer;
import SS_Craft.item.kirameiger.item_kiramei_stone;
import SS_Craft.item.kirameiger.item_shiny_breaker;
import SS_Craft.item.kyuranger.item_kyutama;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.kyuranger.item_skill_kyutama;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.lupatranger.item_vs_vehicle;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.megaranger.item_battleraizer;
import SS_Craft.item.megaranger.item_digitaizer;
import SS_Craft.item.megaranger.item_mega_disk;
import SS_Craft.item.ninninger.item_nin_shuriken;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul;
import SS_Craft.item.ryusoulger.item_ryusoul_calibur;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_armor;
import SS_Craft.item.shinkenger.item_secret_disk;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.item.sun_vulcan.item_vulcan_brace;
import SS_Craft.item.sun_vulcan.mecha.item_sun_vulcan_mecha;
import SS_Craft.item.toqger.item_toq_changer;
import SS_Craft.item.toqger.item_toq_ressha;
import SS_Craft.item.turboranger.item_fairy_power;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.item.zenkaiger.item_dark_gear;
import SS_Craft.item.zenkaiger.item_geartlinger;
import SS_Craft.item.zenkaiger.item_sentai_gear;
import SS_Craft.item.zenkaiger.item_zenkai_gear;
import SS_Craft.item.zenkaiger.item_zenkaiger_armor;
import SS_Craft.item.zenkaiger.item_zenkaiger_armor2;
import SS_Craft.item.zyuohger.item_whale_change_gun;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.item.zyuohger.item_zyuoh_cube;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.item.zyuranger.item_dino_medal;
import SS_Craft.item.zyuranger.item_zyuranger_armor;
import SS_Craft.item.zyuranger.item_zyuranger_armor2;
import SS_Craft.potion.PotionCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static SS_Craft.blocks.custom.Property.TRANSPARENT;
import static SS_Craft.blocks.custom.Property.WALKTHROUGH;
import static java.util.Objects.*;

public class SentaiItems60 
{
	//41 Uchu Sentai Kyuranger
	public static Item kyuranger_logo = new Item_ore("kyuranger_logo").setCreativeTab(Tabs.tabKyuranger);
	public static Item blank_kyutama = new Item_ore("blank_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Block kyuranger_ore = new ore_block("kyuranger_ore", Material.ROCK, blank_kyutama, 2).setHardness(9.9F).setCreativeTab(Tabs.tabKyuranger);
	public static Block kyuranger_nether_ore = new ore_block("kyuranger_nether_ore", Material.ROCK, blank_kyutama, 3).setHardness(9.9F).setCreativeTab(Tabs.tabKyuranger);
	
	public static Item kyuranger_head = new item_sentai_armor("kyuranger_head", item_seiza_blaster.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyuranger_torso = new item_sentai_armor("kyuranger_torso", item_seiza_blaster.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyuranger_legs = new item_sentai_armor("kyuranger_legs", item_seiza_blaster.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);

	public static Item red_seiza_blaster = new item_seiza_blaster("red_seiza_blaster", ArmorMaterial.DIAMOND, 4,"shishi_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item orange_seiza_blaster = new item_seiza_blaster("orange_seiza_blaster", ArmorMaterial.DIAMOND, 4,"sasori_orange").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item blue_seiza_blaster = new item_seiza_blaster("blue_seiza_blaster", ArmorMaterial.DIAMOND, 4,"ookami_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item gold_seiza_blaster = new item_seiza_blaster("gold_seiza_blaster", ArmorMaterial.DIAMOND, 4,"tenbin_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item black_seiza_blaster = new item_seiza_blaster("black_seiza_blaster", ArmorMaterial.DIAMOND, 4,"oushi_black").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item silver_seiza_blaster = new item_seiza_blaster("silver_seiza_blaster", ArmorMaterial.DIAMOND, 4,"hebitsukai_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item green_seiza_blaster = new item_seiza_blaster("green_seiza_blaster", ArmorMaterial.DIAMOND, 4,"chameleon_green").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item pink_seiza_blaster = new item_seiza_blaster("pink_seiza_blaster", ArmorMaterial.DIAMOND, 4,"washi_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item yellow_seiza_blaster = new item_seiza_blaster("yellow_seiza_blaster", ArmorMaterial.DIAMOND, 4,"kajiki_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item commander_ryutsueder = new item_seiza_blaster("commander_ryutsueder", ArmorMaterial.DIAMOND, 4,"ryu_commander").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item sky_blue_seiza_blaster = new item_seiza_blaster("sky_blue_seiza_blaster", ArmorMaterial.DIAMOND, 4,"koguma_sky_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_blade_shield = new item_seiza_blaster("houou_blade_shield", ArmorMaterial.DIAMOND, 4,"houou_soldier").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item metal_dark_seiza_blaster = new item_seiza_blaster("metal_dark_seiza_blaster", ArmorMaterial.DIAMOND, 4,"hebitsukai_metal_evil").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_red_seiza_blaster = new item_seiza_blaster("dark_red_seiza_blaster", ArmorMaterial.DIAMOND, 4,"dark_shishi_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	
	public static Item kyu_buckle = new Item_ore("kyu_buckle");
	public static Item ryu_buckle = new Item_ore("ryu_buckle");
	public static Item washi_pink_wing = new Item_ore("washi_pink_wing");
	public static Item washi_pink_wing_close = new Item_ore("washi_pink_wing_close");

	public static Item shishi_kyutama = new item_kyutama(0, "shishi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item sasori_kyutama = new item_kyutama(0, "sasori_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ookami_kyutama = new item_kyutama(0, "ookami_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tenbin_kyutama = new item_kyutama(0, "tenbin_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item oushi_kyutama = new item_kyutama(0, "oushi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hebitsukai_kyutama = new item_kyutama(0, "hebitsukai_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item chameleon_kyutama = new item_kyutama(0, "chameleon_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item washi_kyutama = new item_kyutama(0, "washi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kajiki_kyutama = new item_kyutama(0, "kajiki_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ryu_kyutama = new item_kyutama(0, "ryu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item koguma_kyutama = new item_kyutama(0, "koguma_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_kyutama = new item_kyutama(0, "houou_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item hikari_kyutama_taiyou = new item_kyutama("hikari_kyutama_taiyou", 3).setCreativeTab(Tabs.tabKyuranger);
	public static Item hikari_kyutama_tsuki = new item_kyutama("hikari_kyutama_tsuki", 4).setCreativeTab(Tabs.tabKyuranger);
	public static Item saiko_kyutama = new item_kyutama(2, "saiko_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item yagyuu_jubee_mask = new item_kyutama(2, "yagyuu_jubee_mask").setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_kyutama = new item_kyutama(2, "dark_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_shishi_kyutama = new item_kyutama(0, "dark_shishi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kyuranger_kyutama = new Item_ore("kyuranger_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ex_aid_kyutama = new item_skill_kyutama(37, "ex_aid_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item shishi_skill_kyutama = new Item_ore("shishi_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item sasori_skill_kyutama = new Item_ore("sasori_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ookami_skill_kyutama = new Item_ore("ookami_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tenbin_skill_kyutama = new Item_ore("tenbin_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item oushi_skill_kyutama = new Item_ore("oushi_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hebitsukai_skill_kyutama = new Item_ore("hebitsukai_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item chameleon_skill_kyutama = new Item_ore("chameleon_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item washi_skill_kyutama = new Item_ore("washi_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kajiki_skill_kyutama = new Item_ore("kajiki_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ryu_skill_kyutama = new item_kyutama(2, "ryu_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item koguma_skill_kyutama = new Item_ore("koguma_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_skill_kyutama = new Item_ore("houou_skill_kyutama").setCreativeTab(Tabs.tabKyuranger);

	public static Item orion_kyutama = new Item_ore("orion_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tokei_kyutama = new item_skill_kyutama(1, "tokei_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ushikai_kyutama = new item_skill_kyutama(2, "ushikai_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hebi_kyutama = new Item_ore("hebi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item pump_kyutama = new item_skill_kyutama(3, "pump_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hercules_kyutama = new item_skill_kyutama(4, "hercules_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item rashinban_kyutama = new item_skill_kyutama(5, "rashinban_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item bouenkyou_kyutama = new Item_ore("bouenkyou_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item kani_kyutama = new Item_ore("kani_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ooguma_kyutama = new item_skill_kyutama(6, "ooguma_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item uo_kyutama = new item_skill_kyutama(7, "uo_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tate_kyutama = new item_skill_kyutama(8, "tate_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item futago_kyutama = new item_skill_kyutama(9, "futago_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ohitsuji_kyutama = new item_skill_kyutama(10, "ohitsuji_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ikkakuju_kyutama = new item_kyutama("ikkakuju_kyutama", 1).setCreativeTab(Tabs.tabKyuranger);
	public static Item mizugame_kyutama = new item_skill_kyutama(11, "mizugame_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item yagi_kyutama = new Item_ore("yagi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kanmuri_kyutama = new item_skill_kyutama(12, "kanmuri_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item centaurus_kyutama = new item_skill_kyutama(13, "centaurus_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kujaku_kyutama = new Item_ore("kujaku_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item pegasus_kyutama = new item_kyutama("pegasus_kyutama", 2).setCreativeTab(Tabs.tabKyuranger);
	public static Item kaminoke_kyutama = new Item_ore("kaminoke_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ite_kyutama = new item_skill_kyutama(14, "ite_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item perseus_kyutama = new Item_ore("perseus_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kujira_kyutama = new item_skill_kyutama(15, "kujira_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item cassiopeia_kyutama = new item_skill_kyutama(16, "cassiopeia_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tokage_kyutama = new item_skill_kyutama(17, "tokage_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item andromeda_kyutama = new item_skill_kyutama(18, "andromeda_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item genbikyo_kyutama = new item_skill_kyutama(19, "genbikyo_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ryoken_kyutama = new Item_ore("ryoken_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kirin_kyutama = new Item_ore("kirin_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tobiuo_kyutama = new item_skill_kyutama(20, "tobiuo_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item karasu_kyutama = new item_skill_kyutama(21, "karasu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item jyogi_kyutama = new item_skill_kyutama(35, "jyogi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item choukokushitsu_kyutama = new Item_ore("choukokushitsu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item iruka_kyutama = new Item_ore("iruka_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item compass_kyutama = new item_skill_kyutama(36, "compass_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item saidan_kyutama = new Item_ore("saidan_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item otome_kyutama = new Item_ore("otome_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ooinu_kyutama = new Item_ore("ooinu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item sankaku_kyutama = new Item_ore("sankaku_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item cepheus_kyutama = new Item_ore("cepheus_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item koto_kyutama = new item_skill_kyutama(22, "koto_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hakuchou_kyutama = new Item_ore("hakuchou_kyutama").setCreativeTab(Tabs.tabKyuranger);
	//public static Item hae_kyutama = new Item_ore("hae_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hato_kyutama = new item_skill_kyutama(23, "hato_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item gaka_kyutama = new item_skill_kyutama(24, "gaka_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item eridanus_kyutama = new Item_ore("eridanus_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	//public static Item kyoshichou_kyutama = new Item_ore("kyoshichou_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item gyosha_kyutama = new item_skill_kyutama(25, "gyosha_kyutama").setCreativeTab(Tabs.tabKyuranger);
	//public static Item kouma_kyutama = new Item_ore("kouma_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item cup_kyutama = new item_skill_kyutama(26, "cup_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item mizuhebi_kyutama = new Item_ore("mizuhebi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item koinu_kyutama = new item_skill_kyutama(27, "koinu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item umihebi_kyutama = new Item_ore("umihebi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item usagi_kyutama = new item_skill_kyutama(28, "usagi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item chokokugu_kyutama = new item_skill_kyutama(29, "chokokugu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	//public static Item indian_kyutama = new Item_ore("indian_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	//public static Item table_san_kyutama = new Item_ore("table_san_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item fuuchou_kyutama = new item_skill_kyutama(30, "fuuchou_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item minami_juuji_kyutama = new Item_ore("minami_juuji_kyutama").setCreativeTab(Tabs.tabKyuranger);
	//public static Item minami_no_uo_kyutama = new Item_ore("minami_no_uo_kyutama").setCreativeTab(Tabs.tabKyuranger);
	//public static Item minami_no_sankaku_kyutama = new Item_ore("minami_no_sankaku_kyutama").setCreativeTab(Tabs.tabKyuranger);
	//public static Item minami_no_kanmuri_kyutama = new Item_ore("minami_no_kanmuri_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kojishi_kyutama = new Item_ore("kojishi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item reticle_kyutama = new Item_ore("reticle_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item rokubungi_kyutama = new item_skill_kyutama(31, "rokubungi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item hachibungi_kyutama = new item_skill_kyutama(32, "hachibungi_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item tsuru_kyutama = new Item_ore("tsuru_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item kogitsune_kyutama = new item_skill_kyutama(33, "kogitsune_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ro_kyutama = new item_skill_kyutama(34, "ro_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ya_kyutama = new item_kyutama(1, "ya_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item yamaneko_kyutama = new Item_ore("yamaneko_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ho_kyutama = new Item_ore("ho_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item ryukotsu_kyutama = new Item_ore("ryukotsu_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item tomo_kyutama = new Item_ore("tomo_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item argo_kyutama = new Item_ore("argo_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Item cerberus_kyutama = new Item_ore("cerberus_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item halloween_kyutama = new item_kyutama(3, "halloween_kyutama").setCreativeTab(Tabs.tabKyuranger);
	
	public static Item seiza_blaster = new Item_gun("seiza_blaster", Tabs.gun,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item ryutsueder = new Item_sword_gun("ryutsueder", Tabs.sword_gun,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_blade = new ItemBaseSword("houou_blade", Tabs.sword,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_shield = new ItemBaseShield("houou_shield",SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_seiza_blaster = new Item_gun("dark_seiza_blaster", Tabs.gun,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	
	public static Item kyu_sword = new ItemBaseSword("kyu_sword", Tabs.sword,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_spear = new ItemBaseSword("kyu_spear", Tabs.rod,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_claw = new ItemBaseSword("kyu_claw", Tabs.tonfa,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_crossbow = new Item_gun("kyu_crossbow", Tabs.gun,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_axe = new ItemBaseSword("kyu_axe", Tabs.axe,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_sickle = new ItemBaseSword("kyu_sickle", Tabs.rod,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_rapier = new ItemBaseSword("kyu_rapier", Tabs.sword,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_shot = new Item_gun("kyu_shot", Tabs.gun,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_slasher = new ItemBaseSword("kyu_slasher", Tabs.sword,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_kyu_sickle = new ItemBaseSword("dark_kyu_sickle", Tabs.rod,SentaiItems60.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	
	//42 Kaitou Sentai Lupinranger VS Keisatsu Sentai Patranger
	public static Item lupinranger_logo = new Item_ore("lupinranger_logo").setCreativeTab(Tabs.tabLupat);
	public static Item patranger_logo = new Item_ore("patranger_logo").setCreativeTab(Tabs.tabLupat);
	
	public static Item blank_striker = new Item_ore("blank_striker").setCreativeTab(Tabs.tabLupat);
	public static Block vs_vehicle_ore = new ore_block("vs_vehicle_ore", Material.ROCK, blank_striker, 2).setHardness(9.9F).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupat_head = new item_sentai_armor("lupat_head", item_vs_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupat_torso = new item_sentai_armor("lupat_torso", item_vs_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupat_legs = new item_sentai_armor("lupat_legs", item_vs_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item red_vs_changer = new item_vs_changer("red_vs_changer", ArmorMaterial.DIAMOND, 4, "lupin_red").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item blue_vs_changer = new item_vs_changer("blue_vs_changer", ArmorMaterial.DIAMOND, 4, "lupin_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item yellow_vs_changer = new item_vs_changer("yellow_vs_changer", ArmorMaterial.DIAMOND, 4, "lupin_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item ichigou_vs_changer = new item_vs_changer("ichigou_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_1gou").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item nigou_vs_changer = new item_vs_changer("nigou_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_2gou").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item sangou_vs_changer = new item_vs_changer("sangou_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_3gou").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupin_x_changer = new item_vs_changer("lupin_x_changer", ArmorMaterial.DIAMOND, 4, "lupin_x").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item ichigou_girl_vs_changer = new item_vs_changer("ichigou_girl_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_1gou_girl").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item nigou_girl_vs_changer = new item_vs_changer("nigou_girl_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_2gou_girl").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item sangou_guy_vs_changer = new item_vs_changer("sangou_guy_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_3gou_guy").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupat_belt = new Item_ore("lupat_belt");
	
	public static Item blade_boomerang_wing = new Item_ore("blade_boomerang_wing");
	
	public static Item red_dial_fighter = new item_vs_vehicle(0, "red_dial_fighter").setCreativeTab(Tabs.tabLupat);
	public static Item blue_dial_fighter = new item_vs_vehicle(0, "blue_dial_fighter").setCreativeTab(Tabs.tabLupat);
	public static Item yellow_dial_fighter = new item_vs_vehicle(0, "yellow_dial_fighter").setCreativeTab(Tabs.tabLupat);
	
	public static Item ichigou_trigger_machine = new item_vs_vehicle(0, "ichigou_trigger_machine").setCreativeTab(Tabs.tabLupat);
	public static Item nigou_trigger_machine = new item_vs_vehicle(0, "nigou_trigger_machine").setCreativeTab(Tabs.tabLupat);
	public static Item sangou_trigger_machine = new item_vs_vehicle(0, "sangou_trigger_machine").setCreativeTab(Tabs.tabLupat);
	
	public static Item silver_x_train = new item_vs_vehicle(0, "silver_x_train").setCreativeTab(Tabs.tabLupat);
	public static Item gold_x_train = new item_vs_vehicle(0, "gold_x_train").setCreativeTab(Tabs.tabLupat);
	
	public static Item good_striker = new item_vs_vehicle(2, "good_striker").setCreativeTab(Tabs.tabLupat);
	public static Item jackpot_striker = new item_vs_vehicle(1, "jackpot_striker").setCreativeTab(Tabs.tabLupat);
	
	public static Item scissor_dial_fighter = new item_vs_vehicle(3, "scissor_dial_fighter").setCreativeTab(Tabs.tabLupat);
	public static Item magic_dial_fighter = new item_vs_vehicle(5, "magic_dial_fighter").setCreativeTab(Tabs.tabLupat);
	public static Item victory_striker = new item_vs_vehicle(7, "victory_striker").setCreativeTab(Tabs.tabLupat);
	
	public static Item crane_trigger_machine = new item_vs_vehicle(4, "crane_trigger_machine").setCreativeTab(Tabs.tabLupat);
	public static Item splash_trigger_machine = new item_vs_vehicle(6, "splash_trigger_machine").setCreativeTab(Tabs.tabLupat);
	public static Item siren_striker = new item_vs_vehicle(8, "siren_striker").setCreativeTab(Tabs.tabLupat);
	
	public static Item unfinished_lupin_magnum = new Item_ore("unfinished_lupin_magnum").setCreativeTab(Tabs.tabLupat);
	
	public static Item vs_changer = new Item_gun("vs_changer", Tabs.gun,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item x_changer = new item_gun_changer("x_changer", Tabs.gun,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupin_sword = new item_dual_sword("lupin_sword", Tabs.sword,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupin_magnum = new Item_gun("lupin_magnum", Tabs.super_gun,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item pat_megabo = new ItemBaseSword("pat_megabo", Tabs.sword,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item x_rod_sword = new item_dual_sword("x_rod_sword", Tabs.sword,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item scissor_shield = new ItemBaseShield("scissor_shield",SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item blade_boomerang = new ItemBaseSword("blade_boomerang", Tabs.super_sword,SentaiItems60.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	//43 Kishiryu Sentai Ryusoulger
	public static Item ryusoulger_logo = new Item_ore("ryusoulger_logo").setCreativeTab(Tabs.tabRyusoulger);
	public static Item blank_ryusoul = new Item_ore("blank_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Block ryusoulger_ore = new ore_block("ryusoulger_ore", Material.ROCK, blank_ryusoul, 2).setHardness(9.9F).setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoulger_head = new item_sentai_armor("ryusoulger_head", item_ryusoul_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item ryusoulger_torso = new item_sentai_armor("ryusoulger_torso", item_ryusoul_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item ryusoulger_legs = new item_sentai_armor("ryusoulger_legs", item_ryusoul_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item red_ryusoul_changer = new item_ryusoul_changer("red_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_red").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item blue_ryusoul_changer = new item_ryusoul_changer("blue_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item pink_ryusoul_changer = new item_ryusoul_changer("pink_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item green_ryusoul_changer = new item_ryusoul_changer("green_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_green").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item black_ryusoul_changer = new item_ryusoul_changer("black_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_black").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item gold_mosa_changer = new item_ryusoul_changer("gold_mosa_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item gaisorg_changer = new item_ryusoul_changer("gaisorg_changer", ArmorMaterial.DIAMOND, 4, "gaisorg").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item brown_changer = new item_ryusoul_changer("brown_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_brown").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoul_buckle = new Item_ore("ryusoul_buckle");
	public static Item ryusoul_gold_buckle = new Item_ore("ryusoul_gold_buckle");
	public static Item hiehie_soul_wing = new Item_ore("hiehie_soul_wing");
	public static Item hiehie_soul_wing_close = new Item_ore("hiehie_soul_wing_close");
	
	public static Item red_ryusoul = new item_ryusoul(0,"red_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item blue_ryusoul = new item_ryusoul(0,"blue_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item pink_ryusoul = new item_ryusoul(0,"pink_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item green_ryusoul = new item_ryusoul(0,"green_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item black_ryusoul = new item_ryusoul(0,"black_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item gold_ryusoul = new item_ryusoul(0,"gold_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item gai_soul = new item_ryusoul(0,"gai_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item brown_ryusoul = new item_ryusoul(0,"brown_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item tsuyo_soul = new item_ryusoul(1,"tsuyo_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item nobi_soul = new item_ryusoul(2,"nobi_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item omo_soul = new item_ryusoul(3,"omo_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item haya_soul = new item_ryusoul(4,"haya_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kata_soul = new item_ryusoul(5,"kata_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kike_soul = new item_ryusoul(6,"kike_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kusa_soul = new item_ryusoul(7,"kusa_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item mie_soul = new item_ryusoul(8,"mie_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item mukimuki_soul = new item_ryusoul(9,"mukimuki_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item chiisa_soul = new item_ryusoul(10,"chiisa_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item mabushi_soul = new item_ryusoul(11,"mabushi_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item mist_soul = new item_ryusoul(12,"mist_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item karu_soul = new item_ryusoul(13,"karu_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item gyaku_soul = new item_ryusoul(14,"gyaku_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kotae_soul = new item_ryusoul(15,"kotae_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item migake_soul = new item_ryusoul(16,"migake_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kunkun_soul = new item_ryusoul(17,"kunkun_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item pukupuku_soul = new item_ryusoul(18,"pukupuku_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kakure_soul = new item_ryusoul(19,"kakure_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item fue_soul = new item_ryusoul(20,"fue_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item nemu_soul = new item_ryusoul(21,"nemu_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item mawari_soul = new item_ryusoul(22,"mawari_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kawaki_soul = new item_ryusoul(23,"kawaki_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item yawaraka_soul = new item_ryusoul(24,"yawaraka_soul").setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item meramera_soul = new item_ryusoul("meramera_soul",1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item biribiri_soul = new item_ryusoul("biribiri_soul",2).setCreativeTab(Tabs.tabRyusoulger);
	public static Item byubyu_soul = new item_ryusoul("byubyu_soul",0).setCreativeTab(Tabs.tabRyusoulger);
	public static Item kurayami_soul = new item_ryusoul("kurayami_soul",3).setCreativeTab(Tabs.tabRyusoulger);
	public static Item kagayaki_soul = new item_ryusoul("kagayaki_soul",4).setCreativeTab(Tabs.tabRyusoulger);
	public static Item cosmo_soul = new item_ryusoul("cosmo_soul",5).setCreativeTab(Tabs.tabRyusoulger);
	public static Item kanae_soul = new item_ryusoul("kanae_soul",6).setCreativeTab(Tabs.tabRyusoulger);
	public static Item dosshin_soul = new item_ryusoul("dosshin_soul",7).setCreativeTab(Tabs.tabRyusoulger);
	public static Item hiehie_soul = new item_ryusoul("hiehie_soul",8).setCreativeTab(Tabs.tabRyusoulger);
	public static Item max_ryusoul = new item_ryusoul(0,"max_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item kyoryuger_soul = new item_ryusoul(0,"kyoryuger_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item lupinranger_soul = new item_ryusoul(0,"lupinranger_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kirameiger_soul = new item_ryusoul(12,"kirameiger_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item shiawase_soul = new Item_ore("shiawase_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item yamamori_soul = new Item_ore("yamamori_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item unfinished_ryusoul_calibur = new Item_ore("unfinished_ryusoul_calibur").setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoul_ken = new ItemBaseSword("ryusoul_ken", Tabs.sword,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item mosa_changer = new Item_gun("mosa_changer", Tabs.gun,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item mosa_blade = new ItemBaseSword("mosa_blade", Tabs.sword,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item mosa_breaker = new Item_gun("mosa_breaker", Tabs.super_gun,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setContainerItem(SentaiItems60.mosa_changer).setCreativeTab(Tabs.tabRyusoulger);
	public static Item gaisoul_ken = new ItemBaseSword("gaisoul_ken", Tabs.sword,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item gaisoul_shield = new ItemBaseShield("gaisoul_shield",SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item brown_ryusoul_ken = new ItemBaseSword("brown_ryusoul_ken", Tabs.sword,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item brown_ryusoul_shield = new ItemBaseShield("brown_ryusoul_shield",SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item max_ryusoul_changer = new ItemBaseSword("max_ryusoul_changer", Tabs.sword,SentaiItems60.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item ryusoul_calibur = new item_ryusoul_calibur("ryusoul_calibur", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	//44 Mashin Sentai Kirameiger
	public static Item kirameiger_logo = new Item_ore("kirameiger_logo").setCreativeTab(Tabs.tabKirameiger);
	public static Item blue_diamond = new Item_ore("blue_diamond").setCreativeTab(Tabs.tabKirameiger);
	public static Block kirameiger_ore = new ore_block("kirameiger_ore", Material.ROCK, blue_diamond, 2).setHardness(9.9F).setCreativeTab(Tabs.tabKirameiger);
		
	public static Item kirameiger_head = new item_sentai_armor("kirameiger_head", item_kiramei_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blue_diamond).setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item kirameiger_torso = new item_sentai_armor("kirameiger_torso", item_kiramei_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blue_diamond).setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item kirameiger_legs = new item_sentai_armor("kirameiger_legs", item_kiramei_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blue_diamond).setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	
	public static Item red_kiramei_changer = new item_kiramei_changer("red_kiramei_changer", ArmorMaterial.DIAMOND, 4, "kiramei_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item yellow_kiramei_changer = new item_kiramei_changer("yellow_kiramei_changer", ArmorMaterial.DIAMOND, 4, "kiramei_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item green_kiramei_changer = new item_kiramei_changer("green_kiramei_changer", ArmorMaterial.DIAMOND, 4, "kiramei_green").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item blue_kiramei_changer = new item_kiramei_changer("blue_kiramei_changer", ArmorMaterial.DIAMOND, 4, "kiramei_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item pink_kiramei_changer = new item_kiramei_changer("pink_kiramei_changer", ArmorMaterial.DIAMOND, 4, "kiramei_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item shiny_kiramei_changer = new item_kiramei_changer("shiny_kiramei_changer", ArmorMaterial.DIAMOND, 4, "kiramei_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item yodon_changer = new item_kiramei_changer("yodon_changer", ArmorMaterial.DIAMOND, 4, "dark_kiramei_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item gold_kiraful_go_arrow = new item_kiramei_changer("gold_kiraful_go_arrow", ArmorMaterial.DIAMOND, 4, "kiramei_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
		
	public static Item kiramei_red_belt = new Item_ore("kiramei_red_belt");
	public static Item kiramei_yellow_belt = new Item_ore("kiramei_yellow_belt");
	public static Item kiramei_green_belt = new Item_ore("kiramei_green_belt");
	public static Item kiramei_blue_belt = new Item_ore("kiramei_blue_belt");
	public static Item kiramei_pink_belt = new Item_ore("kiramei_pink_belt");
	public static Item kiramei_silver_belt = new Item_ore("kiramei_silver_belt");
	public static Item kiramei_gold_belt = new Item_ore("kiramei_gold_belt");
	
	public static Item red_kiramei_stone = new item_kiramei_stone(0,"red_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item yellow_kiramei_stone = new item_kiramei_stone(0,"yellow_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item green_kiramei_stone = new item_kiramei_stone(0,"green_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item blue_kiramei_stone = new item_kiramei_stone(0,"blue_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item pink_kiramei_stone = new item_kiramei_stone(0,"pink_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item shiny_kiramei_stone = new item_kiramei_stone(0,"shiny_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item dark_kiramei_stone = new item_kiramei_stone(0,"dark_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item gold_kiramei_stone = new item_kiramei_stone(0,"gold_kiramei_stone").setCreativeTab(Tabs.tabKirameiger);
	
	public static Item destoria_kanaema_stone = new item_kanaema_stone(1,"destoria_kanaema_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item reversia_kanaema_stone = new item_kanaema_stone(2,"reversia_kanaema_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item energia_kanaema_stone = new item_kanaema_stone(3,"energia_kanaema_stone").setCreativeTab(Tabs.tabKirameiger);
	public static Item illusia_kanaema_stone = new item_kanaema_stone(4,"illusia_kanaema_stone").setCreativeTab(Tabs.tabKirameiger);
	
	public static Item kiraful_go_arrow = new item_kiraful_go_arrow("kiraful_go_arrow", Tabs.super_gun).setCreativeTab(Tabs.tabKirameiger);
	public static Item kiramei_sword = new ItemBaseSword("kiramei_sword", Tabs.sword,SentaiItems60.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	public static Item kiramei_shot = new Item_gun("kiramei_shot", Tabs.gun,SentaiItems60.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	public static Item kiramei_buster = new Item_gun("kiramei_buster", Tabs.super_gun,SentaiItems60.blue_diamond).setContainerItem(SentaiItems60.kiramei_shot).setCreativeTab(Tabs.tabKirameiger);
	public static Item shiny_breaker = new Item_sword_gun("shiny_breaker", Tabs.sword_gun,SentaiItems60.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	public static Item shiny_breaker_tool = new item_shiny_breaker("shiny_breaker_tool", Tabs.sword_gun).setCreativeTab(Tabs.tabKirameiger);
	public static Item yellow_stone_hammer = new ItemBaseSword("yellow_stone_hammer", Tabs.hammer,SentaiItems60.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	
	//45 Kikai Sentai Zenkaiger
	public static Item zenkaiger_logo = new Item_ore("zenkaiger_logo").setCreativeTab(Tabs.tabZenkaiger);
	public static Item blank_sentai_gear = new Item_ore("blank_sentai_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item blank_dark_sentai_gear = new Item_ore("blank_dark_sentai_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item tojiru_gear = new item_zenkai_gear(1,"tojiru_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Block zenkaiger_ore = new ore_block("zenkaiger_ore", Material.ROCK, blank_sentai_gear, 2).setHardness(9.9F).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zenkaiger_head = new item_zenkaiger_armor("zenkaiger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkaiger_torso = new item_zenkaiger_armor2("zenkaiger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkaiger_legs = new item_zenkaiger_armor2("zenkaiger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zenkaizer_geartlinger = new item_geartlinger("zenkaizer_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkaizer").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item juran_geartlinger = new item_geartlinger("juran_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_juran").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item gaon_geartlinger = new item_geartlinger("gaon_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_gaon").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item magine_geartlinger = new item_geartlinger("magine_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_magine").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item vroon_geartlinger = new item_geartlinger("vroon_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_vroon").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokaizer_geardalinger = new item_geartlinger("twokaizer_geardalinger", ArmorMaterial.DIAMOND, 4, "twokaizer", "twokaizer_base").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item stacaeser_geartozinger = new item_geartlinger("stacaeser_geartozinger", ArmorMaterial.DIAMOND, 4, "stacaesar").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item hakaizer_belt = new item_geartlinger("hakaizer_belt", ArmorMaterial.DIAMOND, 4, "hakaizer").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_geartlinger = new item_geartlinger("red_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_red").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokai_flint_geardalinger = new item_geartlinger("twokai_flint_geardalinger", ArmorMaterial.DIAMOND, 4, "twokai_flint", "twokai_flint_base").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item mecha_dark_gear = new item_geartlinger("mecha_dark_gear", ArmorMaterial.DIAMOND, 4, "mecha").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zenkaizer_belt = new Item_ore("zenkaizer_belt");
	public static Item zenkai_juran_belt = new Item_ore("zenkai_juran_belt");
	public static Item zenkai_magine_belt = new Item_ore("zenkai_magine_belt");
	public static Item twokaizer_belt = new Item_ore("twokaizer_belt");
	public static Item stacaesar_belt = new Item_ore("stacaesar_belt");
	public static Item zenkai_zyuoh_wings = new Item_ore("zenkai_zyuoh_wings");
	public static Item hakaizer_wings = new Item_ore("hakaizer_wings");
	
	public static Item zenkaizer_gear = new item_zenkai_gear(0, "zenkaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_juran_gear = new item_zenkai_gear(0, "zenkai_juran_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_gaon_gear = new item_zenkai_gear(0, "zenkai_gaon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_magine_gear = new item_zenkai_gear(0, "zenkai_magine_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_vroon_gear = new item_zenkai_gear(0, "zenkai_vroon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokaizer_gear = new item_zenkai_gear(1, "twokaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item stacaesar_gear = new item_zenkai_gear(0, "stacaesar_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_red_gear = new item_zenkai_gear(0, "zenkai_red_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokai_flint_gear = new item_zenkai_gear(1, "twokai_flint_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item twokai_cutanner_gear = new item_zenkai_gear(2, "twokai_cutanner_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokai_ricky_gear = new item_zenkai_gear(3, "twokai_ricky_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_zyu_gear = new item_zenkai_gear(1, "zenkai_zyu_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item kirameki_zenkai_zyu_gear = new Item_ore("kirameki_zenkai_zyu_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item goranger_gear = new item_sentai_gear(1, "goranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item jakq_gear = new item_sentai_gear(2, "jakq_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item battle_fever_gear = new item_sentai_gear(3, "battle_fever_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item denziman_gear = new item_sentai_gear(4, "denziman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item sun_vulcan_gear = new item_sentai_gear(5, "sun_vulcan_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item goggle_v_gear = new item_sentai_gear(6, "goggle_v_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dynaman_gear = new item_sentai_gear(7, "dynaman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item bioman_gear = new item_sentai_gear(8, "bioman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item changeman_gear = new item_sentai_gear(9, "changeman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item flashman_gear = new item_sentai_gear(10, "flashman_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item maskman_gear = new item_sentai_gear(11, "maskman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item liveman_gear = new item_sentai_gear(12, "liveman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item turboranger_gear = new item_sentai_gear(13, "turboranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item fiveman_gear = new item_sentai_gear(14, "fiveman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item jetman_gear = new item_sentai_gear(15, "jetman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zyuranger_gear = new item_sentai_gear(16, "zyuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dairanger_gear = new item_sentai_gear(17, "dairanger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item kakuranger_gear = new item_sentai_gear(18, "kakuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item ohranger_gear = new item_sentai_gear(19, "ohranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item carranger_gear = new item_sentai_gear(20, "carranger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item megaranger_gear = new item_sentai_gear(21, "megaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item gingaman_gear = new item_sentai_gear(22, "gingaman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item gogo_v_gear = new item_sentai_gear(23, "gogo_v_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item timeranger_gear = new item_sentai_gear(24, "timeranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item gaoranger_gear = new item_sentai_gear(25, "gaoranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item hurricaneger_gear = new item_sentai_gear(26, "hurricaneger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item abaranger_gear = new item_sentai_gear(27, "abaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dekaranger_gear = new item_sentai_gear(28, "dekaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item magiranger_gear = new item_sentai_gear(29, "magiranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item boukenger_gear = new item_sentai_gear(30, "boukenger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item gekiranger_gear = new item_sentai_gear(31, "gekiranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item go_onger_gear = new item_sentai_gear(32, "go_onger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item shinkenger_gear = new item_sentai_gear(33, "shinkenger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item goseiger_gear = new item_sentai_gear(34, "goseiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item gokaiger_gear = new item_sentai_gear(35, "gokaiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item go_busters_gear = new item_sentai_gear(36, "go_busters_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item kyoryuger_gear = new item_sentai_gear(37, "kyoryuger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item toqger_gear = new item_sentai_gear(38, "toqger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item ninninger_gear = new item_sentai_gear(39, "ninninger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zyuohger_gear = new item_sentai_gear(40, "zyuohger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item kyuranger_gear = new item_sentai_gear(41, "kyuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item lupinranger_gear = new item_sentai_gear(42, "lupinranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item patranger_gear = new item_sentai_gear(42, "patranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item ryusoulger_gear = new item_sentai_gear(43, "ryusoulger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item kirameiger_gear = new item_sentai_gear(44, "kirameiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item new_zenkaizer_gear = new item_zenkai_gear(0, "new_zenkaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item don_brothers_gear = new item_sentai_gear(46, "don_brothers_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item akibaranger_gear = new item_sentai_gear(0, "akibaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item dark_goranger_gear = new item_dark_gear(1, "dark_goranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_jakq_gear = new item_dark_gear(2, "dark_jakq_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_battle_fever_gear = new item_dark_gear(3, "dark_battle_fever_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_denziman_gear = new item_dark_gear(4, "dark_denziman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_sun_vulcan_gear = new item_dark_gear(5, "dark_sun_vulcan_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_goggle_v_gear = new item_dark_gear(6, "dark_goggle_v_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_dynaman_gear = new item_dark_gear(7, "dark_dynaman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_bioman_gear = new item_dark_gear(8, "dark_bioman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_changeman_gear = new item_dark_gear(9, "dark_changeman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_flashman_gear = new item_dark_gear(10, "dark_flashman_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item dark_maskman_gear = new item_dark_gear(11, "dark_maskman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_liveman_gear = new item_dark_gear(12, "dark_liveman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_turboranger_gear = new item_dark_gear(13, "dark_turboranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_fiveman_gear = new item_dark_gear(14, "dark_fiveman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_jetman_gear = new item_dark_gear(15, "dark_jetman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_zyuranger_gear = new item_dark_gear(16, "dark_zyuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_dairanger_gear = new item_dark_gear(17, "dark_dairanger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_kakuranger_gear = new item_dark_gear(18, "dark_kakuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_ohranger_gear = new item_dark_gear(19, "dark_ohranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_carranger_gear = new item_dark_gear(20, "dark_carranger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item dark_megaranger_gear = new item_dark_gear(21, "dark_megaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_gingaman_gear = new item_dark_gear(22, "dark_gingaman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_gogo_v_gear = new item_dark_gear(23, "dark_gogo_v_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_timeranger_gear = new item_dark_gear(24, "dark_timeranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_gaoranger_gear = new item_dark_gear(25, "dark_gaoranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_hurricaneger_gear = new item_dark_gear(26, "dark_hurricaneger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_abaranger_gear = new item_dark_gear(27, "dark_abaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_dekaranger_gear = new item_dark_gear(28, "dark_dekaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_magiranger_gear = new item_dark_gear(29, "dark_magiranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_boukenger_gear = new item_dark_gear(30, "dark_boukenger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item dark_gekiranger_gear = new item_dark_gear(31, "dark_gekiranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_go_onger_gear = new item_dark_gear(32, "dark_go_onger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_shinkenger_gear = new item_dark_gear(33, "dark_shinkenger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_goseiger_gear = new item_dark_gear(34, "dark_goseiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_gokaiger_gear = new item_dark_gear(35, "dark_gokaiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_go_busters_gear = new item_dark_gear(36, "dark_go_busters_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_kyoryuger_gear = new item_dark_gear(37, "dark_kyoryuger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_toqger_gear = new item_dark_gear(38, "dark_toqger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_ninninger_gear = new item_dark_gear(39, "dark_ninninger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_zyuohger_gear = new item_dark_gear(40, "dark_zyuohger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item dark_kyuranger_gear = new item_dark_gear(41, "dark_kyuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_lupinranger_gear = new item_dark_gear(42, "dark_lupinranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_patranger_gear = new item_dark_gear(43, "dark_patranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_ryusoulger_gear = new item_dark_gear(44, "dark_ryusoulger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_kirameiger_gear = new item_dark_gear(45, "dark_kirameiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item dark_zenkai_juran_gear = new Item_ore("dark_zenkai_juran_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_zenkai_gaon_gear = new Item_ore("dark_zenkai_gaon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_zenkai_magine_gear = new Item_ore("dark_zenkai_magine_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_zenkai_vroon_gear = new Item_ore("dark_zenkai_vroon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_twokaizer_gear = new Item_ore("dark_twokaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_twokai_cutanner_gear = new Item_ore("dark_twokai_cutanner_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item dark_twokai_ricky_gear = new Item_ore("dark_twokai_ricky_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item red_goranger_gear = new item_sentai_gear(1, "red_goranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_jakq_gear = new item_sentai_gear(2, "red_jakq_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_battle_fever_gear = new item_sentai_gear(3, "red_battle_fever_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_denziman_gear = new item_sentai_gear(4, "red_denziman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_sun_vulcan_gear = new item_sentai_gear(5, "red_sun_vulcan_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_goggle_v_gear = new item_sentai_gear(6, "red_goggle_v_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_dynaman_gear = new item_sentai_gear(7, "red_dynaman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_bioman_gear = new item_sentai_gear(8, "red_bioman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_changeman_gear = new item_sentai_gear(9, "red_changeman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_flashman_gear = new item_sentai_gear(10, "red_flashman_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item red_maskman_gear = new item_sentai_gear(11, "red_maskman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_liveman_gear = new item_sentai_gear(12, "red_liveman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_turboranger_gear = new item_sentai_gear(13, "red_turboranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_fiveman_gear = new item_sentai_gear(14, "red_fiveman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_jetman_gear = new item_sentai_gear(15, "red_jetman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_zyuranger_gear = new item_sentai_gear(16, "red_zyuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_dairanger_gear = new item_sentai_gear(17, "red_dairanger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_kakuranger_gear = new item_sentai_gear(18, "red_kakuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_ohranger_gear = new item_sentai_gear(19, "red_ohranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_carranger_gear = new item_sentai_gear(20, "red_carranger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item red_megaranger_gear = new item_sentai_gear(21, "red_megaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_gingaman_gear = new item_sentai_gear(22, "red_gingaman_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_gogo_v_gear = new item_sentai_gear(23, "red_gogo_v_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_timeranger_gear = new item_sentai_gear(24, "red_timeranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_gaoranger_gear = new item_sentai_gear(25, "red_gaoranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_hurricaneger_gear = new item_sentai_gear(26, "red_hurricaneger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_abaranger_gear = new item_sentai_gear(27, "red_abaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_dekaranger_gear = new item_sentai_gear(28, "red_dekaranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_magiranger_gear = new item_sentai_gear(29, "red_magiranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_boukenger_gear = new item_sentai_gear(30, "red_boukenger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item red_gekiranger_gear = new item_sentai_gear(31, "red_gekiranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_go_onger_gear = new item_sentai_gear(32, "red_go_onger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_shinkenger_gear = new item_sentai_gear(33, "red_shinkenger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_goseiger_gear = new item_sentai_gear(34, "red_goseiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_gokaiger_gear = new item_sentai_gear(35, "red_gokaiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_go_busters_gear = new item_sentai_gear(36, "red_go_busters_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_kyoryuger_gear = new item_sentai_gear(37, "red_kyoryuger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_toqger_gear = new item_sentai_gear(38, "red_toqger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_ninninger_gear = new item_sentai_gear(39, "red_ninninger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_zyuohger_gear = new item_sentai_gear(40, "red_zyuohger_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item red_kyuranger_gear = new item_sentai_gear(41, "red_kyuranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_lupinranger_gear = new item_sentai_gear(42, "red_lupinranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_patranger_gear = new item_sentai_gear(42, "red_patranger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_ryusoulger_gear = new item_sentai_gear(43, "red_ryusoulger_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_kirameiger_gear = new item_sentai_gear(44, "red_kirameiger_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item metallic_zenkaizer_gear = new Item_ore("metallic_zenkaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item metallic_zenkai_juran_gear = new item_zenkai_gear(1, "metallic_zenkai_juran_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item metallic_zenkai_gaon_gear = new item_zenkai_gear(1, "metallic_zenkai_gaon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item metallic_zenkai_magine_gear = new item_zenkai_gear(1, "metallic_zenkai_magine_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item metallic_zenkai_vroon_gear = new item_zenkai_gear(1, "metallic_zenkai_vroon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item metallic_twokaizer_gear = new item_sentai_gear(0, "metallic_twokaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item super_sentai_gear = new Item_ore("super_sentai_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkaiger_asobou_gear = new Item_ore("zenkaiger_asobou_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item super_hero_time_gear = new Item_ore("super_hero_time_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zi_o_gear = new item_sentai_gear(0, "zi_o_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zero_one_gear = new item_sentai_gear(0, "zero_one_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item saber_gear = new item_sentai_gear(0, "saber_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item geartlinger = new Item_gun("geartlinger", Tabs.gun,SentaiItems60.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item geardalinger = new Item_sword_gun("geardalinger", Tabs.sword_gun,SentaiItems60.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item geartozinger = new Item_gun("geartozinger", Tabs.gun,SentaiItems60.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item juran_sword = new ItemBaseSword("juran_sword",Tabs.sword,SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item juran_shield = new ItemBaseShield("juran_shield",SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item gaon_claw = new ItemBaseSword("gaon_claw",Tabs.sword,SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item magine_stick = new ItemBaseSword("magine_stick",Tabs.rod,SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item vroon_picker = new ItemBaseSword("vroon_picker",Tabs.axe,SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item tail_drill = new ItemBaseSword("tail_drill",Tabs.super_sword,SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenryoku_zenkai_cannon = new Item_gun("zenryoku_zenkai_cannon", Tabs.bazooka,SentaiItems60.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item sta_shield = new ItemBaseShield("sta_shield",SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item v_merang = new ItemBaseSword("v_merang",Tabs.super_sword,SentaiItems60.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item white_ribbon = new ItemBaseSword("white_ribbon",Tabs.whip,SentaiItems20.goggle_v_logo).setCreativeTab(Tabs.tabZenkaiger);

	//46 Avatarou Sentai DonBrothers
	public static Item donbro_buckle = new Item_ore("donbro_buckle");
	
	public static void init() 
	{
		
	}
	
	//public static void init(){}
}