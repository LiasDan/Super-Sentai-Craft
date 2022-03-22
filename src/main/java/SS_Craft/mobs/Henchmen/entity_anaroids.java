package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.mobs.mini_boss.entity_batsuroids;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_anaroids extends Entity_base_henchmen
{
	public entity_anaroids(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.ana_knife));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.dekaranger_badge, 1);
			
			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new entity_batsuroids(world);
				
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
				this.dropItem(SentaiItems40.deka_red_badge, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.deka_blue_badge, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.deka_green_badge, 1);
				break;

			case 3:
				this.dropItem(SentaiItems40.deka_yellow_badge, 1);
				break;

			case 4:
				this.dropItem(SentaiItems40.deka_pink_badge, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems40.deka_break_badge, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.dekaranger_badge, 2);
						break;

					case 2:
						this.dropItem(SentaiItems40.dekaranger_badge, 2);
						break;

					case 3:
						this.dropItem(SentaiItems40.dekaranger_badge, 2);
						break;

					case 4:
						this.dropItem(SentaiItems40.dekaranger_badge, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.dekaranger_badge, 2);
						break;
				}
				break;
			}
		}
	}
}
