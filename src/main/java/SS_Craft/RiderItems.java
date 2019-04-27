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
import SS_Craft.item.battle_fever.item_battle_fever_armor;
import SS_Craft.item.battle_fever.item_battle_fever_armor2;
import SS_Craft.item.battle_fever.item_battleceiver;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.boukenger.item_bouken_spirit;
import SS_Craft.item.boukenger.item_boukenger_armor;
import SS_Craft.item.boukenger.item_boukenger_armor2;
import SS_Craft.item.carranger.item_accel_changer;
import SS_Craft.item.carranger.item_carranger_armor;
import SS_Craft.item.carranger.item_carranger_armor2;
import SS_Craft.item.denziman.item_denzi_punch;
import SS_Craft.item.denziman.item_denzi_ring;
import SS_Craft.item.denziman.item_denziman_armor;
import SS_Craft.item.denziman.item_denziman_armor2;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gaoranger.item_gaoranger_armor;
import SS_Craft.item.gaoranger.item_gaoranger_armor2;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.gingaman.item_ginga_medal;
import SS_Craft.item.gingaman.item_gingaman_armor;
import SS_Craft.item.gingaman.item_gingaman_armor2;
import SS_Craft.item.go_busters.item_enetron;
import SS_Craft.item.go_busters.item_go_busters_armor;
import SS_Craft.item.go_busters.item_go_busters_armor2;
import SS_Craft.item.go_busters.item_morphin_brace;
import SS_Craft.item.gogo_v.item_gogo_brace;
import SS_Craft.item.gogo_v.item_gogo_v_armor;
import SS_Craft.item.gogo_v.item_gogo_v_armor2;
import SS_Craft.item.gogo_v.item_v_mode_brace;
import SS_Craft.item.gokaiger.item_mobirates;
import SS_Craft.item.gokaiger.item_ranger_key;
import SS_Craft.item.goranger.item_goranger_armor;
import SS_Craft.item.goranger.item_goranger_armor2;
import SS_Craft.item.goranger.item_goranger_belt;
import SS_Craft.item.jakq.item_jakq_armor;
import SS_Craft.item.jakq.item_jakq_armor2;
import SS_Craft.item.jakq.item_powered_capsule;
import SS_Craft.item.kawarimono.item_kawarimono_armor;
import SS_Craft.item.kawarimono.item_kawarimono_armor2;
import SS_Craft.item.kyuranger.item_kyutama;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.lupatranger.item_lupat_armor;
import SS_Craft.item.lupatranger.item_lupat_armor2;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.lupatranger.item_vs_vehicle;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.maskman.item_maskman_armor;
import SS_Craft.item.maskman.item_maskman_armor2;
import SS_Craft.item.ninninger.item_nin_shuriken;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.item.ryusoulger.item_ryusoulger_armor;
import SS_Craft.item.ryusoulger.item_ryusoulger_armor2;
import SS_Craft.item.shinkenger.item_secret_disk;
import SS_Craft.item.shinkenger.item_shinkenger_armor;
import SS_Craft.item.shinkenger.item_shinkenger_armor2;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.item.sun_vulcan.item_sun_vulcan_armor;
import SS_Craft.item.sun_vulcan.item_sun_vulcan_armor2;
import SS_Craft.item.sun_vulcan.item_vulcan_brace;
import SS_Craft.item.toqger.item_toq_changer;
import SS_Craft.item.toqger.item_toq_ressha;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.item.turboranger.item_turboranger_armor;
import SS_Craft.item.turboranger.item_turboranger_armor2;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.item.zyuohger.item_zyuoh_cube;
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

public class RiderItems 
{
	public static Item blanknoitem = new Item_ore("blanknoitem");
	
