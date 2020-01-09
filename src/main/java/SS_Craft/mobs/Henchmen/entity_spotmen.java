package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_spotmen extends Entity_base_henchmen
{
	public entity_spotmen(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.goggle_v_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.atlantis_ruby, 1);
				break;

			case 1:
				this.dropItem(RiderItems.angkor_wat_emerald, 1);
				break;

			case 2:
				this.dropItem(RiderItems.egypt_saphire, 1);
				break;

			case 3:
				this.dropItem(RiderItems.lemuria_opal, 1);
				break;

			case 4:
				this.dropItem(RiderItems.mayan_diamond, 1);
				break;

			case 5:
				this.dropItem(RiderItems.goggle_v_logo, 2);
				break;
			}
		}
	}
}
