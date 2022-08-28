package com.rycb.easycraft.util.handlers;


import com.rycb.easycraft.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/10 17:25</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.easycraft.util.handlers/OreDictHandler.java</p>
 * <h1><center>OreDictHandler</center></h1>
 */
public class OreDictHandler {
    public static void init() {
        OreDictionary.registerOre("forge:gems/ruby", ModItems.RUBY);
        OreDictionary.registerOre("forge:pickaxe", ModItems.DARK_PICKAXE);
        OreDictionary.registerOre("forge:pickaxe", ModItems.RUBY_PICKAXE);
        OreDictionary.registerOre("forge:pickaxe", ModItems.SCULK_PICKAXE);
        OreDictionary.registerOre("forge:pickaxe", ModItems.OMEGA_PICKAXE);
    }
}
