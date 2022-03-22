package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.SentaiItems60;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_pordermen extends Entity_base_henchmen
{
	public entity_pordermen(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.porderman_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems60.blank_striker, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				switch (this.rand.nextInt(2))
				{
					case 0:
						this.dropItem(SentaiItems60.red_dial_fighter, 1);
						break;
						
					case 1:
						this.dropItem(SentaiItems60.ichigou_trigger_machine, 1);
						break;
				}
				break;

			case 1:
				switch (this.rand.nextInt(2))
				{
					case 0:
						this.dropItem(SentaiItems60.blue_dial_fighter, 1);
						break;
						
					case 1:
						this.dropItem(SentaiItems60.nigou_trigger_machine, 1);
						break;
				}
				break;

			case 2:
				switch (this.rand.nextInt(2))
				{
					case 0:
						this.dropItem(SentaiItems60.yellow_dial_fighter, 1);
						break;
						
					case 1:
						this.dropItem(SentaiItems60.sangou_trigger_machine, 1);
						break;
				}
				break;

			case 3:
				switch (this.rand.nextInt(6))
				{
					case 0:
						switch (this.rand.nextInt(2))
						{
							case 0:
								this.dropItem(SentaiItems60.silver_x_train, 1);
								break;
								
							case 1:
								this.dropItem(SentaiItems60.gold_x_train, 1);
								break;
						}
						break;
						
					case 1:
						this.dropItem(SentaiItems60.blank_striker, 2);
						break;
						
					case 2:
						this.dropItem(SentaiItems60.blank_striker, 2);
						break;
						
					case 3:
						this.dropItem(SentaiItems60.blank_striker, 2);
						break;
						
					case 4:
						this.dropItem(SentaiItems60.blank_striker, 2);
						break;
						
					case 5:
						this.dropItem(SentaiItems60.blank_striker, 2);
						break;
				}
				break;
			}
		}
	}
}
