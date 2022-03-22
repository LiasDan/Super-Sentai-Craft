package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_imps extends Entity_base_henchmen
{
	public entity_imps(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.imps_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.gogo_v_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.go_red_badge, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems40.go_blue_badge, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.go_green_badge, 1);
				break;

			case 3:
				this.dropItem(SentaiItems40.go_yellow_badge, 1);
				break;

			case 4:
				this.dropItem(SentaiItems40.go_pink_badge, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems40.zeek_fragment, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems40.gogo_v_logo, 2);
						break;

					case 2:
						this.dropItem(SentaiItems40.gogo_v_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems40.gogo_v_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems40.gogo_v_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems40.gogo_v_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
