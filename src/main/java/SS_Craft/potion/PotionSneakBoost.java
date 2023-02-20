package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionSneakBoost extends Potion {

	public PotionSneakBoost() {
		super(false, 0xe443ff);
		setPotionName("effect.sneakboost");
		setIconIndex(3, 1);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "sneakboost"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}