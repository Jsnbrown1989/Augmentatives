package net.jephon.augmentatives.block.decor.furniture.kitchen;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class CounterBlock
    extends Block
    implements Waterloggable {
        public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
        public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
        @Override
        protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
            return null;
        }
        public CounterBlock(AbstractBlock.Settings settings) {
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
            Block.createCuboidShape(0, 0, 0, 16, 13, 14),
            Block.createCuboidShape(0, 13, 0, 16, 16, 16),
            Block.createCuboidShape(0, 13, 14, 16, 16, 16),
            Block.createCuboidShape(0, 16, 0, 16, 18, 2),
            Block.createCuboidShape(0, 0, 14, 16, 2, 15),
            Block.createCuboidShape(9, 3, 14, 14, 12, 15),
            Block.createCuboidShape(2, 3, 14, 7, 12, 15),
            Block.createCuboidShape(5, 9, 15, 6, 11, 16),
            Block.createCuboidShape(10, 9, 15, 11, 11, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 0, 0, 14, 13, 16),
            Block.createCuboidShape(0, 13, 0, 16, 16, 16),
            Block.createCuboidShape(14, 13, 0, 16, 16, 16),
            Block.createCuboidShape(0, 16, 0, 2, 18, 16),
            Block.createCuboidShape(14, 0, 0, 15, 2, 16),
            Block.createCuboidShape(14, 3, 2, 15, 12, 7),
            Block.createCuboidShape(14, 3, 9, 15, 12, 14),
            Block.createCuboidShape(15, 9, 10, 16, 11, 11),
            Block.createCuboidShape(15, 9, 5, 16, 11, 6)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 0, 2, 16, 13, 16),
            Block.createCuboidShape(0, 13, 0, 16, 16, 16),
            Block.createCuboidShape(0, 13, 0, 16, 16, 2),
            Block.createCuboidShape(0, 16, 14, 16, 18, 16),
            Block.createCuboidShape(0, 0, 1, 16, 2, 2),
            Block.createCuboidShape(2, 3, 1, 7, 12, 2),
            Block.createCuboidShape(9, 3, 1, 14, 12, 2),
            Block.createCuboidShape(10, 9, 0, 11, 11, 1),
            Block.createCuboidShape(5, 9, 0, 6, 11, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(2, 0, 0, 16, 13, 16),
            Block.createCuboidShape(0, 13, 0, 16, 16, 16),
            Block.createCuboidShape(0, 13, 0, 2, 16, 16),
            Block.createCuboidShape(14, 16, 0, 16, 18, 16),
            Block.createCuboidShape(1, 0, 0, 2, 2, 16),
            Block.createCuboidShape(1, 3, 9, 2, 12, 14),
            Block.createCuboidShape(1, 3, 2, 2, 12, 7),
            Block.createCuboidShape(0, 9, 5, 1, 11, 6),
            Block.createCuboidShape(0, 9, 10, 1, 11, 11)
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


