package net.jephon.augmentatives.block.organic.decor;

import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.block.common.AugVerticalConnectingBlock;
import net.jephon.augmentatives.util.ModBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class AugPillarBlock
        extends AugVerticalConnectingBlock {
    public static final MapCodec<AugPillarBlock> CODEC = AugPillarBlock.createCodec(AugPillarBlock::new);


    public MapCodec<AugPillarBlock> getCodec() {
        return CODEC;
    }

    public AugPillarBlock(Settings settings) {
        super(2.0f, 2.0f, 16.0f, 16.0f, 24.0f, settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(UP, true)).with(DOWN, true));
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
        boolean bl = this.canConnectToPillar(state);
        return !AugPillarBlock.cannotConnect(state) && neighborIsFullSquare || bl;
    }
    private boolean canConnectToPillar(BlockState state) {
        return state.isIn(ModBlockTags.COMPLEXPILLAR);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World blockView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        BlockPos blockPos2 = blockPos.up();
        BlockPos blockPos3 = blockPos.down();
        BlockState blockState = blockView.getBlockState(blockPos2);
        BlockState blockState2 = blockView.getBlockState(blockPos3);
        return (BlockState)((BlockState)((BlockState)super.getPlacementState(ctx).with(UP, this.canConnect(blockState, blockState.isSideSolidFullSquare(blockView, blockPos2, Direction.DOWN), Direction.DOWN))).with(DOWN, this.canConnect(blockState2, blockState2.isSideSolidFullSquare(blockView, blockPos3, Direction.UP), Direction.UP)));
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getAxis().getType() == Direction.Type.VERTICAL) {
            return (BlockState)state.with((Property)FACING_PROPERTIES.get(direction), this.canConnect(neighborState, neighborState.isSideSolidFullSquare(world, neighborPos, direction.getOpposite()), direction.getOpposite()));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(UP, DOWN);
    }
}