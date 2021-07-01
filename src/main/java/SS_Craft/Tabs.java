package SS_Craft;

import SS_Craft.util.Refercence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tabs
{
	public static ToolMaterial sword = new EnumHelper().addToolMaterial("sword", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial super_sword = new EnumHelper().addToolMaterial("super_sword", 10, 8000, 12.0F, 12.0F, 22);
	public static ToolMaterial rod = new EnumHelper().addToolMaterial("rod", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial axe = new EnumHelper().addToolMaterial("axe", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial gun = new EnumHelper().addToolMaterial("gun", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial super_gun = new EnumHelper().addToolMaterial("super_gun", 10, 3000, 12.0F, 3.0F, 22);
	public static ToolMaterial hyper_gun = new EnumHelper().addToolMaterial("hyper_gun", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial bow = new EnumHelper().addToolMaterial("bow", 10, 5000, 12.0F, 2.0F, 22);
	public static ToolMaterial stronger_bow = new EnumHelper().addToolMaterial("stronger_bow", 10, 10000, 12.0F, 4.0F, 22);
	public static ToolMaterial bomb = new EnumHelper().addToolMaterial("bomb", 10, 2500, 12.0F, 7.0F, 22);
	public static ToolMaterial boomerang = new EnumHelper().addToolMaterial("boomerang", 10, 4000, 12.0F, 3.0F, 22);
	public static ToolMaterial tonfa = new EnumHelper().addToolMaterial("tonfa", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial throwable = new EnumHelper().addToolMaterial("throwable", 10, 2500, 12.0F, 5.0F, 22);
	public static ToolMaterial whip = new EnumHelper().addToolMaterial("whip", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial megaton = new EnumHelper().addToolMaterial("megaton", 10, 4000, 12.0F, 8.0F, 22);
	public static ToolMaterial bazooka = new EnumHelper().addToolMaterial("bazooka", 10, 5000, 12.0F, 10.0F, 22);
	public static ToolMaterial hammer = new EnumHelper().addToolMaterial("hammer", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial sword_gun = new EnumHelper().addToolMaterial("sword_gun", 10, 3500, 12.0F, 5.0F, 22);
	
	public static ArmorMaterial mecha = new EnumHelper().addArmorMaterial("mecha", "blank", 99, new int[]{9, 18, 24, 9}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static ToolMaterial mecha_sword = new EnumHelper().addToolMaterial("mecha_sword", 10, 30000, 30.0F, 30.0F, 22);
	
	//01
	public static CreativeTabs tabGoranger= new CreativeTabs("tabGoranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_goranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.goranger_head);
		}
	};
	//02
	public static CreativeTabs tabJakq= new CreativeTabs("tabJakq")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_jakq_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.jakq_head);
		}
	};
	//03
	public static CreativeTabs tabBattleFever= new CreativeTabs("tabBattleFever")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_battle_fever_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.battle_fever_head);
		}
	};
	//04
	public static CreativeTabs tabDenziman= new CreativeTabs("tabDenziman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_denziman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.denziman_head);
		}
	};
	//05
	public static CreativeTabs tabSunVulcan= new CreativeTabs("tabSunVulcan")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_sun_vulcan_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.sun_vulcan_head);
		}
	};
	//06
	public static CreativeTabs tabGoggleV= new CreativeTabs("tabGoggleV")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_goggle_v_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.goggle_v_head);
		}
	};
	//08
	public static CreativeTabs tabBioman= new CreativeTabs("tabBioman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_bioman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.bioman_head);
		}
	};
	//10
	public static CreativeTabs tabFlashman= new CreativeTabs("tabFlashman")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.flashman_head);
		}
	};
	//11
	public static CreativeTabs tabMaskman= new CreativeTabs("tabMaskman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_maskman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.maskman_head);
		}
	};
	//13
	public static CreativeTabs tabTurboranger= new CreativeTabs("tabTurboranger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.turboranger_head);
		}
	};
	//15
	public static CreativeTabs tabJetman= new CreativeTabs("tabJetman")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.jetman_head);
		}
	};
	//16
	public static CreativeTabs tabZyuranger= new CreativeTabs("tabZyuranger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.zyuranger_head);
		}
	};
	//17
	public static CreativeTabs tabDairanger= new CreativeTabs("tabDairanger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.dairanger_head);
		}
	};
	//20
	public static CreativeTabs tabCarranger= new CreativeTabs("tabCarranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_carranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.carranger_head);
		}
	};
	//21
	public static CreativeTabs tabMegaranger= new CreativeTabs("tabMegaranger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.megaranger_head);
		}
	};
	//22
	public static CreativeTabs tabGingaman= new CreativeTabs("tabGingaman")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_gingaman_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.gingaman_head);
		}
	};
	//23
	public static CreativeTabs tabGogoV= new CreativeTabs("tabGogoV")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.gogo_v_head);
		}
	};
	//25
	public static CreativeTabs tabGaoranger= new CreativeTabs("tabGaoranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_gaoranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.gaoranger_head);
		}
	};
	//27
	public static CreativeTabs tabAbaranger= new CreativeTabs("tabAbaranger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.abaranger_head);
		}
	};
	//30
	public static CreativeTabs tabBoukenger= new CreativeTabs("tabBoukenger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.boukenger_head);
		}
	};
	//31
	public static CreativeTabs tabGekiranger= new CreativeTabs("tabGekiranger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.gekiranger_head);
		}
	};
	//32
	public static CreativeTabs tabGoOnger= new CreativeTabs("tabGoOnger")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.go_onger_head);
		}
	};
	//33
	public static CreativeTabs tabShinkenger= new CreativeTabs("tabShinkenger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_shinkenger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.shinkenger_head);
		}
	};
	//36
	public static CreativeTabs tabGoBusters= new CreativeTabs("tabGoBusters")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_go_busters_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.go_busters_head);
		}
	};
	//??
	public static CreativeTabs tabAkibaranger= new CreativeTabs("tabAkibaranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_akibaranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.akibaranger_head);
		}
	};
	//38
	public static CreativeTabs tabToQger= new CreativeTabs("tabToQger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_toqger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.toqger_head);
		}
	};
	//40
	public static CreativeTabs tabZyuohger= new CreativeTabs("tabZyuohger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_zyuohger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.zyuohger_head);
		}
	};
	//41
	public static CreativeTabs tabKyuranger= new CreativeTabs("tabKyuranger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_kyuranger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.kyuranger_head);
		}
	};
	//42
	public static CreativeTabs tabLupat= new CreativeTabs("tabLupat")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_lupat_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.lupat_head);
		}
	};
	//43
	public static CreativeTabs tabRyusoulger= new CreativeTabs("tabRyusoulger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_ryusoulger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.ryusoulger_head);
		}
	};
	//44
	public static CreativeTabs tabKirameiger= new CreativeTabs("tabKirameiger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_kirameiger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.kirameiger_head);
		}
	};
	//45
	public static CreativeTabs tabZenkaiger= new CreativeTabs("tabZenkaiger")
	{
		@SideOnly(Side.CLIENT)
	    public net.minecraft.util.ResourceLocation getBackgroundImage()
	    {
	        return new net.minecraft.util.ResourceLocation(Refercence.MODID,"textures/gui/tab_zenkaiger_items.png");
	    }
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.zenkaiger_head);
		}
	};
	//??
	public static CreativeTabs tabMisc= new CreativeTabs("tabMisc")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.super_sentai_logo);
		}
	};
	
}
