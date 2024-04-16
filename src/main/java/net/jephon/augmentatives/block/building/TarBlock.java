package net.jephon.augmentatives.block.building;

import com.mojang.serialization.MapCodec;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.TranslucentBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TarBlock
            extends TranslucentBlock {
        public static final MapCodec<TarBlock> CODEC = TarBlock.createCodec(TarBlock::new);
        protected static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 15, 16);

        public MapCodec<TarBlock> getCodec() {
            return CODEC;
        }

        public TarBlock(AbstractBlock.Settings settings) {
            super(settings);
        }


        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (entity.bypassesLandingEffects()) {
            super.onLandedUpon(world, state, pos, entity, fallDistance);
        } else {
            entity.handleFallDamage(fallDistance, 0.0f, world.getDamageSources().fall());
        }
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

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (this.isSliding(pos, entity)) {
            this.updateSlidingVelocity(entity);
        }
        super.onEntityCollision(state, world, pos, entity);
    }

    private boolean isSliding(BlockPos pos, Entity entity) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (entity.isOnGround()) {
            return false;
        }
        if (entity.getY() > (double)pos.getY() + 0.9375 - 1.0E-7) {
            return false;
        }
        if (entity.getVelocity().y >= -0.08) {
            return false;
        }
        double d = Math.abs((double)pos.getX() + 0.5 - entity.getX());
        double e = Math.abs((double)pos.getZ() + 0.5 - entity.getZ());
        double f = 0.4375 + (double)(entity.getWidth() / 2.0f);
        client.player.sendMessage(Text.literal("An Entity is sliding! ").append(client.player.getName()));

        return d + 1.0E-7 > f || e + 1.0E-7 > f;
    }

    private void updateSlidingVelocity(Entity entity) {
        MinecraftClient client = MinecraftClient.getInstance();
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < -0.13) {
            double d = -0.05 / vec3d.y;
            entity.setVelocity(new Vec3d(vec3d.x * d, -0.05, vec3d.z * d));
        } else {
            entity.setVelocity(new Vec3d(vec3d.x, -0.05, vec3d.z));
        }
        entity.onLanding();
        client.player.sendMessage(Text.literal("Sliding velocity has changed! ").append(client.player.getName()));

    }
}
