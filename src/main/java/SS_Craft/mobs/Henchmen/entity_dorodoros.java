package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_dorodoros extends Entity_base_henchmen
{
	public entity_dorodoros(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.dorodoros_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems20.kakuranger_logo, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems20.sasuke_medal, 1);
				break;
				
			case 1:
				this.dropItem(SentaiItems20.tsuruhime_medal, 1);
				break;

			case 2:
				this.dropItem(SentaiItems20.seikai_medal, 1);
				break;

			case 3:
				this.dropItem(SentaiItems20.saizou_medal, 1);
				break;

			case 4:
				this.dropItem(SentaiItems20.jiraiya_medal, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(6))
				{
					case 0:
						this.dropItem(SentaiItems20.ninjaman_medal, 1);
						break;
					
					case 1:
						this.dropItem(SentaiItems20.kakuranger_logo, 2);
						break;

					case 2:
						this.dropItem(SentaiItems20.kakuranger_logo, 2);
						break;

					case 3:
						this.dropItem(SentaiItems20.kakuranger_logo, 2);
						break;

					case 4:
						this.dropItem(SentaiItems20.kakuranger_logo, 2);
						break;

					case 5:
						this.dropItem(SentaiItems20.kakuranger_logo, 2);
						break;
				}
				break;
			}
		}
	}
}
