package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseExplosiveItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
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

public class JAKQItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperSentaiCraftCore.MODID);
    
	public static final RegistryObject<Item> JAKQ_LOGO = ITEMS.register("jakq_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.JAKQ));
	
	public static final RegistryObject<Item> BLANK_CARD = ITEMS.register("blank_card",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.JAKQ));

	public static final RegistryObject<Item> ACE_CARD = ITEMS.register("ace_card",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","spade_ace","jakq_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RangerTabs.JAKQ));

	public static final RegistryObject<Item> JACK_CARD = ITEMS.register("jack_card",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","dia_jack","jakq_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RangerTabs.JAKQ));

	public static final RegistryObject<Item> QUEEN_CARD = ITEMS.register("queen_card",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","heart_queen","jakq_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RangerTabs.JAKQ));

	public static final RegistryObject<Item> KING_CARD = ITEMS.register("king_card",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","clover_king","jakq_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RangerTabs.JAKQ));

	public static final RegistryObject<Item> BIG_ONE_CARD = ITEMS.register("big_one_card",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","big_one","big_one_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).ChangeModel("geo/black_knight.geo.json").AddToTabList(RangerTabs.JAKQ));
	
	public static final RegistryObject<Item> JAKQ_HELMET = ITEMS.register("jakq_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    public static final RegistryObject<Item> JAKQ_CHESTPLATE = ITEMS.register("jakq_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    public static final RegistryObject<Item> JAKQ_LEGGINGS = ITEMS.register("jakq_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    
    public static final RegistryObject<Item> ACE_POWERED_CAPSULE = ITEMS.register("ace_powered_capsule",
    		() -> new GorangerBeltItem(ArmorMaterials.DIAMOND,"spade_ace",ACE_CARD,JAKQ_HELMET,JAKQ_CHESTPLATE,JAKQ_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    public static final RegistryObject<Item> JACK_POWERED_CAPSULE = ITEMS.register("jack_powered_capsule",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"dia_jack",JACK_CARD,JAKQ_HELMET,JAKQ_CHESTPLATE,JAKQ_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    public static final RegistryObject<Item> QUEEN_POWERED_CAPSULE = ITEMS.register("queen_powered_capsule",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"heart_queen",QUEEN_CARD,JAKQ_HELMET,JAKQ_CHESTPLATE,JAKQ_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    public static final RegistryObject<Item> KING_POWERED_CAPSULE = ITEMS.register("king_powered_capsule",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"clover_king",KING_CARD,JAKQ_HELMET,JAKQ_CHESTPLATE,JAKQ_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    public static final RegistryObject<Item> BIG_ONE_RED_ROSE = ITEMS.register("big_one_red_rose",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"big_one",BIG_ONE_CARD,JAKQ_HELMET,JAKQ_CHESTPLATE,JAKQ_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    
    public static final RegistryObject<BaseBlasterItem> SPADE_ARTS = ITEMS.register("spade_arts",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
	
    public static final RegistryObject<SwordItem> SPADE_ARTS_WHIP = ITEMS.register("spade_arts_whip",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
	
    public static final RegistryObject<SwordItem> DIA_SWORD = ITEMS.register("dia_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
	
	public static final RegistryObject<BaseThrowableItem> HEART_CUTE = ITEMS.register("heart_cute",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    
    public static final RegistryObject<SwordItem> CLUB_MEGATON = ITEMS.register("club_megaton",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
    
    public static final RegistryObject<SwordItem> BIG_BATON = ITEMS.register("big_baton",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.JAKQ).ChangeRepairItem(BLANK_CARD.get()));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}