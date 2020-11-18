package SS_Craft.blocks;

import java.util.Random;

import SS_Craft.RiderItems;
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
		
		//01 Goranger
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
		}
		//06 Goggle V
		if (CRYSTAL==RiderItems.goggle_v_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25) return RiderItems.atlantis_ruby;
			if (rand<50) return RiderItems.angkor_wat_emerald;
			if (rand<75) return RiderItems.egypt_saphire;
			if (rand<100) return RiderItems.lemuria_opal;
			if (rand<125) return RiderItems.mayan_diamond;
			return CRYSTAL;
		}
		//10 Flashman
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
		//21 Megaranger
		if (CRYSTAL==RiderItems.megaranger_logo)
		{
			int rand = generator.nextInt(300);
			if (rand<25) return RiderItems.mega_red_disk;
			if (rand<50) return RiderItems.mega_black_disk;
			if (rand<75) return RiderItems.mega_blue_disk;
			if (rand<100) return RiderItems.mega_yellow_disk;
			if (rand<125) return RiderItems.mega_pink_disk;
			if (rand<145) return RiderItems.mega_silver_disk;
			if (rand<150) return RiderItems.mega_tector_disk;
			return CRYSTAL;
		}
		//22 Gingaman
		if (CRYSTAL==RiderItems.gingaman_logo)
		{
			int rand = generator.nextInt(290);
			if (rand<25) return RiderItems.red_ginga_medal;
			if (rand<50) return RiderItems.green_ginga_medal;
			if (rand<75) return RiderItems.blue_ginga_medal;
			if (rand<100) return RiderItems.yellow_ginga_medal;
			if (rand<125) return RiderItems.pink_ginga_medal;
			if (rand<135) return RiderItems.lights_of_ginga;
			if (rand<145) return RiderItems.black_knight_core;
			return CRYSTAL;
		}
		//23 GoGo-V
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
		//25 Gaoranger
		if (CRYSTAL==RiderItems.empty_gao_jewel)
		{
			int rand = generator.nextInt(290);
			if (rand<25) return RiderItems.gao_lion_jewel;
			if (rand<50) return RiderItems.gao_eagle_jewel;
			if (rand<75) return RiderItems.gao_shark_jewel;
			if (rand<100) return RiderItems.gao_bison_jewel;
			if (rand<125) return RiderItems.gao_tiger_jewel;
			if (rand<145) return RiderItems.gao_wolf_jewel;
			return CRYSTAL;
		}
		//27 Abaranger
		if (CRYSTAL==RiderItems.abaranger_logo)
		{
			int rand = generator.nextInt(240);
			if (rand<25) return RiderItems.tyranno_dino_guts;
			if (rand<50) return RiderItems.tricera_dino_guts;
			if (rand<75) return RiderItems.ptera_dino_guts;
			if (rand<95) return RiderItems.brachio_dino_guts;
			if (rand<115) return RiderItems.top_dino_guts;
			if (rand<120) return RiderItems.max_tyranno_dino_guts;
			return CRYSTAL;
		}
		//30 Boukenger
		if (CRYSTAL==RiderItems.boukenger_logo)
		{
			int rand = generator.nextInt(330);
			if (rand<25) return RiderItems.bouken_red_logo;
			if (rand<50) return RiderItems.bouken_black_logo;
			if (rand<75) return RiderItems.bouken_blue_logo;
			if (rand<100) return RiderItems.bouken_yellow_logo;
			if (rand<125) return RiderItems.bouken_pink_logo;
			if (rand<145) return RiderItems.bouken_silver_logo;
			if (rand<155) return RiderItems.scale_of_the_salamander;
			if (rand<165) return RiderItems.zubaan_crystal;
			return CRYSTAL;
		}
		//31 Gekiranger
		if (CRYSTAL==RiderItems.gekiranger_logo)
		{
			int rand = generator.nextInt(350);
			if (rand<25) return RiderItems.tiger_spirit;
			if (rand<50) return RiderItems.cheetah_spirit;
			if (rand<75) return RiderItems.jaguar_spirit;
			if (rand<95) return RiderItems.wolf_spirit;
			if (rand<115) return RiderItems.rhino_spirit;
			if (rand<130) return RiderItems.elephant_spirit;
			if (rand<145) return RiderItems.bat_spirit;
			if (rand<160) return RiderItems.shark_spirit;
			if (rand<165) return RiderItems.gorilla_spirit;
			if (rand<170) return RiderItems.penguin_spirit;
			if (rand<175) return RiderItems.gazelle_spirit;
			return CRYSTAL;
		}
		//32 Go-Onger
		if (CRYSTAL==RiderItems.blank_engine_soul)
		{
			int rand = generator.nextInt(356);
			if (rand<25) return RiderItems.speedor_soul;
			if (rand<50) return RiderItems.buson_soul;
			if (rand<75) return RiderItems.bear_rv_soul;
			if (rand<95) return RiderItems.birca_soul;
			if (rand<115) return RiderItems.gunpherd_soul;
			if (rand<116) return RiderItems.carrigator_soul;
			if (rand<136) return RiderItems.toripter_soul;
			if (rand<156) return RiderItems.jetras_soul;
			if (rand<166) return RiderItems.jumbowhale_soul;
			if (rand<176) return RiderItems.kishamoth_soul;
			if (rand<177) return RiderItems.t_line_soul;
			if (rand<178) return RiderItems.k_line_soul;
			return CRYSTAL;
		}
		//33 Shinkenger
		if (CRYSTAL==RiderItems.common_disk)
		{
			int rand = generator.nextInt(320);
			if (rand<25) return RiderItems.shishi_disk;
			if (rand<50) return RiderItems.ryuu_disk;
			if (rand<75) return RiderItems.kame_disk;
			if (rand<100) return RiderItems.kuma_disk;
			if (rand<125) return RiderItems.saru_disk;
			if (rand<145) return RiderItems.sushi_disk;
			if (rand<155) return RiderItems.super_disk;
			if (rand<160) return RiderItems.hyper_disk;
			return CRYSTAL;
		}
		//36 Go-Busters
		if (CRYSTAL==RiderItems.enetron)
		{
			int rand = generator.nextInt(240);
			if (rand<25) return RiderItems.red_enetron;
			if (rand<50) return RiderItems.blue_enetron;
			if (rand<75) return RiderItems.yellow_enetron;
			if (rand<95) return RiderItems.gold_enetron;
			if (rand<115) return RiderItems.silver_enetron;
			if (rand<120) return RiderItems.custom_visor;
			return CRYSTAL;
		}
		if (CRYSTAL==RiderItems.blank_animal_disk)
		{
			int rand = generator.nextInt(340);
			if (rand<25) return RiderItems.cheetah_animal_disk;
			if (rand<50) return RiderItems.gorilla_animal_disk;
			if (rand<75) return RiderItems.rabbit_animal_disk;
			if (rand<95) return RiderItems.beetle_animal_disk;
			if (rand<115) return RiderItems.stag_animal_disk;
			if (rand<140) return RiderItems.hippopotamus_animal_disk;
			if (rand<165) return RiderItems.puma_animal_disk;
			if (rand<170) return RiderItems.custom_visor;
			return CRYSTAL;
		}
		//38 ToQger
		if (CRYSTAL==RiderItems.blank_ressha)
		{
			int rand = generator.nextInt(382);
			if (rand<25) return RiderItems.red_ressha;
			if (rand<50) return RiderItems.blue_ressha;
			if (rand<75) return RiderItems.yellow_ressha;
			if (rand<100) return RiderItems.green_ressha;
			if (rand<125) return RiderItems.pink_ressha;
			if (rand<145) return RiderItems.build_ressha;
			if (rand<165) return RiderItems.violet_ressha;
			if (rand<170) return RiderItems.hyper_ressha;
			if (rand<171) return RiderItems.red_ressha_corrupted;
			if (rand<186) return RiderItems.scope_ressha;
			if (rand<187) return RiderItems.lion_ressha;
			if (rand<188) return RiderItems.eagle_ressha;
			if (rand<189) return RiderItems.wildcat_ressha;
			if (rand<190) return RiderItems.alligator_ressha;
			if (rand<191) return RiderItems.panda_ressha;
			return CRYSTAL;
		}
		//40 Zyuohger
		if (CRYSTAL==RiderItems.king_s_credential)
		{
			int rand = generator.nextInt(440);
			if (rand<25) return RiderItems.eagle_cube;
			if (rand<50) return RiderItems.shark_cube;
			if (rand<75) return RiderItems.lion_cube;
			if (rand<100) return RiderItems.elephant_cube;
			if (rand<125) return RiderItems.tiger_cube;
			if (rand<135) return RiderItems.gorilla_cube;
			if (rand<155) return RiderItems.crocodile_cube;
			if (rand<175) return RiderItems.wolf_cube;
			if (rand<195) return RiderItems.rhinos_cube;
			if (rand<200) return RiderItems.whale_cube;
			if (rand<215) return RiderItems.bud_king_s_credential;
			if (rand<220) return RiderItems.condor_cube;
			return CRYSTAL;
		}
		//41 Kyuranger
		if (CRYSTAL==RiderItems.blank_kyutama)
		{
			if (this == RiderItems.kyuranger_ore)
			{
				int rand = generator.nextInt(880);
				if (rand<25) return RiderItems.shishi_kyutama;
				if (rand<50) return RiderItems.sasori_kyutama;
				if (rand<75) return RiderItems.ookami_kyutama;
				if (rand<100) return RiderItems.tenbin_kyutama;
				if (rand<125) return RiderItems.oushi_kyutama;
				if (rand<150) return RiderItems.hebitsukai_kyutama;
				if (rand<175) return RiderItems.chameleon_kyutama;
				if (rand<200) return RiderItems.washi_kyutama;
				if (rand<225) return RiderItems.kajiki_kyutama;
				if (rand<235) return RiderItems.orion_kyutama;
				if (rand<245) return RiderItems.hebi_kyutama;
				if (rand<255) return RiderItems.rashinban_kyutama;
				if (rand<265) return RiderItems.uo_kyutama;
				if (rand<275) return RiderItems.ohitsuji_kyutama;
				if (rand<285) return RiderItems.ikkakuju_kyutama;
				if (rand<295) return RiderItems.yagi_kyutama;
				if (rand<305) return RiderItems.kujaku_kyutama;
				if (rand<315) return RiderItems.pegasus_kyutama;
				if (rand<325) return RiderItems.ite_kyutama;
				if (rand<335) return RiderItems.cassiopeia_kyutama;
				if (rand<345) return RiderItems.genbikyo_kyutama;
				if (rand<355) return RiderItems.kirin_kyutama;
				if (rand<365) return RiderItems.jyogi_kyutama;
				if (rand<375) return RiderItems.compass_kyutama;
				if (rand<385) return RiderItems.ooinu_kyutama;
				if (rand<395) return RiderItems.koto_kyutama;
				if (rand<405) return RiderItems.hato_kyutama;
				if (rand<415) return RiderItems.gyosha_kyutama;
				if (rand<425) return RiderItems.koinu_kyutama;
				if (rand<435) return RiderItems.chokokugu_kyutama;
				if (rand<440) return RiderItems.hikari_kyutama_taiyou;
				return CRYSTAL;
			}
			if (this == RiderItems.kyuranger_nether_ore)
			{
				int rand = generator.nextInt(700);
				if (rand<25) return RiderItems.ryu_kyutama;
				if (rand<50) return RiderItems.koguma_kyutama;
				if (rand<60) return RiderItems.tokei_kyutama;
				if (rand<70) return RiderItems.pump_kyutama;
				if (rand<80) return RiderItems.bouenkyou_kyutama;
				if (rand<90) return RiderItems.ooguma_kyutama;
				if (rand<100) return RiderItems.tate_kyutama;
				if (rand<110) return RiderItems.mizugame_kyutama;
				if (rand<120) return RiderItems.kanmuri_kyutama;
				if (rand<130) return RiderItems.kaminoke_kyutama;
				if (rand<140) return RiderItems.perseus_kyutama;
				if (rand<150) return RiderItems.tokage_kyutama;
				if (rand<160) return RiderItems.ryoken_kyutama;
				if (rand<170) return RiderItems.tobiuo_kyutama;
				if (rand<180) return RiderItems.choukokushitsu_kyutama;
				if (rand<190) return RiderItems.saidan_kyutama;
				if (rand<200) return RiderItems.sankaku_kyutama;
				if (rand<210) return RiderItems.hakuchou_kyutama;
				if (rand<220) return RiderItems.gaka_kyutama;
				if (rand<230) return RiderItems.cup_kyutama;
				if (rand<240) return RiderItems.umihebi_kyutama;
				if (rand<250) return RiderItems.fuuchou_kyutama;
				if (rand<260) return RiderItems.kojishi_kyutama;
				if (rand<270) return RiderItems.rokubungi_kyutama;
				if (rand<280) return RiderItems.tsuru_kyutama;
				if (rand<290) return RiderItems.ro_kyutama;
				if (rand<300) return RiderItems.ho_kyutama;
				if (rand<310) return RiderItems.ryukotsu_kyutama;
				if (rand<320) return RiderItems.tomo_kyutama;
				if (rand<325) return RiderItems.hikari_kyutama_tsuki;
				return CRYSTAL;
			}
		}
		
		//42-43 Lupinranger VS Patranger
		if (CRYSTAL==RiderItems.blank_striker)
		{
			int rand = generator.nextInt(506);
			if (rand<25) return RiderItems.red_dial_fighter;
			if (rand<50) return RiderItems.ichigou_trigger_machine;
			if (rand<75) return RiderItems.blue_dial_fighter;
			if (rand<100) return RiderItems.nigou_trigger_machine;
			if (rand<125) return RiderItems.yellow_dial_fighter;
			if (rand<150) return RiderItems.sangou_trigger_machine;
			if (rand<170) return RiderItems.silver_x_train;
			if (rand<190) return RiderItems.gold_x_train;
			if (rand<205) return RiderItems.scissor_dial_fighter;
			if (rand<220) return RiderItems.crane_trigger_machine;
			if (rand<230) return RiderItems.magic_dial_fighter;
			if (rand<240) return RiderItems.splash_trigger_machine;
			if (rand<245) return RiderItems.good_striker;
			if (rand<250) return RiderItems.jackpot_striker;
			if (rand<251) return RiderItems.victory_striker;
			if (rand<252) return RiderItems.siren_striker;
			if (rand<253) return RiderItems.unfinished_lupin_magnum;
			return CRYSTAL;
		}
		//44 Ryusoulger
		if (CRYSTAL==RiderItems.blank_ryusoul)
		{
			int rand = generator.nextInt(946);
			if (rand<25) return RiderItems.red_ryusoul;
			if (rand<50) return RiderItems.blue_ryusoul;
			if (rand<75) return RiderItems.pink_ryusoul;
			if (rand<100) return RiderItems.green_ryusoul;
			if (rand<125) return RiderItems.black_ryusoul;
			if (rand<145) return RiderItems.gold_ryusoul;
			if (rand<165) return RiderItems.blank_ryusoul;
			if (rand<185) return RiderItems.brown_ryusoul;
			if (rand<195) return RiderItems.tsuyo_soul;
			if (rand<205) return RiderItems.nobi_soul;
			if (rand<215) return RiderItems.omo_soul;
			if (rand<225) return RiderItems.haya_soul;
			if (rand<235) return RiderItems.kata_soul;
			if (rand<245) return RiderItems.kike_soul;
			if (rand<255) return RiderItems.kusa_soul;
			if (rand<265) return RiderItems.mie_soul;
			if (rand<275) return RiderItems.mukimuki_soul;
			if (rand<285) return RiderItems.chiisa_soul;
			if (rand<295) return RiderItems.mabushi_soul;
			if (rand<305) return RiderItems.mist_soul;
			if (rand<315) return RiderItems.karu_soul;
			if (rand<325) return RiderItems.gyaku_soul;
			if (rand<335) return RiderItems.kotae_soul;
			if (rand<345) return RiderItems.migake_soul;
			if (rand<355) return RiderItems.kunkun_soul;
			if (rand<365) return RiderItems.pukupuku_soul;
			if (rand<375) return RiderItems.kakure_soul;
			if (rand<385) return RiderItems.fue_soul;
			if (rand<395) return RiderItems.nemu_soul;
			if (rand<405) return RiderItems.mawari_soul;
			if (rand<415) return RiderItems.kawaki_soul;
			if (rand<425) return RiderItems.yawaraka_soul;
			if (rand<430) return RiderItems.meramera_soul;
			if (rand<435) return RiderItems.biribiri_soul;
			if (rand<440) return RiderItems.blank_ryusoul;
			if (rand<445) return RiderItems.kurayami_soul;
			if (rand<450) return RiderItems.kagayaki_soul;
			if (rand<455) return RiderItems.cosmo_soul;
			if (rand<460) return RiderItems.kanae_soul;
			if (rand<465) return RiderItems.dosshin_soul;
			if (rand<470) return RiderItems.hiehie_soul;
			if (rand<471) return RiderItems.max_ryusoul;
			if (rand<472) return RiderItems.shiawase_soul;
			if (rand<473) return RiderItems.yamamori_soul;
			if (rand<474) return RiderItems.unfinished_ryusoul_calibur;
			
			return CRYSTAL;
		}
		//45 Kirameiger
		if (CRYSTAL==RiderItems.blue_diamond)
		{
			int rand = generator.nextInt(290);
			if (rand<25) return RiderItems.red_kiramei_stone;
			if (rand<50) return RiderItems.yellow_kiramei_stone;
			if (rand<75) return RiderItems.green_kiramei_stone;
			if (rand<100) return RiderItems.blue_kiramei_stone;
			if (rand<125) return RiderItems.pink_kiramei_stone;
			if (rand<145) return RiderItems.shiny_kiramei_stone;
			if (rand<146) return RiderItems.destoria_kanaema_stone;
			if (rand<147) return RiderItems.reversia_kanaema_stone;
			if (rand<148) return RiderItems.energia_kanaema_stone;
			
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