package com.robbin1238.fungusmod.init;

import com.robbin1238.fungusmod.FungusMod;
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
            ForgeRegistries.BLOCKS, FungusMod.MODID);

    public static final RegistryObject<Block> CORRUPTED_BLOCK = register(
            "corrupted_fungus_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CACTUS ).friction(0.98f)),
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
