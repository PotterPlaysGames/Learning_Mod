package net.potterplaysgaming.firstmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup FIRSTMOD_GROUP = new ItemGroup("firstModTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Moditems.BIGCHUNGUS.get());
        }
    };
}
