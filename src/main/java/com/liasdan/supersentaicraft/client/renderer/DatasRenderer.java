package com.liasdan.supersentaicraft.client.renderer;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.client.models.DatasModel;
import com.liasdan.supersentaicraft.entity.ally.DatasEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DatasRenderer extends GeoEntityRenderer<DatasEntity> {

    public DatasRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DatasModel());
    }

    @Override
    public ResourceLocation getTextureLocation(DatasEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/entities/datas.png");
    }
}