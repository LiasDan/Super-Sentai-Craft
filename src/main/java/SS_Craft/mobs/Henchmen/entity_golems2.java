package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dragon_ranger;
import SS_Craft.mobs.mini_boss.entity_dora_sphinx;
import SS_Craft.mobs.mini_boss.entity_pumpkin_rapper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_golems2 extends Entity_base_henchmen
{
	public entity_golems2(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.blanknoitem));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.zyuranger_medal, 1);
			
			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new entity_pumpkin_rapper(world);
				 Entity_base_henchmen entitymob1  = new entity_dora_sphinx(world);
				 EntityBossBase entityboss = new entity_dragon_ranger(world);
				
				 switch (this.rand.nextInt(5))
				 {
			 			case 0:
							 switch (this.rand.nextInt(3))
							 {
						 			case 0:
						 			entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						 			world.spawnEntity(entitymob);
						 			break;
						 			
							 		case 1:
									entitymob1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
									world.spawnEntity(entitymob1);
									break;
									
							 		case 2:
							 		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
									world.spawnEntity(entityboss);
									break;
							 }
			 			break;
				 }
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.tyranno_medal, 1);
				break;

			case 1:
				this.dropItem(SentaiItems20.mammoth_medal, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.tricera_medal, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.tiger_medal, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.ptera_medal, 1);
				break;

			case 5:
				this.dropItem(SentaiItems20.zyuranger_medal, 2);
				break;
			}
		}
	}
}
