package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_crimers extends Entity_base_henchmen
{
	public entity_crimers(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_card, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.ace_card, 1);
				break;

			case 1:
				this.dropItem(RiderItems.jack_card, 1);
				break;

			case 2:
				this.dropItem(RiderItems.queen_card, 1);
				break;

			case 3:
				this.dropItem(RiderItems.king_card, 1);
				break;

			case 4:
				this.dropItem(RiderItems.big_one_card, 1);
				break;

			case 5:
				this.dropItem(RiderItems.blank_card, 2);
				break;
			}
		}
	}
}
