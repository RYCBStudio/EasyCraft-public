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
 * <p>Location: EasyCraft/com.rycb.easycraft.items.single/DarkShield.java</p>
 * <h1><center>OmegaShield</center></h1>
 */
public class DarkShield extends Item implements IHasModel {
    public DarkShield() {
        setRegistryName("dark_shield");
        setUnlocalizedName("dark_shield");
        setCreativeTab(EasyCraft.EC_TAB);
        setMaxDamage(2986424);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStackIn) {
        return EnumRarity.RARE;
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable EntityLivingBase entity) {
        return true;
    }
}
