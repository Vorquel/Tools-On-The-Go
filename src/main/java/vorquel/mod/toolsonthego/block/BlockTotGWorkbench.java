package vorquel.mod.toolsonthego.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockTotGWorkbench extends Block {
    
    public BlockTotGWorkbench() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            playerIn.displayGui(new InterfaceCraftingTable(worldIn, pos));
            playerIn.triggerAchievement(StatList.field_181742_Z);
            return true;
        }
    }
    
    private class InterfaceCraftingTable extends BlockWorkbench.InterfaceCraftingTable {
        
        protected World world;
        protected BlockPos position;
        
        public InterfaceCraftingTable(World worldIn, BlockPos pos) {
            super(worldIn, pos);
            world = worldIn;
            position = pos;
        }
        
        @Override
        public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
            return new ContainerWorkbench(playerInventory, world, position) {
                
                @Override
                public boolean canInteractWith(EntityPlayer playerIn) {
                    return playerIn.getDistanceSq(position.getX() + 0.5, position.getY() + 0.5, position.getZ() + 0.5) <= 64;
                }
            };
        }
    }
}
