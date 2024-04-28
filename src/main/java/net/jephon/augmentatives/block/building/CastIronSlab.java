package net.jephon.augmentatives.block.building;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.jephon.augmentatives.util.Rustable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;
import net.minecraft.block.SlabBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class CastIronSlab
        extends SlabBlock
        implements Rustable {



    public static final MapCodec<CastIronSlab> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(RustLevel.CODEC.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec()).apply(instance, CastIronSlab::new);
    });
    private final RustLevel rustLevel;

    public MapCodec<CastIronSlab> getCodec() {
        return CODEC;
    }

    public CastIronSlab(RustLevel rustLevel, Settings settings) {
        super(settings);
        this.rustLevel = rustLevel;
    }


    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Rustable.getIncreasedRustedBlock(state.getBlock()).isPresent();
    }


    public RustLevel getDegradationLevel() {
        return this.rustLevel;
    }
}

