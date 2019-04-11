package SS_Craft.blocks;

import java.util.Random;

import SS_Craft.RiderItems;
import SS_Craft.TokuCraft_core;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ore_block extends Block implements IHasModel
{
	public Item CRYSTAL;
	
	public ore_block(String string, Material par3Material,Item ore,int lv)
	{
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setUnlocalizedName(string);
		setRegistryName(string);
		CRYSTAL = ore;

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}
	
	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune)
	{
		Random generator = new Random();
		
		//01 Goranger
		if (CRYSTAL==RiderItems.goranger_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25)
			{
				return RiderItems.aka_star;
			}
			else if (rand<50)
			{
				return RiderItems.ao_star;
			}
			else if (rand<75)
			{
				return RiderItems.ki_star;
			}
			else if (rand<100)
			{
				return RiderItems.momo_star;
			}
			else if (rand<125)
			{
				return RiderItems.mido_star;
			}
			{
				return CRYSTAL;
			}
		}
		//02 J.A.K.Q.
		if (CRYSTAL==RiderItems.blank_card)
		{
			int rand = generator.nextInt(250);
			if (rand<25)
			{
				return RiderItems.ace_card;
			}
			else if (rand<50)
			{
				return RiderItems.jack_card;
			}
			else if (rand<75)
			{
				return RiderItems.queen_card;
			}
			else if (rand<100)
			{
				return RiderItems.king_card;
			}
			else if (rand<125)
			{
				return RiderItems.big_one_card;
			}
			{
				return CRYSTAL;
			}
		}
		//03 Battle Fever
		if (CRYSTAL==RiderItems.battle_fever_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25)
			{
				return RiderItems.japan_badge;
			}
			else if (rand<50)
			{
				return RiderItems.cossack_badge;
			}
			else if (rand<75)
			{
				return RiderItems.france_badge;
			}
			else if (rand<100)
			{
				return RiderItems.kenya_badge;
			}
			else if (rand<125)
			{
				return RiderItems.america_badge;
			}
			{
				return CRYSTAL;
			}
		}
		//05 Sun Vulcan
		if (CRYSTAL==RiderItems.sun_vulcan_logo)
		{
			int rand = generator.nextInt(150);
			if (rand<25)
			{
				return RiderItems.vul_eagle_medal;
			}
			else if (rand<50)
			{
				return RiderItems.vul_shark_medal;
			}
			else if (rand<75)
			{
				return RiderItems.vul_panther_medal;
			}
			{
				return CRYSTAL;
			}
		}
		//11 Maskman
		if (CRYSTAL==RiderItems.maskman_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25)
			{
				return RiderItems.red_aura_power;
			}
			else if (rand<50)
			{
				return RiderItems.black_aura_power;
			}
			else if (rand<75)
			{
				return RiderItems.blue_aura_power;
			}
			else if (rand<100)
			{
				return RiderItems.yellow_aura_power;
			}
			else if (rand<125)
			{
				return RiderItems.pink_aura_power;
			}
			{
				return CRYSTAL;
			}
		}
		//13 Turboranger
		if (CRYSTAL==RiderItems.turboranger_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25)
			{
				return RiderItems.red_turbo_logo;
			}
			else if (rand<50)
			{
				return RiderItems.black_turbo_logo;
			}
			else if (rand<75)
			{
				return RiderItems.blue_turbo_logo;
			}
			else if (rand<100)
			{
				return RiderItems.yellow_turbo_logo;
			}
			else if (rand<125)
			{
				return RiderItems.pink_turbo_logo;
			}
			{
				return CRYSTAL;
			}
		}
		//20 Carranger
		if (CRYSTAL==RiderItems.carranger_logo)
		{
			int rand = generator.nextInt(270);
			if (rand<25)
			{
				return RiderItems.red_racer_badge;
			}
			else if (rand<50)
			{
				return RiderItems.blue_racer_badge;
			}
			else if (rand<75)
			{
				return RiderItems.green_racer_badge;
			}
			else if (rand<100)
			{
				return RiderItems.yellow_racer_badge;
			}
			else if (rand<125)
			{
				return RiderItems.pink_racer_badge;
			}
			else if (rand<135)
			{
				return RiderItems.white_racer_badge;
			}
			{
				return CRYSTAL;
			}
		}
		//22 Gingaman
		if (CRYSTAL==RiderItems.gingaman_logo)
		{
			int rand = generator.nextInt(270);
			if (rand<25)
			{
				return RiderItems.red_ginga_medal;
			}
			else if (rand<50)
			{
				return RiderItems.green_ginga_medal;
			}
			else if (rand<75)
			{
				return RiderItems.blue_ginga_medal;
			}
			else if (rand<100)
			{
				return RiderItems.yellow_ginga_medal;
			}
			else if (rand<125)
			{
				return RiderItems.pink_ginga_medal;
			}
			else if (rand<135)
			{
				return RiderItems.lights_of_ginga;
			}
			{
				return CRYSTAL;
			}
		}
		//23 GoGo-V
		if (CRYSTAL==RiderItems.gogo_v_logo)
		{
			int rand = generator.nextInt(250);
			if (rand<25)
			{
				return RiderItems.go_red_badge;
			}
			else if (rand<50)
			{
				return RiderItems.go_blue_badge;
			}
			else if (rand<75)
			{
				return RiderItems.go_green_badge;
			}
			else if (rand<100)
			{
				return RiderItems.go_yellow_badge;
			}
			else if (rand<125)
			{
				return RiderItems.go_pink_badge;
			}
			{
				return CRYSTAL;
			}
		}
		//25 Gaoranger
		if (CRYSTAL==RiderItems.empty_gao_jewel)
		{
			int rand = generator.nextInt(290);
			if (rand<25)
			{
				return RiderItems.gao_lion_jewel;
			}
			else if (rand<50)
			{
				return RiderItems.gao_eagle_jewel;
			}
			else if (rand<75)
			{
				return RiderItems.gao_shark_jewel;
			}
			else if (rand<100)
			{
				return RiderItems.gao_bison_jewel;
			}
			else if (rand<125)
			{
				return RiderItems.gao_tiger_jewel;
			}
			else if (rand<145)
			{
				return RiderItems.gao_wolf_jewel;
			}
			{
				return CRYSTAL;
			}
		}
		//30 Boukenger
		if (CRYSTAL==RiderItems.boukenger_logo)
		{
			int rand = generator.nextInt(292);
			if (rand<25)
			{
				return RiderItems.bouken_red_logo;
			}
			else if (rand<50)
			{
				return RiderItems.bouken_black_logo;
			}
			else if (rand<75)
			{
				return RiderItems.bouken_blue_logo;
			}
			else if (rand<100)
			{
				return RiderItems.bouken_yellow_logo;
			}
			else if (rand<125)
			{
				return RiderItems.bouken_pink_logo;
			}
			else if (rand<145)
			{
				return RiderItems.bouken_silver_logo;
			}
			else if (rand<146)
			{
				return RiderItems.scale_of_the_salamander;
			}
			{
				return CRYSTAL;
			}
		}
		//33 Shinkenger
		if (CRYSTAL==RiderItems.common_disk)
		{
			int rand = generator.nextInt(314);
			if (rand<25)
			{
				return RiderItems.shishi_disk;
			}
			else if (rand<50)
			{
				return RiderItems.ryuu_disk;
			}
			else if (rand<75)
			{
				return RiderItems.kame_disk;
			}
			else if (rand<100)
			{
				return RiderItems.kuma_disk;
			}
			else if (rand<125)
			{
				return RiderItems.saru_disk;
			}
			else if (rand<145)
			{
				return RiderItems.sushi_disk;
			}
			else if (rand<155)
			{
				return RiderItems.super_disk;
			}
			else if (rand<156)
			{
				return RiderItems.hyper_disk;
			}
			else if (rand<157)
			{
				return RiderItems.gedou_disk;
			}
			{
				return CRYSTAL;
			}
		}
		//36 Go-Busters
		if (CRYSTAL==RiderItems.enetron)
		{
			int rand = generator.nextInt(232);
			if (rand<25)
			{
				return RiderItems.red_enetron;
			}
			if (rand<50)
			{
				return RiderItems.blue_enetron;
			}
			if (rand<75)
			{
				return RiderItems.yellow_enetron;
			}
			if (rand<95)
			{
				return RiderItems.gold_enetron;
			}
			if (rand<115)
			{
				return RiderItems.silver_enetron;
			}
			if (rand<116)
			{
				return RiderItems.custom_visor;
			}
		}
		if (CRYSTAL==RiderItems.blank_animal_disk)
		{
			int rand = generator.nextInt(332);
			if (rand<25)
			{
				return RiderItems.cheetah_animal_disk;
			}
			if (rand<50)
			{
				return RiderItems.gorilla_animal_disk;
			}
			if (rand<75)
			{
				return RiderItems.rabbit_animal_disk;
			}
			if (rand<95)
			{
				return RiderItems.beetle_animal_disk;
			}
			if (rand<115)
			{
				return RiderItems.stag_animal_disk;
			}
			if (rand<140)
			{
				return RiderItems.hippopotamus_animal_disk;
			}
			if (rand<165)
			{
				return RiderItems.puma_animal_disk;
			}
			if (rand<166)
			{
				return RiderItems.custom_visor;
			}
		}
		//42-43 Lupinranger VS Patranger
		if (CRYSTAL==RiderItems.blank_striker)
		{
			int rand = generator.nextInt(484);
			if (rand<25)
			{
				return RiderItems.red_dial_fighter;
			}
			if (rand<50)
			{
				return RiderItems.ichigou_trigger_machine;
			}
			if (rand<75)
			{
				return RiderItems.blue_dial_fighter;
			}
			if (rand<100)
			{
				return RiderItems.nigou_trigger_machine;
			}
			if (rand<125)
			{
				return RiderItems.yellow_dial_fighter;
			}
			if (rand<150)
			{
				return RiderItems.sangou_trigger_machine;
			}
			if (rand<170)
			{
				return RiderItems.silver_x_train;
			}
			if (rand<190)
			{
				return RiderItems.gold_x_train;
			}
			if (rand<200)
			{
				return RiderItems.scissor_dial_fighter;
			}
			if (rand<210)
			{
				return RiderItems.crane_trigger_machine;
			}
			if (rand<220)
			{
				return RiderItems.magic_dial_fighter;
			}
			if (rand<230)
			{
				return RiderItems.splash_trigger_machine;
			}
			if (rand<235)
			{
				return RiderItems.good_striker;
			}
			if (rand<240)
			{
				return RiderItems.jackpot_striker;
			}
			if (rand<241)
			{
				return RiderItems.victory_striker;
			}
			if (rand<242)
			{
				return RiderItems.siren_striker;
			}
			{
				return CRYSTAL;
			}
		}
		//44 Ryusoulger
		if (CRYSTAL==RiderItems.blank_ryusoul)
		{
			int rand = generator.nextInt(350);
			if (rand<25)
			{
				return RiderItems.red_ryusoul;
			}
			else if (rand<50)
			{
				return RiderItems.blue_ryusoul;
			}
			else if (rand<75)
			{
				return RiderItems.pink_ryusoul;
			}
			else if (rand<100)
			{
				return RiderItems.green_ryusoul;
			}
			else if (rand<125)
			{
				return RiderItems.black_ryusoul;
			}
			else if (rand<135)
			{
				return RiderItems.tsuyo_soul;
			}
			else if (rand<145)
			{
				return RiderItems.nobi_soul;
			}
			else if (rand<155)
			{
				return RiderItems.omo_soul;
			}
			else if (rand<165)
			{
				return RiderItems.haya_soul;
			}
			else if (rand<175)
			{
				return RiderItems.kata_soul;
			}
			{
				return CRYSTAL;
			}
		}
		
		return CRYSTAL;
	}

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}

	@Override
	public void registerModels() 
	{
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
}