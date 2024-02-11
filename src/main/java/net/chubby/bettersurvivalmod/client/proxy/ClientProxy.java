package net.chubby.bettersurvivalmod.client.proxy;

import net.chubby.bettersurvivalmod.BetterSurvivalMod;
import net.chubby.bettersurvivalmod.common.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;

public class ClientProxy extends CommonProxy{

    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + id,"inventory"));
    }
}
