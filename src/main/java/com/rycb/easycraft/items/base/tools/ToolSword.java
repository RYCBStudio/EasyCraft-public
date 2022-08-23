package com.rycb.easycraft.items.base.tools;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

public class ToolSword extends ItemSword implements IHasModel {
    public ToolSword(ToolMaterial material, String name, CreativeTabs tab) {
        super(material);
        setUnlocalizedName("sword" + toUpper(name));
        setRegistryName(toLower(name) + "_sword");
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }
}
