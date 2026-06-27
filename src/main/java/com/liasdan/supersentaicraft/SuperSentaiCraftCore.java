package com.liasdan.supersentaicraft;

import com.liasdan.supersentaicraft.client.KeyBindings;
import com.liasdan.supersentaicraft.client.renderer.AllyEntityRenderer;
import com.liasdan.supersentaicraft.client.renderer.BasicEntityRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownShurikenRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownWeaponRenderer;
import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.events.ModCommonEvents;
import com.liasdan.supersentaicraft.events.ModServerEvents;
import com.liasdan.supersentaicraft.items.*;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.project_red.GavanInfinityItems;
import com.liasdan.supersentaicraft.items.sentai_10.*;
import com.liasdan.supersentaicraft.items.sentai_20.CarrangerItems;
import com.liasdan.supersentaicraft.items.sentai_20.MaskmanItems;
import com.liasdan.supersentaicraft.items.sentai_20.TurborangerItems;
import com.liasdan.supersentaicraft.items.sentai_30.BoukengerItems;
import com.liasdan.supersentaicraft.items.sentai_30.GaorangerItems;
import com.liasdan.supersentaicraft.items.sentai_30.GingamanItems;
import com.liasdan.supersentaicraft.items.sentai_30.GoGoVItems;
import com.liasdan.supersentaicraft.items.sentai_40.GoBustersItems;
import com.liasdan.supersentaicraft.items.sentai_40.ShinkengerItems;
import com.liasdan.supersentaicraft.items.sentai_50.*;
import com.liasdan.supersentaicraft.loot.ModLootModifiers;
import com.liasdan.supersentaicraft.network.ClientPayloadHandler;
import com.liasdan.supersentaicraft.network.ServerPayloadHandler;
import com.liasdan.supersentaicraft.network.payload.*;
import com.liasdan.supersentaicraft.particle.*;
import com.liasdan.supersentaicraft.sounds.ModSounds;
import com.liasdan.supersentaicraft.util.RegisterItemProperties;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import com.liasdan.supersentaicraft.world.data_attachments.AttachmentTypeRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.*;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.HandlerThread;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod(SuperSentaiCraftCore.MODID)
public class SuperSentaiCraftCore {

	public static final String MODID="supersentaicraft";
	private static final Logger LOGGER = LogUtils.getLogger();

	public static List<Item> SWORD_GUN_ITEM= new ArrayList<Item>();
	public static List<Item> SHIELD_ITEM= new ArrayList<Item>();
	public static List<Item> MULTI_WEAPON_ITEM= new ArrayList<Item>();
	public static List<Item> CHARGED_WEAPON= new ArrayList<Item>();
	public static List<Item> FORM_WEAPON_ITEM= new ArrayList<Item>();
	public static List<Item> CHANGE_CHANGER_TEXTURE= new ArrayList<Item>();

	public SuperSentaiCraftCore(IEventBus modEventBus, ModContainer modContainer) {
		// Register the commonSetup method for modloading
		modEventBus.addListener(this::commonSetup);
		//NeoForge.EVENT_BUS.register(new ModClientEvents.ClientEvents());
		NeoForge.EVENT_BUS.register(new ModCommonEvents.CommonEvents());

		// Register ourselves for server and other game events we are interested in.
		// Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
		// Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
		NeoForge.EVENT_BUS.register(this);
		AttachmentTypeRegistry.register(modEventBus);
		EffectCore.register(modEventBus);
		ModSounds.register(modEventBus);

		OtherItems.register(modEventBus);

		GorangerItems.register(modEventBus);
		JAKQItems.register(modEventBus);
		BattleFeverItems.register(modEventBus);
		DenzimanItems.register(modEventBus);
		SunVulcanItems.register(modEventBus);

		MaskmanItems.register(modEventBus);
		TurborangerItems.register(modEventBus);
		CarrangerItems.register(modEventBus);

		GingamanItems.register(modEventBus);
		GoGoVItems.register(modEventBus);
		GaorangerItems.register(modEventBus);

        BoukengerItems.register(modEventBus);
		ShinkengerItems.register(modEventBus);

		GoBustersItems.register(modEventBus);

		LuPatRangerItems.register(modEventBus);
		RyusoulgerItems.register(modEventBus);
		KingOhgerItems.register(modEventBus);
		BoonboomgerItems.register(modEventBus);
		GozyugerItems.register(modEventBus);

		GavanInfinityItems.register(modEventBus);

		RangerBlocks.register(modEventBus);

		AttributeRegistry.ATTRIBUTES.register(modEventBus);
		MobsCore.register(modEventBus);
		MobsCore.MOBLIST.register(modEventBus);
		MobsItems.register(modEventBus);
		RangerTabs.register(modEventBus);
		ModLootModifiers.register(modEventBus);
		ModParticles.register(modEventBus);

		// Register the item to a creative tab
		modEventBus.addListener(this::addCreative);
		modEventBus.addListener(ModCommonEvents::entityAttributeEvent);
		modEventBus.addListener(ModCommonEvents::entitySpawnRestriction);

		// Register our mod's ModConfigSpec so that FML can create and load the config file for us
		modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
	}

