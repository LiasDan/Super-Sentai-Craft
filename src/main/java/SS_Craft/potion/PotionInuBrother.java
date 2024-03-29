package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionInuBrother extends Potion {

	public PotionInuBrother() {
		super(false, 0xc96161);
		setPotionName("effect.inubrother");
		setIconIndex(2, 1);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "inubrother"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}