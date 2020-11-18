package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_ulars extends Entity_base_henchmen
{
	public entity_ulars(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.turboranger_logo, 1);
			
			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new entity_ular_captain(world);
				
				 switch (this.rand.nextInt(5))
				 {
				 		case 1:
						entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entitymob);
						break;
				 }
			}
			
			switch (this.rand.nextInt(6))
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
				this.dropItem(RiderItems.turboranger_logo, 2);
				break;
			}
		}
	}
}
