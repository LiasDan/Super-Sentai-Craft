package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.sentai_30.gogo_v.GoGoBraceItem;
import com.liasdan.supersentaicraft.items.sentai_30.gogo_v.TailInjectorItem;
import com.liasdan.supersentaicraft.items.sentai_30.gogo_v.VModeBraceItem;
import com.liasdan.supersentaicraft.items.sentai_30.gogo_v.ZeekCrystalItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GoGoVItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GOGO_V_LOGO = ITEMS.register("gogo_v_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_RED_BADGE = ITEMS.register("go_red_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","go_red","go_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace().ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_RED_BADGE_KYOKO = ITEMS.register("go_red_badge_kyoko",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_red_kyoko","go_red_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace().ChangeBeltModel("rangerbeltextra.geo.json"));

	public static final DeferredItem<Item> GO_BLUE_BADGE = ITEMS.register("go_blue_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_blue","go_blue_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace().ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_GREEN_BADGE = ITEMS.register("go_green_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_green","go_green_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace().ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_YELLOW_BADGE = ITEMS.register("go_yellow_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_yellow","go_yellow_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace().ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_PINK_BADGE = ITEMS.register("go_pink_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_pink","go_pink_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace().ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> ZEEK_CRYSTAL_FRAGMENT = ITEMS.register("zeek_fragment",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","zeek","zeek_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).ChangeBeltModel("rangerbeltweapon1.geo.json").AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> JEANNE_CRYSTAL_FRAGMENT = ITEMS.register("jeanne_fragment",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","zeek_jeanne","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).SetShowFace());

	public static final DeferredItem<Item> GOGO_V_HELMET = ITEMS.register("gogo_v_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
    public static final DeferredItem<Item> GOGO_V_CHESTPLATE = ITEMS.register("gogo_v_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
    public static final DeferredItem<Item> GOGO_V_LEGGINGS = ITEMS.register("gogo_v_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
    
    public static final DeferredItem<Item> RED_GOGO_BRACE = ITEMS.register("red_gogo_brace",
    		() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_red",GO_RED_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> BLUE_GOGO_BRACE = ITEMS.register("blue_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_blue",GO_BLUE_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> GREEN_GOGO_BRACE = ITEMS.register("green_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_green",GO_GREEN_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> YELLOW_GOGO_BRACE = ITEMS.register("yellow_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_yellow",GO_YELLOW_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> PINK_GOGO_BRACE = ITEMS.register("pink_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_pink",GO_PINK_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<Item> ZEEK_CRYSTAL = ITEMS.register("zeek_crystal",
			() -> new ZeekCrystalItem(ArmorMaterials.DIAMOND,"zeek",ZEEK_CRYSTAL_FRAGMENT,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> JEANNE_CRYSTAL = ITEMS.register("jeanne_crystal",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"zeek_jeanne",JEANNE_CRYSTAL_FRAGMENT,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> RED_KYOKO_GOGO_BRACE = ITEMS.register("red_kyoko_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_red_kyoko",GO_RED_BADGE_KYOKO,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<Item> V_MODE_BRACE = ITEMS.register("v_mode_brace",
			() -> new VModeBraceItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> LASER_GRIP_RED = ITEMS.register("laser_grip_red",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));
	public static final DeferredItem<Item> LASER_GRIP_BLUE = ITEMS.register("laser_grip_blue",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));
	public static final DeferredItem<Item> LASER_GRIP_GREEN = ITEMS.register("laser_grip_green",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));
	public static final DeferredItem<Item> LASER_GRIP_YELLOW = ITEMS.register("laser_grip_yellow",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));
	public static final DeferredItem<Item> LASER_GRIP_PINK = ITEMS.register("laser_grip_pink",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<BaseBlasterItem> FIVE_LASER_RED = ITEMS.register("five_laser_red",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> FIVE_LASER_BLUE = ITEMS.register("five_laser_blue",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> FIVE_LASER_GREEN = ITEMS.register("five_laser_green",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> FIVE_LASER_YELLOW = ITEMS.register("five_laser_yellow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> FIVE_LASER_PINK = ITEMS.register("five_laser_pink",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<BaseThrowableItem> V_BOOMERANG_RED = ITEMS.register("v_boomerang_red",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseThrowableItem> V_BOOMERANG_BLUE = ITEMS.register("v_boomerang_blue",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseThrowableItem> V_BOOMERANG_GREEN = ITEMS.register("v_boomerang_green",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseThrowableItem> V_BOOMERANG_YELLOW = ITEMS.register("v_boomerang_yellow",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseThrowableItem> V_BOOMERANG_PINK = ITEMS.register("v_boomerang_pink",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<SwordItem> V_LANCER_RED = ITEMS.register("v_lancer_red",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<SwordItem> V_LANCER_BLUE = ITEMS.register("v_lancer_blue",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<SwordItem> V_LANCER_GREEN = ITEMS.register("v_lancer_green",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<SwordItem> V_LANCER_YELLOW = ITEMS.register("v_lancer_yellow",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<SwordItem> V_LANCER_PINK = ITEMS.register("v_lancer_pink",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> V_MACHINE_GUN_RED = ITEMS.register("v_machine_gun_red",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).KeepDifItem(V_LANCER_RED.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> V_MACHINE_GUN_BLUE = ITEMS.register("v_machine_gun_blue",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).KeepDifItem(V_LANCER_BLUE.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> V_MACHINE_GUN_GREEN = ITEMS.register("v_machine_gun_green",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).KeepDifItem(V_LANCER_GREEN.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> V_MACHINE_GUN_YELLOW = ITEMS.register("v_machine_gun_yellow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).KeepDifItem(V_LANCER_YELLOW.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> V_MACHINE_GUN_PINK = ITEMS.register("v_machine_gun_pink",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).KeepDifItem(V_LANCER_PINK.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_RED = ITEMS.register("go_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_BLUE = ITEMS.register("go_blaster_blue",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_GREEN = ITEMS.register("go_blaster_green",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_YELLOW = ITEMS.register("go_blaster_yellow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_PINK = ITEMS.register("go_blaster_pink",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_HYPER_RED = ITEMS.register("go_blaster_hyper",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(GO_BLASTER_RED.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_HYPER_BLUE = ITEMS.register("go_blaster_hyper_blue",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(GO_BLASTER_BLUE.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_HYPER_GREEN = ITEMS.register("go_blaster_hyper_green",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(GO_BLASTER_GREEN.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_HYPER_YELLOW = ITEMS.register("go_blaster_hyper_yellow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(GO_BLASTER_YELLOW.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> GO_BLASTER_HYPER_PINK = ITEMS.register("go_blaster_hyper_pink",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(GO_BLASTER_PINK.get()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<SwordItem> ZEEK_SWORD = ITEMS.register("zeek_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> ZEEK_SHOT = ITEMS.register("zeek_shot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> ZEEK_BLASTER = ITEMS.register("zeek_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<SwordItem> CLAW_ANCHOR = ITEMS.register("claw_anchor",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> BUILD_DISCHARGER = ITEMS.register("build_discharger",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<SwordItem> WING_SPREADER = ITEMS.register("wing_spreader",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<PickaxeItem> BEAK_DRILLER = ITEMS.register("beak_driller",
			() -> new BasePickaxeItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> TAIL_INJECTOR = ITEMS.register("tail_injector",
			() -> new TailInjectorItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> LIFE_BIRD_BREAKER_MODE = ITEMS.register("life_bird_breaker_mode",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}