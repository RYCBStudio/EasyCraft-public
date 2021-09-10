package com.rycb.easycraft.init;

import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();
    // Obsidian_ingot_block(In game it is 'Obsidian Ingot Zipped')
    public static final Block OBSIDIAN_INGOT_BLOCK = new BlockBase("obsidian_ingot_block", Material.IRON, Easycraft.EASTCRAFT);


}