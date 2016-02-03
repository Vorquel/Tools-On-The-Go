package vorquel.mod.toolsonthego.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vorquel.mod.toolsonthego.helper.TotGCreativeTab;

public class Proxy {
    
    public void registerItem(Item item, String name) {
        item.setCreativeTab(TotGCreativeTab.tab);
        GameRegistry.registerItem(item, name);
    }
    
    public void registerBlock(Block block, String name) {
        block.setCreativeTab(TotGCreativeTab.tab);
        GameRegistry.registerBlock(block, name);
    }
}
