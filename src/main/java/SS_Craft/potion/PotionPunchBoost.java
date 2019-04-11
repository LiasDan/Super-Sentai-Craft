package SS_Craft.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import SS_Craft.util.Refercence;

public class PotionPunchBoost extends Potion {

	public PotionPunchBoost() {
		super(false, 0xacf8ff);
		setPotionName("effect.punch_boost");
		setIconIndex(1, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "punchboost"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}