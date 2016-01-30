package vorquel.mod.toolsonthego.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Proxy {
    
    public void registerItem(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }
    
    public void registerBlock(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }
}
