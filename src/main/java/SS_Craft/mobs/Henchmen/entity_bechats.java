package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_bechats extends Entity_base_henchmen
{
	public entity_bechats(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blue_diamond, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_dark_kiramei_silver(world);
				
				switch (this.rand.nextInt(5))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.GRAY+"Yami o matoe!!"));
					playerIn.sendStatusMessage(new TextComponentString(TextFormatting.GRAY+"Yodon Change!"), true);
					
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.red_kiramei_stone, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.yellow_kiramei_stone, 1);
				break;

			case 2:
				this.dropItem(RiderItems.green_kiramei_stone, 1);
				break;

			case 3:
				this.dropItem(RiderItems.blue_kiramei_stone, 1);
				break;

			case 4:
				this.dropItem(RiderItems.pink_kiramei_stone, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(RiderItems.shiny_kiramei_stone, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.blue_diamond, 2);
						break;

					case 2:
						this.dropItem(RiderItems.blue_diamond, 2);
						break;

					case 3:
						this.dropItem(RiderItems.blue_diamond, 2);
						break;

					case 4:
						this.dropItem(RiderItems.blue_diamond, 2);
						break;

					case 5:
						this.dropItem(RiderItems.blue_diamond, 2);
						break;
				}
				break;
			}
		}
	}
}
