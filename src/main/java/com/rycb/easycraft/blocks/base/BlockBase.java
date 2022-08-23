package com.rycb.easycraft.blocks.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModBlocks;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String UnlocalizedName, String RegistryName, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
