package com.liasdan.supersentaicraft.events;

import java.util.List;
import java.util.Objects;

import com.liasdan.supersentaicraft.client.KeyBindings;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.ally.ZubaanEntity;
import com.liasdan.supersentaicraft.entity.boss.*;
import com.liasdan.supersentaicraft.entity.footsoldier.*;

import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_10.denziman.DenziPunchItem;
import com.liasdan.supersentaicraft.network.payload.AbilityKeyPayload;
import com.liasdan.supersentaicraft.network.payload.PoseKeyPayload;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.network.PacketDistributor;

public class ModCommonEvents {

	public static class CommonEvents {

		@SubscribeEvent
		public void clientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().player != null) {
				while (KeyBindings.INSTANCE.AbilityKey.consumeClick())
					PacketDistributor.sendToServer(new AbilityKeyPayload(0));
				while (KeyBindings.INSTANCE.PoseKey.consumeClick())
					PacketDistributor.sendToServer(new PoseKeyPayload(0));
			}
		}

		@SubscribeEvent
		public void onEntityTick(EntityTickEvent.Post event) {
			if (event.getEntity() instanceof LivingEntity entity ) {
				entity.getAttribute(AttributeRegistry.IS_TRANSFORMING_OLD).setBaseValue(entity.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue());
				if (entity.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue()!=0)entity.getAttribute(AttributeRegistry.IS_TRANSFORMING).setBaseValue(entity.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue()-0.2);
				if (entity.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue()<=0)entity.getAttribute(AttributeRegistry.IS_TRANSFORMING).setBaseValue(0);
			}


			if (!(event.getEntity() instanceof Player) && event.getEntity() instanceof LivingEntity entity && !entity.level().isClientSide && entity.getAttribute(AttributeRegistry.CLIMBING).getValue() != 0) {
				if (entity.horizontalCollision) {
					Vec3 initialVec = entity.getDeltaMovement();
					Vec3 climbVec = new Vec3(initialVec.x, 0.1D * (entity.getAttribute(AttributeRegistry.CLIMBING).getValue()), initialVec.z);
					entity.setDeltaMovement(climbVec.scale(0.97D));
				}
			}
		}

		@SubscribeEvent
		public void addLivingDamageEvent(LivingDamageEvent.Post event) {

			if (event.getSource().getEntity() instanceof LivingEntity attacker && attacker.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem && attacker.getAttribute(AttributeRegistry.ABILITY_METER).getBaseValue() < 300) {
				attacker.getAttribute(AttributeRegistry.ABILITY_METER).setBaseValue(attacker.getAttribute(AttributeRegistry.ABILITY_METER).getBaseValue() + 1);
			}

			if (event.getSource().getEntity() instanceof LivingEntity _livEnt) {
				if (event.getSource().is(DamageTypes.PLAYER_ATTACK) || event.getSource().is(DamageTypes.MOB_ATTACK) || event.getSource().is(DamageTypes.MOB_ATTACK_NO_AGGRO)) {

					if (_livEnt.hasEffect(EffectCore.FIREPUNCH)) {
						if (_livEnt.getMainHandItem().isEmpty()) {
							event.getEntity().igniteForSeconds(_livEnt.getEffect(EffectCore.FIREPUNCH).getAmplifier()+1);
						}
					}

					if (_livEnt.hasEffect(EffectCore.THUNDERPUNCH)) {
						if (_livEnt.getMainHandItem().getItem() instanceof DenziPunchItem) {
							LightningBolt thunder = new LightningBolt(EntityType.LIGHTNING_BOLT,_livEnt.level());
							thunder.setPos(   event.getEntity().getX(),   event.getEntity().getY(),   event.getEntity().getZ());
							event.getEntity().level().addFreshEntity(thunder);
						}
						if (_livEnt.getMainHandItem().isEmpty()) {
							LightningBolt thunder = new LightningBolt(EntityType.LIGHTNING_BOLT,_livEnt.level());
							thunder.setPos(   event.getEntity().getX(),   event.getEntity().getY(),   event.getEntity().getZ());
							event.getEntity().level().addFreshEntity(thunder);
						}
					}

					if (_livEnt.hasEffect(EffectCore.EXPLOSIONPUNCH)) {
						if (_livEnt.getMainHandItem().isEmpty()) {
							boolean flag = event.getEntity().level().getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).get();
							event.getEntity().level().explode(null, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), _livEnt.getEffect(EffectCore.EXPLOSIONPUNCH).getAmplifier(), flag, Level.ExplosionInteraction.MOB);
						}
					}

					if (event.getEntity().hasEffect(EffectCore.REFLECT)) {
						event.getSource().getEntity().hurt(event.getSource(), (event.getOriginalDamage()) * (1 + event.getEntity().getEffect(EffectCore.REFLECT).getAmplifier() + 1));
					}

					if (_livEnt.hasEffect(EffectCore.FIRESLASH)) {
						if (_livEnt.getMainHandItem().getItem() instanceof SwordItem) {
							event.getEntity().igniteForSeconds(_livEnt.getEffect(EffectCore.FIRESLASH).getAmplifier()+1);
						}
					}

				} else if (event.getSource().is(DamageTypes.ARROW) || event.getSource().is(DamageTypes.MOB_PROJECTILE)) {
					if (_livEnt.hasEffect(EffectCore.FIRESLASH)) {
						event.getEntity().setRemainingFireTicks(25*(Objects.requireNonNull(_livEnt.getEffect(EffectCore.FIRESLASH)).getAmplifier() + 1));
					}

					if (_livEnt.hasEffect(EffectCore.EXPLOSIONSHOT)) {
						boolean flag = event.getEntity().level().getLevelData().getGameRules().getRule(GameRules.RULE_MOBGRIEFING).get();
						event.getEntity().level().explode(null, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), _livEnt.getEffect(EffectCore.EXPLOSIONSHOT).getAmplifier(), flag, Level.ExplosionInteraction.MOB);
					}

					if (_livEnt.hasEffect(EffectCore.THUNDERSHOT)) {

						LightningBolt thunder = new LightningBolt(EntityType.LIGHTNING_BOLT,_livEnt.level());
						thunder.setPos(   event.getEntity().getX(),   event.getEntity().getY(),   event.getEntity().getZ());
						event.getEntity().level().addFreshEntity(thunder);
					}
				}
			}
		}

		@SubscribeEvent
		public void addCustomTrades(VillagerTradesEvent event) {
			if (event.getType() == VillagerProfession.LIBRARIAN) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(OtherItems.SUPER_SENTAI_BOOK.get(), 1);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemCost(Items.EMERALD, 2),
						stack, 10, 8, 0.02F));
			}
		}
	}

	@SubscribeEvent
	public void riderVisibility(LivingEvent.LivingVisibilityEvent event) {
		if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem belt
				&& belt.isTransformed(event.getEntity()) && event.getEntity().hasEffect(MobEffects.INVISIBILITY)) {
			event.modifyVisibility(event.getVisibilityModifier() * 0.1);
		}
	}

	@SubscribeEvent
	public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
		event.put(MobsCore.ZOLDERS.get(), ZoldersEntity.setAttributes().build());

		event.put(MobsCore.CRIMERS.get(), CrimersEntity.setAttributes().build());

		event.put(MobsCore.CUTMEN.get(), CutmenEntity.setAttributes().build());

		event.put(MobsCore.DUSTLERS.get(), DustlersEntity.setAttributes().build());

		event.put(MobsCore.MACHINEMEN.get(), MachinemenEntity.setAttributes().build());

		event.put(MobsCore.UNGLERS.get(), UnglersEntity.setAttributes().build());

		event.put(MobsCore.ULARS.get(), UlarsEntity.setAttributes().build());
		event.put(MobsCore.ULAR_CAPTAIN.get(), UlarCaptainEntity.setAttributes().build());

		event.put(MobsCore.WUMPERS.get(), WumpersEntity.setAttributes().build());
		event.put(MobsCore.SIGNALMAN_EVIL.get(), SignalmanEvilEntity.setAttributes().build());

		event.put(MobsCore.YARTOTS.get(), YartotsEntity.setAttributes().build());
		event.put(MobsCore.BLACK_KNIGHT.get(), BlackKnightEntity.setAttributes().build());

		event.put(MobsCore.IMPS.get(), ImpsEntity.setAttributes().build());

		event.put(MobsCore.ORGETTES.get(), OrgettesEntity.setAttributes().build());
		event.put(MobsCore.DUKE_ORG_ROUKI.get(), DukeOrgRoukiEntity.setAttributes().build());

        event.put(MobsCore.CURSES.get(), CursesEntity.setAttributes().build());
        event.put(MobsCore.JARYUU.get(), JaryuuEntity.setAttributes().build());
        event.put(MobsCore.RYUUWON.get(), RyuuwonEntity.setAttributes().build());
        event.put(MobsCore.ZUBAAN.get(), ZubaanEntity.setAttributes().build());

		event.put(MobsCore.NANASHIS.get(), NanashisEntity.setAttributes().build());
		event.put(MobsCore.GEDOU_SHINKEN_RED.get(), GedouShinkenRedEntity.setAttributes().build());

		event.put(MobsCore.BEEBES.get(), BeebesEntity.setAttributes().build());
		event.put(MobsCore.DARK_GOSEI_KNIGHT.get(), DarkGoseiKnightEntity.setAttributes().build());

		event.put(MobsCore.BUGLERS.get(), BuglersEntity.setAttributes().build());
		event.put(MobsCore.DARK_BUSTER.get(), DarkBusterEntity.setAttributes().build());

		event.put(MobsCore.PORDERMEN.get(), PordermenEntity.setAttributes().build());

		event.put(MobsCore.DRUNNS.get(), DrunnsEntity.setAttributes().build());
		event.put(MobsCore.GAISOULG.get(), GaisoulgEntity.setAttributes().build());
		event.put(MobsCore.RYUSOUL_MORIA.get(), RyusoulMoriaEntity.setAttributes().build());

		event.put(MobsCore.SANAGIMS.get(), SanagimsEntity.setAttributes().build());
		event.put(MobsCore.OH_KUWAGATA_OHGER.get(), OhKuwagataOhgerEntity.setAttributes().build());

		event.put(MobsCore.NEJIRETTAS.get(), NejirettasEntity.setAttributes().build());
	}

	@SubscribeEvent
	public static void entitySpawnRestriction(RegisterSpawnPlacementsEvent event) {
		event.register(MobsCore.ZOLDERS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.CRIMERS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.CUTMEN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.DUSTLERS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.MACHINEMEN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.UNGLERS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.ULARS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.WUMPERS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.YARTOTS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.IMPS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.ORGETTES.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(MobsCore.CURSES.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(MobsCore.JARYUU.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(MobsCore.NANASHIS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.BEEBES.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.BUGLERS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.PORDERMEN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.DRUNNS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.SANAGIMS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

		event.register(MobsCore.NEJIRETTAS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}
}