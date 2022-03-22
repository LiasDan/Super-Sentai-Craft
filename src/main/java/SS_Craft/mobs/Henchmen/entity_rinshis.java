package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_rinshis extends Entity_base_henchmen
{
	public entity_rinshis(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.rinshi_lance));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.gekiranger_logo, 1);
			switch (this.rand.nextInt(4))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.tiger_spirit, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.cheetah_spirit, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.jaguar_spirit, 1);
				break;

			case 3:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(SentaiItems40.wolf_spirit, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.rhino_spirit, 1);
						break;

					case 2:
						this.dropItem(SentaiItems40.gekiranger_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems40.gekiranger_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems40.gekiranger_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.gekiranger_logo, 2);
						break;

					case 6:
						this.dropItem(SentaiItems40.gekiranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
