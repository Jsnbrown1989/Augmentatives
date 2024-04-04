package net.jephon.augmentatives.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.decor.furniture.kitchen.CounterBlock;
import net.jephon.augmentatives.block.decor.furniture.outside.*;
import net.jephon.augmentatives.block.decor.traffic.*;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DAHLIA = registerBlock("dahlia",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 10,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_DAHLIA = Registry.register(Registries.BLOCK, new Identifier(Augmentatives.MOD_ID, "potted_dahlia"),
            new FlowerPotBlock(DAHLIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

    public static final Identifier CHESTNUT_SIGN_TEXTURE = new Identifier(Augmentatives.MOD_ID, "entity/signs/chestnut");
    public static final Identifier CHESTNUT_HANGING_SIGN_TEXTURE = new Identifier(Augmentatives.MOD_ID, "entity/signs/hanging/chestnut");
    public static final Identifier CHESTNUT_HANGING_GUI_SIGN_TEXTURE = new Identifier(Augmentatives.MOD_ID, "textures/gui/hanging_signs/chestnut");

    public static final Block STANDING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(Augmentatives.MOD_ID, "chestnut_standing_sign"),
            new TerraformSignBlock(CHESTNUT_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(Augmentatives.MOD_ID, "chestnut_wall_sign"),
            new TerraformWallSignBlock(CHESTNUT_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(Augmentatives.MOD_ID, "chestnut_hanging_sign"),
            new TerraformHangingSignBlock(CHESTNUT_HANGING_SIGN_TEXTURE, CHESTNUT_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(Augmentatives.MOD_ID, "chestnut_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(CHESTNUT_HANGING_SIGN_TEXTURE, CHESTNUT_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily CHESTNUT_FAMILY = BlockFamilies.register(ModBlocks.CHESTNUT_PLANKS)
            .sign(ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();





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











    public static final Block OUTSIDE_ASPHALT_ASPHALT = registerBlock("outside_asphalt_asphalt",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_ASPHALT_GREEN = registerBlock("outside_asphalt_asphalt_green",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_ASPHALT_RED = registerBlock("outside_asphalt_asphalt_red",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_DOUBLE_YELLOW = registerBlock("outside_asphalt_double_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_DASHED_YELLOW = registerBlock("outside_asphalt_dashed_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_DOTTED_WHITE = registerBlock("outside_asphalt_dotted_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_DOTTED_YELLOW = registerBlock("outside_asphalt_dotted_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_SINGLE_WHITE = registerBlock("outside_asphalt_single_white",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_SINGLE_YELLOW = registerBlock("outside_asphalt_single_yellow",
            new AsphaltBlock(FabricBlockSettings.copyOf(Blocks.BASALT).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_ASPHALT_SINGLE_WHITE_THICK = registerBlock("outside_asphalt_single_white_thick",
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

    public static final Block OUTSIDE_SIDEWALK = registerBlock("outside_sidewalk",
            new SidewalkBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIDEWALK_SINGLE_WHITE = registerBlock("outside_sidewalk_single_white",
            new SidewalkBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_STREETLIGHT = registerBlock("outside_streetlight",
            new StreetLightBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(1f).luminance(state -> 14).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));
    public static final Block OUTSIDE_SIGN_STOP = registerBlock("outside_sign_stop",
            new StopSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));

    public static final Block OUTSIDE_SIGN_TOWN = registerBlock("outside_sign_town",
            new TownSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).nonOpaque().blockVision(Blocks::never).solidBlock(Blocks::never)));







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
