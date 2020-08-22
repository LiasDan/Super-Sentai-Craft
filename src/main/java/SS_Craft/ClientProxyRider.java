package SS_Craft;


import com.jcraft.jorbis.Block;

import SS_Craft.mobs.RenderRiderMob;
import SS_Craft.mobs.RenderRiderMob2;
import SS_Craft.mobs.Boss.entity_gedou_shinken_red;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import SS_Craft.mobs.Henchmen.entity_barmias_black;
import SS_Craft.mobs.Henchmen.entity_barmias_white;
import SS_Craft.mobs.Henchmen.entity_buglars;
import SS_Craft.mobs.Henchmen.entity_cotpotros;
import SS_Craft.mobs.Henchmen.entity_crimers;
import SS_Craft.mobs.Henchmen.entity_cutmen;
import SS_Craft.mobs.Henchmen.entity_drunns;
import SS_Craft.mobs.Henchmen.entity_dustlers;
import SS_Craft.mobs.Henchmen.entity_grinams;
import SS_Craft.mobs.Henchmen.entity_imps;
import SS_Craft.mobs.Henchmen.entity_indavers_blue;
import SS_Craft.mobs.Henchmen.entity_indavers_green;
import SS_Craft.mobs.Henchmen.entity_indavers_white;
import SS_Craft.mobs.Henchmen.entity_karths;
import SS_Craft.mobs.Henchmen.entity_kunekunes;
import SS_Craft.mobs.Henchmen.entity_kuros;
import SS_Craft.mobs.Henchmen.entity_machinemen;
import SS_Craft.mobs.Henchmen.entity_moebas;
import SS_Craft.mobs.Henchmen.entity_nanashis;
import SS_Craft.mobs.Henchmen.entity_orgettes;
import SS_Craft.mobs.Henchmen.entity_pordermen;
import SS_Craft.mobs.Henchmen.entity_rinshis;
import SS_Craft.mobs.Henchmen.entity_spotmen;
import SS_Craft.mobs.Henchmen.entity_ugatz;
import SS_Craft.mobs.Henchmen.entity_ular_captain;
import SS_Craft.mobs.Henchmen.entity_ulars;
import SS_Craft.mobs.Henchmen.entity_unglers;
import SS_Craft.mobs.Henchmen.entity_wumpers_blue;
import SS_Craft.mobs.Henchmen.entity_wumpers_green;
import SS_Craft.mobs.Henchmen.entity_wumpers_pink;
import SS_Craft.mobs.Henchmen.entity_wumpers_white;
import SS_Craft.mobs.Henchmen.entity_yartots;
import SS_Craft.mobs.Henchmen.entity_zolders;
import SS_Craft.mobs.Henchmen.entity_zolohs;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.bikes.entity_garu_bike;
import SS_Craft.model.MobWithBeltModel;
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

