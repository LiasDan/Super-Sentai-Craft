package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseExplosiveItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GorangerItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> GORANGER_LOGO = ITEMS.register("goranger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GORANGER));

	public static final RegistryObject<Item> AKA_STAR = ITEMS.register("aka_star",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","akaranger","akaranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false))
            .ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.GORANGER));

	public static final RegistryObject<Item> AO_STAR = ITEMS.register("ao_star",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","aoranger","aoranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)).AddToTabList(RangerTabs.GORANGER));

	public static final RegistryObject<Item> KI_STAR = ITEMS.register("ki_star",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","kiranger","kiranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)).AddToTabList(RangerTabs.GORANGER));

	public static final RegistryObject<Item> MOMO_STAR = ITEMS.register("momo_star",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","momoranger","momoranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)).AddToTabList(RangerTabs.GORANGER));

	public static final RegistryObject<Item> MIDO_STAR = ITEMS.register("mido_star",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","midoranger","midoranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)).AddToTabList(RangerTabs.GORANGER));
    
	public static final RegistryObject<Item> AORANGER_MANGA = ITEMS.register("aoranger_manga",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_manga","aoranger","aoranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)));
	
	public static final RegistryObject<Item> KIRANGER_MANGA = ITEMS.register("kiranger_manga",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_manga","kiranger","kiranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)));
	
	public static final RegistryObject<Item> MOMORANGER_MANGA = ITEMS.register("momoranger_manga",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_manga","momoranger","momoranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)));
	
	public static final RegistryObject<Item> MIDORANGER_MANGA = ITEMS.register("midoranger_manga",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_manga","midoranger","midoranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false)));
	
	public static final RegistryObject<Item> GORANGER_MANGA = ITEMS.register("goranger_manga",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_manga","akaranger","akaranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.BOOST.get(), 40, 2,true,false))
            .ChangeBeltModel("geo/rangerbeltextra.geo.json")
            .addAlternative(AORANGER_MANGA.get()).addAlternative(KIRANGER_MANGA.get()).addAlternative(MOMORANGER_MANGA.get()).addAlternative(MIDORANGER_MANGA.get())
            .AddToTabList(RangerTabs.GORANGER));
	
	public static final RegistryObject<Item> GORANGER_HELMET = ITEMS.register("goranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    public static final RegistryObject<Item> GORANGER_CHESTPLATE = ITEMS.register("goranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    public static final RegistryObject<Item> GORANGER_LEGGINGS = ITEMS.register("goranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    
    public static final RegistryObject<Item> AKARANGER_BELT = ITEMS.register("akaranger_belt",
    		() -> new GorangerBeltItem(ArmorMaterials.DIAMOND,"akaranger",AKA_STAR,GORANGER_HELMET,GORANGER_CHESTPLATE,GORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    public static final RegistryObject<Item> AORANGER_BELT = ITEMS.register("aoranger_belt",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"aoranger",AO_STAR,GORANGER_HELMET,GORANGER_CHESTPLATE,GORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    public static final RegistryObject<Item> KIRANGER_BELT = ITEMS.register("kiranger_belt",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"kiranger",KI_STAR,GORANGER_HELMET,GORANGER_CHESTPLATE,GORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    public static final RegistryObject<Item> MOMORANGER_BELT = ITEMS.register("momoranger_belt",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"momoranger",MOMO_STAR,GORANGER_HELMET,GORANGER_CHESTPLATE,GORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
    public static final RegistryObject<Item> MIDORANGER_BELT = ITEMS.register("midoranger_belt",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"midoranger",MIDO_STAR,GORANGER_HELMET,GORANGER_CHESTPLATE,GORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));

	public static final RegistryObject<SwordItem> RED_BUTE = ITEMS.register("red_bute",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsTripleWeapon().AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<PickaxeItem> DRILL_BUTE = ITEMS.register("drill_bute",
			() -> new BasePickaxeItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<BaseBlasterItem> SILVER_SHOT = ITEMS.register("silver_shot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<BaseBlasterItem> BLUE_CHERRY = ITEMS.register("blue_cherry",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<BaseBlasterItem> ULTRA_BLUE_CHERRY = ITEMS.register("ultra_blue_cherry",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<SwordItem> KI_STICKER = ITEMS.register("ki_sticker",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsTripleWeapon().AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<SwordItem> KI_STICKER_SHORT = ITEMS.register("ki_sticker_short",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsTripleWeapon().AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<Item> YTC = ITEMS.register("ytc",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GORANGER));
	
	public static final RegistryObject<BaseThrowableItem> MOMO_CARD = ITEMS.register("momo_card",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsShuriken().AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<BaseExplosiveItem> EARRING_BOMB = ITEMS.register("earring_bomb",
			() -> new BaseExplosiveItem(new Item.Properties(), 1).AddToTabList(RangerTabs.GORANGER));
	
	public static final RegistryObject<Item> MOMO_MIRROR = ITEMS.register("momo_mirror",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GORANGER));

	public static final RegistryObject<BaseBlasterItem> MIDO_PUNCHER = ITEMS.register("mido_puncher",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<BaseThrowableItem> MIDOMERANG = ITEMS.register("midomerang",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static final RegistryObject<BaseThrowableItem> NEW_MIDOMERANG = ITEMS.register("new_midomerang",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GORANGER).ChangeRepairItem(GORANGER_LOGO.get()));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}