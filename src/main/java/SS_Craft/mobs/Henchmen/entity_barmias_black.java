package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_barmias_black extends Entity_base_henchmen
{
	public entity_barmias_black(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.abaranger_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.tyranno_dino_guts, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.tricera_dino_guts, 1);
				break;

			case 2:
				this.dropItem(RiderItems.ptera_dino_guts, 1);
				break;

			case 3:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(RiderItems.brachio_dino_guts, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.top_dino_guts, 1);
						break;

					case 2:
						this.dropItem(RiderItems.abaranger_logo, 2);
						break;

					case 3:
						this.dropItem(RiderItems.abaranger_logo, 2);
						break;

					case 4:
						this.dropItem(RiderItems.abaranger_logo, 2);
						break;

					case 5:
						this.dropItem(RiderItems.abaranger_logo, 2);
						break;

					case 6:
						this.dropItem(RiderItems.abaranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
