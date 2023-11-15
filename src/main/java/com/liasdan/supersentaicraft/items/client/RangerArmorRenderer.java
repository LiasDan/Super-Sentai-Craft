package com.liasdan.supersentaicraft.items.client;

import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RangerArmorRenderer extends GeoArmorRenderer<RangerArmorItem> {
	 
	private static LivingEntity RIDER;
	
    public RangerArmorRenderer(LivingEntity livingEntity, EquipmentSlot equipmentSlot) {
    
        super(new RangerArmorModel(livingEntity, equipmentSlot));
        RIDER =  livingEntity;
    }
    
    

	protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
		setAllVisible(false);

		if (RIDER.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem) {
			RangerChangerItem BELT = ((RangerChangerItem)RIDER.getItemBySlot(EquipmentSlot.FEET).getItem()); 
		
				setBoneVisible(this.head, BELT.getPartsForSlot(currentSlot,"head"));
				setBoneVisible(this.body,  BELT.getPartsForSlot(currentSlot,"body"));
				setBoneVisible(this.rightArm,  BELT.getPartsForSlot(currentSlot,"rightArm"));
				setBoneVisible(this.leftArm,  BELT.getPartsForSlot(currentSlot,"leftArm"));
				setBoneVisible(this.rightLeg,  BELT.getPartsForSlot(currentSlot,"rightLeg"));
				setBoneVisible(this.leftLeg,  BELT.getPartsForSlot(currentSlot,"leftLeg"));
				setBoneVisible(this.body, true);

			
		}else {
			
			switch (currentSlot) {
			case HEAD ->{ 
				setBoneVisible(this.head, true);
			}
			case CHEST -> {
				setBoneVisible(this.body, true);
				setBoneVisible(this.rightArm, true);
				setBoneVisible(this.leftArm, true);
			}
			case LEGS -> {
				setBoneVisible(this.rightLeg, true);
				setBoneVisible(this.leftLeg, true);
			}
			case FEET -> {
				setBoneVisible(this.body, true);
			}
			default -> {}
		}
	
		}
	}

}