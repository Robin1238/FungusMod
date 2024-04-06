package com.robbin1238.firstmod.init;

import com.robbin1238.firstmod.Firstmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class Initblock {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, Firstmod.MODID);

    public static final RegistryObject<Block> GOMU_GOMU_BLOCK = register(
            "gomu_gomu_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.MOSS).friction(0.98f)),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static <T extends  Block>RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        Inititems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;

    }
}
