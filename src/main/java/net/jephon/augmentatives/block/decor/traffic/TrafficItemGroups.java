package net.jephon.augmentatives.block.decor.traffic;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TrafficItemGroups {
    public static final ItemGroup OUTSIDE_SIGN_STOP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "outside_sign_stop"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.trafficAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OUTSIDE_SIGN_STOP)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE_THICK);
                        
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE_THICK);
                        
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE_THICK);


                        entries.add(ModBlocks.OUTSIDE_SURFACE_ANDESITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_SURFACE_STONE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_SURFACE_GRANITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_SURFACE_DIORITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_SURFACE_TUFF_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_SURFACE_DEEPSLATE_SINGLE_WHITE);


                        entries.add(ModBlocks.OUTSIDE_STREETLIGHT);
                        entries.add(ModBlocks.OUTSIDE_SIGN_STOP);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TOWN);
                        entries.add(ModBlocks.OUTSIDE_SIGN_GUARD_RAIL_CAUTION);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_CONE);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_BARREL);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
