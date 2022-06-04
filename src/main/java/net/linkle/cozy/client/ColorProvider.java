package net.linkle.cozy.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.linkle.cozy.init.C_Blocks;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.ItemConvertible;

@Environment(EnvType.CLIENT)
public class ColorProvider {

    @SuppressWarnings("unused")
    public static void intialize() {
        BlockColorProvider blockProvider;
        ItemColorProvider itemProvider;
        
        blockColor(newBlockColor(0x84BF70), C_Blocks.REDWOOD_LEAVES);
        itemColor(newItemColor(0x84BF70), C_Blocks.REDWOOD_LEAVES);
    }
    
    private static void blockColor(BlockColorProvider provider, Block... blocks) {
        ColorProviderRegistry.BLOCK.register(provider, blocks);
    }
    
    private static void itemColor(ItemColorProvider provider, ItemConvertible... items) {
        ColorProviderRegistry.ITEM.register(provider, items);
    }
    
    private static BlockColorProvider newBlockColor(int color) {
        return (state, view, pos, index) -> color;
    }
    
    private static ItemColorProvider newItemColor(int color) {
        return (stack, index) -> color;
    }
}
