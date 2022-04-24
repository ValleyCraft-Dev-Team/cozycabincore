package net.linkle.cozy.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class RenderLayers {
    
    public static void intialize() {
     // Only use cullout if the block's texture contains empty pixels.
        var cullout = RenderLayer.getCutout();
        
        // Only use translucent if the block's texture contains transparent pixels.
        var translucent = RenderLayer.getTranslucent();
        
        // Example
        //put(Blocks.GLASS, cullout);
    }
    
    private static void put(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}
