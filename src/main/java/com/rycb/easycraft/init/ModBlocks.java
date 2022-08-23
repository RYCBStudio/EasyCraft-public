package com.rycb.easycraft.init;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.blocks.base.BlockOreBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/23 9:10</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.init/ModBlocks.java</p>
 * <h1><center>ModBlocks</center></h1>
 */
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block OMEGA_ORE = new BlockOreBase("omega", 1, Material.ROCK, EasyCraft.EC_TAB);
}
