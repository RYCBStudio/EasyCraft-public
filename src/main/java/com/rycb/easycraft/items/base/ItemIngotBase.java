package com.rycb.easycraft.items.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngotBase extends Item implements IHasModel {

    private EnumRarity rarity;

    public ItemIngotBase(String UnlocalizedName, String RegistryName, CreativeTabs tab, EnumRarity rarity) {
        setUnlocalizedName("ingot" + UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName + "_ingot");
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
