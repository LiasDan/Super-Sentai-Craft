package SS_Craft.mobs.Henchmen;

import SS_Craft.RiderItems;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_dark_kiramei_silver;
import SS_Craft.mobs.Boss.entity_hebitsukai_metal;
import SS_Craft.mobs.Boss.entity_stacaesar;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_kudakks extends Entity_base_henchmen
{
	public entity_kudakks(World par1World)
	{
		super(par1World);
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.plug_lancer);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.blank_sentai_gear, 1);
			
			if (this.getAttackTarget() instanceof EntityPlayer)
			{
				EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss = new entity_stacaesar(world);
				
				switch (this.rand.nextInt(5))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"Ja-BAN! Stacaesar!"));
					playerIn.sendStatusMessage(new TextComponentString(TextFormatting.DARK_PURPLE+"Ankoku Change!"), true);
					
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			}
			
			switch (this.rand.nextInt(6))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.zenkaizer_gear, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.zenkai_juran_gear, 1);
				break;

			case 2:
				this.dropItem(RiderItems.zenkai_gaon_gear, 1);
				break;

			case 3:
				this.dropItem(RiderItems.zenkai_magine_gear, 1);
				break;

			case 4:
				this.dropItem(RiderItems.zenkai_vroon_gear, 1);
				break;
				
			case 5:
				switch (this.rand.nextInt(7))
				{
					case 0:
						this.dropItem(RiderItems.twokaizer_gear, 1);
						break;
					
					case 1:
						this.dropItem(RiderItems.zenkai_red_gear, 1);
						break;

					case 2:
						this.dropItem(RiderItems.blank_sentai_gear, 2);
						break;

					case 3:
						this.dropItem(RiderItems.blank_sentai_gear, 2);
						break;

					case 4:
						this.dropItem(RiderItems.blank_sentai_gear, 2);
						break;

					case 5:
						this.dropItem(RiderItems.blank_sentai_gear, 2);
						break;

					case 6:
						this.dropItem(RiderItems.blank_sentai_gear, 2);
						break;
				}
				break;
			}
		}
	}
}
