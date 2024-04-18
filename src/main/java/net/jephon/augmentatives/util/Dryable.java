package net.jephon.augmentatives.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Degradable;
import net.minecraft.util.StringIdentifiable;

import java.util.Optional;
import java.util.function.Supplier;

public interface Dryable
        extends Degradable<Dryable.DryLevel> {
    public static final Supplier<BiMap<Block, Block>> DRY_LEVEL_INCREASES = Suppliers.memoize(() -> ((ImmutableBiMap.Builder)
                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                                                                                                        ((ImmutableBiMap.Builder)
                                                                                                                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                                                                                                                        ((ImmutableBiMap.Builder)ImmutableBiMap.builder().put(ModBlocks.OUTSIDE_ASPHALT_WET_BLACK, ModBlocks.OUTSIDE_ASPHALT_BLACK))
                                                                                                                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_BLUE, ModBlocks.OUTSIDE_ASPHALT_BLUE))
                                                                                                                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_BROWN, ModBlocks.OUTSIDE_ASPHALT_BROWN))
                                                                                                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_CYAN, ModBlocks.OUTSIDE_ASPHALT_CYAN))
                                                                                                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_GRAY, ModBlocks.OUTSIDE_ASPHALT_GRAY))
                                                                                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_GREEN, ModBlocks.OUTSIDE_ASPHALT_GREEN))
                                                                                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_LIGHT_BLUE, ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE))
                                                                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_LIGHT_GRAY, ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY))
                                                                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_LIME, ModBlocks.OUTSIDE_ASPHALT_LIME))
                                                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_MAGENTA, ModBlocks.OUTSIDE_ASPHALT_MAGENTA))
                                                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_ORANGE, ModBlocks.OUTSIDE_ASPHALT_ORANGE))
                                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_PINK, ModBlocks.OUTSIDE_ASPHALT_PINK))
                                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_PURPLE, ModBlocks.OUTSIDE_ASPHALT_PURPLE))
                                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_RED, ModBlocks.OUTSIDE_ASPHALT_RED))
                                                                                                        .put(ModBlocks.OUTSIDE_ASPHALT_WET_WHITE, ModBlocks.OUTSIDE_ASPHALT_WHITE))
                                                                                                .put(ModBlocks.OUTSIDE_ASPHALT_WET_YELLOW, ModBlocks.OUTSIDE_ASPHALT_YELLOW)).build());


    public static Optional<Block> getIncreasedDryBlock(Block block) {
        return Optional.ofNullable((Block)DRY_LEVEL_INCREASES.get().get(block));
    }

    @Override
    default public Optional<BlockState> getDegradationResult(BlockState state) {
        return net.jephon.augmentatives.util.Dryable.getIncreasedDryBlock(state.getBlock()).map(block -> block.getStateWithProperties(state));
    }

    @Override
    default public float getDegradationChanceMultiplier() {
        if (this.getDegradationLevel() == net.jephon.augmentatives.util.Dryable.DryLevel.WET) {
            return 10.75f;
        }
        return 1.0f;
    }


    public static enum DryLevel implements StringIdentifiable
    {
        WET("wet"),
        DRY("dry");

        public static final Codec<net.jephon.augmentatives.util.Dryable.DryLevel> CODEC;
        private final String id;

        private DryLevel(String id) {
            this.id = id;
        }

        @Override
        public String asString() {
            return this.id;
        }

        static {
            CODEC = StringIdentifiable.createCodec(net.jephon.augmentatives.util.Dryable.DryLevel::values);
        }
    }
}

