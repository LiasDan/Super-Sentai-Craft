package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionCore {

	public static final Potion SS_FLY_POTION= new PotionFly();
	public static final Potion SS_FIRE_PUNCH = new PotionFirePunch();
	public static final Potion SS_PUNCH_BOOST = new PotionPunchBoost();
	public static final Potion SS_BIG = new PotionBig();
	public static final Potion SS_SMALL = new PotionSmall();
	public static final Potion SS_SLASH_BOOST = new PotionSlashBoost();
	public static final Potion SS_FIRE_SLASH = new PotionFireSlash();
	public static final Potion SS_SHOT_BOOST = new PotionShotBoost();
	public static final Potion SS_BOOST = new PotionBoost();
	
	public static void init(FMLInitializationEvent event) {
		ForgeRegistries.POTIONS.register(SS_FLY_POTION);
		ForgeRegistries.POTIONS.register(SS_FIRE_PUNCH);
		ForgeRegistries.POTIONS.register(SS_PUNCH_BOOST);
		ForgeRegistries.POTIONS.register(SS_BIG);
		ForgeRegistries.POTIONS.register(SS_SMALL);
		ForgeRegistries.POTIONS.register(SS_SLASH_BOOST);
		ForgeRegistries.POTIONS.register(SS_FIRE_SLASH);
		ForgeRegistries.POTIONS.register(SS_SHOT_BOOST);
		ForgeRegistries.POTIONS.register(SS_BOOST);
	}
	
}