package com.carpentersblocks.proxy;

import com.carpentersblocks.BakedModelLoader;

import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
    	super.preInit(e);
        ModelLoaderRegistry.registerLoader(new BakedModelLoader());
    }
	
}
