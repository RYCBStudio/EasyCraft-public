package com.rycb.easycraft.items.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBasicBase extends Item implements IHasModel {

    private EnumRarity rarity;

    /**
     * @param UnlocalizedName 未初始化名
     * @param RegistryName    注册名
     * @param tab             创造模式物品栏
     */
    public ItemBasicBase(String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        this.rarity = EnumRarity.COMMON;
        ModItems.ITEMS.add(this);
    }

    public ItemBasicBase(String UnlocalizedName, String RegistryName, CreativeTabs tab, EnumRarity rarity) {
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        this.rarity = rarity;
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
