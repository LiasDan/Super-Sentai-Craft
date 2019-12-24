package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_dustlers extends Entity_base_henchmen
{
	public entity_dustlers(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.empty_denzi_ring, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_denzi_gem, 1);
				break;

			case 1:
				this.dropItem(RiderItems.blue_denzi_gem, 1);
				break;

			case 2:
				this.dropItem(RiderItems.yellow_denzi_gem, 1);
				break;

			case 3:
				this.dropItem(RiderItems.green_denzi_gem, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_denzi_gem, 1);
				break;

			case 5:
				this.dropItem(RiderItems.empty_denzi_ring, 2);
				break;
			}
		}
	}
}
