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
import SS_Craft.item.abaranger.item_abaranger_armor;
import SS_Craft.item.abaranger.item_abaranger_armor2;
import SS_Craft.item.abaranger.item_dino_brace;
import SS_Craft.item.abaranger.item_sty_riser;
import SS_Craft.item.abaranger.item_sty_riser_shield;
import SS_Craft.item.abaranger.mecha.item_abaranger_mecha;
import SS_Craft.item.abaranger.mecha.item_abaranger_mecha_armor;
import SS_Craft.item.abaranger.mecha.item_abaranger_mecha_armor2;
import SS_Craft.item.abaranger.mecha.item_dino_guts;
import SS_Craft.item.akibaranger.item_akibaranger_armor;
import SS_Craft.item.akibaranger.item_akibaranger_armor2;
import SS_Craft.item.akibaranger.item_moe_moe_z_cune;
import SS_Craft.item.akibaranger.item_munyu_munyu_zubaan;
import SS_Craft.item.battle_fever.item_battle_fever_armor;
import SS_Craft.item.battle_fever.item_battle_fever_armor2;
import SS_Craft.item.battle_fever.item_battleceiver;
import SS_Craft.item.battle_fever.mecha.item_battle_fever_mecha;
import SS_Craft.item.battle_fever.mecha.item_battle_fever_mecha_armor;
import SS_Craft.item.battle_fever.mecha.item_battle_fever_mecha_armor2;
import SS_Craft.item.bioman.item_bioman_armor;
import SS_Craft.item.bioman.item_bioman_armor2;
import SS_Craft.item.bioman.item_techno_brace;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.boukenger.item_bouken_spirit;
import SS_Craft.item.boukenger.item_boukenger_armor;
import SS_Craft.item.boukenger.item_boukenger_armor2;
import SS_Craft.item.carranger.item_accel_changer;
import SS_Craft.item.carranger.item_carranger_armor;
import SS_Craft.item.carranger.item_carranger_armor2;
import SS_Craft.item.dairanger.item_aura_changer;
import SS_Craft.item.dairanger.item_dairanger_armor;
import SS_Craft.item.dairanger.item_dairanger_armor2;
import SS_Craft.item.denziman.item_denzi_punch;
import SS_Craft.item.denziman.item_denzi_ring;
import SS_Craft.item.denziman.item_denziman_armor;
import SS_Craft.item.denziman.item_denziman_armor2;
import SS_Craft.item.denziman.mecha.item_denziman_mecha;
import SS_Craft.item.denziman.mecha.item_denziman_mecha_armor;
import SS_Craft.item.denziman.mecha.item_denziman_mecha_armor2;
import SS_Craft.item.flashman.item_flashman_armor;
import SS_Craft.item.flashman.item_flashman_armor2;
import SS_Craft.item.flashman.item_prism_armor;
import SS_Craft.item.flashman.item_prism_flash;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gaoranger.item_gaoranger_armor;
import SS_Craft.item.gaoranger.item_gaoranger_armor2;
import SS_Craft.item.gaoranger.mecha.item_flute_knife;
import SS_Craft.item.gaoranger.mecha.item_gao_jewel;
import SS_Craft.item.gaoranger.mecha.item_gaoranger_mecha;
import SS_Craft.item.gaoranger.mecha.item_gaoranger_mecha_armor;
import SS_Craft.item.gaoranger.mecha.item_gaoranger_mecha_armor2;
import SS_Craft.item.gaoranger.mecha.item_gaoranger_mecha_armor2;
import SS_Craft.item.gekiranger.item_geki_changer;
import SS_Craft.item.gekiranger.item_gekiranger_armor;
import SS_Craft.item.gekiranger.item_gekiranger_armor2;
import SS_Craft.item.gekiranger.item_super_geki_claw;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.gingaman.item_ginga_medal;
import SS_Craft.item.gingaman.item_gingaman_armor;
import SS_Craft.item.gingaman.item_gingaman_armor2;
import SS_Craft.item.go_busters.item_enetron;
import SS_Craft.item.go_busters.item_go_busters_armor;
import SS_Craft.item.go_busters.item_go_busters_armor2;
import SS_Craft.item.go_busters.item_morphin_brace;
import SS_Craft.item.go_onger.item_go_onger_armor;
import SS_Craft.item.go_onger.item_go_onger_armor2;
import SS_Craft.item.go_onger.item_go_phone;
import SS_Craft.item.go_onger.mecha.item_engine_soul;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha_armor;
import SS_Craft.item.go_onger.mecha.item_go_onger_mecha_armor2;
import SS_Craft.item.goggle_v.item_goggle_brace;
import SS_Craft.item.goggle_v.item_goggle_v_armor;
import SS_Craft.item.goggle_v.item_goggle_v_armor2;
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
import SS_Craft.item.jetman.item_cross_changer;
import SS_Craft.item.jetman.item_jetman_armor;
import SS_Craft.item.jetman.item_jetman_armor2;
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
import SS_Craft.item.kirameiger.item_kirameiger_armor;
import SS_Craft.item.kirameiger.item_kirameiger_armor2;
import SS_Craft.item.kirameiger.item_shiny_breaker;
import SS_Craft.item.kyuranger.item_kyuranger_armor;
import SS_Craft.item.kyuranger.item_kyuranger_armor2;
import SS_Craft.item.kyuranger.item_kyutama;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.kyuranger.item_skill_kyutama;
import SS_Craft.item.lupatranger.item_lupat_armor;
import SS_Craft.item.lupatranger.item_lupat_armor2;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.lupatranger.item_vs_vehicle;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.maskman.item_maskman_armor;
import SS_Craft.item.maskman.item_maskman_armor2;
import SS_Craft.item.megaranger.item_battleraizer;
import SS_Craft.item.megaranger.item_digitaizer;
import SS_Craft.item.megaranger.item_mega_disk;
import SS_Craft.item.megaranger.item_megaranger_armor;
import SS_Craft.item.megaranger.item_megaranger_armor2;
import SS_Craft.item.ninninger.item_nin_shuriken;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul;
import SS_Craft.item.ryusoulger.item_ryusoul_calibur;
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
import SS_Craft.item.sun_vulcan.mecha.item_sun_vulcan_mecha;
import SS_Craft.item.sun_vulcan.mecha.item_sun_vulcan_mecha_armor;
import SS_Craft.item.sun_vulcan.mecha.item_sun_vulcan_mecha_armor2;
import SS_Craft.item.toqger.item_toq_changer;
import SS_Craft.item.toqger.item_toq_ressha;
import SS_Craft.item.toqger.item_toqger_armor;
import SS_Craft.item.toqger.item_toqger_armor2;
import SS_Craft.item.turboranger.item_fairy_power;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.item.turboranger.item_turboranger_armor;
import SS_Craft.item.turboranger.item_turboranger_armor2;
import SS_Craft.item.zenkaiger.item_dark_gear;
import SS_Craft.item.zenkaiger.item_geartlinger;
import SS_Craft.item.zenkaiger.item_sentai_gear;
import SS_Craft.item.zenkaiger.item_zenkai_gear;
import SS_Craft.item.zenkaiger.item_zenkaiger_armor;
import SS_Craft.item.zenkaiger.item_zenkaiger_armor2;
import SS_Craft.item.zyuohger.item_whale_change_gun;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.item.zyuohger.item_zyuoh_cube;
import SS_Craft.item.zyuohger.item_zyuohger_armor;
import SS_Craft.item.zyuohger.item_zyuohger_armor2;
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

public class RiderItems 
{
	public static Item blanknoitem = new Item_ore("blanknoitem");
	public static Item super_sentai_logo = new item_super_sentai_logo("super_sentai_logo").setCreativeTab(Tabs.tabMisc);

