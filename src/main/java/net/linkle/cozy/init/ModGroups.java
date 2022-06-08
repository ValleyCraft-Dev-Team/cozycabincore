package net.linkle.cozy.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.cozy.util.Util;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroups {
    public static final ItemGroup CABIN_GROUP = FabricItemGroupBuilder.create(
            Util.newId("cabin")).icon(() -> new ItemStack(ModItems.CABIN_ICON)).build();

    public static void initialize() {
    }
}
