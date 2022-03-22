package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems40;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_droans extends Entity_base_henchmen
{
	public entity_droans(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(Items.BOOK));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.akibaranger_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.akiba_red_logo, 1);
				break;

			case 1:
				this.dropItem(SentaiItems40.akiba_blue_logo, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.akiba_yellow_logo, 1);
				break;

			case 3:
				switch (this.rand.nextInt(10))
				{   		   	    		
				case 0:
					this.dropItem(SentaiItems40.munyu_munyu_zubaan, 1);
					break;

				case 1:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 2:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 3:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 4:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 5:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 6:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 7:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 8:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;

				case 9:
					this.dropItem(SentaiItems40.akibaranger_logo, 2);
					break;
				}
				break;
			}
		}
	}
}
