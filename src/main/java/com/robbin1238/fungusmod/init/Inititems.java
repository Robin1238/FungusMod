package com.robbin1238.firstmod.init;

import com.robbin1238.firstmod.Firstmod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.script.ScriptEngine;

public class Inititems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Firstmod.MODID
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
