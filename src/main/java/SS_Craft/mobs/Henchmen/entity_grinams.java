package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_grinams extends Entity_base_henchmen
{
	public entity_grinams(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.birdonic_wave, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.hawk_birdonic_wave, 1);
				break;

			case 1:
				this.dropItem(RiderItems.condor_birdonic_wave, 1);
				break;

			case 2:
				this.dropItem(RiderItems.owl_birdonic_wave, 1);
				break;

			case 3:
				this.dropItem(RiderItems.swan_birdonic_wave, 1);
				break;

			case 4:
				this.dropItem(RiderItems.swallow_birdonic_wave, 1);
				break;

			case 5:
				this.dropItem(RiderItems.birdonic_wave, 2);
				break;
			}
		}
	}
}
