package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_indavers_green extends Entity_base_henchmen
{
	public entity_indavers_green(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_kyutama, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.sasori_kyutama, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.oushi_kyutama, 1);
				break;

			case 2:
				this.dropItem(RiderItems.washi_kyutama, 1);
				break;

			case 3:
				switch (this.rand.nextInt(12))
				{
					case 0:
						this.dropItem(RiderItems.hercules_kyutama, 1);
						break;
						
					case 1:
						this.dropItem(RiderItems.centaurus_kyutama, 1);
						break;
							
					case 2:
						this.dropItem(RiderItems.kirin_kyutama, 1);
						break;
							
					case 3:
						this.dropItem(RiderItems.otome_kyutama, 1);
						break;
							
					case 4:
						this.dropItem(RiderItems.mizuhebi_kyutama, 1);
						break;
							
					case 5:
						this.dropItem(RiderItems.reticle_kyutama, 1);
						break;
							
					case 6:
						this.dropItem(RiderItems.yamaneko_kyutama, 1);
						break;

					case 7:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 8:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 9:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 10:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 11:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;
				}
				break;
			}
		}
	}
}
