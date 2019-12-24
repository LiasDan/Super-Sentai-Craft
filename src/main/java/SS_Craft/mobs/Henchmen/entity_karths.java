package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_karths extends Entity_base_henchmen
{
	public entity_karths(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.boukenger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.bouken_red_logo, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.bouken_black_logo, 1);
				break;

			case 2:
				this.dropItem(RiderItems.bouken_blue_logo, 1);
				break;

			case 3:
				this.dropItem(RiderItems.bouken_yellow_logo, 1);
				break;

			case 4:
				this.dropItem(RiderItems.bouken_pink_logo, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(RiderItems.bouken_silver_logo, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.zubaan_crystal, 1);
						break;

					case 2:
						this.dropItem(RiderItems.boukenger_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.boukenger_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.boukenger_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.boukenger_logo, 2);
						break;

					case 6:
						this.dropItem(RiderItems.boukenger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
