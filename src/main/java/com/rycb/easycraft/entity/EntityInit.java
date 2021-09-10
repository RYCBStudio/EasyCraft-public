package com.rycb.easycraft.entity;

import com.rycb.easycraft.Easycraft;
import com.rycb.easycraft.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/23 15:43
 * Location:EasyCraft/com.rycb.easycraft.entity/
 * This is the project of EasyCraft
 */
public class EntityInit {
    public static void registerEntities()
    {
        registerEntity("obsidian_zombie", EntityHappyZombie.class, Reference.ENTITY_HAPPY_ZOMBIE, 64, 7217065, 16777215);
    }
    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int primaryColor, int secondaryColor)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":entity/" + name), entity, name, id, Easycraft.instance, range, 1, true, primaryColor, secondaryColor);


    }
}