package com.rycb.easycraft.items;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.IRarity;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/26 10:47</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyCraft/com.rycb.easycraft.items/EnumRarity.java</p>
 * <h1><center>EnumRarity</center></h1>
 */
public enum EnumRarity implements IRarity {
    UNBREAKABLE(TextFormatting.RED, "Unbreakable"),
    LEGENDARY(TextFormatting.GOLD, "Legendary"),
    KETER(TextFormatting.DARK_RED, "Keter"),
    THAUMIEL(TextFormatting.BLUE, "Thaumiel"),
    APOLLYON(TextFormatting.DARK_BLUE, "Apollyon");
    public final TextFormatting rarityColor;
    public final String rarityName;

    EnumRarity(TextFormatting color, String name) {
        this.rarityColor = color;
        this.rarityName = name;
    }

    @Override
    public TextFormatting getColor() {
        return this.rarityColor;
    }

    @Override
    public String getName() {
        return this.rarityName;
    }
}
