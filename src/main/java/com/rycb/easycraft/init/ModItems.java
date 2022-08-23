package com.rycb.easycraft.init;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.armors.ArmorBase;
import com.rycb.easycraft.items.base.ItemGemBase;
import com.rycb.easycraft.items.base.tools.*;
import com.rycb.easycraft.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/23 9:00</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft.init/ModItems.java</p>
 * <h1><center>ModItems</center></h1>
 */
public class ModItems {
    public static List<Item> ITEMS = new ArrayList<Item>();
    public static final Item OMEGA_GEM = new ItemGemBase("omega", EasyCraft.EC_TAB, 64);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_OMEGA = EnumHelper.addArmorMaterial("omega", Reference.MOD_ID + ":omega", 44, new int[]{5, 9, 15, 7}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5f);
    public static final Item.ToolMaterial TOOL_MATERIAL_OMEGA = EnumHelper.addToolMaterial("omega", 2, 8357, 5.0f, 29.0f, 23);
    public static final Item OMEGA_AXE = new ToolAxe(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB);
    public static final Item OMEGA_PICKAXE = new ToolPickaxe(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB);
    public static final Item OMEGA_SWORD = new ToolSword(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB);
    public static final Item OMEGA_HOE = new ToolHoe(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB);
    public static final Item OMEGA_SHOVEL = new ToolShovel(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB);
    public static final Item OMEGA_HELMET = new ArmorBase(ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.HEAD, "helmetOmega", "omega_helmet", EasyCraft.EC_TAB);
    public static final Item OMEGA_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.CHEST, "cplateOmega", "omega_chestplate", EasyCraft.EC_TAB);
    public static final Item OMEGA_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_OMEGA, 2, EntityEquipmentSlot.LEGS, "leggingsOmega", "omega_leggings", EasyCraft.EC_TAB);
    public static final Item OMEGA_BOOTS = new ArmorBase(ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.FEET, "bootsOmega", "omega_boots", EasyCraft.EC_TAB);

}
