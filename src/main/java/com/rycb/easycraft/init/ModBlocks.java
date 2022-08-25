package com.rycb.easycraft.init;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.blocks.base.BlockBase;
import com.rycb.easycraft.blocks.base.BlockOreBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <p>RYCBStudio/Java Department</p>
 * <p>Create Time: 2022/8/23 9:10</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.init/ModBlocks.java</p>
 * <h1><center>ModBlocks</center></h1>
 */
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block OMEGA_ORE = new BlockOreBase("omega", 1, 4.4f, Material.ROCK, EasyCraft.EC_TAB);

    public static final Block DARK_ORE = new BlockOreBase("dark", 2,2.3f , Material.ROCK, EasyCraft.EC_TAB);

    public static final Block DARK_FUEL_BLOCK = new BlockBase("dark_fuel_block", 3, 3.4f, Material.IRON, EasyCraft.EC_TAB);
}
