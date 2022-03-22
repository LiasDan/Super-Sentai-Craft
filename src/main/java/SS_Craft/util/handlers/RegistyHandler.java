package SS_Craft.util.handlers;

import SS_Craft.SentaiItems20;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import SS_Craft.util.Refercence;
import SS_Craft.world.gen.WorldGenCustomStructures;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import static net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;

@EventBusSubscriber
public class RegistyHandler {

	@SubscribeEvent
	public static void onFly(TickEvent.PlayerTickEvent event) {
		boolean fly = false;
		if(event.player.isPotionActive(PotionCore.SS_FLY_POTION)) fly = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("kamenridercraft4th"+ ":" + "fly"))) fly = true;
		
		if(fly || event.player.isCreative() || event.player.isSpectator()) {
			event.player.capabilities.allowFlying = true;
			event.player.fallDistance = 0.0f;
		} else {
			fly = false;
			event.player.capabilities.isFlying = false;
			event.player.capabilities.allowFlying = false;
		}
	}

	@SubscribeEvent
	public static void onLivingUpate(TickEvent.PlayerTickEvent event){
		if(event.player.isPotionActive(PotionCore.SS_PUNCH_BOOST)){
			if(event.player.getHeldItemMainhand().isEmpty())
			{
				event.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,event.player.getActivePotionEffect(PotionCore.SS_PUNCH_BOOST).getAmplifier(), 4,true,false));
			}
		}
		
		boolean big = false;
		if(event.player.isPotionActive(PotionCore.SS_BIG)) big = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("kamenridercraft4th"+ ":" + "big"))) big = true;
		
		if(big){
				event.player.height=4+(event.player.getDefaultEyeHeight());
				event.player.eyeHeight=4;
				
				event.player.setInvisible(true);
		} else{
			event.player.height=event.player.getDefaultEyeHeight();
			event.player.eyeHeight=event.player.getDefaultEyeHeight();
			event.player.setInvisible(event.player.isPotionActive(MobEffects.INVISIBILITY));
		}

		if(event.player.isPotionActive(PotionCore.SS_FIRE_PUNCH)){
			if(event.player.getHeldItemMainhand().isEmpty())
			{
				if (event.player.isSwingInProgress){
					if (event.player.getLastAttackedEntity()!=null){
						if (event.player.getAttackingEntity()==event.player.getLastAttackedEntity()){
						event.player.getLastAttackedEntity().setFire(10);
					}
					}
			}
			}	
		}
		if(event.player.isPotionActive(PotionCore.SS_SLASH_BOOST))
		{
			if(event.player.getHeldItemMainhand().getItem() instanceof ItemSword)
			{
				if(event.player.isSwingInProgress)
				{
					event.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,event.player.getActivePotionEffect(PotionCore.SS_SLASH_BOOST).getAmplifier(), 4,true,false));
				}
			}
		}
		if(event.player.isPotionActive(PotionCore.SS_FIRE_SLASH))
		{
			if(event.player.getHeldItemMainhand().getItem() instanceof ItemSword)
			{	
				if(event.player.isSwingInProgress)
				{
					if (event.player.getLastAttackedEntity()!=null)
					{
						if (event.player.getAttackingEntity()==event.player.getLastAttackedEntity())
						{
							event.player.getLastAttackedEntity().setFire(10);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public static void onItemRagister(Register<Item> event){
		event.getRegistry().registerAll(TokuCraft_core.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRagister(Register<Block> event){
		event.getRegistry().registerAll(TokuCraft_core.BLOCKS.toArray(new Block[0]));
	}


	@SubscribeEvent
	public static void onModelRagister(ModelRegistryEvent event){
		for (Item item : TokuCraft_core.ITEMS){
			if (item instanceof IHasModel ){
				((IHasModel)item).registerModels();
			}
		}for (Block item : TokuCraft_core.BLOCKS){
			if (item instanceof IHasModel){
				((IHasModel)item).registerModels();
			}
		}
	}
}
