package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseExplosiveItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sun_vulcan.VulcanBraceItem;

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

public class SunVulcanItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> SUN_VULCAN_LOGO = ITEMS.register("sun_vulcan_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN));

	public static final RegistryObject<Item> VUL_EAGLE_SYMBOL = ITEMS.register("vul_eagle_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","vul_eagle","vul_eagle_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FLYING.get(), 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.SUN_VULCAN));

	public static final RegistryObject<Item> VUL_SHARK_SYMBOL = ITEMS.register("vul_shark_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","vul_shark","vul_shark_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.PUNCH.get(), 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.SUN_VULCAN));

	public static final RegistryObject<Item> VUL_PANTHER_SYMBOL = ITEMS.register("vul_panther_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","vul_panther","vul_panther_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.PUNCH.get(), 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.SUN_VULCAN));
	
	public static final RegistryObject<Item> SUN_VULCAN_HELMET = ITEMS.register("sun_vulcan_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final RegistryObject<Item> SUN_VULCAN_CHESTPLATE = ITEMS.register("sun_vulcan_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final RegistryObject<Item> SUN_VULCAN_LEGGINGS = ITEMS.register("sun_vulcan_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    
    public static final RegistryObject<Item> EAGLE_VULCAN_BRACE = ITEMS.register("eagle_vulcan_brace",
    		() -> new VulcanBraceItem(ArmorMaterials.DIAMOND,"vul_eagle",VUL_EAGLE_SYMBOL,SUN_VULCAN_HELMET,SUN_VULCAN_CHESTPLATE,SUN_VULCAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final RegistryObject<Item> SHARK_VULCAN_BRACE = ITEMS.register("shark_vulcan_brace",
    		() -> new VulcanBraceItem(ArmorMaterials.DIAMOND,"vul_shark",VUL_SHARK_SYMBOL,SUN_VULCAN_HELMET,SUN_VULCAN_CHESTPLATE,SUN_VULCAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final RegistryObject<Item> PANTHER_VULCAN_BRACE = ITEMS.register("panther_vulcan_brace",
    		() -> new VulcanBraceItem(ArmorMaterials.DIAMOND,"vul_panther",VUL_PANTHER_SYMBOL,SUN_VULCAN_HELMET,SUN_VULCAN_CHESTPLATE,SUN_VULCAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    
    public static final RegistryObject<SwordItem> VULCAN_STICK = ITEMS.register("vulcan_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final RegistryObject<SwordItem> VULCAN_STICK_EAGLE = ITEMS.register("vulcan_stick_eagle",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    
    public static final RegistryObject<Item> SUN_VULCAN_ROBO_BOOTS = ITEMS.register("sun_vulcan_robo_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final RegistryObject<Item> SUN_VULCAN_ROBO_LEGGINGS = ITEMS.register("sun_vulcan_robo_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final RegistryObject<Item> SUN_VULCAN_ROBO_CHESTPLATE = ITEMS.register("sun_vulcan_robo_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    
    public static final RegistryObject<Item> SUN_VULCAN_ROBO_HELMET = ITEMS.register("sun_vulcan_robo_head",
            () -> new MechaGattaiItem(ArmorMaterials.DIAMOND,"sun_vulcan_robo",OtherItems.MECHA_GEAR,SUN_VULCAN_ROBO_CHESTPLATE,SUN_VULCAN_ROBO_LEGGINGS,SUN_VULCAN_ROBO_BOOTS, new Item.Properties())
            .Add_Extra_Base_Form_Items(OtherItems.MECHA_GEAR).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    
    public static final RegistryObject<SwordItem> TAIYO_KEN = ITEMS.register("taiyo_ken",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));    
    public static final RegistryObject<BaseShieldItem> VUL_SHIELD = ITEMS.register("vul_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));   
    public static final RegistryObject<SwordItem> VUL_TONFA = ITEMS.register("vul_tonfa",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final RegistryObject<SwordItem> VUL_HAND = ITEMS.register("vul_hand",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    
    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}