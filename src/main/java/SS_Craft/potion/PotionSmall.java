package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionSmall extends Potion {

	public PotionSmall() {
		super(false, 0xc96161);
		setPotionName("effect.small");
		setIconIndex(4, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "small"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}