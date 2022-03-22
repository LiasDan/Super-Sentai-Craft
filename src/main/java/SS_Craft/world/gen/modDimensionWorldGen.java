package SS_Craft.world.gen;

import javax.annotation.Nullable;

//import com.blogspot.jabelarminecraft.examplemod.worldgen.WorldTypeHELHEIM;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

// TODO: Auto-generated Javadoc
public class modDimensionWorldGen
{  
//    public static final String HELHEIM_NAME = "helheim";
//    public static final int HELHEIM_DIM_ID = DimensionManager.getNextFreeDimId();
//    public static final DimensionType HELHEIM_DIM_TYPE = DimensionType.register(HELHEIM_NAME, "_"+HELHEIM_NAME, HELHEIM_DIM_ID, worldProviderHelheimForest.class, true);
	
	public static final String SUPER_SENTAI_TOPIA_NAME = "super_sentai_topia";
	public static final int SUPER_SENTAI_TOPIA_DIM_ID = 1975;
	public static final DimensionType SUPER_SENTAI_TOPIA_DIM_TYPE = DimensionType.register(SUPER_SENTAI_TOPIA_NAME, "_"+SUPER_SENTAI_TOPIA_NAME, SUPER_SENTAI_TOPIA_DIM_ID, worldProvider_super_sentai_topia.class, true);
   
	/**
     * Register dimensions.
     */
    public static final void registerDimensions() {
//        DimensionManager.registerDimension(HELHEIM_DIM_ID, HELHEIM_DIM_TYPE);
    	DimensionManager.registerDimension(SUPER_SENTAI_TOPIA_DIM_ID, SUPER_SENTAI_TOPIA_DIM_TYPE);
    }
}