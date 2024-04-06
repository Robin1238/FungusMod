package com.robbin1238.fungusmod.init;

import com.robbin1238.fungusmod.FungusMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Inititems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, FungusMod.MODID
    );

    public static final RegistryObject<Item> HITO_HITO_NO_MI = ITEMS.register(
            "hito_hito", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build()))
    );

    public static final RegistryObject<Item> CRAFT_ITEM = ITEMS.register(
            "craft_item", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build()))
    );

}
