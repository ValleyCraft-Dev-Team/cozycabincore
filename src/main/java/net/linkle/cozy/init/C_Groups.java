package net.linkle.cozy.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.cozy.util.Util;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import static net.linkle.cozy.init.C_Blocks.GLOW_BERRY_LANTERN;

public class C_Groups {
    public static final ItemGroup CABIN_GROUP = FabricItemGroupBuilder.create(
            Util.newId("cabin")).icon(() -> new ItemStack(GLOW_BERRY_LANTERN)).build();

    public static void initialize() {
    }
}
