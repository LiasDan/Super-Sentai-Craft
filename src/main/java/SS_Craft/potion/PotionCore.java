package SS_Craft.potion;

import SS_Craft.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionCore {

	private static final Potion SS_FLY= new PotionFly();
	public static final Potion SS_FLY_POTION  = SS_FLY_POTION();
	public static final Potion SS_FIRE_PUNCH = new PotionFirePunch();
	public static final Potion SS_PUNCH_BOOST = new PotionPunchBoost();
	public static final Potion SS_BIG = new PotionBig();
	public static final Potion SS_SLASH_BOOST = new PotionSlashBoost();
	public static final Potion SS_FIRE_SLASH = new PotionFireSlash();
	public static final Potion SS_SHOT_BOOST = new PotionShotBoost();
	
	private static Potion SS_FLY_POTION()
	{
		if (Potion.getPotionFromResourceLocation("tokuPotions:" + "fly")!=null)
		{
			return Potion.getPotionFromResourceLocation("tokuPotions:" + "fly");
		}
		else
		{
			return SS_FLY;
		}
	}
	
	public static void init(FMLInitializationEvent event) {
		ForgeRegistries.POTIONS.register(SS_FLY);
		ForgeRegistries.POTIONS.register(SS_FIRE_PUNCH);
		ForgeRegistries.POTIONS.register(SS_PUNCH_BOOST);
		ForgeRegistries.POTIONS.register(SS_BIG);
		ForgeRegistries.POTIONS.register(SS_SLASH_BOOST);
		ForgeRegistries.POTIONS.register(SS_FIRE_SLASH);
		ForgeRegistries.POTIONS.register(SS_SHOT_BOOST);
	}
	
}