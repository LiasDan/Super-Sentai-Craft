package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.sentai_40.shinkenger.SecretDiskItem;
import com.liasdan.supersentaicraft.items.sentai_40.shinkenger.ShodoPhoneItem;
import com.liasdan.supersentaicraft.items.sentai_40.shinkenger.SushiChangerItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShinkengerItems {

	public static String[] SHINKENGER= new String[] {"shinken_red","shinken_blue","shinken_pink","shinken_green","shinken_yellow","princess_shinken_red","shinken_gold"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> SHINKENGER_LOGO = ITEMS.register("shinkenger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));
    
	public static final DeferredItem<Item> KYOUTSU_DISK = ITEMS.register("common_disk",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SHISHI_DISK = ITEMS.register("shishi_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_red","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddCompatibilityList(new String[] {"princess_shinken_red"}).AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> RYUU_DISK = ITEMS.register("ryuu_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_blue","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> KAME_DISK = ITEMS.register("kame_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_pink","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> KUMA_DISK = ITEMS.register("kuma_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_green","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SARU_DISK = ITEMS.register("saru_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_yellow","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SUSHI_DISK = ITEMS.register("sushi_disk",
            () -> new SecretDiskItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"","shinken_gold","shinken_gold_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon1.geo.json").AddToTabList(RangerTabs.SHINKENGER));
    
	public static final DeferredItem<Item> INROMARU = ITEMS.register("inromaru",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SUPER_DISK = ITEMS.register("super_disk",
            () -> new SecretDiskItem(new Item.Properties().rarity(Rarity.RARE),0,"shinken_super_mode","","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 4,true,false))
            .ChangeSlot(2).BackToBase().addNeedItem(INROMARU.get()).AddCompatibilityList(SHINKENGER).AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SUPER_DISK_GOSEI = ITEMS.register("super_disk_gosei",
			() -> new SecretDiskItem(new Item.Properties().rarity(Rarity.RARE),0,"shinken_super_mode","","shinkenger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 4,true,false))
					.ChangeSlot(2).BackToBase().AddCompatibilityList(SHINKENGER));

	public static final DeferredItem<Item> HYPER_DISK = ITEMS.register("hyper_disk",
            () -> new SecretDiskItem(new Item.Properties().rarity(Rarity.EPIC),0,"shinken_hyper_mode","","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 5,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 5,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(SHINKENGER).AddToTabList(RangerTabs.SHINKENGER));
    
	public static final DeferredItem<Item> GEDOU_DISK = ITEMS.register("gedou_disk",
            () -> new SecretDiskItem(new Item.Properties().rarity(Rarity.RARE),0,"_gedou","shinken_red","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 4,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SAISHUU_OUGI_DISK = ITEMS.register("saishuu_ougi_disk",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> DAIGOYOU_DISK = ITEMS.register("daigoyou_disk",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));

	public static final DeferredItem<Item> SHINKENGER_HELMET = ITEMS.register("shinkenger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> SHINKENGER_CHESTPLATE = ITEMS.register("shinkenger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> SHINKENGER_LEGGINGS = ITEMS.register("shinkenger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final DeferredItem<Item> RED_SHODOPHONE = ITEMS.register("red_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_red",SHISHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> BLUE_SHODOPHONE = ITEMS.register("blue_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_blue",RYUU_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> PINK_SHODOPHONE = ITEMS.register("pink_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_pink",KAME_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> GREEN_SHODOPHONE = ITEMS.register("green_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_green",KUMA_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> YELLOW_SHODOPHONE = ITEMS.register("yellow_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_yellow",SARU_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> SUSHI_CHANGER = ITEMS.register("sushi_changer",
    		() -> new SushiChangerItem(ArmorMaterials.DIAMOND,"shinken_gold",SUSHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties().rarity(Rarity.UNCOMMON))
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<Item> PRINCESS_SHODOPHONE = ITEMS.register("princess_red_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"princess_shinken_red",SHISHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties().rarity(Rarity.UNCOMMON))
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final DeferredItem<SwordItem> SHINKENMARU = ITEMS.register("shinkenmaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final DeferredItem<SwordItem> REKKA_DAIZANTOU = ITEMS.register("rekka_daizantou",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<BaseBlasterItem> WATER_ARROW = ITEMS.register("water_arrow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
	public static final DeferredItem<SwordItem> HEAVEN_FAN = ITEMS.register("heaven_fan",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<SwordItem> WOOD_SPEAR = ITEMS.register("wood_spear",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<BaseThrowableItem> LAND_SLICER = ITEMS.register("land_slicer",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<SwordItem> SAKANAMARU = ITEMS.register("sakanamaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final DeferredItem<SwordItem> SUPER_SHINKENMARU = ITEMS.register("super_shinkenmaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties().rarity(Rarity.RARE)).KeepDifItem(SHINKENMARU.get()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final DeferredItem<SwordItem> KYORYUMARU = ITEMS.register("kyoryumaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).KeepDifItem(SHINKENMARU.get()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final DeferredItem<SwordItem> KYORYUMARU_SAKANAMARU = ITEMS.register("kyoryumaru_sakanamaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).KeepDifItem(SAKANAMARU.get()).ChangeRepairItem(KYOUTSU_DISK.get()));

	public static final DeferredItem<BaseBlasterItem> MOGYUU_BAZOOKA = ITEMS.register("mogyuu_bazooka",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.SMALL_FIREBALL).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
	public static final DeferredItem<BaseBlasterItem> SUPER_MOGYUU_BAZOOKA = ITEMS.register("super_mogyuu_bazooka",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).KeepDifItem(MOGYUU_BAZOOKA.get()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));

	public static final DeferredItem<SwordItem> DAIGOYOU_JITTE = ITEMS.register("daigoyou_jitte",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}