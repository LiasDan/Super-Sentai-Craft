package SS_Craft.mobs.Henchmen;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems40;
import SS_Craft.mobs.Boss.EntityBossBase;
import SS_Craft.mobs.Boss.entity_brave_kyoryu_gold;
import SS_Craft.mobs.Boss.entity_chaos_ryuger;
import SS_Craft.mobs.Boss.entity_death_ryuger;
import SS_Craft.mobs.Boss.entity_dogold;
import SS_Craft.mobs.Boss.entity_gedou_shinken_red;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_zorimas extends Entity_base_henchmen
{
	public entity_zorimas(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(SentaiItems20.zorin_gun));
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			if (this.world.provider.getDimensionType().getId()==-1)
			{
				this.dropItem(SentaiItems40.blank_brave_zyudenchi, 1);
				
				if (this.getAttackTarget() instanceof EntityPlayer)
				{
					EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
					EntityBossBase entityboss = new entity_brave_kyoryu_gold(world);
					
					switch (this.rand.nextInt(5))
					{
					case 0:
						playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"Gaburincho! PTERAVOLTON!!!"));
						playerIn.sendStatusMessage(new TextComponentString(TextFormatting.GOLD+"Kyoryu Change!"), true);
						
						entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
					}
				}
				
				switch (this.rand.nextInt(6))
				{   		   	    		
				case 0:
					this.dropItem(SentaiItems40.guntyra_zyudenchi, 1);
					break;
					
				case 1:
					this.dropItem(SentaiItems40.stegonsaw_zyudenchi, 1);
					break;

				case 2:
					this.dropItem(SentaiItems40.shovecera_zyudenchi, 1);
					break;

				case 3:
					this.dropItem(SentaiItems40.parasaser_zyudenchi, 1);
					break;

				case 4:
					this.dropItem(SentaiItems40.rapx_zyudenchi, 1);
					break;
					
				case 5:
					this.dropItem(SentaiItems40.blank_brave_zyudenchi, 2);
					break;
				}
			}
			else
			{
				this.dropItem(SentaiItems40.blank_zyudenchi, 1);
				
				if (this.getAttackTarget() instanceof EntityPlayer)
				{
					EntityPlayer playerIn =	(EntityPlayer) this.getAttackTarget();
					EntityBossBase entityboss = new entity_dogold(world);
					EntityBossBase entityboss1 = new entity_death_ryuger(world);
					EntityBossBase entityboss2 = new entity_chaos_ryuger(world);
					
					switch (this.rand.nextInt(5))
					{
					case 0:
						playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"HOW IRRITATING!!!"));
						
						entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
					case 1:
						playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"Deboth In!"));
						
						entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss1);
						break;
					case 2:
						entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss2);
						break;
					}
				}
				
				switch (this.rand.nextInt(6))
				{   		   	    		
				case 0:
					this.dropItem(SentaiItems40.gabutyra_zyudenchi, 1);
					break;
					
				case 1:
					this.dropItem(SentaiItems40.parasagun_zyudenchi, 1);
					break;

				case 2:
					this.dropItem(SentaiItems40.stegotchi_zyudenchi, 1);
					break;

				case 3:
					this.dropItem(SentaiItems40.zakutor_zyudenchi, 1);
					break;

				case 4:
					this.dropItem(SentaiItems40.dricera_zyudenchi, 1);
					break;
					
				case 5:
					switch (this.rand.nextInt(9))
					{
						case 0:
							this.dropItem(SentaiItems40.ankydon_zyudenchi, 1);
							break;
						
						case 1:
							this.dropItem(SentaiItems40.bunpachy_zyudenchi, 1);
							break;

						case 2:
							this.dropItem(SentaiItems40.plezuon_zyudenchi, 1);
							break;

						case 3:
							this.dropItem(SentaiItems40.bragigas_zyudenchi, 1);
							break;

						case 4:
							this.dropItem(SentaiItems40.blank_zyudenchi, 2);
							break;

						case 5:
							this.dropItem(SentaiItems40.blank_zyudenchi, 2);
							break;

						case 6:
							this.dropItem(SentaiItems40.blank_zyudenchi, 2);
							break;

						case 7:
							this.dropItem(SentaiItems40.blank_zyudenchi, 2);
							break;

						case 8:
							this.dropItem(SentaiItems40.blank_zyudenchi, 2);
							break;
					}
					break;
				}
			}
		}
	}
}