public class ClientProxyRider extends CommonProxyRider
{
	@Override
	public void registerRenderThings()
	{
		//01 Goranger
		RenderingRegistry.registerEntityRenderingHandler(entity_zolders.class, new RenderRiderMob(new tokuMobModel("zolder_2"), 0.5F,"textures/entities/zolder_1.png"));
	
		//02 J.A.K.Q.
		RenderingRegistry.registerEntityRenderingHandler(entity_crimers.class, new RenderRiderMob(new tokuMobModel("crimer_2"), 0.5F,"textures/entities/crimer_1.png"));
		
		//03 Battle Fever
		RenderingRegistry.registerEntityRenderingHandler(entity_cutmen.class, new RenderRiderMob(new tokuMobModel("cutman_2"), 0.5F,"textures/entities/cutman_1.png"));
		
		//04 Denziman
		RenderingRegistry.registerEntityRenderingHandler(entity_dustlers.class, new RenderRiderMob(new tokuMobModel("dustler_2"), 0.5F,"textures/entities/dustler_1.png"));
		
		//05 Sun Vulcan
		RenderingRegistry.registerEntityRenderingHandler(entity_machinemen.class, new RenderRiderMob(new tokuMobModel("machineman_2"), 0.5F,"textures/entities/machineman_1.png"));

		//06 Goggle V
		RenderingRegistry.registerEntityRenderingHandler(entity_spotmen.class, new RenderRiderMob(new tokuMobModel("spotman_2"), 0.5F,"textures/entities/spotman_1.png"));
			
		//10 Flashman
		RenderingRegistry.registerEntityRenderingHandler(entity_zolohs.class, new RenderRiderMob(new tokuMobModel("zolohs_2"), 0.5F,"textures/entities/zolohs_1.png"));
		
		//11 Maskman
		RenderingRegistry.registerEntityRenderingHandler(entity_unglers.class, new RenderRiderMob(new tokuMobModel("ungler_2"), 0.5F,"textures/entities/ungler_1.png"));

		//13 Turboranger
		RenderingRegistry.registerEntityRenderingHandler(entity_ulars.class, new RenderRiderMob(new tokuMobModel("ular_2"), 0.5F,"textures/entities/ular_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ular_captain.class, new RenderRiderMob(new tokuMobModel("ular_captain_2"), 0.5F,"textures/entities/ular_captain_1.png"));

		//15 Jetman
		RenderingRegistry.registerEntityRenderingHandler(entity_grinams.class, new RenderRiderMob(new tokuMobModel("grinam_2"), 0.5F,"textures/entities/grinam_1.png"));

		//17 Dairanger
		RenderingRegistry.registerEntityRenderingHandler(entity_cotpotros.class, new RenderRiderMob(new tokuMobModel("cotpotro_2"), 0.5F,"textures/entities/cotpotro_1.png"));

		//20 Carranger
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_blue.class, new RenderRiderMob(new tokuMobModel("wumper_blue_2"), 0.5F,"textures/entities/wumper_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_pink.class, new RenderRiderMob(new tokuMobModel("wumper_pink_2"), 0.5F,"textures/entities/wumper_pink_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_green.class, new RenderRiderMob(new tokuMobModel("wumper_green_2"), 0.5F,"textures/entities/wumper_green_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_white.class, new RenderRiderMob(new tokuMobModel("wumper_white_2"), 0.5F,"textures/entities/wumper_white_1.png"));

		//21 Megaranger
		RenderingRegistry.registerEntityRenderingHandler(entity_kunekunes.class, new RenderRiderMob(new tokuMobModel("kunekune_2"), 0.5F,"textures/entities/kunekune_1.png"));

		//22 Gingaman
		RenderingRegistry.registerEntityRenderingHandler(entity_yartots.class, new RenderRiderMob(new tokuMobModel("yartots_2"), 0.5F,"textures/entities/yartots_1.png"));

		//23 GoGo-V
		RenderingRegistry.registerEntityRenderingHandler(entity_imps.class, new RenderRiderMob(new tokuMobModel("imps_2"), 0.5F,"textures/entities/imps_1.png"));

		//25 Gaoranger
		RenderingRegistry.registerEntityRenderingHandler(entity_orgettes.class, new RenderRiderMob(new tokuMobModel("orgettes_2"), 0.5F,"textures/entities/orgettes_1.png"));

		//25 Gaoranger
		RenderingRegistry.registerEntityRenderingHandler(entity_barmias_black.class, new RenderRiderMob(new tokuMobModel("barmia_black_2"), 0.5F,"textures/entities/barmia_black_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_barmias_white.class, new RenderRiderMob(new tokuMobModel("barmia_white_2"), 0.5F,"textures/entities/barmia_white_1.png"));

		//30 Boukenger
		RenderingRegistry.registerEntityRenderingHandler(entity_karths.class, new RenderRiderMob(new tokuMobModel("karths_2"), 0.5F,"textures/entities/karths_1.png"));

		//31 Gekiranger
		RenderingRegistry.registerEntityRenderingHandler(entity_rinshis.class, new RenderRiderMob(new tokuMobModel("rinshi_2"), 0.5F,"textures/entities/rinshi_1.png"));

		//32 Go-Onger
		RenderingRegistry.registerEntityRenderingHandler(entity_ugatz.class, new RenderRiderMob(new tokuMobModel("ugatz_2"), 0.5F,"textures/entities/ugatz_1.png"));

		//33 Shinkenger
		RenderingRegistry.registerEntityRenderingHandler(entity_nanashis.class, new RenderRiderMob(new tokuMobModel("nanashi_2"), 0.5F,"textures/entities/nanashi_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_gedou_shinken_red.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_gedou_shinken_red.png"));
		
		//36 Go-Busters
		RenderingRegistry.registerEntityRenderingHandler(entity_buglars.class, new RenderRiderMob(new tokuMobModel("buglar_2"), 0.5F,"textures/entities/buglar_1.png"));

		//38 ToQger
		RenderingRegistry.registerEntityRenderingHandler(entity_kuros.class, new RenderRiderMob(new tokuMobModel("kuros_2"), 0.5F,"textures/entities/kuros_1.png"));

		//40 Zyuohger
		RenderingRegistry.registerEntityRenderingHandler(entity_moebas.class, new RenderRiderMob(new tokuMobModel("moeba_2"), 0.5F,"textures/entities/moeba_1.png"));

		//41 Kyuranger
		RenderingRegistry.registerEntityRenderingHandler(entity_indavers_blue.class, new RenderRiderMob(new tokuMobModel("indaver_blue_2"), 0.5F,"textures/entities/indaver_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_indavers_green.class, new RenderRiderMob(new tokuMobModel("indaver_green_2"), 0.5F,"textures/entities/indaver_green_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_indavers_white.class, new RenderRiderMob(new tokuMobModel("indaver_white_2"), 0.5F,"textures/entities/indaver_white_1.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_hebitsukai_metal.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_hebitsukai_metal.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_kyuranger.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_kyuranger.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_garu_bike.class, new RenderRiderMob2(new model_garu_bike(), 0.5F,"textures/entities/garu_bike.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ex_aid.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ld_ex_aid.png"));
		
		//42-43 Lupin VS Pat
		RenderingRegistry.registerEntityRenderingHandler(entity_pordermen.class, new RenderRiderMob(new tokuMobModel("porderman_2"), 0.5F,"textures/entities/porderman_1.png"));

		//44 Ryusoulger
		RenderingRegistry.registerEntityRenderingHandler(entity_drunns.class, new RenderRiderMob(new tokuMobModel("drunn_2"), 0.5F,"textures/entities/drunn_1.png"));

	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i,  new ModelResourceLocation(item.getRegistryName(),string));
	}

}
