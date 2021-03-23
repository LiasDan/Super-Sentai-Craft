package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_shishi_red;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_indavers_blue extends Entity_base_henchmen
{
	public entity_indavers_blue(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_kyutama, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_dark_shishi_red(world);
				
				switch (this.rand.nextInt(5))
				{
					case 0:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.shishi_kyutama, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.tenbin_kyutama, 1);
				break;

			case 2:
				this.dropItem(RiderItems.chameleon_kyutama, 1);
				break;

			case 3:
				switch (this.rand.nextInt(12))
				{
					case 0:
						this.dropItem(RiderItems.ushikai_kyutama, 1);
						break;
						
					case 1:
						this.dropItem(RiderItems.futago_kyutama, 1);
						break;
							
					case 2:
						this.dropItem(RiderItems.andromeda_kyutama, 1);
						break;
							
					case 3:
						this.dropItem(RiderItems.iruka_kyutama, 1);
						break;
							
					case 4:
						this.dropItem(RiderItems.eridanus_kyutama, 1);
						break;
							
					case 5:
						this.dropItem(RiderItems.minami_juuji_kyutama, 1);
						break;
							
					case 6:
						this.dropItem(RiderItems.kogitsune_kyutama, 1);
						break;

					case 7:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 8:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 9:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 10:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;

					case 11:
						this.dropItem(RiderItems.blank_kyutama, 2);
						break;
				}
				break;
			}
		}
	}
}
