package vorquel.mod.toolsonthego.helper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static vorquel.mod.toolsonthego.ToolsOnTheGo.MOD_ID;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.proxy;

public class TotGItems {
    
    public static final Item stickStone = new Item().setUnlocalizedName(MOD_ID + ".stickStone").setCreativeTab(CreativeTabs.tabMaterials);
    public static final Item stickNRack = new Item().setUnlocalizedName(MOD_ID + ".stickNetherrack").setCreativeTab(CreativeTabs.tabMaterials);
    
    public static void init() {
        proxy.registerItem(stickStone, "stick_stone");
        proxy.registerItem(stickNRack, "stick_netherrack");
    }
}
