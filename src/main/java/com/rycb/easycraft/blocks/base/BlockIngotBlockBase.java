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

import javax.annotation.Nullable;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

public class BlockIngotBlockBase extends Block implements IHasModel {
    public BlockIngotBlockBase(String UnlocalizedName, String RegistryName, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(UnlocalizedName + "Block");
        setRegistryName(RegistryName + "_block");
        setCreativeTab(tab);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockIngotBlockBase(String name, @Nullable Integer harvestLvl, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(toUpper(name) + "Block");
        setRegistryName(toLower(name) + "_block");
        setCreativeTab(tab);
        if (harvestLvl == null) setHarvestLevel("pickaxe", 1);
        else setHarvestLevel("pickaxe", harvestLvl > 0 ? harvestLvl : 1);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
