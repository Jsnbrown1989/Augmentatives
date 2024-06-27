package net.jephon.augmentatives.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BuildingItemGroups {
    public static final ItemGroup BUILDING_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "building_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.buildingAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OUTSIDE_ASPHALT_BLACK)).entries((displayContext, entries) -> {


                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW);

                        entries.add(ModBlocks.BUILDING_PATH_DIRTYCOBBLESTONE);
                        entries.add(ModBlocks.BUILDING_PATH_SANDYCOBBLESTONE);
                        entries.add(ModBlocks.BUILDING_PATH_SANDYDIRT);
                        entries.add(ModBlocks.BUILDING_PATH_SANDYGRAVEL);
                        entries.add(ModBlocks.BUILDING_PATH_DIRTYGRAVEL);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SLAB_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_SLAB_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_SLAB_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_YELLOW);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_BLACK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_BROWN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_CYAN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_LIGHT_BLUE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_LIGHT_GRAY);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_LIME);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_MAGENTA);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_ORANGE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_PINK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_PURPLE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_RED);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WET_YELLOW);

                        entries.add(ModBlocks.BUILDING_CAST_IRON_BLOCK);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BLOCK_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BLOCK_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BLOCK_RUSTED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_BLOCK);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_BLOCK_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_BLOCK_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_BLOCK_RUSTED);

                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_BLOCK);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_BLOCK_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_BLOCK_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_BLOCK_RUSTED);

                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_SLAB);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_SLAB_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_SLAB_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SMOOTH_SLAB_RUSTED);

                        entries.add(ModBlocks.BUILDING_CAST_IRON_SLAB);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SLAB_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SLAB_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_SLAB_RUSTED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_SLAB);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_SLAB_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_SLAB_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BRICKS_SLAB_RUSTED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BEAM);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BEAM_EXPOSED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BEAM_WEATHERED);
                        entries.add(ModBlocks.BUILDING_CAST_IRON_BEAM_RUSTED);

                        entries.add(ModItems.SLUDGE);
                        entries.add(ModItems.ROASTED_SPIDER_EYE);
                        entries.add(ModBlocks.BUILDING_TAR_OIL_BLOCK);
                        entries.add(ModBlocks.BUILDING_TAR_TAR_BLOCK);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Building Item Groups for " + Augmentatives.MOD_ID);
    }
}
