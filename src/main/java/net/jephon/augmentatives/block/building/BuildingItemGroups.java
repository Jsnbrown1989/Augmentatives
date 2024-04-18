package net.jephon.augmentatives.block.building;

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
            new Identifier(Augmentatives.MOD_ID, "outside_asphalt_black"),
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
                        
                        entries.add(ModBlocks.BUILDING_SURFACE_ANDESITE);
                        entries.add(ModBlocks.BUILDING_SURFACE_STONE);
                        entries.add(ModBlocks.BUILDING_SURFACE_GRANITE);
                        entries.add(ModBlocks.BUILDING_SURFACE_DIORITE);
                        entries.add(ModBlocks.BUILDING_SURFACE_TUFF);
                        entries.add(ModBlocks.BUILDING_SURFACE_DEEPSLATE);
                        entries.add(ModBlocks.BUILDING_TAR_TAR_BLOCK);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}