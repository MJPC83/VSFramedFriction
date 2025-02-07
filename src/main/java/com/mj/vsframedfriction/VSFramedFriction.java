package com.mj.vsframedfriction;

import com.mj.vsframedfriction.register.BlockRegister;
import com.mj.vsframedfriction.register.ItemRegister;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(VSFramedFriction.MOD_ID)
public class VSFramedFriction {

    public static final String MOD_ID = "vsframedfriction";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();




    public VSFramedFriction() {

        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register block and item registries
        BlockRegister.register(eventbus);
        ItemRegister.register(eventbus);



        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }


}
