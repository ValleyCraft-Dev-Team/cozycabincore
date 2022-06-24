package net.linkle.cozy.mixin;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;

@Mixin(LootTable.Builder.class)
public interface LootBuilderMixin {
    @Accessor
    List<LootPool> getPools();
}
