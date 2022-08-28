package com.rycb.easycraft.init;

import com.rycb.easycraft.EasyCraft;
import com.rycb.easycraft.armors.ArmorBase;
import com.rycb.easycraft.items.base.ItemFuelBase;
import com.rycb.easycraft.items.base.ItemGemBase;
import com.rycb.easycraft.items.base.ItemIngotBase;
import com.rycb.easycraft.items.base.tools.*;
import com.rycb.easycraft.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
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

    private static final EnumRarity COMMON = EnumRarity.COMMON;
    private static final EnumRarity UNCOMMON = EnumRarity.UNCOMMON;
    private static final EnumRarity RARE = EnumRarity.RARE;
    private static final EnumRarity EPIC = EnumRarity.EPIC;

    public static final Item DARK_FUEL = new ItemFuelBase("dark_fuel", EasyCraft.EC_TAB, UNCOMMON);

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_OMEGA = EnumHelper.addArmorMaterial("omega", Reference.MOD_ID + ":omega", 2436, new int[]{5, 9, 15, 7}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5f);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("ruby", Reference.MOD_ID + ":ruby", 3245, new int[]{4, 8, 12, 5}, 57, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5f);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_DARK = EnumHelper.addArmorMaterial("dark", Reference.MOD_ID + ":dark", 4572, new int[]{6, 10, 16, 8}, 45, SoundEvents.BLOCK_GLASS_BREAK, 6.4f);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_SCULK = EnumHelper.addArmorMaterial("sculk", Reference.MOD_ID + ":sculk", 546542355, new int[]{16384, 419430, 16777216, 10485764}, 2346897, SoundEvents.UI_TOAST_CHALLENGE_COMPLETE, 3243.54f);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CLAD_METAL = EnumHelper.addArmorMaterial("clad_metal", Reference.MOD_ID+":cm", 356987, new int[]{12, 20, 32, 16}, 67, SoundEvents.ENTITY_WITHER_SHOOT, 11.45f);
    public static final Item.ToolMaterial TOOL_MATERIAL_OMEGA = EnumHelper.addToolMaterial("omega", 2, 8357, 5.0f, 7.0f, 23);
    public static final Item.ToolMaterial TOOL_MATERIAL_DARK = EnumHelper.addToolMaterial("dark", 4, 496424, 12.5f, 10.987f, 78);
    public static final Item.ToolMaterial TOOL_MATERIAL_RUBY = EnumHelper.addToolMaterial("ruby", 3, 46385, 6.44f, 9.0f, 24);
    public static final Item.ToolMaterial TOOL_MATERIAL_SCULK = EnumHelper.addToolMaterial("sculk", 10, 167775216, 16777216.16777216f, 67108864.67108864f, 67108864);
    public static final Item.ToolMaterial TOOL_MATERIAL_CLAD_METAL = EnumHelper.addToolMaterial("cm", 4, 353789, 35.10f, 15.09f, 89);

    public static final Item OMEGA_AXE = new ToolAxe(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_PICKAXE = new ToolPickaxe(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_SWORD = new ToolSword(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_HOE = new ToolHoe(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_SHOVEL = new ToolShovel(TOOL_MATERIAL_OMEGA, "omega", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item RUBY_AXE = new ToolAxe(TOOL_MATERIAL_RUBY, "ruby", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_PICKAXE = new ToolPickaxe(TOOL_MATERIAL_RUBY, "ruby", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_SWORD = new ToolSword(TOOL_MATERIAL_RUBY, "ruby", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_HOE = new ToolHoe(TOOL_MATERIAL_RUBY, "ruby", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_SHOVEL = new ToolShovel(TOOL_MATERIAL_RUBY, "ruby", EasyCraft.EC_TAB, RARE);

    public static final Item OMEGA_HELMET = new ArmorBase(ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.HEAD, "helmetOmega", "omega_helmet", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.CHEST, "cplateOmega", "omega_chestplate", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_OMEGA, 2, EntityEquipmentSlot.LEGS, "leggingsOmega", "omega_leggings", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item OMEGA_BOOTS = new ArmorBase(ARMOR_MATERIAL_OMEGA, 1, EntityEquipmentSlot.FEET, "bootsOmega", "omega_boots", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item RUBY_HELMET = new ArmorBase(ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD, "helmetRuby", "ruby_helmet", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST, "cplateRuby", "ruby_chestplate", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS, "leggingsRuby", "ruby_leggings", EasyCraft.EC_TAB, RARE);
    public static final Item RUBY_BOOTS = new ArmorBase(ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET, "bootsRuby", "ruby_boots", EasyCraft.EC_TAB, RARE);

    public static final Item DARK_HELMET = new ArmorBase(ARMOR_MATERIAL_DARK, 1, EntityEquipmentSlot.HEAD, "helmetDark", "dark_helmet", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_CHESTPLATE = new ArmorBase(ARMOR_MATERIAL_DARK, 1, EntityEquipmentSlot.CHEST, "cplateDark", "dark_chestplate", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_LEGGINGS = new ArmorBase(ARMOR_MATERIAL_DARK, 2, EntityEquipmentSlot.LEGS, "leggingsDark", "dark_leggings", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_BOOTS = new ArmorBase(ARMOR_MATERIAL_DARK, 1, EntityEquipmentSlot.FEET, "bootsDark", "dark_boots", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_AXE = new ToolAxe(TOOL_MATERIAL_DARK, "dark", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_PICKAXE = new ToolPickaxe(TOOL_MATERIAL_DARK, "dark", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_SWORD = new ToolSword(TOOL_MATERIAL_DARK, "dark", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_HOE = new ToolHoe(TOOL_MATERIAL_DARK, "dark", EasyCraft.EC_TAB, RARE);
    public static final Item DARK_SHOVEL = new ToolShovel(TOOL_MATERIAL_DARK, "dark", EasyCraft.EC_TAB, RARE);

    public static final Item SCULK_HELMET = new ArmorBase(true, ARMOR_MATERIAL_SCULK, 1, EntityEquipmentSlot.HEAD, "helmetSculk", "sculk_helmet", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_CHESTPLATE = new ArmorBase(true, ARMOR_MATERIAL_SCULK, 1, EntityEquipmentSlot.CHEST, "cplateSculk", "sculk_chestplate", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_LEGGINGS = new ArmorBase(true, ARMOR_MATERIAL_SCULK, 2, EntityEquipmentSlot.LEGS, "leggingsSculk", "sculk_leggings", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_BOOTS = new ArmorBase(true, ARMOR_MATERIAL_SCULK, 1, EntityEquipmentSlot.FEET, "bootsSculk", "sculk_boots", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_AXE = new ToolAxe(true, TOOL_MATERIAL_SCULK, "Sculk", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_PICKAXE = new ToolPickaxe(true, TOOL_MATERIAL_SCULK, "Sculk", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_SWORD = new ToolSword(true, TOOL_MATERIAL_SCULK, "Sculk", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_HOE = new ToolHoe(true, TOOL_MATERIAL_SCULK, "Sculk", EasyCraft.EC_TAB, EPIC);
    public static final Item SCULK_SHOVEL = new ToolShovel(true, TOOL_MATERIAL_SCULK, "Sculk", EasyCraft.EC_TAB, EPIC);

    public static final Item CLAD_METAL_HELMET = new ArmorBase(true, ARMOR_MATERIAL_CLAD_METAL, 1, EntityEquipmentSlot.HEAD, "helmetClad_metal", "clad_metal_helmet", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_CHESTPLATE = new ArmorBase(true, ARMOR_MATERIAL_CLAD_METAL, 1, EntityEquipmentSlot.CHEST, "cplateClad_metal", "clad_metal_chestplate", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_LEGGINGS = new ArmorBase(true, ARMOR_MATERIAL_CLAD_METAL, 2, EntityEquipmentSlot.LEGS, "leggingsClad_metal", "clad_metal_leggings", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_BOOTS = new ArmorBase(true, ARMOR_MATERIAL_CLAD_METAL, 1, EntityEquipmentSlot.FEET, "bootsClad_metal", "clad_metal_boots", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_AXE = new ToolAxe(true, TOOL_MATERIAL_CLAD_METAL, "Clad_metal", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_PICKAXE = new ToolPickaxe(true, TOOL_MATERIAL_CLAD_METAL, "Clad_metal", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_SWORD = new ToolSword(true, TOOL_MATERIAL_CLAD_METAL, "Clad_metal", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_HOE = new ToolHoe(true, TOOL_MATERIAL_CLAD_METAL, "Clad_metal", EasyCraft.EC_TAB, EPIC);
    public static final Item CLAD_METAL_SHOVEL = new ToolShovel(true, TOOL_MATERIAL_CLAD_METAL, "Clad_metal", EasyCraft.EC_TAB, EPIC);

    public static final Item OMEGA_GEM = new ItemGemBase("omega", EasyCraft.EC_TAB, 64, UNCOMMON);
    public static final Item RUBY = new ItemGemBase("ruby", EasyCraft.EC_TAB, 64, RARE);
    public static final Item DARK_INGOT = new ItemIngotBase("Dark", "dark", EasyCraft.EC_TAB, UNCOMMON);
    public static final Item SCULK_INGOT = new ItemIngotBase("Sculk", "sculk", EasyCraft.EC_TAB, EPIC);
}
