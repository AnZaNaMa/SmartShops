package com.networkoverflow.smartshops.init;

import com.networkoverflow.smartshops.util.Names;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Names.modid, () -> new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(Names.modid, Names.TRADE_TERMINAL))));

    public static final class ModItemGroup extends ItemGroup {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
