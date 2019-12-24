package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_ugatz extends Entity_base_henchmen
{
	public entity_ugatz(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_engine_soul, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.speedor_soul, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.buson_soul, 1);
				break;

			case 2:
				this.dropItem(RiderItems.bear_rv_soul, 1);
				break;

			case 3:
				switch (this.rand.nextInt(5))
				{  		   	    		
					case 0:
						this.dropItem(RiderItems.birca_soul, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.gunpherd_soul, 1);
						break;

					case 2:
						this.dropItem(RiderItems.toripter_soul, 1);
						break;
						
					case 3:
						this.dropItem(RiderItems.jetras_soul, 2);
						break;

					case 4:
						this.dropItem(RiderItems.blank_engine_soul, 2);
						break;

					case 5:
						this.dropItem(RiderItems.blank_engine_soul, 2);
						break;

					case 6:
						this.dropItem(RiderItems.blank_engine_soul, 2);
						break;

					case 7:
						this.dropItem(RiderItems.blank_engine_soul, 2);
						break;

					case 8:
						this.dropItem(RiderItems.blank_engine_soul, 2);
						break;
				}
				break;
			}
		}
	}
}
