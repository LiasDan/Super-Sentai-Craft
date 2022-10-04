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
import SS_Craft.item.dekaranger.item_dekaranger_armor;
import SS_Craft.item.dekaranger.item_dekaranger_armor2;
import SS_Craft.item.dekaranger.item_sp_badge;
import SS_Craft.item.dekaranger.item_sp_license;
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
import SS_Craft.item.sentai_armor_base.item_form_changer;
import SS_Craft.item.sentai_armor_base.item_sentai_armor;
import SS_Craft.item.sentai_armor_base.item_sentai_changer;
import SS_Craft.item.shinkenger.item_secret_disk;
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

public class SentaiItems20 
{
	public static Item blanknoitem = new Item_ore("blanknoitem");
	public static Item blanknoform= new item_form_changer("blanknoform", item_sentai_changer.class, blanknoitem, "", "");
	public static Item super_sentai_logo = new item_super_sentai_logo("super_sentai_logo").setCreativeTab(Tabs.tabMisc);

	//00 Mobs Weapon
	public static Item zolders_sword = new ItemBaseSword("zolders_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item ungler_lance = new ItemBaseSword("ungler_lance", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item yartots_saber = new ItemBaseSword("yartots_saber", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item nanashi_dao = new ItemBaseSword("nanashi_dao", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item drunn_spear = new ItemBaseSword("drunn_spear", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item drunn_shield = new ItemBaseShield("drunn_shield",SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item crimers_sword = new ItemBaseSword("crimers_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item machinemen_knife = new ItemBaseSword("machinemen_knife", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item wumpers_sword = new ItemBaseSword("wumpers_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item orgettes_club = new ItemBaseSword("orgettes_club", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item porderman_sword = new ItemBaseSword("porderman_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item cutmen_sword = new ItemBaseSword("cutmen_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item jakotsuken = new ItemBaseSword("jakotsuken", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item bone_axe = new ItemBaseSword("bone_axe", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item imps_sword = new ItemBaseSword("imps_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karths_sickle = new ItemBaseSword("karths_sickle", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item buglars_katar = new ItemBaseSword("buglars_katar", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item dustlers_sickle = new ItemBaseSword("dustlers_sickle", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item kunekunes_sword = new ItemBaseSword("kunekunes_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item ugatz_sword = new ItemBaseSword("ugatz_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item moebas_sword = new ItemBaseSword("moebas_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item grinam_axe = new ItemBaseSword("grinam_axe", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item rinshi_lance = new ItemBaseSword("rinshi_lance", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item kuros_axe = new ItemBaseSword("kuros_axe", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item spotmen_spear = new ItemBaseSword("spotmen_spear", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item cotpotros_staff = new ItemBaseSword("cotpotros_staff", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item barmias_staff = new ItemBaseSword("barmias_staff", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gyoi_saber = new ItemBaseSword("gyoi_saber", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item numade = new ItemBaseSword("numade", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item mechaclones_sword = new ItemBaseSword("mechaclones_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item dorodoros_sword = new ItemBaseSword("dorodoros_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item ana_knife = new ItemBaseSword("ana_knife", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item batsu_sword = new ItemBaseSword("batsu_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item iga_sword = new ItemBaseSword("iga_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item zorin_gun = new ItemBaseSword("zorin_gun", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item plug_lancer = new ItemBaseSword("plug_lancer", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	//Misc Items
	public static Item mecha_gear = new Item_ore("mecha_gear").setCreativeTab(Tabs.tabMisc);
	public static Block mecha_ore = new ore_block("mecha_ore", Material.ROCK, mecha_gear, 3).setHardness(9.9F).setCreativeTab(Tabs.tabMisc);
	public static Block mecha_topia_ore = new ore_block("mecha_topia_ore", Material.ROCK, mecha_gear, 3).setHardness(9.9F).setCreativeTab(Tabs.tabMisc);
	
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
	public static Item dyna_red_key = new item_ranger_key(7, "dyna_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item change_dragon_key = new item_ranger_key(9, "change_dragon_key").setCreativeTab(Tabs.tabMisc);
	public static Item red_mask_key = new item_ranger_key(11, "red_mask_key").setCreativeTab(Tabs.tabMisc);
	public static Item red_falcon_key = new item_ranger_key(12, "red_falcon_key").setCreativeTab(Tabs.tabMisc);
	public static Item five_red_key = new item_ranger_key(14, "five_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item oh_red_key = new item_ranger_key(19, "oh_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item red_racer_key = new item_ranger_key(20, "red_racer_key").setCreativeTab(Tabs.tabMisc);
	public static Item ginga_red_key = new item_ranger_key(22, "ginga_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item time_red_key = new item_ranger_key(24, "time_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item gao_red_key = new item_ranger_key(25, "gao_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item hurricane_red_key = new item_ranger_key(26, "hurricane_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item magi_red_key = new item_ranger_key(29, "magi_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item shinken_red_key = new item_ranger_key(33, "shinken_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item gosei_red_key = new item_ranger_key(34, "gosei_red_key").setCreativeTab(Tabs.tabMisc);
	public static Item aka_ninger_key = new item_ranger_key(38, "aka_ninger_key").setCreativeTab(Tabs.tabMisc);
	public static Item gold_anchor_key = new item_ranger_key("gold_anchor_key", 1).setCreativeTab(Tabs.tabMisc);
	
	public static Item aka_ninger_shuriken = new item_nin_shuriken(0, "aka_ninger_shuriken").setCreativeTab(Tabs.tabMisc);
	public static Item chouzetsu_shoubu_changer = new item_nin_shuriken(1, "chouzetsu_shoubu_changer").setCreativeTab(Tabs.tabMisc);
	
	public static Item gokai_saber = new ItemBaseSword("gokai_saber", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gokai_gun = new Item_gun("gokai_gun", Tabs.gun,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gokai_spear_anchor = new ItemBaseSword("gokai_spear_anchor", Tabs.super_sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	public static Item ninja_ichibantou = new ItemBaseSword("ninja_ichibantou", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen = new ItemBaseSword("karakuri_hengen", Tabs.throwable,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen_sword = new ItemBaseSword("karakuri_hengen_sword", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen_bow = new Item_gun("karakuri_hengen_bow", Tabs.bow,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item karakuri_hengen_claw = new ItemBaseSword("karakuri_hengen_claw", Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item gama_gama_gun = new Item_gun("gama_gama_gun", Tabs.gun,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
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
	
	public static Item goranger_head = new item_sentai_armor("goranger_head", item_goranger_belt.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item goranger_torso = new item_sentai_armor("goranger_torso", item_goranger_belt.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item goranger_legs = new item_sentai_armor("goranger_legs", item_goranger_belt.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	
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
	
	public static Item red_bute = new ItemBaseSword("red_bute", Tabs.rod,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item silver_shot = new Item_gun("silver_shot", Tabs.gun,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item blue_cherry = new Item_gun("blue_cherry", Tabs.bow,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item ultra_blue_cherry = new Item_gun("ultra_blue_cherry", Tabs.stronger_bow,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item ki_sticker = new ItemBaseSword("ki_sticker", Tabs.rod,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item earring_bomb = new ItemBaseSword("earring_bomb", Tabs.bomb,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	public static Item midomerang = new ItemBaseSword("midomerang", Tabs.boomerang,SentaiItems20.goranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoranger);
	
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
	
	public static Item spade_arts = new Item_gun("spade_arts", Tabs.bow,SentaiItems20.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item dia_sword = new ItemBaseSword("dia_sword", Tabs.sword,SentaiItems20.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item heart_cute = new ItemBaseSword("heart_cute", Tabs.throwable,SentaiItems20.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item club_megaton = new ItemBaseSword("club_megaton", Tabs.megaton,SentaiItems20.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	public static Item big_baton = new ItemBaseSword("big_baton", Tabs.rod,SentaiItems20.blank_card).setMaxStackSize(1).setCreativeTab(Tabs.tabJakq);
	
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
	
	public static Item japan_spear = new ItemBaseSword("japan_spear", Tabs.rod,SentaiItems20.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item cossack_sai = new ItemBaseSword("cossack_sai", Tabs.throwable,SentaiItems20.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item france_fencing_sword = new ItemBaseSword("france_fencing_sword", Tabs.sword,SentaiItems20.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item kenya_whip = new ItemBaseSword("kenya_whip", Tabs.whip,SentaiItems20.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item america_throwing_knife = new ItemBaseSword("america_throwing_knife", Tabs.throwable,SentaiItems20.battle_fever_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item battle_fever_robo_head = new item_battle_fever_mecha("battle_fever_robo_head", ArmorMaterial.DIAMOND, 4, "battle_fever_robo").setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item battle_fever_robo_torso = new item_battle_fever_mecha_armor2("battle_fever_robo_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_fever_robo_legs = new item_battle_fever_mecha_armor2("battle_fever_robo_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_fever_robo_boots = new item_battle_fever_mecha_armor("battle_fever_robo_boots", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
	public static Item denkouken = new ItemBaseSword("denkouken",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item sword_fever = new ItemBaseSword("sword_fever",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item fever_axe = new ItemBaseSword("fever_axe",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item stick_attacker = new ItemBaseSword("stick_attacker",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item attack_lancer = new ItemBaseSword("attack_lancer",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item cane_knocker = new ItemBaseSword("cane_knocker",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	public static Item battle_shield = new ItemBaseShield("battle_shield",SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabBattleFever);
	
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
	
	public static Item red_denzi_stick = new ItemBaseSword("red_denzi_stick", Tabs.sword,SentaiItems20.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item blue_denzi_stick = new ItemBaseSword("blue_denzi_stick", Tabs.sword,SentaiItems20.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item yellow_denzi_stick = new ItemBaseSword("yellow_denzi_stick", Tabs.sword,SentaiItems20.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item green_denzi_stick = new ItemBaseSword("green_denzi_stick", Tabs.sword,SentaiItems20.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item pink_denzi_stick = new ItemBaseSword("pink_denzi_stick", Tabs.sword,SentaiItems20.empty_denzi_ring).setCreativeTab(Tabs.tabDenziman);
	public static Item denzi_punch = new item_denzi_punch(1, "denzi_punch").setCreativeTab(Tabs.tabDenziman);
	
	public static Item dai_denzin_head = new item_denziman_mecha("dai_denzin_head", ArmorMaterial.DIAMOND, 4, "dai_denzin").setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	public static Item dai_denzin_torso = new item_denziman_mecha_armor2("dai_denzin_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item dai_denzin_legs = new item_denziman_mecha_armor2("dai_denzin_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item dai_denzin_boots = new item_denziman_mecha_armor("dai_denzin_boots", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
	public static Item denzi_ken = new ItemBaseSword("denzi_ken",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item dai_denzin_boomerang = new ItemBaseSword("dai_denzin_boomerang",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	public static Item denzi_ball = new ItemBaseSword("denzi_ball",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabDenziman);
	
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
	
	public static Item vulcan_stick = new ItemBaseSword("vulcan_stick", Tabs.sword,SentaiItems20.sun_vulcan_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item vulcan_stick_eagle = new ItemBaseSword("vulcan_stick_eagle", Tabs.sword,SentaiItems20.sun_vulcan_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);

	public static Item sun_vulcan_robo_head = new item_sun_vulcan_mecha("sun_vulcan_robo_head", ArmorMaterial.DIAMOND, 4, "sun_vulcan_robo").setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item sun_vulcan_robo_torso = new item_sun_vulcan_mecha_armor2("sun_vulcan_robo_torso", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item sun_vulcan_robo_legs = new item_sun_vulcan_mecha_armor2("sun_vulcan_robo_legs", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item sun_vulcan_robo_boots = new item_sun_vulcan_mecha_armor("sun_vulcan_robo_boots", ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.FEET).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	public static Item taiyo_ken = new ItemBaseSword("taiyo_ken",Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	public static Item vul_shield = new ItemBaseShield("vul_shield",SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabSunVulcan);
	
	//06 Dai Sentai Goggle V
	public static Item goggle_v_logo = new Item_ore("goggle_v_logo").setCreativeTab(Tabs.tabGoggleV);
	public static Block goggle_v_ore = new ore_block("goggle_v_ore", Material.ROCK, goggle_v_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoggleV);
	
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
	
	public static Item goggle_sabre = new ItemBaseSword("goggle_sabre", Tabs.sword,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item goggle_golden_spear = new ItemBaseSword("goggle_golden_spear", Tabs.rod,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item red_hammer = new ItemBaseSword("red_hammer", Tabs.hammer,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item red_ribbon = new ItemBaseSword("red_ribbon", Tabs.whip,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_club = new ItemBaseSword("black_club", Tabs.sword,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_emerald_nunchuck = new ItemBaseSword("black_emerald_nunchuck", Tabs.tonfa,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_hammer = new ItemBaseSword("black_hammer", Tabs.hammer,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item black_ribbon = new ItemBaseSword("black_ribbon", Tabs.whip,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item blue_hammer = new ItemBaseSword("blue_hammer", Tabs.hammer,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item blue_ribbon = new ItemBaseSword("blue_ribbon", Tabs.whip,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item yellow_hammer = new ItemBaseSword("yellow_hammer", Tabs.hammer,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item yellow_ribbon = new ItemBaseSword("yellow_ribbon", Tabs.whip,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item pink_hammer = new ItemBaseSword("pink_hammer", Tabs.hammer,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	public static Item pink_ribbon = new ItemBaseSword("pink_ribbon", Tabs.whip,SentaiItems20.goggle_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGoggleV);
	
	//07 Kagaku Sentai Dynaman
	public static Item dynaman_logo = new Item_ore("dynaman_logo").setCreativeTab(Tabs.tabMisc);

	public static Item dynaman_belt = new Item_ore("dynaman_belt");
	
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
	
	public static Item bio_sword = new Item_sword_gun("bio_sword",Tabs.sword_gun,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item fire_sword = new ItemBaseSword("fire_sword", Tabs.sword,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item hurricane_sword = new ItemBaseSword("hurricane_sword", Tabs.sword,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item elec_sword = new ItemBaseSword("elec_sword", Tabs.sword,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item thunder_sword = new ItemBaseSword("thunder_sword", Tabs.sword,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item laser_sword = new ItemBaseSword("laser_sword", Tabs.sword,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	public static Item bio_arrow = new Item_gun("bio_arrow", Tabs.bow,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	
	public static Item bi_buster = new Item_gun("bi_buster",Tabs.gun,SentaiItems20.bioman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBioman);
	
	//09 Dengeki Sentai Changeman
	public static Item changeman_logo = new Item_ore("changeman_logo").setCreativeTab(Tabs.tabMisc);

	public static Item changeman_belt = new Item_ore("changeman_belt");
	
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
	
	public static Item prism_shooter = new Item_sword_gun("prism_shooter",Tabs.sword_gun,SentaiItems20.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_shooter_shield = new ItemBaseShield("prism_shooter_shield",SentaiItems20.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_holy_sword = new ItemBaseSword("prism_holy_sword", Tabs.sword,SentaiItems20.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_kaizer = new item_prism_armor(1, "prism_kaizer").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item star_darts = new ItemBaseSword("star_darts", Tabs.throwable,SentaiItems20.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_batons = new ItemBaseSword("prism_batons", Tabs.rod,SentaiItems20.flashman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	public static Item prism_boots = new item_prism_armor(1, "prism_boots").setMaxStackSize(1).setCreativeTab(Tabs.tabFlashman);
	
	//11 Hikari Sentai Maskman
	public static Item maskman_logo = new Item_ore("maskman_logo").setCreativeTab(Tabs.tabMaskman);
//	public static Block maskman_ore = new ore_block("maskman_ore", Material.ROCK, maskman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabMaskman);
	
	public static Item maskman_head = new item_sentai_armor("maskman_head", item_masking_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item maskman_torso = new item_sentai_armor("maskman_torso", item_masking_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item maskman_legs = new item_sentai_armor("maskman_legs", item_masking_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
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
	
	public static Item laser_magnum_sword = new Item_sword_gun("laser_magnum_sword", Tabs.sword_gun,SentaiItems20.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_blade = new ItemBaseSword("masky_blade", Tabs.sword,SentaiItems20.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_rod = new ItemBaseSword("masky_rod", Tabs.rod,SentaiItems20.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_tonfa = new ItemBaseSword("masky_tonfa", Tabs.tonfa,SentaiItems20.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_rotor = new ItemBaseSword("masky_rotor", Tabs.throwable,SentaiItems20.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	public static Item masky_ribbon = new ItemBaseSword("masky_ribbon", Tabs.whip,SentaiItems20.maskman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMaskman);
	
	//12 Choujuu Sentai Liveman
	public static Item liveman_logo = new Item_ore("liveman_logo").setCreativeTab(Tabs.tabMisc);

	public static Item red_falcon_belt = new Item_ore("red_falcon_belt");
	
	public static Item falcon_saber = new ItemBaseSword("falcon_saber",Tabs.gun,SentaiItems20.liveman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
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
	public static Item powerless_turbo_belt = new Item_ore("powerless_turbo_belt");
	
	public static Item red_turbo_logo = new item_fairy_power(0, "red_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item black_turbo_logo = new item_fairy_power(0, "black_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item blue_turbo_logo = new item_fairy_power(0, "blue_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item yellow_turbo_logo = new item_fairy_power(0, "yellow_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	public static Item pink_turbo_logo = new item_fairy_power(0, "pink_turbo_logo").setCreativeTab(Tabs.tabTurboranger);
	
	public static Item turbo_laser_sword = new Item_sword_gun("turbo_laser_sword", Tabs.sword_gun,SentaiItems20.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item gt_sword = new ItemBaseSword("gt_sword", Tabs.sword,SentaiItems20.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item t_hammer = new ItemBaseSword("t_hammer", Tabs.hammer,SentaiItems20.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item j_gun = new Item_gun("j_gun", Tabs.gun,SentaiItems20.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item b_bowgun = new Item_gun("b_bowgun", Tabs.bow,SentaiItems20.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item w_stick = new ItemBaseSword("w_stick", Tabs.rod,SentaiItems20.turboranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_j = new Item_gun("turbo_laser_j", Tabs.super_gun,SentaiItems20.turboranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems20.turbo_laser_sword).setCreativeTab(Tabs.tabTurboranger);
	public static Item turbo_laser_w = new Item_gun("turbo_laser_w", Tabs.super_gun,SentaiItems20.turboranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems20.turbo_laser_sword).setCreativeTab(Tabs.tabTurboranger);
	
	//14 Chikyuu Sentai Fiveman
	public static Item fiveman_logo = new Item_ore("fiveman_logo").setCreativeTab(Tabs.tabMisc);

	public static Item fiveman_belt = new Item_ore("fiveman_belt");
	
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
	
	public static Item bird_blaster = new Item_gun("bird_blaster",Tabs.gun,SentaiItems20.birdonic_wave).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item bringer_sword = new ItemBaseSword("bringer_sword",Tabs.sword,SentaiItems20.birdonic_wave).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item jet_hand_cannon = new Item_gun("jet_hand_cannon",Tabs.super_gun,SentaiItems20.birdonic_wave).setMaxStackSize(1).setContainerItem(SentaiItems20.bird_blaster).setCreativeTab(Tabs.tabJetman);
	public static Item beak_smasher = new Item_gun("beak_smasher",Tabs.super_gun,SentaiItems20.birdonic_wave).setMaxStackSize(1).setCreativeTab(Tabs.tabJetman);
	public static Item smash_bomber = new Item_gun("smash_bomber",Tabs.hyper_gun,SentaiItems20.birdonic_wave).setMaxStackSize(1).setContainerItem(SentaiItems20.beak_smasher).setCreativeTab(Tabs.tabJetman);
	
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
	public static Item dragon_dino_buckler = new item_dino_buckler("dragon_dino_buckler", ArmorMaterial.DIAMOND, 4, "dragon_ranger","zyu_full_dragon_shield").setMaxStackSize(1).setContainerItem(SentaiItems20.unarmed_dragon_dino_buckler).setCreativeTab(Tabs.tabZyuranger);
	
	public static Item tyranno_medal = new item_dino_medal(0,"tyranno_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item mammoth_medal = new item_dino_medal(0,"mammoth_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item tricera_medal = new item_dino_medal(0,"tricera_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item tiger_medal = new item_dino_medal(0,"tiger_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item ptera_medal = new item_dino_medal(0,"ptera_medal").setCreativeTab(Tabs.tabZyuranger);
	public static Item dragon_medal = new item_dino_medal(1,"dragon_medal").setCreativeTab(Tabs.tabZyuranger);
	
	public static Item ranger_sword = new Item_sword_gun("ranger_sword",Tabs.sword_gun,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item thunder_slinger = new Item_gun("thunder_slinger",Tabs.gun,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item ranger_slinger = new Item_gun("ranger_slinger",Tabs.super_gun,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setContainerItem(SentaiItems20.thunder_slinger).setCreativeTab(Tabs.tabZyuranger);
	public static Item ryugekiken = new ItemBaseSword("ryugekiken",Tabs.sword,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item moth_breaker = new Item_sword_gun("moth_breaker",Tabs.sword_gun,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item trice_lance_trident = new ItemBaseSword("trice_lance_trident",Tabs.sword,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item trice_lance = new ItemBaseSword("trice_lance",Tabs.rod,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setContainerItem(SentaiItems20.trice_lance_trident).setCreativeTab(Tabs.tabZyuranger);
	public static Item saber_dagger = new ItemBaseSword("saber_dagger",Tabs.throwable,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item ptera_arrow = new Item_gun("ptera_arrow",Tabs.bow,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item zyusouken = new ItemBaseSword("zyusouken",Tabs.sword,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	public static Item hellfriede = new ItemBaseSword("hellfriede",Tabs.super_sword,SentaiItems20.zyuranger_medal).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuranger);
	
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
	public static Item kiba_changer = new item_aura_changer("kiba_changer", ArmorMaterial.DIAMOND, 4, "kiba_ranger","base").setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	
	public static Item red_lailai_jewel = new Item_ore("red_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item green_lailai_jewel = new Item_ore("green_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item blue_lailai_jewel = new Item_ore("blue_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item yellow_lailai_jewel = new Item_ore("yellow_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item pink_lailai_jewel = new Item_ore("pink_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	public static Item white_lailai_jewel = new Item_ore("white_lailai_jewel").setCreativeTab(Tabs.tabDairanger);
	
	public static Item dairanger_belt = new Item_ore("dairanger_belt");
	
	public static Item star_cutter = new ItemBaseSword("star_cutter",Tabs.sword,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item star_sword = new ItemBaseSword("star_sword",Tabs.sword,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dai_buster = new Item_gun("dai_buster",Tabs.gun,SentaiItems20.dairanger_logo).setMaxStackSize(1).setContainerItem(SentaiItems20.star_cutter).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_ryuu = new ItemBaseSword("dairen_rod_ryuu",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_shishi = new ItemBaseSword("dairen_rod_shishi",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_tenma = new ItemBaseSword("dairen_rod_tenma",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_kirin = new ItemBaseSword("dairen_rod_kirin",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairen_rod_houou = new ItemBaseSword("dairen_rod_houou",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dragon_sword = new ItemBaseSword("dragon_sword",Tabs.sword,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item lion_cudgel = new ItemBaseSword("lion_cudgel",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item pegasus_nunchuck = new ItemBaseSword("pegasus_nunchuck",Tabs.tonfa,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item kirin_9_part_whip = new ItemBaseSword("kirin_9_part_whip",Tabs.whip,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item phoenix_spear = new ItemBaseSword("phoenix_spear",Tabs.rod,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item dairinken = new ItemBaseSword("dairinken",Tabs.sword,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	public static Item byakkoshinken = new ItemBaseSword("byakkoshinken",Tabs.sword,SentaiItems20.dairanger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabDairanger);
	
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
	
	public static Item kakuremaru = new ItemBaseSword("kakuremaru", Tabs.sword,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item kaku_laser = new Item_sword_gun("kaku_laser", Tabs.sword_gun,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_red_shuriken = new ItemBaseSword("ninja_red_shuriken", Tabs.throwable,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_white_shuriken = new ItemBaseSword("ninja_white_shuriken", Tabs.throwable,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_yellow_shuriken = new ItemBaseSword("ninja_yellow_shuriken", Tabs.throwable,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_blue_shuriken = new ItemBaseSword("ninja_blue_shuriken", Tabs.throwable,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_black_shuriken = new ItemBaseSword("ninja_black_shuriken", Tabs.throwable,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item shinobi_knuckle = new ItemBaseSword("shinobi_knuckle", Tabs.tonfa,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item red_slicer = new ItemBaseSword("red_slicer", Tabs.throwable,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item white_beak = new ItemBaseSword("white_beak", Tabs.sword,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item yellow_claw = new ItemBaseSword("yellow_claw", Tabs.sword,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item blue_shot = new Item_gun("blue_shot", Tabs.gun,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item black_bow = new Item_gun("black_bow", Tabs.bow,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item hikarimaru = new ItemBaseSword("hikarimaru", Tabs.super_sword,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item ninja_sword = new ItemBaseSword("ninja_sword", Tabs.sword,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	public static Item samurai_javelin = new ItemBaseSword("samurai_javelin", Tabs.rod,SentaiItems20.kakuranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabKakuranger);
	
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
	
	public static Item auto_blaster = new item_charge_gun("auto_blaster", Tabs.gun,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item vi_blade = new ItemBaseSword("vi_blade", Tabs.sword,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item fender_sword = new ItemBaseSword("fender_sword", Tabs.sword,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item muffler_gun = new Item_gun("muffler_gun", Tabs.gun,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item engine_cannon = new Item_gun("engine_cannon", Tabs.super_gun,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item side_knuckle = new ItemBaseSword("side_knuckle", Tabs.tonfa,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item bumper_bow = new Item_gun("bumper_bow", Tabs.bow,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item navic_shot = new Item_gun("navic_shot", Tabs.gun,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);
	public static Item navic_blaster = new Item_gun("navic_blaster", Tabs.hyper_gun,SentaiItems20.carranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems20.navic_shot).setCreativeTab(Tabs.tabCarranger);
	public static Item signaizer = new Item_sword_gun("signaizer", Tabs.sword_gun,SentaiItems20.carranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabCarranger);

	public static void init() 
	{
		
	}
	
	//public static void init(){}
}