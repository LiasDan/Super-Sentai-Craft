package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_drunns extends Entity_base_henchmen
{
	public entity_drunns(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_ryusoul, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_ryusoul, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.blue_ryusoul, 1);
				break;

			case 2:
				this.dropItem(RiderItems.pink_ryusoul, 1);
				break;

			case 3:
				this.dropItem(RiderItems.green_ryusoul, 1);
				break;

			case 4:
				this.dropItem(RiderItems.black_ryusoul, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(RiderItems.gold_ryusoul, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.gai_soul, 1);
						break;

					case 2:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 3:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 4:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 5:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 6:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;
				}
				break;
			}
		}
	}
}
