package net.jephon.augmentatives.customblock.decorations.furniture.outside.bench;


import net.jephon.augmentatives.customblock.decorations.furniture.core.BenchBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class BenchWithBack extends BenchBlock {

    public BenchWithBack(Properties builder) {
        super(builder);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 12, 2, 8, 14),
            Block.makeCuboidShape(14, 0, 1, 16, 8, 3),
            Block.makeCuboidShape(0, 0, 1, 2, 8, 3),
            Block.makeCuboidShape(14, 0, 12, 16, 8, 14),
            Block.makeCuboidShape(2, 3, 2, 14, 4, 3),
            Block.makeCuboidShape(2, 7, 2, 14, 8, 3),
            Block.makeCuboidShape(2, 3, 12, 14, 4, 13),
            Block.makeCuboidShape(2, 7, 13, 14, 8, 14),
            Block.makeCuboidShape(14, 3, 3, 15, 4, 12),
            Block.makeCuboidShape(15, 7, 3, 16, 8, 12),
            Block.makeCuboidShape(0, 7, 3, 1, 8, 12),
            Block.makeCuboidShape(0, 8, 5, 16, 9, 10),
            Block.makeCuboidShape(0, 8, -1, 16, 9, 4),
            Block.makeCuboidShape(0, 8, 11, 16, 9, 16),
            Block.makeCuboidShape(1, 3, 3, 2, 4, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(12, 0, 14, 14, 8, 16),
            Block.makeCuboidShape(1, 0, 0, 3, 8, 2),
            Block.makeCuboidShape(1, 0, 14, 3, 8, 16),
            Block.makeCuboidShape(12, 0, 0, 14, 8, 2),
            Block.makeCuboidShape(2, 3, 2, 3, 4, 14),
            Block.makeCuboidShape(2, 7, 2, 3, 8, 14),
            Block.makeCuboidShape(12, 3, 2, 13, 4, 14),
            Block.makeCuboidShape(13, 7, 2, 14, 8, 14),
            Block.makeCuboidShape(3, 3, 1, 12, 4, 2),
            Block.makeCuboidShape(3, 7, 0, 12, 8, 1),
            Block.makeCuboidShape(3, 7, 15, 12, 8, 16),
            Block.makeCuboidShape(5, 8, 0, 10, 9, 16),
            Block.makeCuboidShape(-1, 8, 0, 4, 9, 16),
            Block.makeCuboidShape(11, 8, 0, 16, 9, 16),
            Block.makeCuboidShape(3, 3, 14, 12, 4, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 12, 2, 8, 14),
            Block.makeCuboidShape(14, 0, 1, 16, 8, 3),
            Block.makeCuboidShape(0, 0, 1, 2, 8, 3),
            Block.makeCuboidShape(14, 0, 12, 16, 8, 14),
            Block.makeCuboidShape(2, 3, 2, 14, 4, 3),
            Block.makeCuboidShape(2, 7, 2, 14, 8, 3),
            Block.makeCuboidShape(2, 3, 12, 14, 4, 13),
            Block.makeCuboidShape(2, 7, 13, 14, 8, 14),
            Block.makeCuboidShape(14, 3, 3, 15, 4, 12),
            Block.makeCuboidShape(15, 7, 3, 16, 8, 12),
            Block.makeCuboidShape(0, 7, 3, 1, 8, 12),
            Block.makeCuboidShape(0, 8, 5, 16, 9, 10),
            Block.makeCuboidShape(0, 8, -1, 16, 9, 4),
            Block.makeCuboidShape(0, 8, 11, 16, 9, 16),
            Block.makeCuboidShape(1, 3, 3, 2, 4, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(12, 0, 14, 14, 8, 16),
            Block.makeCuboidShape(1, 0, 0, 3, 8, 2),
            Block.makeCuboidShape(1, 0, 14, 3, 8, 16),
            Block.makeCuboidShape(12, 0, 0, 14, 8, 2),
            Block.makeCuboidShape(2, 3, 2, 3, 4, 14),
            Block.makeCuboidShape(2, 7, 2, 3, 8, 14),
            Block.makeCuboidShape(12, 3, 2, 13, 4, 14),
            Block.makeCuboidShape(13, 7, 2, 14, 8, 14),
            Block.makeCuboidShape(3, 3, 1, 12, 4, 2),
            Block.makeCuboidShape(3, 7, 0, 12, 8, 1),
            Block.makeCuboidShape(3, 7, 15, 12, 8, 16),
            Block.makeCuboidShape(5, 8, 0, 10, 9, 16),
            Block.makeCuboidShape(-1, 8, 0, 4, 9, 16),
            Block.makeCuboidShape(11, 8, 0, 16, 9, 16),
            Block.makeCuboidShape(3, 3, 14, 12, 4, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(HORIZONTAL_FACING)) {
            case NORTH: return SHAPE_N;
            case SOUTH: return SHAPE_S;
            case EAST: return SHAPE_E;
            case WEST: return SHAPE_W;
            default: return SHAPE_N;
        }
    }

}
