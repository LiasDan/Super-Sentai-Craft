package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_barmias_black extends Entity_base_henchmen
{
	public entity_barmias_black(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.barmias_staff));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.abaranger_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.tyranno_dino_guts, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.tricera_dino_guts, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.ptera_dino_guts, 1);
				break;

			case 3:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(SentaiItems40.brachio_dino_guts, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.top_dino_guts, 1);
						break;

					case 2:
						this.dropItem(SentaiItems40.abaranger_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems40.abaranger_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems40.abaranger_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.abaranger_logo, 2);
						break;

					case 6:
						this.dropItem(SentaiItems40.abaranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
