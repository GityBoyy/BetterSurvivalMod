package net.chubby.bettersurvivalmod.client.registry;

import net.chubby.bettersurvivalmod.common.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ItemBase SAPPHIRE = new ItemBase("sapphire").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                SAPPHIRE
        );
    }

    public static void registerModels() {
        SAPPHIRE.registerItemModel();
    }
}
