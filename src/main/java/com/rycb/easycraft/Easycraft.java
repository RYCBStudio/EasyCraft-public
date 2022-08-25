package com.rycb.easycraft;

import com.rycb.easycraft.init.ModRecipes;
import com.rycb.easycraft.proxy.CommonProxy;
import com.rycb.easycraft.tab.ECTab;
import com.rycb.easycraft.util.Reference;
import com.rycb.easycraft.util.handlers.OreDictHandler;
import com.rycb.easycraft.util.handlers.RegistryHandler;
import com.rycb.easycraft.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/22 21:30</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: Easycraft/com.rycb.easycraft/EasyCraft.java</p>
 * <h1><center>EasyCraft</center></h1>
 */

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class EasyCraft {
    private static final Logger LOGGER = LogManager.getLogger();
    @Mod.Instance(Reference.MOD_ID)
    public static EasyCraft instance;
    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static CommonProxy proxy;
    public static CreativeTabs EC_TAB = new ECTab();

    static {
        FluidRegistry.enableUniversalBucket();
    }

    Class<?> EasyTech = null;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        try {
            EasyTech = Class.forName("com.rycb.etech.EasyTech");
        } catch (Exception ignored) {
        }
        proxy.preInit(event);
        LOGGER.info("{} for Minecraft {} is pre-initializing", Reference.NAME, Reference.MC_VERSION);
//        if (EasyTech != null) {
//            LOGGER.fatal("[{}] [First Warning] Find EasyTech Mod. It can cause the game CRASH!", "EasyCraft");
//            LOGGER.fatal("[{}] [First Warning] The game will crash on loading phase 3.", "EasyCraft");
//        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        try {
            EasyTech = Class.forName("com.rycb.etech.EasyTech");
        } catch (Exception ignored) {
        }
        OreDictHandler.init();
        ModRecipes.init();
        proxy.Init(event);
        RegistryHandler.initRegistries();
        new ModWorldGen();
        LOGGER.info("{} for Minecraft {} is initializing", Reference.NAME, Reference.MC_VERSION);
//        if (EasyTech != null) {
//            LOGGER.fatal("[{}] [Second Warning] Find EasyTech Mod. It can cause the game CRASH!", "EasyCraft");
//            LOGGER.fatal("[{}] [Second Warning] The game will crash on loading phase 3.", "EasyCraft");
//        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) throws FindETException {
        proxy.postInit(event);
        LOGGER.info("{} for Minecraft {} is post-initializing", Reference.NAME, Reference.MC_VERSION);
//        if (EasyTech != null) {
//            LOGGER.fatal("[{}] [LAST Warning] Find EasyTech Mod. It can cause the game CRASH!", "EasyCraft");
//            LOGGER.fatal("[{}] [LAST Warning] The game will crash on loading phase 3.", "EasyCraft");
//            throw new FindETException("Find EasyTech Mod. It can cause the game CRASH!\n\tDon't report to the authors. They will NOT fix it.");
//        }
    }
}

class FindETException extends Exception {
    public FindETException(String msg) {
        super(msg);
    }
}
