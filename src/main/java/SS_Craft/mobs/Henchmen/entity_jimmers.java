package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import SS_Craft.mobs.Boss.entity_doctor_kemp;
import SS_Craft.mobs.Boss.entity_doctor_mazenda;
import SS_Craft.mobs.Boss.entity_doctor_obular;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_jimmers extends Entity_base_henchmen
{
	public entity_jimmers(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.jimmers_hatchet));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.liveman_circuit, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_doctor_kemp(world);
				EntityBossBase entityboss1 = new entity_doctor_mazenda(world);
				EntityBossBase entityboss2 = new entity_doctor_obular(world);
				
				switch (this.rand.nextInt(5))
				{
				case 0:
					switch (this.rand.nextInt(3))
					{
					case 0:
						entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
					case 1:
						entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss1);
						break;
					case 2:	
						entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss2);
						break;
					}
					break;
				}
			}
			
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.red_falcon_logo, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems20.yellow_lion_logo, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.blue_dolphin_logo, 1);
				break;

			case 3:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(SentaiItems20.black_bison_logo, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems20.green_sai_logo, 1);
						break;

					case 2:
						this.dropItem(SentaiItems20.liveman_circuit, 2);
						break;

					case 3:
						this.dropItem(SentaiItems20.liveman_circuit, 2);
						break;

					case 4:
						this.dropItem(SentaiItems20.liveman_circuit, 2);
						break;

					case 5:
						this.dropItem(SentaiItems20.liveman_circuit, 2);
						break;

					case 6:
						this.dropItem(SentaiItems20.liveman_circuit, 2);
						break;
				}
				break;
			}
		}
	}
}