	private void commonSetup(final FMLCommonSetupEvent event)
	{
	}

	// Add the example block item to the building blocks tab
	private void addCreative(BuildCreativeModeTabContentsEvent event)
	{
		RangerTabs.AddItemsToTabs(event);
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
		NeoForge.EVENT_BUS.register(new ModServerEvents.ServerEvents());
	}

	@SubscribeEvent
	public void addRenderLivingEvent(RenderLivingEvent.Pre event) {

        if (event.getRenderer().getModel()instanceof PlayerModel model) {
            if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem
                    && event.getEntity().getItemBySlot(EquipmentSlot.FEET).has(DataComponents.CUSTOM_DATA)) {
                double tag = event.getEntity().getItemBySlot(EquipmentSlot.FEET).get(DataComponents.CUSTOM_DATA).copyTag().getDouble("render_type");
                if (tag != 0) {
                    model.setAllVisible(false);
                    if (tag != 1) model.head.visible = true;
                    else if (event.getEntity() instanceof BaseFootsoldierEntity) model.head.visible = false;
                    if (tag == 3) {
                        model.leftLeg.visible = true;
                        model.rightLeg.visible = true;
                        model.leftArm.visible = true;
                        model.rightArm.visible = true;
                        model.body.visible = true;
                    } else if (event.getEntity() instanceof BaseFootsoldierEntity) {
                        model.leftLeg.visible = false;
                        model.rightLeg.visible = false;
                        model.leftArm.visible = false;
                        model.rightArm.visible = false;
                        model.body.visible = false;
                    }
                } else if (event.getEntity() instanceof BaseFootsoldierEntity) model.setAllVisible(true);
            }
            else if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem
                    && event.getEntity().getItemBySlot(EquipmentSlot.HEAD).has(DataComponents.CUSTOM_DATA)) {
                double tag = event.getEntity().getItemBySlot(EquipmentSlot.HEAD).get(DataComponents.CUSTOM_DATA).copyTag().getDouble("render_type2");
                if (tag != 0) {
                    model.setAllVisible(false);
                } else if (event.getEntity() instanceof BaseFootsoldierEntity) model.setAllVisible(true);
            } else if (event.getEntity() instanceof BaseFootsoldierEntity) model.setAllVisible(true);
            else if (event.getEntity() instanceof BaseFootsoldierEntity) model.setAllVisible(true);
        }

		float sizeX= (float) event.getEntity().getAttribute(AttributeRegistry.PLAYER_SIZE_X).getValue();
		float sizeY = (float) event.getEntity().getAttribute(AttributeRegistry.PLAYER_SIZE_Y).getValue();
		float sizeZ = (float) event.getEntity().getAttribute(AttributeRegistry.PLAYER_SIZE_Z).getValue();
		event.getPoseStack().scale(sizeX, sizeY, sizeZ);
	}

	@SubscribeEvent
	public void addRenderPlayerEvent(RenderPlayerEvent.Pre event) {

	}

	// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
	@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {

		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			event.enqueueWork(RegisterItemProperties::addCustomItemProperties);
			event.enqueueWork(SuperSentaiCraftCoreClient::registerPlayerAnimations);
		}

		@SubscribeEvent
		public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
			event.registerEntityRenderer(MobsCore.ZOLDERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.CRIMERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.CUTMEN.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.MACHINEMEN.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.UNGLERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.ULARS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.ULAR_CAPTAIN.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.WUMPERS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.SIGNALMAN_EVIL.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.YARTOTS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.BLACK_KNIGHT.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.IMPS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.ORGETTES.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.DUKE_ORG_ROUKI.get(), BasicEntityRenderer::new);

            event.registerEntityRenderer(MobsCore.CURSES.get(), BasicEntityRenderer::new);
            event.registerEntityRenderer(MobsCore.JARYUU.get(), BasicEntityRenderer::new);
            event.registerEntityRenderer(MobsCore.RYUUWON.get(), BasicEntityRenderer::new);
            event.registerEntityRenderer(MobsCore.ZUBAAN.get(), AllyEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.NANASHIS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.GEDOU_SHINKEN_RED.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.BUGLERS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.DARK_BUSTER.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.PORDERMEN.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.DRUNNS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.GAISOULG.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.RYUSOUL_MORIA.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.SANAGIMS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.OH_KUWAGATA_OHGER.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.NEJIRETTAS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.EXPLOSIVE_PROJECTILE.get(), ThrownItemRenderer::new);
			event.registerEntityRenderer(MobsCore.WEAPON_PROJECTILE.get(), ThrownWeaponRenderer::new);
			event.registerEntityRenderer(MobsCore.SHURIKEN_PROJECTILE.get(), ThrownShurikenRenderer::new);
		}

		@SubscribeEvent
		public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
			event.registerSpriteSet(ModParticles.WHITE_SPARK_PARTICLES.get(), WhiteSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.RED_SPARK_PARTICLES.get(), RedSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.BLUE_SPARK_PARTICLES.get(), BlueSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.GREEN_SPARK_PARTICLES.get(), GreenSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.DARK_GREEN_SPARK_PARTICLES.get(), DarkGreenSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.PURPLE_SPARK_PARTICLES.get(), PurpleSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.PINK_SPARK_PARTICLES.get(), PinkSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.YELLOW_SPARK_PARTICLES.get(), YellowSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.GOLD_SPARK_PARTICLES.get(), GoldSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.BLACK_SPARK_PARTICLES.get(), BlackSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.ORANGE_SPARK_PARTICLES.get(), OrangeSparkParticles.Provider::new);
			event.registerSpriteSet(ModParticles.RANDOM_SPARK_PARTICLES.get(), RandomSparkParticles.Provider::new);

			event.registerSpriteSet(ModParticles.GREEN_MORPHIN_PARTICLES.get(), GreenMorphinParticles.Provider::new);
			event.registerSpriteSet(ModParticles.GOLD_MORPHIN_PARTICLES.get(), GoldMorphinParticles.Provider::new);
			event.registerSpriteSet(ModParticles.RED_MORPHIN_PARTICLES.get(), RedMorphinParticles.Provider::new);
			event.registerSpriteSet(ModParticles.BLUE_MORPHIN_PARTICLES.get(), BlueMorphinParticles.Provider::new);
			event.registerSpriteSet(ModParticles.YELLOW_MORPHIN_PARTICLES.get(), YellowMorphinParticles.Provider::new);
			event.registerSpriteSet(ModParticles.SILVER_MORPHIN_PARTICLES.get(), SilverMorphinParticles.Provider::new);

			event.registerSpriteSet(ModParticles.GOZYUGER_PARTICLES.get(), GozyugerParticles.Provider::new);
		}

		@SubscribeEvent
		public static void registerKeys(RegisterKeyMappingsEvent event) {
			event.register(KeyBindings.INSTANCE.AbilityKey);
			event.register(KeyBindings.INSTANCE.PoseKey);
		}

		@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
		public static class CommonModEvents {
			@SubscribeEvent
			public static void register(final RegisterPayloadHandlersEvent event) {
				PayloadRegistrar registrar = event.registrar("supersentaicraft");
				registrar = registrar.executesOn(HandlerThread.MAIN);
				registrar.playToServer(
						AbilityKeyPayload.TYPE,
						AbilityKeyPayload.STREAM_CODEC,
						ServerPayloadHandler::handleAbilityKeyPress
				);

				registrar.playToClient(
						AttributeChangeClientPayload.TYPE,
						AttributeChangeClientPayload.STREAM_CODEC,
						ClientPayloadHandler::handleAttributeCLientChange
				);

				registrar.playToServer(
						AttributeChangePayload.TYPE,
						AttributeChangePayload.STREAM_CODEC,
						ServerPayloadHandler::handleAttributeChange
				);

				registrar.playToServer(
						ClimbCollisionPayload.TYPE,
						ClimbCollisionPayload.STREAM_CODEC,
						ServerPayloadHandler::handleClimbing
				);

				registrar.playToClient(
						EndPosePayload.TYPE,
						EndPosePayload.STREAM_CODEC,
						ClientPayloadHandler::endPoseAnimations
				);

				registrar.playToClient(
						StartPosePayload.TYPE,
						StartPosePayload.STREAM_CODEC,
						ClientPayloadHandler::startPoseAnimations
				);

				registrar.playToServer(
						PoseKeyPayload.TYPE,
						PoseKeyPayload.STREAM_CODEC,
						ServerPayloadHandler::handlePoseKeyPress
				);
			}
		}
	}
}