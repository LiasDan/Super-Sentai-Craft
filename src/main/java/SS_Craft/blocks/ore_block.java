package SS_Craft.blocks;

import java.util.Random;

import SS_Craft.SentaiItems60;
import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ore_block extends Block implements IHasModel
{
	public Item CRYSTAL;
	
	public ore_block(String string, Material par3Material,Item ore,int lv)
	{
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setTranslationKey(string);
		setRegistryName(string);
		CRYSTAL = ore;

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}
	
	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune)
	{
		Random generator = new Random();
		
/*		//01 Goranger
		if (CRYSTAL==RiderItems.goranger_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.aka_star;
			if (rand<50) return RiderItems.ao_star;
			if (rand<75) return RiderItems.ki_star;
			if (rand<100) return RiderItems.momo_star;
			if (rand<125) return RiderItems.mido_star;
			return CRYSTAL;
		}
		//02 J.A.K.Q.
		if (CRYSTAL==RiderItems.blank_card)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.ace_card;
			if (rand<50) return RiderItems.jack_card;
			if (rand<75) return RiderItems.queen_card;
			if (rand<100) return RiderItems.king_card;
			if (rand<125) return RiderItems.big_one_card;
			return CRYSTAL;
		}
		//03 Battle Fever
		if (CRYSTAL==RiderItems.battle_fever_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.japan_badge;
			if (rand<50) return RiderItems.cossack_badge;
			if (rand<75) return RiderItems.france_badge;
			if (rand<100) return RiderItems.kenya_badge;
			if (rand<125) return RiderItems.america_badge;
			return CRYSTAL;
		}
		//04 Denziman
		if (CRYSTAL==RiderItems.empty_denzi_ring)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.red_denzi_gem;
			if (rand<50) return RiderItems.blue_denzi_gem;
			if (rand<75) return RiderItems.yellow_denzi_gem;
			if (rand<100) return RiderItems.green_denzi_gem;
			if (rand<125) return RiderItems.pink_denzi_gem;
			return CRYSTAL;
		}
		//05 Sun Vulcan
		if (CRYSTAL==RiderItems.sun_vulcan_logo)
		{
			int rand = generator.nextInt(150);
			if (rand<25) return RiderItems.vul_eagle_medal;
			if (rand<50) return RiderItems.vul_shark_medal;
			if (rand<75) return RiderItems.vul_panther_medal;
			return CRYSTAL;
		}*/
		//06 Goggle V
		if (CRYSTAL==SentaiItems20.goggle_v_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return SentaiItems20.atlantis_ruby;
			if (rand<50) return SentaiItems20.angkor_wat_emerald;
			if (rand<75) return SentaiItems20.egypt_saphire;
			if (rand<100) return SentaiItems20.lemuria_opal;
			if (rand<125) return SentaiItems20.mayan_diamond;
			return CRYSTAL;
		}
/*		//10 Flashman
		if (CRYSTAL==RiderItems.flashman_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.red_flash_prism;
			if (rand<50) return RiderItems.green_flash_prism;
			if (rand<75) return RiderItems.blue_flash_prism;
			if (rand<100) return RiderItems.yellow_flash_prism;
			if (rand<125) return RiderItems.pink_flash_prism;
			return CRYSTAL;
		}
		//11 Maskman
		if (CRYSTAL==RiderItems.maskman_logo)
		{
			int rand = generator.nextInt(270);
			if (rand<25) return RiderItems.red_aura_power;
			if (rand<50) return RiderItems.black_aura_power;
			if (rand<75) return RiderItems.blue_aura_power;
			if (rand<100) return RiderItems.yellow_aura_power;
			if (rand<125) return RiderItems.pink_aura_power;
			if (rand<135) return RiderItems.x1_aura_power;
			return CRYSTAL;
		}
		//13 Turboranger
		if (CRYSTAL==RiderItems.turboranger_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.red_turbo_logo;
			if (rand<50) return RiderItems.black_turbo_logo;
			if (rand<75) return RiderItems.blue_turbo_logo;
			if (rand<100) return RiderItems.yellow_turbo_logo;
			if (rand<125) return RiderItems.pink_turbo_logo;
			return CRYSTAL;
		}
		//15 Jetman
		if (CRYSTAL==RiderItems.birdonic_wave)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.hawk_birdonic_wave;
			if (rand<50) return RiderItems.condor_birdonic_wave;
			if (rand<75) return RiderItems.owl_birdonic_wave;
			if (rand<100) return RiderItems.swan_birdonic_wave;
			if (rand<125) return RiderItems.swallow_birdonic_wave;
			return CRYSTAL; 
		}
		//16 Zyuranger
		if (CRYSTAL==RiderItems.zyuranger_medal)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.tyranno_medal;
			if (rand<50) return RiderItems.mammoth_medal;
			if (rand<75) return RiderItems.tricera_medal;
			if (rand<100) return RiderItems.tiger_medal;
			if (rand<125) return RiderItems.ptera_medal;
			return CRYSTAL; 
		}
		//17 Dairanger
		if (CRYSTAL==RiderItems.dairanger_logo)
		{
			int rand = generator.nextInt(290);
			if (rand<25) return RiderItems.red_lailai_jewel;
			if (rand<50) return RiderItems.green_lailai_jewel;
			if (rand<75) return RiderItems.blue_lailai_jewel;
			if (rand<100) return RiderItems.yellow_lailai_jewel;
			if (rand<125) return RiderItems.pink_lailai_jewel;
			if (rand<145) return RiderItems.white_lailai_jewel;
			return CRYSTAL;
		}
		//20 Carranger
		if (CRYSTAL==RiderItems.carranger_logo)
		{
			int rand = generator.nextInt(290);
			if (rand<25) return RiderItems.red_racer_badge;
			if (rand<50) return RiderItems.blue_racer_badge;
			if (rand<75) return RiderItems.green_racer_badge;
			if (rand<100) return RiderItems.yellow_racer_badge;
			if (rand<125) return RiderItems.pink_racer_badge;
			if (rand<135) return RiderItems.white_racer_badge;
			if (rand<145) return RiderItems.signalman_badge;
			return CRYSTAL;
		}
*/		//21 Megaranger
		if (CRYSTAL==SentaiItems40.megaranger_logo)
		{
			int rand = generator.nextInt(300);
			if (rand<25) return SentaiItems40.mega_red_disk;
			if (rand<50) return SentaiItems40.mega_black_disk;
			if (rand<75) return SentaiItems40.mega_blue_disk;
			if (rand<100) return SentaiItems40.mega_yellow_disk;
			if (rand<125) return SentaiItems40.mega_pink_disk;
			if (rand<145) return SentaiItems40.mega_silver_disk;
			if (rand<150) return SentaiItems40.mega_tector_disk;
			return CRYSTAL;
		}
		//22 Gingaman
		if (CRYSTAL==SentaiItems40.gingaman_logo)
		{
			int rand = generator.nextInt(290);
			if (rand<25) return SentaiItems40.red_ginga_medal;
			if (rand<50) return SentaiItems40.green_ginga_medal;
			if (rand<75) return SentaiItems40.blue_ginga_medal;
			if (rand<100) return SentaiItems40.yellow_ginga_medal;
			if (rand<125) return SentaiItems40.pink_ginga_medal;
			if (rand<135) return SentaiItems40.lights_of_ginga;
			if (rand<145) return SentaiItems40.black_knight_core;
			return CRYSTAL;
		}
/*		//23 GoGo-V
		if (CRYSTAL==RiderItems.gogo_v_logo)
		{
			int rand = generator.nextInt(270);
			if (rand<25) return RiderItems.go_red_badge;
			if (rand<50) return RiderItems.go_blue_badge;
			if (rand<75) return RiderItems.go_green_badge;
			if (rand<100) return RiderItems.go_yellow_badge;
			if (rand<125) return RiderItems.go_pink_badge;
			if (rand<135) return RiderItems.zeek_fragment;
			return CRYSTAL;
		}
*/		//25 Gaoranger
		if (CRYSTAL==SentaiItems40.empty_gao_jewel)
		{
			int rand = generator.nextInt(466);
			if (rand<25) return SentaiItems40.gao_lion_jewel;
			if (rand<50) return SentaiItems40.gao_eagle_jewel;
			if (rand<75) return SentaiItems40.gao_shark_jewel;
			if (rand<100) return SentaiItems40.gao_bison_jewel;
			if (rand<125) return SentaiItems40.gao_tiger_jewel;
			if (rand<140) return SentaiItems40.gao_elephant_jewel;
			if (rand<155) return SentaiItems40.gao_giraffe_jewel;
			if (rand<170) return SentaiItems40.gao_bear_jewel;
			if (rand<185) return SentaiItems40.gao_polar_jewel;
			if (rand<195) return SentaiItems40.gao_gorilla_jewel;
			if (rand<205) return SentaiItems40.gao_rhinos_jewel;
			if (rand<215) return SentaiItems40.gao_madillo_jewel;
			if (rand<225) return SentaiItems40.gao_deers_jewel;
			if (rand<230) return SentaiItems40.gao_falcon_jewel;
			if (rand<231) return SentaiItems40.gao_kong_jewel;
			if (rand<232) return SentaiItems40.gao_panda_jewel;
			if (rand<233) return SentaiItems40.gao_ape_jewel;
			return CRYSTAL;
		}
		//27 Abaranger
		if (CRYSTAL==SentaiItems40.abaranger_logo)
		{
			int rand = generator.nextInt(440);
			if (rand<25) return SentaiItems40.tyranno_dino_guts;
			if (rand<50) return SentaiItems40.tricera_dino_guts;
			if (rand<75) return SentaiItems40.ptera_dino_guts;
			if (rand<95) return SentaiItems40.brachio_dino_guts;
			if (rand<115) return SentaiItems40.top_dino_guts;
			if (rand<120) return SentaiItems40.max_tyranno_dino_guts;
			if (rand<135) return SentaiItems40.bachycelo_dino_guts;
			if (rand<150) return SentaiItems40.dimenoko_dino_guts;
			if (rand<165) return SentaiItems40.stego_dino_guts;
			if (rand<180) return SentaiItems40.parasa_dino_guts;
			if (rand<195) return SentaiItems40.ankylo_dino_guts;
			if (rand<200) return SentaiItems40.firenoko_dino_guts;
			if (rand<205) return SentaiItems40.carno_dino_guts;
			if (rand<210) return SentaiItems40.chasmo_dino_guts;
			if (rand<215) return SentaiItems40.max_tricera_dino_guts;
			if (rand<220) return SentaiItems40.max_ptera_dino_guts;
			return CRYSTAL;
		}
		//28 Dekaranger
		if (CRYSTAL==SentaiItems40.dekaranger_badge)
		{
			if (this == SentaiItems40.dekaranger_ore)
			{
				int rand = generator.nextInt(370);
				if (rand<25) return SentaiItems40.deka_red_badge;
				if (rand<50) return SentaiItems40.deka_blue_badge;
				if (rand<75) return SentaiItems40.deka_green_badge;
				if (rand<100) return SentaiItems40.deka_yellow_badge;
				if (rand<125) return SentaiItems40.deka_pink_badge;
				if (rand<145) return SentaiItems40.deka_break_badge;
				if (rand<165) return SentaiItems40.deka_master_badge;
				if (rand<185) return SentaiItems40.deka_swan_badge;
				return CRYSTAL;
			}
			if (this == SentaiItems40.dekaranger_nether_ore)
			{
				int rand = generator.nextInt(200);
				if (rand<20) return SentaiItems40.deka_bright_badge;
				if (rand<40) return SentaiItems40.deka_gold_badge;
				if (rand<50) return SentaiItems40.deka_red_swat_badge;
				if (rand<60) return SentaiItems40.deka_blue_swat_badge;
				if (rand<70) return SentaiItems40.deka_green_swat_badge;
				if (rand<80) return SentaiItems40.deka_yellow_swat_badge;
				if (rand<90) return SentaiItems40.deka_pink_swat_badge;
				if (rand<95) return SentaiItems40.deka_red_fire_squad_badge;
				if (rand<100) return SentaiItems40.deka_red_battlizer_badge;
				return CRYSTAL;
			}
		}
		//30 Boukenger
		if (CRYSTAL==SentaiItems40.boukenger_logo)
		{
			int rand = generator.nextInt(330);
			if (rand<25) return SentaiItems40.bouken_red_logo;
			if (rand<50) return SentaiItems40.bouken_black_logo;
			if (rand<75) return SentaiItems40.bouken_blue_logo;
			if (rand<100) return SentaiItems40.bouken_yellow_logo;
			if (rand<125) return SentaiItems40.bouken_pink_logo;
			if (rand<145) return SentaiItems40.bouken_silver_logo;
			if (rand<155) return SentaiItems40.scale_of_the_salamander;
			if (rand<165) return SentaiItems40.zubaan_crystal;
			return CRYSTAL;
		}
		//31 Gekiranger
		if (CRYSTAL==SentaiItems40.gekiranger_logo)
		{
			int rand = generator.nextInt(350);
			if (rand<25) return SentaiItems40.tiger_spirit;
			if (rand<50) return SentaiItems40.cheetah_spirit;
			if (rand<75) return SentaiItems40.jaguar_spirit;
			if (rand<95) return SentaiItems40.wolf_spirit;
			if (rand<115) return SentaiItems40.rhino_spirit;
			if (rand<130) return SentaiItems40.elephant_spirit;
			if (rand<145) return SentaiItems40.bat_spirit;
			if (rand<160) return SentaiItems40.shark_spirit;
			if (rand<165) return SentaiItems40.gorilla_spirit;
			if (rand<170) return SentaiItems40.penguin_spirit;
			if (rand<175) return SentaiItems40.gazelle_spirit;
			return CRYSTAL;
		}
		//32 Go-Onger
		if (CRYSTAL==SentaiItems40.blank_engine_soul)
		{
			int rand = generator.nextInt(402);
			if (rand<25) return SentaiItems40.speedor_soul;
			if (rand<50) return SentaiItems40.buson_soul;
			if (rand<75) return SentaiItems40.bear_rv_soul;
			if (rand<95) return SentaiItems40.birca_soul;
			if (rand<115) return SentaiItems40.gunpherd_soul;
			if (rand<130) return SentaiItems40.carrigator_soul;
			if (rand<150) return SentaiItems40.toripter_soul;
			if (rand<170) return SentaiItems40.jetras_soul;
			if (rand<180) return SentaiItems40.jumbowhale_soul;
			if (rand<185) return SentaiItems40.kishamoth_soul;
			if (rand<190) return SentaiItems40.t_line_soul;
			if (rand<195) return SentaiItems40.k_line_soul;
			if (rand<200) return SentaiItems40.daishogun_soul;
			if (rand<201) return SentaiItems40.skydor_soul;
			return CRYSTAL;
		}
		//33 Shinkenger
		if (CRYSTAL==SentaiItems40.common_disk)
		{
			int rand = generator.nextInt(320);
			if (rand<25) return SentaiItems40.shishi_disk;
			if (rand<50) return SentaiItems40.ryuu_disk;
			if (rand<75) return SentaiItems40.kame_disk;
			if (rand<100) return SentaiItems40.kuma_disk;
			if (rand<125) return SentaiItems40.saru_disk;
			if (rand<145) return SentaiItems40.sushi_disk;
			if (rand<155) return SentaiItems40.super_disk;
			if (rand<160) return SentaiItems40.hyper_disk;
			return CRYSTAL;
		}
		//36 Go-Busters
		if (CRYSTAL==SentaiItems40.enetron)
		{
			int rand = generator.nextInt(240);
			if (rand<25) return SentaiItems40.red_enetron;
			if (rand<50) return SentaiItems40.blue_enetron;
			if (rand<75) return SentaiItems40.yellow_enetron;
			if (rand<95) return SentaiItems40.gold_enetron;
			if (rand<115) return SentaiItems40.silver_enetron;
			if (rand<120) return SentaiItems40.custom_visor;
			return CRYSTAL;
		}
		if (CRYSTAL==SentaiItems40.blank_animal_disk)
		{
			int rand = generator.nextInt(340);
			if (rand<25) return SentaiItems40.cheetah_animal_disk;
			if (rand<50) return SentaiItems40.gorilla_animal_disk;
			if (rand<75) return SentaiItems40.rabbit_animal_disk;
			if (rand<95) return SentaiItems40.beetle_animal_disk;
			if (rand<115) return SentaiItems40.stag_animal_disk;
			if (rand<140) return SentaiItems40.hippopotamus_animal_disk;
			if (rand<165) return SentaiItems40.puma_animal_disk;
			if (rand<170) return SentaiItems40.custom_visor;
			return CRYSTAL;
		}
		//38 ToQger
		if (CRYSTAL==SentaiItems40.blank_ressha)
		{
			int rand = generator.nextInt(382);
			if (rand<25) return SentaiItems40.red_ressha;
			if (rand<50) return SentaiItems40.blue_ressha;
			if (rand<75) return SentaiItems40.yellow_ressha;
			if (rand<100) return SentaiItems40.green_ressha;
			if (rand<125) return SentaiItems40.pink_ressha;
			if (rand<145) return SentaiItems40.build_ressha;
			if (rand<165) return SentaiItems40.violet_ressha;
			if (rand<170) return SentaiItems40.hyper_ressha;
			if (rand<171) return SentaiItems40.red_ressha_corrupted;
			if (rand<186) return SentaiItems40.scope_ressha;
			if (rand<187) return SentaiItems40.lion_ressha;
			if (rand<188) return SentaiItems40.eagle_ressha;
			if (rand<189) return SentaiItems40.wildcat_ressha;
			if (rand<190) return SentaiItems40.alligator_ressha;
			if (rand<191) return SentaiItems40.panda_ressha;
			return CRYSTAL;
		}
		//40 Zyuohger
		if (CRYSTAL==SentaiItems40.king_s_credential)
		{
			int rand = generator.nextInt(440);
			if (rand<25) return SentaiItems40.eagle_cube;
			if (rand<50) return SentaiItems40.shark_cube;
			if (rand<75) return SentaiItems40.lion_cube;
			if (rand<100) return SentaiItems40.elephant_cube;
			if (rand<125) return SentaiItems40.tiger_cube;
			if (rand<135) return SentaiItems40.gorilla_cube;
			if (rand<155) return SentaiItems40.crocodile_cube;
			if (rand<175) return SentaiItems40.wolf_cube;
			if (rand<195) return SentaiItems40.rhinos_cube;
			if (rand<200) return SentaiItems40.whale_cube;
			if (rand<215) return SentaiItems40.bud_king_s_credential;
			if (rand<220) return SentaiItems40.condor_cube;
			return CRYSTAL;
		}
		//41 Kyuranger
		if (CRYSTAL==SentaiItems60.blank_kyutama)
		{
			if (this == SentaiItems60.kyuranger_ore)
			{
				int rand = generator.nextInt(880);
				if (rand<25) return SentaiItems60.shishi_kyutama;
				if (rand<50) return SentaiItems60.sasori_kyutama;
				if (rand<75) return SentaiItems60.ookami_kyutama;
				if (rand<100) return SentaiItems60.tenbin_kyutama;
				if (rand<125) return SentaiItems60.oushi_kyutama;
				if (rand<150) return SentaiItems60.hebitsukai_kyutama;
				if (rand<175) return SentaiItems60.chameleon_kyutama;
				if (rand<200) return SentaiItems60.washi_kyutama;
				if (rand<225) return SentaiItems60.kajiki_kyutama;
				if (rand<235) return SentaiItems60.orion_kyutama;
				if (rand<245) return SentaiItems60.hebi_kyutama;
				if (rand<255) return SentaiItems60.rashinban_kyutama;
				if (rand<265) return SentaiItems60.uo_kyutama;
				if (rand<275) return SentaiItems60.ohitsuji_kyutama;
				if (rand<285) return SentaiItems60.ikkakuju_kyutama;
				if (rand<295) return SentaiItems60.yagi_kyutama;
				if (rand<305) return SentaiItems60.kujaku_kyutama;
				if (rand<315) return SentaiItems60.pegasus_kyutama;
				if (rand<325) return SentaiItems60.ite_kyutama;
				if (rand<335) return SentaiItems60.cassiopeia_kyutama;
				if (rand<345) return SentaiItems60.genbikyo_kyutama;
				if (rand<355) return SentaiItems60.kirin_kyutama;
				if (rand<365) return SentaiItems60.jyogi_kyutama;
				if (rand<375) return SentaiItems60.compass_kyutama;
				if (rand<385) return SentaiItems60.ooinu_kyutama;
				if (rand<395) return SentaiItems60.koto_kyutama;
				if (rand<405) return SentaiItems60.hato_kyutama;
				if (rand<415) return SentaiItems60.gyosha_kyutama;
				if (rand<425) return SentaiItems60.koinu_kyutama;
				if (rand<435) return SentaiItems60.chokokugu_kyutama;
				if (rand<440) return SentaiItems60.hikari_kyutama_taiyou;
				return CRYSTAL;
			}
			if (this == SentaiItems60.kyuranger_nether_ore)
			{
				int rand = generator.nextInt(700);
				if (rand<25) return SentaiItems60.ryu_kyutama;
				if (rand<50) return SentaiItems60.koguma_kyutama;
				if (rand<60) return SentaiItems60.tokei_kyutama;
				if (rand<70) return SentaiItems60.pump_kyutama;
				if (rand<80) return SentaiItems60.bouenkyou_kyutama;
				if (rand<90) return SentaiItems60.ooguma_kyutama;
				if (rand<100) return SentaiItems60.tate_kyutama;
				if (rand<110) return SentaiItems60.mizugame_kyutama;
				if (rand<120) return SentaiItems60.kanmuri_kyutama;
				if (rand<130) return SentaiItems60.kaminoke_kyutama;
				if (rand<140) return SentaiItems60.perseus_kyutama;
				if (rand<150) return SentaiItems60.tokage_kyutama;
				if (rand<160) return SentaiItems60.ryoken_kyutama;
				if (rand<170) return SentaiItems60.tobiuo_kyutama;
				if (rand<180) return SentaiItems60.choukokushitsu_kyutama;
				if (rand<190) return SentaiItems60.saidan_kyutama;
				if (rand<200) return SentaiItems60.sankaku_kyutama;
				if (rand<210) return SentaiItems60.hakuchou_kyutama;
				if (rand<220) return SentaiItems60.gaka_kyutama;
				if (rand<230) return SentaiItems60.cup_kyutama;
				if (rand<240) return SentaiItems60.umihebi_kyutama;
				if (rand<250) return SentaiItems60.fuuchou_kyutama;
				if (rand<260) return SentaiItems60.kojishi_kyutama;
				if (rand<270) return SentaiItems60.rokubungi_kyutama;
				if (rand<280) return SentaiItems60.tsuru_kyutama;
				if (rand<290) return SentaiItems60.ro_kyutama;
				if (rand<300) return SentaiItems60.ho_kyutama;
				if (rand<310) return SentaiItems60.ryukotsu_kyutama;
				if (rand<320) return SentaiItems60.tomo_kyutama;
				if (rand<325) return SentaiItems60.hikari_kyutama_tsuki;
				return CRYSTAL;
			}
		}
		
		//42 Lupinranger VS Patranger
		if (CRYSTAL==SentaiItems60.blank_striker)
		{
			int rand = generator.nextInt(506);
			if (rand<25) return SentaiItems60.red_dial_fighter;
			if (rand<50) return SentaiItems60.ichigou_trigger_machine;
			if (rand<75) return SentaiItems60.blue_dial_fighter;
			if (rand<100) return SentaiItems60.nigou_trigger_machine;
			if (rand<125) return SentaiItems60.yellow_dial_fighter;
			if (rand<150) return SentaiItems60.sangou_trigger_machine;
			if (rand<170) return SentaiItems60.silver_x_train;
			if (rand<190) return SentaiItems60.gold_x_train;
			if (rand<205) return SentaiItems60.scissor_dial_fighter;
			if (rand<220) return SentaiItems60.crane_trigger_machine;
			if (rand<230) return SentaiItems60.magic_dial_fighter;
			if (rand<240) return SentaiItems60.splash_trigger_machine;
			if (rand<245) return SentaiItems60.good_striker;
			if (rand<250) return SentaiItems60.jackpot_striker;
			if (rand<251) return SentaiItems60.victory_striker;
			if (rand<252) return SentaiItems60.siren_striker;
			if (rand<253) return SentaiItems60.unfinished_lupin_magnum;
			return CRYSTAL;
		}
		//43 Ryusoulger
		if (CRYSTAL==SentaiItems60.blank_ryusoul)
		{
			int rand = generator.nextInt(908);
			if (rand<25) return SentaiItems60.red_ryusoul;
			if (rand<50) return SentaiItems60.blue_ryusoul;
			if (rand<75) return SentaiItems60.pink_ryusoul;
			if (rand<100) return SentaiItems60.green_ryusoul;
			if (rand<125) return SentaiItems60.black_ryusoul;
			if (rand<145) return SentaiItems60.gold_ryusoul;
			if (rand<165) return SentaiItems60.brown_ryusoul;
			if (rand<175) return SentaiItems60.tsuyo_soul;
			if (rand<185) return SentaiItems60.nobi_soul;
			if (rand<195) return SentaiItems60.omo_soul;
			if (rand<205) return SentaiItems60.haya_soul;
			if (rand<215) return SentaiItems60.kata_soul;
			if (rand<225) return SentaiItems60.kike_soul;
			if (rand<235) return SentaiItems60.kusa_soul;
			if (rand<245) return SentaiItems60.mie_soul;
			if (rand<255) return SentaiItems60.mukimuki_soul;
			if (rand<265) return SentaiItems60.chiisa_soul;
			if (rand<275) return SentaiItems60.mabushi_soul;
			if (rand<285) return SentaiItems60.mist_soul;
			if (rand<295) return SentaiItems60.karu_soul;
			if (rand<305) return SentaiItems60.gyaku_soul;
			if (rand<315) return SentaiItems60.kotae_soul;
			if (rand<325) return SentaiItems60.migake_soul;
			if (rand<335) return SentaiItems60.kunkun_soul;
			if (rand<345) return SentaiItems60.pukupuku_soul;
			if (rand<355) return SentaiItems60.kakure_soul;
			if (rand<365) return SentaiItems60.fue_soul;
			if (rand<375) return SentaiItems60.nemu_soul;
			if (rand<385) return SentaiItems60.mawari_soul;
			if (rand<395) return SentaiItems60.kawaki_soul;
			if (rand<405) return SentaiItems60.yawaraka_soul;
			if (rand<410) return SentaiItems60.meramera_soul;
			if (rand<415) return SentaiItems60.biribiri_soul;
			if (rand<420) return SentaiItems60.blank_ryusoul;
			if (rand<425) return SentaiItems60.kurayami_soul;
			if (rand<430) return SentaiItems60.kagayaki_soul;
			if (rand<435) return SentaiItems60.cosmo_soul;
			if (rand<440) return SentaiItems60.kanae_soul;
			if (rand<445) return SentaiItems60.dosshin_soul;
			if (rand<450) return SentaiItems60.hiehie_soul;
			if (rand<451) return SentaiItems60.max_ryusoul;
			if (rand<452) return SentaiItems60.shiawase_soul;
			if (rand<453) return SentaiItems60.yamamori_soul;
			if (rand<454) return SentaiItems60.unfinished_ryusoul_calibur;
			
			return CRYSTAL;
		}
		//44 Kirameiger
		if (CRYSTAL==SentaiItems60.blue_diamond)
		{
			int rand = generator.nextInt(300);
			if (rand<25) return SentaiItems60.red_kiramei_stone;
			if (rand<50) return SentaiItems60.yellow_kiramei_stone;
			if (rand<75) return SentaiItems60.green_kiramei_stone;
			if (rand<100) return SentaiItems60.blue_kiramei_stone;
			if (rand<125) return SentaiItems60.pink_kiramei_stone;
			if (rand<145) return SentaiItems60.shiny_kiramei_stone;
			if (rand<146) return SentaiItems60.destoria_kanaema_stone;
			if (rand<147) return SentaiItems60.reversia_kanaema_stone;
			if (rand<148) return SentaiItems60.energia_kanaema_stone;
			if (rand<149) return SentaiItems60.illusia_kanaema_stone;
			if (rand<150) return SentaiItems60.gold_kiramei_stone;
			
			return CRYSTAL;
		}
		//45 Zenkaiger
		if (CRYSTAL==SentaiItems60.blank_sentai_gear)
		{
			int rand = generator.nextInt(518);
			if (rand<25) return SentaiItems60.zenkaizer_gear;
			if (rand<50) return SentaiItems60.zenkai_juran_gear;
			if (rand<75) return SentaiItems60.zenkai_gaon_gear;
			if (rand<100) return SentaiItems60.zenkai_magine_gear;
			if (rand<125) return SentaiItems60.zenkai_vroon_gear;
			if (rand<145) return SentaiItems60.twokaizer_gear;
			if (rand<160) return SentaiItems60.twokai_cutanner_gear;
			if (rand<175) return SentaiItems60.twokai_ricky_gear;
			if (rand<185) return SentaiItems60.zenkai_red_gear;
			if (rand<195) return SentaiItems60.twokai_flint_gear;
			if (rand<200) return SentaiItems20.liveman_logo;
			if (rand<205) return SentaiItems20.ohranger_logo;
			if (rand<210) return SentaiItems40.timeranger_logo;
			if (rand<215) return SentaiItems40.magiranger_logo;
			if (rand<220) return SentaiItems40.goseiger_logo;
			if (rand<225) return SentaiItems20.dynaman_logo;
			if (rand<230) return SentaiItems20.changeman_logo;
			if (rand<235) return SentaiItems20.fiveman_logo;
			if (rand<240) return SentaiItems40.hurricaneger_logo;
			if (rand<245) return SentaiItems40.ninninger_logo;
			if (rand<250) return SentaiItems40.gokaiger_logo;
			if (rand<251) return SentaiItems60.metallic_zenkaizer_gear;
			if (rand<252) return SentaiItems60.metallic_zenkai_juran_gear;
			if (rand<253) return SentaiItems60.metallic_zenkai_gaon_gear;
			if (rand<254) return SentaiItems60.metallic_zenkai_magine_gear;
			if (rand<255) return SentaiItems60.metallic_zenkai_vroon_gear;
			if (rand<256) return SentaiItems60.metallic_twokaizer_gear;
			if (rand<257) return SentaiItems60.zenkai_zyu_gear;
			if (rand<258) return SentaiItems60.new_zenkaizer_gear;
			if (rand<259) return SentaiItems60.don_brothers_gear;
			
			return CRYSTAL;
		}
		
		return CRYSTAL;
	}

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}

	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
}