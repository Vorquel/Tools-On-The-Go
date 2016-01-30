package vorquel.mod.toolsonthego.helper;

import vorquel.mod.toolsonthego.block.BlockTotGTorch;

import static vorquel.mod.toolsonthego.ToolsOnTheGo.MOD_ID;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.proxy;

public class TotGBlocks {
    
    public static final BlockTotGTorch torchStone = (BlockTotGTorch) new BlockTotGTorch().setUnlocalizedName(MOD_ID + ".torchStone").setLightLevel(0.9375F);
    public static final BlockTotGTorch torchNetherrack = (BlockTotGTorch) new BlockTotGTorch().setUnlocalizedName(MOD_ID + ".torchNetherrack").setLightLevel(0.9375F);
    
    public static void init() {
        proxy.registerBlock(torchStone, "torch_stone");
        proxy.registerBlock(torchNetherrack, "torch_netherrack");
    }
}
