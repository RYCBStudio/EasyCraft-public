package com.rycb.easycraft.util.handlers;

import com.rycb.easycraft.entity.EntityHappyZombie;
import com.rycb.easycraft.entity.render.RenderHappyZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/23 16:14
 * Location:EasyCraft/com.rycb.easycraft.util.handlers/
 * This is the project of EasyCraft
 */
public class RenderHandler {

    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityHappyZombie.class, new IRenderFactory<EntityHappyZombie>()
        {
        @Override
            public Render<? super EntityHappyZombie> createRenderFor(RenderManager manager){
            return new RenderHappyZombie(manager);
        }
            }
            );
    }

}