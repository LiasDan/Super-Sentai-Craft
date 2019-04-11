package SS_Craft.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import SS_Craft.util.Refercence;

public class PotionFly extends Potion {

	public PotionFly() {
		super(false, 0xacf8ff);
		setPotionName("effect.fly");
		setIconIndex(0, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "fly"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}