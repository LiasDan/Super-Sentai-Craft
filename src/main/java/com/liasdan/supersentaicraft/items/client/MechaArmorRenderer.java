package com.liasdan.supersentaicraft.items.client;

import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MechaArmorRenderer extends GeoArmorRenderer<MechaArmorItem> {
	 
	private static LivingEntity RIDER;
	
    public MechaArmorRenderer(LivingEntity livingEntity, EquipmentSlot equipmentSlot) {
    
        super(new MechaArmorModel(livingEntity, equipmentSlot));
        RIDER =  livingEntity;
    }
    
    

	protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
		setAllVisible(false);

		if (RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem) {
			MechaGattaiItem BELT = ((MechaGattaiItem)RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem()); 
		
				setBoneVisible(this.head, BELT.getPartsForSlot(currentSlot,"head"));
				setBoneVisible(this.body,  BELT.getPartsForSlot(currentSlot,"body"));
				setBoneVisible(this.rightArm,  BELT.getPartsForSlot(currentSlot,"rightArm"));
				setBoneVisible(this.leftArm,  BELT.getPartsForSlot(currentSlot,"leftArm"));
				setBoneVisible(this.rightLeg,  BELT.getPartsForSlot(currentSlot,"rightLeg"));
				setBoneVisible(this.leftLeg,  BELT.getPartsForSlot(currentSlot,"leftLeg"));
				setBoneVisible(this.body, true);
				setBoneVisible(this.leftArm, true);

			
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
				setBoneVisible(this.leftArm, true);
			}
			default -> {}
		}
	
		}
	}

}