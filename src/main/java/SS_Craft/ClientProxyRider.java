package SS_Craft;


import com.jcraft.jorbis.Block;

import SS_Craft.mobs.RenderRiderMob2;
import SS_Craft.mobs.Henchmen.entity_buglars;
import SS_Craft.mobs.Henchmen.entity_crimers;
import SS_Craft.mobs.Henchmen.entity_cutmen;
import SS_Craft.mobs.Henchmen.entity_drunns;
import SS_Craft.mobs.Henchmen.entity_dustlers;
import SS_Craft.mobs.Henchmen.entity_grinams;
import SS_Craft.mobs.Henchmen.entity_imps;
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
import SS_Craft.model.MobWithBeltModel;
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
			
		//10 Flashman
		RenderingRegistry.registerEntityRenderingHandler(entity_zolohs.class, new RenderRiderMob2(new tokuMobModel("zolohs_2"), 0.5F,"textures/entities/zolohs_1.png"));
		
		//11 Maskman
		RenderingRegistry.registerEntityRenderingHandler(entity_unglers.class, new RenderRiderMob2(new tokuMobModel("ungler_2"), 0.5F,"textures/entities/ungler_1.png"));

		//13 Turboranger
		RenderingRegistry.registerEntityRenderingHandler(entity_ulars.class, new RenderRiderMob2(new tokuMobModel("ular_2"), 0.5F,"textures/entities/ular_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ular_captain.class, new RenderRiderMob2(new tokuMobModel("ular_captain_2"), 0.5F,"textures/entities/ular_captain_1.png"));

		//15 Jetman
		RenderingRegistry.registerEntityRenderingHandler(entity_grinams.class, new RenderRiderMob2(new tokuMobModel("grinam_2"), 0.5F,"textures/entities/grinam_1.png"));

		//20 Carranger
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_blue.class, new RenderRiderMob2(new tokuMobModel("wumper_blue_2"), 0.5F,"textures/entities/wumper_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_pink.class, new RenderRiderMob2(new tokuMobModel("wumper_pink_2"), 0.5F,"textures/entities/wumper_pink_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_green.class, new RenderRiderMob2(new tokuMobModel("wumper_green_2"), 0.5F,"textures/entities/wumper_green_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_wumpers_white.class, new RenderRiderMob2(new tokuMobModel("wumper_white_2"), 0.5F,"textures/entities/wumper_white_1.png"));

		//21 Megaranger
		RenderingRegistry.registerEntityRenderingHandler(entity_kunekunes.class, new RenderRiderMob2(new tokuMobModel("kunekune_2"), 0.5F,"textures/entities/kunekune_1.png"));

		//22 Gingaman
		RenderingRegistry.registerEntityRenderingHandler(entity_yartots.class, new RenderRiderMob2(new tokuMobModel("yartots_2"), 0.5F,"textures/entities/yartots_1.png"));

		//23 GoGo-V
		RenderingRegistry.registerEntityRenderingHandler(entity_imps.class, new RenderRiderMob2(new tokuMobModel("imps_2"), 0.5F,"textures/entities/imps_1.png"));

		//25 Gaoranger
		RenderingRegistry.registerEntityRenderingHandler(entity_orgettes.class, new RenderRiderMob2(new tokuMobModel("orgettes_2"), 0.5F,"textures/entities/orgettes_1.png"));

		//30 Boukenger
		RenderingRegistry.registerEntityRenderingHandler(entity_karths.class, new RenderRiderMob2(new tokuMobModel("karths_2"), 0.5F,"textures/entities/karths_1.png"));

		//31 Gekiranger
		RenderingRegistry.registerEntityRenderingHandler(entity_rinshis.class, new RenderRiderMob2(new tokuMobModel("rinshi_2"), 0.5F,"textures/entities/rinshi_1.png"));

		//32 Go-Onger
		RenderingRegistry.registerEntityRenderingHandler(entity_ugatz.class, new RenderRiderMob2(new tokuMobModel("ugatz_2"), 0.5F,"textures/entities/ugatz_1.png"));

		//33 Shinkenger
		RenderingRegistry.registerEntityRenderingHandler(entity_nanashis.class, new RenderRiderMob2(new tokuMobModel("nanashi_2"), 0.5F,"textures/entities/nanashi_1.png"));

		//36 Go-Busters
		RenderingRegistry.registerEntityRenderingHandler(entity_buglars.class, new RenderRiderMob2(new tokuMobModel("buglar_2"), 0.5F,"textures/entities/buglar_1.png"));

		//38 ToQger
		RenderingRegistry.registerEntityRenderingHandler(entity_kuros.class, new RenderRiderMob2(new tokuMobModel("kuros_2"), 0.5F,"textures/entities/kuros_1.png"));

		//40 Zyuohger
		RenderingRegistry.registerEntityRenderingHandler(entity_moebas.class, new RenderRiderMob2(new tokuMobModel("moeba_2"), 0.5F,"textures/entities/moeba_1.png"));

		//42-43 Lupin VS Pat
		RenderingRegistry.registerEntityRenderingHandler(entity_pordermen.class, new RenderRiderMob2(new tokuMobModel("porderman_2"), 0.5F,"textures/entities/porderman_1.png"));

		//44 Ryusoulger
		RenderingRegistry.registerEntityRenderingHandler(entity_drunns.class, new RenderRiderMob2(new tokuMobModel("drunn_2"), 0.5F,"textures/entities/drunn_1.png"));

	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i,  new ModelResourceLocation(item.getRegistryName(),string));
	}

}
