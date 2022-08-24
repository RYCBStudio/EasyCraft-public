package com.rycb.easycraft.items.base.tools;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

public class ToolSword extends ItemSword implements IHasModel {

    private EnumRarity rarity;

    public ToolSword(ToolMaterial material, String name, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("sword" + toUpper(name));
        setRegistryName(toLower(name) + "_sword");
        setCreativeTab(tab);
        this.rarity = EnumRarity.COMMON;
        ModItems.ITEMS.add(this);
    }

    public ToolSword(ToolMaterial material, String name, CreativeTabs tab, EnumRarity rarity) {
        super(material);
        setUnlocalizedName("sword" + toUpper(name));
        setRegistryName(toLower(name) + "_sword");
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
