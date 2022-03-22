package SS_Craft.item;



import javax.annotation.Nullable;

import SS_Craft.SentaiItems40;
import SS_Craft.TokuCraft_core;
import SS_Craft.item.gaoranger.item_g_phone;
import SS_Craft.item.gekiranger.item_geki_changer;
import SS_Craft.item.gingaman.item_ginga_brace;
import SS_Craft.item.kyoryuger.item_gaburivolver;
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

public class item_cannon extends ItemSword implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;
	private final Item base;   

    public item_cannon(String name,ToolMaterial par2EnumToolMaterial, Item item)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        base = item;
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
    
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_g_phone)
			{
				if (this==SentaiItems40.evil_crushing_hundred_beast_sword)
				{
					if (playerIn.isSneaking())
					{
						playerIn.getHeldItemMainhand().shrink(1);
						
						if (!worldIn.isRemote)
						{
							EntityItem item = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.lion_fang, 1));
							worldIn.spawnEntity(item);
							EntityItem item1 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.eagle_sword, 1));
							worldIn.spawnEntity(item1);
							EntityItem item2 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.shark_cutter, 1));
							worldIn.spawnEntity(item2);
							EntityItem item3 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.bison_axe, 1));
							worldIn.spawnEntity(item3);
							EntityItem item4 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.tiger_baton, 1));
							worldIn.spawnEntity(item4);
						}
					}
				}
			}
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_gaburivolver)
		{
			if (this==SentaiItems40.kentrospiker)
			{
				if (playerIn.isSneaking())
				{
					playerIn.getHeldItemMainhand().shrink(1);
					
					if (!worldIn.isRemote)
					{
						EntityItem item = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.gabutyra_fang, 1));
						worldIn.spawnEntity(item);
						EntityItem item1 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.parasa_shot, 1));
						worldIn.spawnEntity(item1);
						EntityItem item2 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.stego_shield, 1));
						worldIn.spawnEntity(item2);
						EntityItem item3 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.zakutor_slasher, 1));
						worldIn.spawnEntity(item3);
						EntityItem item4 = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(SentaiItems40.drice_lance, 1));
						worldIn.spawnEntity(item4);
					}
				}
				else
				{
					playerIn.fallDistance=0; 
					
					Vec3d look = playerIn.getLookVec();
					playerIn.motionX=look.x/2;
					playerIn.motionY=look.y/2;
					playerIn.motionZ=look.z/2;
						
					playerIn.world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK,playerIn.posX,playerIn.posY, playerIn.posZ, 0.0D, 0.0D, 0.0D);
				}
			}
		}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
    	return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }

}