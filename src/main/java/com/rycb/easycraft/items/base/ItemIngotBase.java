package com.rycb.easycraft.items.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIngotBase extends Item implements IHasModel {

    public ItemIngotBase(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        setUnlocalizedName("ingot" + UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName + "_ingot");
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }
}
