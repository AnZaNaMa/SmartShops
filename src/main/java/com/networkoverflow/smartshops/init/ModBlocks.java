package com.networkoverflow.smartshops.init;

import com.networkoverflow.smartshops.util.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Names.modid);

    public static final RegistryObject<Block> TRADE_TERMINAL = BLOCKS.register("trade_terminal", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)));
}
