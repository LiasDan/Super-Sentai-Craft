package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_orgettes extends Entity_base_henchmen
{
	public entity_orgettes(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.empty_gao_jewel, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.gao_lion_jewel, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.gao_eagle_jewel, 1);
				break;

			case 2:
				this.dropItem(RiderItems.gao_shark_jewel, 1);
				break;

			case 3:
				this.dropItem(RiderItems.gao_bison_jewel, 1);
				break;

			case 4:
				this.dropItem(RiderItems.gao_tiger_jewel, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.gao_wolf_jewel, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.empty_gao_jewel, 2);
						break;

					case 2:
						this.dropItem(RiderItems.empty_gao_jewel, 2);
						break;

					case 3:
						this.dropItem(RiderItems.empty_gao_jewel, 2);
						break;

					case 4:
						this.dropItem(RiderItems.empty_gao_jewel, 2);
						break;

					case 5:
						this.dropItem(RiderItems.empty_gao_jewel, 2);
						break;
				}
				break;
			}
		}
	}
}
