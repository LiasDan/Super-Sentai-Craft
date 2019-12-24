package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_nanashis extends Entity_base_henchmen
{
	public entity_nanashis(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.common_disk, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.shishi_disk, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.ryuu_disk, 1);
				break;

			case 2:
				this.dropItem(RiderItems.kame_disk, 1);
				break;

			case 3:
				this.dropItem(RiderItems.kuma_disk, 1);
				break;

			case 4:
				this.dropItem(RiderItems.saru_disk, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.sushi_disk, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.common_disk, 2);
						break;

					case 2:
						this.dropItem(RiderItems.common_disk, 2);
						break;

					case 3:
						this.dropItem(RiderItems.common_disk, 2);
						break;

					case 4:
						this.dropItem(RiderItems.common_disk, 2);
						break;

					case 5:
						this.dropItem(RiderItems.common_disk, 2);
						break;
				}
				break;
			}
		}
	}
}
