package SS_Craft.item.zenkaiger;

import java.util.List;

import javax.annotation.Nullable;

import SS_Craft.SentaiItems20;
import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyuranger.item_seiza_blaster;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.ryusoulger.item_ryusoul_changer;
import SS_Craft.mobs.Henchmen.Entity_base_henchmen;
import SS_Craft.mobs.allies.entity_ex_aid;
import SS_Craft.mobs.allies.entity_kyuranger;
import SS_Craft.mobs.allies.entity_mecha_dark_gear;
import SS_Craft.mobs.bikes.EntityBikeBase;
import SS_Craft.mobs.bikes.entity_garu_bike;
import SS_Craft.mobs.mini_boss.entity_ular_captain;
import SS_Craft.potion.PotionCore;
import SS_Craft.util.IHasModel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class item_dark_gear extends Item implements IHasModel
{
	public int num;
	
	public item_dark_gear(int effect,String name)
	{
		super();
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
		this.setMaxDamage(0);

		num=effect;
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==24000){
			return true;
		}else{
			return !true;
		}
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			ItemStack par1ItemStack= playerIn.getHeldItem(handIn);
			
			if (!worldIn.isRemote){
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == SentaiItems60.stacaeser_geartozinger)
			{
				if ((this.get_ammo(par1ItemStack)==100))
				{
					if (num != 0)
					{
						entity_mecha_dark_gear mecha  = new entity_mecha_dark_gear(worldIn);
						mecha.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
						item_geartlinger.set_core(mecha.getItemStackFromSlot(EntityEquipmentSlot.FEET), num-1);
						worldIn.spawnEntity(mecha);
						
						playerIn.getHeldItem(handIn).shrink(1);
					}
				}
				this.set_ammo(playerIn.getHeldItem(handIn),0);
			}
			this.set_ammo(playerIn.getHeldItem(handIn),0);
		}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
    
    public static int get_ammo(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("Ammo") : 0;
	}

	public static void set_ammo(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("Ammo", flag);
	}
	
	public void onUpdate(ItemStack par1ItemStack, World worldIn, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<100){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}
	
	/**
     * allows items to add custom lines of information to the mouseover description
     */
	@Override
    @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add(TextFormatting.BLUE + "Zenkai Power: "+ get_ammo(stack) +"%");
		//tooltip.add(TextFormatting.RED + "");
		
	}
}