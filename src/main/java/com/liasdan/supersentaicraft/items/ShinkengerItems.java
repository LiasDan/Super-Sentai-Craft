package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
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

public class ShinkengerItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> SHINKENGER_LOGO = ITEMS.register("shinkenger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));
    
	public static final RegistryObject<Item> KYOUTSU_DISK = ITEMS.register("common_disk",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> SHISHI_DISK = ITEMS.register("shishi_disk",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","shinken_red","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> RYUU_DISK = ITEMS.register("ryuu_disk",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","shinken_blue","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> KAME_DISK = ITEMS.register("kame_disk",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","shinken_pink","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> KUMA_DISK = ITEMS.register("kuma_disk",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","shinken_green","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));

	public static final RegistryObject<Item> SARU_DISK = ITEMS.register("saru_disk",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","shinken_yellow","shinkenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.SHINKENGER));
    
    public static final RegistryObject<Item> SHINKENGER_HELMET = ITEMS.register("shinkenger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final RegistryObject<Item> SHINKENGER_CHESTPLATE = ITEMS.register("shinkenger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    public static final RegistryObject<Item> SHINKENGER_LEGGINGS = ITEMS.register("shinkenger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> RED_SHODOPHONE = ITEMS.register("red_shodophone",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"shinken_red",SHISHI_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> BLUE_SHODOPHONE = ITEMS.register("blue_shodophone",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"shinken_blue",RYUU_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> PINK_SHODOPHONE = ITEMS.register("pink_shodophone",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"shinken_pink",KAME_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> GREEN_SHODOPHONE = ITEMS.register("green_shodophone",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"shinken_green",KUMA_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
    public static final RegistryObject<Item> YELLOW_SHODOPHONE = ITEMS.register("yellow_shodophone",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"shinken_yellow",SARU_DISK,SHINKENGER_HELMET,SHINKENGER_CHESTPLATE,SHINKENGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
    
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}