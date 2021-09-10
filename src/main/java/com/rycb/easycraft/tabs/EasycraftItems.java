package com.rycb.easycraft.tabs;

import com.rycb.easycraft.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/15 19:59
 * Location:EasyCraft/com.rycb.easycraft.tabs
 */
public class EasycraftItems extends CreativeTabs {

    public EasycraftItems() {

        super("Easy Craft：简单工艺");
        this.setBackgroundImageName("easycraft_creative.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.OBSIDIAN_INGOT_BLOCK));
    }
}