package vorquel.mod.toolsonthego.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.coal;
import static net.minecraft.init.Items.glowstone_dust;
import static vorquel.mod.toolsonthego.helper.TotGBlocks.*;
import static vorquel.mod.toolsonthego.helper.TotGItems.stickNRack;
import static vorquel.mod.toolsonthego.helper.TotGItems.stickStone;

public class TotGRecipes {
    
    public static void init() {
        // stick recipes
        GameRegistry.addRecipe(new ItemStack(stickStone, 2), "x", "x", 'x', cobblestone);
        GameRegistry.addRecipe(new ItemStack(stickStone, 4), "x", "x", 'x', stone);
        GameRegistry.addRecipe(new ItemStack(stickStone, 4), "x", "x", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(stickNRack, 2), "x", "x", 'x', netherrack);
        GameRegistry.addRecipe(new ItemStack(stickNRack, 4), "x", "x", 'x', plankNRack);
        // torch recipes
        GameRegistry.addRecipe(new ItemStack(torchStone, 4), "x", "/", 'x', coal, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(torchNRack, 4), "x", "/", 'x', glowstone_dust, '/', stickNRack);
        // plank recipes
        GameRegistry.addRecipe(new ItemStack(plankStone, 2), "//", "//", '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(plankNRack, 2), "//", "//", '/', stickNRack);
        // crafting table recipes
        GameRegistry.addRecipe(new ItemStack(craftingTableStone), "xx", "xx", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(craftingTableNRack), "xx", "xx", 'x', plankNRack);
        // ladder recipes
        GameRegistry.addRecipe(new ItemStack(ladderStone, 3), "/ /", "///", "/ /", '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(ladderNRack, 3), "/ /", "///", "/ /", '/', stickNRack);
        // stair recipes
        GameRegistry.addRecipe(new ItemStack(stairPlankStone, 4), "x  ", "xx ", "xxx", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(stairPlankNRack, 4), "x  ", "xx ", "xxx", 'x', plankNRack);
    }
}
