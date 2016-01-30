package vorquel.mod.toolsonthego.helper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import vorquel.mod.toolsonthego.block.BlockTotGTorch;
import vorquel.mod.toolsonthego.block.BlockTotGWorkbench;

import static net.minecraft.block.Block.soundTypePiston;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.MOD_ID;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.proxy;

public class TotGBlocks {
    
    public static final Block torchStone = new BlockTotGTorch().setUnlocalizedName(MOD_ID + ".torchStone").setLightLevel(0.9375F);
    public static final Block torchNetherrack = new BlockTotGTorch().setUnlocalizedName(MOD_ID + ".torchNetherrack").setLightLevel(0.9375F);
    public static final Block plankStone = new Block(Material.rock).setUnlocalizedName(MOD_ID + ".plankStone").setHardness(2).setStepSound(soundTypePiston);
    public static final Block plankNetherrack = new Block(Material.rock).setUnlocalizedName(MOD_ID + ".plankNetherrack").setHardness(2).setStepSound(soundTypePiston);
    public static final Block craftingTableStone = new BlockTotGWorkbench().setUnlocalizedName(MOD_ID + ".workbenchStone").setHardness(2.5f).setStepSound(soundTypePiston);
    public static final Block craftingTableNetherrack = new BlockTotGWorkbench().setUnlocalizedName(MOD_ID + ".workbenchNetherrack").setHardness(2.5f).setStepSound(soundTypePiston);
    
    public static void init() {
        proxy.registerBlock(torchStone, "torch_stone");
        proxy.registerBlock(torchNetherrack, "torch_netherrack");
        proxy.registerBlock(plankStone, "plank_stone");
        proxy.registerBlock(plankNetherrack, "plank_netherrack");
        proxy.registerBlock(craftingTableStone, "workbench_stone");
        proxy.registerBlock(craftingTableNetherrack, "workbench_netherrack");
    }
}
