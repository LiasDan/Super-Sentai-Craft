package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_rinshis extends Entity_base_henchmen
{
	public entity_rinshis(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.gekiranger_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.tiger_spirit, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.cheetah_spirit, 1);
				break;

			case 2:
				this.dropItem(RiderItems.jaguar_spirit, 1);
				break;

			case 3:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(RiderItems.wolf_spirit, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.rhino_spirit, 1);
						break;

					case 2:
						this.dropItem(RiderItems.gekiranger_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.gekiranger_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.gekiranger_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.gekiranger_logo, 2);
						break;

					case 6:
						this.dropItem(RiderItems.gekiranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
