package com.networkoverflow.smartshops;

import com.networkoverflow.smartshops.init.ModBlocks;
import com.networkoverflow.smartshops.init.ModItemGroups;
import com.networkoverflow.smartshops.util.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = Names.modid, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        ModBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .forEach(block -> {
                    final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                });
    }
}
