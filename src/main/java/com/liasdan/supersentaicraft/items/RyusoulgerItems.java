package com.liasdan.supersentaicraft.items;

import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.ryusoulger.BlankRyusoulItem;
import com.liasdan.supersentaicraft.items.ryusoulger.GaisoulKenItem;
import com.liasdan.supersentaicraft.items.ryusoulger.MosaChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulCaliburItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulItem;
import com.liasdan.supersentaicraft.items.shinkenger.ShodoPhoneItem;
import com.liasdan.supersentaicraft.items.shinkenger.SushiChangerItem;

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

public class RyusoulgerItems {

	public static String[] RYUSOULGERS= new String[] {"ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold","gaisoulg","ryusoul_brown","ryusoul_moria"};
	public static String[] RYUSOULGER= new String[] {"ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold"};

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> RYUSOULGER_LOGO = ITEMS.register("ryusoulger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> BLANK_RYUSOUL = ITEMS.register("blank_ryusoul",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> RYUSOUL = ITEMS.register("ryusoul",
    		() -> new BlankRyusoulItem(new Item.Properties()));

	public static final RegistryObject<Item> RED_RYUSOUL = ITEMS.register("red_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_red","ryusoul_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltchangerweapon.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> BLUE_RYUSOUL = ITEMS.register("blue_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_blue","ryusoul_blue_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 3,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltchangerweapon.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> PINK_RYUSOUL = ITEMS.register("pink_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_pink","ryusoul_pink_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltchangerweapon.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> GREEN_RYUSOUL = ITEMS.register("green_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_green","ryusoul_green_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltchangerweapon.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> BLACK_RYUSOUL = ITEMS.register("black_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_black","ryusoul_black_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltchangerweapon.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> GOLD_RYUSOUL = ITEMS.register("gold_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_gold","ryusoul_gold_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> GAI_SOUL = ITEMS.register("gai_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"","gaisoulg","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> BROWN_RYUSOUL = ITEMS.register("brown_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_brown","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> TSUYO_SOUL = ITEMS.register("tsuyo_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_tsuyo_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 4,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> NOBI_SOUL = ITEMS.register("nobi_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_nobi_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> OMO_SOUL = ITEMS.register("omo_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_omo_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> HAYA_SOUL = ITEMS.register("haya_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_haya_soul","","blank",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KATA_SOUL = ITEMS.register("kata_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kata_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KIKE_SOUL = ITEMS.register("kike_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kike_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KUSA_SOUL = ITEMS.register("kusa_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kusa_soul","","blank",
            		new MobEffectInstance(EffectCore.SMOKE.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MIE_SOUL = ITEMS.register("mie_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mie_soul","","blank",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MUKIMUKI_SOUL = ITEMS.register("mukimuki_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mukimuki_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> CHIISA_SOUL = ITEMS.register("chiisa_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_chiisa_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SMALL.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MABUSHI_SOUL = ITEMS.register("mabushi_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mabushi_soul","","blank",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MIST_SOUL = ITEMS.register("mist_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mist_soul","","blank",
            		new MobEffectInstance(EffectCore.SMOKE.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KARU_SOUL = ITEMS.register("karu_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_karu_soul","","blank",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> GYAKU_SOUL = ITEMS.register("gyaku_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_gyaku_soul","","blank",
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 3,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KOTAE_SOUL = ITEMS.register("kotae_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kotae_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MIGAKE_SOUL = ITEMS.register("migake_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_migake_soul","","blank",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KUNKUN_SOUL = ITEMS.register("kunkun_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kunkun_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> PUKUPUKU_SOUL = ITEMS.register("pukupuku_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_pukupuku_soul","","blank",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KAKURE_SOUL = ITEMS.register("kakure_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kakure_soul","","blank",
            		new MobEffectInstance(MobEffects.INVISIBILITY, 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> FUE_SOUL = ITEMS.register("fue_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_fue_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> NEMU_SOUL = ITEMS.register("nemu_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_nemu_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MAWARI_SOULD = ITEMS.register("mawari_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mawari_soul","","blank",
            		new MobEffectInstance(MobEffects.CONFUSION, 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> KAWAKI_SOUL = ITEMS.register("kawaki_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kawaki_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> YAWARAKA_SOUL = ITEMS.register("yawaraka_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_yawaraka_soul","","blank")
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final RegistryObject<Item> MERAMERA_SOUL = ITEMS.register("meramera_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_meramera","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIREPUNCH.get(), 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIRESLASH.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> BIRIBIRI_SOUL = ITEMS.register("biribiri_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_biribiri","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIRESLASH.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> BYUBYU_SOUL = ITEMS.register("byubyu_soul",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> KURAYAMI_SOUL = ITEMS.register("kurayami_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kurayami","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> KAGAYAKI_SOUL = ITEMS.register("kagayaki_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kagayaki","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST.get(), 40, 2,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> COSMO_SOUL = ITEMS.register("cosmo_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_cosmo","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 3,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST.get(), 40, 3,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> KANAE_SOUL = ITEMS.register("kanae_soul",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> DOSSHIN_SOUL = ITEMS.register("dosshin_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_dosshin","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.PUNCH.get(), 40, 5,true,false))
            .ChangeSlot(2).AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> HIEHIE_SOUL = ITEMS.register("hiehie_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_hiehie","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING.get(), 40, 5,true,false),
            		new MobEffectInstance(EffectCore.FROSTWALKER.get(), 40, 5,true,false))
            .ChangeSlot(2).ChangeModel("geo/rangerwing.geo.json").ifFlyingModelResource("geo/rangerwing.geo.json").AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> MAX_RYUSOUL = ITEMS.register("max_ryusoul",
            () -> new RyusoulItem(new Item.Properties(),0,"_max","ryusoul_red","ryusoul_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltchangerweapon.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> NOBLESSE = ITEMS.register("noblesse",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_noblesse","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 5,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 5,true,false))
            .ChangeSlot(2).ChangeModel("geo/noblesse.geo.json").AddCompatibilityList(RYUSOULGER));
    
	public static final RegistryObject<Item> SHIAWASE_SOUL = ITEMS.register("shiawase_soul",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> YAMAMORI_SOUL = ITEMS.register("yamamori_soul",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final RegistryObject<Item> UNFINISHED_RYUSOUL_CALIBUR = ITEMS.register("unfinished_ryusoul_calibur",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
    public static final RegistryObject<Item> RYUSOULGER_HELMET = ITEMS.register("ryusoulger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final RegistryObject<Item> RYUSOULGER_CHESTPLATE = ITEMS.register("ryusoulger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final RegistryObject<Item> RYUSOULGER_LEGGINGS = ITEMS.register("ryusoulger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> RED_RYUSOUL_CHANGER = ITEMS.register("red_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_red",RED_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(RED_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> BLUE_RYUSOUL_CHANGER = ITEMS.register("blue_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_blue",BLUE_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(BLUE_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> PINK_RYUSOUL_CHANGER = ITEMS.register("pink_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_pink",PINK_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(PINK_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> GREEN_RYUSOUL_CHANGER = ITEMS.register("green_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_green",GREEN_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(GREEN_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> BLACK_RYUSOUL_CHANGER = ITEMS.register("black_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_black",BLACK_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(BLACK_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> GOLD_MOSA_CHANGER = ITEMS.register("gold_mosa_changer",
    		() -> new MosaChangerItem(ArmorMaterials.DIAMOND,"ryusoul_gold",GOLD_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(GOLD_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> GAISOULG_CHANGER = ITEMS.register("gaisorg_changer",
    		() -> new GaisoulKenItem(ArmorMaterials.DIAMOND,"gaisoulg",GAI_SOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(GAI_SOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> BROWN_CHANGER = ITEMS.register("brown_changer",
    		() -> new GaisoulKenItem(ArmorMaterials.DIAMOND,"ryusoul_brown",BROWN_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(BROWN_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<Item> MORIA_RYUSOUL_CHANGER = ITEMS.register("moria_ryusoul_changer",
    		() -> new GaisoulKenItem(ArmorMaterials.DIAMOND,"ryusoul_moria",RED_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(RED_RYUSOUL).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<SwordItem> RYUSOUL_KEN = ITEMS.register("ryusoul_ken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<BaseBlasterItem> MOSA_CHANGER = ITEMS.register("mosa_changer",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<SwordItem> MOSA_BLADE = ITEMS.register("mosa_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<BaseBlasterItem> MOSA_BREAKER = ITEMS.register("mosa_breaker",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<SwordItem> GAISOUL_KEN = ITEMS.register("gaisoul_ken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<BaseShieldItem> GAISOUL_SHIELD = ITEMS.register("gaisoul_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<SwordItem> BROWN_RYUSOUL_KEN = ITEMS.register("brown_ryusoul_ken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<BaseShieldItem> BROWN_RYUSOUL_SHIELD = ITEMS.register("brown_ryusoul_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<SwordItem> MAX_RYUSOUL_CHANGER = ITEMS.register("max_ryusoul_changer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final RegistryObject<BaseSwordItem> RYUSOUL_CALIBUR = ITEMS.register("ryusoul_calibur",
			() -> new RyusoulCaliburItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static void register(IEventBus eventBus) {
			ITEMS.register(eventBus);
	}

}