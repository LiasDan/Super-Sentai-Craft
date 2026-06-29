package com.liasdan.supersentaicraft.items.sentai_10;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_10.denziman.DenziPunchItem;
import com.liasdan.supersentaicraft.items.sentai_10.denziman.DenziRingItem;
import com.liasdan.supersentaicraft.items.sentai_10.sun_vulcan.VulcanBraceItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DenzimanItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> DENZIMAN_LOGO = ITEMS.register("denziman_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> EMPTY_DENZI_RING = ITEMS.register("empty_denzi_ring",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> RED_DENZI_GEM = ITEMS.register("red_denzi_gem",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","denzi_red","denzi_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> BLUE_DENZI_GEM = ITEMS.register("blue_denzi_gem",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","denzi_blue","denzi_blue_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> YELLOW_DENZI_GEM = ITEMS.register("yellow_denzi_gem",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","denzi_yellow","denzi_yellow_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> GREEN_DENZI_GEM = ITEMS.register("green_denzi_gem",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","denzi_green","denzi_green_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> PINK_DENZI_GEM = ITEMS.register("pink_denzi_gem",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","denzi_pink","denzi_pink_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.DENZIMAN));

	public static final DeferredItem<Item> DENZIMAN_HELMET = ITEMS.register("denziman_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
    public static final DeferredItem<Item> DENZIMAN_CHESTPLATE = ITEMS.register("denziman_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
    public static final DeferredItem<Item> DENZIMAN_LEGGINGS = ITEMS.register("denziman_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
    
    public static final DeferredItem<Item> RED_DENZI_RING = ITEMS.register("red_denzi_ring",
    		() -> new DenziRingItem(ArmorMaterials.DIAMOND,"denzi_red",RED_DENZI_GEM,DENZIMAN_HELMET,DENZIMAN_CHESTPLATE,DENZIMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<Item> BLUE_DENZI_RING = ITEMS.register("blue_denzi_ring",
			() -> new DenziRingItem(ArmorMaterials.DIAMOND,"denzi_blue",BLUE_DENZI_GEM,DENZIMAN_HELMET,DENZIMAN_CHESTPLATE,DENZIMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<Item> YELLOW_DENZI_RING = ITEMS.register("yellow_denzi_ring",
			() -> new DenziRingItem(ArmorMaterials.DIAMOND,"denzi_yellow",YELLOW_DENZI_GEM,DENZIMAN_HELMET,DENZIMAN_CHESTPLATE,DENZIMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<Item> GREEN_DENZI_RING = ITEMS.register("green_denzi_ring",
			() -> new DenziRingItem(ArmorMaterials.DIAMOND,"denzi_green",GREEN_DENZI_GEM,DENZIMAN_HELMET,DENZIMAN_CHESTPLATE,DENZIMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<Item> PINK_DENZI_RING = ITEMS.register("pink_denzi_ring",
			() -> new DenziRingItem(ArmorMaterials.DIAMOND,"denzi_pink",PINK_DENZI_GEM,DENZIMAN_HELMET,DENZIMAN_CHESTPLATE,DENZIMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));

	public static final DeferredItem<SwordItem> RED_DENZI_STICK = ITEMS.register("red_denzi_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> BLUE_DENZI_STICK = ITEMS.register("blue_denzi_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> YELLOW_DENZI_STICK = ITEMS.register("yellow_denzi_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> GREEN_DENZI_STICK = ITEMS.register("green_denzi_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> PINK_DENZI_STICK = ITEMS.register("pink_denzi_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));

	public static final DeferredItem<SwordItem> DENZI_PUNCH = ITEMS.register("denzi_punch",
			() -> new DenziPunchItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> DENZI_PUNCH1 = ITEMS.register("denzi_punch1",
			() -> new DenziPunchItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));

	public static final DeferredItem<SwordItem> RED_DENZI_BAT = ITEMS.register("red_denzi_bat",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> BLUE_DENZI_BAT = ITEMS.register("blue_denzi_bat",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> YELLOW_DENZI_BAT = ITEMS.register("yellow_denzi_bat",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> GREEN_DENZI_BAT = ITEMS.register("green_denzi_bat",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));
	public static final DeferredItem<SwordItem> PINK_DENZI_BAT = ITEMS.register("pink_denzi_bat",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));

	public static final DeferredItem<BaseBlasterItem> DENZI_SHOCK_GUN = ITEMS.register("denzi_shock_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));

	public static final DeferredItem<SwordItem> DENZI_PINK_SWORD = ITEMS.register("denzi_pink_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(EMPTY_DENZI_RING.get()));

	public static final DeferredItem<Item> DAI_DENZIN = ITEMS.register("dai_denzin",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","dai_denzin", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)));

	public static final DeferredItem<Item> DAI_DENZIN_BOOTS = ITEMS.register("dai_denzin_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> DAI_DENZIN_LEGGINGS = ITEMS.register("dai_denzin_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> DAI_DENZIN_CHESTPLATE = ITEMS.register("dai_denzin_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

    public static final DeferredItem<Item> DAI_DENZIN_HELMET = ITEMS.register("dai_denzin_head",
            () -> new MechaGattaiItem(ArmorMaterials.NETHERITE,"dai_denzin",DAI_DENZIN,DAI_DENZIN_CHESTPLATE,DAI_DENZIN_LEGGINGS,DAI_DENZIN_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

    public static final DeferredItem<SwordItem> DENZI_KEN = ITEMS.register("denzi_ken",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<SwordItem> DENZI_BALL = ITEMS.register("denzi_ball",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<SwordItem> DAI_DENZIN_BOOMERANG = ITEMS.register("dai_denzin_boomerang",
			() -> new BaseThrowableItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.DENZIMAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}