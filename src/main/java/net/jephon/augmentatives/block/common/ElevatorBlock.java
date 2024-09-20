package net.jephon.augmentatives.block.common;

/*import com.pixelmonmod.pixelmon.Pixelmon;
import com.pixelmonmod.pixelmon.api.config.PixelmonConfigProxy;
import com.pixelmonmod.pixelmon.api.events.ElevatorEvent;
import net.jephon.augmentatives.block.common.GenericBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;


public class ElevatorBlock extends GenericBlock {
    public ElevatorBlock() {
        super(Properties.func_200945_a(Material.field_151573_f).func_200943_b(0.8F));
    }

    public ActionResultType func_225533_a_(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        return ActionResultType.FAIL;
    }

    public static void takeElevator(World world, BlockPos pos, ServerPlayerEntity player, boolean upwards) {
        BlockPos elevatorPos = findNearestElevator(world, pos, upwards);
        Vector3d destination = elevatorPos == null ? null : new Vector3d(player.func_226277_ct_(), (double)elevatorPos.func_177956_o() + 1.5, player.func_226281_cx_());
        ElevatorEvent.Pre elevatorEvent = new ElevatorEvent.Pre(player, upwards, elevatorPos, destination);
        if (!Pixelmon.EVENT_BUS.post(elevatorEvent)) {
            destination = elevatorEvent.getDestination();
            if (destination != null) {
                player.func_70634_a(destination.func_82615_a(), destination.func_82617_b(), destination.func_82616_c());
                Pixelmon.EVENT_BUS.post(new ElevatorEvent.Post(player, upwards, elevatorPos, destination));
            }
        }
    }

    private static BlockPos findNearestElevator(World world, BlockPos pos, boolean upwards) {
        int searchRangeY = PixelmonConfigProxy.getGeneral().getElevatorSearchRange();
        if (!upwards) {
            searchRangeY *= -1;
        }

        int posY = pos.func_177956_o();
        BlockPos.Mutable newPos = new BlockPos.Mutable();
        int y = posY;

        while(true) {
            if (upwards) {
                if (y >= posY + searchRangeY) {
                    break;
                }
            } else if (y <= posY + searchRangeY) {
                break;
            }

            newPos.func_181079_c(pos.func_177958_n(), y, pos.func_177952_p());
            if (!newPos.equals(pos) && !newPos.func_177984_a().equals(pos) && world.func_180495_p(newPos).func_177230_c() instanceof ElevatorBlock) {
                return newPos;
            }

            y += upwards ? 1 : -1;
        }

        return null;
    }
}
*/
