package net.jephon.augmentatives.block.decor.furniture.outside;

import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.block.decor.furniture.ChairBlock;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class BeachChairBlock
extends ChairBlock {
    public BeachChairBlock(Settings settings) {
        super(settings);
    }
    protected static final VoxelShape BEACH_CHAIR_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(2, 0, 2, 14, 6, 14)
    );

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BEACH_CHAIR_SHAPE;
    }
}
