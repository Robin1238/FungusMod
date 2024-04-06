package com.robbin1238.firstmod;

import com.robbin1238.firstmod.init.Initblock;
import com.robbin1238.firstmod.init.Inititems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Firstmod.MODID)
public class Firstmod {
    public static final String MODID = "firstmod";

    public Firstmod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Inititems.ITEMS.register(bus);
        Initblock.BLOCKS.register(bus);
    }
}
