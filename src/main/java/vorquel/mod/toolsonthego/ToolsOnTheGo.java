package vorquel.mod.toolsonthego;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vorquel.mod.toolsonthego.helper.TotGBlocks;
import vorquel.mod.toolsonthego.helper.TotGItems;
import vorquel.mod.toolsonthego.helper.TotGRecipes;
import vorquel.mod.toolsonthego.proxy.Proxy;

@SuppressWarnings("unused")
@Mod(modid = ToolsOnTheGo.MOD_ID, name = "Tools on the Go", version = "@VERSION@")
public class ToolsOnTheGo
{
    
    public static final String MOD_ID = "ToolsOnTheGo";
    
    @SidedProxy(serverSide = "vorquel.mod.toolsonthego.proxy.Proxy", clientSide = "vorquel.mod.toolsonthego.proxy.ProxyClient")
    public static Proxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        TotGItems.init();
        TotGBlocks.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        TotGRecipes.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
