package com.rycb.easycraft.proxy;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author RYCBStudio
 * Create Time: 2022/1/28
 * Location:Easy-Tech/com.rycb.easycraft.proxy/CommonProxy.java
 * Use the IntelliJ IDEA
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        //TODO
    }

    public void Init(FMLInitializationEvent event) {
        //TODO
    }

    public void postInit(FMLPostInitializationEvent event) {
        //TODO
    }

    public void registerItemRender(Item item, int meta, String id) {
        //TODO
    }

    /**
     * Return player on client, null on server
     *
     * @return null
     */
    public EntityPlayer getPlayerClient() {
        return null;
    }
}
