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

public class BlockOreBase extends Block implements IHasModel {

    public BlockOreBase(String UnlocalizedName, String RegistryName, @Nullable Integer harvestLvl, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("ore" + UnlocalizedName);
        setRegistryName(RegistryName + "_ore");
        setCreativeTab(tab);
        if (harvestLvl == null) setHarvestLevel("pickaxe", 1);
        else setHarvestLevel("pickaxe", harvestLvl > 0 ? harvestLvl : 1);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockOreBase(String name, @Nullable Integer harvestLvl, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("ore" + toUpper(name));
        setRegistryName(toLower(name) + "_ore");
        setCreativeTab(tab);
        if (harvestLvl == null) setHarvestLevel("pickaxe", 1);
        else setHarvestLevel("pickaxe", harvestLvl > 0 ? harvestLvl : 1);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockOreBase(String name, @Nullable Integer harvestLvl, float hardness, Material material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("ore" + toUpper(name));
        setRegistryName(toLower(name) + "_ore");
        setHardness(hardness);
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
