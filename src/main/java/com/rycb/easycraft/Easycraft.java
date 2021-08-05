package com.rycb.easycraft;

import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import com.rycb.easycraft.proxy.CommonProxy;
import com.rycb.easycraft.utill.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static com.rycb.easycraft.utill.Reference.CLINET_PROXY_CLASS;

@Mod(modid = Reference.MOD_ID,name = Reference.NAME, version = Reference.VERSION)
public class Easycraft{

    @SidedProxy(clientSide = CLINET_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event ) {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event ) {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event ) {

    }

    @Instance
    public static Easycraft instance;
}