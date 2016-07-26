package com.carpentersblocks.proxy;

import com.carpentersblocks.BlockRegistry;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	BlockRegistry.init();
    }
	
}
