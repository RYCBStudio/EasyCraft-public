package com.rycb.easycraft.blocks.single;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModBlocks;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/26 9:34</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyCraft/com.rycb.easycraft.blocks.single/Sculk.java</p>
 * <h1><center>Sculk</center></h1>
 */
public class Sculk extends Block implements IHasModel {
    public Sculk() {
        super(Material.CACTUS);
        setUnlocalizedName("sculk");
        setRegistryName("sculk");
        setCreativeTab(EasyCraft.EC_TAB);
        setHardness(1.5f);
        setHarvestLevel("hoe", 1);
        setSoundType(SoundType.SAND);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }

}
