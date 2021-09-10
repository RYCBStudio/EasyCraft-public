package com.rycb.easycraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/23 14:48
 * Location:EasyCraft/com.rycb.easycraft.init/
 * This is the project of EasyCraft
 */
public class ModRecipes {

    public static final ItemStack LAPIS_LAZULI = new ItemStack(Items.DYE,1,4);
    public static final ItemStack PURPLE_DYE = new ItemStack(Items.DYE,1,5);
    public static final ItemStack Zombie_Head = new ItemStack(Items.SKULL,2,2);
    public static final ItemStack Redstone = new ItemStack(Items.REDSTONE,1);
    public static final ItemStack gunpowder = new ItemStack(Items.GUNPOWDER,2);
    public static final ItemStack Wither_Head = new ItemStack(Items.SKULL,1);
    // public static final ItemStack Item = new ItemStack(Items.ITEM,amount,meta);
    public static void init() {
        GameRegistry.addSmelting(Redstone,gunpowder, 1);
        GameRegistry.addSmelting(Blocks.OBSIDIAN,new ItemStack(ModItems.OBSIDIAN_INGOT,2),2);
        GameRegistry.addSmelting(LAPIS_LAZULI,PURPLE_DYE,2);
        GameRegistry.addSmelting(new ItemStack(ModItems.OBSIDIAN_INGOT), new ItemStack(Items.DYE,3,5),1);
        GameRegistry.addSmelting(Wither_Head,Zombie_Head,2);
        GameRegistry.addSmelting(new ItemStack(Items.LEATHER),new ItemStack(Items.ROTTEN_FLESH),1);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.OBSIDIAN_INGOT_BLOCK),new ItemStack(ModItems.COBALT_INGOT),2);
        GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH),new ItemStack(Items.LEATHER),2);
    }

}