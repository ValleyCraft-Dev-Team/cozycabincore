package net.linkle.cozy.util.loot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.linkle.cozy.mixin.LootBuilderMixin;
import net.minecraft.loot.LootManager;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import static net.linkle.cozy.CozyCabinCore.LOGGER;

/** Loot table helper using fabric's loot API. */
public class LootTableHelper {
    private static final HashMap<Identifier, List<LootPool.Builder>> APPEND_MAP = new HashMap<>(64);
    private static final HashMap<Identifier, List<Consumer<LootPool.Builder>>> INJECT_MAP = new HashMap<>(64);

    /** Create and append a new pool. */
    public static void appendLoot(Identifier lootID, LootBuilder loot) {
        var pools = APPEND_MAP.computeIfAbsent(lootID, k -> new ArrayList<>(5));
        pools.add(loot.build());
    }

    /** Inject pool with new entry. */
    public static void injectLoot(Identifier lootID, Consumer<LootPool.Builder> consumer) {
        var pools = INJECT_MAP.computeIfAbsent(lootID, k -> new ArrayList<>(5));
        pools.add(consumer);
    }
    
    private static void onLootLoad(ResourceManager resourceManager, LootManager lootManager, Identifier id, LootTable.Builder tableBuilder, LootTableSource source) {
        var inject = INJECT_MAP.get(id);
        if (inject != null) {
            var pools = ((LootBuilderMixin)tableBuilder).getPools();
            if (pools.isEmpty()) {
                LOGGER.warn("Unable inject loot for " + id);
            } else {
                var pool = FabricLootPoolBuilder.copyOf(pools.get(0));
                inject.forEach(c->c.accept(pool));
                pools.set(0, pool.build());
            }
        }

        var append = APPEND_MAP.get(id);
        if (append != null) {
            append.forEach(tableBuilder::pool);
        }
    }
    
    static {
        LootTableEvents.MODIFY.register(LootTableHelper::onLootLoad);
    }
}