package com.robbin1238.fungusmod;

import com.robbin1238.fungusmod.init.Initblock;
import com.robbin1238.fungusmod.init.Inititems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FungusMod.MODID)
public class FungusMod {
    public static final String MODID = "fungusmod";

    public FungusMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Inititems.ITEMS.register(bus);
        Initblock.BLOCKS.register(bus);
    }
}
