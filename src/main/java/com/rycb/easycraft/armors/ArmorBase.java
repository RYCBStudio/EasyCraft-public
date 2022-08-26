package com.rycb.easycraft.armors;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel {


    private final EnumRarity rarity;

    public ArmorBase(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String UnlocalizedName, String RegistryName, CreativeTabs tab, EnumRarity rarity) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        this.rarity = rarity;
        ModItems.ITEMS.add(this);
    }

    public ArmorBase(boolean isUnbreakable, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String UnlocalizedName, String RegistryName, CreativeTabs tab, EnumRarity rarity) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(UnlocalizedName);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        if (isUnbreakable) setNoRepair();
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
