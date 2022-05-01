package net.linkle.cozy.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.cozy.util.Util;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class C_Groups {
    public static final ItemGroup CABIN_GROUP = FabricItemGroupBuilder.create(
            Util.newId("cabin")).icon(() -> new ItemStack(C_Blocks.CABIN_GROUP_ICON)).build();

    public static void initialize() {
    }
}
