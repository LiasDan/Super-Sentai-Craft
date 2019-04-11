package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBig extends Potion {

	public PotionBig() {
		super(false, 0xc96161);
		setPotionName("effect.big");
		setIconIndex(3, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "big"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}