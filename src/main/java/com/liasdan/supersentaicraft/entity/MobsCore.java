package com.liasdan.supersentaicraft.entity;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.custom.ExplosiveProjectileEntity;
import com.liasdan.supersentaicraft.entity.custom.ShurikenProjectileEntity;
import com.liasdan.supersentaicraft.entity.custom.WeaponProjectileEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.ZoldersEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobsCore {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
	public static final DeferredRegister<EntityType<?>> MOBLIST = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SuperSentaiCraftCore.MODID);
	
	//01 Goranger
	public static final RegistryObject<EntityType<ZoldersEntity>> ZOLDERS = MOBLIST.register("zolder",
            () -> EntityType.Builder.of(ZoldersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zolder"));
    
    public static final RegistryObject<ForgeSpawnEggItem> ZOLDERS_SPAWN_EGG = ITEMS.register("zolder_spawn_egg",
            () -> new ForgeSpawnEggItem(ZOLDERS, 0x121212, 0xa1a1a1, new Item.Properties()));
 
    
	public static final RegistryObject<EntityType<ExplosiveProjectileEntity>> EXPLOSIVE_PROJECTILE = 
			MOBLIST.register("explosive_projectile",() -> EntityType.Builder.<ExplosiveProjectileEntity>of(ExplosiveProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":explosive_projectile"));
	
	public static final RegistryObject<EntityType<WeaponProjectileEntity>> WEAPON_PROJECTILE = 
			MOBLIST.register("weapon_projectile",() -> EntityType.Builder.<WeaponProjectileEntity>of(WeaponProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":weapon_projectile"));
	
	public static final RegistryObject<EntityType<ShurikenProjectileEntity>> SHURIKEN_PROJECTILE = 
			MOBLIST.register("shuriken_projectile",() -> EntityType.Builder.<ShurikenProjectileEntity>of(ShurikenProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":shuriken_projectile"));
	
	public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
