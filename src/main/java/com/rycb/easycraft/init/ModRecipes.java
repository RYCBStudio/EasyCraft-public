package com.rycb.easycraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.rycb.easycraft.util.SimpleCalculator.getSimpleBurnXp;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/23 9:18</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.init/ModRecipes.java</p>
 * <h1><center>ModRecipes</center></h1>
 */
public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.OMEGA_ORE, new ItemStack(ModItems.OMEGA_GEM, 1), getSimpleBurnXp());
        GameRegistry.addSmelting(ModBlocks.DI_ORE, new ItemStack(ModItems.DARK_INGOT, 1), getSimpleBurnXp());
    }
}
