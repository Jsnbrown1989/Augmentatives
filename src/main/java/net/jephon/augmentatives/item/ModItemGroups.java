package net.jephon.augmentatives.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.decorationsAugmentatives"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.COAL_BRIQUETTE);


                        entries.add(ModItems.BAR_BRAWL_MUSIC_DISC);

                        entries.add(ModItems.CHESTNUT_SIGN);
                        entries.add(ModItems.HANGING_CHESTNUT_SIGN);

                        entries.add(ModItems.CHESTNUT_BOAT);
                        entries.add(ModItems.CHESTNUT_CHEST_BOAT);



                        entries.add(ModBlocks.DAHLIA);

                        entries.add(ModBlocks.CHESTNUT_LOG);
                        entries.add(ModBlocks.CHESTNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
                        entries.add(ModBlocks.CHESTNUT_PLANKS);
                        entries.add(ModBlocks.CHESTNUT_LEAVES);
                        

                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_DARK_OAK_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_DARK_OAK_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_DARK_OAK_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_DARK_OAK_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_DARK_OAK_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_DARK_OAK_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_OAK_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_OAK_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_OAK_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_OAK_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_OAK_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_OAK_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_BIRCH_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_BIRCH_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_BIRCH_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_BIRCH_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_BIRCH_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_BIRCH_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_JUNGLE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_JUNGLE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_JUNGLE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_JUNGLE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_JUNGLE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_JUNGLE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_SPRUCE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_SPRUCE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_SPRUCE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_SPRUCE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_SPRUCE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_SPRUCE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_ACACIA_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_ACACIA_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_ACACIA_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_ACACIA_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_ACACIA_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_ACACIA_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CHERRY_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CHERRY_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CHERRY_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CHERRY_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CHERRY_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CHERRY_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_MANGROVE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_MANGROVE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_MANGROVE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_MANGROVE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_MANGROVE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_MANGROVE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_WARPED_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_WARPED_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_WARPED_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_WARPED_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_WARPED_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_WARPED_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CRIMSON_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CRIMSON_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CRIMSON_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CRIMSON_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CRIMSON_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DOORS_CRIMSON_STONE);

                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_STONE);

                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_DARK_OAK_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_DARK_OAK_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_DARK_OAK_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_DARK_OAK_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_DARK_OAK_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_DARK_OAK_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_OAK_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_OAK_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_OAK_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_OAK_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_OAK_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_OAK_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_BIRCH_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_BIRCH_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_BIRCH_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_BIRCH_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_BIRCH_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_BIRCH_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_JUNGLE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_JUNGLE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_JUNGLE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_JUNGLE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_JUNGLE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_JUNGLE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_SPRUCE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_SPRUCE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_SPRUCE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_SPRUCE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_SPRUCE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_SPRUCE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_ACACIA_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_ACACIA_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_ACACIA_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_ACACIA_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_ACACIA_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_ACACIA_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CHERRY_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CHERRY_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CHERRY_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CHERRY_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CHERRY_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CHERRY_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_MANGROVE_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_MANGROVE_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_MANGROVE_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_MANGROVE_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_MANGROVE_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_MANGROVE_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_WARPED_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_WARPED_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_WARPED_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_WARPED_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_WARPED_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_WARPED_STONE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CRIMSON_GRANITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CRIMSON_DIORITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CRIMSON_ANDESITE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CRIMSON_DEEPSLATE);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CRIMSON_TUFF);
                        entries.add(ModBlocks.KITCHEN_COUNTER_DRAWERS_CRIMSON_STONE);
                        
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_DARK_OAK_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_OAK_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_BIRCH_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_JUNGLE_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_ACACIA_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_SPRUCE_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_CHERRY_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_MANGROVE_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_CRIMSON_RED);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_WARPED_RED);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_GREEN_SINGLE_WHITE_THICK);

                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOUBLE_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOTTED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DOTTED_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_DASHED_YELLOW);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_WHITE);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_RED_SINGLE_WHITE_THICK);
                        
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ASPHALT);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ASPHALT_GREEN);
                        entries.add(ModBlocks.OUTSIDE_ASPHALT_ASPHALT_RED);

                        entries.add(ModBlocks.OUTSIDE_STREETLIGHT);



                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
