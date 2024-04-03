package net.jephon.augmentatives.util;


import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> BEACH_CHAIRS = create("beach_chairs");
    public static final TagKey<Block> BAR_CHAIRS = create("bar_chairs");
    public static final TagKey<Block> SEATS = create("seats");

        private static TagKey<Block> create(String path) {
            return create(path, "augmentatives");
    }
    private static TagKey<Block> create(String path, String namespace) {
        return TagKey.of(Registries.BLOCK.getKey(), new Identifier(namespace, path));

    }
}