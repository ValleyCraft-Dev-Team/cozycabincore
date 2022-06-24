package net.linkle.cozy.init;

import net.linkle.cozy.util.loot.LootBuilder;
import net.linkle.cozy.util.loot.LootTableHelper;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;

public class ModLootTable {
    private static final LootCondition.Builder WITH_SILK_TOUCH = MatchToolLootCondition.builder(ItemPredicate.Builder
            .create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))));
    private static final LootCondition.Builder WITHOUT_SILK_TOUCH = WITH_SILK_TOUCH.invert();
    private static final LootCondition.Builder WITH_SHEARS = MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.SHEARS));
    private static final LootCondition.Builder WITH_SILK_TOUCH_OR_SHEARS = WITH_SHEARS.or(WITH_SILK_TOUCH);
    private static final LootCondition.Builder WITHOUT_SILK_TOUCH_NOR_SHEARS = WITH_SILK_TOUCH_OR_SHEARS.invert();

    public static void initialize() {
        chests();
        blocks();
    }

    private static void chests() {

    }

    private static void blocks() {
        LootBuilder builder;
        builder = new LootBuilder().rolls(1).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS)
        .with((BlockLootTableGenerator.addSurvivesExplosionCondition(Blocks.SPRUCE_LEAVES, ItemEntry.builder(ModItems.PINE_TAR)))
        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.02f, 0.022222223f, 0.025f, 0.033333335f, 0.1f)));
        LootTableHelper.appendLoot(Blocks.SPRUCE_LEAVES.getLootTableId(), builder);
    }
}
