package net.jephon.augmentatives.block.cobbled.decor;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class PokeMartHorizonalSign
        extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }
    public PokeMartHorizonalSign(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    protected static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(-2, 8, 10, 18, 26, 16),
            Block.createCuboidShape(-8, 0, 6, 8, 4, 16),
            Block.createCuboidShape(8, 0, 6, 24, 4, 16),
            Block.createCuboidShape(-5, 4, 8, 21, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 8, -2, 6, 26, 18),
            Block.createCuboidShape(0, 0, 8, 10, 4, 24),
            Block.createCuboidShape(0, 0, -8, 10, 4, 8),
            Block.createCuboidShape(0, 4, -5, 8, 8, 21)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(10, 8, -2, 16, 26, 18),
            Block.createCuboidShape(6, 0, 8, 16, 4, 24),
            Block.createCuboidShape(6, 0, -8, 16, 4, 8),
            Block.createCuboidShape(8, 4, -5, 16, 8, 21)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(-2, 8, 0, 18, 26, 6),
            Block.createCuboidShape(-8, 0, 0, 8, 4, 10),
            Block.createCuboidShape(8, 0, 0, 24, 4, 10),
            Block.createCuboidShape(-5, 4, 0, 21, 8, 8)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH: {
                return SHAPE_N;
            }
            case SOUTH: {
                return SHAPE_S;
            }
            case WEST: {
                return SHAPE_W;
            }
            case EAST: {
                return SHAPE_E;
            }
        }
        return SHAPE_N;
    }
}


