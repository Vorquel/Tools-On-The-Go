package vorquel.mod.buckettools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vorquel.mod.buckettools.helper.Ref;
import vorquel.mod.buckettools.proxy.Proxy;

@SuppressWarnings("unused")
@Mod(modid = Ref.MOD_ID, name = "Tools On The Go", version = "@VERSION@")
public class ToolsOnTheGo
{
    
    @Instance(Ref.MOD_ID)
    public static ToolsOnTheGo instance;
    
    @SidedProxy(serverSide = "vorquel.mod.toolsonthego.proxy.Proxy", clientSide = "vorquel.mod.toolsonthego.proxy.ProxyClient")
    public static Proxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {}
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
