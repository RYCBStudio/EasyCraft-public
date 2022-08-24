package com.rycb.easycraft.items.base.tools;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    private EnumRarity rarity;

    public ToolPickaxe(ToolMaterial material, String name, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("pickaxe" + toUpper(name));
        setRegistryName(toLower(name) + "_pickaxe");
        setCreativeTab(tab);
        this.rarity = EnumRarity.COMMON;
        ModItems.ITEMS.add(this);
    }

    public ToolPickaxe(ToolMaterial material, String name, CreativeTabs tab, EnumRarity rarity) {
        super(material);
        setUnlocalizedName("pickaxe" + toUpper(name));
        setRegistryName(toLower(name) + "_pickaxe");
        setCreativeTab(tab);
        this.rarity = rarity;
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStackIn) {
        return this.rarity;
    }
}
