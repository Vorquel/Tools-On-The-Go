package vorquel.mod.toolsonthego.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTotGSoup extends ItemSoup {
    
    private ItemStack bowl;
    
    public ItemTotGSoup(int healAmount, ItemStack bowl) {
        super(healAmount);
        this.bowl = bowl;
    }
    
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return bowl.copy();
    }
}
