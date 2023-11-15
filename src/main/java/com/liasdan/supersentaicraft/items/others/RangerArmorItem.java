package com.liasdan.supersentaicraft.items.others;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.client.RangerArmorRenderer;

import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.List;
import java.util.function.Consumer;

public class RangerArmorItem extends ArmorItem implements GeoItem {
	private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
	private Item RepairItem = GorangerItems.GORANGER_LOGO.get();
	
	public RangerArmorItem(ArmorMaterial material, Type type, Properties properties) {
		super(material, type, properties);
	
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			private RangerArmorRenderer renderer;
			
			@Override
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
					EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
					this.renderer = new RangerArmorRenderer(livingEntity, equipmentSlot);

				this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
				return this.renderer;
			}
		});
	}

	public RangerArmorItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	private PlayState predicate(AnimationState<?> animationState) {
		animationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
		controllerRegistrar.add(new AnimationController<RangerArmorItem>(this, "controller", 0, this::predicate));
	}

	public RangerArmorItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}
	

	
	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}
}