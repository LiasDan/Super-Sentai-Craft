package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionWaterBoost extends Potion {

	public PotionWaterBoost() {
		super(false, 0xe443ff);
		setPotionName("effect.waterboost");
		setIconIndex(4, 1);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "waterboost"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}