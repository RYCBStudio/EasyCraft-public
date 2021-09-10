package com.rycb.easycraft.entity.render;

import com.rycb.easycraft.entity.EntityHappyZombie;
import com.rycb.easycraft.entity.model.ModelHappyZombie;
import com.rycb.easycraft.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * Author:RYCBStudio/Java Department
 * Create Time:2021/08/23 16:05
 * Location:EasyCraft/com.rycb.easycraft.entity.render/
 * This is the project of EasyCraft
 */
public class RenderHappyZombie extends RenderLiving<EntityHappyZombie> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + "textures/entity/happy_zombie.png");
    public RenderHappyZombie(RenderManager manager) {
        super(manager, new ModelHappyZombie(),0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityHappyZombie entity) {
        return TEXTURES;
    }

}