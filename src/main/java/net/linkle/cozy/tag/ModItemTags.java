package net.linkle.cozy.tag;

import static net.linkle.cozy.tag.Util.*;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> BARK_PLANKS = TagKey.of(Registry.ITEM_KEY, modId("bark_planks"));
    
    public static void initialize() {
        
    }
}
