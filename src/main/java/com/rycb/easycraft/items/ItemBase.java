package com.rycb.easycraft.items;


import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.utill.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels(){

        Easycraft.proxy.registerItemRenderer(this, 0, "inventory");

    }


}