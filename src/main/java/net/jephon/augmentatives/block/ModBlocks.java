package net.jephon.augmentatives.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.building.*;
import net.jephon.augmentatives.block.cobbled.decor.*;
import net.jephon.augmentatives.block.common.PaintBucketBlock;
import net.jephon.augmentatives.block.decor.furniture.kitchen.CounterBlock;
import net.jephon.augmentatives.block.decor.furniture.outside.BeachChairBlock;
import net.jephon.augmentatives.block.decor.furniture.outside.GuardRailBlock;
import net.jephon.augmentatives.block.decor.garden.PokeballStatueBlock;
import net.jephon.augmentatives.block.decor.garden.RhydonStatueBlock;
import net.jephon.augmentatives.block.decor.traffic.*;
import net.jephon.augmentatives.block.organic.decor.*;
import net.jephon.augmentatives.util.Dryable;
import net.jephon.augmentatives.util.Rustable;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
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

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BLACK = registerBlock("outside_asphalt_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOUBLE_WHITE = registerBlock("outside_asphalt_black_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DASHED_WHITE = registerBlock("outside_asphalt_black_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK = registerBlock("outside_asphalt_bricks_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_black_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DASHED_WHITE = registerBlock("outside_asphalt_bricks_black_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK = registerBlock("outside_asphalt_bricks_cracked_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_black_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_black_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK = registerBlock("outside_asphalt_bricks_mossy_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_black_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_black_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Black Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK = registerBlock("outside_asphalt_smooth_black",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_black_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_black_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_black_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_DASHED_WHITE = registerBlock("outside_asphalt_smooth_black_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_black_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_black_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_black_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_black_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLACK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_black_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_RED = registerBlock("outside_asphalt_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_DOUBLE_WHITE = registerBlock("outside_asphalt_red_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_DASHED_YELLOW = registerBlock("outside_asphalt_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_DASHED_WHITE = registerBlock("outside_asphalt_red_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_DOTTED_WHITE = registerBlock("outside_asphalt_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_SINGLE_WHITE = registerBlock("outside_asphalt_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED = registerBlock("outside_asphalt_bricks_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_red_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DASHED_WHITE = registerBlock("outside_asphalt_bricks_red_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED = registerBlock("outside_asphalt_bricks_cracked_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_red_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_red_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED = registerBlock("outside_asphalt_bricks_mossy_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_red_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_red_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Red Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED = registerBlock("outside_asphalt_smooth_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_red_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_red_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_red_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_DASHED_WHITE = registerBlock("outside_asphalt_smooth_red_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_red_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_red_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_red_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_red_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_RED_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_red_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_GREEN = registerBlock("outside_asphalt_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOUBLE_WHITE = registerBlock("outside_asphalt_green_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DASHED_WHITE = registerBlock("outside_asphalt_green_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN = registerBlock("outside_asphalt_bricks_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_green_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_green_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN = registerBlock("outside_asphalt_bricks_cracked_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_green_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_green_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN = registerBlock("outside_asphalt_bricks_mossy_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_green_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_green_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Green Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN = registerBlock("outside_asphalt_smooth_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_green_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_green_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_green_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_DASHED_WHITE = registerBlock("outside_asphalt_smooth_green_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_green_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_green_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_green_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_green_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GREEN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_green_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BLUE = registerBlock("outside_asphalt_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE = registerBlock("outside_asphalt_bricks_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE = registerBlock("outside_asphalt_bricks_cracked_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE = registerBlock("outside_asphalt_bricks_mossy_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Blue Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE = registerBlock("outside_asphalt_smooth_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_smooth_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Gray Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY = registerBlock("outside_asphalt_light_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_light_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_light_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_light_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_light_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_light_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_light_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_light_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_light_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_light_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Gray Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY = registerBlock("outside_asphalt_bricks_light_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_light_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_light_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_light_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_bricks_light_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_light_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_light_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_light_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_light_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_light_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Gray Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY = registerBlock("outside_asphalt_bricks_cracked_light_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_light_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Gray Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY = registerBlock("outside_asphalt_bricks_mossy_light_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_light_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Gray Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY = registerBlock("outside_asphalt_smooth_light_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_light_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_light_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_light_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_smooth_light_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_light_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_light_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_light_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_light_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_light_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Brown Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BROWN = registerBlock("outside_asphalt_brown",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_DOUBLE_YELLOW = registerBlock("outside_asphalt_brown_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_DOUBLE_WHITE = registerBlock("outside_asphalt_brown_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_DASHED_YELLOW = registerBlock("outside_asphalt_brown_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_DASHED_WHITE = registerBlock("outside_asphalt_brown_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_DOTTED_WHITE = registerBlock("outside_asphalt_brown_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_DOTTED_YELLOW = registerBlock("outside_asphalt_brown_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_SINGLE_WHITE = registerBlock("outside_asphalt_brown_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_SINGLE_YELLOW = registerBlock("outside_asphalt_brown_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BROWN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_brown_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Brown Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN = registerBlock("outside_asphalt_bricks_brown",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_brown_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_brown_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_brown_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_brown_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_brown_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_brown_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_brown_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_brown_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_BROWN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_brown_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Brown Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN = registerBlock("outside_asphalt_bricks_cracked_brown",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_brown_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_brown_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_brown_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_brown_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_brown_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_brown_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_brown_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_brown_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_BROWN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_brown_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Brown Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN = registerBlock("outside_asphalt_bricks_mossy_brown",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_brown_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_brown_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_brown_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_brown_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_brown_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_brown_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_brown_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_brown_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_BROWN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_brown_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Brown Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN = registerBlock("outside_asphalt_smooth_brown",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_brown_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_brown_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_brown_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_DASHED_WHITE = registerBlock("outside_asphalt_smooth_brown_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_brown_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_brown_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_brown_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_brown_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_BROWN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_brown_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Cyan Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_CYAN = registerBlock("outside_asphalt_cyan",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_DOUBLE_YELLOW = registerBlock("outside_asphalt_cyan_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_DOUBLE_WHITE = registerBlock("outside_asphalt_cyan_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_DASHED_YELLOW = registerBlock("outside_asphalt_cyan_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_DASHED_WHITE = registerBlock("outside_asphalt_cyan_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_DOTTED_WHITE = registerBlock("outside_asphalt_cyan_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_DOTTED_YELLOW = registerBlock("outside_asphalt_cyan_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_SINGLE_WHITE = registerBlock("outside_asphalt_cyan_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_SINGLE_YELLOW = registerBlock("outside_asphalt_cyan_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_CYAN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_cyan_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Cyan Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN = registerBlock("outside_asphalt_bricks_cyan",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cyan_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cyan_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cyan_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cyan_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cyan_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cyan_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cyan_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cyan_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CYAN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cyan_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Cyan Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN = registerBlock("outside_asphalt_bricks_cracked_cyan",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_cyan_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_cyan_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_cyan_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_cyan_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_cyan_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_cyan_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_cyan_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_cyan_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_CYAN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_cyan_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Cyan Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN = registerBlock("outside_asphalt_bricks_mossy_cyan",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_cyan_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_cyan_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_cyan_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_cyan_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_cyan_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_cyan_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_cyan_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_cyan_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_CYAN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_cyan_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Cyan Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN = registerBlock("outside_asphalt_smooth_cyan",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_cyan_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_cyan_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_cyan_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_DASHED_WHITE = registerBlock("outside_asphalt_smooth_cyan_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_cyan_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_cyan_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_cyan_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_cyan_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_CYAN_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_cyan_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Gray Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_GRAY = registerBlock("outside_asphalt_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Gray Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY = registerBlock("outside_asphalt_bricks_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_bricks_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Gray Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY = registerBlock("outside_asphalt_bricks_cracked_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Gray Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY = registerBlock("outside_asphalt_bricks_mossy_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Gray Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY = registerBlock("outside_asphalt_smooth_gray",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_gray_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_gray_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_gray_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_DASHED_WHITE = registerBlock("outside_asphalt_smooth_gray_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_gray_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_gray_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_gray_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_gray_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_GRAY_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_gray_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Blue Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE = registerBlock("outside_asphalt_light_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_light_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_light_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_light_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_light_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_light_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_light_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_light_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_light_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIGHT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_light_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Blue Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE = registerBlock("outside_asphalt_bricks_light_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_light_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_light_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_light_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_light_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_light_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_light_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_light_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_light_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIGHT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_light_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Blue Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE = registerBlock("outside_asphalt_bricks_cracked_light_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_light_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_light_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIGHT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_light_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Blue Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE = registerBlock("outside_asphalt_bricks_mossy_light_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_light_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_light_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIGHT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_light_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Light Blue Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE = registerBlock("outside_asphalt_smooth_light_blue",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_light_blue_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_light_blue_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_light_blue_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DASHED_WHITE = registerBlock("outside_asphalt_smooth_light_blue_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_light_blue_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_light_blue_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_light_blue_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_light_blue_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIGHT_BLUE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_light_blue_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Lime Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_LIME = registerBlock("outside_asphalt_lime",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_DOUBLE_YELLOW = registerBlock("outside_asphalt_lime_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_DOUBLE_WHITE = registerBlock("outside_asphalt_lime_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_DASHED_YELLOW = registerBlock("outside_asphalt_lime_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_DASHED_WHITE = registerBlock("outside_asphalt_lime_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_DOTTED_WHITE = registerBlock("outside_asphalt_lime_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_DOTTED_YELLOW = registerBlock("outside_asphalt_lime_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_SINGLE_WHITE = registerBlock("outside_asphalt_lime_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_SINGLE_YELLOW = registerBlock("outside_asphalt_lime_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_LIME_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_lime_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Lime Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME = registerBlock("outside_asphalt_bricks_lime",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_lime_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_lime_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_lime_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_DASHED_WHITE = registerBlock("outside_asphalt_bricks_lime_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_lime_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_lime_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_lime_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_lime_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_LIME_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_lime_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Lime Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME = registerBlock("outside_asphalt_bricks_cracked_lime",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_lime_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_lime_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_lime_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_lime_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_lime_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_lime_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_lime_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_lime_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_LIME_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_lime_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Lime Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME = registerBlock("outside_asphalt_bricks_mossy_lime",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_lime_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_lime_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_lime_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_lime_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_lime_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_lime_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_lime_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_lime_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_LIME_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_lime_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Lime Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME = registerBlock("outside_asphalt_smooth_lime",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_lime_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_lime_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_lime_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_DASHED_WHITE = registerBlock("outside_asphalt_smooth_lime_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_lime_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_lime_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_lime_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_lime_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_LIME_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_lime_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Magenta Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_MAGENTA = registerBlock("outside_asphalt_magenta",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_DOUBLE_YELLOW = registerBlock("outside_asphalt_magenta_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_DOUBLE_WHITE = registerBlock("outside_asphalt_magenta_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_DASHED_YELLOW = registerBlock("outside_asphalt_magenta_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_DASHED_WHITE = registerBlock("outside_asphalt_magenta_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_DOTTED_WHITE = registerBlock("outside_asphalt_magenta_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_DOTTED_YELLOW = registerBlock("outside_asphalt_magenta_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_SINGLE_WHITE = registerBlock("outside_asphalt_magenta_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_SINGLE_YELLOW = registerBlock("outside_asphalt_magenta_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_MAGENTA_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_magenta_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Magenta Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA = registerBlock("outside_asphalt_bricks_magenta",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_magenta_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_magenta_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_magenta_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_DASHED_WHITE = registerBlock("outside_asphalt_bricks_magenta_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_magenta_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_magenta_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_magenta_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_magenta_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MAGENTA_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_magenta_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Magenta Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA = registerBlock("outside_asphalt_bricks_cracked_magenta",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_magenta_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_magenta_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_magenta_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_magenta_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_magenta_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_magenta_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_magenta_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_magenta_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_MAGENTA_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_magenta_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Magenta Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA = registerBlock("outside_asphalt_bricks_mossy_magenta",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_magenta_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_magenta_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_magenta_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_magenta_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_magenta_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_magenta_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_magenta_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_magenta_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_MAGENTA_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_magenta_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Magenta Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA = registerBlock("outside_asphalt_smooth_magenta",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_magenta_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_magenta_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_magenta_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DASHED_WHITE = registerBlock("outside_asphalt_smooth_magenta_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_magenta_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_magenta_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_magenta_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_magenta_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_MAGENTA_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_magenta_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));




    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Orange Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_ORANGE = registerBlock("outside_asphalt_orange",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_DOUBLE_YELLOW = registerBlock("outside_asphalt_orange_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_DOUBLE_WHITE = registerBlock("outside_asphalt_orange_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_DASHED_YELLOW = registerBlock("outside_asphalt_orange_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_DASHED_WHITE = registerBlock("outside_asphalt_orange_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_DOTTED_WHITE = registerBlock("outside_asphalt_orange_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_DOTTED_YELLOW = registerBlock("outside_asphalt_orange_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_SINGLE_WHITE = registerBlock("outside_asphalt_orange_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_SINGLE_YELLOW = registerBlock("outside_asphalt_orange_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_ORANGE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_orange_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Orange Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE = registerBlock("outside_asphalt_bricks_orange",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_orange_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_orange_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_orange_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_orange_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_orange_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_orange_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_orange_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_orange_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_ORANGE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_orange_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Orange Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE = registerBlock("outside_asphalt_bricks_cracked_orange",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_orange_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_orange_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_orange_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_orange_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_orange_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_orange_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_orange_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_orange_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_ORANGE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_orange_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Orange Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE = registerBlock("outside_asphalt_bricks_mossy_orange",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_orange_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_orange_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_orange_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_orange_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_orange_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_orange_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_orange_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_orange_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_ORANGE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_orange_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Orange Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE = registerBlock("outside_asphalt_smooth_orange",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_orange_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_orange_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_orange_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_DASHED_WHITE = registerBlock("outside_asphalt_smooth_orange_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_orange_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_orange_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_orange_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_orange_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_ORANGE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_orange_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Pink Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_PINK = registerBlock("outside_asphalt_pink",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_DOUBLE_YELLOW = registerBlock("outside_asphalt_pink_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_DOUBLE_WHITE = registerBlock("outside_asphalt_pink_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_DASHED_YELLOW = registerBlock("outside_asphalt_pink_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_DASHED_WHITE = registerBlock("outside_asphalt_pink_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_DOTTED_WHITE = registerBlock("outside_asphalt_pink_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_DOTTED_YELLOW = registerBlock("outside_asphalt_pink_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_SINGLE_WHITE = registerBlock("outside_asphalt_pink_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_SINGLE_YELLOW = registerBlock("outside_asphalt_pink_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PINK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_pink_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Pink Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK = registerBlock("outside_asphalt_bricks_pink",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_pink_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_pink_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_pink_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_DASHED_WHITE = registerBlock("outside_asphalt_bricks_pink_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_pink_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_pink_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_pink_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_pink_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PINK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_pink_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Pink Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK = registerBlock("outside_asphalt_bricks_cracked_pink",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_pink_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_pink_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_pink_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_pink_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_pink_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_pink_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_pink_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_pink_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PINK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_pink_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Pink Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK = registerBlock("outside_asphalt_bricks_mossy_pink",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_pink_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_pink_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_pink_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_pink_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_pink_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_pink_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_pink_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_pink_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PINK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_pink_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Pink Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK = registerBlock("outside_asphalt_smooth_pink",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_pink_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_pink_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_pink_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_DASHED_WHITE = registerBlock("outside_asphalt_smooth_pink_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_pink_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_pink_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_pink_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_pink_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PINK_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_pink_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Purple Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_PURPLE = registerBlock("outside_asphalt_purple",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_DOUBLE_YELLOW = registerBlock("outside_asphalt_purple_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_DOUBLE_WHITE = registerBlock("outside_asphalt_purple_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_DASHED_YELLOW = registerBlock("outside_asphalt_purple_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_DASHED_WHITE = registerBlock("outside_asphalt_purple_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_DOTTED_WHITE = registerBlock("outside_asphalt_purple_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_DOTTED_YELLOW = registerBlock("outside_asphalt_purple_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_SINGLE_WHITE = registerBlock("outside_asphalt_purple_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_SINGLE_YELLOW = registerBlock("outside_asphalt_purple_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_PURPLE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_purple_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public static final Block OUTSIDE_ASPHALT_PURPLE_DIAGONAL_WHITE = registerBlock("outside_asphalt_purple_diagonal_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Purple Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE = registerBlock("outside_asphalt_bricks_purple",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_purple_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_purple_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_purple_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_purple_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_purple_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_purple_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_purple_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_purple_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_PURPLE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_purple_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Purple Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE = registerBlock("outside_asphalt_bricks_cracked_purple",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_purple_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_purple_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_purple_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_purple_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_purple_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_purple_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_purple_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_purple_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_PURPLE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_purple_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Purple Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE = registerBlock("outside_asphalt_bricks_mossy_purple",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_purple_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_purple_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_purple_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_purple_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_purple_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_purple_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_purple_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_purple_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_PURPLE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_purple_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Purple Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE = registerBlock("outside_asphalt_smooth_purple",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_purple_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_purple_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_purple_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_DASHED_WHITE = registerBlock("outside_asphalt_smooth_purple_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_purple_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_purple_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_purple_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_purple_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_PURPLE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_purple_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // White Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_WHITE = registerBlock("outside_asphalt_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_DOUBLE_YELLOW = registerBlock("outside_asphalt_white_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_DOUBLE_WHITE = registerBlock("outside_asphalt_white_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_DASHED_YELLOW = registerBlock("outside_asphalt_white_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_DASHED_WHITE = registerBlock("outside_asphalt_white_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_DOTTED_WHITE = registerBlock("outside_asphalt_white_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_DOTTED_YELLOW = registerBlock("outside_asphalt_white_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_SINGLE_WHITE = registerBlock("outside_asphalt_white_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_SINGLE_YELLOW = registerBlock("outside_asphalt_white_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_WHITE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_white_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // White Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE = registerBlock("outside_asphalt_bricks_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_white_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_white_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_white_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_white_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_white_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_white_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_white_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_white_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_WHITE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_white_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // White Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE = registerBlock("outside_asphalt_bricks_cracked_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_white_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_white_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_white_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_white_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_white_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_white_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_white_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_white_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_WHITE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_white_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // White Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE = registerBlock("outside_asphalt_bricks_mossy_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_white_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_white_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_white_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_white_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_white_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_white_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_white_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_white_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_WHITE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_white_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // White Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE = registerBlock("outside_asphalt_smooth_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_white_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_white_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_white_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_DASHED_WHITE = registerBlock("outside_asphalt_smooth_white_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_white_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_white_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_white_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_white_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_WHITE_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_white_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Yellow Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_YELLOW = registerBlock("outside_asphalt_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_DOUBLE_YELLOW = registerBlock("outside_asphalt_yellow_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_DOUBLE_WHITE = registerBlock("outside_asphalt_yellow_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_DASHED_YELLOW = registerBlock("outside_asphalt_yellow_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_DASHED_WHITE = registerBlock("outside_asphalt_yellow_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_DOTTED_WHITE = registerBlock("outside_asphalt_yellow_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_DOTTED_YELLOW = registerBlock("outside_asphalt_yellow_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_SINGLE_WHITE = registerBlock("outside_asphalt_yellow_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_SINGLE_YELLOW = registerBlock("outside_asphalt_yellow_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_YELLOW_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_yellow_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Yellow Asphalt Bricks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW = registerBlock("outside_asphalt_bricks_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_yellow_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_yellow_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_yellow_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_DASHED_WHITE = registerBlock("outside_asphalt_bricks_yellow_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_yellow_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_yellow_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_yellow_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_yellow_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_YELLOW_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_yellow_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Yellow Asphalt Bricks - Cracked
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_yellow_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_yellow_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_yellow_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DASHED_WHITE = registerBlock("outside_asphalt_bricks_cracked_yellow_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_cracked_yellow_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_cracked_yellow_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_cracked_yellow_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_cracked_yellow_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_YELLOW_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_cracked_yellow_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Yellow Asphalt Bricks - Mossy
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW = registerBlock("outside_asphalt_bricks_mossy_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOUBLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_yellow_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOUBLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_yellow_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DASHED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_yellow_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DASHED_WHITE = registerBlock("outside_asphalt_bricks_mossy_yellow_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOTTED_WHITE = registerBlock("outside_asphalt_bricks_mossy_yellow_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_DOTTED_YELLOW = registerBlock("outside_asphalt_bricks_mossy_yellow_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_SINGLE_WHITE = registerBlock("outside_asphalt_bricks_mossy_yellow_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_SINGLE_YELLOW = registerBlock("outside_asphalt_bricks_mossy_yellow_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_YELLOW_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_bricks_mossy_yellow_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Yellow Asphalt - Smooth
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW = registerBlock("outside_asphalt_smooth_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOUBLE_YELLOW = registerBlock("outside_asphalt_smooth_yellow_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOUBLE_WHITE = registerBlock("outside_asphalt_smooth_yellow_double_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_DASHED_YELLOW = registerBlock("outside_asphalt_smooth_yellow_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_DASHED_WHITE = registerBlock("outside_asphalt_smooth_yellow_dashed_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOTTED_WHITE = registerBlock("outside_asphalt_smooth_yellow_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_DOTTED_YELLOW = registerBlock("outside_asphalt_smooth_yellow_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_SINGLE_WHITE = registerBlock("outside_asphalt_smooth_yellow_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_SINGLE_YELLOW = registerBlock("outside_asphalt_smooth_yellow_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_YELLOW_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_smooth_yellow_single_white_thick",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));




    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Asphalt Bricks Slab
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_RED = registerBlock("outside_asphalt_bricks_slab_red",
            new SlabBlock( AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_PURPLE = registerBlock("outside_asphalt_bricks_slab_purple",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_LIGHT_GRAY = registerBlock("outside_asphalt_bricks_slab_light_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_BLACK = registerBlock("outside_asphalt_bricks_slab_black",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_GRAY = registerBlock("outside_asphalt_bricks_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_WHITE = registerBlock("outside_asphalt_bricks_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_BLUE = registerBlock("outside_asphalt_bricks_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_BROWN = registerBlock("outside_asphalt_bricks_slab_brown",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_CYAN = registerBlock("outside_asphalt_bricks_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_GREEN = registerBlock("outside_asphalt_bricks_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_LIGHT_BLUE = registerBlock("outside_asphalt_bricks_slab_light_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_LIME = registerBlock("outside_asphalt_bricks_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_MAGENTA = registerBlock("outside_asphalt_bricks_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_ORANGE = registerBlock("outside_asphalt_bricks_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_PINK = registerBlock("outside_asphalt_bricks_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_SLAB_YELLOW = registerBlock("outside_asphalt_bricks_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Asphalt Bricks Cracked Slab
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_RED = registerBlock("outside_asphalt_bricks_cracked_slab_red",
            new SlabBlock( AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_PURPLE = registerBlock("outside_asphalt_bricks_cracked_slab_purple",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_LIGHT_GRAY = registerBlock("outside_asphalt_bricks_cracked_slab_light_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_BLACK = registerBlock("outside_asphalt_bricks_cracked_slab_black",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_GRAY = registerBlock("outside_asphalt_bricks_cracked_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_WHITE = registerBlock("outside_asphalt_bricks_cracked_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_BLUE = registerBlock("outside_asphalt_bricks_cracked_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_BROWN = registerBlock("outside_asphalt_bricks_cracked_slab_brown",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_CYAN = registerBlock("outside_asphalt_bricks_cracked_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_GREEN = registerBlock("outside_asphalt_bricks_cracked_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_LIGHT_BLUE = registerBlock("outside_asphalt_bricks_cracked_slab_light_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_LIME = registerBlock("outside_asphalt_bricks_cracked_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_MAGENTA = registerBlock("outside_asphalt_bricks_cracked_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_ORANGE = registerBlock("outside_asphalt_bricks_cracked_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_PINK = registerBlock("outside_asphalt_bricks_cracked_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_CRACKED_SLAB_YELLOW = registerBlock("outside_asphalt_bricks_cracked_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Asphalt Bricks Mossy Slab
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_RED = registerBlock("outside_asphalt_bricks_mossy_slab_red",
            new SlabBlock( AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_PURPLE = registerBlock("outside_asphalt_bricks_mossy_slab_purple",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_LIGHT_GRAY = registerBlock("outside_asphalt_bricks_mossy_slab_light_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_BLACK = registerBlock("outside_asphalt_bricks_mossy_slab_black",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_GRAY = registerBlock("outside_asphalt_bricks_mossy_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_WHITE = registerBlock("outside_asphalt_bricks_mossy_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_BLUE = registerBlock("outside_asphalt_bricks_mossy_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_BROWN = registerBlock("outside_asphalt_bricks_mossy_slab_brown",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_CYAN = registerBlock("outside_asphalt_bricks_mossy_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_GREEN = registerBlock("outside_asphalt_bricks_mossy_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_LIGHT_BLUE = registerBlock("outside_asphalt_bricks_mossy_slab_light_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_LIME = registerBlock("outside_asphalt_bricks_mossy_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_MAGENTA = registerBlock("outside_asphalt_bricks_mossy_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_ORANGE = registerBlock("outside_asphalt_bricks_mossy_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_PINK = registerBlock("outside_asphalt_bricks_mossy_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_BRICKS_MOSSY_SLAB_YELLOW = registerBlock("outside_asphalt_bricks_mossy_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Asphalt Slab
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SLAB_RED = registerBlock("outside_asphalt_slab_red",
            new SlabBlock( AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_PURPLE = registerBlock("outside_asphalt_slab_purple",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_LIGHT_GRAY = registerBlock("outside_asphalt_slab_light_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_BLACK = registerBlock("outside_asphalt_slab_black",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_GRAY = registerBlock("outside_asphalt_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_WHITE = registerBlock("outside_asphalt_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_BLUE = registerBlock("outside_asphalt_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_BROWN = registerBlock("outside_asphalt_slab_brown",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_CYAN = registerBlock("outside_asphalt_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_GREEN = registerBlock("outside_asphalt_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_LIGHT_BLUE = registerBlock("outside_asphalt_slab_light_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_LIME = registerBlock("outside_asphalt_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_MAGENTA = registerBlock("outside_asphalt_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_ORANGE = registerBlock("outside_asphalt_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_PINK = registerBlock("outside_asphalt_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SLAB_YELLOW = registerBlock("outside_asphalt_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Asphalt Slab
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_RED = registerBlock("outside_asphalt_smooth_slab_red",
            new SlabBlock( AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_PURPLE = registerBlock("outside_asphalt_smooth_slab_purple",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_LIGHT_GRAY = registerBlock("outside_asphalt_smooth_slab_light_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_BLACK = registerBlock("outside_asphalt_smooth_slab_black",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_GRAY = registerBlock("outside_asphalt_smooth_slab_gray",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_WHITE = registerBlock("outside_asphalt_smooth_slab_white",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_BLUE = registerBlock("outside_asphalt_smooth_slab_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_BROWN = registerBlock("outside_asphalt_smooth_slab_brown",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_CYAN = registerBlock("outside_asphalt_smooth_slab_cyan",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_GREEN = registerBlock("outside_asphalt_smooth_slab_green",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_LIGHT_BLUE = registerBlock("outside_asphalt_smooth_slab_light_blue",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_LIME = registerBlock("outside_asphalt_smooth_slab_lime",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_MAGENTA = registerBlock("outside_asphalt_smooth_slab_magenta",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_ORANGE = registerBlock("outside_asphalt_smooth_slab_orange",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_PINK = registerBlock("outside_asphalt_smooth_slab_pink",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_SMOOTH_SLAB_YELLOW = registerBlock("outside_asphalt_smooth_slab_yellow",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Wet Asphalt
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_ASPHALT_WET_RED = registerBlock("outside_asphalt_wet_red",
            new WetAsphaltBlock(Dryable.DryLevel.WET, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_PURPLE = registerBlock("outside_asphalt_wet_purple",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_LIGHT_GRAY = registerBlock("outside_asphalt_wet_light_gray",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_BLACK = registerBlock("outside_asphalt_wet_black",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_GRAY = registerBlock("outside_asphalt_wet_gray",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_WHITE = registerBlock("outside_asphalt_wet_white",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_BLUE = registerBlock("outside_asphalt_wet_blue",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_BROWN = registerBlock("outside_asphalt_wet_brown",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_CYAN = registerBlock("outside_asphalt_wet_cyan",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_GREEN = registerBlock("outside_asphalt_wet_green",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_LIGHT_BLUE = registerBlock("outside_asphalt_wet_light_blue",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_LIME = registerBlock("outside_asphalt_wet_lime",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_MAGENTA = registerBlock("outside_asphalt_wet_magenta",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_ORANGE = registerBlock("outside_asphalt_wet_orange",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_PINK = registerBlock("outside_asphalt_wet_pink",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));
    public static final Block OUTSIDE_ASPHALT_WET_YELLOW = registerBlock("outside_asphalt_wet_yellow",
            new WetAsphaltBlock(Dryable.DryLevel.WET,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.MUD)));




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
    public static final Block OUTSIDE_SIGN_YIELD = registerBlock("outside_sign_yield",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_WRONGWAY = registerBlock("outside_sign_wrongway",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_NOPARKING = registerBlock("outside_sign_noparking",
            new NoParkingSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_TRAFFICLIGHTAHEAD = registerBlock("outside_sign_trafficlightahead",
            new TrafficLightAheadSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_DONOTENTER = registerBlock("outside_sign_donotenter",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_DEADEND = registerBlock("outside_sign_deadend",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_CAUTION = registerBlock("outside_sign_caution",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_SPEEDLIMIT = registerBlock("outside_sign_speedlimit",
            new SpeedLimitSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_TRAFFIC_LIGHT = registerBlock("outside_sign_traffic_light",
            new TrafficLightBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

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
    public static final Block OUTSIDE_STREETLIGHT_REDSTONE = registerBlock("outside_streetlight_redstone",
            new StreetLightRedstoneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(1f).luminance(state -> 14).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                             Manhole                                                         //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Manhole
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_MANHOLE_COVER = registerBlock("outside_manhole_cover",
            new ManholeCoverBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_MANHOLE_TUNNEL = registerBlock("outside_manhole_tunnel",
            new ManholeTunnelBlock(FabricBlockSettings.copyOf(Blocks.LADDER).strength(1f).sounds(BlockSoundGroup.LADDER).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                             Tar / Oil                                                       //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Tar Block
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_TAR_TAR_BLOCK = registerBlock("building_tar_tar_block",
            new TarBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).velocityMultiplier(0.5f).jumpVelocityMultiplier(0.6f).nonOpaque().slipperiness(0.8f).sounds(BlockSoundGroup.SLIME)));
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Oil Block
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_TAR_OIL_BLOCK = registerBlock("building_tar_oil_block",
            new OilBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).nonOpaque().slipperiness(0.989f).sounds(BlockSoundGroup.SLIME)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                             Workstations                                                       //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Paint Bucket
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_BUCKET_PAINT = registerBlock("outside_bucket_paint",
            new PaintBucketBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                             Cast Iron                                                       //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Cast Iron Block
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block BUILDING_CAST_IRON_BLOCK = registerBlock("building_cast_iron_block",
            new CastIronBlock(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BLOCK_EXPOSED = registerBlock("building_cast_iron_block_exposed",
            new CastIronBlock(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BLOCK_WEATHERED = registerBlock("building_cast_iron_block_weathered",
            new CastIronBlock(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BLOCK_RUSTED = registerBlock("building_cast_iron_block_rusted",
            new CastIronBlock(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_BLOCK = registerBlock("building_cast_iron_bricks_block",
            new CastIronBlock(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_BLOCK_EXPOSED = registerBlock("building_cast_iron_bricks_block_exposed",
            new CastIronBlock(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_BLOCK_WEATHERED = registerBlock("building_cast_iron_bricks_block_weathered",
            new CastIronBlock(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_BLOCK_RUSTED = registerBlock("building_cast_iron_bricks_block_rusted",
            new CastIronBlock(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));


    public static final Block BUILDING_CAST_IRON_SMOOTH_BLOCK = registerBlock("building_cast_iron_smooth_block",
            new CastIronBlock(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SMOOTH_BLOCK_EXPOSED = registerBlock("building_cast_iron_smooth_block_exposed",
            new CastIronBlock(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SMOOTH_BLOCK_WEATHERED = registerBlock("building_cast_iron_smooth_block_weathered",
            new CastIronBlock(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SMOOTH_BLOCK_RUSTED = registerBlock("building_cast_iron_smooth_block_rusted",
            new CastIronBlock(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));

    public static final Block BUILDING_CAST_IRON_SMOOTH_SLAB = registerBlock("building_cast_iron_smooth_slab",
            new CastIronSlab(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SMOOTH_SLAB_EXPOSED = registerBlock("building_cast_iron_smooth_slab_exposed",
            new CastIronSlab(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SMOOTH_SLAB_WEATHERED = registerBlock("building_cast_iron_smooth_slab_weathered",
            new CastIronSlab(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SMOOTH_SLAB_RUSTED = registerBlock("building_cast_iron_smooth_slab_rusted",
            new CastIronSlab(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));


    public static final Block BUILDING_CAST_IRON_SLAB = registerBlock("building_cast_iron_slab",
            new CastIronSlab(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SLAB_EXPOSED = registerBlock("building_cast_iron_slab_exposed",
            new CastIronSlab(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SLAB_WEATHERED = registerBlock("building_cast_iron_slab_weathered",
            new CastIronSlab(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_SLAB_RUSTED = registerBlock("building_cast_iron_slab_rusted",
            new CastIronSlab(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));

    public static final Block BUILDING_CAST_IRON_BRICKS_SLAB = registerBlock("building_cast_iron_bricks_slab",
            new CastIronSlab(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_SLAB_EXPOSED = registerBlock("building_cast_iron_bricks_slab_exposed",
            new CastIronSlab(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_SLAB_WEATHERED = registerBlock("building_cast_iron_bricks_slab_weathered",
            new CastIronSlab(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BRICKS_SLAB_RUSTED = registerBlock("building_cast_iron_bricks_slab_rusted",
            new CastIronSlab(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));

    public static final Block BUILDING_CAST_IRON_GRATE = registerBlock("building_cast_iron_grate",
            new CastIronBlock(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_GRATE_EXPOSED = registerBlock("building_cast_iron_grate_exposed",
            new CastIronBlock(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_GRATE_WEATHERED = registerBlock("building_cast_iron_grate_weathered",
            new CastIronBlock(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_GRATE_RUSTED = registerBlock("building_cast_iron_grate_rusted",
            new CastIronBlock(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));


    public static final Block BUILDING_CAST_IRON_BEAM = registerBlock("building_cast_iron_beam",
            new CastIronBeamBlock(Rustable.RustLevel.UNAFFECTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BEAM_EXPOSED = registerBlock("building_cast_iron_beam_exposed",
            new CastIronBeamBlock(Rustable.RustLevel.EXPOSED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BEAM_WEATHERED = registerBlock("building_cast_iron_beam_weathered",
            new CastIronBeamBlock(Rustable.RustLevel.WEATHERED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));
    public static final Block BUILDING_CAST_IRON_BEAM_RUSTED = registerBlock("building_cast_iron_beam_rusted",
            new CastIronBeamBlock(Rustable.RustLevel.RUSTED,AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.ANVIL)));

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Paths
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    public static final Block BUILDING_PATH_DIRTYCOBBLESTONE = registerBlock("building_path_dirtycobblestone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block BUILDING_PATH_SANDYCOBBLESTONE = registerBlock("building_path_sandycobblestone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.STONE)));

    public static final Block BUILDING_PATH_SANDYDIRT = registerBlock("building_path_sandydirt",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.STONE)));

    public static final Block BUILDING_PATH_SANDYGRAVEL = registerBlock("building_path_sandygravel",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.STONE)));

    public static final Block BUILDING_PATH_DIRTYGRAVEL = registerBlock("building_path_dirtygravel",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.STONE)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Hedges
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    public static final Block OAK_HEDGE = registerBlock("building_hedge_oak", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block SPRUCE_HEDGE = registerBlock("building_hedge_spruce", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block BIRCH_HEDGE = registerBlock("building_hedge_birch", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block JUNGLE_HEDGE = registerBlock("building_hedge_jungle", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block ACACIA_HEDGE = registerBlock("building_hedge_acacia", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block CHERRY_HEDGE = registerBlock("building_hedge_cherry", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block DARK_OAK_HEDGE = registerBlock("building_hedge_dark_oak", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block MANGROVE_HEDGE = registerBlock("building_hedge_mangrove", ModBlocks.createHedgeBlock(BlockSoundGroup.GRASS));
    public static final Block AZALEA_HEDGE = registerBlock("building_hedge_azalea", ModBlocks.createHedgeBlock(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_HEDGE = registerBlock("building_hedge_flowering_azalea", ModBlocks.createHedgeBlock(BlockSoundGroup.AZALEA_LEAVES));
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Planters
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    public static final Block OAK_PLANTER = registerBlock("building_planter_oak", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block SPRUCE_PLANTER = registerBlock("building_planter_spruce", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block BIRCH_PLANTER = registerBlock("building_planter_birch", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block JUNGLE_PLANTER = registerBlock("building_planter_jungle", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block ACACIA_PLANTER = registerBlock("building_planter_acacia", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block CHERRY_PLANTER = registerBlock("building_planter_cherry", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block DARK_OAK_PLANTER = registerBlock("building_planter_dark_oak", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block MANGROVE_PLANTER = registerBlock("building_planter_mangrove", ModBlocks.createPlanterBlock(BlockSoundGroup.GRASS));
    public static final Block AZALEA_PLANTER = registerBlock("building_planter_azalea", ModBlocks.createPlanterBlock(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_PLANTER = registerBlock("building_planter_flowering_azalea", ModBlocks.createPlanterBlock(BlockSoundGroup.AZALEA_LEAVES));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Wood Stacks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_WOODSTACK_OAK = registerBlock("outside_woodstack_oak",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_BIRCH = registerBlock("outside_woodstack_birch",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_SPRUCE = registerBlock("outside_woodstack_spruce",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_JUNGLE = registerBlock("outside_woodstack_jungle",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_DARK_OAK = registerBlock("outside_woodstack_dark_oak",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_CHERRY = registerBlock("outside_woodstack_cherry",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_MANGROVE = registerBlock("outside_woodstack_mangrove",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_ACACIA = registerBlock("outside_woodstack_acacia",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_WOODSTACK_STRIPPED_OAK = registerBlock("outside_woodstack_stripped_oak",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_BIRCH = registerBlock("outside_woodstack_stripped_birch",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_SPRUCE = registerBlock("outside_woodstack_stripped_spruce",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_JUNGLE = registerBlock("outside_woodstack_stripped_jungle",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_DARK_OAK = registerBlock("outside_woodstack_stripped_dark_oak",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_CHERRY = registerBlock("outside_woodstack_stripped_cherry",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_MANGROVE = registerBlock("outside_woodstack_stripped_mangrove",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_WOODSTACK_STRIPPED_ACACIA = registerBlock("outside_woodstack_stripped_acacia",
            new WoodStackBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));


    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Log Fence
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    public static final Block OUTSIDE_FENCE_OAK = registerBlock("outside_fence_oak",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_SPRUCE = registerBlock("outside_fence_spruce",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_BIRCH = registerBlock("outside_fence_birch",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_JUNGLE = registerBlock("outside_fence_jungle",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_ACACIA = registerBlock("outside_fence_acacia",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_DARK_OAK = registerBlock("outside_fence_dark_oak",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_MANGROVE = registerBlock("outside_fence_mangrove",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_FENCE_CHERRY = registerBlock("outside_fence_cherry",
            new HorizonalFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_LOGFENCE_OAK = registerBlock("outside_logfence_oak",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_SPRUCE = registerBlock("outside_logfence_spruce",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_BIRCH = registerBlock("outside_logfence_birch",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_JUNGLE = registerBlock("outside_logfence_jungle",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_ACACIA = registerBlock("outside_logfence_acacia",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_DARK_OAK = registerBlock("outside_logfence_dark_oak",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_MANGROVE = registerBlock("outside_logfence_mangrove",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_CHERRY = registerBlock("outside_logfence_cherry",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_LOGFENCE_STRIPPED_OAK = registerBlock("outside_logfence_stripped_oak",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_SPRUCE = registerBlock("outside_logfence_stripped_spruce",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_BIRCH = registerBlock("outside_logfence_stripped_birch",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_JUNGLE = registerBlock("outside_logfence_stripped_jungle",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_ACACIA = registerBlock("outside_logfence_stripped_acacia",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_DARK_OAK = registerBlock("outside_logfence_stripped_dark_oak",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_MANGROVE = registerBlock("outside_logfence_stripped_mangrove",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_CHERRY = registerBlock("outside_logfence_stripped_cherry",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_LOGFENCE_OAK_THICK = registerBlock("outside_logfence_oak_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_SPRUCE_THICK = registerBlock("outside_logfence_spruce_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_BIRCH_THICK = registerBlock("outside_logfence_birch_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_JUNGLE_THICK = registerBlock("outside_logfence_jungle_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_ACACIA_THICK = registerBlock("outside_logfence_acacia_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_DARK_OAK_THICK = registerBlock("outside_logfence_dark_oak_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_MANGROVE_THICK = registerBlock("outside_logfence_mangrove_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_CHERRY_THICK = registerBlock("outside_logfence_cherry_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_LOGFENCE_STRIPPED_OAK_THICK = registerBlock("outside_logfence_stripped_oak_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_SPRUCE_THICK = registerBlock("outside_logfence_stripped_spruce_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_BIRCH_THICK = registerBlock("outside_logfence_stripped_birch_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_JUNGLE_THICK = registerBlock("outside_logfence_stripped_jungle_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_ACACIA_THICK = registerBlock("outside_logfence_stripped_acacia_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_DARK_OAK_THICK = registerBlock("outside_logfence_stripped_dark_oak_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_MANGROVE_THICK = registerBlock("outside_logfence_stripped_mangrove_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_LOGFENCE_STRIPPED_CHERRY_THICK = registerBlock("outside_logfence_stripped_cherry_thick",
            new LogFenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    
    
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Statues
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block OUTSIDE_STATUE_POKEBALL = registerBlock("outside_statue_pokeball",
            new PokeballStatueBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_STATUE_RHYDON = registerBlock("outside_statue_rhydon",
            new RhydonStatueBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));




    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    //                                                                                                             //
    //                                             Cobbled                                                         //
    //                                                                                                             //
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Signs
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block COBBLED_SIGN_POKECENTER = registerBlock("cobbled_sign_pokecenter",
            new PokeCenterSign(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));
    public static final Block COBBLED_SIGN_POKEMART = registerBlock("cobbled_sign_pokemart",
            new PokeMartSign(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));
    public static final Block COBBLED_SIGN_POKEMART_HORIZONAL = registerBlock("cobbled_sign_pokemart_horizonal",
            new PokeMartHorizonalSign(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));
    public static final Block COBBLED_SIGN_POKECENTER_HORIZONAL = registerBlock("cobbled_sign_pokecenter_horizonal",
            new PokeCenterHorizonalSign(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));

    public static final Block COBBLED_SIGN_POKEMART_HORIZONAL = registerBlock("cobbled_sign_pokemart_horizonal",
            new PokeMartHorizonalSign(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));
    public static final Block COBBLED_SIGN_POKECENTER_HORIZONAL = registerBlock("cobbled_sign_pokecenter_horizonal",
            new PokeCenterHorizonalSign(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));



    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Unown Blocks
    // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public static final Block COBBLED_UNOWN_GRANITE_A = registerBlock("cobbled_unown_granite_a",
            new UnownBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));
    public static final Block COBBLED_UNOWN_GRANITE_B = registerBlock("cobbled_unown_granite_b",
            new UnownBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));
    public static final Block COBBLED_UNOWN_GRANITE_C = registerBlock("cobbled_unown_granite_c",
            new UnownBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never).sounds(BlockSoundGroup.ANVIL)));


    public static Block createHedgeBlock(BlockSoundGroup soundGroup) {
        return new HedgeBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f).ticksRandomly().sounds(soundGroup).nonOpaque().allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never));
    }
    public static Block createPlanterBlock(BlockSoundGroup soundGroup) {
        return new PlanterBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f).ticksRandomly().sounds(soundGroup).nonOpaque().allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never));
    }
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
