package net.jephon.augmentatives.block.building;

import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.jephon.augmentatives.util.Dryable;
import net.minecraft.block.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class WetAsphaltBlock
            extends Block
            implements Dryable {

    public static final MapCodec<WetAsphaltBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(Dryable.DryLevel.CODEC.fieldOf("drying_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec()).apply(instance, WetAsphaltBlock::new);
    });
    private final Dryable.DryLevel dryLevel;

        protected static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 15.5, 16);



    public MapCodec<WetAsphaltBlock> getCodec() {
        return CODEC;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public WetAsphaltBlock(Dryable.DryLevel dryLevel, AbstractBlock.Settings settings) {
        super(settings);
        this.dryLevel = dryLevel;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Dryable.getIncreasedDryBlock(state.getBlock()).isPresent();
    }


    public Dryable.DryLevel getDegradationLevel() {
        return this.dryLevel;
    }


        @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        double d = Math.abs(entity.getVelocity().y);
        if (d < 0.1 && !entity.bypassesSteppingEffects()) {
            double e = 0.4 + d * 0.2;
            entity.setVelocity(entity.getVelocity().multiply(e, 1.0, e));
        }
        super.onSteppedOn(world, pos, state, entity);
    }

}
