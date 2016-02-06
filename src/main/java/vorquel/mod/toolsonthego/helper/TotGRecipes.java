package vorquel.mod.toolsonthego.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.*;
import static vorquel.mod.toolsonthego.helper.TotGBlocks.*;
import static vorquel.mod.toolsonthego.helper.TotGItems.*;

public class TotGRecipes {
    
    public static void init() {
        // sticks
        GameRegistry.addRecipe(new ItemStack(stickStone, 2), "x", "x", 'x', cobblestone);
        GameRegistry.addRecipe(new ItemStack(stickStone, 4), "x", "x", 'x', stone);
        GameRegistry.addRecipe(new ItemStack(stickStone, 4), "x", "x", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(stickNRack, 2), "x", "x", 'x', netherrack);
        GameRegistry.addRecipe(new ItemStack(stickNRack, 4), "x", "x", 'x', plankNRack);
        // torches
        GameRegistry.addRecipe(new ItemStack(torchStone, 4), "x", "/", 'x', coal, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(torchNRack, 4), "x", "/", 'x', glowstone_dust, '/', stickNRack);
        // planks
        GameRegistry.addRecipe(new ItemStack(plankStone, 2), "//", "//", '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(plankNRack, 2), "//", "//", '/', stickNRack);
        // crafting tables
        GameRegistry.addRecipe(new ItemStack(craftingTableStone), "xx", "xx", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(craftingTableNRack), "xx", "xx", 'x', plankNRack);
        // ladders
        GameRegistry.addRecipe(new ItemStack(ladderStone, 3), "/ /", "///", "/ /", '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(ladderNRack, 3), "/ /", "///", "/ /", '/', stickNRack);
        // stairs
        GameRegistry.addRecipe(new ItemStack(stairPlankStone, 4), "x  ", "xx ", "xxx", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(stairPlankNRack, 4), "x  ", "xx ", "xxx", 'x', plankNRack);
        // bowls
        GameRegistry.addRecipe(new ItemStack(bowlStone, 4), "x x", " x ", 'x', plankStone);
        GameRegistry.addRecipe(new ItemStack(bowlNRack, 4), "x x", " x ", 'x', plankNRack);
        // stews
        GameRegistry.addShapelessRecipe(new ItemStack(stewMushroomStone), bowlStone, brown_mushroom, red_mushroom);
        GameRegistry.addShapelessRecipe(new ItemStack(stewMushroomNRack), bowlNRack, brown_mushroom, red_mushroom);
        GameRegistry.addRecipe(new ItemStack(stewRabbitStone), " r ", "cpm", " b ", 'b', bowlStone, 'c', carrot, 'm', brown_mushroom, 'p', baked_potato, 'r', cooked_rabbit);
        GameRegistry.addRecipe(new ItemStack(stewRabbitStone), " r ", "cpm", " b ", 'b', bowlStone, 'c', carrot, 'm', red_mushroom, 'p', baked_potato, 'r', cooked_rabbit);
        GameRegistry.addRecipe(new ItemStack(stewRabbitNRack), " r ", "cpm", " b ", 'b', bowlNRack, 'c', carrot, 'm', brown_mushroom, 'p', baked_potato, 'r', cooked_rabbit);
        GameRegistry.addRecipe(new ItemStack(stewRabbitNRack), " r ", "cpm", " b ", 'b', bowlNRack, 'c', carrot, 'm', red_mushroom, 'p', baked_potato, 'r', cooked_rabbit);
        // swords
        GameRegistry.addRecipe(new ItemStack(swordStone), "x", "x", "/", 'x', cobblestone, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(swordNRack), "x", "x", "/", 'x', netherrack, '/', stickNRack);
        // picks
        GameRegistry.addRecipe(new ItemStack(pickStone), "xxx", " / ", " / ", 'x', cobblestone, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(pickNRack), "xxx", " / ", " / ", 'x', netherrack, '/', stickNRack);
        // axes
        GameRegistry.addRecipe(new ItemStack(axStone), "xx", "x/", " /", 'x', cobblestone, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(axNRack), "xx", "x/", " /", 'x', netherrack, '/', stickNRack);
        // shovels
        GameRegistry.addRecipe(new ItemStack(shovelStone), "x", "/", "/", 'x', cobblestone, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(shovelNRack), "x", "/", "/", 'x', netherrack, '/', stickNRack);
        // hoes
        GameRegistry.addRecipe(new ItemStack(hoeStone), "xx", " /", " /", 'x', cobblestone, '/', stickStone);
        GameRegistry.addRecipe(new ItemStack(hoeNRack), "xx", " /", " /", 'x', netherrack, '/', stickNRack);
    }
}
