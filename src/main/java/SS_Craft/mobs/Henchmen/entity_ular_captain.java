package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_ular_captain extends Entity_base_henchmen
{
	public entity_ular_captain(World par1World)
	{
		super(par1World);
	}
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);	     
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.turboranger_logo, 1);
			switch (this.rand.nextInt(15))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_turbo_logo, 1);
				break;

			case 1:
				this.dropItem(RiderItems.black_turbo_logo, 1);
				break;

			case 2:
				this.dropItem(RiderItems.blue_turbo_logo, 1);
				break;

			case 3:
				this.dropItem(RiderItems.yellow_turbo_logo, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_turbo_logo, 1);
				break;   
				
			case 5:
				this.dropItem(RiderItems.red_turbo_logo, 2);
				this.dropItem(RiderItems.turboranger_logo, 1);
				break;

			case 6:
				this.dropItem(RiderItems.black_turbo_logo, 2);
				this.dropItem(RiderItems.turboranger_logo, 1);
				break;

			case 7:
				this.dropItem(RiderItems.blue_turbo_logo, 2);
				this.dropItem(RiderItems.turboranger_logo, 1);
				break;

			case 8:
				this.dropItem(RiderItems.yellow_turbo_logo, 2);
				this.dropItem(RiderItems.turboranger_logo, 1);
				break;

			case 9:
				this.dropItem(RiderItems.pink_turbo_logo, 2);
				this.dropItem(RiderItems.turboranger_logo, 1);
				break;   
				
			case 10:
				this.dropItem(RiderItems.red_turbo_logo, 3);
				this.dropItem(RiderItems.turboranger_logo, 2);
				break;

			case 11:
				this.dropItem(RiderItems.black_turbo_logo, 3);
				this.dropItem(RiderItems.turboranger_logo, 2);
				break;

			case 12:
				this.dropItem(RiderItems.blue_turbo_logo, 3);
				this.dropItem(RiderItems.turboranger_logo, 2);
				break;

			case 13:
				this.dropItem(RiderItems.yellow_turbo_logo, 3);
				this.dropItem(RiderItems.turboranger_logo, 2);
				break;

			case 14:
				this.dropItem(RiderItems.pink_turbo_logo, 3);
				this.dropItem(RiderItems.turboranger_logo, 2);
				break;
			}
		}
	}
}
