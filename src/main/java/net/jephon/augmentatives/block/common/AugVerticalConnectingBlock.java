package net.jephon.augmentatives.block.common;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Map;

public abstract class AugVerticalConnectingBlock
        extends Block {
    public static final BooleanProperty UP = ConnectingBlock.UP;
    public static final BooleanProperty DOWN = ConnectingBlock.DOWN;
    protected static final Map<Direction, BooleanProperty> FACING_PROPERTIES = ConnectingBlock.FACING_PROPERTIES.entrySet().stream().filter(entry -> ((Direction)entry.getKey()).getAxis().isHorizontal()).collect(Util.toMap());
    protected final VoxelShape[] collisionShapes;
    protected final VoxelShape[] boundingShapes;
    private final Object2IntMap<BlockState> SHAPE_INDEX_CACHE = new Object2IntOpenHashMap<BlockState>();

    protected AugVerticalConnectingBlock(float radius1, float radius2, float boundingHeight1, float boundingHeight2, float collisionHeight, Settings settings) {
        super(settings);
        this.collisionShapes = this.createShapes(radius1, radius2, collisionHeight, 0.0f, collisionHeight);
        this.boundingShapes = this.createShapes(radius1, radius2, boundingHeight1, 0.0f, boundingHeight2);
        for (BlockState blockState : this.stateManager.getStates()) {
            this.getShapeIndex(blockState);
        }
    }

    protected abstract MapCodec<? extends AugVerticalConnectingBlock> getCodec();

    protected VoxelShape[] createShapes(float radius1, float radius2, float height1, float offset2, float height2) {
        float f = 8.0f - radius1;
        float g = 8.0f + radius1;
        float h = 8.0f - radius2;
        float i = 8.0f + radius2;
        VoxelShape voxelShape = Block.createCuboidShape(f, 0.0, f, g, height1, g);
        VoxelShape voxelShape2 = Block.createCuboidShape(h, offset2, 0.0, i, height2, i);
        VoxelShape voxelShape3 = Block.createCuboidShape(h, offset2, h, i, height2, 16.0);
        VoxelShape voxelShape4 = Block.createCuboidShape(0.0, offset2, h, i, height2, i);
        VoxelShape voxelShape5 = Block.createCuboidShape(h, offset2, h, 16.0, height2, i);
        VoxelShape voxelShape6 = VoxelShapes.union(voxelShape2, voxelShape5);
        VoxelShape voxelShape7 = VoxelShapes.union(voxelShape3, voxelShape4);
        VoxelShape[] voxelShapes = new VoxelShape[]{VoxelShapes.empty(), voxelShape3, voxelShape4, voxelShape7, voxelShape2, VoxelShapes.union(voxelShape3, voxelShape2), VoxelShapes.union(voxelShape4, voxelShape2), VoxelShapes.union(voxelShape7, voxelShape2), voxelShape5, VoxelShapes.union(voxelShape3, voxelShape5), VoxelShapes.union(voxelShape4, voxelShape5), VoxelShapes.union(voxelShape7, voxelShape5), voxelShape6, VoxelShapes.union(voxelShape3, voxelShape6), VoxelShapes.union(voxelShape4, voxelShape6), VoxelShapes.union(voxelShape7, voxelShape6)};
        for (int j = 0; j < 16; ++j) {
            voxelShapes[j] = VoxelShapes.union(voxelShape, voxelShapes[j]);
        }
        return voxelShapes;
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.boundingShapes[this.getShapeIndex(state)];
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.collisionShapes[this.getShapeIndex(state)];
    }

    private static int getDirectionMask(Direction dir) {
        return 1 << dir.getHorizontal();
    }

    protected int getShapeIndex(BlockState state) {
        return this.SHAPE_INDEX_CACHE.computeIntIfAbsent(state, statex -> {
            int i = 0;
            if (statex.get(UP).booleanValue()) {
                i |= AugVerticalConnectingBlock.getDirectionMask(Direction.UP);
            }
            if (statex.get(DOWN).booleanValue()) {
                i |= AugVerticalConnectingBlock.getDirectionMask(Direction.DOWN);
            }
            return i;
        });
    }


    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180: {
                return (BlockState)((BlockState)state.with(UP, state.get(DOWN))).with(DOWN, state.get(UP));
            }
            case COUNTERCLOCKWISE_90: {
                return (BlockState)((BlockState)state.with(UP, state.get(DOWN))).with(DOWN, state.get(UP));
            }
            case CLOCKWISE_90: {
                return (BlockState)((BlockState)state.with(UP, state.get(DOWN))).with(DOWN, state.get(UP));
            }
        }
        return state;
    }
}


