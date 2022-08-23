package com.rycb.easycraft.items.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/17 20:48</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.easycraft.items.base/ItemMaterialBase.java</p>
 * <h1><center>ItemMaterialBase</center></h1>
 */
public class ItemMaterialBase extends Item implements IHasModel {

    public ItemMaterialBase(String name, @Nullable CreativeTabs tab, boolean hasCustomMaxStackSize, @Nullable Integer stackSize) {
        setUnlocalizedName(toUpper(name));
        setRegistryName(toLower(name));
        if (tab == null) {
            setCreativeTab(EasyCraft.EC_TAB);
        } else {
            setCreativeTab(tab);
        }
        if (hasCustomMaxStackSize) setMaxStackSize(stackSize == null ? 48 : stackSize);
        else setMaxStackSize(48);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }

}
