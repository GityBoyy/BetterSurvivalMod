package net.chubby.bettersurvivalmod;

import net.chubby.bettersurvivalmod.client.proxy.ClientProxy;
import net.chubby.bettersurvivalmod.client.proxy.CommonProxy;
import net.chubby.bettersurvivalmod.common.util.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class BetterSurvivalMod
{


    private static Logger logger;

    @Mod.Instance
    public BetterSurvivalMod instance;
    @SidedProxy(clientSide = Reference.CLIENTSIDE,serverSide = Reference.COMMONSIDE)
    public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
