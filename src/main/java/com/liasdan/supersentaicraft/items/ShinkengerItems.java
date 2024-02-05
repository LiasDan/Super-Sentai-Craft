package com.liasdan.supersentaicraft.items;

import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.shinkenger.SecretDiskItem;
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

public class ShinkengerItems {

	public static String[] SHINKENGER= new String[] {"shinken_red","shinken_blue","shinken_pink","shinken_green","shinken_yellow","princess_shinken_red","shinken_gold"};
	
	public static List<Item> NeedShinkenmaru= new ArrayList<Item>();
	public static List<Item> NeedSakanamaru= new ArrayList<Item>();
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> SHINKENGER_LOGO = ITEMS.register("shinkenger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));
    
	public static final RegistryObject<Item> KYOUTSU_DISK = ITEMS.register("common_disk",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> SHISHI_DISK = ITEMS.register("shishi_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_red","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIRESLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddCompatibilityList(new String[] {"princess_shinken_red"}).AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> RYUU_DISK = ITEMS.register("ryuu_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_blue","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> KAME_DISK = ITEMS.register("kame_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_pink","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> KUMA_DISK = ITEMS.register("kuma_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_green","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> SARU_DISK = ITEMS.register("saru_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_yellow","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));
    
	public static final RegistryObject<Item> SUSHI_DISK = ITEMS.register("sushi_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"","shinken_gold","shinken_gold_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 2,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));
    
	public static final RegistryObject<Item> INROMARU = ITEMS.register("inromaru",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));
	
	public static final RegistryObject<Item> SUPER_DISK = ITEMS.register("super_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"shinken_super_mode","","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING.get(), 40, 4,true,false))
            .ChangeSlot(2).addNeedItem(INROMARU.get()).AddCompatibilityList(SHINKENGER).AddToTabList(RangerTabs.SHINKENGER));
    
	public static final RegistryObject<Item> HYPER_DISK = ITEMS.register("hyper_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"shinken_hyper_mode","","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 5,true,false),
            		new MobEffectInstance(EffectCore.FLYING.get(), 40, 5,true,false))
            .ChangeSlot(2).AddCompatibilityList(SHINKENGER).AddToTabList(RangerTabs.SHINKENGER));
    
	public static final RegistryObject<Item> GEDOU_DISK = ITEMS.register("gedou_disk",
            () -> new SecretDiskItem(new Item.Properties(),0,"_gedou","shinken_red","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH.get(), 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING.get(), 40, 4,true,false))
            .ChangeSlot(1).ChangeSlot(2).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));
    
    public static final RegistryObject<Item> SHINKENGER_HELMET = ITEMS.register("shinkenger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final RegistryObject<Item> SHINKENGER_CHESTPLATE = ITEMS.register("shinkenger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final RegistryObject<Item> SHINKENGER_LEGGINGS = ITEMS.register("shinkenger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> RED_SHODOPHONE = ITEMS.register("red_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_red",SHISHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(SHISHI_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> BLUE_SHODOPHONE = ITEMS.register("blue_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_blue",RYUU_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(RYUU_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> PINK_SHODOPHONE = ITEMS.register("pink_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_pink",KAME_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(KAME_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> GREEN_SHODOPHONE = ITEMS.register("green_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_green",KUMA_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(KUMA_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> YELLOW_SHODOPHONE = ITEMS.register("yellow_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"shinken_yellow",SARU_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(SARU_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> SUSHI_CHANGER = ITEMS.register("sushi_changer",
    		() -> new SushiChangerItem(ArmorMaterials.DIAMOND,"shinken_gold",SUSHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(SUSHI_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> PRINCESS_SHODOPHONE = ITEMS.register("princess_red_shodophone",
    		() -> new ShodoPhoneItem(ArmorMaterials.DIAMOND,"princess_shinken_red",SHISHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(SHISHI_DISK).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<SwordItem> SHINKENMARU = ITEMS.register("shinkenmaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(NeedShinkenmaru).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<SwordItem> REKKA_DAIZANTOU = ITEMS.register("rekka_daizantou",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<BaseBlasterItem> WATER_ARROW = ITEMS.register("water_arrow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
	
    public static final RegistryObject<SwordItem> HEAVEN_FAN = ITEMS.register("heaven_fan",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<SwordItem> WOOD_SPEAR = ITEMS.register("wood_spear",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<BaseThrowableItem> LAND_SLICER = ITEMS.register("land_slicer",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
	
    public static final RegistryObject<SwordItem> SAKANAMARU = ITEMS.register("sakanamaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(NeedSakanamaru).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<SwordItem> SUPER_SHINKENMARU = ITEMS.register("super_shinkenmaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<SwordItem> KYORYUMARU = ITEMS.register("kyoryumaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<SwordItem> KYORYUMARU_SAKANAMARU = ITEMS.register("kyoryumaru_sakanamaru",
			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties()).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}