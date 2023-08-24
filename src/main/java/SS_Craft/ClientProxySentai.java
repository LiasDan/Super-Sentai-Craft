package SS_Craft;


import com.jcraft.jorbis.Block;

import SS_Craft.mobs.RenderRiderMob;
import SS_Craft.mobs.RenderRiderMob2;
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
import SS_Craft.model.model_deinochaser;
import SS_Craft.model.model_garu_bike;
import SS_Craft.model.tokuMobModel;
import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxySentai extends CommonProxySentai
{
	@Override
	public void registerRenderThings()
	{
		//01 Goranger
		RenderingRegistry.registerEntityRenderingHandler(entity_zolders.class, new RenderRiderMob2(new tokuMobModel("zolder_2"), 0.5F,"textures/entities/zolder_1.png"));
	
		//02 J.A.K.Q.
		RenderingRegistry.registerEntityRenderingHandler(entity_crimers.class, new RenderRiderMob2(new tokuMobModel("crimer_2"), 0.5F,"textures/entities/crimer_1.png"));
		
		//03 Battle Fever
		RenderingRegistry.registerEntityRenderingHandler(entity_cutmen.class, new RenderRiderMob2(new tokuMobModel("cutman_2"), 0.5F,"textures/entities/cutman_1.png"));
		
		//04 Denziman
		RenderingRegistry.registerEntityRenderingHandler(entity_dustlers.class, new RenderRiderMob2(new tokuMobModel("dustler_2"), 0.5F,"textures/entities/dustler_1.png"));
		
		//05 Sun Vulcan
		RenderingRegistry.registerEntityRenderingHandler(entity_machinemen.class, new RenderRiderMob2(new tokuMobModel("machineman_2"), 0.5F,"textures/entities/machineman_1.png"));

		//06 Goggle V
		RenderingRegistry.registerEntityRenderingHandler(entity_spotmen.class, new RenderRiderMob2(new tokuMobModel("spotman_2"), 0.5F,"textures/entities/spotman_1.png"));
			
		//08 Bioman
		RenderingRegistry.registerEntityRenderingHandler(entity_mechaclones.class, new RenderRiderMob2(new tokuMobModel("mechaclone_2"), 0.5F,"textures/entities/mechaclone_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_bio_hunter_silva.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_bio_hunter_silva.png"));

		//10 Flashman
		RenderingRegistry.registerEntityRenderingHandler(entity_zolohs.class, new RenderRiderMob2(new tokuMobModel("zolohs_2"), 0.5F,"textures/entities/zolohs_1.png"));
		
		//11 Maskman
		RenderingRegistry.registerEntityRenderingHandler(entity_unglers.class, new RenderRiderMob2(new tokuMobModel("ungler_2"), 0.5F,"textures/entities/ungler_1.png"));
		
		//12 Liveman
		RenderingRegistry.registerEntityRenderingHandler(entity_jimmers.class, new RenderRiderMob2(new tokuMobModel("jimmer_2"), 0.5F,"textures/entities/jimmer_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_doctor_kemp.class, new RenderRiderMob2(new tokuMobModel("doctor_kemp_2"), 0.5F,"textures/entities/doctor_kemp_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_doctor_mazenda.class, new RenderRiderMob2(new tokuMobModel("doctor_mazenda_2"), 0.5F,"textures/entities/doctor_mazenda_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_doctor_obular.class, new RenderRiderMob2(new tokuMobModel("doctor_obular_2"), 0.5F,"textures/entities/doctor_obular_1.png"));
		
		//13 Turboranger
		RenderingRegistry.registerEntityRenderingHandler(entity_ulars.class, new RenderRiderMob2(new tokuMobModel("ular_2"), 0.5F,"textures/entities/ular_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ular_captain.class, new RenderRiderMob2(new tokuMobModel("ular_captain_2"), 0.5F,"textures/entities/ular_captain_1.png"));

		//15 Jetman
		RenderingRegistry.registerEntityRenderingHandler(entity_grinams.class, new RenderRiderMob2(new tokuMobModel("grinam_2"), 0.5F,"textures/entities/grinam_1.png"));
		
		//16 Zyuranger
		RenderingRegistry.registerEntityRenderingHandler(entity_golems1.class, new RenderRiderMob2(new tokuMobModel("golem1_2"), 0.5F,"textures/entities/golem1_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_golems2.class, new RenderRiderMob2(new tokuMobModel("golem2_2"), 0.5F,"textures/entities/golem2_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_dora_sphinx.class, new RenderRiderMob2(new tokuMobModel("dora_sphinx_2"), 0.5F,"textures/entities/dora_sphinx_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_pumpkin_rapper.class, new RenderRiderMob2(new tokuMobModel("pumpkin_rapper_2"), 0.5F,"textures/entities/pumpkin_rapper_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_dragon_ranger.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_dragon_ranger.png"));
		
		//17 Dairanger
		RenderingRegistry.registerEntityRenderingHandler(entity_cotpotros.class, new RenderRiderMob2(new tokuMobModel("cotpotro_2"), 0.5F,"textures/entities/cotpotro_1.png"));

		//18 Kakuranger
		RenderingRegistry.registerEntityRenderingHandler(entity_dorodoros.class, new RenderRiderMob2(new tokuMobModel("dorodoro_2"), 0.5F,"textures/entities/dorodoro_1.png"));

		//20 Carranger
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_blue.class, new RenderRiderMob2(new tokuMobModel("wumper_blue_2"), 0.5F,"textures/entities/wumper_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_pink.class, new RenderRiderMob2(new tokuMobModel("wumper_pink_2"), 0.5F,"textures/entities/wumper_pink_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_green.class, new RenderRiderMob2(new tokuMobModel("wumper_green_2"), 0.5F,"textures/entities/wumper_green_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_white.class, new RenderRiderMob2(new tokuMobModel("wumper_white_2"), 0.5F,"textures/entities/wumper_white_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_signalman_evil.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_signalman.png"));
		
		//21 Megaranger
		RenderingRegistry.registerEntityRenderingHandler(entity_kunekunes.class, new RenderRiderMob2(new tokuMobModel("kunekune_2"), 0.5F,"textures/entities/kunekune_1.png"));

		//22 Gingaman
		RenderingRegistry.registerEntityRenderingHandler(entity_yartots.class, new RenderRiderMob2(new tokuMobModel("yartots_2"), 0.5F,"textures/entities/yartots_1.png"));

		//23 GoGo-V
		RenderingRegistry.registerEntityRenderingHandler(entity_imps.class, new RenderRiderMob2(new tokuMobModel("imps_2"), 0.5F,"textures/entities/imps_1.png"));

		//25 Gaoranger
		RenderingRegistry.registerEntityRenderingHandler(entity_orgettes.class, new RenderRiderMob2(new tokuMobModel("orgettes_2"), 0.5F,"textures/entities/orgettes_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_rouki.class, new RenderRiderMob2(new tokuMobModel("rouki_2"), 0.5F,"textures/entities/rouki_1.png"));
		
		//27 Abaranger
		RenderingRegistry.registerEntityRenderingHandler(entity_barmias_black.class, new RenderRiderMob2(new tokuMobModel("barmia_black_2"), 0.5F,"textures/entities/barmia_black_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_barmias_white.class, new RenderRiderMob2(new tokuMobModel("barmia_white_2"), 0.5F,"textures/entities/barmia_white_1.png"));

		//28 Dekaranger
		RenderingRegistry.registerEntityRenderingHandler(entity_anaroids.class, new RenderRiderMob2(new tokuMobModel("anaroid_2"), 0.5F,"textures/entities/anaroid_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_igaroids.class, new RenderRiderMob2(new tokuMobModel("igaroid_2"), 0.5F,"textures/entities/igaroid_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_batsuroids.class, new RenderRiderMob2(new tokuMobModel("batsuroid_2"), 0.5F,"textures/entities/batsuroid_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_neo_deka_red.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_neo_deka_red.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_neo_deka_yellow.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_neo_deka_yellow.png"));
		
		//30 Boukenger
		RenderingRegistry.registerEntityRenderingHandler(entity_karths.class, new RenderRiderMob2(new tokuMobModel("karths_2"), 0.5F,"textures/entities/karths_1.png"));

		//31 Gekiranger
		RenderingRegistry.registerEntityRenderingHandler(entity_rinshis.class, new RenderRiderMob2(new tokuMobModel("rinshi_2"), 0.5F,"textures/entities/rinshi_1.png"));

		//32 Go-Onger
		RenderingRegistry.registerEntityRenderingHandler(entity_ugatz.class, new RenderRiderMob2(new tokuMobModel("ugatz_2"), 0.5F,"textures/entities/ugatz_1.png"));

		//33 Shinkenger
		RenderingRegistry.registerEntityRenderingHandler(entity_nanashis.class, new RenderRiderMob2(new tokuMobModel("nanashi_2"), 0.5F,"textures/entities/nanashi_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_gedou_shinken_red.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_gedou_shinken_red.png"));
		
		//36 Go-Busters
		RenderingRegistry.registerEntityRenderingHandler(entity_buglars.class, new RenderRiderMob2(new tokuMobModel("buglar_2"), 0.5F,"textures/entities/buglar_1.png"));

		//36-37 Akibaranger
		RenderingRegistry.registerEntityRenderingHandler(entity_droans.class, new RenderRiderMob2(new tokuMobModel("droan_2"), 0.5F,"textures/entities/droan_1.png"));
		
		//37 Kyoryuger
		RenderingRegistry.registerEntityRenderingHandler(entity_zorimas.class, new RenderRiderMob2(new tokuMobModel("zorima_2"), 0.5F,"textures/entities/zorima_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_dogold.class, new RenderRiderMob2(new tokuMobModel("dogold_2"), 0.5F,"textures/entities/dogold_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_death_ryuger.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_death_ryuger.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_brave_kyoryu_gold.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_brave_kyoryu_gold.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_chaos_ryuger.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_chaos_ryuger.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_deinochaser.class, new RenderRiderMob2(new model_deinochaser(), 0.5F,"textures/entities/deinochaser.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_kyoryuger.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_kyoryuger.png"));
		
		//38 ToQger
		RenderingRegistry.registerEntityRenderingHandler(entity_kuros.class, new RenderRiderMob2(new tokuMobModel("kuros_2"), 0.5F,"textures/entities/kuros_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_yami_0gou.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_yami_0gou.png"));
		
		//40 Zyuohger
		RenderingRegistry.registerEntityRenderingHandler(entity_moebas.class, new RenderRiderMob2(new tokuMobModel("moeba_2"), 0.5F,"textures/entities/moeba_1.png"));

		//41 Kyuranger
		RenderingRegistry.registerEntityRenderingHandler(entity_indavers_blue.class, new RenderRiderMob2(new tokuMobModel("indaver_blue_2"), 0.5F,"textures/entities/indaver_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_indavers_green.class, new RenderRiderMob2(new tokuMobModel("indaver_green_2"), 0.5F,"textures/entities/indaver_green_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_indavers_white.class, new RenderRiderMob2(new tokuMobModel("indaver_white_2"), 0.5F,"textures/entities/indaver_white_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_hebitsukai_metal.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_hebitsukai_metal.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_dark_shishi_red.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_kyuranger.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_kyuranger.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_kyuranger.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_garu_bike.class, new RenderRiderMob2(new model_garu_bike(), 0.5F,"textures/entities/garu_bike.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ex_aid.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_ex_aid.png"));
		
		//42 Lupin VS Pat
		RenderingRegistry.registerEntityRenderingHandler(entity_pordermen.class, new RenderRiderMob2(new tokuMobModel("porderman_2"), 0.5F,"textures/entities/porderman_1.png"));

		//43 Ryusoulger
		RenderingRegistry.registerEntityRenderingHandler(entity_drunns.class, new RenderRiderMob2(new tokuMobModel("drunn_2"), 0.5F,"textures/entities/drunn_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_gaisorg.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_gaisorg.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ryusoul_moria.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_ryusoul_moria.png"));
		
		//44 Kirameiger
		RenderingRegistry.registerEntityRenderingHandler(entity_bechats.class, new RenderRiderMob2(new tokuMobModel("bechat_2"), 0.5F,"textures/entities/bechat_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_dark_kiramei_silver.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_dark_kiramei_silver.png"));

		//45 Zenkaiger
		RenderingRegistry.registerEntityRenderingHandler(entity_kudakks.class, new RenderRiderMob2(new tokuMobModel("kudakk_2"), 0.5F,"textures/entities/kudakk_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_stacaesar.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_stacaesar.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_hakaizer.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_hakaizer.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_mecha_dark_gear.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_stacaesar.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_don_momotarou.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_don_momotarou.png"));
	
		//46 DonBrothers
		RenderingRegistry.registerEntityRenderingHandler(entity_anounis.class, new RenderRiderMob2(new tokuMobModel("anouni_2"), 0.5F,"textures/entities/anouni_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_nouto.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_sonoi.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_don_murasame.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_don_murasame.png"));
	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i,  new ModelResourceLocation(item.getRegistryName(),string));
	}

}
