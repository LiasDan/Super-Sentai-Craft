package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_pordermen extends Entity_base_henchmen
{
	public entity_pordermen(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_striker, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				switch (this.rand.nextInt(2))
				{
					case 0:
						this.dropItem(RiderItems.red_dial_fighter, 1);
						break;
						
					case 1:
						this.dropItem(RiderItems.ichigou_trigger_machine, 1);
						break;
				}
				break;

			case 1:
				switch (this.rand.nextInt(2))
				{
					case 0:
						this.dropItem(RiderItems.blue_dial_fighter, 1);
						break;
						
					case 1:
						this.dropItem(RiderItems.nigou_trigger_machine, 1);
						break;
				}
				break;

			case 2:
				switch (this.rand.nextInt(2))
				{
					case 0:
						this.dropItem(RiderItems.yellow_dial_fighter, 1);
						break;
						
					case 1:
						this.dropItem(RiderItems.sangou_trigger_machine, 1);
						break;
				}
				break;

			case 3:
				switch (this.rand.nextInt(6))
				{
					case 0:
						switch (this.rand.nextInt(2))
						{
							case 0:
								this.dropItem(RiderItems.silver_x_train, 1);
								break;
								
							case 1:
								this.dropItem(RiderItems.gold_x_train, 1);
								break;
						}
						break;
						
					case 1:
						this.dropItem(RiderItems.blank_striker, 2);
						break;
						
					case 2:
						this.dropItem(RiderItems.blank_striker, 2);
						break;
						
					case 3:
						this.dropItem(RiderItems.blank_striker, 2);
						break;
						
					case 4:
						this.dropItem(RiderItems.blank_striker, 2);
						break;
						
					case 5:
						this.dropItem(RiderItems.blank_striker, 2);
						break;
				}
				break;
			}
		}
	}
}
