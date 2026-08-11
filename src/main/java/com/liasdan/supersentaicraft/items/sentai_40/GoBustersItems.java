package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.machine.MiniatureEnetronTank;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.sentai_40.go_busters.MorphinBlasterItem;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_40.go_busters.MorphinBraceItem;
import com.liasdan.supersentaicraft.particle.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GoBustersItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GO_BUSTERS_LOGO = ITEMS.register("go_busters_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));
	public static final DeferredItem<Item> DOUBUTSU_GO_BUSTERS_LOGO = ITEMS.register("doubutsu_go_busters_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> ENETRON = ITEMS.register("enetron",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));
	public static final DeferredItem<Item> BLANK_ANIMAL_DISK = ITEMS.register("blank_animal_disk",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> RED_ENETRON = ITEMS.register("red_enetron",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","red_buster","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.RED_BUSTER_WEAKNESS, 40, 0,true,false),
					new MobEffectInstance(EffectCore.RED_BUSTER, 40, 1,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS).AddToList(MiniatureEnetronTank.ENETRON,25));

	public static final DeferredItem<Item> BLUE_ENETRON = ITEMS.register("blue_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_buster","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(EffectCore.BLUE_BUSTER_WEAKNESS, 40, 0,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS).AddToList(MiniatureEnetronTank.ENETRON,25));

	public static final DeferredItem<Item> YELLOW_ENETRON = ITEMS.register("yellow_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_buster","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.YELLOW_BUSTER_WEAKNESS, 40, 0,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.YELLOW_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS).AddToList(MiniatureEnetronTank.ENETRON,25));

	public static final DeferredItem<Item> GOLD_ENETRON = ITEMS.register("gold_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","beet_buster","beet_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.AddToTabList(RangerTabs.GO_BUSTERS).AddToList(MiniatureEnetronTank.ENETRON,20));

	public static final DeferredItem<Item> SILVER_ENETRON = ITEMS.register("silver_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","stag_buster","beet_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.SILVER_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.AddToTabList(RangerTabs.GO_BUSTERS).AddToList(MiniatureEnetronTank.ENETRON,20));

	public static final DeferredItem<Item> VAGLASS_LOGO = ITEMS.register("vaglass_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","dark_buster","dark_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(EffectCore.RED_BUSTER, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> CUSTOM_VISOR_R = ITEMS.register("custom_visor_r",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_animal_perfect","yellow_rabbit","go_busters_belt_pc",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.YELLOW_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json"));

	public static final DeferredItem<Item> CUSTOM_VISOR_G = ITEMS.register("custom_visor_g",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_animal_perfect","blue_gorilla","go_busters_belt_pc",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 6,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addAlternative(CUSTOM_VISOR_R.get()).ChangeBeltModel("rangerbelt1.geo.json"));

	public static final DeferredItem<Item> CUSTOM_VISOR_C = ITEMS.register("custom_visor_c",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_animal_perfect","red_cheetah","go_busters_belt_pc",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addAlternative(CUSTOM_VISOR_G.get()).ChangeBeltModel("rangerbelt1.geo.json"));

	public static final DeferredItem<Item> CUSTOM_VISOR_Y = ITEMS.register("custom_visor_y",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_powered_custom","yellow_buster","go_busters_belt_pc",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(EffectCore.LOW_GRAVITY, 40, 4,true,false),
					new MobEffectInstance(EffectCore.YELLOW_BUSTER_PC, 40, 0,true,false),
					new MobEffectInstance(EffectCore.YELLOW_BUSTER_WEAKNESS, 40, 0,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.YELLOW_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.addAlternative(CUSTOM_VISOR_C.get()).ChangeBeltModel("rangerbelt1.geo.json"));

	public static final DeferredItem<Item> CUSTOM_VISOR_B = ITEMS.register("custom_visor_b",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_powered_custom","blue_buster","go_busters_belt_pc",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 6,true,false),
					new MobEffectInstance(EffectCore.BLUE_BUSTER_WEAKNESS, 40, 0,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.addAlternative(CUSTOM_VISOR_Y.get()).ChangeBeltModel("rangerbelt1.geo.json"));

	public static final DeferredItem<Item> CUSTOM_VISOR = ITEMS.register("custom_visor",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_powered_custom","red_buster","go_busters_belt_pc",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false),
					new MobEffectInstance(EffectCore.RED_BUSTER_WEAKNESS, 40, 0,true,false),
					new MobEffectInstance(EffectCore.RED_BUSTER, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.addAlternative(CUSTOM_VISOR_B.get()).ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS).AddToList(MiniatureEnetronTank.ENETRON,5));

	public static final DeferredItem<Item> CHEETAH_ANIMAL_DISK = ITEMS.register("cheetah_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","red_cheetah","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> GORILLA_ANIMAL_DISK = ITEMS.register("gorilla_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_gorilla","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> RABBIT_ANIMAL_DISK = ITEMS.register("rabbit_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_rabbit","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.YELLOW_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> BEETLE_ANIMAL_DISK = ITEMS.register("beetle_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gold_beetle","beet_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> STAG_ANIMAL_DISK = ITEMS.register("stag_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","stag_buster","beet_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0.5, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.SILVER_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, -0.5, 0, 1);
				}
			}.AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> HIPPOPOTAMUS_ANIMAL_DISK = ITEMS.register("hippopotamus_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","green_hippopotamus","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> PUMA_ANIMAL_DISK = ITEMS.register("puma_animal_disk",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","black_puma","black_puma_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.ChangeBeltModel("rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> GO_BUSTERS_HELMET = ITEMS.register("go_busters_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
    public static final DeferredItem<Item> GO_BUSTERS_CHESTPLATE = ITEMS.register("go_busters_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
    public static final DeferredItem<Item> GO_BUSTERS_LEGGINGS = ITEMS.register("go_busters_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

   	public static final DeferredItem<Item> RED_MORPHIN_BRACE = ITEMS.register("red_morphin_brace",
   		() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"red_buster",RED_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> BLUE_MORPHIN_BRACE = ITEMS.register("blue_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"blue_buster",BLUE_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> YELLOW_MORPHIN_BRACE = ITEMS.register("yellow_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"yellow_buster",YELLOW_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> BEET_MORPHIN_BLASTER = ITEMS.register("beet_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"beet_buster",GOLD_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> STAG_MORPHIN_BLASTER = ITEMS.register("stag_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"stag_buster",SILVER_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<Item> ENTER_MORPHIN_BLASTER = ITEMS.register("enter_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"beet_buster_enter",GOLD_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> DARK_MORPHIN_BRACE = ITEMS.register("dark_morphin_brace",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"dark_buster",VAGLASS_LOGO,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<Item> CHEETAH_MORPHIN_BRACE = ITEMS.register("cheetah_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"red_cheetah",CHEETAH_ANIMAL_DISK,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> GORILLA_MORPHIN_BRACE = ITEMS.register("gorilla_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"blue_gorilla",GORILLA_ANIMAL_DISK,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> RABBIT_MORPHIN_BRACE = ITEMS.register("rabbit_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"yellow_rabbit",RABBIT_ANIMAL_DISK,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> BEETLE_MORPHIN_BLASTER = ITEMS.register("beetle_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gold_beetle",BEETLE_ANIMAL_DISK,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> HIPPOPOTAMUS_MORPHIN_BRACE = ITEMS.register("hippopotamus_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"green_hippopotamus",HIPPOPOTAMUS_ANIMAL_DISK,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> PUMA_MORPHIN_BRACE = ITEMS.register("puma_morphin_brace",
			() -> new MorphinBraceItem(ArmorMaterials.DIAMOND,"black_puma",PUMA_ANIMAL_DISK,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<SwordItem> SOUGAN_BLADE = ITEMS.register("sougan_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<BaseBlasterItem> ICHIGAN_BUSTER = ITEMS.register("ichigan_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<BaseBlasterItem> ICHIGAN_BUSTER_SPECIAL = ITEMS.register("ichigan_buster_special",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(ICHIGAN_BUSTER.get()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<BaseBlasterItem> MORPHIN_BLASTER = ITEMS.register("morphin_blaster",
			() -> new MorphinBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<SwordItem> DRI_BLADE = ITEMS.register("dri_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<BaseBlasterItem> LIO_BLASTER = ITEMS.register("lio_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsSuperGun().AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<BaseBlasterItem> LIO_BLASTER_FINAL = ITEMS.register("lio_blaster_final",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsHyperGun().KeepDifItem(ICHIGAN_BUSTER.get()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<SwordItem> DARK_BUSTER_SWORD = ITEMS.register("dark_buster_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}