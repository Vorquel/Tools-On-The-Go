package vorquel.mod.toolsonthego.helper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vorquel.mod.toolsonthego.item.*;

import static vorquel.mod.toolsonthego.ToolsOnTheGo.MOD_ID;
import static vorquel.mod.toolsonthego.ToolsOnTheGo.proxy;

public class TotGItems {
    
    public static final Item stickStone = new Item().setUnlocalizedName(MOD_ID + ".stickStone");
    public static final Item stickNRack = new Item().setUnlocalizedName(MOD_ID + ".stickNetherrack");
    public static final Item bowlStone = new Item().setUnlocalizedName(MOD_ID + ".bowlStone");
    public static final Item bowlNRack = new Item().setUnlocalizedName(MOD_ID + ".bowlNetherrack");
    public static final Item stewMushroomStone = new ItemTotGSoup(6, new ItemStack(bowlStone)).setUnlocalizedName(MOD_ID + ".stewMushroom");
    public static final Item stewMushroomNRack = new ItemTotGSoup(6, new ItemStack(bowlNRack)).setUnlocalizedName(MOD_ID + ".stewMushroom");
    public static final Item stewRabbitStone = new ItemTotGSoup(10, new ItemStack(bowlStone)).setUnlocalizedName(MOD_ID + ".stewRabbit");
    public static final Item stewRabbitNRack = new ItemTotGSoup(10, new ItemStack(bowlNRack)).setUnlocalizedName(MOD_ID + ".stewRabbit");
    public static final Item swordStone = new ItemTotGSword().setUnlocalizedName(MOD_ID + ".swordStone");
    public static final Item swordNRack = new ItemTotGSword().setUnlocalizedName(MOD_ID + ".swordNetherrack");
    public static final Item pickStone = new ItemTotGPickaxe().setUnlocalizedName(MOD_ID + ".pickStone");
    public static final Item pickNRack = new ItemTotGPickaxe().setUnlocalizedName(MOD_ID + ".pickNetherrack");
    public static final Item axStone = new ItemTotGAxe().setUnlocalizedName(MOD_ID + ".axStone");
    public static final Item axNRack = new ItemTotGAxe().setUnlocalizedName(MOD_ID + ".axNetherrack");
    public static final Item shovelStone = new ItemTotGSpade().setUnlocalizedName(MOD_ID + ".shovelStone");
    public static final Item shovelNRack = new ItemTotGSpade().setUnlocalizedName(MOD_ID + ".shovelNetherrack");
    public static final Item hoeStone = new ItemTotGHoe().setUnlocalizedName(MOD_ID + ".hoeStone");
    public static final Item hoeNRack = new ItemTotGHoe().setUnlocalizedName(MOD_ID + ".hoeNetherrack");
    
    public static void init() {
        proxy.registerItem(stickStone, "stick_stone");
        proxy.registerItem(stickNRack, "stick_netherrack");
        proxy.registerItem(bowlStone, "bowl_stone");
        proxy.registerItem(bowlNRack, "bowl_netherrack");
        proxy.registerItem(stewMushroomStone, "stew_mushroom_stone");
        proxy.registerItem(stewMushroomNRack, "stew_mushroom_netherrack");
        proxy.registerItem(stewRabbitStone, "stew_rabbit_stone");
        proxy.registerItem(stewRabbitNRack, "stew_rabbit_netherrack");
        proxy.registerItem(swordStone, "sword_stone");
        proxy.registerItem(swordNRack, "sword_netherrack");
        proxy.registerItem(pickStone, "pick_stone");
        proxy.registerItem(pickNRack, "pick_netherrack");
        proxy.registerItem(axStone, "ax_stone");
        proxy.registerItem(axNRack, "ax_netherrack");
        proxy.registerItem(shovelStone, "shovel_stone");
        proxy.registerItem(shovelNRack, "shovel_netherrack");
        proxy.registerItem(hoeStone, "hoe_stone");
        proxy.registerItem(hoeNRack, "hoe_netherrack");
    }
}
