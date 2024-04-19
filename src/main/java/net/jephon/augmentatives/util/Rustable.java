package net.jephon.augmentatives.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Degradable;
import net.minecraft.util.StringIdentifiable;

    public interface Rustable
            extends Degradable<Rustable.RustLevel> {
        public static final Supplier<BiMap<Block, Block>> RUST_LEVEL_INCREASES = Suppliers.memoize(() ->    ((ImmutableBiMap.Builder)
                                                                                                                ((ImmutableBiMap.Builder)
                                                                                                                            ((ImmutableBiMap.Builder)ImmutableBiMap.builder()
                                                                                                                                    .put(ModBlocks.BUILDING_CAST_IRON_BLOCK, ModBlocks.BUILDING_CAST_IRON_BLOCK_EXPOSED))
                                                                                                                            .put(ModBlocks.BUILDING_CAST_IRON_BLOCK_EXPOSED, ModBlocks.BUILDING_CAST_IRON_BLOCK_WEATHERED))
                                                                                                                    .put(ModBlocks.BUILDING_CAST_IRON_BLOCK_WEATHERED, ModBlocks.BUILDING_CAST_IRON_BLOCK_RUSTED)).build());
        public static final Supplier<BiMap<Block, Block>> RUST_LEVEL_DECREASES = Suppliers.memoize(() -> RUST_LEVEL_INCREASES.get().inverse());

        public static Optional<Block> getDecreasedRustedBlock(Block block) {
            return Optional.ofNullable((Block)RUST_LEVEL_DECREASES.get().get(block));
        }

        public static Block getUnaffectedRustedBlock(Block block) {
            Block block2 = block;
            Block block3 = (Block)RUST_LEVEL_DECREASES.get().get(block2);
            while (block3 != null) {
                block2 = block3;
                block3 = (Block)RUST_LEVEL_DECREASES.get().get(block2);
            }
            return block2;
        }

        public static Optional<BlockState> getDecreasedRustedState(BlockState state) {
            return net.jephon.augmentatives.util.Rustable.getDecreasedRustedBlock(state.getBlock()).map(block -> block.getStateWithProperties(state));
        }

        public static Optional<Block> getIncreasedRustedBlock(Block block) {
            return Optional.ofNullable((Block)RUST_LEVEL_INCREASES.get().get(block));
        }

        public static BlockState getUnaffectedRustedState(BlockState state) {
            return net.jephon.augmentatives.util.Rustable.getUnaffectedRustedBlock(state.getBlock()).getStateWithProperties(state);
        }

        @Override
        default public Optional<BlockState> getDegradationResult(BlockState state) {
            return net.jephon.augmentatives.util.Rustable.getIncreasedRustedBlock(state.getBlock()).map(block -> block.getStateWithProperties(state));
        }

        @Override
        default public float getDegradationChanceMultiplier() {
            if (this.getDegradationLevel() == net.jephon.augmentatives.util.Rustable.RustLevel.UNAFFECTED) {
                return 0.75f;
            }
            return 1.0f;
        }

        public static enum RustLevel implements StringIdentifiable
        {
            UNAFFECTED("unaffected"),
            EXPOSED("exposed"),
            WEATHERED("weathered"),
            RUSTED("rusted");

            public static final Codec<net.jephon.augmentatives.util.Rustable.RustLevel> CODEC;
            private final String id;

            private RustLevel(String id) {
                this.id = id;
            }

            @Override
            public String asString() {
                return this.id;
            }

            static {
                CODEC = StringIdentifiable.createCodec(net.jephon.augmentatives.util.Rustable.RustLevel::values);
            }
        }
    }
