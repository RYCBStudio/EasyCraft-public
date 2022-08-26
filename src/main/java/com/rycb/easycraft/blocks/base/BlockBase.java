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

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String UnlocalizedName, String RegistryName, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(toUpper(name));
        setCreativeTab(tab);
        setRegistryName(toLower(name));
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, int harvestLvl, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(tab);
        setRegistryName(name);
        setHarvestLevel("pickaxe", harvestLvl > 0 ? harvestLvl : 1);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, int harvestLvl, float hardness, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(tab);
        setRegistryName(name);
        setHarvestLevel("pickaxe", harvestLvl > 0 ? harvestLvl : 1);
        setHardness(hardness > 1.0f ? hardness : 1.5f);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }

}
