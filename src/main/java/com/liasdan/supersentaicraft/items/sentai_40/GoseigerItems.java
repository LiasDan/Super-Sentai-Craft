package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.machine.MiniatureEnetronTank;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_40.go_busters.MorphinBlasterItem;
import com.liasdan.supersentaicraft.particle.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GoseigerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GOSEIGER_LOGO = ITEMS.register("goseiger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> BLANK_GOSEI_CARD = ITEMS.register("blank_gosei_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_RED_CARD = ITEMS.register("gosei_red_card",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_red","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_PINK_CARD = ITEMS.register("gosei_pink_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_pink","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_BLACK_CARD = ITEMS.register("gosei_black_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_black","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_YELLOW_CARD = ITEMS.register("gosei_yellow_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_yellow","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_BLUE_CARD = ITEMS.register("gosei_blue_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_blue","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_KNIGHT_CARD = ITEMS.register("gosei_knight_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_knight","gosei_knight_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_GREEN_CARD = ITEMS.register("gosei_green_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_green","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> RED_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("red_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_red","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> PINK_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("pink_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_pink","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> BLACK_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("black_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_black","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> YELLOW_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("yellow_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_yellow","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> BLUE_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("blue_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_blue","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEIGER_HELMET = ITEMS.register("goseiger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
    public static final DeferredItem<Item> GOSEIGER_CHESTPLATE = ITEMS.register("goseiger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
    public static final DeferredItem<Item> GOSEIGER_LEGGINGS = ITEMS.register("goseiger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

   	public static final DeferredItem<Item> RED_TENSOUDER = ITEMS.register("red_tensouder",
   		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_red",GOSEI_RED_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> PINK_TENSOUDER = ITEMS.register("pink_tensouder",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_pink",GOSEI_PINK_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> BLACK_TENSOUDER = ITEMS.register("black_tensouder",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_black",GOSEI_BLACK_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> YELLOW_TENSOUDER = ITEMS.register("yellow_tensouder",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_yellow",GOSEI_YELLOW_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> BLUE_TENSOUDER = ITEMS.register("blue_tensouder",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_blue",GOSEI_BLUE_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<Item> LEON_CELLULAR = ITEMS.register("leon_cellular",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_knight",GOSEI_KNIGHT_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<Item> GREEN_TENSOUDER = ITEMS.register("green_tensouder",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_green",GOSEI_GREEN_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<BaseBlasterItem> GOSEI_BLASTER = ITEMS.register("gosei_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<BaseBlasterItem> GOSEI_BLASTER_DRAGON = ITEMS.register("gosei_blaster_dragon",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> GOSEI_BLASTER_PHOENIX = ITEMS.register("gosei_blaster_phoenix",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> GOSEI_BLASTER_SNAKE = ITEMS.register("gosei_blaster_snake",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> GOSEI_BLASTER_TIGER = ITEMS.register("gosei_blaster_tiger",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> GOSEI_BLASTER_SHARK = ITEMS.register("gosei_blaster_shark",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<SwordItem> SKICK_SWORD = ITEMS.register("skick_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> SKICK_SHOT = ITEMS.register("skick_shot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<SwordItem> LANDICK_AXE = ITEMS.register("landick_axe",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<SwordItem> LANDICK_CLAW = ITEMS.register("landick_claw",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> SEAICK_BOWGUN = ITEMS.register("seaick_bowgun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<BaseBlasterItem> SKY_BUSTER = ITEMS.register("sky_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.SMALL_FIREBALL).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> LAND_SEA_BUSTER = ITEMS.register("land_sea_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.SMALL_FIREBALL).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> GOSEI_BUSTER = ITEMS.register("gosei_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<BaseBlasterItem> LEON_LASER = ITEMS.register("leon_laser_sword",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<BaseBlasterItem> DYNAMIC_LEON_LASER = ITEMS.register("dynamic_leon_laser",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsSuperGun().AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<SwordItem> GOSEI_TENSWORD = ITEMS.register("gosei_tensword",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).IsDualWeapon().AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}