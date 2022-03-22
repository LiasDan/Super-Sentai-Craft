package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_ugatz extends Entity_base_henchmen
{
	public entity_ugatz(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.ugatz_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.blank_engine_soul, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.speedor_soul, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.buson_soul, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.bear_rv_soul, 1);
				break;

			case 3:
				switch (this.rand.nextInt(9))
				{  		   	    		
					case 0:
						this.dropItem(SentaiItems40.birca_soul, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.gunpherd_soul, 1);
						break;

					case 2:
						this.dropItem(SentaiItems40.toripter_soul, 1);
						break;
						
					case 3:
						this.dropItem(SentaiItems40.jetras_soul, 1);
						break;

					case 4:
						this.dropItem(SentaiItems40.blank_engine_soul, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.blank_engine_soul, 2);
						break;

					case 6:
						this.dropItem(SentaiItems40.blank_engine_soul, 2);
						break;

					case 7:
						this.dropItem(SentaiItems40.blank_engine_soul, 2);
						break;

					case 8:
						this.dropItem(SentaiItems40.blank_engine_soul, 2);
						break;
				}
				break;
			}
		}
	}
}
