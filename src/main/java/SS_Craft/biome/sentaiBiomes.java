package SS_Craft.biome;

import SS_Craft.util.Refercence;
import SS_Craft.world.gen.modDimensionWorldGen;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Refercence.MODID)
public class sentaiBiomes
{
    // instantiate Biomes
    public final static biome_super_sentai_topia SUPER_SENTAI_TOPIA = new biome_super_sentai_topia();
    
    @Mod.EventBusSubscriber(modid = Refercence.MODID)
    public static class RegistrationHandler {
        /**
         * Register this mod's {@link Biome}s.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<Biome> event) {
            final IForgeRegistry<Biome> registry = event.getRegistry();

            System.out.println("Registering biomes");
            
            registry.register(SUPER_SENTAI_TOPIA.setRegistryName(Refercence.MODID, modDimensionWorldGen.SUPER_SENTAI_TOPIA_NAME));
        }
    }
}