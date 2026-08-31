package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.machine.MiniatureEnetronTank;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.ally.DatasEntity;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_40.go_busters.MorphinBlasterItem;
import com.liasdan.supersentaicraft.items.sentai_40.goseiger.GoseiCardItem;
import com.liasdan.supersentaicraft.items.sentai_40.goseiger.HyperChangeCardItem;
import com.liasdan.supersentaicraft.items.sentai_40.goseiger.SuperChangeCardItem;
import com.liasdan.supersentaicraft.items.sentai_40.goseiger.TensouderItem;
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
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.MAIN_CARD,25));

	public static final DeferredItem<Item> GOSEI_PINK_CARD = ITEMS.register("gosei_pink_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_pink","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.MAIN_CARD,25));

	public static final DeferredItem<Item> GOSEI_BLACK_CARD = ITEMS.register("gosei_black_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_black","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.MAIN_CARD,25));

	public static final DeferredItem<Item> GOSEI_YELLOW_CARD = ITEMS.register("gosei_yellow_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_yellow","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.MAIN_CARD,25));

	public static final DeferredItem<Item> GOSEI_BLUE_CARD = ITEMS.register("gosei_blue_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_blue","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 0,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.MAIN_CARD,25));

	public static final DeferredItem<Item> GOSEI_KNIGHT_CARD = ITEMS.register("gosei_knight_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_knight","gosei_knight_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false)).AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_GREEN_CARD = ITEMS.register("gosei_green_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gosei_green","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 0,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.MAIN_CARD,15));

	public static final DeferredItem<Item> RED_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("red_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_red","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> PINK_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("pink_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_pink","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> BLACK_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("black_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_black","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> YELLOW_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("yellow_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_yellow","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> BLUE_MIRACLE_GOSEI_POWER_CARD = ITEMS.register("blue_miracle_gosei_power_card",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","gosei_blue","goseiger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> SKICK_SWORD_CARD = ITEMS.register("skick_sword_card",
			() -> new GoseiCardItem(new Item.Properties(),"gosei_red","skick_sword").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.RED_CARD,10));
	public static final DeferredItem<Item> SKICK_SHOT_CARD = ITEMS.register("skick_shot_card",
			() -> new GoseiCardItem(new Item.Properties(),"gosei_pink","skick_shot").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.PINK_CARD,10));
	public static final DeferredItem<Item> LANDICK_AXE_CARD = ITEMS.register("landick_axe_card",
			() -> new GoseiCardItem(new Item.Properties(),"gosei_black","landick_axe").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.BLACK_CARD,10));
	public static final DeferredItem<Item> LANDICK_CLAW_CARD = ITEMS.register("landick_claw_card",
			() -> new GoseiCardItem(new Item.Properties(),"gosei_pink","landick_claw").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.YELLOW_CARD,10));
	public static final DeferredItem<Item> SEAICK_BOWGUN_CARD = ITEMS.register("seaick_bowgun_card",
			() -> new GoseiCardItem(new Item.Properties(),"gosei_blue","seaick_bowgun").AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.BLUE_CARD,10));

	public static final DeferredItem<Item> DRAGON_HEADDER_CARD = ITEMS.register("dragon_headder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.RED_CARD,10));
	public static final DeferredItem<Item> PHOENIX_HEADDER_CARD = ITEMS.register("phoenix_headder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.PINK_CARD,10));
	public static final DeferredItem<Item> SNAKE_HEADDER_CARD = ITEMS.register("snake_headder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.BLACK_CARD,10));
	public static final DeferredItem<Item> TIGER_HEADDER_CARD = ITEMS.register("tiger_headder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.YELLOW_CARD,10));
	public static final DeferredItem<Item> SHARK_HEADDER_CARD = ITEMS.register("shark_headder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.BLUE_CARD,10));
	public static final DeferredItem<Item> VULCAN_HEADDER_CARD = ITEMS.register("vulcan_headder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.KNIGHT_CARD,10));

	public static final DeferredItem<Item> SKICK_BROTHER_CARD = ITEMS.register("skick_brother_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.RED_CARD,5).AddToList(DatasEntity.PINK_CARD,5));
	public static final DeferredItem<Item> LANDICK_BROTHER_CARD = ITEMS.register("landick_brother_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.BLACK_CARD,5).AddToList(DatasEntity.YELLOW_CARD,5));
	public static final DeferredItem<Item> SEAICK_BROTHER_CARD = ITEMS.register("seaick_brother_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.BLUE_CARD,5));
	public static final DeferredItem<Item> MYTHIC_BROTHER_CARD = ITEMS.register("mythic_brother_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.RED_CARD,5).AddToList(DatasEntity.PINK_CARD,5)
					.AddToList(DatasEntity.BLACK_CARD,5).AddToList(DatasEntity.YELLOW_CARD,5).AddToList(DatasEntity.BLUE_CARD,5));
	public static final DeferredItem<Item> EXOTIC_BROTHER_CARD = ITEMS.register("exotic_brother_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).AddToList(DatasEntity.RED_CARD,5).AddToList(DatasEntity.PINK_CARD,5));
	public static final DeferredItem<Item> HYPER_CHANGE_HEADDER_CARD = ITEMS.register("hyper_change_headder_card",
			() -> new HyperChangeCardItem(new Item.Properties(),MobsCore.DATAS).AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEI_WONDER_CARD = ITEMS.register("gosei_wonder_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER));
	public static final DeferredItem<Item> GOSEI_ULTIMATE_CARD = ITEMS.register("gosei_ultimate_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> SUPER_CHANGE_SHINKEN_RED_CARD = ITEMS.register("super_change_shinken_red_card",
			() -> new SuperChangeCardItem(new Item.Properties(),"shinken_red").AddToTabList(RangerTabs.GOSEIGER));
	public static final DeferredItem<Item> SUPER_CHANGE_SHINKEN_BLUE_CARD = ITEMS.register("super_change_shinken_blue_card",
			() -> new SuperChangeCardItem(new Item.Properties(),"shinken_blue").AddToTabList(RangerTabs.GOSEIGER));
	public static final DeferredItem<Item> SUPER_CHANGE_SHINKEN_PINK_CARD = ITEMS.register("super_change_shinken_pink_card",
			() -> new SuperChangeCardItem(new Item.Properties(),"shinken_pink").AddToTabList(RangerTabs.GOSEIGER));
	public static final DeferredItem<Item> SUPER_CHANGE_SHINKEN_GREEN_CARD = ITEMS.register("super_change_shinken_green_card",
			() -> new SuperChangeCardItem(new Item.Properties(),"shinken_green").AddToTabList(RangerTabs.GOSEIGER));
	public static final DeferredItem<Item> SUPER_CHANGE_SHINKEN_YELLOW_CARD = ITEMS.register("super_change_shinken_yellow_card",
			() -> new SuperChangeCardItem(new Item.Properties(),"shinken_yellow").AddToTabList(RangerTabs.GOSEIGER));
	public static final DeferredItem<Item> SUPER_CHANGE_SHINKEN_GOLD_CARD = ITEMS.register("super_change_shinken_gold_card",
			() -> new SuperChangeCardItem(new Item.Properties(),"shinken_gold").AddToTabList(RangerTabs.GOSEIGER));

	public static final DeferredItem<Item> GOSEIGER_HELMET = ITEMS.register("goseiger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
    public static final DeferredItem<Item> GOSEIGER_CHESTPLATE = ITEMS.register("goseiger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
    public static final DeferredItem<Item> GOSEIGER_LEGGINGS = ITEMS.register("goseiger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

   	public static final DeferredItem<Item> RED_TENSOUDER = ITEMS.register("red_tensouder",
   			() -> new TensouderItem(ArmorMaterials.DIAMOND,"gosei_red",GOSEI_RED_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> PINK_TENSOUDER = ITEMS.register("pink_tensouder",
			() -> new TensouderItem(ArmorMaterials.DIAMOND,"gosei_pink",GOSEI_PINK_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> BLACK_TENSOUDER = ITEMS.register("black_tensouder",
			() -> new TensouderItem(ArmorMaterials.DIAMOND,"gosei_black",GOSEI_BLACK_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> YELLOW_TENSOUDER = ITEMS.register("yellow_tensouder",
			() -> new TensouderItem(ArmorMaterials.DIAMOND,"gosei_yellow",GOSEI_YELLOW_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> BLUE_TENSOUDER = ITEMS.register("blue_tensouder",
			() -> new TensouderItem(ArmorMaterials.DIAMOND,"gosei_blue",GOSEI_BLUE_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<Item> LEON_CELLULAR = ITEMS.register("leon_cellular",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_knight",GOSEI_KNIGHT_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));
	public static final DeferredItem<Item> LEON_CELLULAR_DARK = ITEMS.register("leon_cellular_dark",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gosei_knight_dark",GOSEI_KNIGHT_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static final DeferredItem<Item> GREEN_TENSOUDER = ITEMS.register("green_tensouder",
			() -> new TensouderItem(ArmorMaterials.DIAMOND,"gosei_green",GOSEI_GREEN_CARD,GOSEIGER_HELMET,GOSEIGER_CHESTPLATE,GOSEIGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

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
	public static final DeferredItem<SwordItem> SUPER_GOSEI_TENSWORD = ITEMS.register("super_gosei_tensword",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).IsDualWeapon().AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(BLANK_GOSEI_CARD.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}