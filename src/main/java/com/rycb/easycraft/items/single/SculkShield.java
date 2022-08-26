package com.rycb.easycraft.items.single;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/26 10:42</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyCraft/com.rycb.easycraft.items.single/SculkShield.java</p>
 * <h1><center>OmegaShield</center></h1>
 */
public class SculkShield extends Item implements IHasModel {
    public SculkShield() {
        setRegistryName("sculk_shield");
        setUnlocalizedName("sculk_shield");
        setCreativeTab(EasyCraft.EC_TAB);
        setMaxDamage(0);
        setMaxStackSize(1);
        setNoRepair();
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStackIn) {
        return EnumRarity.EPIC;
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable EntityLivingBase entity) {
        return true;
    }
}