	//00 Mobs Weapon
	public static Item zolders_sword = new ItemBaseSword("zolders_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item ungler_lance = new ItemBaseSword("ungler_lance", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item yartots_saber = new ItemBaseSword("yartots_saber", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item nanashi_dao = new ItemBaseSword("nanashi_dao", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item drunn_spear = new ItemBaseSword("drunn_spear", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item drunn_shield = new ItemBaseShield("drunn_shield",RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item crimers_sword = new ItemBaseSword("crimers_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item machinemen_knife = new ItemBaseSword("machinemen_knife", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item wumpers_sword = new ItemBaseSword("wumpers_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item orgettes_club = new ItemBaseSword("orgettes_club", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item porderman_sword = new ItemBaseSword("porderman_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item cutmen_sword = new ItemBaseSword("cutmen_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item jakotsuken = new ItemBaseSword("jakotsuken", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item bone_axe = new ItemBaseSword("bone_axe", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item imps_sword = new ItemBaseSword("imps_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karths_sickle = new ItemBaseSword("karths_sickle", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item buglars_katar = new ItemBaseSword("buglars_katar", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item mechaclones_sword = new ItemBaseSword("mechaclones_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item dorodoros_sword = new ItemBaseSword("dorodoros_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item plug_lancer = new ItemBaseSword("plug_lancer", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	//Misc Items
	public static Item mecha_gear = new Item_ore("mecha_gear").setCreativeTab(Tabs.tabMisc);
	public static Block mecha_ore = new ore_block("mecha_ore", Material.ROCK, mecha_gear, 3).setHardness(9.9F).setCreativeTab(Tabs.tabMisc);
	
	public static Item hachibungi = new Item_ore("hachibungi").setCreativeTab(Tabs.tabMisc);
	public static Item rokubungi = new Item_ore("rokubungi").setCreativeTab(Tabs.tabMisc);
	public static Item compass_kyu = new Item_ore("compass_kyu").setCreativeTab(Tabs.tabMisc);
	public static Item jyogi = new Item_ore("jyogi").setCreativeTab(Tabs.tabMisc);
	
	public static Item kawarimono_head = new item_kawarimono_armor("kawarimono_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item kawarimono_torso = new item_kawarimono_armor2("kawarimono_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item kawarimono_legs = new item_kawarimono_armor2("kawarimono_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item red_mobirates = new item_mobirates("red_mobirates", ArmorMaterial.DIAMOND, 4, "gokai_red").setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item aka_ninja_ichibantou = new item_ninja_ichibantou("aka_ninja_ichibantou", ArmorMaterial.DIAMOND, 4, "aka_ninger").setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item gokaiger_belt = new Item_ore("gokaiger_belt");
	
	public static Item gokai_red_key = new item_ranger_key(0, "gokai_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item akaranger_key = new item_ranger_key(1, "akaranger_key").setCreativeTab(Tabs.tabMisc);
	public static Item spade_ace_key = new item_ranger_key(2, "spade_ace_key").setCreativeTab(Tabs.tabMisc);
	public static Item vul_eagle_key = new item_ranger_key(5, "vul_eagle_key").setCreativeTab(Tabs.tabMisc);
	public static Item red_mask_key = new item_ranger_key(11, "red_mask_key").setCreativeTab(Tabs.tabMisc);
	public static Item red_racer_key = new item_ranger_key(20, "red_racer_key").setCreativeTab(Tabs.tabMisc);
	public static Item ginga_red_key = new item_ranger_key(22, "ginga_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item gao_red_key = new item_ranger_key(25, "gao_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item shinken_red_key = new item_ranger_key(33, "shinken_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item aka_ninger_key = new item_ranger_key(38, "aka_ninger_key").setCreativeTab(Tabs.tabMisc);
	public static Item gold_anchor_key = new item_ranger_key("gold_anchor_key", 1).setCreativeTab(Tabs.tabMisc);
	
	public static Item aka_ninger_shuriken = new item_nin_shuriken(0, "aka_ninger_shuriken").setCreativeTab(Tabs.tabMisc);
	public static Item chouzetsu_shoubu_changer = new item_nin_shuriken(1, "chouzetsu_shoubu_changer").setCreativeTab(Tabs.tabMisc);
	
	public static Item gokai_saber = new ItemBaseSword("gokai_saber", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gokai_gun = new Item_gun("gokai_gun", Tabs.gun,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gokai_spear_anchor = new ItemBaseSword("gokai_spear_anchor", Tabs.super_sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item ninja_ichibantou = new ItemBaseSword("ninja_ichibantou", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen = new ItemBaseSword("karakuri_hengen", Tabs.throwable,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen_sword = new ItemBaseSword("karakuri_hengen_sword", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen_bow = new Item_gun("karakuri_hengen_bow", Tabs.bow,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen_claw = new ItemBaseSword("karakuri_hengen_claw", Tabs.sword,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gama_gama_gun = new Item_gun("gama_gama_gun", Tabs.gun,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item drive_shuriken = new Item_ore("drive_shuriken").setCreativeTab(Tabs.tabMisc);
	public static Item ooo_key = new Item_ore("ooo_key").setCreativeTab(Tabs.tabMisc);
	public static Item gatakiriba_key = new Item_ore("gatakiriba_key").setCreativeTab(Tabs.tabMisc);
	public static Item latoratah_key = new Item_ore("latoratah_key").setCreativeTab(Tabs.tabMisc);
	public static Item sagozou_key = new Item_ore("sagozou_key").setCreativeTab(Tabs.tabMisc);
	public static Item tajadol_key = new Item_ore("tajadol_key").setCreativeTab(Tabs.tabMisc);
	public static Item shauta_key = new Item_ore("shauta_key").setCreativeTab(Tabs.tabMisc);
	public static Item putotyra_key = new Item_ore("putotyra_key").setCreativeTab(Tabs.tabMisc);
	
	//01 Himitsu Sentai Goranger
	public static Item goranger_logo = new Item_ore("goranger_logo").setCreativeTab(Tabs.tabGoranger);
//	public static Block goranger_ore = new ore_block("goranger_ore", Material.ROCK, goranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoranger);
	
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
	
	public static Item goranger_manga = new item_manga(1,"goranger_manga").setCreativeTab(Tabs.tabGoranger);
	
	public static Item red_bute = new ItemBaseSword("red_bute", Tabs.rod,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item silver_shot = new Item_gun("silver_shot", Tabs.gun,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item blue_cherry = new Item_gun("blue_cherry", Tabs.bow,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item ultra_blue_cherry = new Item_gun("ultra_blue_cherry", Tabs.stronger_bow,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item ki_sticker = new ItemBaseSword("ki_sticker", Tabs.rod,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item earring_bomb = new ItemBaseSword("earring_bomb", Tabs.bomb,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item midomerang = new ItemBaseSword("midomerang", Tabs.boomerang,RiderItems.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	
	//02 J.A.K.Q. Dengekitai
	public static Item jakq_logo = new Item_ore("jakq_logo").setCreativeTab(Tabs.tabJakq);
	public static Item blank_card = new Item_ore("blank_card").setCreativeTab(Tabs.tabJakq);
//	public static Block jakq_ore = new ore_block("jakq_ore", Material.ROCK, blank_card, 2).setHardness(9.9F).setCreativeTab(Tabs.tabJakq);
	
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
	
	public static Item spade_arts = new Item_gun("spade_arts", Tabs.bow,RiderItems.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item dia_sword = new ItemBaseSword("dia_sword", Tabs.sword,RiderItems.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item heart_cute = new ItemBaseSword("heart_cute", Tabs.throwable,RiderItems.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item club_megaton = new ItemBaseSword("club_megaton", Tabs.megaton,RiderItems.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item big_baton = new ItemBaseSword("big_baton", Tabs.rod,RiderItems.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	
	//03 Battle Fever J
	public static Item battle_fever_logo = new Item_ore("battle_fever_logo").setCreativeTab(Tabs.tabBattleFever);
//	public static Block battle_fever_ore = new ore_block("battle_fever_ore", Material.ROCK, battle_fever_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabBattleFever);
	
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
	
	public static Item japan_spear = new ItemBaseSword("japan_spear", Tabs.rod,RiderItems.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item cossack_sai = new ItemBaseSword("cossack_sai", Tabs.throwable,RiderItems.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item france_fencing_sword = new ItemBaseSword("france_fencing_sword", Tabs.sword,RiderItems.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item kenya_whip = new ItemBaseSword("kenya_whip", Tabs.whip,RiderItems.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item america_throwing_knife = new ItemBaseSword("america_throwing_knife", Tabs.throwable,RiderItems.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item battle_fever_robo_head = new item_battle_fever_mecha("battle_fever_robo_head", ArmorMaterial.DIAMOND, 4, "battle_fever_robo").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item battle_fever_robo_torso = new item_battle_fever_mecha_armor2("battle_fever_robo_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_fever_robo_legs = new item_battle_fever_mecha_armor2("battle_fever_robo_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_fever_robo_boots = new item_battle_fever_mecha_armor("battle_fever_robo_boots", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item denkouken = new ItemBaseSword("denkouken",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item sword_fever = new ItemBaseSword("sword_fever",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item fever_axe = new ItemBaseSword("fever_axe",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item stick_attacker = new ItemBaseSword("stick_attacker",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item attack_lancer = new ItemBaseSword("attack_lancer",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item cane_knocker = new ItemBaseSword("cane_knocker",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_shield = new ItemBaseShield("battle_shield",RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	//04 Denshi Sentai Denziman
	public static Item denziman_logo = new Item_ore("denziman_logo").setCreativeTab(Tabs.tabDenziman);
	public static Item empty_denzi_ring = new Item_ore("empty_denzi_ring").setCreativeTab(Tabs.tabDenziman);
//	public static Block denziman_ore = new ore_block("denziman_ore", Material.ROCK, empty_denzi_ring, 2).setHardness(9.9F).setCreativeTab(Tabs.tabDenziman);
	
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
	
	public static Item red_denzi_stick = new ItemBaseSword("red_denzi_stick", Tabs.sword,RiderItems.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item blue_denzi_stick = new ItemBaseSword("blue_denzi_stick", Tabs.sword,RiderItems.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item yellow_denzi_stick = new ItemBaseSword("yellow_denzi_stick", Tabs.sword,RiderItems.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item green_denzi_stick = new ItemBaseSword("green_denzi_stick", Tabs.sword,RiderItems.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item pink_denzi_stick = new ItemBaseSword("pink_denzi_stick", Tabs.sword,RiderItems.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item denzi_punch = new item_denzi_punch(1, "denzi_punch").setCreativeTab(Tabs.tabDenziman);
	
	public static Item dai_denzin_head = new item_denziman_mecha("dai_denzin_head", ArmorMaterial.DIAMOND, 4, "dai_denzin").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	public static Item dai_denzin_torso = new item_denziman_mecha_armor2("dai_denzin_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item dai_denzin_legs = new item_denziman_mecha_armor2("dai_denzin_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item dai_denzin_boots = new item_denziman_mecha_armor("dai_denzin_boots", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	public static Item denzi_ken = new ItemBaseSword("denzi_ken",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item dai_denzin_boomerang = new ItemBaseSword("dai_denzin_boomerang",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item denzi_ball = new ItemBaseSword("denzi_ball",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	//05 Taiyo Sentai Sun Vulcan
	public static Item sun_vulcan_logo = new Item_ore("sun_vulcan_logo").setCreativeTab(Tabs.tabSunVulcan);
//	public static Block sun_vulcan_ore = new ore_block("sun_vulcan_ore", Material.ROCK, sun_vulcan_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabSunVulcan);
	
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
	
	public static Item vulcan_stick = new ItemBaseSword("vulcan_stick", Tabs.sword,RiderItems.sun_vulcan_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item vulcan_stick_eagle = new ItemBaseSword("vulcan_stick_eagle", Tabs.sword,RiderItems.sun_vulcan_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);

	public static Item sun_vulcan_robo_head = new item_sun_vulcan_mecha("sun_vulcan_robo_head", ArmorMaterial.DIAMOND, 4, "sun_vulcan_robo").setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item sun_vulcan_robo_torso = new item_sun_vulcan_mecha_armor2("sun_vulcan_robo_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item sun_vulcan_robo_legs = new item_sun_vulcan_mecha_armor2("sun_vulcan_robo_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item sun_vulcan_robo_boots = new item_sun_vulcan_mecha_armor("sun_vulcan_robo_boots", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item taiyo_ken = new ItemBaseSword("taiyo_ken",Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item vul_shield = new ItemBaseShield("vul_shield",RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	//06 Dai Sentai Goggle V
	public static Item goggle_v_logo = new Item_ore("goggle_v_logo").setCreativeTab(Tabs.tabGoggleV);
//	public static Block goggle_v_ore = new ore_block("goggle_v_ore", Material.ROCK, goggle_v_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoggleV);
	
	public static Item goggle_v_head = new item_goggle_v_armor("goggle_v_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item goggle_v_torso = new item_goggle_v_armor2("goggle_v_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item goggle_v_legs = new item_goggle_v_armor2("goggle_v_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);

	public static Item red_goggle_brace = new item_goggle_brace("red_goggle_brace", ArmorMaterial.DIAMOND, 4, "goggle_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_goggle_brace = new item_goggle_brace("black_goggle_brace", ArmorMaterial.DIAMOND, 4, "goggle_black").setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item blue_goggle_brace = new item_goggle_brace("blue_goggle_brace", ArmorMaterial.DIAMOND, 4, "goggle_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item yellow_goggle_brace = new item_goggle_brace("yellow_goggle_brace", ArmorMaterial.DIAMOND, 4, "goggle_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item pink_goggle_brace = new item_goggle_brace("pink_goggle_brace", ArmorMaterial.DIAMOND, 4, "goggle_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	
	public static Item goggle_v_belt = new Item_ore("goggle_v_belt");
	
	public static Item atlantis_ruby = new Item_ore("atlantis_ruby").setCreativeTab(Tabs.tabGoggleV);
	public static Item angkor_wat_emerald = new Item_ore("angkor_wat_emerald").setCreativeTab(Tabs.tabGoggleV);
	public static Item egypt_saphire = new Item_ore("egypt_saphire").setCreativeTab(Tabs.tabGoggleV);
	public static Item lemuria_opal = new Item_ore("lemuria_opal").setCreativeTab(Tabs.tabGoggleV);
	public static Item mayan_diamond = new Item_ore("mayan_diamond").setCreativeTab(Tabs.tabGoggleV);
	
	public static Item goggle_sabre = new ItemBaseSword("goggle_sabre", Tabs.sword,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item goggle_golden_spear = new ItemBaseSword("goggle_golden_spear", Tabs.rod,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item red_hammer = new ItemBaseSword("red_hammer", Tabs.hammer,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item red_ribbon = new ItemBaseSword("red_ribbon", Tabs.whip,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_club = new ItemBaseSword("black_club", Tabs.sword,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_emerald_nunchuck = new ItemBaseSword("black_emerald_nunchuck", Tabs.tonfa,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_hammer = new ItemBaseSword("black_hammer", Tabs.hammer,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_ribbon = new ItemBaseSword("black_ribbon", Tabs.whip,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item blue_hammer = new ItemBaseSword("blue_hammer", Tabs.hammer,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item blue_ribbon = new ItemBaseSword("blue_ribbon", Tabs.whip,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item yellow_hammer = new ItemBaseSword("yellow_hammer", Tabs.hammer,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item yellow_ribbon = new ItemBaseSword("yellow_ribbon", Tabs.whip,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item pink_hammer = new ItemBaseSword("pink_hammer", Tabs.hammer,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item pink_ribbon = new ItemBaseSword("pink_ribbon", Tabs.whip,RiderItems.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	
	//07 Kagaku Sentai Dynaman
	public static Item dynaman_logo = new Item_ore("dynaman_logo").setCreativeTab(Tabs.tabMisc);
	
	//08 Choudenshi Bioman
	public static Item bioman_logo = new Item_ore("bioman_logo").setCreativeTab(Tabs.tabBioman);
//  public static Block bioman_ore = new ore_block("bioman_ore", Material.ROCK, bioman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabBioman);
	
	public static Item bioman_head = new item_bioman_armor("bioman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item bioman_torso = new item_bioman_armor2("bioman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item bioman_legs = new item_bioman_armor2("bioman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	
	public static Item red_techno_brace = new item_techno_brace("red_techno_brace", ArmorMaterial.DIAMOND, 4, "red_one").setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item green_techno_brace = new item_techno_brace("green_techno_brace", ArmorMaterial.DIAMOND, 4, "green_two").setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item blue_techno_brace = new item_techno_brace("blue_techno_brace", ArmorMaterial.DIAMOND, 4, "blue_three").setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item yellow_techno_brace = new item_techno_brace("yellow_techno_brace", ArmorMaterial.DIAMOND, 4, "yellow_four").setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item pink_techno_brace = new item_techno_brace("pink_techno_brace", ArmorMaterial.DIAMOND, 4, "pink_five").setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item bio_hunter_silva_belt = new item_techno_brace("bio_hunter_silva_belt", ArmorMaterial.DIAMOND, 4, "bio_hunter_silva").setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	
	public static Item bioman_belt = new Item_ore("bioman_belt");
	
	public static Item red_bio_particles = new Item_ore("red_bio_particles").setCreativeTab(Tabs.tabBioman);
	public static Item green_bio_particles = new Item_ore("green_bio_particles").setCreativeTab(Tabs.tabBioman);
	public static Item blue_bio_particles = new Item_ore("blue_bio_particles").setCreativeTab(Tabs.tabBioman);
	public static Item yellow_bio_particles = new Item_ore("yellow_bio_particles").setCreativeTab(Tabs.tabBioman);
	public static Item pink_bio_particles = new Item_ore("pink_bio_particles").setCreativeTab(Tabs.tabBioman);
	
	public static Item bio_sword = new Item_sword_gun("bio_sword",Tabs.sword_gun,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item fire_sword = new ItemBaseSword("fire_sword", Tabs.sword,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item hurricane_sword = new ItemBaseSword("hurricane_sword", Tabs.sword,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item elec_sword = new ItemBaseSword("elec_sword", Tabs.sword,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item thunder_sword = new ItemBaseSword("thunder_sword", Tabs.sword,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item laser_sword = new ItemBaseSword("laser_sword", Tabs.sword,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item bio_arrow = new Item_gun("bio_arrow", Tabs.bow,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	
	public static Item bi_buster = new Item_gun("bi_buster",Tabs.gun,RiderItems.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	
	//09 Dengeki Sentai Changeman
	public static Item changeman_logo = new Item_ore("changeman_logo").setCreativeTab(Tabs.tabMisc);
	
	//10 Choushinsei Flashman
	public static Item flashman_logo = new Item_ore("flashman_logo").setCreativeTab(Tabs.tabFlashman);
//	public static Block flashman_ore = new ore_block("flashman_ore", Material.ROCK, flashman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabFlashman);
	
	public static Item flashman_head = new item_flashman_armor("flashman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item flashman_torso = new item_flashman_armor2("flashman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item flashman_legs = new item_flashman_armor2("flashman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	
	public static Item red_prism_flash = new item_prism_flash("red_prism_flash", ArmorMaterial.DIAMOND, 4, "red_flash").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item green_prism_flash = new item_prism_flash("green_prism_flash", ArmorMaterial.DIAMOND, 4, "green_flash").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item blue_prism_flash = new item_prism_flash("blue_prism_flash", ArmorMaterial.DIAMOND, 4, "blue_flash").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item yellow_prism_flash = new item_prism_flash("yellow_prism_flash", ArmorMaterial.DIAMOND, 4, "yellow_flash").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item pink_prism_flash = new item_prism_flash("pink_prism_flash", ArmorMaterial.DIAMOND, 4, "pink_flash").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	
	public static Item flashman_belt = new Item_ore("flashman_belt");
	
	public static Item red_flash_prism = new Item_ore("red_flash_prism").setCreativeTab(Tabs.tabFlashman);
	public static Item green_flash_prism = new Item_ore("green_flash_prism").setCreativeTab(Tabs.tabFlashman);
	public static Item blue_flash_prism = new Item_ore("blue_flash_prism").setCreativeTab(Tabs.tabFlashman);
	public static Item yellow_flash_prism = new Item_ore("yellow_flash_prism").setCreativeTab(Tabs.tabFlashman);
	public static Item pink_flash_prism = new Item_ore("pink_flash_prism").setCreativeTab(Tabs.tabFlashman);
	
	public static Item prism_shooter = new Item_sword_gun("prism_shooter",Tabs.sword_gun,RiderItems.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_shooter_shield = new ItemBaseShield("prism_shooter_shield",RiderItems.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_holy_sword = new ItemBaseSword("prism_holy_sword", Tabs.sword,RiderItems.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_kaizer = new item_prism_armor(1, "prism_kaizer").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item star_darts = new ItemBaseSword("star_darts", Tabs.throwable,RiderItems.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_batons = new ItemBaseSword("prism_batons", Tabs.rod,RiderItems.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_boots = new item_prism_armor(1, "prism_boots").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	
	//11 Hikari Sentai Maskman
	public static Item maskman_logo = new Item_ore("maskman_logo").setCreativeTab(Tabs.tabMaskman);
//	public static Block maskman_ore = new ore_block("maskman_ore", Material.ROCK, maskman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabMaskman);
	
	public static Item maskman_head = new item_maskman_armor("maskman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item maskman_torso = new item_maskman_armor2("maskman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item maskman_legs = new item_maskman_armor2("maskman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	public static Item red_masking_brace = new item_masking_brace("red_masking_brace", ArmorMaterial.DIAMOND, 4, "red_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item black_masking_brace = new item_masking_brace("black_masking_brace", ArmorMaterial.DIAMOND, 4, "black_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item blue_masking_brace = new item_masking_brace("blue_masking_brace", ArmorMaterial.DIAMOND, 4, "blue_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item yellow_masking_brace = new item_masking_brace("yellow_masking_brace", ArmorMaterial.DIAMOND, 4, "yellow_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item pink_masking_brace = new item_masking_brace("pink_masking_brace", ArmorMaterial.DIAMOND, 4, "pink_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item x1_masking_brace = new item_masking_brace("x1_masking_brace", ArmorMaterial.DIAMOND, 4, "x1_mask").setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	public static Item red_aura_power = new Item_ore("red_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item black_aura_power = new Item_ore("black_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item blue_aura_power = new Item_ore("blue_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item yellow_aura_power = new Item_ore("yellow_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item pink_aura_power = new Item_ore("pink_aura_power").setCreativeTab(Tabs.tabMaskman);
	public static Item x1_aura_power = new Item_ore("x1_aura_power").setCreativeTab(Tabs.tabMaskman);
	
	public static Item laser_magnum_sword = new Item_sword_gun("laser_magnum_sword", Tabs.sword_gun,RiderItems.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_blade = new ItemBaseSword("masky_blade", Tabs.sword,RiderItems.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_rod = new ItemBaseSword("masky_rod", Tabs.rod,RiderItems.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_tonfa = new ItemBaseSword("masky_tonfa", Tabs.tonfa,RiderItems.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_rotor = new ItemBaseSword("masky_rotor", Tabs.throwable,RiderItems.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_ribbon = new ItemBaseSword("masky_ribbon", Tabs.whip,RiderItems.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	//12 Choujuu Sentai Liveman
	public static Item liveman_logo = new Item_ore("liveman_logo").setCreativeTab(Tabs.tabMisc);
	
	public static Item falcon_saber = new ItemBaseSword("falcon_saber",Tabs.gun,RiderItems.liveman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	//13 Kousoku Sentai Turboranger
	public static Item turboranger_logo = new item_fairy_power(1, "turboranger_logo").setCreativeTab(Tabs.tabTurboranger);
//	public static Block turboranger_ore = new ore_block("turboranger_ore", Material.ROCK, turboranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabTurboranger);
	
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
	
	public static Item red_turbo_logo = new item_fairy_power(0, "red_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item black_turbo_logo = new item_fairy_power(0, "black_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item blue_turbo_logo = new item_fairy_power(0, "blue_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item yellow_turbo_logo = new item_fairy_power(0, "yellow_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item pink_turbo_logo = new item_fairy_power(0, "pink_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	
	public static Item turbo_laser_sword = new Item_sword_gun("turbo_laser_sword", Tabs.sword_gun,RiderItems.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item gt_sword = new ItemBaseSword("gt_sword", Tabs.sword,RiderItems.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item t_hammer = new ItemBaseSword("t_hammer", Tabs.hammer,RiderItems.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item j_gun = new Item_gun("j_gun", Tabs.gun,RiderItems.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item b_bowgun = new Item_gun("b_bowgun", Tabs.bow,RiderItems.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item w_stick = new ItemBaseSword("w_stick", Tabs.rod,RiderItems.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_j = new Item_gun("turbo_laser_j", Tabs.super_gun,RiderItems.turboranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.turbo_laser_sword).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_w = new Item_gun("turbo_laser_w", Tabs.super_gun,RiderItems.turboranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.turbo_laser_sword).setCreativeTab(Tabs.tabTurboranger);
	
	//14 Chikyuu Sentai Fiveman
	public static Item fiveman_logo = new Item_ore("fiveman_logo").setCreativeTab(Tabs.tabMisc);
	
	//15 Choujin Sentai Jetman
	public static Item jetman_logo = new Item_ore("jetman_logo").setCreativeTab(Tabs.tabJetman);
	public static Item birdonic_wave = new Item_ore("birdonic_wave").setCreativeTab(Tabs.tabJetman);
//	public static Block jetman_ore = new ore_block("jetman_ore", Material.ROCK, birdonic_wave, 2).setHardness(9.9F).setCreativeTab(Tabs.tabJetman);
	
	public static Item jetman_head = new item_jetman_armor("jetman_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item jetman_torso = new item_jetman_armor2("jetman_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item jetman_legs = new item_jetman_armor2("jetman_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);

	public static Item red_cross_changer = new item_cross_changer("red_cross_changer", ArmorMaterial.DIAMOND, 4, "red_hawk").setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item black_cross_changer = new item_cross_changer("black_cross_changer", ArmorMaterial.DIAMOND, 4, "black_condor").setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item yellow_cross_changer = new item_cross_changer("yellow_cross_changer", ArmorMaterial.DIAMOND, 4, "yellow_owl").setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item white_cross_changer = new item_cross_changer("white_cross_changer", ArmorMaterial.DIAMOND, 4, "white_swan").setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item blue_cross_changer = new item_cross_changer("blue_cross_changer", ArmorMaterial.DIAMOND, 4, "blue_swallow").setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item green_cross_changer = new item_cross_changer("green_cross_changer", ArmorMaterial.DIAMOND, 4, "green_eagle").setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	
	public static Item hawk_birdonic_wave = new Item_ore("hawk_birdonic_wave").setCreativeTab(Tabs.tabJetman);
	public static Item condor_birdonic_wave = new Item_ore("condor_birdonic_wave").setCreativeTab(Tabs.tabJetman);
	public static Item owl_birdonic_wave = new Item_ore("owl_birdonic_wave").setCreativeTab(Tabs.tabJetman);
	public static Item swan_birdonic_wave = new Item_ore("swan_birdonic_wave").setCreativeTab(Tabs.tabJetman);
	public static Item swallow_birdonic_wave = new Item_ore("swallow_birdonic_wave").setCreativeTab(Tabs.tabJetman);

	public static Item jetman_manga = new item_manga(1,"jetman_manga").setCreativeTab(Tabs.tabJetman);
	
	public static Item jetman_belt = new Item_ore("jetman_belt");
	public static Item red_hawk_wing = new Item_ore("red_hawk_wing");
	public static Item black_condor_wing = new Item_ore("black_condor_wing");
	public static Item yellow_owl_wing = new Item_ore("yellow_owl_wing");
	public static Item white_swan_wing = new Item_ore("white_swan_wing");
	public static Item blue_swallow_wing = new Item_ore("blue_swallow_wing");
	
	public static Item bird_blaster = new Item_gun("bird_blaster",Tabs.gun,RiderItems.birdonic_wave).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item bringer_sword = new ItemBaseSword("bringer_sword",Tabs.sword,RiderItems.birdonic_wave).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item jet_hand_cannon = new Item_gun("jet_hand_cannon",Tabs.super_gun,RiderItems.birdonic_wave).setMaxStackSize(1).setContainerItem(RiderItems.bird_blaster).setCreativeTab(Tabs.tabJetman);
	public static Item beak_smasher = new Item_gun("beak_smasher",Tabs.super_gun,RiderItems.birdonic_wave).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item smash_bomber = new Item_gun("smash_bomber",Tabs.hyper_gun,RiderItems.birdonic_wave).setMaxStackSize(1).setContainerItem(RiderItems.beak_smasher).setCreativeTab(Tabs.tabJetman);
	
	//16 Kyoryu Sentai Zyuranger
	public static Item zyuranger_medal = new item_dino_medal(0,"zyuranger_medal").setCreativeTab(Tabs.tabZyuranger);
//	public static Block zyuranger_ore = new ore_block("zyuranger_ore", Material.ROCK, zyuranger_medal, 2).setHardness(9.9F).setCreativeTab(Tabs.tabZyuranger);
	
	public static Item zyuranger_head = new item_zyuranger_armor("zyuranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item zyuranger_torso = new item_zyuranger_armor2("zyuranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item zyuranger_legs = new item_zyuranger_armor2("zyuranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);

	public static Item tyranno_dino_buckler = new item_dino_buckler("tyranno_dino_buckler", ArmorMaterial.DIAMOND, 4, "tyranno_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item armed_tyranno_dino_buckler = new item_dino_buckler("armed_tyranno_dino_buckler", ArmorMaterial.DIAMOND, 4, "tyranno_ranger","zyu_full_dragon_shield").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item mammoth_dino_buckler = new item_dino_buckler("mammoth_dino_buckler", ArmorMaterial.DIAMOND, 4, "mammoth_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item tricera_dino_buckler = new item_dino_buckler("tricera_dino_buckler", ArmorMaterial.DIAMOND, 4, "tricera_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item tiger_dino_buckler = new item_dino_buckler("tiger_dino_buckler", ArmorMaterial.DIAMOND, 4, "tiger_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item ptera_dino_buckler = new item_dino_buckler("ptera_dino_buckler", ArmorMaterial.DIAMOND, 4, "ptera_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item unarmed_dragon_dino_buckler = new item_dino_buckler("unarmed_dragon_dino_buckler", ArmorMaterial.DIAMOND, 4, "dragon_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item dragon_dino_buckler = new item_dino_buckler("dragon_dino_buckler", ArmorMaterial.DIAMOND, 4, "dragon_ranger","zyu_full_dragon_shield").setMaxStackSize(1).setContainerItem(RiderItems.unarmed_dragon_dino_buckler).setCreativeTab(Tabs.tabZyuranger);
	
	public static Item tyranno_medal = new item_dino_medal(0,"tyranno_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item mammoth_medal = new item_dino_medal(0,"mammoth_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item tricera_medal = new item_dino_medal(0,"tricera_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item tiger_medal = new item_dino_medal(0,"tiger_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item ptera_medal = new item_dino_medal(0,"ptera_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item dragon_medal = new item_dino_medal(1,"dragon_medal").setCreativeTab(Tabs.tabZyuranger);
	
	public static Item ranger_sword = new Item_sword_gun("ranger_sword",Tabs.sword_gun,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item thunder_slinger = new Item_gun("thunder_slinger",Tabs.gun,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item ranger_slinger = new Item_gun("ranger_slinger",Tabs.super_gun,RiderItems.zyuranger_medal).setMaxStackSize(1).setContainerItem(RiderItems.thunder_slinger).setCreativeTab(Tabs.tabZyuranger);
	public static Item ryugekiken = new ItemBaseSword("ryugekiken",Tabs.sword,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item moth_breaker = new Item_sword_gun("moth_breaker",Tabs.sword_gun,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item trice_lance_trident = new ItemBaseSword("trice_lance_trident",Tabs.sword,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item trice_lance = new ItemBaseSword("trice_lance",Tabs.rod,RiderItems.zyuranger_medal).setMaxStackSize(1).setContainerItem(RiderItems.trice_lance_trident).setCreativeTab(Tabs.tabZyuranger);
	public static Item saber_dagger = new ItemBaseSword("saber_dagger",Tabs.throwable,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item ptera_arrow = new Item_gun("ptera_arrow",Tabs.bow,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item zyusouken = new ItemBaseSword("zyusouken",Tabs.sword,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item hellfriede = new ItemBaseSword("hellfriede",Tabs.super_sword,RiderItems.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	
	//17 Gosei Sentai Dairanger
	public static Item dairanger_logo = new Item_ore("dairanger_logo").setCreativeTab(Tabs.tabDairanger);
//	public static Block dairanger_ore = new ore_block("dairanger_ore", Material.ROCK, dairanger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabDairanger);
	
	public static Item dairanger_head = new item_dairanger_armor("dairanger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairanger_torso = new item_dairanger_armor2("dairanger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairanger_legs = new item_dairanger_armor2("dairanger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);

	public static Item ryuu_aura_changer = new item_aura_changer("ryuu_aura_changer", ArmorMaterial.DIAMOND, 4, "ryuu_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item shishi_aura_changer = new item_aura_changer("shishi_aura_changer", ArmorMaterial.DIAMOND, 4, "shishi_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item tenma_aura_changer = new item_aura_changer("tenma_aura_changer", ArmorMaterial.DIAMOND, 4, "tenma_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item kirin_aura_changer = new item_aura_changer("kirin_aura_changer", ArmorMaterial.DIAMOND, 4, "kirin_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item houou_aura_changer = new item_aura_changer("houou_aura_changer", ArmorMaterial.DIAMOND, 4, "houou_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item kiba_changer = new item_aura_changer("kiba_changer", ArmorMaterial.DIAMOND, 4, "kiba_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	
	public static Item red_lailai_jewel = new Item_ore("red_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item green_lailai_jewel = new Item_ore("green_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item blue_lailai_jewel = new Item_ore("blue_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item yellow_lailai_jewel = new Item_ore("yellow_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item pink_lailai_jewel = new Item_ore("pink_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item white_lailai_jewel = new Item_ore("white_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	
	public static Item dairanger_belt = new Item_ore("dairanger_belt");
	
	public static Item star_cutter = new ItemBaseSword("star_cutter",Tabs.sword,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item star_sword = new ItemBaseSword("star_sword",Tabs.sword,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dai_buster = new Item_gun("dai_buster",Tabs.gun,RiderItems.dairanger_logo).setMaxStackSize(1).setContainerItem(RiderItems.star_cutter).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_ryuu = new ItemBaseSword("dairen_rod_ryuu",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_shishi = new ItemBaseSword("dairen_rod_shishi",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_tenma = new ItemBaseSword("dairen_rod_tenma",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_kirin = new ItemBaseSword("dairen_rod_kirin",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_houou = new ItemBaseSword("dairen_rod_houou",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dragon_sword = new ItemBaseSword("dragon_sword",Tabs.sword,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item lion_cudgel = new ItemBaseSword("lion_cudgel",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item pegasus_nunchuck = new ItemBaseSword("pegasus_nunchuck",Tabs.tonfa,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item kirin_9_part_whip = new ItemBaseSword("kirin_9_part_whip",Tabs.whip,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item phoenix_spear = new ItemBaseSword("phoenix_spear",Tabs.rod,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairinken = new ItemBaseSword("dairinken",Tabs.sword,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item byakkoshinken = new ItemBaseSword("byakkoshinken",Tabs.sword,RiderItems.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	
	//18 Ninja Sentai Kakuranger
	public static Item kakuranger_logo = new Item_ore("kakuranger_logo").setCreativeTab(Tabs.tabKakuranger);
	
	public static Item kakuranger_head = new item_kakuranger_armor("kakuranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item kakuranger_torso = new item_kakuranger_armor2("kakuranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item kakuranger_legs = new item_kakuranger_armor2("kakuranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);

	public static Item red_doron_changer = new item_doron_changer("red_doron_changer", ArmorMaterial.DIAMOND, 4, "ninja_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item white_doron_changer = new item_doron_changer("white_doron_changer", ArmorMaterial.DIAMOND, 4, "ninja_white").setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item yellow_doron_changer = new item_doron_changer("yellow_doron_changer", ArmorMaterial.DIAMOND, 4, "ninja_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item blue_doron_changer = new item_doron_changer("blue_doron_changer", ArmorMaterial.DIAMOND, 4, "ninja_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item black_doron_changer = new item_doron_changer("black_doron_changer", ArmorMaterial.DIAMOND, 4, "ninja_black").setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninjaman_urn = new item_doron_changer("ninjaman_urn", ArmorMaterial.DIAMOND, 4, "ninja_man").setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	
	public static Item sasuke_medal = new Item_ore("sasuke_medal").setCreativeTab(Tabs.tabKakuranger);
	public static Item tsuruhime_medal = new Item_ore("tsuruhime_medal").setCreativeTab(Tabs.tabKakuranger);
	public static Item seikai_medal = new Item_ore("seikai_medal").setCreativeTab(Tabs.tabKakuranger);
	public static Item saizou_medal = new Item_ore("saizou_medal").setCreativeTab(Tabs.tabKakuranger);
	public static Item jiraiya_medal = new Item_ore("jiraiya_medal").setCreativeTab(Tabs.tabKakuranger);
	public static Item ninjaman_medal = new item_kakure_medal(1,"ninjaman_medal").setCreativeTab(Tabs.tabKakuranger);
	
	public static Item ninja_red_belt = new Item_ore("ninja_red_belt");
	public static Item ninja_white_belt = new Item_ore("ninja_white_belt");
	public static Item ninja_yellow_belt = new Item_ore("ninja_yellow_belt");
	public static Item ninja_blue_belt = new Item_ore("ninja_blue_belt");
	public static Item ninja_black_belt = new Item_ore("ninja_black_belt");
	
	public static Item kakuremaru = new ItemBaseSword("kakuremaru", Tabs.sword,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item kaku_laser = new Item_sword_gun("kaku_laser", Tabs.sword_gun,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_red_shuriken = new ItemBaseSword("ninja_red_shuriken", Tabs.throwable,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_white_shuriken = new ItemBaseSword("ninja_white_shuriken", Tabs.throwable,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_yellow_shuriken = new ItemBaseSword("ninja_yellow_shuriken", Tabs.throwable,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_blue_shuriken = new ItemBaseSword("ninja_blue_shuriken", Tabs.throwable,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_black_shuriken = new ItemBaseSword("ninja_black_shuriken", Tabs.throwable,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item shinobi_knuckle = new ItemBaseSword("shinobi_knuckle", Tabs.tonfa,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item red_slicer = new ItemBaseSword("red_slicer", Tabs.throwable,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item white_beak = new ItemBaseSword("white_beak", Tabs.sword,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item yellow_claw = new ItemBaseSword("yellow_claw", Tabs.sword,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item blue_shot = new Item_gun("blue_shot", Tabs.gun,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item black_bow = new Item_gun("black_bow", Tabs.bow,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item hikarimaru = new ItemBaseSword("hikarimaru", Tabs.super_sword,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_sword = new ItemBaseSword("ninja_sword", Tabs.sword,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item samurai_javelin = new ItemBaseSword("samurai_javelin", Tabs.rod,RiderItems.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	
	//19 Chouriki Sentai Ohranger
	public static Item ohranger_logo = new Item_ore("ohranger_logo").setCreativeTab(Tabs.tabMisc);
	
	//20 Gekisou Sentai Carranger
	public static Item carranger_logo = new Item_ore("carranger_logo").setCreativeTab(Tabs.tabCarranger);
//	public static Block carranger_ore = new ore_block("carranger_ore", Material.ROCK, carranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabCarranger);
	
	public static Item carranger_head = new item_carranger_armor("carranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item carranger_torso = new item_carranger_armor2("carranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item carranger_legs = new item_carranger_armor2("carranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);

	public static Item red_accel_changer = new item_accel_changer("red_accel_changer", ArmorMaterial.DIAMOND, 4, "red_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item blue_accel_changer = new item_accel_changer("blue_accel_changer", ArmorMaterial.DIAMOND, 4, "blue_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item green_accel_changer = new item_accel_changer("green_accel_changer", ArmorMaterial.DIAMOND, 4, "green_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item yellow_accel_changer = new item_accel_changer("yellow_accel_changer", ArmorMaterial.DIAMOND, 4, "yellow_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item pink_accel_changer = new item_accel_changer("pink_accel_changer", ArmorMaterial.DIAMOND, 4, "pink_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item white_racer_changer = new item_accel_changer("white_racer_changer", ArmorMaterial.DIAMOND, 4, "white_racer").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item signal_whistle = new item_accel_changer("signal_whistle", ArmorMaterial.DIAMOND, 4, "signalman").setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	
	public static Item red_racer_badge = new Item_ore("red_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item blue_racer_badge = new Item_ore("blue_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item green_racer_badge = new Item_ore("green_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item yellow_racer_badge = new Item_ore("yellow_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item pink_racer_badge = new Item_ore("pink_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item white_racer_badge = new Item_ore("white_racer_badge").setCreativeTab(Tabs.tabCarranger);
	public static Item signalman_badge = new Item_ore("signalman_badge").setCreativeTab(Tabs.tabCarranger);
	
	public static Item carranger_belt = new Item_ore("carranger_belt");
	
	public static Item auto_blaster = new item_charge_gun("auto_blaster", Tabs.gun,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item vi_blade = new ItemBaseSword("vi_blade", Tabs.sword,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item fender_sword = new ItemBaseSword("fender_sword", Tabs.sword,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item muffler_gun = new Item_gun("muffler_gun", Tabs.gun,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item engine_cannon = new Item_gun("engine_cannon", Tabs.super_gun,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item side_knuckle = new ItemBaseSword("side_knuckle", Tabs.tonfa,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item bumper_bow = new Item_gun("bumper_bow", Tabs.bow,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item navic_shot = new Item_gun("navic_shot", Tabs.gun,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item navic_blaster = new Item_gun("navic_blaster", Tabs.hyper_gun,RiderItems.carranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.navic_shot).setCreativeTab(Tabs.tabCarranger);
	public static Item signaizer = new Item_sword_gun("signaizer", Tabs.sword_gun,RiderItems.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	
	//21 Denji Sentai Megaranger
	public static Item megaranger_logo = new Item_ore("megaranger_logo").setCreativeTab(Tabs.tabMegaranger);
	public static Block megaranger_ore = new ore_block("megaranger_ore", Material.ROCK, megaranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabMegaranger);
	
	public static Item megaranger_head = new item_megaranger_armor("megaranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item megaranger_torso = new item_megaranger_armor2("megaranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item megaranger_legs = new item_megaranger_armor2("megaranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	
	public static Item red_digitaizer = new item_digitaizer("red_digitaizer", ArmorMaterial.DIAMOND, 4, "mega_red").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item black_digitaizer = new item_digitaizer("black_digitaizer", ArmorMaterial.DIAMOND, 4, "mega_black").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item blue_digitaizer = new item_digitaizer("blue_digitaizer", ArmorMaterial.DIAMOND, 4, "mega_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item yellow_digitaizer = new item_digitaizer("yellow_digitaizer", ArmorMaterial.DIAMOND, 4, "mega_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item pink_digitaizer = new item_digitaizer("pink_digitaizer", ArmorMaterial.DIAMOND, 4, "mega_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item keitaizer = new item_digitaizer("keitaizer", ArmorMaterial.DIAMOND, 4, "mega_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	
	public static Item mega_red_disk = new item_mega_disk(0, "mega_red_disk").setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_black_disk = new item_mega_disk(0, "mega_black_disk").setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_blue_disk = new item_mega_disk(0, "mega_blue_disk").setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_yellow_disk = new item_mega_disk(0, "mega_yellow_disk").setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_pink_disk = new item_mega_disk(0, "mega_pink_disk").setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_silver_disk = new item_mega_disk(0, "mega_silver_disk").setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_tector_disk = new item_mega_disk(1, "mega_tector_disk").setCreativeTab(Tabs.tabMegaranger);
	
	public static Item battleraizer = new item_battleraizer("battleraizer").setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	
	public static Item mega_magnum = new Item_gun("mega_magnum", Tabs.gun,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_shot = new Item_gun("mega_shot", Tabs.gun,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_sniper = new Item_gun("mega_sniper", Tabs.gun,RiderItems.megaranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.mega_magnum).setCreativeTab(Tabs.tabMegaranger);
	public static Item drill_saber = new ItemBaseSword("drill_saber", Tabs.sword,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_rod = new ItemBaseSword("mega_rod", Tabs.rod,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_tomahawk = new ItemBaseSword("mega_tomahawk", Tabs.axe,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_sling = new Item_gun("mega_sling", Tabs.gun,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_capture = new Item_gun("mega_capture", Tabs.gun,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item silver_blazer = new Item_sword_gun("silver_blazer", Tabs.sword_gun,RiderItems.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item drill_sniper = new Item_gun("drill_sniper", Tabs.super_gun,RiderItems.megaranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.drill_saber).setCreativeTab(Tabs.tabMegaranger);
	public static Item rod_sniper = new Item_gun("rod_sniper", Tabs.super_gun,RiderItems.megaranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.mega_rod).setCreativeTab(Tabs.tabMegaranger);
	public static Item tomahawk_sniper = new Item_gun("tomahawk_sniper", Tabs.super_gun,RiderItems.megaranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.mega_tomahawk).setCreativeTab(Tabs.tabMegaranger);
	public static Item sling_sniper = new Item_gun("sling_sniper", Tabs.super_gun,RiderItems.megaranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.mega_sling).setCreativeTab(Tabs.tabMegaranger);
	public static Item capture_sniper = new Item_gun("capture_sniper", Tabs.super_gun,RiderItems.megaranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.mega_capture).setCreativeTab(Tabs.tabMegaranger);
	
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
	public static Item black_knight_bull_riot = new item_ginga_brace("black_knight_bull_riot", ArmorMaterial.DIAMOND, 4, "black_knight").setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
	public static Item beast_armor_shine_belt = new Item_ore("beast_armor_shine_belt");
	
	public static Item red_ginga_medal = new item_ginga_medal(0, "red_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item green_ginga_medal = new item_ginga_medal(0, "green_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item blue_ginga_medal = new item_ginga_medal(0, "blue_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item yellow_ginga_medal = new item_ginga_medal(0, "yellow_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item pink_ginga_medal = new item_ginga_medal(0, "pink_ginga_medal").setCreativeTab(Tabs.tabGingaman);
	public static Item lights_of_ginga = new item_ginga_medal(1, "lights_of_ginga").setCreativeTab(Tabs.tabGingaman);
	public static Item black_knight_core = new item_ginga_medal(0, "black_knight_core").setCreativeTab(Tabs.tabGingaman);
	
	public static Item starbeast_sword = new ItemBaseSword("starbeast_sword", Tabs.sword,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_cutter = new ItemBaseSword("kiba_cutter", Tabs.sword,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_shot = new Item_gun("kiba_shot", Tabs.gun,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_claw = new ItemBaseSword("kiba_claw", Tabs.sword,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_knife = new ItemBaseSword("kiba_knife", Tabs.sword,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_arrow = new Item_gun("kiba_arrow", Tabs.bow,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_red = new Item_gun("beast_attack_rod_red", Tabs.bazooka,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_green = new Item_gun("beast_attack_rod_green", Tabs.bazooka,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_blue = new Item_gun("beast_attack_rod_blue", Tabs.bazooka,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_yellow = new Item_gun("beast_attack_rod_yellow", Tabs.bazooka,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_pink = new Item_gun("beast_attack_rod_pink", Tabs.bazooka,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item bull_riot = new item_sword_gun_changer("bull_riot", Tabs.sword_gun,RiderItems.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
	//23 Kyukyu Sentai GoGo-V
	public static Item gogo_v_logo = new Item_ore("gogo_v_logo").setCreativeTab(Tabs.tabGogoV);
//	public static Block gogo_v_ore = new ore_block("gogo_v_ore", Material.ROCK, gogo_v_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGogoV);
	
	public static Item gogo_v_head = new item_gogo_v_armor("gogo_v_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item gogo_v_torso = new item_gogo_v_armor2("gogo_v_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item gogo_v_legs = new item_gogo_v_armor2("gogo_v_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	public static Item red_gogo_brace = new item_gogo_brace("red_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item blue_gogo_brace = new item_gogo_brace("blue_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item green_gogo_brace = new item_gogo_brace("green_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_green").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item yellow_gogo_brace = new item_gogo_brace("yellow_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item pink_gogo_brace = new item_gogo_brace("pink_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item red_kyoko_gogo_brace = new item_gogo_brace("red_kyoko_gogo_brace", ArmorMaterial.DIAMOND, 4, "go_red_kyoko").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_crystal = new item_gogo_brace("zeek_crystal", ArmorMaterial.DIAMOND, 4, "zeek").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item jeanne_crystal = new item_gogo_brace("jeanne_crystal", ArmorMaterial.DIAMOND, 4, "jeanne").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	public static Item go_red_badge = new Item_ore("go_red_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_blue_badge = new Item_ore("go_blue_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_green_badge = new Item_ore("go_green_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_yellow_badge = new Item_ore("go_yellow_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item go_pink_badge = new Item_ore("go_pink_badge").setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_fragment = new Item_ore("zeek_fragment").setCreativeTab(Tabs.tabGogoV);
	
	public static Item v_mode_brace = new item_v_mode_brace("v_mode_brace").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	public static Item laser_grip_red = new Item_ore("laser_grip_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_blue = new Item_ore("laser_grip_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_green = new Item_ore("laser_grip_green").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_yellow = new Item_ore("laser_grip_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item laser_grip_pink = new Item_ore("laser_grip_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_red = new Item_sword_gun("five_laser_red",Tabs.sword_gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_blue = new Item_sword_gun("five_laser_blue",Tabs.sword_gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_green = new Item_sword_gun("five_laser_green",Tabs.sword_gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_yellow = new Item_sword_gun("five_laser_yellow",Tabs.sword_gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_pink = new Item_sword_gun("five_laser_pink",Tabs.sword_gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_red = new ItemBaseSword("v_boomerang_red",Tabs.boomerang,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_blue = new ItemBaseSword("v_boomerang_blue",Tabs.boomerang,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_green = new ItemBaseSword("v_boomerang_green",Tabs.boomerang,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_yellow = new ItemBaseSword("v_boomerang_yellow",Tabs.boomerang,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_pink = new ItemBaseSword("v_boomerang_pink",Tabs.boomerang,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_red = new ItemBaseSword("v_lancer_red",Tabs.rod,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_blue = new ItemBaseSword("v_lancer_blue",Tabs.rod,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_green = new ItemBaseSword("v_lancer_green",Tabs.rod,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_yellow = new ItemBaseSword("v_lancer_yellow",Tabs.rod,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_pink = new ItemBaseSword("v_lancer_pink",Tabs.rod,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_red = new Item_gun("v_machine_gun_red",Tabs.bazooka,RiderItems.gogo_v_logo).setMaxStackSize(1).setContainerItem(RiderItems.v_lancer_red).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_blue = new Item_gun("v_machine_gun_blue",Tabs.bazooka,RiderItems.gogo_v_logo).setMaxStackSize(1).setContainerItem(RiderItems.v_lancer_blue).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_green = new Item_gun("v_machine_gun_green",Tabs.bazooka,RiderItems.gogo_v_logo).setMaxStackSize(1).setContainerItem(RiderItems.v_lancer_green).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_yellow = new Item_gun("v_machine_gun_yellow",Tabs.bazooka,RiderItems.gogo_v_logo).setMaxStackSize(1).setContainerItem(RiderItems.v_lancer_yellow).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_pink = new Item_gun("v_machine_gun_pink",Tabs.bazooka,RiderItems.gogo_v_logo).setMaxStackSize(1).setContainerItem(RiderItems.v_lancer_pink).setCreativeTab(Tabs.tabGogoV);
	public static Item go_blaster = new Item_gun("go_blaster",Tabs.gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item go_blaster_hyper = new Item_gun("go_blaster_hyper",Tabs.super_gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setContainerItem(RiderItems.go_blaster).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_sword = new ItemBaseSword("zeek_sword",Tabs.sword,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_shot = new Item_gun("zeek_shot",Tabs.gun,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_blaster = new Item_gun("zeek_blaster",Tabs.bazooka,RiderItems.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	//24 Mirai Sentai Timeranger
	public static Item timeranger_logo = new Item_ore("timeranger_logo").setCreativeTab(Tabs.tabMisc);
	
	//25 Hyakujuu Sentai Gaoranger
	public static Item gaoranger_logo = new Item_ore("gaoranger_logo").setCreativeTab(Tabs.tabGaoranger);
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
	
	public static Item gao_lion_jewel = new item_gao_jewel(0, "gao_lion_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_eagle_jewel = new item_gao_jewel(0, "gao_eagle_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_shark_jewel = new item_gao_jewel(1, "gao_shark_jewel", "right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_bison_jewel = new item_gao_jewel(0, "gao_bison_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_tiger_jewel = new item_gao_jewel(1, "gao_tiger_jewel", "left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_wolf_jewel = new item_gao_jewel(4, "gao_wolf_jewel", "left").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_elephant_jewel = new item_gao_jewel(0, "gao_elephant_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_giraffe_jewel = new item_gao_jewel(2, "gao_giraffe_jewel", "right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_bear_jewel = new item_gao_jewel(3, "gao_bear_jewel", "left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_polar_jewel = new item_gao_jewel(3, "gao_polar_jewel", "right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_gorilla_jewel = new item_gao_jewel(0, "gao_gorilla_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hammerhead_jewel = new item_gao_jewel(4, "gao_hammerhead_jewel", "right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_ligator_jewel = new item_gao_jewel(0, "gao_ligator_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_rhinos_jewel = new item_gao_jewel(0, "gao_rhinos_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_madillo_jewel = new item_gao_jewel(0, "gao_madillo_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_deers_jewel = new item_gao_jewel(2, "gao_deers_jewel", "left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_falcon_jewel = new item_gao_jewel(0, "gao_falcon_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_leon_jewel = new item_gao_jewel(0, "gao_leon_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_condor_jewel = new item_gao_jewel(0, "gao_condor_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_sawshark_jewel = new item_gao_jewel(5, "gao_sawshark_jewel", "right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_buffalo_jewel = new item_gao_jewel(0, "gao_buffalo_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_jaguar_jewel = new item_gao_jewel(5, "gao_jaguar_jewel", "left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_kong_jewel = new item_gao_jewel(0, "gao_kong_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_panda_jewel = new item_gao_jewel(6, "gao_panda_jewel", "right").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_lion_blue_jewel = new item_gao_jewel(0, "gao_lion_blue_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_lion_black_jewel = new item_gao_jewel(0, "gao_lion_black_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_lion_white_jewel = new item_gao_jewel(0, "gao_lion_white_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_ape_jewel = new item_gao_jewel(0, "gao_ape_jewel", "blank").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item unfinished_gao_god_jewel = new Item_ore("unfinished_gao_god_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item empty_gao_god_jewel = new Item_ore("empty_gao_god_jewel").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item beast_king_sword = new ItemBaseSword("beast_king_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item lion_beast_king_sword = new ItemBaseSword("lion_beast_king_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item eagle_beast_king_sword = new ItemBaseSword("eagle_beast_king_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item shark_beast_king_sword = new ItemBaseSword("shark_beast_king_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item bison_beast_king_sword = new ItemBaseSword("bison_beast_king_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item tiger_beast_king_sword = new ItemBaseSword("tiger_beast_king_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item evil_crushing_hundred_beast_sword = new item_cannon("evil_crushing_hundred_beast_sword", Tabs.super_sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item lion_fang = new ItemBaseSword("lion_fang", Tabs.tonfa,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_mane_buster = new item_charge_gun("gao_mane_buster", Tabs.gun,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item eagle_sword = new ItemBaseSword("eagle_sword", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item shark_cutter = new ItemBaseSword("shark_cutter", Tabs.tonfa,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item bison_axe = new ItemBaseSword("bison_axe", Tabs.axe,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item tiger_baton = new ItemBaseSword("tiger_baton", Tabs.rod,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hustler_rod = new Item_sword_gun("gao_hustler_rod", Tabs.sword_gun,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item falcon_summoner = new item_charge_gun("falcon_summoner", Tabs.gun,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item mikazukiken = new ItemBaseSword("mikazukiken", Tabs.sword,RiderItems.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item flute_knife = new item_flute_knife("flute_knife", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_king_head = new item_gaoranger_mecha("gao_king_head", Tabs.mecha, 4, "gao_king").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_king_torso = new item_gaoranger_mecha_armor2("gao_king_torso", Tabs.mecha, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_king_legs = new item_gaoranger_mecha_armor2("gao_king_legs", Tabs.mecha, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_king_boots = new item_gaoranger_mecha_armor("gao_king_boots", Tabs.mecha, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_muscle_head = new item_gaoranger_mecha("gao_muscle_head", Tabs.mecha, 4, "gao_muscle").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hunter_head = new item_gaoranger_mecha("gao_hunter_head", Tabs.mecha, 4, "gao_hunter").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hunter_blue_moon_head = new item_gaoranger_mecha("gao_hunter_blue_moon_head", Tabs.mecha, 4, "gao_hunter_blue_moon").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_icarus_head = new item_gaoranger_mecha("gao_icarus_head", Tabs.mecha, 4, "gao_icarus").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_god_head = new item_gaoranger_mecha("gao_god_head", Tabs.mecha, 4, "gao_god").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_knight_head = new item_gaoranger_mecha("gao_knight_head", Tabs.mecha, 4, "gao_knight").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item fin_blade = new ItemBaseSword("fin_blade", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item elephant_sword = new ItemBaseSword("elephant_sword", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item elephant_shield = new ItemBaseShield("elephant_shield",RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item ligator_blade = new ItemBaseSword("ligator_blade", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item ligator_blade_blue_moon = new ItemBaseSword("ligator_blade_blue_moon", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	//26 Ninpuu Sentai Hurricaneger
	public static Item hurricaneger_logo = new Item_ore("hurricaneger_logo").setCreativeTab(Tabs.tabMisc);
	
	public static Item shurikens_bat = new item_dual_sword("shurikens_bat", Tabs.sword,RiderItems.hurricaneger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	//27 Bakuryu Sentai Abaranger
	public static Item abaranger_logo = new Item_ore("abaranger_logo").setCreativeTab(Tabs.tabAbaranger);
	public static Block abaranger_ore = new ore_block("abaranger_ore", Material.ROCK, abaranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaranger_head = new item_abaranger_armor("abaranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaranger_torso = new item_abaranger_armor2("abaranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaranger_legs = new item_abaranger_armor2("abaranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item red_dino_brace = new item_dino_brace("red_dino_brace", ArmorMaterial.DIAMOND, 4, "aba_red").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item blue_dino_brace = new item_dino_brace("blue_dino_brace", ArmorMaterial.DIAMOND, 4, "abare_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item yellow_dino_brace = new item_dino_brace("yellow_dino_brace", ArmorMaterial.DIAMOND, 4, "abare_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item dino_commander = new item_dino_brace("dino_commander", ArmorMaterial.DIAMOND, 4, "abare_black").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item dino_minder = new item_dino_brace("dino_minder", ArmorMaterial.DIAMOND, 4, "abare_killer").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item tyranno_dino_guts = new item_dino_guts(0, "tyranno_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item tricera_dino_guts = new item_dino_guts(0, "tricera_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item ptera_dino_guts = new item_dino_guts(0, "ptera_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item brachio_dino_guts = new item_dino_guts(0, "brachio_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item top_dino_guts = new item_dino_guts(3, "top_dino_guts", "right").setCreativeTab(Tabs.tabAbaranger);
	
	public static Item bachycelo_dino_guts = new item_dino_guts(1, "bachycelo_dino_guts", "right").setCreativeTab(Tabs.tabAbaranger);
	public static Item dimenoko_dino_guts = new item_dino_guts(1, "dimenoko_dino_guts", "left").setCreativeTab(Tabs.tabAbaranger);
	public static Item stego_dino_guts = new item_dino_guts(0, "stego_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item parasa_dino_guts = new item_dino_guts(2, "parasa_dino_guts", "left").setCreativeTab(Tabs.tabAbaranger);
	public static Item ankylo_dino_guts = new item_dino_guts(2, "ankylo_dino_guts", "right").setCreativeTab(Tabs.tabAbaranger);
	public static Item firenoko_dino_guts = new item_dino_guts(3, "firenoko_dino_guts", "left").setCreativeTab(Tabs.tabAbaranger);
	public static Item max_tyranno_dino_guts = new item_dino_guts(0, "max_tyranno_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item max_tricera_dino_guts = new item_dino_guts(0, "max_tricera_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item max_ptera_dino_guts = new item_dino_guts(0, "max_ptera_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item carno_dino_guts = new item_dino_guts(0, "carno_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	public static Item chasmo_dino_guts = new item_dino_guts(0, "chasmo_dino_guts", "blank").setCreativeTab(Tabs.tabAbaranger);
	
	public static Item aba_laser = new Item_sword_gun("aba_laser", Tabs.sword_gun,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item baku_laser = new Item_sword_gun("baku_laser", Tabs.sword_gun,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item tyranno_rod = new ItemBaseSword("tyranno_rod", Tabs.rod,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item tricera_bunker = new ItemBaseSword("tricera_bunker", Tabs.hammer,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item ptera_dagger = new ItemBaseSword("ptera_dagger", Tabs.sword,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item dino_thruster = new ItemBaseSword("dino_thruster", Tabs.rod,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item wing_pentact = new ItemBaseSword("wing_pentact", Tabs.sword,RiderItems.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item sty_riser = new item_sty_riser("sty_riser", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item sty_riser_shield = new item_sty_riser_shield("sty_riser_shield").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaren_oh_head = new item_abaranger_mecha("abaren_oh_head", Tabs.mecha, 4, "abaren_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaren_oh_torso = new item_abaranger_mecha_armor2("abaren_oh_torso", Tabs.mecha, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaren_oh_legs = new item_abaranger_mecha_armor2("abaren_oh_legs", Tabs.mecha, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaren_oh_boots = new item_abaranger_mecha_armor("abaren_oh_boots", Tabs.mecha, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaren_ohji_head = new item_abaranger_mecha("abaren_ohji_head", Tabs.mecha, 4, "abaren_ohji").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item killer_oh_head = new item_abaranger_mecha("killer_oh_head", Tabs.mecha, 4, "killer_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item max_ohja_head = new item_abaranger_mecha("max_ohja_head", Tabs.mecha, 4, "max_ohja").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item max_ryuoh_head = new item_abaranger_mecha("max_ryuoh_head", Tabs.mecha, 4, "max_ryuoh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item oo_abaren_oh_head = new item_abaranger_mecha("oo_abaren_oh_head", Tabs.mecha, 4, "oo_abaren_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item bakuren_oh_head = new item_abaranger_mecha("bakuren_oh_head", Tabs.mecha, 4, "bakuren_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item oo_abaren_oh_wings = new Item_ore("oo_abaren_oh_wings");
	
	public static Item double_tall_sword = new ItemBaseSword("double_tall_sword", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item tricera_shield = new ItemBaseShield("tricera_shield",RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item gale_spear = new ItemBaseSword("gale_spear", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item bakuryu_axe = new ItemBaseSword("bakuryu_axe", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item bakuryu_spear = new ItemBaseSword("bakuryu_spear", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setContainerItem(bakuryu_axe).setCreativeTab(Tabs.tabAbaranger);
	public static Item double_tall_sword_bakuren_oh = new ItemBaseSword("double_tall_sword_bakuren_oh", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item chasmo_shield = new ItemBaseShield("chasmo_shield",RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	//28 Tokusou Sentai Dekaranger
	public static Item dekaranger_badge = new Item_ore("dekaranger_badge").setCreativeTab(Tabs.tabMisc);
	
	//29 Mahou Sentai Magiranger
	public static Item magiranger_logo = new Item_ore("magiranger_logo").setCreativeTab(Tabs.tabMisc);
	
	public static Item magi_king_wings = new Item_ore("magi_king_wings");
	
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
	public static Item zubaan = new item_accellular("zubaan", ArmorMaterial.DIAMOND, 4, "zubaan").setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
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
	public static Item zubaan_crystal = new item_bouken_spirit(0,"zubaan_crystal").setCreativeTab(Tabs.tabBoukenger);
	
	public static Item survi_blade = new Item_sword_gun("survi_blade",Tabs.sword_gun,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_bo = new ItemBaseSword("bouken_bo",Tabs.rod,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item radial_hammer = new ItemBaseSword("radial_hammer",Tabs.hammer,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item blow_knuckle = new ItemBaseSword("blow_knuckle",Tabs.tonfa,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item bucket_scooper = new ItemBaseSword("bucket_scooper",Tabs.tonfa,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item hydro_shooter = new Item_gun("hydro_shooter",Tabs.gun,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item sagaspear = new Item_sword_gun("sagaspear",Tabs.sword_gun,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item dual_crusher_mixer = new item_dual_gun("dual_crusher_mixer",Tabs.super_gun,RiderItems.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
	//31 Juken Sentai Gekiranger
	public static Item gekiranger_logo = new Item_ore("gekiranger_logo").setCreativeTab(Tabs.tabGekiranger);
	public static Block gekiranger_ore = new ore_block("gekiranger_ore", Material.ROCK, gekiranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGekiranger);
	
	public static Item gekiranger_head = new item_gekiranger_armor("gekiranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item gekiranger_torso = new item_gekiranger_armor2("gekiranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item gekiranger_legs = new item_gekiranger_armor2("gekiranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	
	public static Item red_geki_changer = new item_geki_changer("red_geki_changer", ArmorMaterial.DIAMOND, 4, "geki_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item yellow_geki_changer = new item_geki_changer("yellow_geki_changer", ArmorMaterial.DIAMOND, 4, "geki_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item blue_geki_changer = new item_geki_changer("blue_geki_changer", ArmorMaterial.DIAMOND, 4, "geki_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item gong_changer = new item_geki_changer("gong_changer", ArmorMaterial.DIAMOND, 4, "geki_violet").setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item chopper_sai_blade = new item_geki_changer("chopper_sai_blade", ArmorMaterial.DIAMOND, 4, "geki_chopper").setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	
	public static Item tiger_spirit = new Item_ore("tiger_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item cheetah_spirit = new Item_ore("cheetah_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item jaguar_spirit = new Item_ore("jaguar_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item wolf_spirit = new Item_ore("wolf_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item rhino_spirit = new Item_ore("rhino_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item elephant_spirit = new Item_ore("elephant_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item bat_spirit = new Item_ore("bat_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item shark_spirit = new Item_ore("shark_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item gorilla_spirit = new Item_ore("gorilla_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item penguin_spirit = new Item_ore("penguin_spirit").setCreativeTab(Tabs.tabGekiranger);
	public static Item gazelle_spirit = new Item_ore("gazelle_spirit").setCreativeTab(Tabs.tabGekiranger);
	
	public static Item red_super_geki_claw = new item_super_geki_claw("red_super_geki_claw",Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item yellow_super_geki_claw = new item_super_geki_claw("yellow_super_geki_claw",Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item blue_super_geki_claw = new item_super_geki_claw("blue_super_geki_claw",Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item sai_blade_cutter = new item_sword_gun_changer("sai_blade_cutter",Tabs.sword_gun,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_tonfa = new ItemBaseSword("geki_tonfa",Tabs.tonfa,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_tonfa_baton = new ItemBaseSword("geki_tonfa_baton",Tabs.sword,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_tonfa_long_baton = new ItemBaseSword("geki_tonfa_long_baton",Tabs.rod,RiderItems.gekiranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.geki_tonfa_baton).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_hammer = new ItemBaseSword("geki_hammer",Tabs.megaton,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_fan = new ItemBaseSword("geki_fan",Tabs.boomerang,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_saber_twin_a = new ItemBaseSword("geki_saber_twin_a",Tabs.sword,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_saber_twin_b = new ItemBaseSword("geki_saber_twin_b",Tabs.sword,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_saber_twin_combo = new ItemBaseSword("geki_saber_twin_combo",Tabs.super_sword,RiderItems.gekiranger_logo).setMaxStackSize(1).setContainerItem(RiderItems.geki_saber_twin_b).setCreativeTab(Tabs.tabGekiranger);
	public static Item virtuous_beast_sword = new ItemBaseSword("virtuous_beast_sword",Tabs.super_sword,RiderItems.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	
	//32 Engine Sentai Go-Onger
	public static Item go_onger_logo = new Item_ore("go_onger_logo").setCreativeTab(Tabs.tabGoOnger);
	public static Item blank_engine_soul = new Item_ore("blank_engine_soul").setCreativeTab(Tabs.tabGoOnger);
	public static Block go_onger_ore = new ore_block("go_onger_ore", Material.ROCK, blank_engine_soul, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item go_onger_head = new item_go_onger_armor("go_onger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item go_onger_torso = new item_go_onger_armor2("go_onger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item go_onger_legs = new item_go_onger_armor2("go_onger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item red_go_phone = new item_go_phone("red_go_phone", ArmorMaterial.DIAMOND, 4, "go_on_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item blue_go_phone = new item_go_phone("blue_go_phone", ArmorMaterial.DIAMOND, 4, "go_on_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item yellow_go_phone = new item_go_phone("yellow_go_phone", ArmorMaterial.DIAMOND, 4, "go_on_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item green_shift_changer = new item_go_phone("green_shift_changer", ArmorMaterial.DIAMOND, 4, "go_on_green").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item black_shift_changer = new item_go_phone("black_shift_changer", ArmorMaterial.DIAMOND, 4, "go_on_black").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item gold_wing_trigger = new item_go_phone("gold_wing_trigger", ArmorMaterial.DIAMOND, 4, "go_on_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item silver_wing_trigger = new item_go_phone("silver_wing_trigger", ArmorMaterial.DIAMOND, 4, "go_on_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item kega_go_phone = new item_go_phone("kega_go_phone", ArmorMaterial.DIAMOND, 4, "kega_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item go_onger_belt = new Item_ore("go_onger_belt");
	public static Item go_on_gold_belt = new Item_ore("go_on_gold_belt");
	public static Item go_on_silver_belt = new Item_ore("go_on_silver_belt");
	
	public static Item speedor_soul = new item_engine_soul(0, "speedor_soul", "blank").setCreativeTab(Tabs.tabGoOnger);
	public static Item buson_soul = new item_engine_soul(0, "buson_soul", "blank").setCreativeTab(Tabs.tabGoOnger);
	public static Item bear_rv_soul = new item_engine_soul(0, "bear_rv_soul", "blank").setCreativeTab(Tabs.tabGoOnger);
	public static Item birca_soul = new item_engine_soul(1, "birca_soul", "right").setCreativeTab(Tabs.tabGoOnger);
	public static Item gunpherd_soul = new item_engine_soul(2, "gunpherd_soul", "left").setCreativeTab(Tabs.tabGoOnger);
	public static Item toripter_soul = new item_engine_soul(3, "toripter_soul", "right").setCreativeTab(Tabs.tabGoOnger);
	public static Item jetras_soul = new item_engine_soul(3, "jetras_soul", "left").setCreativeTab(Tabs.tabGoOnger);
	
	public static Item carrigator_soul = new item_engine_soul(0, "carrigator_soul", "blank").setCreativeTab(Tabs.tabGoOnger);//collectible
	public static Item jumbowhale_soul = new item_engine_soul(0, "jumbowhale_soul", "blank").setCreativeTab(Tabs.tabGoOnger);//rocket_dagger
	public static Item kishamoth_soul = new item_engine_soul(0, "kishamoth_soul", "blank").setCreativeTab(Tabs.tabGoOnger);//kankanbar
	public static Item t_line_soul = new item_engine_soul(4, "t_line_soul", "right").setCreativeTab(Tabs.tabGoOnger);//collectible
	public static Item k_line_soul = new item_engine_soul(4, "k_line_soul", "left").setCreativeTab(Tabs.tabGoOnger);//collectible
	
	public static Item daishogun_soul = new Item_ore("daishogun_soul").setCreativeTab(Tabs.tabGoOnger);
	public static Item skydor_soul = new Item_ore("skydor_soul").setCreativeTab(Tabs.tabGoOnger);
	public static Item kegalesia_soul = new Item_ore("kegalesia_soul").setCreativeTab(Tabs.tabGoOnger);
	
	public static Item mantan_sword = new Item_sword_gun("mantan_sword", Tabs.sword_gun,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item road_sabre = new ItemBaseSword("road_sabre", Tabs.sword,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item garage_launcher = new Item_gun("garage_launcher", Tabs.super_gun,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item bridge_axe = new ItemBaseSword("bridge_axe", Tabs.axe,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item cowl_laser = new Item_gun("cowl_laser", Tabs.gun,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item rocket_dagger = new ItemBaseSword("rocket_dagger", Tabs.sword,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item wing_booster = new Item_gun("wing_booster", Tabs.super_gun,RiderItems.blank_engine_soul).setMaxStackSize(1).setContainerItem(RiderItems.rocket_dagger).setCreativeTab(Tabs.tabGoOnger);
	public static Item wing_booster_silver = new Item_gun("wing_booster_silver", Tabs.super_gun,RiderItems.blank_engine_soul).setMaxStackSize(1).setContainerItem(RiderItems.rocket_dagger);
	public static Item kankanbar = new ItemBaseSword("kankanbar", Tabs.super_sword,RiderItems.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item kankan_mantan_gun = new Item_gun("kankan_mantan_gun", Tabs.super_gun,RiderItems.blank_engine_soul).setMaxStackSize(1).setContainerItem(RiderItems.mantan_sword).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item engine_oh_head = new item_go_onger_mecha("engine_oh_head", Tabs.mecha, 4, "engine_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item engine_oh_torso = new item_go_onger_mecha_armor2("engine_oh_torso", Tabs.mecha, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_legs = new item_go_onger_mecha_armor2("engine_oh_legs", Tabs.mecha, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_boots = new item_go_onger_mecha_armor("engine_oh_boots", Tabs.mecha, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item gunbir_oh_head = new item_go_onger_mecha("gunbir_oh_head", Tabs.mecha, 4, "gunbir_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_g6_head = new item_go_onger_mecha("engine_oh_g6_head", Tabs.mecha, 4, "engine_oh_g6").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item seikuu_oh_head = new item_go_onger_mecha("seikuu_oh_head", Tabs.mecha, 4, "seikuu_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_g9_head = new item_go_onger_mecha("engine_oh_g9_head", Tabs.mecha, 4, "engine_oh_g9").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item kyoretsu_oh_head = new item_go_onger_mecha("kyoretsu_oh_head", Tabs.mecha, 4, "kyoretsu_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_g12_head = new item_go_onger_mecha("engine_oh_g12_head", Tabs.mecha, 4, "engine_oh_g12").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_daishogun_head = new item_go_onger_mecha("engine_daishogun_head", Tabs.mecha, 4, "engine_daishogun").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item skydor_engine_oh_head = new item_go_onger_mecha("skydor_engine_oh_head", Tabs.mecha, 4, "skydor_engine_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item go_on_sword = new ItemBaseSword("go_on_sword", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item v_shield = new ItemBaseShield("v_shield",RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item enjin_ken = new ItemBaseSword("enjin_ken", Tabs.mecha_sword,RiderItems.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	//33 Samurai Sentai Shinkenger
	public static Item shinkenger_logo = new Item_ore("shinkenger_logo").setCreativeTab(Tabs.tabShinkenger);
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
	
	public static Item shinkenmaru = new ItemBaseSword("shinkenmaru", Tabs.sword,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item rekka_daizantou = new ItemBaseSword("rekka_daizantou", Tabs.super_sword,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item water_arrow = new Item_gun("water_arrow", Tabs.bow,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item heaven_fan = new ItemBaseSword("heaven_fan", Tabs.sword,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item wood_spear = new ItemBaseSword("wood_spear", Tabs.rod,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item land_slicer = new ItemBaseSword("land_slicer", Tabs.throwable,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item sakanamaru = new ItemBaseSword("sakanamaru", Tabs.sword,RiderItems.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item super_shinkenmaru = new ItemBaseSword("super_shinkenmaru", Tabs.super_sword,RiderItems.common_disk).setMaxStackSize(1).setContainerItem(shinkenmaru).setCreativeTab(Tabs.tabShinkenger);
	public static Item kyoryumaru = new ItemBaseSword("kyoryumaru", Tabs.super_sword,RiderItems.common_disk).setMaxStackSize(1).setContainerItem(shinkenmaru).setCreativeTab(Tabs.tabShinkenger);
	public static Item kyoryumaru_sakanamaru = new ItemBaseSword("kyoryumaru_sakanamaru", Tabs.super_sword,RiderItems.common_disk).setMaxStackSize(1).setContainerItem(sakanamaru);
	
	//34 Tensou Sentai Goseiger
	public static Item goseiger_logo = new Item_ore("goseiger_logo").setCreativeTab(Tabs.tabMisc);
	
	//35 Kaizoku Sentai Gokaiger
	public static Item gokaiger_logo = new Item_ore("gokaiger_logo").setCreativeTab(Tabs.tabMisc);
	
	//36 Tokumei Sentai Go-Busters
	public static Item go_busters_logo = new Item_ore("go_busters_logo").setCreativeTab(Tabs.tabGoBusters);
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
	
	public static Item morphin_blaster = new item_gun_changer("morphin_blaster",Tabs.gun,RiderItems.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item ichigan_buster = new Item_gun("ichigan_buster",Tabs.gun,RiderItems.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item sougan_blade = new ItemBaseSword("sougan_blade",Tabs.sword,RiderItems.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item ichigan_buster_special = new Item_gun("ichigan_buster_special",Tabs.super_gun,RiderItems.enetron).setMaxStackSize(1).setContainerItem(RiderItems.ichigan_buster).setCreativeTab(Tabs.tabGoBusters);
	public static Item dri_blade = new ItemBaseSword("dri_blade",Tabs.sword,RiderItems.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item lio_attache = new Item_gun("lio_attache",Tabs.hyper_gun,RiderItems.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
	//36-37 Hikounin Sentai Akibaranger
	public static Item akibaranger_head = new item_akibaranger_armor("akibaranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item akibaranger_torso = new item_akibaranger_armor2("akibaranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item akibaranger_legs = new item_akibaranger_armor2("akibaranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);

	public static Item red_moe_moe_z_cune = new item_moe_moe_z_cune("red_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_red").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item blue_moe_moe_z_cune = new item_moe_moe_z_cune("blue_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item blue_s2_moe_moe_z_cune = new item_moe_moe_z_cune("blue_s2_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_blue_s2").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item yellow_moe_moe_z_cune = new item_moe_moe_z_cune("yellow_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item yellow_s2_moe_moe_z_cune = new item_moe_moe_z_cune("yellow_s2_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_yellow_s2").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	
	public static Item moe_moe_z_cune = new Item_gun("moe_moe_z_cune", Tabs.gun,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item munyu_munyu_zubaan = new item_munyu_munyu_zubaan("munyu_munyu_zubaan", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item munyu_moe_zubakyun = new Item_gun("munyu_moe_zubakyun", Tabs.super_gun,RiderItems.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	
	//37 Zyuden Sentai Kyoryuger
	public static Item kyoryuger_logo = new Item_ore("kyoryuger_logo").setCreativeTab(Tabs.tabMisc);
	
	//38 Ressha Sentai ToQger
	public static Item toqger_logo = new Item_ore("toqger_logo").setCreativeTab(Tabs.tabToQger);
	public static Item blank_ressha = new item_toq_ressha(8, 0, "blank_ressha").setCreativeTab(Tabs.tabToQger);
	public static Block toqger_ore = new ore_block("toqger_ore", Material.ROCK, blank_ressha, 2).setHardness(9.9F).setCreativeTab(Tabs.tabToQger);
	
	public static Item toqger_head = new item_toqger_armor("toqger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item toqger_torso = new item_toqger_armor2("toqger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item toqger_legs = new item_toqger_armor2("toqger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);

	public static Item ichigou_toq_changer = new item_toq_changer("ichigou_toq_changer", ArmorMaterial.DIAMOND, 4,"toq_1gou", 0).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item nigou_toq_changer = new item_toq_changer("nigou_toq_changer", ArmorMaterial.DIAMOND, 4,"toq_2gou", 0).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item sangou_toq_changer = new item_toq_changer("sangou_toq_changer", ArmorMaterial.DIAMOND, 4,"toq_3gou", 1).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item yongou_toq_changer = new item_toq_changer("yongou_toq_changer", ArmorMaterial.DIAMOND, 4,"toq_4gou", 0).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item gogou_toq_changer = new item_toq_changer("gogou_toq_changer", ArmorMaterial.DIAMOND, 4,"toq_5gou", 1).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item rokugou_appli_changer = new item_toq_changer("rokugou_appli_changer", ArmorMaterial.DIAMOND, 4,"toq_6gou").setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item nanagou_appli_changer = new item_toq_changer("nanagou_appli_changer", ArmorMaterial.DIAMOND, 4,"toq_7gou").setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item zerogou_toq_changer = new item_toq_changer("zerogou_toq_changer", ArmorMaterial.DIAMOND, 4,"yami_0gou").setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	
	public static Item toq_buckle = new Item_ore("toq_buckle");

	public static Item red_ressha = new item_toq_ressha(1, 0, "red_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item blue_ressha = new item_toq_ressha(2, 0, "blue_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item yellow_ressha = new item_toq_ressha(3, 0, "yellow_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item green_ressha = new item_toq_ressha(4, 0, "green_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item pink_ressha = new item_toq_ressha(5, 0, "pink_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item build_ressha = new item_toq_ressha(6, 0, "build_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item violet_ressha = new item_toq_ressha(7, 0, "violet_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item hyper_ressha = new item_toq_ressha(0, 1, "hyper_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item red_ressha_corrupted = new item_toq_ressha(10, 0, "red_ressha_corrupted").setCreativeTab(Tabs.tabToQger);
	public static Item scope_ressha = new Item_ore("scope_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item lion_ressha = new item_toq_ressha(9, 0, "lion_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item eagle_ressha = new item_toq_ressha(9, 0, "eagle_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item wildcat_ressha = new item_toq_ressha(9, 0, "wildcat_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item alligator_ressha = new item_toq_ressha(9, 0, "alligator_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item panda_ressha = new item_toq_ressha(9, 0, "panda_ressha").setCreativeTab(Tabs.tabToQger);
	public static Item zero_ressha = new Item_ore("zero_ressha").setCreativeTab(Tabs.tabToQger);
	
	public static Item den_o_ressha = new Item_ore("den_o_ressha").setCreativeTab(Tabs.tabToQger);
	
	public static Item toq_blaster = new Item_sword_gun("toq_blaster", Tabs.sword_gun,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item rail_slasher = new ItemBaseSword("rail_slasher", Tabs.sword,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item home_trigger = new Item_gun("home_trigger", Tabs.gun,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item shingou_hammer = new ItemBaseSword("shingou_hammer", Tabs.hammer,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item tunnel_axe = new ItemBaseSword("tunnel_axe", Tabs.axe,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item tekkyou_claw = new ItemBaseSword("tekkyou_claw", Tabs.sword,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item yudo_breaker = new ItemBaseSword("yudo_breaker", Tabs.sword,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item daikaiten_cannon = new Item_gun("daikaiten_cannon", Tabs.super_gun,RiderItems.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	
	//39 Shuriken Sentai Ninninger
	public static Item ninninger_logo = new Item_ore("ninninger_logo").setCreativeTab(Tabs.tabMisc);
	
	//40 Doubutsu Sentai Zyuohger
	public static Item zyuohger_logo = new Item_ore("zyuohger_logo").setCreativeTab(Tabs.tabZyuohger);
	public static Item king_s_credential = new Item_ore("king_s_credential").setCreativeTab(Tabs.tabZyuohger);
	public static Block zyuohger_ore = new ore_block("zyuohger_ore", Material.ROCK, king_s_credential, 2).setHardness(9.9F).setCreativeTab(Tabs.tabZyuohger);
	
	public static Item zyuohger_head = new item_zyuohger_armor("zyuohger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuohger_torso = new item_zyuohger_armor2("zyuohger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuohger_legs = new item_zyuohger_armor2("zyuohger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);

	public static Item eagle_zyuoh_changer = new item_zyuoh_changer("eagle_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_eagle").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item shark_zyuoh_changer = new item_zyuoh_changer("shark_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_shark").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item lion_zyuoh_changer = new item_zyuoh_changer("lion_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_lion").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item elephant_zyuoh_changer = new item_zyuoh_changer("elephant_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_elephant").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item tiger_zyuoh_changer = new item_zyuoh_changer("tiger_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_tiger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_the_light = new item_zyuoh_changer("zyuoh_the_light", ArmorMaterial.DIAMOND, 4, "zyuoh_the_world").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_changer_final = new item_zyuoh_changer("zyuoh_changer_final", ArmorMaterial.DIAMOND, 4, "zyuoh_bird").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	
	public static Item zyuohger_belt = new Item_ore("zyuohger_belt");
	public static Item zyuoh_the_world_belt = new Item_ore("zyuoh_the_world_belt");
	public static Item zyuoh_eagle_wing = new Item_ore("zyuoh_eagle_wing");
	public static Item zyuoh_bird_wing = new Item_ore("zyuoh_bird_wing");
	public static Item zyuoh_condor_wing = new Item_ore("zyuoh_condor_wing");

	public static Item condor_cube = new item_zyuoh_cube(1, "condor_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item eagle_cube = new item_zyuoh_cube(0, "eagle_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item shark_cube = new item_zyuoh_cube(0, "shark_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item lion_cube = new item_zyuoh_cube(0, "lion_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item elephant_cube = new item_zyuoh_cube(0, "elephant_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item tiger_cube = new item_zyuoh_cube(0, "tiger_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item gorilla_cube = new item_zyuoh_cube(1, "gorilla_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item crocodile_cube = new item_zyuoh_cube(1, "crocodile_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item wolf_cube = new item_zyuoh_cube(2, "wolf_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item rhinos_cube = new item_zyuoh_cube(0, "rhinos_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item whale_cube = new item_zyuoh_cube(0, "whale_cube").setCreativeTab(Tabs.tabZyuohger);
	public static Item bud_king_s_credential = new item_zyuoh_cube(0, "bud_king_s_credential").setCreativeTab(Tabs.tabZyuohger);
	
	public static Item whale_change_gun = new item_whale_change_gun("whale_change_gun", Tabs.super_gun).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item eag_riser = new ItemBaseSword("eag_riser", Tabs.sword,RiderItems.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item condor_eag_riser = new ItemBaseSword("condor_eag_riser", Tabs.sword,RiderItems.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_buster = new Item_sword_gun("zyuoh_buster", Tabs.sword_gun,RiderItems.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_the_rod = new Item_sword_gun("zyuoh_the_rod", Tabs.sword_gun,RiderItems.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	
	//41 Uchu Sentai Kyuranger
	public static Item kyuranger_logo = new Item_ore("kyuranger_logo").setCreativeTab(Tabs.tabKyuranger);
	public static Item blank_kyutama = new Item_ore("blank_kyutama").setCreativeTab(Tabs.tabKyuranger);
	public static Block kyuranger_ore = new ore_block("kyuranger_ore", Material.ROCK, blank_kyutama, 2).setHardness(9.9F).setCreativeTab(Tabs.tabKyuranger);
	public static Block kyuranger_nether_ore = new ore_block("kyuranger_nether_ore", Material.ROCK, blank_kyutama, 3).setHardness(9.9F).setCreativeTab(Tabs.tabKyuranger);
	
	public static Item kyuranger_head = new item_kyuranger_armor("kyuranger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyuranger_torso = new item_kyuranger_armor2("kyuranger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyuranger_legs = new item_kyuranger_armor2("kyuranger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);

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
	
	public static Item seiza_blaster = new Item_gun("seiza_blaster", Tabs.gun,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item ryutsueder = new Item_sword_gun("ryutsueder", Tabs.sword_gun,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_blade = new ItemBaseSword("houou_blade", Tabs.sword,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item houou_shield = new ItemBaseShield("houou_shield",RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_seiza_blaster = new Item_gun("dark_seiza_blaster", Tabs.gun,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	
	public static Item kyu_sword = new ItemBaseSword("kyu_sword", Tabs.sword,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_spear = new ItemBaseSword("kyu_spear", Tabs.rod,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_claw = new ItemBaseSword("kyu_claw", Tabs.tonfa,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_crossbow = new Item_gun("kyu_crossbow", Tabs.gun,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_axe = new ItemBaseSword("kyu_axe", Tabs.axe,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_sickle = new ItemBaseSword("kyu_sickle", Tabs.rod,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_rapier = new ItemBaseSword("kyu_rapier", Tabs.sword,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_shot = new Item_gun("kyu_shot", Tabs.gun,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item kyu_slasher = new ItemBaseSword("kyu_slasher", Tabs.sword,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	public static Item dark_kyu_sickle = new ItemBaseSword("dark_kyu_sickle", Tabs.rod,RiderItems.blank_kyutama).setMaxStackSize(1).setCreativeTab(Tabs.tabKyuranger);
	
	//42 Kaitou Sentai Lupinranger VS Keisatsu Sentai Patranger
	public static Item lupinranger_logo = new Item_ore("lupinranger_logo").setCreativeTab(Tabs.tabLupat);
	public static Item patranger_logo = new Item_ore("patranger_logo").setCreativeTab(Tabs.tabLupat);
	
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
	
	public static Item vs_changer = new Item_gun("vs_changer", Tabs.gun,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item x_changer = new item_gun_changer("x_changer", Tabs.gun,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item lupin_sword = new item_dual_sword("lupin_sword", Tabs.sword,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item lupin_magnum = new Item_gun("lupin_magnum", Tabs.super_gun,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item pat_megabo = new ItemBaseSword("pat_megabo", Tabs.sword,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item x_rod_sword = new item_dual_sword("x_rod_sword", Tabs.sword,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	public static Item scissor_shield = new ItemBaseShield("scissor_shield",RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	public static Item blade_boomerang = new ItemBaseSword("blade_boomerang", Tabs.super_sword,RiderItems.blank_striker).setMaxStackSize(1).setCreativeTab(Tabs.tabLupat);
	
	//43 Kishiryu Sentai Ryusoulger
	public static Item ryusoulger_logo = new Item_ore("ryusoulger_logo").setCreativeTab(Tabs.tabRyusoulger);
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
	public static Item shiawase_soul = new Item_ore("shiawase_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item yamamori_soul = new Item_ore("yamamori_soul").setCreativeTab(Tabs.tabRyusoulger);
	public static Item unfinished_ryusoul_calibur = new Item_ore("unfinished_ryusoul_calibur").setCreativeTab(Tabs.tabRyusoulger);
	
	public static Item ryusoul_ken = new ItemBaseSword("ryusoul_ken", Tabs.sword,RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item mosa_changer = new Item_gun("mosa_changer", Tabs.gun,RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item mosa_blade = new ItemBaseSword("mosa_blade", Tabs.sword,RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item mosa_breaker = new Item_gun("mosa_breaker", Tabs.super_gun,RiderItems.blank_ryusoul).setMaxStackSize(1).setContainerItem(RiderItems.mosa_changer).setCreativeTab(Tabs.tabRyusoulger);
	public static Item gaisoul_ken = new ItemBaseSword("gaisoul_ken", Tabs.sword,RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item gaisoul_shield = new ItemBaseShield("gaisoul_shield",RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item brown_ryusoul_ken = new ItemBaseSword("brown_ryusoul_ken", Tabs.sword,RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item brown_ryusoul_shield = new ItemBaseShield("brown_ryusoul_shield",RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item max_ryusoul_changer = new ItemBaseSword("max_ryusoul_changer", Tabs.sword,RiderItems.blank_ryusoul).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	public static Item ryusoul_calibur = new item_ryusoul_calibur("ryusoul_calibur", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabRyusoulger);
	
	//44 Mashin Sentai Kirameiger
	public static Item kirameiger_logo = new Item_ore("kirameiger_logo").setCreativeTab(Tabs.tabKirameiger);
	public static Item blue_diamond = new Item_ore("blue_diamond").setCreativeTab(Tabs.tabKirameiger);
	public static Block kirameiger_ore = new ore_block("kirameiger_ore", Material.ROCK, blue_diamond, 2).setHardness(9.9F).setCreativeTab(Tabs.tabKirameiger);
		
	public static Item kirameiger_head = new item_kirameiger_armor("kirameiger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item kirameiger_torso = new item_kirameiger_armor2("kirameiger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	public static Item kirameiger_legs = new item_kirameiger_armor2("kirameiger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabKirameiger);
	
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
	
	public static Item kiraful_go_arrow = new item_kiraful_go_arrow("kiraful_go_arrow", Tabs.super_gun).setCreativeTab(Tabs.tabKirameiger);
	public static Item kiramei_sword = new ItemBaseSword("kiramei_sword", Tabs.sword,RiderItems.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	public static Item kiramei_shot = new Item_gun("kiramei_shot", Tabs.gun,RiderItems.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	public static Item kiramei_buster = new Item_gun("kiramei_buster", Tabs.super_gun,RiderItems.blue_diamond).setContainerItem(RiderItems.kiramei_shot).setCreativeTab(Tabs.tabKirameiger);
	public static Item shiny_breaker = new Item_sword_gun("shiny_breaker", Tabs.sword_gun,RiderItems.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	public static Item shiny_breaker_tool = new item_shiny_breaker("shiny_breaker_tool", Tabs.sword_gun).setCreativeTab(Tabs.tabKirameiger);
	public static Item yellow_stone_hammer = new ItemBaseSword("yellow_stone_hammer", Tabs.hammer,RiderItems.blue_diamond).setCreativeTab(Tabs.tabKirameiger);
	
	//45 Kikai Sentai Zenkaiger
	public static Item zenkaiger_logo = new Item_ore("zenkaiger_logo").setCreativeTab(Tabs.tabZenkaiger);
	public static Item blank_sentai_gear = new Item_ore("blank_sentai_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item blank_dark_sentai_gear = new Item_ore("blank_dark_sentai_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Block zenkaiger_ore = new ore_block("zenkaiger_ore", Material.ROCK, blank_sentai_gear, 2).setHardness(9.9F).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zenkaiger_head = new item_zenkaiger_armor("zenkaiger_head", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkaiger_torso = new item_zenkaiger_armor2("zenkaiger_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkaiger_legs = new item_zenkaiger_armor2("zenkaiger_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zenkaizer_geartlinger = new item_geartlinger("zenkaizer_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkaizer").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item juran_geartlinger = new item_geartlinger("juran_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_juran").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item gaon_geartlinger = new item_geartlinger("gaon_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_gaon").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item magine_geartlinger = new item_geartlinger("magine_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_magine").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item vroon_geartlinger = new item_geartlinger("vroon_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_vroon").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokaizer_geardalinger = new item_geartlinger("twokaizer_geardalinger", ArmorMaterial.DIAMOND, 4, "twokaizer", "base").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item stacaeser_geartozinger = new item_geartlinger("stacaeser_geartozinger", ArmorMaterial.DIAMOND, 4, "stacaesar").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item red_geartlinger = new item_geartlinger("red_geartlinger", ArmorMaterial.DIAMOND, 4, "zenkai_red").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item mecha_dark_gear = new item_geartlinger("mecha_dark_gear", ArmorMaterial.DIAMOND, 4, "mecha").setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zenkaizer_belt = new Item_ore("zenkaizer_belt");
	public static Item twokaizer_belt = new Item_ore("twokaizer_belt");
	public static Item stacaesar_belt = new Item_ore("stacaesar_belt");
	public static Item zenkai_zyuoh_wings = new Item_ore("zenkai_zyuoh_wings");
	
	public static Item zenkaizer_gear = new item_zenkai_gear(0, "zenkaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_juran_gear = new item_zenkai_gear(0, "zenkai_juran_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_gaon_gear = new item_zenkai_gear(0, "zenkai_gaon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_magine_gear = new item_zenkai_gear(0, "zenkai_magine_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_vroon_gear = new item_zenkai_gear(0, "zenkai_vroon_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokaizer_gear = new item_zenkai_gear(1, "twokaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item stacaesar_gear = new item_zenkai_gear(0, "stacaesar_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_red_gear = new item_zenkai_gear(0, "zenkai_red_gear").setCreativeTab(Tabs.tabZenkaiger);

	public static Item twokai_cutanner_gear = new item_zenkai_gear(2, "twokai_cutanner_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item twokai_ricky_gear = new item_zenkai_gear(3, "twokai_ricky_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkai_zyu_gear = new item_zenkai_gear(1, "zenkai_zyu_gear").setCreativeTab(Tabs.tabZenkaiger);
	
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
	public static Item metallic_twokaizer_gear = new Item_ore("metallic_twokaizer_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item super_sentai_gear = new Item_ore("super_sentai_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zenkaiger_asobou_gear = new Item_ore("zenkaiger_asobou_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item super_hero_time_gear = new Item_ore("super_hero_time_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item zi_o_gear = new item_sentai_gear(0, "zi_o_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item zero_one_gear = new item_sentai_gear(0, "zero_one_gear").setCreativeTab(Tabs.tabZenkaiger);
	public static Item saber_gear = new item_sentai_gear(0, "saber_gear").setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item geartlinger = new Item_gun("geartlinger", Tabs.gun,RiderItems.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item geardalinger = new Item_sword_gun("geardalinger", Tabs.sword_gun,RiderItems.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	public static Item geartozinger = new Item_gun("geartozinger", Tabs.gun,RiderItems.blank_sentai_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item juran_sword = new ItemBaseSword("juran_sword",Tabs.sword,RiderItems.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item juran_shield = new ItemBaseShield("juran_shield",RiderItems.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item gaon_claw = new ItemBaseSword("gaon_claw",Tabs.sword,RiderItems.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item magine_stick = new ItemBaseSword("magine_stick",Tabs.rod,RiderItems.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	public static Item vroon_picker = new ItemBaseSword("vroon_picker",Tabs.axe,RiderItems.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item tail_drill = new ItemBaseSword("tail_drill",Tabs.super_sword,RiderItems.blank_sentai_gear).setCreativeTab(Tabs.tabZenkaiger);
	
	public static Item white_ribbon = new ItemBaseSword("white_ribbon",Tabs.whip,RiderItems.goggle_v_logo).setCreativeTab(Tabs.tabZenkaiger);

	public static void init() 
	{
		
	}
	
	//public static void init(){}
}