package net.jephon.augmentatives.block.decor.furniture.outside;


import net.jephon.augmentatives.block.common.ChairBlock;
import net.jephon.augmentatives.util.BeachChairPosition;
import net.jephon.augmentatives.util.Colorizer;
import net.minecraft.block.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.item.*;

import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;

import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static net.jephon.augmentatives.util.Colorizer.*;


public class BeachChairBlock
extends ChairBlock {
    public BeachChairBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(POSITION, BeachChairPosition.STANDARD)).with(COLOR, Colorizer.WHITE));

    }
    public static final EnumProperty<BeachChairPosition> POSITION= EnumProperty.of("position", BeachChairPosition.class);
    public static final EnumProperty<Colorizer> COLOR= EnumProperty.of("color", Colorizer.class);

    protected static final VoxelShape BEACH_CHAIR_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(2, 0, 2, 14, 8, 14)
    );

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        boolean SneakingEmptyHand = player.getStackInHand(hand).isEmpty() && !player.isSneaking();
        boolean notSneakingDyeHand = player.getStackInHand(hand).getItem() instanceof DyeItem && !player.isSneaking();
        ItemStack item = player.getStackInHand(hand).getItem().getDefaultStack();
        Colorizer red = RED;
        Colorizer blue = BLUE;
        Colorizer black = BLACK;
        Colorizer brown = BROWN;
        Colorizer cyan = CYAN;
        Colorizer gray = GRAY;
        Colorizer light_gray = LIGHT_GRAY;
        Colorizer light_blue = LIGHT_BLUE;
        Colorizer green = GREEN;
        Colorizer lime = LIME;
        Colorizer magenta = MAGENTA;
        Colorizer orange = ORANGE;
        Colorizer purple = PURPLE;
        Colorizer white = WHITE;
        Colorizer yellow = YELLOW;
        Colorizer pink = PINK;
        if (notSneakingDyeHand) {
            if (item.isOf(Items.RED_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, red), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.MAGENTA_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, magenta), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.BLACK_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, black), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.BROWN_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, brown), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.BLUE_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, blue), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.CYAN_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, cyan), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.GRAY_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, gray), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.LIGHT_GRAY_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, light_gray), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.LIGHT_BLUE_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, light_blue), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.GREEN_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, green), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.LIME_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, lime), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.ORANGE_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, orange), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.PURPLE_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, purple), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.WHITE_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, white), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.YELLOW_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, yellow), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            else if (item.isOf(Items.PINK_DYE)){
                if (!player.getAbilities().allowModifyWorld) {
                    return ActionResult.PASS;
                }
                world.setBlockState(pos, (BlockState)state.with(COLOR, pink), Block.NOTIFY_ALL);
                return ActionResult.success(world.isClient);
            }
            return ActionResult.CONSUME;
        } else if(SneakingEmptyHand){
            return ActionResult.PASS;
        }
        world.setBlockState(pos, (BlockState)state.cycle(POSITION), Block.NOTIFY_ALL);
        return ActionResult.success(world.isClient);
    }


    private void bounceEntity(Entity entity) {
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < 0.0) {
            double d = entity instanceof LivingEntity ? 1.0 : 0.8;
            entity.setVelocity(vec3d.x, -vec3d.y * (double)0.66f * d, vec3d.z);
        }
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BEACH_CHAIR_SHAPE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POSITION, COLOR, HORIZONTAL_FACING);
    }
}
