package SS_Craft.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import SS_Craft.util.Refercence;

public class PotionSlashBoost extends Potion {

	public PotionSlashBoost() {
		super(false, 0xacf8ff);
		setPotionName("effect.slash_boost");
		setIconIndex(5, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "slashboost"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}