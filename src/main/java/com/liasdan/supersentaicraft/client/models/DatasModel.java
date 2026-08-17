package com.liasdan.supersentaicraft.client.models;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.ally.DatasEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class DatasModel extends GeoModel<DatasEntity> {
	@Override
	public ResourceLocation getModelResource(DatasEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/datas.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DatasEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/entity/datas.png");
	}

	@Override
	public ResourceLocation getAnimationResource(DatasEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "animations/datas.animation.json");
	}

	@Override
	public void setCustomAnimations(DatasEntity an, long instanceId, AnimationState<DatasEntity> state) {

	}

}