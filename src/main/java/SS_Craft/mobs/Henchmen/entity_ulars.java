package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_ulars extends Entity_base_henchmen
{
	public entity_ulars(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.jakotsuken));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.turboranger_logo, 1);
			
			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new entity_ular_captain(world);
				
				 switch (this.rand.nextInt(5))
				 {
				 		case 0:
						entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entitymob);
						break;
				 }
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.red_turbo_logo, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.black_turbo_logo, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.blue_turbo_logo, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.yellow_turbo_logo, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.pink_turbo_logo, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.turboranger_logo, 2);
				break;
			}
		}
	}
}
