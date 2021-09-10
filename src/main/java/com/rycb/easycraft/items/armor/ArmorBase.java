package com.rycb.easycraft.items.armor;

import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/25 20:06
 * Location:EasyCraft/com.rycb.easycraft.items.armor/
 * This is the project of EasyCraft
 */
public class ArmorBase extends ItemArmor implements IHasModel {

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tab) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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