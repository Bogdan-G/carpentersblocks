package com.carpentersblocks.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import com.carpentersblocks.util.registry.FeatureRegistry;

/**
 * Stores attribute and unlocalized name for validation purposes.
 */
public class Attribute {
    
    private static final String TAG_UNLOCALIZED_NAME = "cbUnlocalizedName";
    private ItemStack itemStack;
    private String unlocalizedName;
    private boolean _error;
    
    public Attribute(ItemStack itemStack, String unlocalizedName) {
        this.itemStack = itemStack;
        this.unlocalizedName = unlocalizedName;
    }
    
    public Attribute(ItemStack itemStack) {
        this.itemStack = itemStack;
        this.unlocalizedName = itemStack.getUnlocalizedName();
    }
    
    public ItemStack getItemStack() {
        return itemStack;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }
    
    /**
     * Write the stack fields to a NBT object. Return the new NBT object.
     */
    public NBTTagCompound writeToNBT(NBTTagCompound nbt)
    {
        itemStack.writeToNBT(nbt);
        nbt.setString(TAG_UNLOCALIZED_NAME, unlocalizedName);
        return nbt;
    }
    
    public static Attribute loadAttributeFromNBT(NBTTagCompound nbt)
    {
        ItemStack itemStack = ItemStack.loadItemStackFromNBT(nbt);
        String unlocalizedName = nbt.getString(TAG_UNLOCALIZED_NAME);
        if (itemStack == null) {
            if (Item.itemRegistry.containsKey(unlocalizedName)) {
                Object obj = Item.itemRegistry.getObject(unlocalizedName);
                int dmg = nbt.getShort("Damage");
                itemStack = new ItemStack((Item)obj, 1, dmg);
            }
        }
        return new Attribute(itemStack, unlocalizedName);
    }
    
}