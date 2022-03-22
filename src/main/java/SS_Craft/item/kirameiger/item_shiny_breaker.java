package SS_Craft.item.kirameiger;



import javax.annotation.Nullable;

import SS_Craft.SentaiItems60;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gekiranger.item_geki_changer;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.lupatranger.item_vs_changer;
import SS_Craft.item.maskman.item_masking_brace;
import SS_Craft.item.ninninger.item_ninja_ichibantou;
import SS_Craft.item.shinkenger.item_shodophone;
import SS_Craft.item.sun_vulcan.item_vulcan_brace;
import SS_Craft.item.turboranger.item_turbo_brace;
import SS_Craft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_shiny_breaker extends ItemPickaxe implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public item_shiny_breaker(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if (this == SentaiItems60.shiny_breaker_tool)
		{
			playerIn.fallDistance=0; 
				
			Vec3d look = playerIn.getLookVec();
			playerIn.motionX=look.x/2;
			playerIn.motionY=look.y/2;
			playerIn.motionZ=look.z/2;
				
			playerIn.world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK,playerIn.posX,playerIn.posY, playerIn.posZ, 0.0D, 0.0D, 0.0D);
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return SentaiItems60.blue_diamond == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}