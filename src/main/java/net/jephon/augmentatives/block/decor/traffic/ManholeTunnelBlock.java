package net.jephon.augmentatives.block.decor.traffic;

import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.util.*;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

import static net.jephon.augmentatives.util.OpenPosition.OPEN;


public class ManholeTunnelBlock
        extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<OpenPosition> POSITION = EnumProperty.of("position", OpenPosition.class);


    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    public ManholeTunnelBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(FACING, Direction.NORTH).with(POSITION, OPEN));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        boolean SneakingEmptyHand = player.getStackInHand(hand).isEmpty() && !player.isSneaking();
        if (SneakingEmptyHand) {
            return ActionResult.PASS;
        }
        world.setBlockState(pos, (BlockState) state.cycle(POSITION), Block.NOTIFY_ALL);
        return ActionResult.success(world.isClient);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState) state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        if (mirror == BlockMirror.NONE) {
            return state;
        }
        return (BlockState) state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, POSITION);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        if (blockPos.getY() < world.getTopY() - 1 && world.getBlockState(blockPos.up()).canReplace(ctx)) {
            return (BlockState) ((BlockState) this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing())).with(POSITION, OPEN);
        }
        return null;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (world.isClient()) return;
        Direction direction = placer == null ? Direction.NORTH : placer.getHorizontalFacing();
        world.setBlockState(pos, state.with(FACING, direction));
    }


    protected static final VoxelShape SHAPE_OPEN_SOUTH = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 1, 1, 16, 15),
            Block.createCuboidShape(15, 0, 1, 16, 16, 15),
            Block.createCuboidShape(3, 0, 2, 5, 2, 14),
            Block.createCuboidShape(1, 0, 2, 3, 2, 4),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(3, 8, 2, 5, 10, 14),
            Block.createCuboidShape(1, 8, 2, 3, 10, 4),
            Block.createCuboidShape(1, 8, 12, 3, 10, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_OPEN_NORTH = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 1, 1, 16, 15),
            Block.createCuboidShape(15, 0, 1, 16, 16, 15),
            Block.createCuboidShape(3, 0, 2, 5, 2, 14),
            Block.createCuboidShape(1, 0, 2, 3, 2, 4),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(3, 8, 2, 5, 10, 14),
            Block.createCuboidShape(1, 8, 2, 3, 10, 4),
            Block.createCuboidShape(1, 8, 12, 3, 10, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_OPEN_EAST = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 1, 1, 16, 15),
            Block.createCuboidShape(15, 0, 1, 16, 16, 15),
            Block.createCuboidShape(3, 0, 2, 5, 2, 14),
            Block.createCuboidShape(1, 0, 2, 3, 2, 4),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(3, 8, 2, 5, 10, 14),
            Block.createCuboidShape(1, 8, 2, 3, 10, 4),
            Block.createCuboidShape(1, 8, 12, 3, 10, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_OPEN_WEST = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 1, 1, 16, 15),
            Block.createCuboidShape(15, 0, 1, 16, 16, 15),
            Block.createCuboidShape(3, 0, 2, 5, 2, 14),
            Block.createCuboidShape(1, 0, 2, 3, 2, 4),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(3, 8, 2, 5, 10, 14),
            Block.createCuboidShape(1, 8, 2, 3, 10, 4),
            Block.createCuboidShape(1, 8, 12, 3, 10, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_CLOSED_SOUTH = Stream.of(
            Block.createCuboidShape(0, 0, 0, 1, 16, 16),
            Block.createCuboidShape(15, 0, 0, 16, 16, 16),
            Block.createCuboidShape(1, 0, 15, 15, 16, 16),
            Block.createCuboidShape(1, 0, 0, 15, 16, 1),
            Block.createCuboidShape(2, 0, 11, 14, 2, 13),
            Block.createCuboidShape(2, 0, 13, 4, 2, 15),
            Block.createCuboidShape(12, 0, 13, 14, 2, 15),
            Block.createCuboidShape(2, 8, 11, 14, 10, 13),
            Block.createCuboidShape(2, 8, 13, 4, 10, 15),
            Block.createCuboidShape(12, 8, 13, 14, 10, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_CLOSED_NORTH = Stream.of(
            Block.createCuboidShape(15, 0, 0, 16, 16, 16),
            Block.createCuboidShape(0, 0, 0, 1, 16, 16),
            Block.createCuboidShape(1, 0, 0, 15, 16, 1),
            Block.createCuboidShape(1, 0, 15, 15, 16, 16),
            Block.createCuboidShape(2, 0, 3, 14, 2, 5),
            Block.createCuboidShape(12, 0, 1, 14, 2, 3),
            Block.createCuboidShape(2, 0, 1, 4, 2, 3),
            Block.createCuboidShape(2, 8, 3, 14, 10, 5),
            Block.createCuboidShape(12, 8, 1, 14, 10, 3),
            Block.createCuboidShape(2, 8, 1, 4, 10, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_CLOSED_WEST = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 1, 1, 16, 15),
            Block.createCuboidShape(3, 0, 2, 5, 2, 14),
            Block.createCuboidShape(1, 0, 2, 3, 2, 4),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(3, 8, 2, 5, 10, 14),
            Block.createCuboidShape(1, 8, 2, 3, 10, 4),
            Block.createCuboidShape(1, 8, 12, 3, 10, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected static final VoxelShape SHAPE_CLOSED_EAST = Stream.of(
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(15, 0, 1, 16, 16, 15),
            Block.createCuboidShape(0, 0, 1, 1, 16, 15),
            Block.createCuboidShape(11, 0, 2, 13, 2, 14),
            Block.createCuboidShape(13, 0, 12, 15, 2, 14),
            Block.createCuboidShape(13, 0, 2, 15, 2, 4),
            Block.createCuboidShape(11, 8, 2, 13, 10, 14),
            Block.createCuboidShape(13, 8, 12, 15, 10, 14),
            Block.createCuboidShape(13, 8, 2, 15, 10, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(POSITION)) {
            case OPEN: {
                switch (state.get(FACING)) {
                    case NORTH: {
                        return SHAPE_OPEN_NORTH;
                    }
                    case SOUTH: {
                        return SHAPE_OPEN_SOUTH;
                    }
                    case EAST: {
                        return SHAPE_OPEN_EAST;
                    }
                    case WEST: {
                        return SHAPE_OPEN_WEST;
                    }
                }
            }
            case CLOSED: {
                switch (state.get(FACING)) {
                    case NORTH: {
                        return SHAPE_CLOSED_NORTH;
                    }
                    case SOUTH: {
                        return SHAPE_CLOSED_SOUTH;
                    }
                    case EAST: {
                        return SHAPE_CLOSED_EAST;
                    }
                    case WEST: {
                        return SHAPE_CLOSED_WEST;
                    }
                }
            }
        }
        return SHAPE_CLOSED_NORTH;
    }
}
