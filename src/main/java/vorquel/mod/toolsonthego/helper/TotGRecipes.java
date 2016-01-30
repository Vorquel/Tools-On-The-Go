package vorquel.mod.toolsonthego.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.coal;
import static net.minecraft.init.Items.glowstone_dust;
import static vorquel.mod.toolsonthego.helper.TotGBlocks.*;
import static vorquel.mod.toolsonthego.helper.TotGItems.stickNetherrack;
import static vorquel.mod.toolsonthego.helper.TotGItems.stickStone;

public class TotGRecipes {
    
    public static void init() {
        // stick recipes
        GameRegistry.addRecipe(new ItemStack(stickStone, 2), "x", "x", 'x', cobblestone);
        GameRegistry.addRecipe(new ItemStack(stickStone, 4), "x", "x", 'x', stone);
        GameRegistry.addRecipe(new ItemStack(stickNetherrack, 2), "x", "x", 'x', netherrack);
        // torch recipes
        GameRegistry.addRecipe(new ItemStack(torchStone, 4), "x", "/", 'x', coal, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(torchNetherrack, 4), "x", "/", 'x', glowstone_dust, '/', stickNetherrack);
        // plank recipes
        GameRegistry.addRecipe(new ItemStack(plankStone), "//", "//", '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(plankNetherrack), "//", "//", '/', stickNetherrack);
        // crafting table recipes
        GameRegistry.addRecipe(new ItemStack(craftingTableStone), "xx", "xx", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(craftingTableNetherrack), "xx", "xx", 'x', plankNetherrack);
    }
}