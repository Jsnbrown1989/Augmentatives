package net.jephon.augmentatives.util;

    import net.jephon.augmentatives.block.ModBlocks;
    import net.jephon.augmentatives.util.helper.MultiBlock;
    import net.minecraft.block.BlockState;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

    public class MultiBlockUtil {
        public static final List<Direction> HORIZONTAL_DIRECTIONS = Arrays.stream(Direction.values())
                .filter(direction -> direction.getAxis().isHorizontal()).toList();

        private MultiBlockUtil() {
        }

        public enum MultiBlockType implements StringIdentifiable {
            OUTSIDE_STREETLIGHT("outside_streetlight"), OUTSIDE_STOPSIGN("outside_stopsign");

            private final String id;

            MultiBlockType(String identifier) {
                this.id = identifier;
            }

            public static Optional<MultiBlockType> getType(World world, BlockPos blockPos) {
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.isOf(ModBlocks.OUTSIDE_STREETLIGHT)) return Optional.of(OUTSIDE_STREETLIGHT);
                else if (blockState.isOf(ModBlocks.OUTSIDE_STOPSIGN)) return Optional.of(OUTSIDE_STOPSIGN);
                return Optional.empty();
            }

            @Override
            public String asString() {
                return this.id;
            }
        }

        public enum MultiblockPart implements MultiBlock, StringIdentifiable {
            BOTTOM("bottom"), HEAD("head"), MID("mid"), TOP("top");
            private final String id;

            MultiblockPart(String name) {
                this.id = name;
            }

            @Override
            public boolean isOrigin() {
                return this.equals(HEAD);
            }

            @Override
            public Optional<BlockPos> getOrigin(World world, BlockPos blockPos) {
                return switch (this) {
                    case TOP -> Optional.of(blockPos.down(2));
                    case MID -> Optional.of(blockPos.down());
                    case HEAD -> Optional.of(blockPos);
                    default -> {
                        for (Direction direction : HORIZONTAL_DIRECTIONS) {
                            if (world.getBlockState(blockPos.offset(direction)).isOf(ModBlocks.OUTSIDE_STREETLIGHT)) {
                                yield Optional.of(blockPos.offset(direction));
                            }
                        }
                        yield Optional.empty();
                    }
                };
            }

            public Optional<BlockPos> getPartPosition(World world, BlockPos originPosition, MultiblockPart part) {
                return switch (part) {
                    case TOP -> Optional.of(originPosition.offset(Direction.UP, 2));
                    case MID -> Optional.of(originPosition.offset(Direction.UP));
                    case HEAD -> Optional.of(originPosition);
                    case BOTTOM -> {
                        if (getDirection(world, originPosition).isEmpty()) yield Optional.empty();
                        else {
                            yield Optional.of(originPosition.offset(getDirection(world, originPosition).get()));
                        }
                    }
                };
            }

            @Override
            public Optional<Direction> getDirection(World world, BlockPos blockPos) {
                if (!world.getBlockState(blockPos).isOf(ModBlocks.OUTSIDE_STREETLIGHT)) return Optional.empty();
                if (getOrigin(world, blockPos).isEmpty()) return Optional.empty();
                BlockPos originBlockPos = getOrigin(world, blockPos).get();
                for (Direction direction : HORIZONTAL_DIRECTIONS) {
                    if (world.getBlockState(originBlockPos.offset(direction)).isOf(ModBlocks.OUTSIDE_STREETLIGHT)) {
                        return Optional.of(direction);
                    }
                }
                return Optional.empty();
            }

            @Override
            public String asString() {
                return this.id;
            }

            public static Optional<MultiblockPart> fromString(String identifier) {
                for (MultiblockPart part : MultiblockPart.values()) {
                    if (identifier.equals(part.asString())) {
                        return Optional.of(part);
                    }
                }
                return Optional.empty();
            }
        }
    }
