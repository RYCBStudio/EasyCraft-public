package com.rycb.easycraft.food;

import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/09/05 11:34
 * Location:EasyCraft/com.rycb.easycraft.food/
 * This is the project of EasyCraft
 * Use the IntelliJ IDEA
 */
public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab) {
        super(amount, saturation, iswolfFood);
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