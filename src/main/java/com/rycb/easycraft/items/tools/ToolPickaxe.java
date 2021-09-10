package com.rycb.easycraft.items.tools;

import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/24 14:53
 * Location:EasyCraft/com.rycb.easycraft.items.tools/
 * This is the project of EasyCraft
 */
public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name, CreativeTabs tab, Item.ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Easycraft.proxy.registerItemRenderer(this, 0, "inventory");
    }

}