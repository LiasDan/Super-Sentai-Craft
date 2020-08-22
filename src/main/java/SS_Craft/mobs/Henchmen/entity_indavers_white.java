package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_indavers_white extends Entity_base_henchmen
{
	public entity_indavers_white(World par1World)
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
				EntityBossBase entityboss = new entity_hebitsukai_metal(world);
				
				switch (this.rand.nextInt(10))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.GRAY+"Dark Kyutama! Dark Change!"));
					playerIn.sendStatusMessage(new TextComponentString(TextFormatting.GRAY+"Dark Change!"), true);
					
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.ookami_kyutama, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.hebitsukai_kyutama, 1);
				break;

			case 2:
				this.dropItem(RiderItems.kajiki_kyutama, 1);
				break;

			case 3:
				switch (this.rand.nextInt(12))
				{
					case 0:
						this.dropItem(RiderItems.kani_kyutama, 1);
						break;
						
					case 1:
						this.dropItem(RiderItems.kujira_kyutama, 1);
						break;
							
					case 2:
						this.dropItem(RiderItems.karasu_kyutama, 1);
						break;
							
					case 3:
						this.dropItem(RiderItems.cepheus_kyutama, 1);
						break;
							
					case 4:
						this.dropItem(RiderItems.usagi_kyutama, 1);
						break;
							
					case 5:
						this.dropItem(RiderItems.hachibungi_kyutama, 1);
						break;
							
					case 6:
						this.dropItem(RiderItems.cerberus_kyutama, 1);
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
