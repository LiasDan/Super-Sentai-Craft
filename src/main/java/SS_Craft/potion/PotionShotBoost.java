package SS_Craft.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import SS_Craft.util.Refercence;

public class PotionShotBoost extends Potion {

	public PotionShotBoost() {
		super(false, 0xacf8ff);
		setPotionName("effect.shot_boost");
		setIconIndex(7, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "shotboost"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}