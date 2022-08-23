package com.rycb.easycraft.tab;

import com.rycb.easycraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/23 9:08</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.tab/ECTab.java</p>
 * <h1><center>ECTab</center></h1>
 */
public class ECTab extends CreativeTabs {
    public ECTab() {
        super("ec_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.OMEGA_GEM);
    }
}
