package com.liasdan.supersentaicraft.items.client;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.cache.texture.AutoGlowingTexture;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;
import software.bernie.geckolib.util.RenderUtil;

import static net.minecraft.client.renderer.RenderType.ENTITY_TRANSLUCENT_EMISSIVE;
import static software.bernie.geckolib.cache.texture.GeoAbstractTexture.appendToPath;

public class MechaArmorRenderer extends GeoArmorRenderer<MechaArmorItem> {

	public MechaArmorRenderer(EquipmentSlot equipmentSlot) {

		super(new MechaArmorModel());
		if (equipmentSlot == EquipmentSlot.FEET) {
			addRenderLayer(new AutoGlowingGeoLayer<>(this) {
				@Nullable
				protected RenderType getRenderType(MechaArmorItem animatable, @Nullable MultiBufferSource bufferSource) {
					if (this.getRenderer() instanceof MechaArmorRenderer renderer2) {
						LivingEntity RIDER = renderer2.GetEntity();
						if (RIDER != null && RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem belt) {
							if (renderer.getTextureLocation(animatable).getPath().equals((ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/mecha/blank.png")).getPath()))
								return null;
							return belt.getGlowForSlot(RIDER.getItemBySlot(EquipmentSlot.HEAD), equipmentSlot, RIDER) ? AutoGlowingTexture.getRenderType(getTextureResource(animatable)) : null;

						}
					}
					return null;
				}
			});
		}else{
			addRenderLayer(new AutoGlowingGeoLayer<>(this) {
				@Nullable
				protected RenderType getRenderType(MechaArmorItem animatable, @Nullable MultiBufferSource bufferSource) {
					if (this.getRenderer() instanceof MechaArmorRenderer renderer2) {
						LivingEntity RIDER = renderer2.GetEntity();
						if (RIDER != null && RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem belt) {
							if (renderer.getTextureLocation(animatable).getPath().equals((ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/mecha/blank.png")).getPath()))
								return null;
							ResourceLocation path = appendToPath(model.getTextureResource(animatable, renderer2), "_glowmask");
							return belt.getGlowForSlot(RIDER.getItemBySlot(EquipmentSlot.HEAD), renderer2.getCurrentSlot(), RIDER) ? (RenderType) ENTITY_TRANSLUCENT_EMISSIVE.apply(path, false) : null;
						}
					}
					return null;
				}
			});
		}

		if (equipmentSlot == EquipmentSlot.HEAD || equipmentSlot == EquipmentSlot.FEET) {
			addRenderLayer(new MechaRenderLayer<>(this));
		}
		addRenderLayer(new AutoGlowingGeoLayer<>(this) {
			@Nullable
			protected RenderType getRenderType(MechaArmorItem animatable, @Nullable MultiBufferSource bufferSource) {
				return null;
			}
		});
	}

	public GeoArmorRenderer<MechaArmorItem> addRenderLayer(GeoRenderLayer<MechaArmorItem> renderLayer) {
		this.renderLayers.addLayer(renderLayer);

		return this;
	}

	public LivingEntity GetEntity(){
		if (getCurrentEntity() instanceof LivingEntity entity) return entity;
		else return null;
	}

	/*
    @Override
    public GeoBone getRightBootBone(GeoModel<RiderArmorItem> model) {
        return model.getBone("armorBody").orElse(super.getRightBootBone(model));
    }
    // We don't use the boot bones, so we better let other mods know
    @Override
    public GeoBone getLeftBootBone(GeoModel<RiderArmorItem> model) {
        return model.getBone("armorBody").orElse(super.getLeftBootBone(model));
    }
    */
	@Override
	public RenderType getRenderType(MechaArmorItem animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(texture);
	}

	@Override
	protected void applyBaseTransformations(HumanoidModel<?> baseModel) {
		super.applyBaseTransformations(baseModel);
		if (this.body != null) {
			ModelPart bodyPart = baseModel.body;

			RenderUtil.matchModelPartRot(bodyPart, this.body);
			this.body.updatePosition(bodyPart.x, -bodyPart.y, bodyPart.z);
		}
	}

	protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
		setAllVisible(false);
		if (GetEntity()!=null){
			if (!GetEntity().isInvisible()||GetEntity() instanceof ArmorStand) {
				if (currentSlot == EquipmentSlot.HEAD) {
					setBoneVisible(this.body, true);
					setBoneVisible(this.leftArm, true);
				} else if (GetEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem BELT && BELT.isTransformed(GetEntity())) {
					setBoneVisible(this.head, BELT.getPartsForSlot(GetEntity().getItemBySlot(EquipmentSlot.FEET),currentSlot,"head"));
					setBoneVisible(this.body, BELT.getPartsForSlot(GetEntity().getItemBySlot(EquipmentSlot.FEET),currentSlot,"body"));
					setBoneVisible(this.rightArm, BELT.getPartsForSlot(GetEntity().getItemBySlot(EquipmentSlot.FEET),currentSlot,"rightArm"));
					setBoneVisible(this.leftArm, BELT.getPartsForSlot(GetEntity().getItemBySlot(EquipmentSlot.FEET),currentSlot,"leftArm"));
					setBoneVisible(this.rightLeg, BELT.getPartsForSlot(GetEntity().getItemBySlot(EquipmentSlot.FEET),currentSlot,"rightLeg"));
					setBoneVisible(this.leftLeg, BELT.getPartsForSlot(GetEntity().getItemBySlot(EquipmentSlot.FEET),currentSlot,"leftLeg"));
				}
			}
		}
	}
}