	//Kawarimono Team
	public static Item kawarimono_head = new item_kawarimono_armor("kawarimono_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item kawarimono_torso = new item_kawarimono_armor2("kawarimono_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item kawarimono_legs = new item_kawarimono_armor2("kawarimono_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item eagle_zyuoh_changer = new item_zyuoh_changer("eagle_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_eagle").setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item zyuoh_whale_change_gun = new item_zyuoh_changer("zyuoh_whale_change_gun", ArmorMaterial.DIAMOND, 4, "zyuoh_whale").setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item red_mobirates = new item_mobirates("red_mobirates", ArmorMaterial.DIAMOND, 4, "gokai_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item aka_ninja_ichibantou = new item_ninja_ichibantou("aka_ninja_ichibantou", ArmorMaterial.DIAMOND, 4, "aka_ninger").setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item orange_seiza_blaster = new item_seiza_blaster("orange_seiza_blaster", ArmorMaterial.DIAMOND, 4,"sasori_orange").setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item gogou_toq_changer = new item_toq_changer("gogou_toq_changer", ArmorMaterial.DIAMOND, 4,"toq_5gou").setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item zyuohger_belt = new Item_ore("zyuohger_belt");
	public static Item zyuoh_eagle_wing = new Item_ore("zyuoh_eagle_wing");
	
	public static Item gokaiger_belt = new Item_ore("gokaiger_belt");
	
	public static Item kyu_buckle = new Item_ore("kyu_buckle");
	
	public static Item toq_buckle = new Item_ore("toq_buckle");
	
	public static Item eagle_cube = new item_zyuoh_cube(0, "eagle_cube").setCreativeTab(Tabs.tabKawarimono);
	public static Item gorilla_cube = new item_zyuoh_cube(1, "gorilla_cube").setCreativeTab(Tabs.tabKawarimono);
	public static Item whale_cube = new item_zyuoh_cube(2, "whale_cube").setCreativeTab(Tabs.tabKawarimono);
	
	public static Item gokai_red_key = new item_ranger_key(0, "gokai_red_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item akaranger_key = new item_ranger_key(1, "akaranger_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item spade_ace_key = new item_ranger_key(2, "spade_ace_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item vul_eagle_key = new item_ranger_key(5, "vul_eagle_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item red_mask_key = new item_ranger_key(11, "red_mask_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item red_racer_key = new item_ranger_key(20, "red_racer_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item ginga_red_key = new item_ranger_key(22, "ginga_red_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item gao_red_key = new item_ranger_key(25, "gao_red_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item shinken_red_key = new item_ranger_key(33, "shinken_red_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item aka_ninger_key = new item_ranger_key(38, "aka_ninger_key").setCreativeTab(Tabs.tabKawarimono);
	public static Item gold_anchor_key = new item_ranger_key("gold_anchor_key", 1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item aka_ninger_shuriken = new item_nin_shuriken(0, "aka_ninger_shuriken").setCreativeTab(Tabs.tabKawarimono);
	public static Item chouzetsu_shoubu_changer = new item_nin_shuriken(1, "chouzetsu_shoubu_changer").setCreativeTab(Tabs.tabKawarimono);
	
	public static Item sasori_kyutama = new item_kyutama(0, "sasori_kyutama").setCreativeTab(Tabs.tabKawarimono);
	public static Item ikkakuju_kyutama = new item_kyutama(1, "ikkakuju_kyutama").setCreativeTab(Tabs.tabKawarimono);
	
	public static Item pink_ressha = new item_toq_ressha(0, "pink_ressha").setCreativeTab(Tabs.tabKawarimono);
	public static Item hyper_ressha = new item_toq_ressha(1, "hyper_ressha").setCreativeTab(Tabs.tabKawarimono);
	
	public static Item whale_change_gun = new item_gun_changer("whale_change_gun", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item eag_riser = new ItemBaseSword("eag_riser", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item zyuoh_buster = new Item_sword_gun("zyuoh_buster", Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item gokai_saber = new ItemBaseSword("gokai_saber", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item gokai_gun = new Item_gun("gokai_gun", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item gokai_spear_anchor = new ItemBaseSword("gokai_spear_anchor", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item ninja_ichibantou = new ItemBaseSword("ninja_ichibantou", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item karakuri_hengen = new ItemBaseSword("karakuri_hengen", Tabs.throwable).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item karakuri_hengen_sword = new ItemBaseSword("karakuri_hengen_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item karakuri_hengen_bow = new Item_gun("karakuri_hengen_bow", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item karakuri_hengen_claw = new ItemBaseSword("karakuri_hengen_claw", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item gama_gama_gun = new Item_gun("gama_gama_gun", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item seiza_blaster = new Item_gun("seiza_blaster", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	public static Item toq_blaster = new Item_sword_gun("toq_blaster", Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item tekkyou_claw = new ItemBaseSword("tekkyou_claw", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	public static Item daikaiten_cannon = new Item_gun("daikaiten_cannon", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabKawarimono);
	
	//01 Himitsu Sentai Goranger
	public static Item goranger_logo = new Item_ore("goranger_logo").setCreativeTab(Tabs.tabGoranger);
	public static Block goranger_ore = new ore_block("goranger_ore", Material.ROCK, goranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoranger);
	
	public static Item goranger_head = new item_goranger_armor("goranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item goranger_torso = new item_goranger_armor2("goranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item goranger_legs = new item_goranger_armor2("goranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	
	public static Item akaranger_belt = new item_goranger_belt("akaranger_belt", ArmorMaterial.DIAMOND, 4, "akaranger").setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item aoranger_belt = new item_goranger_belt("aoranger_belt", ArmorMaterial.DIAMOND, 4, "aoranger").setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item kiranger_belt = new item_goranger_belt("kiranger_belt", ArmorMaterial.DIAMOND, 4, "kiranger").setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item momoranger_belt = new item_goranger_belt("momoranger_belt", ArmorMaterial.DIAMOND, 4, "momoranger").setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item midoranger_belt = new item_goranger_belt("midoranger_belt", ArmorMaterial.DIAMOND, 4, "midoranger").setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	
	public static Item aka_star = new Item_ore("aka_star").setCreativeTab(Tabs.tabGoranger);
	public static Item ao_star = new Item_ore("ao_star").setCreativeTab(Tabs.tabGoranger);
	public static Item ki_star = new Item_ore("ki_star").setCreativeTab(Tabs.tabGoranger);
	public static Item momo_star = new Item_ore("momo_star").setCreativeTab(Tabs.tabGoranger);
	public static Item mido_star = new Item_ore("mido_star").setCreativeTab(Tabs.tabGoranger);
	
	public static Item red_bute = new ItemBaseSword("red_bute", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item silver_shot = new Item_gun("silver_shot", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item blue_cherry = new Item_gun("blue_cherry", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item ultra_blue_cherry = new Item_gun("ultra_blue_cherry", Tabs.stronger_bow).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item ki_sticker = new ItemBaseSword("ki_sticker", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item earring_bomb = new ItemBaseSword("earring_bomb", Tabs.bomb).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item midomerang = new ItemBaseSword("midomerang", Tabs.boomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	
	//02 J.A.K.Q. Dengekitai
	public static Item blank_card = new Item_ore("blank_card").setCreativeTab(Tabs.tabJakq);
	public static Block jakq_ore = new ore_block("jakq_ore", Material.ROCK, blank_card, 2).setHardness(9.9F).setCreativeTab(Tabs.tabJakq);
	
	public static Item jakq_head = new item_jakq_armor("jakq_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item jakq_torso = new item_jakq_armor2("jakq_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item jakq_legs = new item_jakq_armor2("jakq_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	
	public static Item ace_powered_capsule = new item_powered_capsule("ace_powered_capsule", ArmorMaterial.DIAMOND, 4, "spade_ace").setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item jack_powered_capsule = new item_powered_capsule("jack_powered_capsule", ArmorMaterial.DIAMOND, 4, "dia_jack").setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item queen_powered_capsule = new item_powered_capsule("queen_powered_capsule", ArmorMaterial.DIAMOND, 4, "heart_queen").setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item king_powered_capsule = new item_powered_capsule("king_powered_capsule", ArmorMaterial.DIAMOND, 4, "clover_king").setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item big_one_red_rose = new item_powered_capsule("big_one_red_rose", ArmorMaterial.DIAMOND, 4, "big_one").setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);

	public static Item jakq_belt = new Item_ore("jakq_belt");
	public static Item big_one_belt = new Item_ore("big_one_belt");
	
	public static Item ace_card = new Item_ore("ace_card").setCreativeTab(Tabs.tabJakq);
	public static Item jack_card = new Item_ore("jack_card").setCreativeTab(Tabs.tabJakq);
	public static Item queen_card = new Item_ore("queen_card").setCreativeTab(Tabs.tabJakq);
	public static Item king_card = new Item_ore("king_card").setCreativeTab(Tabs.tabJakq);
	public static Item big_one_card = new Item_ore("big_one_card").setCreativeTab(Tabs.tabJakq);
	
	public static Item spade_arts = new Item_gun("spade_arts", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item dia_sword = new ItemBaseSword("dia_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item heart_cute = new ItemBaseSword("heart_cute", Tabs.throwable).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item club_megaton = new ItemBaseSword("club_megaton", Tabs.megaton).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item big_baton = new ItemBaseSword("big_baton", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	
	//03 Battle Fever J
	public static Item battle_fever_logo = new Item_ore("battle_fever_logo").setCreativeTab(Tabs.tabBattleFever);
	public static Block battle_fever_ore = new ore_block("battle_fever_ore", Material.ROCK, battle_fever_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item battle_fever_head = new item_battle_fever_armor("battle_fever_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_fever_torso = new item_battle_fever_armor2("battle_fever_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_fever_legs = new item_battle_fever_armor2("battle_fever_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item japan_battleceiver = new item_battleceiver("japan_battleceiver", ArmorMaterial.DIAMOND, 4, "battle_japan").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item cossack_battleceiver = new item_battleceiver("cossack_battleceiver", ArmorMaterial.DIAMOND, 4, "battle_cossack").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item france_battleceiver = new item_battleceiver("france_battleceiver", ArmorMaterial.DIAMOND, 4, "battle_france").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item kenya_battleceiver = new item_battleceiver("kenya_battleceiver", ArmorMaterial.DIAMOND, 4, "battle_kenya").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item america_battleceiver = new item_battleceiver("america_battleceiver", ArmorMaterial.DIAMOND, 4, "miss_america").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item battle_japan_belt = new Item_ore("battle_japan_belt");
	public static Item battle_cossack_belt = new Item_ore("battle_cossack_belt");
	public static Item battle_france_belt = new Item_ore("battle_france_belt");
	public static Item battle_kenya_belt = new Item_ore("battle_kenya_belt");
	public static Item miss_america_belt = new Item_ore("miss_america_belt");
	
	public static Item japan_badge = new Item_ore("japan_badge").setCreativeTab(Tabs.tabBattleFever);
	public static Item cossack_badge = new Item_ore("cossack_badge").setCreativeTab(Tabs.tabBattleFever);
	public static Item france_badge = new Item_ore("france_badge").setCreativeTab(Tabs.tabBattleFever);
	public static Item kenya_badge = new Item_ore("kenya_badge").setCreativeTab(Tabs.tabBattleFever);
	public static Item america_badge = new Item_ore("america_badge").setCreativeTab(Tabs.tabBattleFever);
	
	public static Item japan_spear = new ItemBaseSword("japan_spear", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item cossack_sai = new ItemBaseSword("cossack_sai", Tabs.throwable).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item france_fencing_sword = new ItemBaseSword("france_fencing_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item kenya_whip = new ItemBaseSword("kenya_whip", Tabs.whip).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item america_throwing_knife = new ItemBaseSword("america_throwing_knife", Tabs.throwable).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	//04 Denshi Sentai Denziman
	public static Item empty_denzi_ring = new Item_ore("empty_denzi_ring").setCreativeTab(Tabs.tabDenziman);
	public static Block denziman_ore = new ore_block("denziman_ore", Material.ROCK, empty_denzi_ring, 2).setHardness(9.9F).setCreativeTab(Tabs.tabDenziman);
	
	public static Item denziman_head = new item_denziman_armor("denziman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item denziman_torso = new item_denziman_armor2("denziman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item denziman_legs = new item_denziman_armor2("denziman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	public static Item red_denzi_ring = new item_denzi_ring("red_denzi_ring", ArmorMaterial.DIAMOND, 4, "denzi_red").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item blue_denzi_ring = new item_denzi_ring("blue_denzi_ring", ArmorMaterial.DIAMOND, 4, "denzi_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item yellow_denzi_ring = new item_denzi_ring("yellow_denzi_ring", ArmorMaterial.DIAMOND, 4, "denzi_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item green_denzi_ring = new item_denzi_ring("green_denzi_ring", ArmorMaterial.DIAMOND, 4, "denzi_green").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item pink_denzi_ring = new item_denzi_ring("pink_denzi_ring", ArmorMaterial.DIAMOND, 4, "denzi_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	public static Item denzi_red_belt = new Item_ore("denzi_red_belt");
	public static Item denzi_blue_belt = new Item_ore("denzi_blue_belt");
	public static Item denzi_yellow_belt = new Item_ore("denzi_yellow_belt");
	public static Item denzi_green_belt = new Item_ore("denzi_green_belt");
	public static Item denzi_pink_belt = new Item_ore("denzi_pink_belt");
	
	public static Item red_denzi_gem = new Item_ore("red_denzi_gem").setCreativeTab(Tabs.tabDenziman);
	public static Item blue_denzi_gem = new Item_ore("blue_denzi_gem").setCreativeTab(Tabs.tabDenziman);
	public static Item yellow_denzi_gem = new Item_ore("yellow_denzi_gem").setCreativeTab(Tabs.tabDenziman);
	public static Item green_denzi_gem = new Item_ore("green_denzi_gem").setCreativeTab(Tabs.tabDenziman);
	public static Item pink_denzi_gem = new Item_ore("pink_denzi_gem").setCreativeTab(Tabs.tabDenziman);
	
	public static Item red_denzi_stick = new ItemBaseSword("red_denzi_stick", Tabs.sword).setCreativeTab(Tabs.tabDenziman);
	public static Item blue_denzi_stick = new ItemBaseSword("blue_denzi_stick", Tabs.sword).setCreativeTab(Tabs.tabDenziman);
	public static Item yellow_denzi_stick = new ItemBaseSword("yellow_denzi_stick", Tabs.sword).setCreativeTab(Tabs.tabDenziman);
	public static Item green_denzi_stick = new ItemBaseSword("green_denzi_stick", Tabs.sword).setCreativeTab(Tabs.tabDenziman);
	public static Item pink_denzi_stick = new ItemBaseSword("pink_denzi_stick", Tabs.sword).setCreativeTab(Tabs.tabDenziman);
	public static Item denzi_punch = new item_denzi_punch(1, "denzi_punch").setCreativeTab(Tabs.tabDenziman);
	
	//05 Taiyo Sentai Sun Vulcan
	public static Item sun_vulcan_logo = new Item_ore("sun_vulcan_logo").setCreativeTab(Tabs.tabSunVulcan);
	public static Block sun_vulcan_ore = new ore_block("sun_vulcan_ore", Material.ROCK, sun_vulcan_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item sun_vulcan_head = new item_sun_vulcan_armor("sun_vulcan_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item sun_vulcan_torso = new item_sun_vulcan_armor2("sun_vulcan_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item sun_vulcan_legs = new item_sun_vulcan_armor2("sun_vulcan_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);

	public static Item eagle_vulcan_brace = new item_vulcan_brace("eagle_vulcan_brace", ArmorMaterial.DIAMOND, 4, "vul_eagle").setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item shark_vulcan_brace = new item_vulcan_brace("shark_vulcan_brace", ArmorMaterial.DIAMOND, 4, "vul_shark").setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item panther_vulcan_brace = new item_vulcan_brace("panther_vulcan_brace", ArmorMaterial.DIAMOND, 4, "vul_panther").setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item vul_eagle_belt = new Item_ore("vul_eagle_belt");
	public static Item vul_shark_belt = new Item_ore("vul_shark_belt");
	public static Item vul_panther_belt = new Item_ore("vul_panther_belt");
	
	public static Item vul_eagle_medal = new Item_ore("vul_eagle_medal").setCreativeTab(Tabs.tabSunVulcan);
	public static Item vul_shark_medal = new Item_ore("vul_shark_medal").setCreativeTab(Tabs.tabSunVulcan);
	public static Item vul_panther_medal = new Item_ore("vul_panther_medal").setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item vulcan_stick = new ItemBaseSword("vulcan_stick", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item vulcan_stick_eagle = new ItemBaseSword("vulcan_stick_eagle", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	//11 Hikari Sentai Maskman
	public static Item maskman_logo = new Item_ore("maskman_logo").setCreativeTab(Tabs.tabMaskman);
	public static Block maskman_ore = new ore_block("maskman_ore", Material.ROCK, maskman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabMaskman);
	
	public static Item maskman_head = new item_maskman_armor("maskman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item maskman_torso = new item_maskman_armor2("maskman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item maskman_legs = new item_maskman_armor2("maskman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	public static Item red_masking_brace = new item_masking_brace("red_masking_brace", ArmorMaterial.DIAMOND, 4, "red_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item black_masking_brace = new item_masking_brace("black_masking_brace", ArmorMaterial.DIAMOND, 4, "black_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item blue_masking_brace = new item_masking_brace("blue_masking_brace", ArmorMaterial.DIAMOND, 4, "blue_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item yellow_masking_brace = new item_masking_brace("yellow_masking_brace", ArmorMaterial.DIAMOND, 4, "yellow_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item pink_masking_brace = new item_masking_brace("pink_masking_brace", ArmorMaterial.DIAMOND, 4, "pink_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	public static Item red_aura_power = new Item_ore("red_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item black_aura_power = new Item_ore("black_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item blue_aura_power = new Item_ore("blue_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item yellow_aura_power = new Item_ore("yellow_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item pink_aura_power = new Item_ore("pink_aura_power").setCreativeTab(Tabs.tabMaskman);
	
	public static Item laser_magnum_sword = new ItemBaseSword("laser_magnum_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item laser_magnum_gun = new Item_gun("laser_magnum_gun", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_blade = new ItemBaseSword("masky_blade", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_rod = new ItemBaseSword("masky_rod", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_tonfa = new ItemBaseSword("masky_tonfa", Tabs.tonfa).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_rotor = new ItemBaseSword("masky_rotor", Tabs.throwable).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_ribbon = new ItemBaseSword("masky_ribbon", Tabs.whip).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	//13 Kousoku Sentai Turboranger
	public static Item turboranger_logo = new Item_ore("turboranger_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Block turboranger_ore = new ore_block("turboranger_ore", Material.ROCK, turboranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabTurboranger);
	
	public static Item turboranger_head = new item_turboranger_armor("turboranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turboranger_torso = new item_turboranger_armor2("turboranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turboranger_legs = new item_turboranger_armor2("turboranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);

	public static Item red_turbo_brace = new item_turbo_brace("red_turbo_brace", ArmorMaterial.DIAMOND, 4, "red_turbo").setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item black_turbo_brace = new item_turbo_brace("black_turbo_brace", ArmorMaterial.DIAMOND, 4, "black_turbo").setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item blue_turbo_brace = new item_turbo_brace("blue_turbo_brace", ArmorMaterial.DIAMOND, 4, "blue_turbo").setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item yellow_turbo_brace = new item_turbo_brace("yellow_turbo_brace", ArmorMaterial.DIAMOND, 4, "yellow_turbo").setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item pink_turbo_brace = new item_turbo_brace("pink_turbo_brace", ArmorMaterial.DIAMOND, 4, "pink_turbo").setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	
	public static Item red_turbo_belt = new Item_ore("red_turbo_belt");
	public static Item black_turbo_belt = new Item_ore("black_turbo_belt");
	public static Item blue_turbo_belt = new Item_ore("blue_turbo_belt");
	public static Item yellow_turbo_belt = new Item_ore("yellow_turbo_belt");
	public static Item pink_turbo_belt = new Item_ore("pink_turbo_belt");
	
	public static Item red_turbo_logo = new Item_ore("red_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item black_turbo_logo = new Item_ore("black_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item blue_turbo_logo = new Item_ore("blue_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item yellow_turbo_logo = new Item_ore("yellow_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item pink_turbo_logo = new Item_ore("pink_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	
	public static Item turbo_laser_sword = new ItemBaseSword("turbo_laser_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_gun = new Item_gun("turbo_laser_gun", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item gt_sword = new ItemBaseSword("gt_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item t_hammer = new ItemBaseSword("t_hammer", Tabs.hammer).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item j_gun = new Item_gun("j_gun", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item b_bowgun = new Item_gun("b_bowgun", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item w_stick = new ItemBaseSword("w_stick", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_j = new Item_gun("turbo_laser_j", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_w = new Item_gun("turbo_laser_w", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	
	//20 Gekisou Sentai Carranger
	public static Item carranger_logo = new Item_ore("carranger_logo").setCreativeTab(Tabs.tabCarranger);
	public static Block carranger_ore = new ore_block("carranger_ore", Material.ROCK, carranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabCarranger);
	
	public static Item carranger_head = new item_carranger_armor("carranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item carranger_torso = new item_carranger_armor2("carranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item carranger_legs = new item_carranger_armor2("carranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);

	public static Item red_accel_changer = new item_accel_changer("red_accel_changer", ArmorMaterial.DIAMOND, 4, "red_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item blue_accel_changer = new item_accel_changer("blue_accel_changer", ArmorMaterial.DIAMOND, 4, "blue_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item green_accel_changer = new item_accel_changer("green_accel_changer", ArmorMaterial.DIAMOND, 4, "green_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item yellow_accel_changer = new item_accel_changer("yellow_accel_changer", ArmorMaterial.DIAMOND, 4, "yellow_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item pink_accel_changer = new item_accel_changer("pink_accel_changer", ArmorMaterial.DIAMOND, 4, "pink_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item white_racer_changer = new item_accel_changer("white_racer_changer", ArmorMaterial.DIAMOND, 4, "white_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	
	public static Item red_racer_badge = new Item_ore("red_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item blue_racer_badge = new Item_ore("blue_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item green_racer_badge = new Item_ore("green_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item yellow_racer_badge = new Item_ore("yellow_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item pink_racer_badge = new Item_ore("pink_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item white_racer_badge = new Item_ore("white_racer_badge").setCreativeTab(Tabs.tabCarranger);
	
	public static Item carranger_belt = new Item_ore("carranger_belt");
	
	public static Item auto_blaster = new Item_gun("auto_blaster", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item auto_punisher = new Item_gun("auto_punisher", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item vi_blade = new ItemBaseSword("vi_blade", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item fender_sword = new ItemBaseSword("fender_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item muffler_gun = new Item_gun("muffler_gun", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item engine_cannon = new Item_gun("engine_cannon", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item side_knuckle = new ItemBaseSword("side_knuckle", Tabs.tonfa).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item bumper_bow = new Item_gun("bumper_bow", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item navic_shot = new Item_gun("navic_shot", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item navic_blaster = new Item_gun("navic_blaster", Tabs.hyper_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	
	//22 Seijuu Sentai Gingaman
	public static Item gingaman_logo = new Item_ore("gingaman_logo").setCreativeTab(Tabs.tabGingaman);
	public static Block gingaman_ore = new ore_block("gingaman_ore", Material.ROCK, gingaman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGingaman);
	
	public static Item gingaman_head = new item_gingaman_armor("gingaman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item gingaman_torso = new item_gingaman_armor2("gingaman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item gingaman_legs = new item_gingaman_armor2("gingaman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
	public static Item red_ginga_brace = new item_ginga_brace("red_ginga_brace", ArmorMaterial.DIAMOND, 4, "ginga_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item green_ginga_brace = new item_ginga_brace("green_ginga_brace", ArmorMaterial.DIAMOND, 4, "ginga_green").setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item blue_ginga_brace = new item_ginga_brace("blue_ginga_brace", ArmorMaterial.DIAMOND, 4, "ginga_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item yellow_ginga_brace = new item_ginga_brace("yellow_ginga_brace", ArmorMaterial.DIAMOND, 4, "ginga_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item pink_ginga_brace = new item_ginga_brace("pink_ginga_brace", ArmorMaterial.DIAMOND, 4, "ginga_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
	public static Item beast_armor_shine_belt = new Item_ore("beast_armor_shine_belt");
	
	public static Item red_ginga_medal = new item_ginga_medal(0, "red_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item green_ginga_medal = new item_ginga_medal(0, "green_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item blue_ginga_medal = new item_ginga_medal(0, "blue_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item yellow_ginga_medal = new item_ginga_medal(0, "yellow_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item pink_ginga_medal = new item_ginga_medal(0, "pink_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item lights_of_ginga = new item_ginga_medal(1, "lights_of_ginga").setCreativeTab(Tabs.tabGingaman);
	
	public static Item starbeast_sword_red = new ItemBaseSword("starbeast_sword_red", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item starbeast_sword_green = new ItemBaseSword("starbeast_sword_green", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item starbeast_sword_blue = new ItemBaseSword("starbeast_sword_blue", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item starbeast_sword_yellow = new ItemBaseSword("starbeast_sword_yellow", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item starbeast_sword_pink = new ItemBaseSword("starbeast_sword_pink", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_cutter = new ItemBaseSword("kiba_cutter", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_shot = new Item_gun("kiba_shot", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_claw = new ItemBaseSword("kiba_claw", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_knife = new ItemBaseSword("kiba_knife", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_arrow = new Item_gun("kiba_arrow", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_red = new Item_gun("beast_attack_rod_red", Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_green = new Item_gun("beast_attack_rod_green", Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_blue = new Item_gun("beast_attack_rod_blue", Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_yellow = new Item_gun("beast_attack_rod_yellow", Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_pink = new Item_gun("beast_attack_rod_pink", Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
	//23 Kyukyu Sentai GoGo-V
	public static Item gogo_v_logo = new Item_ore("gogo_v_logo").setCreativeTab(Tabs.tabGogoV);
	public static Block gogo_v_ore = new ore_block("gogo_v_ore", Material.ROCK, gogo_v_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGogoV);
	
	public static Item gogo_v_head = new item_gogo_v_armor("gogo_v_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item gogo_v_torso = new item_gogo_v_armor2("gogo_v_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item gogo_v_legs = new item_gogo_v_armor2("gogo_v_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	public static Item red_gogo_brace = new item_gogo_brace("red_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item blue_gogo_brace = new item_gogo_brace("blue_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item green_gogo_brace = new item_gogo_brace("green_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_green").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item yellow_gogo_brace = new item_gogo_brace("yellow_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item pink_gogo_brace = new item_gogo_brace("pink_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item red_kyoko_gogo_brace = new item_gogo_brace("red_kyoko_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_red_kyoko").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	public static Item go_red_badge = new Item_ore("go_red_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_blue_badge = new Item_ore("go_blue_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_green_badge = new Item_ore("go_green_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_yellow_badge = new Item_ore("go_yellow_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_pink_badge = new Item_ore("go_pink_badge").setCreativeTab(Tabs.tabGogoV);
	
	public static Item v_mode_brace = new item_v_mode_brace("v_mode_brace").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	public static Item laser_grip_red = new Item_ore("laser_grip_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_blue = new Item_ore("laser_grip_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_green = new Item_ore("laser_grip_green").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_yellow = new Item_ore("laser_grip_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_pink = new Item_ore("laser_grip_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_red = new Item_sword_gun("five_laser_red",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_blue = new Item_sword_gun("five_laser_blue",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_green = new Item_sword_gun("five_laser_green",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_yellow = new Item_sword_gun("five_laser_yellow",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_pink = new Item_sword_gun("five_laser_pink",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_red = new ItemBaseSword("v_boomerang_red",Tabs.boomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_blue = new ItemBaseSword("v_boomerang_blue",Tabs.boomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_green = new ItemBaseSword("v_boomerang_green",Tabs.boomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_yellow = new ItemBaseSword("v_boomerang_yellow",Tabs.boomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_pink = new ItemBaseSword("v_boomerang_pink",Tabs.boomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_red = new ItemBaseSword("v_lancer_red",Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_blue = new ItemBaseSword("v_lancer_blue",Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_green = new ItemBaseSword("v_lancer_green",Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_yellow = new ItemBaseSword("v_lancer_yellow",Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_pink = new ItemBaseSword("v_lancer_pink",Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_red = new Item_gun("v_machine_gun_red",Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_blue = new Item_gun("v_machine_gun_blue",Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_green = new Item_gun("v_machine_gun_green",Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_yellow = new Item_gun("v_machine_gun_yellow",Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_pink = new Item_gun("v_machine_gun_pink",Tabs.bazooka).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item go_blaster = new Item_gun("go_blaster",Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item go_blaster_hyper = new Item_gun("go_blaster_hyper",Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	//25 Hyakujuu Sentai Gaoranger
	public static Item empty_gao_jewel = new Item_ore("empty_gao_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Block gaoranger_ore = new ore_block("gaoranger_ore", Material.ROCK, empty_gao_jewel, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gaoranger_head = new item_gaoranger_armor("gaoranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gaoranger_torso = new item_gaoranger_armor2("gaoranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gaoranger_legs = new item_gaoranger_armor2("gaoranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item red_g_phone = new item_g_phone("red_g_phone", ArmorMaterial.DIAMOND, 4, "gao_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item yellow_g_phone = new item_g_phone("yellow_g_phone", ArmorMaterial.DIAMOND, 4, "gao_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item blue_g_phone = new item_g_phone("blue_g_phone", ArmorMaterial.DIAMOND, 4, "gao_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item black_g_phone = new item_g_phone("black_g_phone", ArmorMaterial.DIAMOND, 4, "gao_black").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item white_g_phone = new item_g_phone("white_g_phone", ArmorMaterial.DIAMOND, 4, "gao_white").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item g_brace_phone = new item_g_phone("g_brace_phone", ArmorMaterial.DIAMOND, 4, "gao_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gaoranger_belt = new Item_ore("gaoranger_belt");
	public static Item gao_silver_belt = new Item_ore("gao_silver_belt");
	
	public static Item gao_lion_jewel = new Item_ore("gao_lion_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_eagle_jewel = new Item_ore("gao_eagle_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_shark_jewel = new Item_ore("gao_shark_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_bison_jewel = new Item_ore("gao_bison_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_tiger_jewel = new Item_ore("gao_tiger_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_wolf_jewel = new Item_ore("gao_wolf_jewel").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item beast_king_sword = new ItemBaseSword("beast_king_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item lion_beast_king_sword = new ItemBaseSword("lion_beast_king_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item eagle_beast_king_sword = new ItemBaseSword("eagle_beast_king_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item shark_beast_king_sword = new ItemBaseSword("shark_beast_king_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item bison_beast_king_sword = new ItemBaseSword("bison_beast_king_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item tiger_beast_king_sword = new ItemBaseSword("tiger_beast_king_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item evil_crushing_hundred_beast_sword = new ItemBaseSword("evil_crushing_hundred_beast_sword", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item lion_fang = new ItemBaseSword("lion_fang", Tabs.tonfa).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_mane_buster = new Item_gun("gao_mane_buster", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_mane_buster_final = new Item_gun("gao_mane_buster_final", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item eagle_sword = new ItemBaseSword("eagle_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item shark_cutter = new ItemBaseSword("shark_cutter", Tabs.tonfa).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item bison_axe = new ItemBaseSword("bison_axe", Tabs.axe).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item tiger_baton = new ItemBaseSword("tiger_baton", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hustler_rod = new Item_sword_gun("gao_hustler_rod", Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item falcon_summoner = new Item_gun("falcon_summoner", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item falcon_summoner_arrow = new Item_gun("falcon_summoner_arrow", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	//30 GoGo Sentai Boukenger
	public static Item boukenger_logo = new Item_ore("boukenger_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Block boukenger_ore = new ore_block("boukenger_ore", Material.ROCK, boukenger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabBoukenger);
	
	public static Item boukenger_head = new item_boukenger_armor("boukenger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item boukenger_torso = new item_boukenger_armor2("boukenger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item boukenger_legs = new item_boukenger_armor2("boukenger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
	public static Item red_accellular = new item_accellular("red_accellular", ArmorMaterial.DIAMOND, 4, "bouken_red").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item black_accellular = new item_accellular("black_accellular", ArmorMaterial.DIAMOND, 4, "bouken_black").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item blue_accellular = new item_accellular("blue_accellular", ArmorMaterial.DIAMOND, 4, "bouken_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item yellow_accellular = new item_accellular("yellow_accellular", ArmorMaterial.DIAMOND, 4, "bouken_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item pink_accellular = new item_accellular("pink_accellular", ArmorMaterial.DIAMOND, 4, "bouken_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item gogo_changer = new item_accellular("gogo_changer", ArmorMaterial.DIAMOND, 4, "bouken_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
	public static Item boukenger_belt = new Item_ore("boukenger_belt");
	public static Item bouken_silver_belt = new Item_ore("bouken_silver_belt");
	
	public static Item bouken_red_logo = new item_bouken_spirit(0,"bouken_red_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_black_logo = new item_bouken_spirit(0,"bouken_black_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_blue_logo = new item_bouken_spirit(0,"bouken_blue_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_yellow_logo = new item_bouken_spirit(0,"bouken_yellow_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_pink_logo = new item_bouken_spirit(0,"bouken_pink_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_silver_logo = new item_bouken_spirit(0,"bouken_silver_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Item scale_of_the_salamander = new Item_ore("scale_of_the_salamander").setCreativeTab(Tabs.tabBoukenger);
	public static Item accel_tector = new item_bouken_spirit(1,"accel_tector").setCreativeTab(Tabs.tabBoukenger);
	
	public static Item survi_blade = new Item_sword_gun("survi_blade",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_bo = new ItemBaseSword("bouken_bo",Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item radial_hammer = new ItemBaseSword("radial_hammer",Tabs.hammer).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item blow_knuckle = new ItemBaseSword("blow_knuckle",Tabs.tonfa).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item bucket_scooper = new ItemBaseSword("bucket_scooper",Tabs.tonfa).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item hydro_shooter = new Item_gun("hydro_shooter",Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item sagaspear = new Item_sword_gun("sagaspear",Tabs.sword_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item dual_crusher_mixer = new Item_gun("dual_crusher_mixer",Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item dual_crusher_drill = new Item_gun("dual_crusher_drill",Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
	//33 Samurai Sentai Shinkenger
	public static Item common_disk = new Item_ore("common_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Block shinkenger_ore = new ore_block("shinkenger_ore", Material.ROCK, common_disk, 2).setHardness(9.9F).setCreativeTab(Tabs.tabShinkenger);
	
	public static Item shinkenger_head = new item_shinkenger_armor("shinkenger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item shinkenger_torso = new item_shinkenger_armor2("shinkenger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item shinkenger_legs = new item_shinkenger_armor2("shinkenger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	
	public static Item red_shodophone = new item_shodophone("red_shodophone", ArmorMaterial.DIAMOND, 4, "shinken_red").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item blue_shodophone = new item_shodophone("blue_shodophone", ArmorMaterial.DIAMOND, 4, "shinken_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item pink_shodophone = new item_shodophone("pink_shodophone", ArmorMaterial.DIAMOND, 4, "shinken_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item green_shodophone = new item_shodophone("green_shodophone", ArmorMaterial.DIAMOND, 4, "shinken_green").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item yellow_shodophone = new item_shodophone("yellow_shodophone", ArmorMaterial.DIAMOND, 4, "shinken_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item sushi_changer = new item_shodophone("sushi_changer", ArmorMaterial.DIAMOND, 4, "shinken_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item princess_red_shodophone = new item_shodophone("princess_red_shodophone", ArmorMaterial.DIAMOND, 4, "princess_shinken_red").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	
	public static Item shinkenger_belt = new Item_ore("shinkenger_belt");
	public static Item shinken_gold_belt = new Item_ore("shinken_gold_belt");
	
	public static Item shishi_disk = new item_secret_disk(0,"shishi_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item ryuu_disk = new item_secret_disk(0,"ryuu_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item kame_disk = new item_secret_disk(0,"kame_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item kuma_disk = new item_secret_disk(0,"kuma_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item saru_disk = new item_secret_disk(0,"saru_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item sushi_disk = new item_secret_disk(0,"sushi_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item inromaru = new Item_ore("inromaru").setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item super_disk = new item_secret_disk(1,"super_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item hyper_disk = new item_secret_disk(2,"hyper_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Item gedou_disk = new item_secret_disk(3,"gedou_disk").setCreativeTab(Tabs.tabShinkenger);
	
	public static Item shinkenmaru = new ItemBaseSword("shinkenmaru", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item rekka_daizantou = new ItemBaseSword("rekka_daizantou", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item water_arrow = new Item_gun("water_arrow", Tabs.bow).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item heaven_fan = new ItemBaseSword("heaven_fan", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item wood_spear = new ItemBaseSword("wood_spear", Tabs.rod).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item land_slicer = new ItemBaseSword("land_slicer", Tabs.throwable).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item sakanamaru = new ItemBaseSword("sakanamaru", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item super_shinkenmaru = new ItemBaseSword("super_shinkenmaru", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item kyoryumaru = new ItemBaseSword("kyoryumaru", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item kyoryumaru_sakanamaru = new ItemBaseSword("kyoryumaru_sakanamaru", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	
	//36 Tokumei Sentai Go-Busters
	public static Item enetron = new Item_ore("enetron").setCreativeTab(Tabs.tabGoBusters);
	public static Item blank_animal_disk = new Item_ore("blank_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Block go_busters_ore = new ore_block("go_busters_ore", Material.ROCK, enetron, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoBusters);
	public static Block doubutsu_go_busters_ore = new ore_block("doubutsu_go_busters_ore", Material.ROCK, blank_animal_disk, 3).setHardness(9.9F).setCreativeTab(Tabs.tabGoBusters);
	
	public static Item go_busters_head = new item_go_busters_armor("go_busters_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item go_busters_torso = new item_go_busters_armor2("go_busters_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item go_busters_legs = new item_go_busters_armor2("go_busters_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
	public static Item red_morphin_brace = new item_morphin_brace("red_morphin_brace", ArmorMaterial.DIAMOND, 4, "red_buster").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item blue_morphin_brace = new item_morphin_brace("blue_morphin_brace", ArmorMaterial.DIAMOND, 4, "blue_buster").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item yellow_morphin_brace = new item_morphin_brace("yellow_morphin_brace", ArmorMaterial.DIAMOND, 4, "yellow_buster").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item beet_morphin_blaster = new item_morphin_brace("beet_morphin_blaster", ArmorMaterial.DIAMOND, 4, "beet_buster").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item stag_morphin_blaster = new item_morphin_brace("stag_morphin_blaster", ArmorMaterial.DIAMOND, 4, "stag_buster").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item beet_enter_morphin_blaster = new item_morphin_brace("beet_enter_morphin_blaster", ArmorMaterial.DIAMOND, 4, "beet_buster_enter").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
	public static Item cheetah_morphin_brace = new item_morphin_brace("cheetah_morphin_brace", ArmorMaterial.DIAMOND, 4, "red_cheetah").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item gorilla_morphin_brace = new item_morphin_brace("gorilla_morphin_brace", ArmorMaterial.DIAMOND, 4, "blue_gorilla").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item rabbit_morphin_brace = new item_morphin_brace("rabbit_morphin_brace", ArmorMaterial.DIAMOND, 4, "yellow_rabbit").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item beetle_morphin_blaster = new item_morphin_brace("beetle_morphin_blaster", ArmorMaterial.DIAMOND, 4, "gold_beetle").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item hippopotamus_morphin_brace = new item_morphin_brace("hippopotamus_morphin_brace", ArmorMaterial.DIAMOND, 4, "green_hippopotamus").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item puma_morphin_brace = new item_morphin_brace("puma_morphin_brace", ArmorMaterial.DIAMOND, 4, "black_puma").setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
	public static Item go_busters_belt = new Item_ore("go_busters_belt");
	
	public static Item red_enetron = new item_enetron(0, "red_enetron").setCreativeTab(Tabs.tabGoBusters);
	public static Item blue_enetron = new item_enetron(0, "blue_enetron").setCreativeTab(Tabs.tabGoBusters);
	public static Item yellow_enetron = new item_enetron(0, "yellow_enetron").setCreativeTab(Tabs.tabGoBusters);
	public static Item gold_enetron = new item_enetron(0, "gold_enetron").setCreativeTab(Tabs.tabGoBusters);
	public static Item silver_enetron = new item_enetron(0, "silver_enetron").setCreativeTab(Tabs.tabGoBusters);
	
	public static Item cheetah_animal_disk = new item_enetron(0, "cheetah_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Item gorilla_animal_disk = new item_enetron(0, "gorilla_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Item rabbit_animal_disk = new item_enetron(0, "rabbit_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Item beetle_animal_disk = new item_enetron(0, "beetle_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Item stag_animal_disk = new item_enetron(0, "stag_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Item hippopotamus_animal_disk = new item_enetron(0, "hippopotamus_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Item puma_animal_disk = new item_enetron(0, "puma_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	
	public static Item custom_visor = new item_enetron(1, "custom_visor").setCreativeTab(Tabs.tabGoBusters);
	
	public static Item morphin_blaster = new item_gun_changer("morphin_blaster",Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item ichigan_buster = new Item_gun("ichigan_buster",Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item sougan_blade = new ItemBaseSword("sougan_blade",Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item ichigan_buster_special = new Item_gun("ichigan_buster_special",Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item dri_blade = new ItemBaseSword("dri_blade",Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item lio_attache = new Item_gun("lio_attache",Tabs.hyper_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
	//42-43 Kaitou Sentai Lupinranger VS Keisatsu Sentai Patranger
	public static Item blank_striker = new Item_ore("blank_striker").setCreativeTab(Tabs.tabLupat);
	public static Block vs_vehicle_ore = new ore_block("vs_vehicle_ore", Material.ROCK, blank_striker, 2).setHardness(9.9F).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupat_head = new item_lupat_armor("lupat_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupat_torso = new item_lupat_armor2("lupat_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupat_legs = new item_lupat_armor2("lupat_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item red_vs_changer = new item_vs_changer("red_vs_changer", ArmorMaterial.DIAMOND, 4, "lupin_red").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item blue_vs_changer = new item_vs_changer("blue_vs_changer", ArmorMaterial.DIAMOND, 4, "lupin_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item yellow_vs_changer = new item_vs_changer("yellow_vs_changer", ArmorMaterial.DIAMOND, 4, "lupin_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item ichigou_vs_changer = new item_vs_changer("ichigou_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_1gou").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item nigou_vs_changer = new item_vs_changer("nigou_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_2gou").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item sangou_vs_changer = new item_vs_changer("sangou_vs_changer", ArmorMaterial.DIAMOND, 4, "patran_3gou").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupin_x_changer = new item_vs_changer("lupin_x_changer", ArmorMaterial.DIAMOND, 4, "lupin_x").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item patran_x_changer = new item_vs_changer("patran_x_changer", ArmorMaterial.DIAMOND, 4, "patran_x").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
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
	
	public static Item vs_changer = new Item_gun("vs_changer", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item x_changer = new item_gun_changer("x_changer", Tabs.gun).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupin_sword = new ItemBaseSword("lupin_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupin_sword_magic_hand = new ItemBaseSword("lupin_sword_magic_hand", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupin_magnum = new Item_gun("lupin_magnum", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item pat_megabo = new ItemBaseSword("pat_megabo", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item x_rod_sword = new ItemBaseSword("x_rod_sword", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item scissor_shield = new ItemBaseShield("scissor_shield").setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item blade_boomerang = new ItemBaseSword("blade_boomerang", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	//44 Kishiryu Sentai Ryusoulger
	public static Item blank_ryusoul = new Item_ore("blank_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Block ryusoulger_ore = new ore_block("ryusoulger_ore", Material.ROCK, blank_ryusoul, 2).setHardness(9.9F).setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoulger_head = new item_ryusoulger_armor("ryusoulger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item ryusoulger_torso = new item_ryusoulger_armor2("ryusoulger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item ryusoulger_legs = new item_ryusoulger_armor2("ryusoulger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item red_ryusoul_changer = new item_ryusoul_changer("red_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_red").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item blue_ryusoul_changer = new item_ryusoul_changer("blue_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item pink_ryusoul_changer = new item_ryusoul_changer("pink_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item green_ryusoul_changer = new item_ryusoul_changer("green_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_green").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item black_ryusoul_changer = new item_ryusoul_changer("black_ryusoul_changer", ArmorMaterial.DIAMOND, 4, "ryusoul_black").setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoul_buckle = new Item_ore("ryusoul_buckle");
	
	public static Item red_ryusoul = new item_ryusoul(0,"red_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item blue_ryusoul = new item_ryusoul(0,"blue_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item pink_ryusoul = new item_ryusoul(0,"pink_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item green_ryusoul = new item_ryusoul(0,"green_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item black_ryusoul = new item_ryusoul(0,"black_ryusoul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item tsuyo_soul = new item_ryusoul(1,"tsuyo_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item nobi_soul = new item_ryusoul(2,"nobi_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item omo_soul = new item_ryusoul(3,"omo_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item haya_soul = new item_ryusoul(4,"haya_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item kata_soul = new item_ryusoul(5,"kata_soul").setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoul_ken = new ItemBaseSword("ryusoul_ken", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	public static void init() 
	{
		
	}
	
	//public static void init(){}
}