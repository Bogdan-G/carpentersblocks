package com.carpentersblocks;

import com.carpentersblocks.blocks.CarpentersBlock;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRegistry {

    public static CarpentersBlock carpentersBlock;

    public static void init() {
        carpentersBlock = new CarpentersBlock();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        carpentersBlock.initModel();
    }

    @SideOnly(Side.CLIENT)
    public static void initItemModels() {
        carpentersBlock.initItemModel();
    }

}
