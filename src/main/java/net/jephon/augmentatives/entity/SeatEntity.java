package net.jephon.augmentatives.entity;

import net.jephon.augmentatives.util.ModBlockTags;
import net.jephon.augmentatives.util.ModSit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashMap;

public class SeatEntity extends Entity {

    public static final HashMap<Vec3d, BlockPos> OCCUPIED = new HashMap<>();
    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket()
    {
        return new EntitySpawnS2CPacket(this);
    }
    public SeatEntity(EntityType<? extends Entity> type, World world)
    {
        super(ModSit.SEAT, world);
    }

    public SeatEntity(World world)
    {
        super(ModSit.SEAT, world);
        noClip = true;
    }


    @Override
    public Vec3d updatePassengerForDismount(LivingEntity passenger) {
        if (passenger instanceof PlayerEntity) {
            int X = this.getBlockPos().getX();
            int Y = this.getBlockPos().getY();
            int Z = this.getBlockPos().getZ();
            BlockPos pos = OCCUPIED.remove(new Vec3d(X, Y , Z));
            if (pos != null) {
                remove(RemovalReason.DISCARDED);
                return new Vec3d(X + 0.5D, Y + 1.0D, Z + 0.5D);
            }
        }

        remove(RemovalReason.DISCARDED);
        return super.updatePassengerForDismount(passenger);
    }

    @Override
    public void tick() {
        if (!this.getWorld().isClient && !this.getWorld().getBlockState(this.getBlockPos()).isIn(ModBlockTags.SEATS)){
            remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    public void remove(RemovalReason reason)
    {
        OCCUPIED.remove(getPos());
        super.remove(reason);
    }

    @Override
    protected void initDataTracker() {}

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {}

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {}


}