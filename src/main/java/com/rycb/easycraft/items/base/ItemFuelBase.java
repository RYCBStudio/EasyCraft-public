package com.rycb.easycraft.items.base;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/24 16:59</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.items.base/ItemFuelBase.java</p>
 * <h1><center>ItemFuelBase</center></h1>
 */
public class ItemFuelBase extends ItemBasicBase implements IHasModel {

    private final EnumRarity rarity;

    public ItemFuelBase(String name, CreativeTabs tab) {
        super(toUpper(name), toLower(name), tab);
        this.rarity = EnumRarity.COMMON;
    }

    public ItemFuelBase(String name, CreativeTabs tab, EnumRarity rarity) {
        super(name, name, tab, rarity);
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
