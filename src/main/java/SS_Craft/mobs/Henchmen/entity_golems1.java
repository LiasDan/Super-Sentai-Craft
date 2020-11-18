package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dragon_ranger;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_golems1 extends Entity_base_henchmen
{
	public entity_golems1(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.zyuranger_medal, 1);
			
			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new entity_pumpkin_rapper(world);
				 EntityBossBase entityboss = new entity_dragon_ranger(world);
				
				 switch (this.rand.nextInt(5))
				 {
				 		case 1:
						entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entitymob);
						break;
						
				 		case 2:
				 		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
				 }
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.tyranno_medal, 1);
				break;

			case 1:
				this.dropItem(RiderItems.mammoth_medal, 1);
				break;

			case 2:
				this.dropItem(RiderItems.tricera_medal, 1);
				break;

			case 3:
				this.dropItem(RiderItems.tiger_medal, 1);
				break;

			case 4:
				this.dropItem(RiderItems.ptera_medal, 1);
				break;

			case 5:
				this.dropItem(RiderItems.zyuranger_medal, 2);
				break;
			}
		}
	}
}
