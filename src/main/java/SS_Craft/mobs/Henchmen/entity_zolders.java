package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_zolders extends Entity_base_henchmen
{
	public entity_zolders(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.goranger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.aka_star, 1);
				break;

			case 1:
				this.dropItem(RiderItems.ao_star, 1);
				break;

			case 2:
				this.dropItem(RiderItems.ki_star, 1);
				break;

			case 3:
				this.dropItem(RiderItems.momo_star, 1);
				break;

			case 4:
				this.dropItem(RiderItems.mido_star, 1);
				break;

			case 5:
				this.dropItem(RiderItems.goranger_logo, 2);
				break;
			}
		}
	}
}
