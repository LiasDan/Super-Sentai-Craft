package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_moebas extends Entity_base_henchmen
{
	public entity_moebas(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.king_s_credential, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.eagle_cube, 1);
				break;

			case 1:
				this.dropItem(RiderItems.shark_cube, 1);
				break;

			case 2:
				this.dropItem(RiderItems.lion_cube, 1);
				break;

			case 3:
				this.dropItem(RiderItems.elephant_cube, 1);
				break;

			case 4:
				this.dropItem(RiderItems.tiger_cube, 1);
				break;

			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						switch (this.rand.nextInt(3))
						{
							case 0:
								this.dropItem(RiderItems.rhinos_cube, 1);
								break;
								
							case 1:
								this.dropItem(RiderItems.wolf_cube, 1);
								break;
								
							case 2:
								this.dropItem(RiderItems.crocodile_cube, 1);
								break;
						}
						break;
					
					case 1:
						this.dropItem(RiderItems.bud_king_s_credential, 1);
						break;
						
					case 2:
						this.dropItem(RiderItems.king_s_credential, 2);
						break;
						
					case 3:
						this.dropItem(RiderItems.king_s_credential, 2);
						break;
						
					case 4:
						this.dropItem(RiderItems.king_s_credential, 2);
						break;
						
					case 5:
						this.dropItem(RiderItems.king_s_credential, 2);
						break;
						
					case 6:
						this.dropItem(RiderItems.king_s_credential, 2);
						break;
				}
				break;
			}
		}
	}
}
