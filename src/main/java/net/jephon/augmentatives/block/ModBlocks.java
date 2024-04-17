package net.jephon.augmentatives.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.building.AsphaltBlock;
import net.jephon.augmentatives.block.building.SurfaceBlock;
import net.jephon.augmentatives.block.building.TarBlock;
import net.jephon.augmentatives.block.decor.furniture.kitchen.CounterBlock;
import net.jephon.augmentatives.block.decor.furniture.outside.*;
import net.jephon.augmentatives.block.decor.traffic.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                 Kitchen Counter with Solid Doors                                            //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Acacia
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_ACACIA_GRANITE = registerBlock("kitchen_counter_doors_acacia_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_ACACIA_DIORITE = registerBlock("kitchen_counter_doors_acacia_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_ACACIA_ANDESITE = registerBlock("kitchen_counter_doors_acacia_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_ACACIA_STONE = registerBlock("kitchen_counter_doors_acacia_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_ACACIA_DEEPSLATE = registerBlock("kitchen_counter_doors_acacia_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_ACACIA_TUFF = registerBlock("kitchen_counter_doors_acacia_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Birch
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_BIRCH_GRANITE = registerBlock("kitchen_counter_doors_birch_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_BIRCH_DIORITE = registerBlock("kitchen_counter_doors_birch_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_BIRCH_ANDESITE = registerBlock("kitchen_counter_doors_birch_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_BIRCH_STONE = registerBlock("kitchen_counter_doors_birch_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_BIRCH_DEEPSLATE = registerBlock("kitchen_counter_doors_birch_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_BIRCH_TUFF = registerBlock("kitchen_counter_doors_birch_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Cherry
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_CHERRY_GRANITE = registerBlock("kitchen_counter_doors_cherry_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CHERRY_DIORITE = registerBlock("kitchen_counter_doors_cherry_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CHERRY_ANDESITE = registerBlock("kitchen_counter_doors_cherry_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CHERRY_STONE = registerBlock("kitchen_counter_doors_cherry_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CHERRY_DEEPSLATE = registerBlock("kitchen_counter_doors_cherry_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CHERRY_TUFF = registerBlock("kitchen_counter_doors_cherry_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Crimson
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_CRIMSON_GRANITE = registerBlock("kitchen_counter_doors_crimson_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CRIMSON_DIORITE = registerBlock("kitchen_counter_doors_crimson_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CRIMSON_ANDESITE = registerBlock("kitchen_counter_doors_crimson_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CRIMSON_STONE = registerBlock("kitchen_counter_doors_crimson_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CRIMSON_DEEPSLATE = registerBlock("kitchen_counter_doors_crimson_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_CRIMSON_TUFF = registerBlock("kitchen_counter_doors_crimson_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Dark Oak
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_DARK_OAK_GRANITE = registerBlock("kitchen_counter_doors_dark_oak_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_DARK_OAK_DIORITE = registerBlock("kitchen_counter_doors_dark_oak_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_DARK_OAK_ANDESITE = registerBlock("kitchen_counter_doors_dark_oak_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_DARK_OAK_STONE = registerBlock("kitchen_counter_doors_dark_oak_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_DARK_OAK_DEEPSLATE = registerBlock("kitchen_counter_doors_dark_oak_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_DARK_OAK_TUFF = registerBlock("kitchen_counter_doors_dark_oak_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Jungle
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_JUNGLE_GRANITE = registerBlock("kitchen_counter_doors_jungle_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_JUNGLE_DIORITE = registerBlock("kitchen_counter_doors_jungle_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_JUNGLE_ANDESITE = registerBlock("kitchen_counter_doors_jungle_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_JUNGLE_STONE = registerBlock("kitchen_counter_doors_jungle_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_JUNGLE_DEEPSLATE = registerBlock("kitchen_counter_doors_jungle_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_JUNGLE_TUFF = registerBlock("kitchen_counter_doors_jungle_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Mangrove
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_MANGROVE_GRANITE = registerBlock("kitchen_counter_doors_mangrove_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_MANGROVE_DIORITE = registerBlock("kitchen_counter_doors_mangrove_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_MANGROVE_ANDESITE = registerBlock("kitchen_counter_doors_mangrove_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_MANGROVE_STONE = registerBlock("kitchen_counter_doors_mangrove_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_MANGROVE_DEEPSLATE = registerBlock("kitchen_counter_doors_mangrove_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_MANGROVE_TUFF = registerBlock("kitchen_counter_doors_mangrove_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Oak
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_OAK_GRANITE = registerBlock("kitchen_counter_doors_oak_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_OAK_DIORITE = registerBlock("kitchen_counter_doors_oak_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_OAK_ANDESITE = registerBlock("kitchen_counter_doors_oak_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_OAK_STONE = registerBlock("kitchen_counter_doors_oak_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_OAK_DEEPSLATE = registerBlock("kitchen_counter_doors_oak_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_OAK_TUFF = registerBlock("kitchen_counter_doors_oak_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Spruce
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_SPRUCE_GRANITE = registerBlock("kitchen_counter_doors_spruce_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_SPRUCE_DIORITE = registerBlock("kitchen_counter_doors_spruce_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_SPRUCE_ANDESITE = registerBlock("kitchen_counter_doors_spruce_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_SPRUCE_STONE = registerBlock("kitchen_counter_doors_spruce_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_SPRUCE_DEEPSLATE = registerBlock("kitchen_counter_doors_spruce_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_SPRUCE_TUFF = registerBlock("kitchen_counter_doors_spruce_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Doors - Warped
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DOORS_WARPED_GRANITE = registerBlock("kitchen_counter_doors_warped_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_WARPED_DIORITE = registerBlock("kitchen_counter_doors_warped_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_WARPED_ANDESITE = registerBlock("kitchen_counter_doors_warped_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_WARPED_STONE = registerBlock("kitchen_counter_doors_warped_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_WARPED_DEEPSLATE = registerBlock("kitchen_counter_doors_warped_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DOORS_WARPED_TUFF = registerBlock("kitchen_counter_doors_warped_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));





    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                 Kitchen Counter with Drawers                                                //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Acacia
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_ACACIA_GRANITE = registerBlock("kitchen_counter_drawers_acacia_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_ACACIA_DIORITE = registerBlock("kitchen_counter_drawers_acacia_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_ACACIA_ANDESITE = registerBlock("kitchen_counter_drawers_acacia_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_ACACIA_STONE = registerBlock("kitchen_counter_drawers_acacia_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_ACACIA_DEEPSLATE = registerBlock("kitchen_counter_drawers_acacia_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_ACACIA_TUFF = registerBlock("kitchen_counter_drawers_acacia_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Birch
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_BIRCH_GRANITE = registerBlock("kitchen_counter_drawers_birch_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_BIRCH_DIORITE = registerBlock("kitchen_counter_drawers_birch_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_BIRCH_ANDESITE = registerBlock("kitchen_counter_drawers_birch_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_BIRCH_STONE = registerBlock("kitchen_counter_drawers_birch_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_BIRCH_DEEPSLATE = registerBlock("kitchen_counter_drawers_birch_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_BIRCH_TUFF = registerBlock("kitchen_counter_drawers_birch_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Cherry
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_CHERRY_GRANITE = registerBlock("kitchen_counter_drawers_cherry_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CHERRY_DIORITE = registerBlock("kitchen_counter_drawers_cherry_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CHERRY_ANDESITE = registerBlock("kitchen_counter_drawers_cherry_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CHERRY_STONE = registerBlock("kitchen_counter_drawers_cherry_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CHERRY_DEEPSLATE = registerBlock("kitchen_counter_drawers_cherry_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CHERRY_TUFF = registerBlock("kitchen_counter_drawers_cherry_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Crimson
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_CRIMSON_GRANITE = registerBlock("kitchen_counter_drawers_crimson_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CRIMSON_DIORITE = registerBlock("kitchen_counter_drawers_crimson_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CRIMSON_ANDESITE = registerBlock("kitchen_counter_drawers_crimson_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CRIMSON_STONE = registerBlock("kitchen_counter_drawers_crimson_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CRIMSON_DEEPSLATE = registerBlock("kitchen_counter_drawers_crimson_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_CRIMSON_TUFF = registerBlock("kitchen_counter_drawers_crimson_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Dark Oak
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_DARK_OAK_GRANITE = registerBlock("kitchen_counter_drawers_dark_oak_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_DARK_OAK_DIORITE = registerBlock("kitchen_counter_drawers_dark_oak_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_DARK_OAK_ANDESITE = registerBlock("kitchen_counter_drawers_dark_oak_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_DARK_OAK_STONE = registerBlock("kitchen_counter_drawers_dark_oak_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_DARK_OAK_DEEPSLATE = registerBlock("kitchen_counter_drawers_dark_oak_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_DARK_OAK_TUFF = registerBlock("kitchen_counter_drawers_dark_oak_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Jungle
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_JUNGLE_GRANITE = registerBlock("kitchen_counter_drawers_jungle_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_JUNGLE_DIORITE = registerBlock("kitchen_counter_drawers_jungle_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_JUNGLE_ANDESITE = registerBlock("kitchen_counter_drawers_jungle_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_JUNGLE_STONE = registerBlock("kitchen_counter_drawers_jungle_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_JUNGLE_DEEPSLATE = registerBlock("kitchen_counter_drawers_jungle_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_JUNGLE_TUFF = registerBlock("kitchen_counter_drawers_jungle_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Mangrove
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_MANGROVE_GRANITE = registerBlock("kitchen_counter_drawers_mangrove_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_MANGROVE_DIORITE = registerBlock("kitchen_counter_drawers_mangrove_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_MANGROVE_ANDESITE = registerBlock("kitchen_counter_drawers_mangrove_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_MANGROVE_STONE = registerBlock("kitchen_counter_drawers_mangrove_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_MANGROVE_DEEPSLATE = registerBlock("kitchen_counter_drawers_mangrove_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_MANGROVE_TUFF = registerBlock("kitchen_counter_drawers_mangrove_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Oak
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_OAK_GRANITE = registerBlock("kitchen_counter_drawers_oak_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_OAK_DIORITE = registerBlock("kitchen_counter_drawers_oak_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_OAK_ANDESITE = registerBlock("kitchen_counter_drawers_oak_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_OAK_STONE = registerBlock("kitchen_counter_drawers_oak_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_OAK_DEEPSLATE = registerBlock("kitchen_counter_drawers_oak_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_OAK_TUFF = registerBlock("kitchen_counter_drawers_oak_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Spruce
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_SPRUCE_GRANITE = registerBlock("kitchen_counter_drawers_spruce_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_SPRUCE_DIORITE = registerBlock("kitchen_counter_drawers_spruce_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_SPRUCE_ANDESITE = registerBlock("kitchen_counter_drawers_spruce_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_SPRUCE_STONE = registerBlock("kitchen_counter_drawers_spruce_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_SPRUCE_DEEPSLATE = registerBlock("kitchen_counter_drawers_spruce_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_SPRUCE_TUFF = registerBlock("kitchen_counter_drawers_spruce_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Drawers - Warped
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_DRAWERS_WARPED_GRANITE = registerBlock("kitchen_counter_drawers_warped_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_WARPED_DIORITE = registerBlock("kitchen_counter_drawers_warped_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_WARPED_ANDESITE = registerBlock("kitchen_counter_drawers_warped_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_WARPED_STONE = registerBlock("kitchen_counter_drawers_warped_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_WARPED_DEEPSLATE = registerBlock("kitchen_counter_drawers_warped_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_DRAWERS_WARPED_TUFF = registerBlock("kitchen_counter_drawers_warped_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                              Kitchen Counter with Glass Doors                                               //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Acacia
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_ACACIA_GRANITE = registerBlock("kitchen_counter_glass_doors_acacia_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_ACACIA_DIORITE = registerBlock("kitchen_counter_glass_doors_acacia_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_ACACIA_ANDESITE = registerBlock("kitchen_counter_glass_doors_acacia_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_ACACIA_STONE = registerBlock("kitchen_counter_glass_doors_acacia_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_ACACIA_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_acacia_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_ACACIA_TUFF = registerBlock("kitchen_counter_glass_doors_acacia_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Birch
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_BIRCH_GRANITE = registerBlock("kitchen_counter_glass_doors_birch_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_BIRCH_DIORITE = registerBlock("kitchen_counter_glass_doors_birch_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_BIRCH_ANDESITE = registerBlock("kitchen_counter_glass_doors_birch_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_BIRCH_STONE = registerBlock("kitchen_counter_glass_doors_birch_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_BIRCH_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_birch_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_BIRCH_TUFF = registerBlock("kitchen_counter_glass_doors_birch_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Cherry
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CHERRY_GRANITE = registerBlock("kitchen_counter_glass_doors_cherry_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CHERRY_DIORITE = registerBlock("kitchen_counter_glass_doors_cherry_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CHERRY_ANDESITE = registerBlock("kitchen_counter_glass_doors_cherry_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CHERRY_STONE = registerBlock("kitchen_counter_glass_doors_cherry_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CHERRY_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_cherry_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CHERRY_TUFF = registerBlock("kitchen_counter_glass_doors_cherry_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Crimson
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_GRANITE = registerBlock("kitchen_counter_glass_doors_crimson_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_DIORITE = registerBlock("kitchen_counter_glass_doors_crimson_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_ANDESITE = registerBlock("kitchen_counter_glass_doors_crimson_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_STONE = registerBlock("kitchen_counter_glass_doors_crimson_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_crimson_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_TUFF = registerBlock("kitchen_counter_glass_doors_crimson_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Dark Oak
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_GRANITE = registerBlock("kitchen_counter_glass_doors_dark_oak_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_DIORITE = registerBlock("kitchen_counter_glass_doors_dark_oak_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_ANDESITE = registerBlock("kitchen_counter_glass_doors_dark_oak_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_STONE = registerBlock("kitchen_counter_glass_doors_dark_oak_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_dark_oak_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_TUFF = registerBlock("kitchen_counter_glass_doors_dark_oak_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Jungle
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_GRANITE = registerBlock("kitchen_counter_glass_doors_jungle_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_DIORITE = registerBlock("kitchen_counter_glass_doors_jungle_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_ANDESITE = registerBlock("kitchen_counter_glass_doors_jungle_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_STONE = registerBlock("kitchen_counter_glass_doors_jungle_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_jungle_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_TUFF = registerBlock("kitchen_counter_glass_doors_jungle_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Mangrove
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_GRANITE = registerBlock("kitchen_counter_glass_doors_mangrove_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_DIORITE = registerBlock("kitchen_counter_glass_doors_mangrove_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_ANDESITE = registerBlock("kitchen_counter_glass_doors_mangrove_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_STONE = registerBlock("kitchen_counter_glass_doors_mangrove_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_mangrove_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_TUFF = registerBlock("kitchen_counter_glass_doors_mangrove_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Oak
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_OAK_GRANITE = registerBlock("kitchen_counter_glass_doors_oak_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_OAK_DIORITE = registerBlock("kitchen_counter_glass_doors_oak_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_OAK_ANDESITE = registerBlock("kitchen_counter_glass_doors_oak_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_OAK_STONE = registerBlock("kitchen_counter_glass_doors_oak_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_OAK_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_oak_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_OAK_TUFF = registerBlock("kitchen_counter_glass_doors_oak_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Spruce
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_GRANITE = registerBlock("kitchen_counter_glass_doors_spruce_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_DIORITE = registerBlock("kitchen_counter_glass_doors_spruce_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_ANDESITE = registerBlock("kitchen_counter_glass_doors_spruce_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_STONE = registerBlock("kitchen_counter_glass_doors_spruce_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_spruce_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_TUFF = registerBlock("kitchen_counter_glass_doors_spruce_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Kitchen Counter with Glass Doors - Warped
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_WARPED_GRANITE = registerBlock("kitchen_counter_glass_doors_warped_granite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_WARPED_DIORITE = registerBlock("kitchen_counter_glass_doors_warped_diorite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_WARPED_ANDESITE = registerBlock("kitchen_counter_glass_doors_warped_andesite",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_WARPED_STONE = registerBlock("kitchen_counter_glass_doors_warped_deepslate",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_WARPED_DEEPSLATE = registerBlock("kitchen_counter_glass_doors_warped_stone",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block KITCHEN_COUNTER_GLASS_DOORS_WARPED_TUFF = registerBlock("kitchen_counter_glass_doors_warped_tuff",
            new CounterBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                               Beach Chairs                                                  //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    public static final Block OUTSIDE_BEACHCHAIR_DARK_OAK = registerBlock("outside_beachchair_dark_oak",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_OAK = registerBlock("outside_beachchair_oak",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_SPRUCE = registerBlock("outside_beachchair_spruce",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_BIRCH = registerBlock("outside_beachchair_birch",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_JUNGLE = registerBlock("outside_beachchair_jungle",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_CHERRY = registerBlock("outside_beachchair_cherry",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_ACACIA = registerBlock("outside_beachchair_acacia",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_MANGROVE = registerBlock("outside_beachchair_mangrove",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_WARPED = registerBlock("outside_beachchair_warped",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_BEACHCHAIR_CRIMSON = registerBlock("outside_beachchair_crimson",
            new BeachChairBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                               Asphalt                                                       //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BLACK = registerBlock("outside_asphalt_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK = registerBlock("outside_asphalt_bricks_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_RED = registerBlock("outside_asphalt_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_DASHED_YELLOW = registerBlock("outside_asphalt_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_DOTTED_WHITE = registerBlock("outside_asphalt_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_SINGLE_WHITE = registerBlock("outside_asphalt_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED = registerBlock("outside_asphalt_bricks_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_GREEN = registerBlock("outside_asphalt_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN = registerBlock("outside_asphalt_bricks_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BLUE = registerBlock("outside_asphalt_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE = registerBlock("outside_asphalt_bricks_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                               Surfaces                                                      //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Surface - Andesite
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_SURFACE_ANDESITE = registerBlock("building_surface_andesite",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SURFACE_ANDESITE_SINGLE_WHITE = registerBlock("outside_surface_andesite_single_white",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Surface - Stone
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_SURFACE_STONE = registerBlock("building_surface_stone",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SURFACE_STONE_SINGLE_WHITE = registerBlock("outside_surface_stone_single_white",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Surface - Granite
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_SURFACE_GRANITE = registerBlock("building_surface_granite",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SURFACE_GRANITE_SINGLE_WHITE = registerBlock("outside_surface_granite_single_white",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Surface - Diorite
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_SURFACE_DIORITE = registerBlock("building_surface_diorite",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SURFACE_DIORITE_SINGLE_WHITE = registerBlock("outside_surface_diorite_single_white",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Surface - Tuff
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_SURFACE_TUFF = registerBlock("building_surface_tuff",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SURFACE_TUFF_SINGLE_WHITE = registerBlock("outside_surface_tuff_single_white",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Surface - Deepslate
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_SURFACE_DEEPSLATE = registerBlock("building_surface_deepslate",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SURFACE_DEEPSLATE_SINGLE_WHITE = registerBlock("outside_surface_deepslate_single_white",
            new SurfaceBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    public static final RegistryObject<Block> BENCH = registerBlock("bench", () -> new BenchWithBack(AbstractBlock.Properties.create(Material.ROCK).notSolid()));
    public static final RegistryObject<Block> BENCH_BACK_DARK_OAK = registerBlock("bench_back_dark_oak", () -> new BenchBlock(AbstractBlock.Properties.create(Material.ROCK).notSolid()));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                               Signs                                                         //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Traffic Signs
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_SIGN_STOP = registerBlock("outside_sign_stop",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Location Signs
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_SIGN_TOWN = registerBlock("outside_sign_town",
            new TownSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Caution / Protection Signs
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_SIGN_GUARD_RAIL_CAUTION = registerBlock("outside_sign_guard_rail_caution",
            new GuardRailBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_TRAFFIC_CONE = registerBlock("outside_sign_traffic_cone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_TRAFFIC_BARREL = registerBlock("outside_sign_traffic_barrel",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));




    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Streetlights / Parklights
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_STREETLIGHT = registerBlock("outside_streetlight",
            new StreetLightBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(1f).luminance(state -> 14).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                               Tar                                                          //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Tar Block
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_TAR_TAR_BLOCK = registerBlock("building_tar_tar_block",
            new TarBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).velocityMultiplier(0.4f).jumpVelocityMultiplier(0.5f).sounds(BlockSoundGroup.SLIME)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Augmentatives.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Augmentatives.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Augmentatives.LOGGER.info("Registering ModBlocks for " + Augmentatives.MOD_ID);
    }
}
