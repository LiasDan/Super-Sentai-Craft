package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_neo_deka_red;
import SS_Craft.mobs.Boss.entity_neo_deka_yellow;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_igaroids extends Entity_base_henchmen
{
	public entity_igaroids(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.iga_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.dekaranger_badge, 1);
			
			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new entity_neo_deka_red(world);
				 EntityBossBase entityboss1  = new entity_neo_deka_yellow(world);
				
				 switch (this.rand.nextInt(5))
				 {
				 		case 1:
				 		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						playerIn.sendStatusMessage(new TextComponentString(TextFormatting.RED+"Emergency! Dekaranger!"), true);
						world.spawnEntity(entityboss);
						break;
						
				 		case 2:
					 	entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						playerIn.sendStatusMessage(new TextComponentString(TextFormatting.YELLOW+"Emergency! Dekaranger!"), true);
						world.spawnEntity(entityboss1);
						break;
				 }
			}
			
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.deka_master_badge, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.deka_swan_badge, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.deka_bright_badge, 1);
				break;

			case 3:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems40.deka_gold_badge, 1);
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
