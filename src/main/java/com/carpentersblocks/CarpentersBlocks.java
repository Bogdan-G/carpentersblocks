package com.carpentersblocks;

import com.carpentersblocks.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CarpentersBlocks.MODID, version = CarpentersBlocks.VERSION)
public class CarpentersBlocks
{
    public static final String MODID = "carpentersblocks";
    public static final String VERSION = "4.0";
    
    @SidedProxy(clientSide = "com.carpentersblocks.proxy.ClientProxy", serverSide = "com.carpentersblocks.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }
    
}
