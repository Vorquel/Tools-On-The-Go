package vorquel.mod.toolsonthego.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTotG extends Block {
    public BlockTotG(Material material) {
        super(material);
        setSoundType(SoundType.STONE);
    }
}
