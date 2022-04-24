package net.linkle.cozy.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static net.linkle.cozy.init.C_Blocks.*;

@Environment(EnvType.CLIENT)
public class RenderLayers {
    
    public static void intialize() {
     // Only use cullout if the block's texture contains empty pixels.
        var cullout = RenderLayer.getCutout();
        
        // Only use translucent if the block's texture contains transparent pixels.
        var translucent = RenderLayer.getTranslucent();
        
        // Example
        //put(Blocks.GLASS, cullout);
        put(GLOW_BERRY_LANTERN, cullout);
        put(FLOWER_LANTERN, cullout);
        put(AMETHYST_LANTERN, cullout);
        put(GLOW_BERRY_LANTERN, translucent);
        put(FLOWER_LANTERN, translucent);
        put(AMETHYST_LANTERN, translucent);
        put(SHORT_LILAC_BUSH, translucent);
        put(SHORT_ROSE_BUSH, translucent);
        put(SHORT_PEONY_BUSH, translucent);
        put(AZALEA_ACACIA_DOOR, translucent);
        put(AZALEA_JUNGLE_DOOR, translucent);
        put(AZALEA_OAK_DOOR, translucent);
    }
    
    private static void put(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}
