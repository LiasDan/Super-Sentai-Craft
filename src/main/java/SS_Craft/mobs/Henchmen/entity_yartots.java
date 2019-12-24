package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_yartots extends Entity_base_henchmen
{
	public entity_yartots(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.gingaman_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_ginga_medal, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.green_ginga_medal, 1);
				break;

			case 2:
				this.dropItem(RiderItems.blue_ginga_medal, 1);
				break;

			case 3:
				this.dropItem(RiderItems.yellow_ginga_medal, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_ginga_medal, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.black_knight_core, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.gingaman_logo, 2);
						break;

					case 2:
						this.dropItem(RiderItems.gingaman_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.gingaman_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.gingaman_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.gingaman_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
