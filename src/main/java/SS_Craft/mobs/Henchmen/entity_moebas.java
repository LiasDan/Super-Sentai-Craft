package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_moebas extends Entity_base_henchmen
{
	public entity_moebas(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.moebas_sword));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(SentaiItems40.king_s_credential, 1);
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(SentaiItems40.eagle_cube, 1);
				break;

			case 1:
				this.dropItem(SentaiItems40.shark_cube, 1);
				break;

			case 2:
				this.dropItem(SentaiItems40.lion_cube, 1);
				break;

			case 3:
				this.dropItem(SentaiItems40.elephant_cube, 1);
				break;

			case 4:
				this.dropItem(SentaiItems40.tiger_cube, 1);
				break;

			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						switch (this.rand.nextInt(3))
						{
							case 0:
								this.dropItem(SentaiItems40.rhinos_cube, 1);
								break;
								
							case 1:
								this.dropItem(SentaiItems40.wolf_cube, 1);
								break;
								
							case 2:
								this.dropItem(SentaiItems40.crocodile_cube, 1);
								break;
						}
						break;
					
					case 1:
						this.dropItem(SentaiItems40.bud_king_s_credential, 1);
						break;
						
					case 2:
						this.dropItem(SentaiItems40.king_s_credential, 2);
						break;
						
					case 3:
						this.dropItem(SentaiItems40.king_s_credential, 2);
						break;
						
					case 4:
						this.dropItem(SentaiItems40.king_s_credential, 2);
						break;
						
					case 5:
						this.dropItem(SentaiItems40.king_s_credential, 2);
						break;
						
					case 6:
						this.dropItem(SentaiItems40.king_s_credential, 2);
						break;
				}
				break;
			}
		}
	}
}
