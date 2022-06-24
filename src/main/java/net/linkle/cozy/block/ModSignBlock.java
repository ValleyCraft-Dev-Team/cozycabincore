package net.linkle.cozy.block;

import net.linkle.cozy.util.Util;
import net.minecraft.block.SignBlock;
import net.minecraft.util.SignType;

public class ModSignBlock extends SignBlock {

    public ModSignBlock(Settings settings, SignType signType, String id) {
        super(settings, signType);
        lootTableId = Util.newId("blocks/" + id + "_sign");
    }

}
