package net.linkle.cozy.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.cozy.util.Util;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class C_Groups {
    public static final ItemGroup TEST_GROUP = FabricItemGroupBuilder.create(
            Util.newId("test_group")).icon(() -> new ItemStack(Items.BREAD)).build();

    public static void initialize() {
    }
}
