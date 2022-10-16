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
import SS_Craft.blocks.zyudenchi_charger;
import SS_Craft.item.*;
import SS_Craft.item.abaranger.item_dino_brace;
import SS_Craft.item.abaranger.item_sty_riser;
import SS_Craft.item.abaranger.item_sty_riser_shield;
import SS_Craft.item.abaranger.mecha.item_abaranger_mecha;
import SS_Craft.item.abaranger.mecha.item_dino_guts;
import SS_Craft.item.akibaranger.item_moe_moe_z_cune;
import SS_Craft.item.akibaranger.item_munyu_munyu_zubaan;
import SS_Craft.item.battle_fever.item_battleceiver;
import SS_Craft.item.battle_fever.mecha.item_battle_fever_mecha;
import SS_Craft.item.bioman.item_techno_brace;
import SS_Craft.item.boukenger.item_accellular;
import SS_Craft.item.boukenger.item_bouken_spirit;
import SS_Craft.item.carranger.item_accel_changer;
import SS_Craft.item.dairanger.item_aura_changer;
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
import SS_Craft.item.go_onger.item_rocket_dagger;
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
import SS_Craft.item.kakuranger.item_kakure_medal;
import SS_Craft.item.kawarimono.item_kawarimono_armor;
import SS_Craft.item.kawarimono.item_kawarimono_armor2;
import SS_Craft.item.kirameiger.item_kanaema_stone;
import SS_Craft.item.kirameiger.item_kiraful_go_arrow;
import SS_Craft.item.kirameiger.item_kiramei_changer;
import SS_Craft.item.kirameiger.item_kiramei_stone;
import SS_Craft.item.kirameiger.item_shiny_breaker;
import SS_Craft.item.kyoryuger.item_gaburivolver;
import SS_Craft.item.kyoryuger.item_guardian_zyudenchi;
import SS_Craft.item.kyoryuger.item_zyudenchi;
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
import SS_Craft.item.sentai_armor_base.item_mecha_armor;
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
import SS_Craft.item.zyuohger.item_whale_change_gun;
import SS_Craft.item.zyuohger.item_zyuoh_changer;
import SS_Craft.item.zyuohger.item_zyuoh_cube;
import SS_Craft.item.zyuranger.item_dino_buckler;
import SS_Craft.item.zyuranger.item_dino_medal;
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

public class SentaiItems40 
{
	//21 Denji Sentai Megaranger
	public static Item megaranger_logo = new Item_ore("megaranger_logo").setCreativeTab(Tabs.tabMegaranger);
	public static Block megaranger_ore = new ore_block("megaranger_ore", Material.ROCK, megaranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabMegaranger);
	
