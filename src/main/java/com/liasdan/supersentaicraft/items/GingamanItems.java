package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.items.gingaman.BullRiotItem;
import com.liasdan.supersentaicraft.items.gingaman.GingaBraceItem;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
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

public class GingamanItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> GINGAMAN_LOGO = ITEMS.register("gingaman_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN));

	public static final RegistryObject<Item> RED_GINGA_MEDAL = ITEMS.register("red_ginga_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ginga_red","gingaman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.GINGAMAN));
    
	public static final RegistryObject<Item> GREEN_GINGA_MEDAL = ITEMS.register("green_ginga_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ginga_green","gingaman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FLYING.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.GINGAMAN));
    
	public static final RegistryObject<Item> BLUE_GINGA_MEDAL = ITEMS.register("blue_ginga_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ginga_blue","gingaman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.GINGAMAN));
    
	public static final RegistryObject<Item> YELLOW_GINGA_MEDAL = ITEMS.register("yellow_ginga_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ginga_yellow","gingaman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.GINGAMAN));
    
	public static final RegistryObject<Item> PINK_GINGA_MEDAL = ITEMS.register("pink_ginga_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ginga_pink","gingaman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.GINGAMAN));
    
	public static final RegistryObject<Item> BLACK_KNIGHT_CORE = ITEMS.register("black_knight_core",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","black_knight","black_knight_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeModel("geo/black_knight.geo.json").ChangeBeltModel("geo/black_knight_belt.geo.json").AddToTabList(RangerTabs.GINGAMAN));
    
    public static final RegistryObject<Item> GINGA_NO_HIKARI = ITEMS.register("lights_of_ginga",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_beast_armor_shine","ginga_red","beast_armor_shine_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 400, 3,true,false))
            .ChangeSlot(2).ChangeBeltModel("geo/rangerbeltextra.geo.json")
            .AddCompatibilityList(new String[] {"ginga_green","ginga_blue","ginga_yellow","ginga_pink"}).AddToTabList(RangerTabs.GINGAMAN));
    
    public static final RegistryObject<Item> GINGAMAN_HELMET = ITEMS.register("gingaman_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    public static final RegistryObject<Item> GINGAMAN_CHESTPLATE = ITEMS.register("gingaman_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    public static final RegistryObject<Item> GINGAMAN_LEGGINGS = ITEMS.register("gingaman_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<Item> RED_GINGA_BRACE = ITEMS.register("red_ginga_brace",
    		() -> new GingaBraceItem(ArmorMaterials.DIAMOND,"ginga_red",RED_GINGA_MEDAL,GINGAMAN_HELMET,GINGAMAN_CHESTPLATE,GINGAMAN_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(RED_GINGA_MEDAL).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<Item> GREEN_GINGA_BRACE = ITEMS.register("green_ginga_brace",
    		() -> new GingaBraceItem(ArmorMaterials.DIAMOND,"ginga_green",GREEN_GINGA_MEDAL,GINGAMAN_HELMET,GINGAMAN_CHESTPLATE,GINGAMAN_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(GREEN_GINGA_MEDAL).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<Item> BLUE_GINGA_BRACE = ITEMS.register("blue_ginga_brace",
    		() -> new GingaBraceItem(ArmorMaterials.DIAMOND,"ginga_blue",BLUE_GINGA_MEDAL,GINGAMAN_HELMET,GINGAMAN_CHESTPLATE,GINGAMAN_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(BLUE_GINGA_MEDAL).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<Item> YELLOW_GINGA_BRACE = ITEMS.register("yellow_ginga_brace",
    		() -> new GingaBraceItem(ArmorMaterials.DIAMOND,"ginga_yellow",YELLOW_GINGA_MEDAL,GINGAMAN_HELMET,GINGAMAN_CHESTPLATE,GINGAMAN_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(YELLOW_GINGA_MEDAL).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<Item> PINK_GINGA_BRACE = ITEMS.register("pink_ginga_brace",
    		() -> new GingaBraceItem(ArmorMaterials.DIAMOND,"ginga_pink",PINK_GINGA_MEDAL,GINGAMAN_HELMET,GINGAMAN_CHESTPLATE,GINGAMAN_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(PINK_GINGA_MEDAL).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<Item> BLACK_KNIGHT_BULL_RIOT = ITEMS.register("black_knight_bull_riot",
    		() -> new BullRiotItem(ArmorMaterials.DIAMOND,"black_knight",BLACK_KNIGHT_CORE,GINGAMAN_HELMET,GINGAMAN_CHESTPLATE,GINGAMAN_LEGGINGS,new Item.Properties())
    		.AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<SwordItem> SEIJUUKEN = ITEMS.register("starbeast_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<SwordItem> KIBA_CUTTER = ITEMS.register("kiba_cutter",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<BaseBlasterItem> KIBA_SHOT = ITEMS.register("kiba_shot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<SwordItem> KIBA_CLAW = ITEMS.register("kiba_claw",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<SwordItem> KIBA_KNIFE = ITEMS.register("kiba_knife",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
    
    public static final RegistryObject<BaseBlasterItem> KIBA_ARROW = ITEMS.register("kiba_arrow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<BaseBlasterItem> JUUGEKIBOU_RED = ITEMS.register("beast_attack_rod_red",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<BaseBlasterItem> JUUGEKIBOU_GREEN = ITEMS.register("beast_attack_rod_green",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<BaseBlasterItem> JUUGEKIBOU_BLUE = ITEMS.register("beast_attack_rod_blue",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<BaseBlasterItem> JUUGEKIBOU_YELLOW = ITEMS.register("beast_attack_rod_yellow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<BaseBlasterItem> JUUGEKIBOU_PINK = ITEMS.register("beast_attack_rod_pink",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(ModClientEvents.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static final RegistryObject<BaseBlasterItem> BULL_RIOT = ITEMS.register("bull_riot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).isChanger(BLACK_KNIGHT_BULL_RIOT.get()).AddToTabList(ModClientEvents.SWORD_GUN_ITEM).AddToTabList(RangerTabs.GINGAMAN).ChangeRepairItem(GINGAMAN_LOGO.get()));
	
    public static void register(IEventBus eventBus) {
    	ITEMS.register(eventBus);
    }

}