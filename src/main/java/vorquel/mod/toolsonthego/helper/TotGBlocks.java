package vorquel.mod.toolsonthego.helper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import vorquel.mod.toolsonthego.block.BlockTotGLadder;
import vorquel.mod.toolsonthego.block.BlockTotGStairs;
import vorquel.mod.toolsonthego.block.BlockTotGTorch;
import vorquel.mod.toolsonthego.block.BlockTotGWorkbench;

import static net.minecraft.block.Block.soundTypeLadder;
import static net.minecraft.block.Block.soundTypePiston;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.MOD_ID;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.proxy;

public class TotGBlocks {
    
    public static final Block torchStone = new BlockTotGTorch().setLightLevel(0.9375F).setUnlocalizedName(MOD_ID + ".torchStone");
    public static final Block torchNRack = new BlockTotGTorch().setLightLevel(0.9375F).setUnlocalizedName(MOD_ID + ".torchNetherrack");
    public static final Block plankStone = new Block(Material.rock).setHardness(2).setStepSound(soundTypePiston).setUnlocalizedName(MOD_ID + ".plankStone");
    public static final Block plankNRack = new Block(Material.rock).setHardness(2).setStepSound(soundTypePiston).setUnlocalizedName(MOD_ID + ".plankNetherrack");
    public static final Block craftingTableStone = new BlockTotGWorkbench().setHardness(2.5f).setStepSound(soundTypePiston).setUnlocalizedName(MOD_ID + ".workbenchStone");
    public static final Block craftingTableNRack = new BlockTotGWorkbench().setHardness(2.5f).setStepSound(soundTypePiston).setUnlocalizedName(MOD_ID + ".workbenchNetherrack");
    public static final Block ladderStone = new BlockTotGLadder().setHardness(0.4F).setStepSound(soundTypeLadder).setUnlocalizedName(MOD_ID + ".ladderStone");
    public static final Block ladderNRack = new BlockTotGLadder().setHardness(0.4F).setStepSound(soundTypeLadder).setUnlocalizedName(MOD_ID + ".ladderNetherrack");
    public static final Block stairPlankStone = new BlockTotGStairs(plankStone.getDefaultState()).setUnlocalizedName(MOD_ID + ".stairPlankStone");
    public static final Block stairPlankNRack = new BlockTotGStairs(plankNRack.getDefaultState()).setUnlocalizedName(MOD_ID + ".stairPlankNetherrack");
    
    public static void init() {
        proxy.registerBlock(torchStone, "torch_stone");
        proxy.registerBlock(torchNRack, "torch_netherrack");
        proxy.registerBlock(plankStone, "plank_stone");
        proxy.registerBlock(plankNRack, "plank_netherrack");
        proxy.registerBlock(craftingTableStone, "crafting_table_stone");
        proxy.registerBlock(craftingTableNRack, "crafting_table_netherrack");
        proxy.registerBlock(ladderStone, "ladder_stone");
        proxy.registerBlock(ladderNRack, "ladder_netherrack");
        proxy.registerBlock(stairPlankStone, "stair_plank_stone");
        proxy.registerBlock(stairPlankNRack, "stair_plank_netherrack");
    }
}
