package net.jephon.augmentatives.block.decor.traffic;

import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.util.MultiBlockProperties;
import net.jephon.augmentatives.util.MultiBlockUtil;
import net.jephon.augmentatives.util.TrafficLightColor;
import net.minecraft.block.*;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

import static net.jephon.augmentatives.util.TrafficLightColor.*;

public class StreetLightRedstoneBlock
        extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty POWERED = Properties.POWERED;
    public static final EnumProperty<MultiBlockUtil.MultiblockPart> PART = MultiBlockProperties.MULTIBLOCK_PART;
    public static final EnumProperty<TrafficLightColor> COLOR= EnumProperty.of("color", TrafficLightColor.class);


    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }
    public StreetLightRedstoneBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH).with(PART, MultiBlockUtil.MultiblockPart.HEAD).with(POWERED, false).with(COLOR, YELLOW));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(COLOR, FACING, PART, POWERED);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }
    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        if (mirror == BlockMirror.NONE) {
            return state;
        }
        return (BlockState)state.rotate(mirror.getRotation(state.get(FACING)));
    }


    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        if (blockPos.getY() < world.getTopY() - 1 && world.getBlockState(blockPos.up()).canReplace(ctx)) {
            return (BlockState)((BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing())).with(PART, MultiBlockUtil.MultiblockPart.BOTTOM).with(POWERED, false).with(COLOR, YELLOW);
        }
        return null;
    }
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (world.isClient()) return;
        Direction direction = placer == null ? Direction.NORTH : placer.getHorizontalFacing();
        world.setBlockState(pos, state.with(FACING, direction));
        placeAdditionalBlock(world, pos.offset(Direction.UP, 2), pos, direction, state, MultiBlockUtil.MultiblockPart.TOP);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (state.get(PART) == MultiBlockUtil.MultiblockPart.BOTTOM) {
            return blockState.isSideSolidFullSquare(world, blockPos, Direction.UP);
        }
        return blockState.isOf(this);
    }


    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {
            if (player.isCreative()) {
                StreetLightRedstoneBlock.onBreakInCreative(world, pos, state, player);
            } else {
                BlockPos blockPos;
                BlockState blockState;
                MultiBlockUtil.MultiblockPart multiblockPart = state.get(PART);
                if (multiblockPart == MultiBlockUtil.MultiblockPart.TOP && (blockState = world.getBlockState(blockPos = pos.offset(Direction.DOWN, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.BOTTOM) {
                    BlockState blockState2 = Blocks.AIR.getDefaultState();
                    world.setBlockState(blockPos, blockState2, Block.NOTIFY_LISTENERS | Block.SKIP_DROPS);
                    world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
                } else if (multiblockPart == MultiBlockUtil.MultiblockPart.BOTTOM && (blockState = world.getBlockState(blockPos = pos.offset(Direction.UP, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.TOP) {
                    BlockState blockState2 = Blocks.AIR.getDefaultState();
                    world.setBlockState(blockPos, blockState2, Block.NOTIFY_LISTENERS | Block.SKIP_DROPS);
                    world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
                }
            }
        }
        return super.onBreak(world, pos, state, player);
    }
    protected static void onBreakInCreative(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockPos blockPos;
        BlockState blockState;
        MultiBlockUtil.MultiblockPart multiblockPart = state.get(PART);
        if (multiblockPart == MultiBlockUtil.MultiblockPart.TOP && (blockState = world.getBlockState(blockPos = pos.offset(Direction.DOWN, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.BOTTOM) {
            BlockState blockState2 = Blocks.AIR.getDefaultState();
            world.setBlockState(blockPos, blockState2, Block.NOTIFY_LISTENERS | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
        } else if (multiblockPart == MultiBlockUtil.MultiblockPart.BOTTOM && (blockState = world.getBlockState(blockPos = pos.offset(Direction.UP, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.TOP) {
            BlockState blockState2 = Blocks.AIR.getDefaultState();
            world.setBlockState(blockPos, blockState2, Block.NOTIFY_LISTENERS | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
        }
    }
    private void placeAdditionalBlock(World world, BlockPos pos, BlockPos originPos, Direction direction, BlockState state, MultiBlockUtil.MultiblockPart part) {
        world.setBlockState(pos, ModBlocks.OUTSIDE_STREETLIGHT_REDSTONE.getDefaultState().with(PART, part).with(FACING, direction));
        world.updateNeighbors(pos, Blocks.AIR);
        state.updateNeighbors(world, pos, Block.NOTIFY_LISTENERS);
    }
    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        Direction direction = state.get(FACING);
        MultiBlockUtil.MultiblockPart multiblockPart = state.get(PART);
        if (world.isClient) {
            return;
        }
        boolean bl = state.get(POWERED);
        if (bl != world.isReceivingRedstonePower(pos)) {
            if (bl) {
                world.scheduleBlockTick(pos, this, 4);
                world.setBlockState(pos, (BlockState)state.cycle(POWERED), Block.NOTIFY_LISTENERS);
            } else {
                if (multiblockPart == MultiBlockUtil.MultiblockPart.BOTTOM) {
                    world.setBlockState(pos, (BlockState) state.cycle(COLOR).with(POWERED, true), Block.NOTIFY_LISTENERS);
                    world.setBlockState(pos.offset(Direction.UP, 2), (BlockState)state.cycle(COLOR).with(PART, MultiBlockUtil.MultiblockPart.TOP).with(FACING, direction), Block.NOTIFY_LISTENERS);
                }
            }
        }
    }
    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.isReceivingRedstonePower(pos)) {
            world.setBlockState(pos, (BlockState)state.cycle(POWERED), Block.NOTIFY_LISTENERS);
            ParticleUtil.spawnParticle(state.get(FACING).getAxis(), world, pos, 0.125, ParticleTypes.ELECTRIC_SPARK, UniformIntProvider.create(1, 2));
        }
    }
    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        if (state.get(COLOR) == RED && state.get(POWERED)) {
            return 1;
        } else if (state.get(COLOR) == YELLOW  && state.get(POWERED)) {
            return 8;
        } else if (state.get(COLOR) == GREEN  && state.get(POWERED)) {
            return 15;
        }
        return 0;
    }
        @Override
    public long getRenderingSeed(BlockState state, BlockPos pos) {
        return MathHelper.hashCode(pos.getX(), pos.down(state.get(PART) == MultiBlockUtil.MultiblockPart.BOTTOM ? 0 : 1).getY(), pos.getZ());
    }
    protected static final VoxelShape SHAPE_TOP = Stream.of(
            Block.createCuboidShape(6, -16, 6, 10, -1, 10),
            Block.createCuboidShape(6, 11, 6, 10, 23, 10),
            Block.createCuboidShape(6, 21, 6, 10, 25, 10),
            Block.createCuboidShape(6, -1, 6, 10, 11, 10),
            Block.createCuboidShape(5, 20, 5, 11, 24, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    protected static final VoxelShape SHAPE_BOTTOM = Stream.of(
            Block.createCuboidShape(4, 10, 4, 12, 20, 12),
            Block.createCuboidShape(2, 8, 2, 14, 10, 14),
            Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(PART)) {
            case TOP: {
                return SHAPE_TOP;
            }
            case BOTTOM: {
                return SHAPE_BOTTOM;
            }
        }
        return SHAPE_BOTTOM;
    }
}