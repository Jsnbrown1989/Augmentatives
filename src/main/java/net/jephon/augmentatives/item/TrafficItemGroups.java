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

public class TrafficItemGroups {
    public static final ItemGroup TRAFFIC_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "outside_traffic_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.trafficAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOUBLE_YELLOW)).entries((displayContext, entries) -> {
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Paint Bucket                                                  //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Paint Bucket
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_BUCKET_PAINT);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Asphalt                                                       //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Black Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Black Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Black Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLACK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Black Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Black Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Blue Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Blue Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Blue Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Blue Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Blue Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_SINGLE_WHITE_THICK);
                        
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Brown Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BROWN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Brown Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_BROWN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Brown Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_BROWN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Brown Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Brown Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_SINGLE_WHITE_THICK);
                        
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Cyan Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_CYAN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Cyan Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CYAN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Cyan Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_CYAN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Cyan Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Cyan Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Gray Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Gray Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Gray Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Gray Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Gray Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Green Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Green Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Green Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_GREEN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Green Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Green Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Blue Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Blue Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Blue Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Blue Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Blue Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Gray Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIGHT_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Gray Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Gray Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Gray Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Light Gray Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Lime Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_LIME_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Lime Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_LIME_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Lime Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_LIME_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Lime Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Lime Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Magenta Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_MAGENTA_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Magenta Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MAGENTA_SINGLE_WHITE_THICK);


                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Magenta Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_MAGENTA_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Magenta Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Magenta Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Orange Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ORANGE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Orange Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_ORANGE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Orange Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_ORANGE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Orange Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Orange Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Pink Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PINK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Pink Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PINK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Pink Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PINK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Pink Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Pink Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Purple Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_SINGLE_WHITE_THICK);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_PURPLE_DIAGONAL_WHITE);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Purple Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_PURPLE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Purple Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_PURPLE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Purple Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Purple Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Red Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Red Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Red Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_RED_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Red Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Red Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // White Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_WHITE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // White Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_WHITE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // White Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_WHITE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // White Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // White Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_SINGLE_WHITE_THICK);
                        
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Yellow Asphalt
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_YELLOW_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Yellow Asphalt Bricks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_YELLOW_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Yellow Asphalt - Smooth
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SMOOTH_YELLOW_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Yellow Asphalt Bricks - Cracked
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Yellow Asphalt Bricks - Mossy
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOUBLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DASHED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_SINGLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_SINGLE_WHITE_THICK);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Decor
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_STREETLIGHT);
                        entries.add(ModBlocks.OUTSIDE_SIGN_STOP);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFICLIGHTAHEAD);
                        entries.add(ModBlocks.OUTSIDE_SIGN_SPEEDLIMIT);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TOWN);
                        entries.add(ModBlocks.OUTSIDE_SIGN_GUARD_RAIL_CAUTION);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_CONE);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_BARREL);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_LIGHT);
                        entries.add(ModBlocks.OUTSIDE_MANHOLE_COVER);
                        entries.add(ModBlocks.OUTSIDE_MANHOLE_TUNNEL);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
