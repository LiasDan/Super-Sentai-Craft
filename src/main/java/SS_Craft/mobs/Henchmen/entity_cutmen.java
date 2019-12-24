package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_cutmen extends Entity_base_henchmen
{
	public entity_cutmen(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.battle_fever_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.japan_badge, 1);
				break;

			case 1:
				this.dropItem(RiderItems.cossack_badge, 1);
				break;

			case 2:
				this.dropItem(RiderItems.france_badge, 1);
				break;

			case 3:
				this.dropItem(RiderItems.kenya_badge, 1);
				break;

			case 4:
				this.dropItem(RiderItems.america_badge, 1);
				break;

			case 5:
				this.dropItem(RiderItems.battle_fever_logo, 2);
				break;
			}
		}
	}
}
