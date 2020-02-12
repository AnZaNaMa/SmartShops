package com.networkoverflow.smartshops.init;

import com.networkoverflow.smartshops.item.DebugToolItem;
import com.networkoverflow.smartshops.util.Names;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Names.modid);

    public static final RegistryObject<DebugToolItem> DEBUG_TOOL = ITEMS.register("debug_tool", () -> new DebugToolItem(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
