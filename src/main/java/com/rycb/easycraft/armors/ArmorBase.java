package com.rycb.easycraft.armors;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {


    public ArmorBase(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String UnlocalizedName, String RegistryName, CreativeTabs tab) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }
}
