package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_gaisorg;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_drunns extends Entity_base_henchmen
{
	public entity_drunns(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_ryusoul, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_gaisorg(world);
				
				switch (this.rand.nextInt(5))
				{
				case 0:
					playerIn.sendStatusMessage(new TextComponentString(TextFormatting.LIGHT_PURPLE+"Gaisoul Change!"), true);
					
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_ryusoul, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.blue_ryusoul, 1);
				break;

			case 2:
				this.dropItem(RiderItems.pink_ryusoul, 1);
				break;

			case 3:
				this.dropItem(RiderItems.green_ryusoul, 1);
				break;

			case 4:
				this.dropItem(RiderItems.black_ryusoul, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.gold_ryusoul, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 2:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 3:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 4:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;

					case 5:
						this.dropItem(RiderItems.blank_ryusoul, 2);
						break;
				}
				break;
			}
		}
	}
}
