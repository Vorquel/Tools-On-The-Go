package vorquel.mod.toolsonthego.helper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import vorquel.mod.toolsonthego.ToolsOnTheGo;

public class TotGCreativeTab extends CreativeTabs {
    
    public static final TotGCreativeTab tab = new TotGCreativeTab();
    
    private TotGCreativeTab() {
        super(ToolsOnTheGo.MOD_ID);
    }
    
    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(TotGBlocks.craftingTableStone);
    }
}
