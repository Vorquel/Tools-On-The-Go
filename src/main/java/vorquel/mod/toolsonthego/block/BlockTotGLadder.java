package vorquel.mod.toolsonthego.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

public class BlockTotGLadder extends BlockLadder {
    public BlockTotGLadder() {
        setSoundType(SoundType.LADDER);
        ReflectionHelper.setPrivateValue(Block.class, this, Material.rock, "blockMaterial", "field_149764_J");
    }
}
