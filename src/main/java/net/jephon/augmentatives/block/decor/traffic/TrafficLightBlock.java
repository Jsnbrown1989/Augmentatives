package net.jephon.augmentatives.block.decor.traffic;

import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.util.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;


public class TrafficLightBlock
        extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty POWERED = Properties.POWERED;
    public static final EnumProperty<MultiBlockUtil.MultiblockPart> PART = MultiBlockProperties.MULTIBLOCK_PART;
    public static final EnumProperty<TrafficLightColor> COLOR= EnumProperty.of("color", TrafficLightColor.class);


    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }
    public TrafficLightBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH).with(PART, MultiBlockUtil.MultiblockPart.HEAD).with(POWERED, false).with(COLOR, TrafficLightColor.YELLOW));
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
            return (BlockState)((BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing())).with(PART, MultiBlockUtil.MultiblockPart.BOTTOM).with(POWERED, false).with(COLOR, TrafficLightColor.YELLOW);
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
                TrafficLightBlock.onBreakInCreative(world, pos, state, player);
            } else {
                BlockPos blockPos;
                BlockState blockState;
                MultiBlockUtil.MultiblockPart multiblockPart = state.get(PART);
                if (multiblockPart == MultiBlockUtil.MultiblockPart.TOP && (blockState = world.getBlockState(blockPos = pos.offset(Direction.DOWN, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.BOTTOM) {
                    BlockState blockState2 = Blocks.AIR.getDefaultState();
                    world.setBlockState(blockPos, blockState2, Block.NOTIFY_ALL | Block.SKIP_DROPS);
                    world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
                } else if (multiblockPart == MultiBlockUtil.MultiblockPart.BOTTOM && (blockState = world.getBlockState(blockPos = pos.offset(Direction.UP, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.TOP) {
                    BlockState blockState2 = Blocks.AIR.getDefaultState();
                    world.setBlockState(blockPos, blockState2, Block.NOTIFY_ALL | Block.SKIP_DROPS);
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
            world.setBlockState(blockPos, blockState2, Block.NOTIFY_ALL | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
        } else if (multiblockPart == MultiBlockUtil.MultiblockPart.BOTTOM && (blockState = world.getBlockState(blockPos = pos.offset(Direction.UP, 2))).isOf(state.getBlock()) && blockState.get(PART) == MultiBlockUtil.MultiblockPart.TOP) {
            BlockState blockState2 = Blocks.AIR.getDefaultState();
            world.setBlockState(blockPos, blockState2, Block.NOTIFY_ALL | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
        }
    }

    private void placeAdditionalBlock(World world, BlockPos pos, BlockPos originPos, Direction direction, BlockState state, MultiBlockUtil.MultiblockPart part) {
        world.setBlockState(pos, ModBlocks.OUTSIDE_SIGN_TRAFFIC_LIGHT.getDefaultState().with(PART, part).with(FACING, direction));
        world.updateNeighbors(pos, Blocks.AIR);
        state.updateNeighbors(world, pos, Block.NOTIFY_ALL);
    }


    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld)world;
            this.update(state, serverWorld, pos);
        }
    }

    public void update(BlockState state, ServerWorld world, BlockPos pos) {
        boolean bl = world.isReceivingRedstonePower(pos);
        if (bl == state.get(POWERED)) {
            return;
        }
        BlockState blockState = state;
        if (!state.get(POWERED).booleanValue()) {
            world.playSound(null, pos, (blockState = (BlockState)blockState.cycle(COLOR)).get(POWERED) != false ? SoundEvents.BLOCK_COPPER_BULB_TURN_ON : SoundEvents.BLOCK_COPPER_BULB_TURN_OFF, SoundCategory.BLOCKS);
        }
        world.setBlockState(pos, (BlockState)state.cycle(COLOR), Block.NOTIFY_ALL);
        }

        @Override
    public long getRenderingSeed(BlockState state, BlockPos pos) {
        return MathHelper.hashCode(pos.getX(), pos.down(state.get(PART) == MultiBlockUtil.MultiblockPart.BOTTOM ? 0 : 1).getY(), pos.getZ());
    }
}