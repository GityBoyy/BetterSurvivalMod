package net.chubby.bettersurvivalmod.common.util.handler;

import net.chubby.bettersurvivalmod.client.registry.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        ModItems.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
        ModItems.registerModels();
    }



}
