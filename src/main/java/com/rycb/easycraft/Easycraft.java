package com.rycb.easycraft;

import com.rycb.easycraft.init.ModRecipes;
import com.rycb.easycraft.tabs.EasycraftItems;
import com.rycb.easycraft.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod.Instance;
import com.rycb.easycraft.proxy.CommonProxy;
import com.rycb.easycraft.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static com.rycb.easycraft.util.Reference.CLIENT_PROXY_CLASS;

@Mod(modid = Reference.MOD_ID,name = Reference.NAME, version = Reference.VERSION)
public class Easycraft{

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event ) {

        RegistryHandler.preInitRegistries();

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event ) {

        ModRecipes.init();

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event ) {

    }

    @Instance
    public static Easycraft instance;

    public static CreativeTabs EASTCRAFT = new EasycraftItems();

}