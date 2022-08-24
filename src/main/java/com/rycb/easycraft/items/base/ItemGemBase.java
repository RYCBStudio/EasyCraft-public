package com.rycb.easycraft.items.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/6 15:37</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.easycraft.items.base/ItemGemBase.java</p>
 * <h1><center>ItemGemBase</center></h1>
 */
public class ItemGemBase extends Item implements IHasModel {
    private EnumRarity rarity;
    /**
     * @param name 物品名字
     * @param tab  创造模式物品栏
     */
    public ItemGemBase(String name, CreativeTabs tab, @Nullable Integer stackSize, @Nullable EnumRarity rarity) {
        setUnlocalizedName("gem" + toUpper(name));
        setRegistryName(toLower(name) + "_gem");
        setCreativeTab(tab);
        this.rarity = rarity;
        if (stackSize == null) {
            setMaxStackSize(16);
        } else setMaxStackSize(stackSize);
        ModItems.ITEMS.add(this);
    }

    public ItemGemBase(String name, CreativeTabs tab, @Nullable Integer stackSize) {
        setUnlocalizedName("gem" + toUpper(name));
        setRegistryName(toLower(name) + "_gem");
        setCreativeTab(tab);
        this.rarity = EnumRarity.COMMON;
        if (stackSize == null) {
            setMaxStackSize(16);
        } else setMaxStackSize(stackSize);
        ModItems.ITEMS.add(this);
    }

    public ItemGemBase(String name, CreativeTabs tab) {
        setUnlocalizedName("gem" + toUpper(name));
        setRegistryName(toLower(name) + "_gem");
        setCreativeTab(tab);
        this.rarity = EnumRarity.COMMON;
        setMaxStackSize(64);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return this.rarity;
    }
}
