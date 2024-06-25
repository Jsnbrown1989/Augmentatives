package net.jephon.augmentatives.util;


import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> CLIMBABLE = create("climbable");
    public static final TagKey<Block> BEACH_CHAIRS = create("beach_chairs");
    public static final TagKey<Block> BAR_CHAIRS = create("bar_chairs");
    public static final TagKey<Block> SEATS = create("seats");
    public static final TagKey<Block> COUNTERS = create("counters");
    public static final TagKey<Block> COUNTER_GLASS_DOORS = create("counter_glass_doors");
    public static final TagKey<Block> COUNTER_DOORS = create("counter_doors");
    public static final TagKey<Block> COUNTER_DRAWERS = create("counter_drawers");
    public static final TagKey<Block> GUARDRAILS = create("guardrails");
    public static final TagKey<Block> MANHOLES  = create("manholes");
    public static final TagKey<Block> TINTABLE  = create("tintable");
    private static TagKey<Block> create(String path) {
            return create(path, "augmentatives");
    }
    private static TagKey<Block> create(String path, String namespace) {
        return TagKey.of(Registries.BLOCK.getKey(), new Identifier(namespace, path));

    }
}