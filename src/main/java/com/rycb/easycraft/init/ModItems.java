package com.rycb.easycraft.init;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.items.base.ItemGemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/23 9:00</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.init/ModItems.java</p>
 * <h1><center>ModItems</center></h1>
 */
public class ModItems {
    public static final Item OMEGA_GEM = new ItemGemBase("omega", EasyCraft.EC_TAB, 64);
    public static List<Item> ITEMS = new ArrayList<Item>();
}
