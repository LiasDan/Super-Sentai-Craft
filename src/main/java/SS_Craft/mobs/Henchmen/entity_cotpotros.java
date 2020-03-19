package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_cotpotros extends Entity_base_henchmen
{
	public entity_cotpotros(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.dairanger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_lailai_jewel, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.green_lailai_jewel, 1);
				break;

			case 2:
				this.dropItem(RiderItems.blue_lailai_jewel, 1);
				break;

			case 3:
				this.dropItem(RiderItems.yellow_lailai_jewel, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_lailai_jewel, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.white_lailai_jewel, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.dairanger_logo, 2);
						break;

					case 2:
						this.dropItem(RiderItems.dairanger_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.dairanger_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.dairanger_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.dairanger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
