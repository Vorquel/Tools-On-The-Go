package vorquel.mod.toolsonthego.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

import static vorquel.mod.toolsonthego.ToolsOnTheGo.MOD_ID;

@SuppressWarnings("unused")
public class ProxyClient extends Proxy {
    
    @Override
    public void registerItem(Item item, String name) {
        super.registerItem(item, name);
        registerModel(item, name);
    }
    
    @Override
    public void registerBlock(Block block, String name) {
        super.registerBlock(block, name);
        registerModel(Item.getItemFromBlock(block), name);
    }
    
    private void registerModel(Item item, String name) {
        String fullName = MOD_ID.toLowerCase() + ":" + name;
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(fullName, "inventory"));
        ModelBakery.registerItemVariants(item, new ResourceLocation(fullName));
    }
}