	public static Item megaranger_head = new item_sentai_armor("megaranger_head", item_digitaizer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item megaranger_torso = new item_sentai_armor("megaranger_torso", item_digitaizer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item megaranger_legs = new item_sentai_armor("megaranger_legs", item_digitaizer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	
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
	
	public static Item mega_magnum = new Item_gun("mega_magnum", Tabs.gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_shot = new Item_gun("mega_shot", Tabs.gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_sniper = new Item_gun("mega_sniper", Tabs.gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.mega_magnum).setCreativeTab(Tabs.tabMegaranger);
	public static Item drill_saber = new ItemBaseSword("drill_saber", Tabs.sword,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_rod = new ItemBaseSword("mega_rod", Tabs.rod,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_tomahawk = new ItemBaseSword("mega_tomahawk", Tabs.axe,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_sling = new Item_gun("mega_sling", Tabs.gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item mega_capture = new Item_gun("mega_capture", Tabs.gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item silver_blazer = new Item_sword_gun("silver_blazer", Tabs.sword_gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMegaranger);
	public static Item drill_sniper = new Item_gun("drill_sniper", Tabs.super_gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.drill_saber).setCreativeTab(Tabs.tabMegaranger);
	public static Item rod_sniper = new Item_gun("rod_sniper", Tabs.super_gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.mega_rod).setCreativeTab(Tabs.tabMegaranger);
	public static Item tomahawk_sniper = new Item_gun("tomahawk_sniper", Tabs.super_gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.mega_tomahawk).setCreativeTab(Tabs.tabMegaranger);
	public static Item sling_sniper = new Item_gun("sling_sniper", Tabs.super_gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.mega_sling).setCreativeTab(Tabs.tabMegaranger);
	public static Item capture_sniper = new Item_gun("capture_sniper", Tabs.super_gun,SentaiItems40.megaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.mega_capture).setCreativeTab(Tabs.tabMegaranger);
	
	//22 Seijuu Sentai Gingaman
	public static Item gingaman_logo = new Item_ore("gingaman_logo").setCreativeTab(Tabs.tabGingaman);
	public static Block gingaman_ore = new ore_block("gingaman_ore", Material.ROCK, gingaman_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGingaman);
	
	public static Item gingaman_head = new item_sentai_armor("gingaman_head", item_ginga_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item gingaman_torso = new item_sentai_armor("gingaman_torso", item_ginga_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item gingaman_legs = new item_sentai_armor("gingaman_legs", item_ginga_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
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
	
	public static Item starbeast_sword = new ItemBaseSword("starbeast_sword", Tabs.sword,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_cutter = new ItemBaseSword("kiba_cutter", Tabs.sword,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_shot = new Item_gun("kiba_shot", Tabs.gun,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_claw = new ItemBaseSword("kiba_claw", Tabs.sword,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_knife = new ItemBaseSword("kiba_knife", Tabs.sword,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item kiba_arrow = new Item_gun("kiba_arrow", Tabs.bow,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_red = new Item_gun("beast_attack_rod_red", Tabs.bazooka,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_green = new Item_gun("beast_attack_rod_green", Tabs.bazooka,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_blue = new Item_gun("beast_attack_rod_blue", Tabs.bazooka,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_yellow = new Item_gun("beast_attack_rod_yellow", Tabs.bazooka,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item beast_attack_rod_pink = new Item_gun("beast_attack_rod_pink", Tabs.bazooka,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	public static Item bull_riot = new item_sword_gun_changer("bull_riot", Tabs.sword_gun,SentaiItems40.gingaman_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGingaman);
	
	//23 Kyukyu Sentai GoGo-V
	public static Item gogo_v_logo = new Item_ore("gogo_v_logo").setCreativeTab(Tabs.tabGogoV);
//	public static Block gogo_v_ore = new ore_block("gogo_v_ore", Material.ROCK, gogo_v_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGogoV);
	
	public static Item gogo_v_head = new item_sentai_armor("gogo_v_head", item_gogo_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item gogo_v_torso = new item_sentai_armor("gogo_v_torso", item_gogo_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item gogo_v_legs = new item_sentai_armor("gogo_v_legs", item_gogo_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
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
	public static Item five_laser_red = new Item_sword_gun("five_laser_red",Tabs.sword_gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_blue = new Item_sword_gun("five_laser_blue",Tabs.sword_gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_green = new Item_sword_gun("five_laser_green",Tabs.sword_gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_yellow = new Item_sword_gun("five_laser_yellow",Tabs.sword_gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item five_laser_pink = new Item_sword_gun("five_laser_pink",Tabs.sword_gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_red = new ItemBaseSword("v_boomerang_red",Tabs.boomerang,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_blue = new ItemBaseSword("v_boomerang_blue",Tabs.boomerang,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_green = new ItemBaseSword("v_boomerang_green",Tabs.boomerang,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_yellow = new ItemBaseSword("v_boomerang_yellow",Tabs.boomerang,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_boomerang_pink = new ItemBaseSword("v_boomerang_pink",Tabs.boomerang,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_red = new ItemBaseSword("v_lancer_red",Tabs.rod,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_blue = new ItemBaseSword("v_lancer_blue",Tabs.rod,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_green = new ItemBaseSword("v_lancer_green",Tabs.rod,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_yellow = new ItemBaseSword("v_lancer_yellow",Tabs.rod,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_lancer_pink = new ItemBaseSword("v_lancer_pink",Tabs.rod,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_red = new Item_gun("v_machine_gun_red",Tabs.bazooka,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.v_lancer_red).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_blue = new Item_gun("v_machine_gun_blue",Tabs.bazooka,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.v_lancer_blue).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_green = new Item_gun("v_machine_gun_green",Tabs.bazooka,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.v_lancer_green).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_yellow = new Item_gun("v_machine_gun_yellow",Tabs.bazooka,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.v_lancer_yellow).setCreativeTab(Tabs.tabGogoV);
	public static Item v_machine_gun_pink = new Item_gun("v_machine_gun_pink",Tabs.bazooka,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.v_lancer_pink).setCreativeTab(Tabs.tabGogoV);
	public static Item go_blaster = new Item_gun("go_blaster",Tabs.gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item go_blaster_hyper = new Item_gun("go_blaster_hyper",Tabs.super_gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.go_blaster).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_sword = new ItemBaseSword("zeek_sword",Tabs.sword,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_shot = new Item_gun("zeek_shot",Tabs.gun,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	public static Item zeek_blaster = new Item_gun("zeek_blaster",Tabs.bazooka,SentaiItems40.gogo_v_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGogoV);
	
	//24 Mirai Sentai Timeranger
	public static Item timeranger_logo = new Item_ore("timeranger_logo").setCreativeTab(Tabs.tabMisc);

	public static Item timeranger_belt = new Item_ore("timeranger_belt");
	
	//25 Hyakujuu Sentai Gaoranger
	public static Item gaoranger_logo = new Item_ore("gaoranger_logo").setCreativeTab(Tabs.tabGaoranger);
	public static Item empty_gao_jewel = new Item_ore("empty_gao_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Block gaoranger_ore = new ore_block("gaoranger_ore", Material.ROCK, empty_gao_jewel, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gaoranger_head = new item_sentai_armor("gaoranger_head", item_g_phone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gaoranger_torso = new item_sentai_armor("gaoranger_torso", item_g_phone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gaoranger_legs = new item_sentai_armor("gaoranger_legs", item_g_phone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item red_g_phone = new item_g_phone("red_g_phone", ArmorMaterial.DIAMOND, 4, "gao_red").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item yellow_g_phone = new item_g_phone("yellow_g_phone", ArmorMaterial.DIAMOND, 4, "gao_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item blue_g_phone = new item_g_phone("blue_g_phone", ArmorMaterial.DIAMOND, 4, "gao_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item black_g_phone = new item_g_phone("black_g_phone", ArmorMaterial.DIAMOND, 4, "gao_black").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item white_g_phone = new item_g_phone("white_g_phone", ArmorMaterial.DIAMOND, 4, "gao_white").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item g_brace_phone = new item_g_phone("g_brace_phone", ArmorMaterial.DIAMOND, 4, "gao_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gaoranger_belt = new Item_ore("gaoranger_belt");
	public static Item gao_silver_belt = new Item_ore("gao_silver_belt");
	
	public static Item gao_lion_jewel = new item_gao_jewel(0, "gao_lion_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_eagle_jewel = new item_gao_jewel(0, "gao_eagle_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_shark_jewel = new item_gao_jewel(1, "gao_shark_jewel","right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_bison_jewel = new item_gao_jewel(1, "gao_bison_jewel","legs").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_tiger_jewel = new item_gao_jewel(1, "gao_tiger_jewel","left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_wolf_jewel = new item_gao_jewel(4, "gao_wolf_jewel","left").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_elephant_jewel = new item_gao_jewel(0, "gao_elephant_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_giraffe_jewel = new item_gao_jewel(2, "gao_giraffe_jewel","right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_bear_jewel = new item_gao_jewel(3, "gao_bear_jewel","left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_polar_jewel = new item_gao_jewel(3, "gao_polar_jewel","right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_gorilla_jewel = new item_gao_jewel(0, "gao_gorilla_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hammerhead_jewel = new item_gao_jewel(4, "gao_hammerhead_jewel","right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_ligator_jewel = new item_gao_jewel(0, "gao_ligator_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_rhinos_jewel = new item_gao_jewel(2, "gao_rhinos_jewel","legs").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_madillo_jewel = new item_gao_jewel(2, "gao_madillo_jewel","legs").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_deers_jewel = new item_gao_jewel(2, "gao_deers_jewel","left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_falcon_jewel = new item_gao_jewel(0, "gao_falcon_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_leon_jewel = new item_gao_jewel(0, "gao_leon_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_condor_jewel = new item_gao_jewel(0, "gao_condor_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_sawshark_jewel = new item_gao_jewel(5, "gao_sawshark_jewel","right").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_buffalo_jewel = new item_gao_jewel(3, "gao_buffalo_jewel","legs").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_jaguar_jewel = new item_gao_jewel(5, "gao_jaguar_jewel","left").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_kong_jewel = new item_gao_jewel(0, "gao_kong_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_panda_jewel = new item_gao_jewel(6, "gao_panda_jewel","right").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_lion_blue_jewel = new item_gao_jewel(1, "gao_lion_blue_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_lion_black_jewel = new item_gao_jewel(2, "gao_lion_black_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_lion_white_jewel = new item_gao_jewel(3, "gao_lion_white_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_ape_jewel = new item_gao_jewel(1, "gao_ape_jewel","blank").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item unfinished_gao_god_jewel = new Item_ore("unfinished_gao_god_jewel").setCreativeTab(Tabs.tabGaoranger);
	public static Item empty_gao_god_jewel = new Item_ore("empty_gao_god_jewel").setCreativeTab(Tabs.tabGaoranger);
	
	public static Item beast_king_sword = new ItemBaseSword("beast_king_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item lion_beast_king_sword = new ItemBaseSword("lion_beast_king_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item eagle_beast_king_sword = new ItemBaseSword("eagle_beast_king_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item shark_beast_king_sword = new ItemBaseSword("shark_beast_king_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item bison_beast_king_sword = new ItemBaseSword("bison_beast_king_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item tiger_beast_king_sword = new ItemBaseSword("tiger_beast_king_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item evil_crushing_hundred_beast_sword = new item_cannon("evil_crushing_hundred_beast_sword", Tabs.mecha_sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item lion_fang = new ItemBaseSword("lion_fang", Tabs.tonfa,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_mane_buster = new item_charge_gun("gao_mane_buster", Tabs.gun,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item eagle_sword = new ItemBaseSword("eagle_sword", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item shark_cutter = new ItemBaseSword("shark_cutter", Tabs.tonfa,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item bison_axe = new ItemBaseSword("bison_axe", Tabs.axe,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item tiger_baton = new ItemBaseSword("tiger_baton", Tabs.rod,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hustler_rod = new Item_sword_gun("gao_hustler_rod", Tabs.sword_gun,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item falcon_summoner = new item_charge_gun("falcon_summoner", Tabs.gun,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item mikazukiken = new ItemBaseSword("mikazukiken", Tabs.sword,SentaiItems40.empty_gao_jewel).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item flute_knife = new item_flute_knife("flute_knife", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_king_torso = new item_mecha_armor("gao_king_torso", item_gaoranger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.CHEST, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_king_legs = new item_mecha_armor("gao_king_legs", item_gaoranger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.LEGS, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_king_boots = new item_mecha_armor("gao_king_boots", item_gaoranger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.FEET, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_king_head = new item_gaoranger_mecha("gao_king_head", Tabs.mecha, 4, "gao_king").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item gao_muscle_head = new item_gaoranger_mecha("gao_muscle_head", Tabs.mecha, 4, "gao_muscle").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hunter_head = new item_gaoranger_mecha("gao_hunter_head", Tabs.mecha, 4, "gao_hunter").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_hunter_blue_moon_head = new item_gaoranger_mecha("gao_hunter_blue_moon_head", Tabs.mecha, 4, "gao_hunter_blue_moon").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_icarus_head = new item_gaoranger_mecha("gao_icarus_head", Tabs.mecha, 4, "gao_icarus").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_god_head = new item_gaoranger_mecha("gao_god_head", Tabs.mecha, 4, "gao_god").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item gao_knight_head = new item_gaoranger_mecha("gao_knight_head", Tabs.mecha, 4, "gao_knight").setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	public static Item fin_blade = new ItemBaseSword("fin_blade", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item elephant_sword = new ItemBaseSword("elephant_sword", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item elephant_shield = new ItemBaseShield("elephant_shield",SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item ligator_blade = new ItemBaseSword("ligator_blade", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	public static Item ligator_blade_blue_moon = new ItemBaseSword("ligator_blade_blue_moon", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaoranger);
	
	//26 Ninpuu Sentai Hurricaneger
	public static Item hurricaneger_logo = new Item_ore("hurricaneger_logo").setCreativeTab(Tabs.tabMisc);

	public static Item hurricaneger_belt = new Item_ore("hurricaneger_belt");
	
	public static Item shurikens_bat = new item_dual_sword("shurikens_bat", Tabs.sword,SentaiItems40.hurricaneger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	//27 Bakuryu Sentai Abaranger
	public static Item abaranger_logo = new Item_ore("abaranger_logo").setCreativeTab(Tabs.tabAbaranger);
	public static Block abaranger_ore = new ore_block("abaranger_ore", Material.ROCK, abaranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaranger_head = new item_sentai_armor("abaranger_head", item_dino_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaranger_torso = new item_sentai_armor("abaranger_torso", item_dino_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaranger_legs = new item_sentai_armor("abaranger_legs", item_dino_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
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
	
	public static Item aba_laser = new Item_sword_gun("aba_laser", Tabs.sword_gun,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item baku_laser = new Item_sword_gun("baku_laser", Tabs.sword_gun,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item tyranno_rod = new ItemBaseSword("tyranno_rod", Tabs.rod,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item tricera_bunker = new ItemBaseSword("tricera_bunker", Tabs.hammer,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item ptera_dagger = new ItemBaseSword("ptera_dagger", Tabs.sword,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item dino_thruster = new ItemBaseSword("dino_thruster", Tabs.rod,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item wing_pentact = new ItemBaseSword("wing_pentact", Tabs.sword,SentaiItems40.abaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item sty_riser = new item_sty_riser("sty_riser", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item sty_riser_shield = new item_sty_riser_shield("sty_riser_shield").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaren_oh_torso = new item_mecha_armor("abaren_oh_torso", item_abaranger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.CHEST, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaren_oh_legs = new item_mecha_armor("abaren_oh_legs", item_abaranger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.LEGS, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item abaren_oh_boots = new item_mecha_armor("abaren_oh_boots", item_abaranger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.FEET, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaren_oh_head = new item_abaranger_mecha("abaren_oh_head", Tabs.mecha, 4, "abaren_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item abaren_ohji_head = new item_abaranger_mecha("abaren_ohji_head", Tabs.mecha, 4, "abaren_ohji").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item killer_oh_head = new item_abaranger_mecha("killer_oh_head", Tabs.mecha, 4, "killer_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item max_ohja_head = new item_abaranger_mecha("max_ohja_head", Tabs.mecha, 4, "max_ohja").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item max_ryuoh_head = new item_abaranger_mecha("max_ryuoh_head", Tabs.mecha, 4, "max_ryuoh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item oo_abaren_oh_head = new item_abaranger_mecha("oo_abaren_oh_head", Tabs.mecha, 4, "oo_abaren_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item bakuren_oh_head = new item_abaranger_mecha("bakuren_oh_head", Tabs.mecha, 4, "bakuren_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	public static Item oo_abaren_oh_wings = new Item_ore("oo_abaren_oh_wings");
	
	public static Item double_tall_sword = new ItemBaseSword("double_tall_sword", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item tricera_shield = new ItemBaseShield("tricera_shield",SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item gale_spear = new ItemBaseSword("gale_spear", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item bakuryu_axe = new ItemBaseSword("bakuryu_axe", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item bakuryu_spear = new ItemBaseSword("bakuryu_spear", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setContainerItem(bakuryu_axe).setCreativeTab(Tabs.tabAbaranger);
	public static Item double_tall_sword_bakuren_oh = new ItemBaseSword("double_tall_sword_bakuren_oh", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	public static Item chasmo_shield = new ItemBaseShield("chasmo_shield",SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabAbaranger);
	
	//28 Tokusou Sentai Dekaranger
	public static Item dekaranger_badge = new Item_ore("dekaranger_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Block dekaranger_ore = new ore_block("dekaranger_ore", Material.ROCK, dekaranger_badge, 2).setHardness(9.9F).setCreativeTab(Tabs.tabDekaranger);
	public static Block dekaranger_nether_ore = new ore_block("dekaranger_nether_ore", Material.ROCK, dekaranger_badge, 3).setHardness(9.9F).setCreativeTab(Tabs.tabDekaranger);
	
	public static Item dekaranger_head = new item_sentai_armor("dekaranger_head", item_sp_license.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item dekaranger_torso = new item_sentai_armor("dekaranger_torso", item_sp_license.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item dekaranger_legs = new item_sentai_armor("dekaranger_legs", item_sp_license.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	
	public static Item red_sp_license = new item_sp_license("red_sp_license", ArmorMaterial.DIAMOND, 4, "deka_red").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item fs_license = new item_sp_license("fs_license", ArmorMaterial.DIAMOND, 4, "deka_red_fire_squad").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item blue_sp_license = new item_sp_license("blue_sp_license", ArmorMaterial.DIAMOND, 4, "deka_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item green_sp_license = new item_sp_license("green_sp_license", ArmorMaterial.DIAMOND, 4, "deka_green").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item yellow_sp_license = new item_sp_license("yellow_sp_license", ArmorMaterial.DIAMOND, 4, "deka_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item pink_sp_license = new item_sp_license("pink_sp_license", ArmorMaterial.DIAMOND, 4, "deka_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item break_brace_throttle = new item_sp_license("break_brace_throttle", ArmorMaterial.DIAMOND, 4, "deka_break").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item master_license = new item_sp_license("master_license", ArmorMaterial.DIAMOND, 4, "deka_master").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item swan_sp_license = new item_sp_license("swan_sp_license", ArmorMaterial.DIAMOND, 4, "deka_swan").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item bright_brace_throttle = new item_sp_license("bright_brace_throttle", ArmorMaterial.DIAMOND, 4, "deka_bright").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item gold_sp_license = new item_sp_license("gold_sp_license", ArmorMaterial.DIAMOND, 4, "deka_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item neo_red_sp_license = new item_sp_license("neo_red_sp_license", ArmorMaterial.DIAMOND, 4, "neo_deka_red").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item neo_yellow_sp_license = new item_sp_license("neo_yellow_sp_license", ArmorMaterial.DIAMOND, 4, "neo_deka_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	
	public static Item dekaranger_belt = new Item_ore("dekaranger_belt");
	public static Item deka_fire_squad_belt = new Item_ore("deka_fire_squad_belt");
	public static Item deka_break_belt = new Item_ore("deka_break_belt");
	public static Item deka_master_belt = new Item_ore("deka_master_belt");
	
	public static Item deka_red_badge = new item_sp_badge(0,"deka_red_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_blue_badge = new item_sp_badge(0,"deka_blue_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_green_badge = new item_sp_badge(0,"deka_green_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_yellow_badge = new item_sp_badge(0,"deka_yellow_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_pink_badge = new item_sp_badge(0,"deka_pink_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_break_badge = new item_sp_badge(0,"deka_break_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_master_badge = new item_sp_badge(0,"deka_master_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_swan_badge = new item_sp_badge(0,"deka_swan_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_bright_badge = new item_sp_badge(0,"deka_bright_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_gold_badge = new item_sp_badge(0,"deka_gold_badge").setCreativeTab(Tabs.tabDekaranger);
	
	public static Item deka_red_swat_badge = new item_sp_badge(1,"deka_red_swat_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_blue_swat_badge = new item_sp_badge(1,"deka_blue_swat_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_green_swat_badge = new item_sp_badge(1,"deka_green_swat_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_yellow_swat_badge = new item_sp_badge(1,"deka_yellow_swat_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_pink_swat_badge = new item_sp_badge(1,"deka_pink_swat_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_red_fire_squad_badge = new item_sp_badge(0,"deka_red_fire_squad_badge").setCreativeTab(Tabs.tabDekaranger);
	public static Item deka_red_battlizer_badge = new item_sp_badge(2,"deka_red_battlizer_badge").setCreativeTab(Tabs.tabDekaranger);
	
	public static Item sp_shooter = new Item_gun("sp_shooter",Tabs.gun,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_magnum_1 = new Item_gun("d_magnum_1",Tabs.gun,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_magnum_2 = new Item_gun("d_magnum_2",Tabs.gun,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item hybrid_magnum = new Item_gun("hybrid_magnum",Tabs.super_gun,SentaiItems40.dekaranger_badge).setContainerItem(SentaiItems40.d_magnum_2).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_rod_blue = new ItemBaseSword("d_rod_blue",Tabs.rod,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_rod_green = new ItemBaseSword("d_rod_green",Tabs.rod,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_stick_yellow = new ItemBaseSword("d_stick_yellow",Tabs.rod,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_stick_pink = new ItemBaseSword("d_stick_pink",Tabs.rod,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_knuckle = new ItemBaseSword("d_knuckle",Tabs.tonfa,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_sniper = new Item_gun("d_sniper",Tabs.super_gun,SentaiItems40.dekaranger_badge).setContainerItem(SentaiItems40.d_knuckle).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_blaster = new Item_gun("d_blaster",Tabs.super_gun,SentaiItems40.dekaranger_badge).setContainerItem(SentaiItems40.d_knuckle).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_shot_yellow = new Item_gun("d_shot_yellow",Tabs.super_gun,SentaiItems40.dekaranger_badge).setContainerItem(SentaiItems40.d_knuckle).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_shot_pink = new Item_gun("d_shot_pink",Tabs.super_gun,SentaiItems40.dekaranger_badge).setContainerItem(SentaiItems40.d_knuckle).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_sword_vega = new ItemBaseSword("d_sword_vega",Tabs.super_sword,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_smasher = new Item_gun("d_smasher",Tabs.hyper_gun,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item d_revolver = new Item_gun("d_revolver",Tabs.bazooka,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	public static Item battlizer_sword = new Item_sword_gun("battlizer_sword",Tabs.sword_gun,SentaiItems40.dekaranger_badge).setMaxStackSize(1).setCreativeTab(Tabs.tabDekaranger);
	
	//29 Mahou Sentai Magiranger
	public static Item magiranger_logo = new Item_ore("magiranger_logo").setCreativeTab(Tabs.tabMisc);
	
	public static Item magi_king_wings = new Item_ore("magi_king_wings");
	
	public static Item magi_stick_red = new ItemBaseSword("magi_stick_red", Tabs.sword,SentaiItems40.magiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item magi_stick_yellow = new ItemBaseSword("magi_stick_yellow", Tabs.sword,SentaiItems40.magiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item magi_stick_blue = new ItemBaseSword("magi_stick_blue", Tabs.sword,SentaiItems40.magiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item magi_stick_pink = new ItemBaseSword("magi_stick_pink", Tabs.sword,SentaiItems40.magiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	public static Item magi_stick_green = new ItemBaseSword("magi_stick_green", Tabs.sword,SentaiItems40.magiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabMisc);
	
	//30 GoGo Sentai Boukenger
	public static Item boukenger_logo = new Item_ore("boukenger_logo").setCreativeTab(Tabs.tabBoukenger);
	public static Block boukenger_ore = new ore_block("boukenger_ore", Material.ROCK, boukenger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabBoukenger);
	
	public static Item boukenger_head = new item_sentai_armor("boukenger_head", item_accellular.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item boukenger_torso = new item_sentai_armor("boukenger_torso", item_accellular.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item boukenger_legs = new item_sentai_armor("boukenger_legs", item_accellular.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
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
	
	public static Item survi_blade = new Item_sword_gun("survi_blade",Tabs.sword_gun,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item bouken_bo = new ItemBaseSword("bouken_bo",Tabs.rod,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item radial_hammer = new ItemBaseSword("radial_hammer",Tabs.hammer,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item blow_knuckle = new ItemBaseSword("blow_knuckle",Tabs.tonfa,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item bucket_scooper = new ItemBaseSword("bucket_scooper",Tabs.tonfa,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item hydro_shooter = new Item_gun("hydro_shooter",Tabs.gun,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item sagaspear = new Item_sword_gun("sagaspear",Tabs.sword_gun,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	public static Item dual_crusher_mixer = new item_dual_gun("dual_crusher_mixer",Tabs.super_gun,SentaiItems40.boukenger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabBoukenger);
	
	//31 Juken Sentai Gekiranger
	public static Item gekiranger_logo = new Item_ore("gekiranger_logo").setCreativeTab(Tabs.tabGekiranger);
	public static Block gekiranger_ore = new ore_block("gekiranger_ore", Material.ROCK, gekiranger_logo, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGekiranger);
	
	public static Item gekiranger_head = new item_sentai_armor("gekiranger_head", item_geki_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item gekiranger_torso = new item_sentai_armor("gekiranger_torso", item_geki_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item gekiranger_legs = new item_sentai_armor("gekiranger_legs", item_geki_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	
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
	public static Item sai_blade_cutter = new item_sword_gun_changer("sai_blade_cutter",Tabs.sword_gun,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_tonfa = new ItemBaseSword("geki_tonfa",Tabs.tonfa,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_tonfa_baton = new ItemBaseSword("geki_tonfa_baton",Tabs.sword,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_tonfa_long_baton = new ItemBaseSword("geki_tonfa_long_baton",Tabs.rod,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.geki_tonfa_baton).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_hammer = new ItemBaseSword("geki_hammer",Tabs.megaton,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_fan = new ItemBaseSword("geki_fan",Tabs.boomerang,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_saber_twin_a = new ItemBaseSword("geki_saber_twin_a",Tabs.sword,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_saber_twin_b = new ItemBaseSword("geki_saber_twin_b",Tabs.sword,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	public static Item geki_saber_twin_combo = new ItemBaseSword("geki_saber_twin_combo",Tabs.super_sword,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.geki_saber_twin_b).setCreativeTab(Tabs.tabGekiranger);
	public static Item virtuous_beast_sword = new ItemBaseSword("virtuous_beast_sword",Tabs.super_sword,SentaiItems40.gekiranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabGekiranger);
	
	//32 Engine Sentai Go-Onger
	public static Item go_onger_logo = new Item_ore("go_onger_logo").setCreativeTab(Tabs.tabGoOnger);
	public static Item blank_engine_soul = new Item_ore("blank_engine_soul").setCreativeTab(Tabs.tabGoOnger);
	public static Block go_onger_ore = new ore_block("go_onger_ore", Material.ROCK, blank_engine_soul, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item go_onger_head = new item_sentai_armor("go_onger_head", item_go_phone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item go_onger_torso = new item_sentai_armor("go_onger_torso", item_go_phone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item go_onger_legs = new item_sentai_armor("go_onger_legs", item_go_phone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
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
	
	public static Item mantan_sword = new Item_sword_gun("mantan_sword", Tabs.sword_gun,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item road_sabre = new ItemBaseSword("road_sabre", Tabs.sword,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item garage_launcher = new Item_gun("garage_launcher", Tabs.super_gun,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item bridge_axe = new ItemBaseSword("bridge_axe", Tabs.axe,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item cowl_laser = new Item_gun("cowl_laser", Tabs.gun,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item rocket_dagger = new item_rocket_dagger("rocket_dagger", Tabs.sword).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item wing_booster = new Item_gun("wing_booster", Tabs.super_gun,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setContainerItem(SentaiItems40.rocket_dagger).setCreativeTab(Tabs.tabGoOnger);
	public static Item wing_booster_silver = new Item_gun("wing_booster_silver", Tabs.super_gun,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setContainerItem(SentaiItems40.rocket_dagger);
	public static Item kankanbar = new ItemBaseSword("kankanbar", Tabs.mecha_sword,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item kankan_mantan_gun = new Item_gun("kankan_mantan_gun", Tabs.hyper_gun,SentaiItems40.blank_engine_soul).setMaxStackSize(1).setContainerItem(SentaiItems40.mantan_sword).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item engine_oh_torso = new item_mecha_armor("engine_oh_torso", item_go_onger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.CHEST, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_legs = new item_mecha_armor("engine_oh_legs", item_go_onger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.LEGS, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_boots = new item_mecha_armor("engine_oh_boots", item_go_onger_mecha.class, Tabs.mecha, 4, EntityEquipmentSlot.FEET, SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item engine_oh_head = new item_go_onger_mecha("engine_oh_head", Tabs.mecha, 4, "engine_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item gunbir_oh_head = new item_go_onger_mecha("gunbir_oh_head", Tabs.mecha, 4, "gunbir_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_g6_head = new item_go_onger_mecha("engine_oh_g6_head", Tabs.mecha, 4, "engine_oh_g6").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item seikuu_oh_head = new item_go_onger_mecha("seikuu_oh_head", Tabs.mecha, 4, "seikuu_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_g9_head = new item_go_onger_mecha("engine_oh_g9_head", Tabs.mecha, 4, "engine_oh_g9").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item kyoretsu_oh_head = new item_go_onger_mecha("kyoretsu_oh_head", Tabs.mecha, 4, "kyoretsu_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_oh_g12_head = new item_go_onger_mecha("engine_oh_g12_head", Tabs.mecha, 4, "engine_oh_g12").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item engine_daishogun_head = new item_go_onger_mecha("engine_daishogun_head", Tabs.mecha, 4, "engine_daishogun").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item skydor_engine_oh_head = new item_go_onger_mecha("skydor_engine_oh_head", Tabs.mecha, 4, "skydor_engine_oh").setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	public static Item go_on_sword = new ItemBaseSword("go_on_sword", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item v_shield = new ItemBaseShield("v_shield",SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	public static Item enjin_ken = new ItemBaseSword("enjin_ken", Tabs.mecha_sword,SentaiItems20.mecha_gear).setMaxStackSize(1).setCreativeTab(Tabs.tabGoOnger);
	
	//33 Samurai Sentai Shinkenger
	public static Item shinkenger_logo = new Item_ore("shinkenger_logo").setCreativeTab(Tabs.tabShinkenger);
	public static Item common_disk = new Item_ore("common_disk").setCreativeTab(Tabs.tabShinkenger);
	public static Block shinkenger_ore = new ore_block("shinkenger_ore", Material.ROCK, common_disk, 2).setHardness(9.9F).setCreativeTab(Tabs.tabShinkenger);
	
	public static Item shinkenger_head = new item_sentai_armor("shinkenger_head", item_shodophone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item shinkenger_torso = new item_sentai_armor("shinkenger_torso", item_shodophone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item shinkenger_legs = new item_sentai_armor("shinkenger_legs", item_shodophone.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	
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
	
	public static Item shinkenmaru = new ItemBaseSword("shinkenmaru", Tabs.sword,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item rekka_daizantou = new ItemBaseSword("rekka_daizantou", Tabs.super_sword,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item water_arrow = new Item_gun("water_arrow", Tabs.bow,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item heaven_fan = new ItemBaseSword("heaven_fan", Tabs.sword,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item wood_spear = new ItemBaseSword("wood_spear", Tabs.rod,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item land_slicer = new ItemBaseSword("land_slicer", Tabs.throwable,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item sakanamaru = new ItemBaseSword("sakanamaru", Tabs.sword,SentaiItems40.common_disk).setMaxStackSize(1).setCreativeTab(Tabs.tabShinkenger);
	public static Item super_shinkenmaru = new ItemBaseSword("super_shinkenmaru", Tabs.super_sword,SentaiItems40.common_disk).setMaxStackSize(1).setContainerItem(shinkenmaru).setCreativeTab(Tabs.tabShinkenger);
	public static Item kyoryumaru = new ItemBaseSword("kyoryumaru", Tabs.super_sword,SentaiItems40.common_disk).setMaxStackSize(1).setContainerItem(shinkenmaru).setCreativeTab(Tabs.tabShinkenger);
	public static Item kyoryumaru_sakanamaru = new ItemBaseSword("kyoryumaru_sakanamaru", Tabs.super_sword,SentaiItems40.common_disk).setMaxStackSize(1).setContainerItem(sakanamaru);
	
	//34 Tensou Sentai Goseiger
	public static Item goseiger_logo = new Item_ore("goseiger_logo").setCreativeTab(Tabs.tabMisc);

	public static Item goseiger_belt = new Item_ore("goseiger_belt");
	
	//35 Kaizoku Sentai Gokaiger
	public static Item gokaiger_logo = new Item_ore("gokaiger_logo").setCreativeTab(Tabs.tabMisc);
	
	//36 Tokumei Sentai Go-Busters
	public static Item go_busters_logo = new Item_ore("go_busters_logo").setCreativeTab(Tabs.tabGoBusters);
	public static Item enetron = new Item_ore("enetron").setCreativeTab(Tabs.tabGoBusters);
	public static Item blank_animal_disk = new Item_ore("blank_animal_disk").setCreativeTab(Tabs.tabGoBusters);
	public static Block go_busters_ore = new ore_block("go_busters_ore", Material.ROCK, enetron, 2).setHardness(9.9F).setCreativeTab(Tabs.tabGoBusters);
	public static Block doubutsu_go_busters_ore = new ore_block("doubutsu_go_busters_ore", Material.ROCK, blank_animal_disk, 3).setHardness(9.9F).setCreativeTab(Tabs.tabGoBusters);
	
	public static Item go_busters_head = new item_sentai_armor("go_busters_head", item_morphin_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item go_busters_torso = new item_sentai_armor("go_busters_torso", item_morphin_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item go_busters_legs = new item_sentai_armor("go_busters_legs", item_morphin_brace.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
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
	
	public static Item morphin_blaster = new item_gun_changer("morphin_blaster",Tabs.gun,SentaiItems40.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item ichigan_buster = new Item_gun("ichigan_buster",Tabs.gun,SentaiItems40.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item sougan_blade = new ItemBaseSword("sougan_blade",Tabs.sword,SentaiItems40.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item ichigan_buster_special = new Item_gun("ichigan_buster_special",Tabs.super_gun,SentaiItems40.enetron).setMaxStackSize(1).setContainerItem(SentaiItems40.ichigan_buster).setCreativeTab(Tabs.tabGoBusters);
	public static Item dri_blade = new ItemBaseSword("dri_blade",Tabs.sword,SentaiItems40.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	public static Item lio_attache = new Item_gun("lio_attache",Tabs.hyper_gun,SentaiItems40.enetron).setMaxStackSize(1).setCreativeTab(Tabs.tabGoBusters);
	
	//36-37 Hikounin Sentai Akibaranger
	public static Item akibaranger_logo = new Item_ore("akibaranger_logo").setCreativeTab(Tabs.tabAkibaranger);
	
	public static Item akibaranger_head = new item_sentai_armor("akibaranger_head", item_moe_moe_z_cune.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, akibaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item akibaranger_torso = new item_sentai_armor("akibaranger_torso", item_moe_moe_z_cune.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, akibaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item akibaranger_legs = new item_sentai_armor("akibaranger_legs", item_moe_moe_z_cune.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, akibaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);

	public static Item red_moe_moe_z_cune = new item_moe_moe_z_cune("red_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_red").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item blue_moe_moe_z_cune = new item_moe_moe_z_cune("blue_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item blue_s2_moe_moe_z_cune = new item_moe_moe_z_cune("blue_s2_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_blue_s2").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item yellow_moe_moe_z_cune = new item_moe_moe_z_cune("yellow_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_yellow").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item yellow_s2_moe_moe_z_cune = new item_moe_moe_z_cune("yellow_s2_moe_moe_z_cune", ArmorMaterial.DIAMOND, 4, "akiba_yellow_s2").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item china_aura_changer = new item_moe_moe_z_cune("china_aura_changer", ArmorMaterial.DIAMOND, 4, "china_red").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item akiba_changer = new item_moe_moe_z_cune("akiba_changer", ArmorMaterial.DIAMOND, 4, "akiba_white").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item red_dino_buckler = new item_moe_moe_z_cune("red_dino_buckler", ArmorMaterial.DIAMOND, 4, "red_powerful_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item green_dino_buckler = new item_moe_moe_z_cune("green_dino_buckler", ArmorMaterial.DIAMOND, 4, "green_powerful_ranger").setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);

	public static Item akiba_red_logo = new Item_ore("akiba_red_logo").setCreativeTab(Tabs.tabAkibaranger);
	public static Item akiba_blue_logo = new Item_ore("akiba_blue_logo").setCreativeTab(Tabs.tabAkibaranger);
	public static Item akiba_yellow_logo = new Item_ore("akiba_yellow_logo").setCreativeTab(Tabs.tabAkibaranger);
	
	public static Item moe_moe_z_cune = new item_gun_changer("moe_moe_z_cune", Tabs.gun,SentaiItems40.akibaranger_logo).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item munyu_munyu_zubaan = new item_munyu_munyu_zubaan("munyu_munyu_zubaan", Tabs.super_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabAkibaranger);
	public static Item munyu_moe_zubakyun = new Item_gun("munyu_moe_zubakyun", Tabs.super_gun,SentaiItems40.akibaranger_logo).setMaxStackSize(1).setContainerItem(SentaiItems40.moe_moe_z_cune).setCreativeTab(Tabs.tabAkibaranger);
	
	//37 Zyuden Sentai Kyoryuger
	public static Item kyoryuger_logo = new Item_ore("kyoryuger_logo").setCreativeTab(Tabs.tabKyoryuger);
	public static Item blank_zyudenchi = new Item_ore("blank_zyudenchi").setCreativeTab(Tabs.tabKyoryuger);
	public static Block zyudenchi_charger = new zyudenchi_charger("zyudenchi_charger", Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabKyoryuger);
	public static Item blank_deboth_zyudenchi = new Item_ore("blank_deboth_zyudenchi").setCreativeTab(Tabs.tabKyoryuger);
	public static Item blank_brave_zyudenchi = new Item_ore("blank_brave_zyudenchi").setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item kyoryuger_head = new item_sentai_armor("kyoryuger_head", item_gaburivolver.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item kyoryuger_torso = new item_sentai_armor("kyoryuger_torso", item_gaburivolver.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item kyoryuger_legs = new item_sentai_armor("kyoryuger_legs", item_gaburivolver.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);

	public static Item red_gaburivolver = new item_gaburivolver("red_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item black_gaburivolver = new item_gaburivolver("black_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_black").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item blue_gaburivolver = new item_gaburivolver("blue_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item green_gaburivolver = new item_gaburivolver("green_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_green").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item pink_gaburivolver = new item_gaburivolver("pink_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gold_gaburichanger = new item_gaburivolver("gold_gaburichanger", ArmorMaterial.DIAMOND, 4,"kyoryu_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item cyan_gaburivolver = new item_gaburivolver("cyan_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_cyan").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item grey_gaburivolver = new item_gaburivolver("grey_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_grey").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item violet_gaburivolver = new item_gaburivolver("violet_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_violet").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item silver_giga_gaburivolver = new item_gaburivolver("silver_giga_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_silver").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item cyan_spirit_zyudenchi = new item_gaburivolver("cyan_spirit_zyudenchi", ArmorMaterial.DIAMOND, 4,"kyoryu_cyan_spirit").AddToKyoryugerZyudenchi(1).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item grey_spirit_zyudenchi = new item_gaburivolver("grey_spirit_zyudenchi", ArmorMaterial.DIAMOND, 4,"kyoryu_grey_spirit").AddToKyoryugerZyudenchi(1).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item death_flute_buster = new item_gaburivolver("death_flute_buster", ArmorMaterial.DIAMOND, 4,"death_ryuger").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item chaos_stone = new item_gaburivolver("chaos_stone", ArmorMaterial.DIAMOND, 4,"chaos_ryuger").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item future_red_gaburivolver = new item_gaburivolver("future_red_gaburivolver", ArmorMaterial.DIAMOND, 4,"future_kyoryu_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item future_black_gaburivolver = new item_gaburivolver("future_black_gaburivolver", ArmorMaterial.DIAMOND, 4,"future_kyoryu_black").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item future_blue_gaburivolver = new item_gaburivolver("future_blue_gaburivolver", ArmorMaterial.DIAMOND, 4,"kyoryu_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item future_green_gaburivolver = new item_gaburivolver("future_green_gaburivolver", ArmorMaterial.DIAMOND, 4,"future_kyoryu_green").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item future_pink_gaburivolver = new item_gaburivolver("future_pink_gaburivolver", ArmorMaterial.DIAMOND, 4,"future_kyoryu_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item future_gaburichanger = new item_gaburivolver("future_gaburichanger", ArmorMaterial.DIAMOND, 4,"future_kyoryu_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item red_gabu_gaburivolver = new item_gaburivolver("red_gabu_gaburivolver", ArmorMaterial.DIAMOND, 4,"brave_kyoryu_red").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item black_gabu_gaburivolver = new item_gaburivolver("black_gabu_gaburivolver", ArmorMaterial.DIAMOND, 4,"brave_kyoryu_black").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item blue_gabu_gaburivolver = new item_gaburivolver("blue_gabu_gaburivolver", ArmorMaterial.DIAMOND, 4,"brave_kyoryu_blue").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item green_gabu_gaburivolver = new item_gaburivolver("green_gabu_gaburivolver", ArmorMaterial.DIAMOND, 4,"brave_kyoryu_green").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item pink_gabu_gaburivolver = new item_gaburivolver("pink_gabu_gaburivolver", ArmorMaterial.DIAMOND, 4,"brave_kyoryu_pink").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gold_gabu_gabuchanger = new item_gaburivolver("gold_gabu_gabuchanger", ArmorMaterial.DIAMOND, 4,"brave_kyoryu_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item mo_buckle = new Item_ore("mo_buckle");
	public static Item gold_mo_buckle = new Item_ore("gold_mo_buckle");
	public static Item spirit_mo_buckle = new Item_ore("spirit_mo_buckle");
	public static Item kyoryu_silver_wings = new Item_ore("kyoryu_silver_wings");
	
	public static Item tobaspino_zyudenchi = new item_zyudenchi(0,"tobaspino_zyudenchi").AddToKyoryugerZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabutyra_zyudenchi = new item_zyudenchi(0,"gabutyra_zyudenchi").AddToKyoryugerZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item parasagun_zyudenchi = new item_zyudenchi(0,"parasagun_zyudenchi").AddToKyoryugerZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item stegotchi_zyudenchi = new item_zyudenchi(0,"stegotchi_zyudenchi").AddToKyoryugerZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item zakutor_zyudenchi = new item_zyudenchi(0,"zakutor_zyudenchi").AddToKyoryugerZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item dricera_zyudenchi = new item_zyudenchi(0,"dricera_zyudenchi").AddToKyoryugerZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item pteragordon_zyudenchi = new item_zyudenchi(0,"pteragordon_zyudenchi").AddToKyoryugerZyudenchi(20).setCreativeTab(Tabs.tabKyoryuger);
	public static Item ankydon_zyudenchi = new item_zyudenchi(0,"ankydon_zyudenchi").AddToKyoryugerZyudenchi(20).setCreativeTab(Tabs.tabKyoryuger);
	public static Item bunpachy_zyudenchi = new item_zyudenchi(0,"bunpachy_zyudenchi").AddToKyoryugerZyudenchi(20).setCreativeTab(Tabs.tabKyoryuger);
	public static Item plezuon_zyudenchi = new item_zyudenchi(0,"plezuon_zyudenchi").AddToKyoryugerZyudenchi(20).setCreativeTab(Tabs.tabKyoryuger);
	public static Item bragigas_zyudenchi = new item_zyudenchi(0,"bragigas_zyudenchi").AddToKyoryugerZyudenchi(20).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item guntyra_zyudenchi = new item_zyudenchi("guntyra_zyudenchi").AddToBraveZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item stegonsaw_zyudenchi = new item_zyudenchi("stegonsaw_zyudenchi").AddToBraveZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item shovecera_zyudenchi = new item_zyudenchi("shovecera_zyudenchi").AddToBraveZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item parasaser_zyudenchi = new item_zyudenchi("parasaser_zyudenchi").AddToBraveZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item rapx_zyudenchi = new item_zyudenchi("rapx_zyudenchi").AddToBraveZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item pteravolton_zyudenchi = new item_zyudenchi("pteravolton_zyudenchi").setCreativeTab(Tabs.tabKyoryuger);
	public static Item giga_bragigas_zyudenchi = new item_zyudenchi("giga_bragigas_zyudenchi").AddToBraveZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item carnival_zyudenchi = new item_zyudenchi(4,"carnival_zyudenchi").AddToKyoryugerZyudenchi(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item victory_zyudenchi = new item_zyudenchi("victory_zyudenchi").AddToKyoryugerZyudenchi(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item maximum_zyudenchi = new item_zyudenchi("maximum_zyudenchi").AddToKyoryugerZyudenchi(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item double_gabutyra_zyudenchi = new item_zyudenchi("double_gabutyra_zyudenchi",2).AddToKyoryugerZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	public static Item death_ryuger_zyudenchi = new Item_ore("death_ryuger_zyudenchi").setCreativeTab(Tabs.tabKyoryuger);
	public static Item ghost_stegotchi_zyudenchi = new item_zyudenchi(2,"ghost_stegotchi_zyudenchi").AddToKyoryugerZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	public static Item spirit_pteragordon_zyudenchi = new item_zyudenchi("spirit_pteragordon_zyudenchi",2).AddToKyoryugerZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	public static Item spirit_plezuon_zyudenchi = new item_zyudenchi("spirit_plezuon_zyudenchi",3).AddToKyoryugerZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	public static Item sp_zyudenchi = new item_zyudenchi("sp_zyudenchi").AddToKyoryugerZyudenchi(1).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item deinochaser_zyudenchi = new item_guardian_zyudenchi(1,"deinochaser_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deinosgrander_zyudenchi = new item_zyudenchi("deinosgrander_zyudenchi",1).AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item kentrospiker_zyudenchi = new item_guardian_zyudenchi("kentrospiker_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item stymero_zyudenchi = new item_guardian_zyudenchi(2,"stymero_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item allomerus_zyudenchi = new item_guardian_zyudenchi(3,"allomerus_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item beyonsmo_zyudenchi = new item_guardian_zyudenchi("beyonsmo_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item ovirappoo_zyudenchi = new item_guardian_zyudenchi(4,"ovirappoo_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item igeranodon_zyudenchi = new item_guardian_zyudenchi("igeranodon_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item tuperanda_zyudenchi = new item_guardian_zyudenchi("tuperanda_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gurumonite_zyudenchi = new item_guardian_zyudenchi(5,"gurumonite_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item archenolon_zyudenchi = new item_guardian_zyudenchi(6,"archenolon_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item pukuptor_zyudenchi = new item_guardian_zyudenchi(7,"pukuptor_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item futabain_zyudenchi = new item_guardian_zyudenchi(8,"futabain_zyudenchi").AddToKyoryugerZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item speedrus_zyudenchi = new item_guardian_zyudenchi(9,"speedrus_zyudenchi").AddToBraveZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item prisukeos_zyudenchi = new item_guardian_zyudenchi(10,"prisukeos_zyudenchi").AddToBraveZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item fuwanycto_zyudenchi = new item_guardian_zyudenchi(11,"fuwanycto_zyudenchi").AddToBraveZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item kachicox_zyudenchi = new item_guardian_zyudenchi(12,"kachicox_zyudenchi").AddToBraveZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item karateta_zyudenchi = new item_guardian_zyudenchi(13,"karateta_zyudenchi").AddToBraveZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item taekwondonto_zyudenchi = new item_guardian_zyudenchi(14,"taekwondonto_zyudenchi").AddToBraveZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item deboth_tobaspino_zyudenchi = new item_zyudenchi(0,"deboth_tobaspino_zyudenchi").AddToDebothZyudenchi(5).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_gabutyra_zyudenchi = new item_zyudenchi(1,"deboth_gabutyra_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_parasagun_zyudenchi = new item_zyudenchi(1,"deboth_parasagun_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_stegotchi_zyudenchi = new item_zyudenchi(1,"deboth_stegotchi_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_zakutor_zyudenchi = new item_zyudenchi(1,"deboth_zakutor_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_dricera_zyudenchi = new item_zyudenchi(1,"deboth_dricera_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_pteragordon_zyudenchi = new item_zyudenchi(1,"deboth_pteragordon_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_ankydon_zyudenchi = new item_zyudenchi(0,"deboth_ankydon_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_bunpachy_zyudenchi = new item_zyudenchi(0,"deboth_bunpachy_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_plezuon_zyudenchi = new item_zyudenchi(0,"deboth_plezuon_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_bragigas_zyudenchi = new item_zyudenchi(0,"deboth_bragigas_zyudenchi").AddToDebothZyudenchi(25).setCreativeTab(Tabs.tabKyoryuger);

	public static Item deboth_deinochaser_zyudenchi = new item_guardian_zyudenchi(1,"deboth_deinochaser_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_deinosgrander_zyudenchi = new item_zyudenchi("deboth_deinosgrander_zyudenchi",2).AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_kentrospiker_zyudenchi = new item_guardian_zyudenchi("deboth_kentrospiker_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_stymero_zyudenchi = new item_guardian_zyudenchi(2,"deboth_stymero_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_allomerus_zyudenchi = new item_guardian_zyudenchi(3,"deboth_allomerus_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_beyonsmo_zyudenchi = new item_guardian_zyudenchi("deboth_beyonsmo_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_ovirappoo_zyudenchi = new item_guardian_zyudenchi(4,"deboth_ovirappoo_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_igeranodon_zyudenchi = new item_guardian_zyudenchi("deboth_igeranodon_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_tuperanda_zyudenchi = new item_guardian_zyudenchi("deboth_tuperanda_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_gurumonite_zyudenchi = new item_guardian_zyudenchi(5,"deboth_gurumonite_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_archenolon_zyudenchi = new item_guardian_zyudenchi(6,"deboth_archenolon_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_pukuptor_zyudenchi = new item_guardian_zyudenchi(7,"deboth_pukuptor_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	public static Item deboth_futabain_zyudenchi = new item_guardian_zyudenchi(8,"deboth_futabain_zyudenchi").AddToDebothZyudenchi(10).setCreativeTab(Tabs.tabKyoryuger);
	
	public static Item gaburivolver = new Item_gun("gaburivolver",Tabs.gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabutyra_de_carnival = new Item_gun("gabutyra_de_carnival",Tabs.super_gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gaburichanger = new Item_gun("gaburichanger",Tabs.gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item giga_gaburivolver = new Item_gun("giga_gaburivolver",Tabs.gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabu_gaburivolver = new Item_gun("gabu_gaburivolver",Tabs.gun, SentaiItems40.blank_brave_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabu_gabuchanger = new Item_gun("gabu_gabuchanger",Tabs.gun, SentaiItems40.blank_brave_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gaburicalibur = new ItemBaseSword("gaburicalibur",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gaburu_cannon = new Item_gun("gaburu_cannon",Tabs.super_gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setContainerItem(SentaiItems40.gaburicalibur).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gaburu_cannon_bayonet = new Item_gun("gaburu_cannon_bayonet",Tabs.super_gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setContainerItem(SentaiItems40.gaburicalibur).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gaburi_carnival = new Item_gun("gaburi_carnival",Tabs.hyper_gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setContainerItem(SentaiItems40.gabutyra_de_carnival).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabu_gabucalibur = new ItemBaseSword("gabu_gabucalibur",Tabs.sword,SentaiItems40.blank_brave_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabu_gabucannon = new Item_gun("gabu_gabucannon",Tabs.super_gun, SentaiItems40.blank_brave_zyudenchi).setMaxStackSize(1).setContainerItem(SentaiItems40.gabu_gabucalibur).setCreativeTab(Tabs.tabKyoryuger);
	public static Item gabutyra_fang = new ItemBaseSword("gabutyra_fang",Tabs.tonfa,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item parasa_shot = new Item_gun("parasa_shot",Tabs.gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item stego_shield = new ItemBaseShield("stego_shield",SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item zakutor_slasher = new ItemBaseSword("zakutor_slasher",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item drice_lance = new ItemBaseSword("drice_lance",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item fang_shot = new Item_gun("fang_shot",Tabs.super_gun, SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item shield_lan_slasher = new ItemBaseSword("shield_lan_slasher",Tabs.super_sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item slash_shield_shot = new ItemBaseSword("slash_shield_shot",Tabs.super_sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item kentrospiker = new item_cannon("kentrospiker",Tabs.mecha_sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item zandar_thunder = new ItemBaseSword("zandar_thunder",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item golder_zandar_thunder = new ItemBaseSword("golder_zandar_thunder",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item feather_edge = new ItemBaseSword("feather_edge",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item flute_buster = new item_dual_sword("flute_buster",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item kenka_joutou = new ItemBaseSword("kenka_joutou",Tabs.sword,SentaiItems20.blanknoitem).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	public static Item chaos_calibur = new ItemBaseSword("chaos_calibur",Tabs.sword,SentaiItems40.blank_zyudenchi).setMaxStackSize(1).setCreativeTab(Tabs.tabKyoryuger);
	
	//38 Ressha Sentai ToQger
	public static Item toqger_logo = new Item_ore("toqger_logo").setCreativeTab(Tabs.tabToQger);
	public static Item blank_ressha = new item_toq_ressha(8, 0, "blank_ressha").setCreativeTab(Tabs.tabToQger);
	public static Block toqger_ore = new ore_block("toqger_ore", Material.ROCK, blank_ressha, 2).setHardness(9.9F).setCreativeTab(Tabs.tabToQger);
	
	public static Item toqger_head = new item_sentai_armor("toqger_head", item_toq_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item toqger_torso = new item_sentai_armor("toqger_torso", item_toq_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item toqger_legs = new item_sentai_armor("toqger_legs", item_toq_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);

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
	
	public static Item toq_blaster = new Item_sword_gun("toq_blaster", Tabs.sword_gun,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item rail_slasher = new ItemBaseSword("rail_slasher", Tabs.sword,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item home_trigger = new Item_gun("home_trigger", Tabs.gun,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item shingou_hammer = new ItemBaseSword("shingou_hammer", Tabs.hammer,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item tunnel_axe = new ItemBaseSword("tunnel_axe", Tabs.axe,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item tekkyou_claw = new ItemBaseSword("tekkyou_claw", Tabs.sword,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item yudo_breaker = new ItemBaseSword("yudo_breaker", Tabs.sword,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	public static Item daikaiten_cannon = new Item_gun("daikaiten_cannon", Tabs.super_gun,SentaiItems40.blank_ressha).setMaxStackSize(1).setCreativeTab(Tabs.tabToQger);
	
	//39 Shuriken Sentai Ninninger
	public static Item ninninger_logo = new Item_ore("ninninger_logo").setCreativeTab(Tabs.tabMisc);
	
	//40 Doubutsu Sentai Zyuohger
	public static Item zyuohger_logo = new Item_ore("zyuohger_logo").setCreativeTab(Tabs.tabZyuohger);
	public static Item king_s_credential = new Item_ore("king_s_credential").setCreativeTab(Tabs.tabZyuohger);
	public static Block zyuohger_ore = new ore_block("zyuohger_ore", Material.ROCK, king_s_credential, 2).setHardness(9.9F).setCreativeTab(Tabs.tabZyuohger);
	
	public static Item zyuohger_head = new item_sentai_armor("zyuohger_head", item_zyuoh_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuohger_torso = new item_sentai_armor("zyuohger_torso", item_zyuoh_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuohger_legs = new item_sentai_armor("zyuohger_legs", item_zyuoh_changer.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);

	public static Item eagle_zyuoh_changer = new item_zyuoh_changer("eagle_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_eagle").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item shark_zyuoh_changer = new item_zyuoh_changer("shark_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_shark").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item lion_zyuoh_changer = new item_zyuoh_changer("lion_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_lion").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item elephant_zyuoh_changer = new item_zyuoh_changer("elephant_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_elephant").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item tiger_zyuoh_changer = new item_zyuoh_changer("tiger_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_tiger").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_the_light = new item_zyuoh_changer("zyuoh_the_light", ArmorMaterial.DIAMOND, 4, "zyuoh_the_world").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_changer_final = new item_zyuoh_changer("zyuoh_changer_final", ArmorMaterial.DIAMOND, 4, "zyuoh_bird").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item condor_zyuoh_changer = new item_zyuoh_changer("condor_zyuoh_changer", ArmorMaterial.DIAMOND, 4, "zyuoh_condor").setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	
	public static Item zyuohger_belt = new Item_ore("zyuohger_belt");
	public static Item zyuoh_the_world_belt = new Item_ore("zyuoh_the_world_belt");
	public static Item zyuoh_eagle_wing = new Item_ore("zyuoh_eagle_wing");
	public static Item zyuoh_bird_wing = new Item_ore("zyuoh_bird_wing");
	public static Item zyuoh_condor_wing = new Item_ore("zyuoh_condor_wing");

	public static Item condor_cube = new item_zyuoh_cube(0, "condor_cube").setCreativeTab(Tabs.tabZyuohger);
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
	public static Item eag_riser = new ItemBaseSword("eag_riser", Tabs.sword,SentaiItems40.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item condor_eag_riser = new ItemBaseSword("condor_eag_riser", Tabs.sword,SentaiItems40.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_buster = new Item_sword_gun("zyuoh_buster", Tabs.sword_gun,SentaiItems40.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	public static Item zyuoh_the_rod = new Item_sword_gun("zyuoh_the_rod", Tabs.sword_gun,SentaiItems40.king_s_credential).setMaxStackSize(1).setCreativeTab(Tabs.tabZyuohger);
	
	public static void init() 
	{
		
	}
	
	//public static void init(){}
}