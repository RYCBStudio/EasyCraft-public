package com.rycb.easycraft.items.base.tools;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.init.ModItems;
import com.rycb.easycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import static com.rycb.easycraft.util.SimpleCalculator.toLower;
import static com.rycb.easycraft.util.SimpleCalculator.toUpper;

/**
 * @author RYCBStudio/Java Department
 */
public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(ToolMaterial material, String name, CreativeTabs tab) {
        super(material, 9.0f, -2.5f);
        setUnlocalizedName("axe" + toUpper(name));
        setRegistryName(toLower(name) + "_axe");
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        EasyCraft.proxy.registerItemRender(this, 0, "inventory");
    }
}
