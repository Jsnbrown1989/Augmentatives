package net.jephon.augmentatives.block.decor.furniture.outside;
import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.util.ModBlockTags;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.LeadItem;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.stream.Stream;

public class GuardRailBlock
        extends HorizontalConnectingBlock {
    public static final MapCodec<GuardRailBlock> CODEC = GuardRailBlock.createCodec(GuardRailBlock::new);
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    private final VoxelShape[] cullingShapes;

    public MapCodec<GuardRailBlock> getCodec() {
        return CODEC;
    }

    public GuardRailBlock(AbstractBlock.Settings settings) {
        super(2.0f, 2.0f, 16.0f, 16.0f, 24.0f, settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH).with(NORTH, false)).with(EAST, false)).with(SOUTH, false)).with(WEST, false)));
        this.cullingShapes = this.createShapes(2.0f, 1.0f, 16.0f, 6.0f, 15.0f);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return this.cullingShapes[this.getShapeIndex(state)];
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getOutlineShape(state, world, pos, context);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public boolean canConnect(BlockState state, boolean neighborIsFullSquare, Direction dir) {
        Block block = state.getBlock();
        boolean bl = this.canConnectToGuardRail(state);
        boolean bl2 = block instanceof GuardRailBlock;
        return !GuardRailBlock.cannotConnect(state) && neighborIsFullSquare || bl || bl2;
    }

    private boolean canConnectToGuardRail(BlockState state) {
        return state.isIn(ModBlockTags.GUARDRAILS) == this.getDefaultState().isIn(ModBlockTags.GUARDRAILS);
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World blockView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        BlockPos blockPos2 = blockPos.north();
        BlockPos blockPos3 = blockPos.east();
        BlockPos blockPos4 = blockPos.south();
        BlockPos blockPos5 = blockPos.west();
        BlockState blockState = blockView.getBlockState(blockPos2);
        BlockState blockState2 = blockView.getBlockState(blockPos3);
        BlockState blockState3 = blockView.getBlockState(blockPos4);
        BlockState blockState4 = blockView.getBlockState(blockPos5);

        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)super.getPlacementState(ctx).with(NORTH, this.canConnect(blockState, blockState.isSideSolidFullSquare(blockView, blockPos2, Direction.SOUTH), Direction.SOUTH))).with(EAST, this.canConnect(blockState2, blockState2.isSideSolidFullSquare(blockView, blockPos3, Direction.WEST), Direction.WEST))).with(SOUTH, this.canConnect(blockState3, blockState3.isSideSolidFullSquare(blockView, blockPos4, Direction.NORTH), Direction.NORTH))).with(WEST, this.canConnect(blockState4, blockState4.isSideSolidFullSquare(blockView, blockPos5, Direction.EAST), Direction.EAST))).with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, false);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED).booleanValue()) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        if (direction.getAxis().getType() == Direction.Type.HORIZONTAL) {
            return (BlockState)state.with((Property)FACING_PROPERTIES.get(direction), this.canConnect(neighborState, neighborState.isSideSolidFullSquare(world, neighborPos, direction.getOpposite()), direction.getOpposite()));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    protected static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(6, 11, 6, 10, 23, 10),
            Block.createCuboidShape(6, 0, 6, 10, 11, 10),
            Block.createCuboidShape(5, 20, 5, 11, 24, 11),
            Block.createCuboidShape(6, 21, 6, 10, 25, 10),
            Block.createCuboidShape(7, 14, 3, 9, 16, 11),
            Block.createCuboidShape(7, 10, 3, 9, 12, 11),
            Block.createCuboidShape(8, 9, 4, 24, 17, 6),
            Block.createCuboidShape(-8, 9, 4, 8, 17, 6),
            Block.createCuboidShape(-8, 17, 3, 8, 19, 7),
            Block.createCuboidShape(8, 17, 3, 24, 19, 7),
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(2, 4, 2, 14, 6, 14),
            Block.createCuboidShape(-8, 7, 3, 8, 9, 7),
            Block.createCuboidShape(8, 7, 3, 24, 9, 7)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(6, 11, 6, 10, 23, 10),
            Block.createCuboidShape(6, 0, 6, 10, 11, 10),
            Block.createCuboidShape(5, 20, 5, 11, 24, 11),
            Block.createCuboidShape(6, 21, 6, 10, 25, 10),
            Block.createCuboidShape(7, 14, 5, 9, 16, 13),
            Block.createCuboidShape(7, 10, 5, 9, 12, 13),
            Block.createCuboidShape(-8, 9, 10, 8, 17, 12),
            Block.createCuboidShape(8, 9, 10, 24, 17, 12),
            Block.createCuboidShape(8, 17, 9, 24, 19, 13),
            Block.createCuboidShape(-8, 17, 9, 8, 19, 13),
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(2, 4, 2, 14, 6, 14),
            Block.createCuboidShape(8, 7, 9, 24, 9, 13),
            Block.createCuboidShape(-8, 7, 9, 8, 9, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(6, 11, 6, 10, 23, 10),
            Block.createCuboidShape(6, 0, 6, 10, 11, 10),
            Block.createCuboidShape(5, 20, 5, 11, 24, 11),
            Block.createCuboidShape(6, 21, 6, 10, 25, 10),
            Block.createCuboidShape(3, 14, 7, 11, 16, 9),
            Block.createCuboidShape(3, 10, 7, 11, 12, 9),
            Block.createCuboidShape(4, 9, -8, 6, 17, 8),
            Block.createCuboidShape(4, 9, 8, 6, 17, 24),
            Block.createCuboidShape(3, 17, 8, 7, 19, 24),
            Block.createCuboidShape(3, 17, -8, 7, 19, 8),
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(2, 4, 2, 14, 6, 14),
            Block.createCuboidShape(3, 7, 8, 7, 9, 24),
            Block.createCuboidShape(3, 7, -8, 7, 9, 8)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(6, 11, 6, 10, 23, 10),
            Block.createCuboidShape(6, 0, 6, 10, 11, 10),
            Block.createCuboidShape(5, 20, 5, 11, 24, 11),
            Block.createCuboidShape(6, 21, 6, 10, 25, 10),
            Block.createCuboidShape(5, 14, 7, 13, 16, 9),
            Block.createCuboidShape(5, 10, 7, 13, 12, 9),
            Block.createCuboidShape(10, 9, 8, 12, 17, 24),
            Block.createCuboidShape(10, 9, -8, 12, 17, 8),
            Block.createCuboidShape(9, 17, -8, 13, 19, 8),
            Block.createCuboidShape(9, 17, 8, 13, 19, 24),
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(2, 4, 2, 14, 6, 14),
            Block.createCuboidShape(9, 7, -8, 13, 9, 8),
            Block.createCuboidShape(9, 7, 8, 13, 9, 24)
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
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, NORTH, EAST, WEST, SOUTH, WATERLOGGED);
    }
}

