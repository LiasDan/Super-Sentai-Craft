package SS_Craft.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import SS_Craft.util.Refercence;

public class PotionFireSlash extends Potion {

	public PotionFireSlash() {
		super(false, 0xacf8ff);
		setPotionName("effect.fire_slash");
		setIconIndex(6, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "fire_slash"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}