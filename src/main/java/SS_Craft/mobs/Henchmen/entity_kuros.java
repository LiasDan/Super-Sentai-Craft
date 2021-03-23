package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_shishi_red;
import SS_Craft.mobs.Boss.entity_yami_0gou;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_kuros extends Entity_base_henchmen
{
	public entity_kuros(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_ressha, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_yami_0gou(world);
				
				switch (this.rand.nextInt(5))
				{
					case 0:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_ressha, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.blue_ressha, 1);
				break;

			case 2:
				this.dropItem(RiderItems.yellow_ressha, 1);
				break;

			case 3:
				this.dropItem(RiderItems.green_ressha, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_ressha, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(RiderItems.build_ressha, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.violet_ressha, 1);
						break;

					case 2:
						this.dropItem(RiderItems.blank_ressha, 2);
						break;

					case 3:
						this.dropItem(RiderItems.blank_ressha, 2);
						break;

					case 4:
						this.dropItem(RiderItems.blank_ressha, 2);
						break;

					case 5:
						this.dropItem(RiderItems.blank_ressha, 2);
						break;

					case 6:
						this.dropItem(RiderItems.blank_ressha, 2);
						break;
				}
				break;
			}
		}
	}
}
