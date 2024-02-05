package com.liasdan.supersentaicraft.effect;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectCore {

	public static final DeferredRegister<MobEffect> EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SuperSentaiCraftCore.MODID);


	public static final RegistryObject<MobEffect> BOOST = EFFECT.register("boost",
			() -> new 	BoostEffect(MobEffectCategory.BENEFICIAL, 0xff0015));

	public static final RegistryObject<MobEffect> ANTIPOISON = EFFECT.register("anti_poison",
			() -> new 	AntiPoisonEffect(MobEffectCategory.BENEFICIAL, 0x8532a8));

	public static final RegistryObject<MobEffect> SLASH= EFFECT.register("slash",
			() -> new 	SlashEffect(MobEffectCategory.BENEFICIAL, 0x21daff));

	public static final RegistryObject<MobEffect> SHOTBOOST= EFFECT.register("shot_boost",
			() -> new 	ShotBoostEffect(MobEffectCategory.BENEFICIAL, 0x21daff));

	public static final RegistryObject<MobEffect> PUNCH= EFFECT.register("punch",
			() -> new 	PunchEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> FIREPUNCH= EFFECT.register("fire_punch",
			() -> new 	FirePunchEffect(MobEffectCategory.BENEFICIAL, 0xff6000));

	public static final RegistryObject<MobEffect> FLYING= EFFECT.register("flying",
			() -> new 	FlyingEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> FIRESLASH= EFFECT.register("fire_slash",
			() -> new 	FireSlashEffect(MobEffectCategory.BENEFICIAL, 0xff6000));

	public static final RegistryObject<MobEffect> SMALL= EFFECT.register("small",
			() -> new 	SmallEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> BIG= EFFECT.register("big",
			() -> new 	BigEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> FLAT= EFFECT.register("flat",
			() -> new 	BigEffect(MobEffectCategory.BENEFICIAL, 0xf7fada));

	public static final RegistryObject<MobEffect> SMOKE= EFFECT.register("smoke",
			() -> new 	SmokeEffect(MobEffectCategory.BENEFICIAL, 0xf7fada));

	public static final RegistryObject<MobEffect> FROSTWALKER= EFFECT.register("frost_walker",
			() -> new 	FrostWalkerEffect(MobEffectCategory.BENEFICIAL, 0xf7fada));


	//FIRE_PUNCH_POTION

	//BUGSTER_POTION 

	

	public static void register(IEventBus eventBus) {
		EFFECT.register(eventBus);
	}

}