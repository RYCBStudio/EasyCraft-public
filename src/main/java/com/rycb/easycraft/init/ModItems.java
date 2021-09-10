package com.rycb.easycraft.init;


import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.food.FoodBase;
import com.rycb.easycraft.items.ItemBase;
import com.rycb.easycraft.items.armor.ArmorBase;
import com.rycb.easycraft.items.tools.*;
import com.rycb.easycraft.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //Materials
    //Materials-Tools
    public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_Ruby",4,2200,15.0F,14.0F,14);
    public static final Item.ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian",4,2500,20.0F,20.0F,20);
    public static final Item.ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_co",5,2500,35.00F,40.0F,40);
    //Materials-Armors
    public static ItemArmor.ArmorMaterial ARMOR_MATERIAL_OI = EnumHelper.addArmorMaterial("material_obsidian", Reference.MOD_ID+":obsidian_ingot", 2500, new int[] {30,150,70,15}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,4.0F);


    //Armors
    //Armors-Obsidian Ingot Armor
    public static final Item OI_HELMET = new ArmorBase("oi_helmet",ARMOR_MATERIAL_OI,1,EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT);
    public static final Item OI_CHESTPLATE = new ArmorBase("oi_chestplate",ARMOR_MATERIAL_OI,1,EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT);
    public static final Item OI_LEGGINGS = new ArmorBase("oi_leggings",ARMOR_MATERIAL_OI,2,EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT);
    public static final Item OI_BOOTS = new ArmorBase("oi_boots",ARMOR_MATERIAL_OI,1, EntityEquipmentSlot.FEET, CreativeTabs.COMBAT);

    //Items
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot", Easycraft.EASTCRAFT);
    public static final Item RUBY = new ItemBase("ruby", Easycraft.EASTCRAFT);
    public static final Item COBALT_INGOT = new ItemBase("co_ingot",Easycraft.EASTCRAFT);

    //Foods
    public static final ItemFood COCA_COLA = new FoodBase("coca_cola",10,(float)3.5,false,Easycraft.EASTCRAFT);



    // Tools
    // Tools-Obsidian Tools
    public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword",Easycraft.EASTCRAFT,MATERIAL_OBSIDIAN);
    public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe",Easycraft.EASTCRAFT,MATERIAL_OBSIDIAN);
    public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe",Easycraft.EASTCRAFT,MATERIAL_OBSIDIAN);
    public static final ItemSpade OBSIDIAN_SPADE = new ToolShovel("obsidian_shovel",Easycraft.EASTCRAFT,MATERIAL_OBSIDIAN);
    public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe",Easycraft.EASTCRAFT,MATERIAL_OBSIDIAN);
    public static final ItemShears OBSIDIAN_SHEAR = new ToolShear("obsidian_shears",Easycraft.EASTCRAFT,MATERIAL_OBSIDIAN);
    // Tools-Ruby Tools
    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword",Easycraft.EASTCRAFT,MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe",Easycraft.EASTCRAFT,MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe",Easycraft.EASTCRAFT,MATERIAL_RUBY);
    public static final ItemSpade RUBY_SPADE = new ToolShovel("ruby_shovel",Easycraft.EASTCRAFT,MATERIAL_RUBY);
    public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe",Easycraft.EASTCRAFT,MATERIAL_RUBY);
    // Tools-Cobalt Tools
    public static final ItemSword CO_SWORD = new ToolSword("co_sword",Easycraft.EASTCRAFT,MATERIAL_COBALT);
    public static final ItemAxe CO_AXE = new ToolAxe("co_axe",Easycraft.EASTCRAFT,MATERIAL_COBALT);
    public static final ItemPickaxe CO_PICKAXE = new ToolPickaxe("co_pickaxe",Easycraft.EASTCRAFT,MATERIAL_COBALT);
    public static final ItemSpade CO_SPADE = new ToolShovel("co_shovel",Easycraft.EASTCRAFT,MATERIAL_COBALT);
    public static final ItemHoe CO_HOE = new ToolHoe("co_hoe",Easycraft.EASTCRAFT,MATERIAL_COBALT);
}