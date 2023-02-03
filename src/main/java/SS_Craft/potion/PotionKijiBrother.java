package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionKijiBrother extends Potion {

	public PotionKijiBrother() {
		super(false, 0xc96161);
		setPotionName("effect.kijibrother");
		setIconIndex(1, 1);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "kijibrother"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}