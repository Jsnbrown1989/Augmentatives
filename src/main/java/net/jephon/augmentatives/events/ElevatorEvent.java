package net.jephon.augmentatives.events;

/* import javax.annotation.Nullable;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;


    public class ElevatorEvent extends Event {
        protected final ServerPlayerEntity player;
        protected final boolean goingUp;
        protected BlockPos targetElevator;
        protected Vector3d destination;

        public ElevatorEvent(ServerPlayerEntity player, boolean goingUp, BlockPos targetElevator, Vector3d destination) {
            this.player = player;
            this.goingUp = goingUp;
            this.targetElevator = targetElevator;
            this.destination = destination;
        }

        @Nullable
        public Vector3d getDestination() {
            return this.destination;
        }

        @Nullable
        public BlockPos getTargetElevatorPos() {
            return this.targetElevator;
        }

        public void setDestination(@Nullable Vector3d destination) {
            this.destination = destination;
        }

        public ServerPlayerEntity getPlayer() {
            return this.player;
        }

        public boolean isGoingUp() {
            return this.goingUp;
        }

        public static class Post extends ElevatorEvent {
            public Post(ServerPlayerEntity player, boolean goingUp, BlockPos targetElevator, Vector3d destination) {
                super(player, goingUp, targetElevator, destination);
            }
        }

        @Cancelable
        public static class Pre extends ElevatorEvent {
            public Pre(ServerPlayerEntity player, boolean goingUp, BlockPos targetElevator, Vector3d destination) {
                super(player, goingUp, targetElevator, destination);
            }
        }
    }
*/
