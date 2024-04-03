package net.jephon.augmentatives.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.util.ModBlockTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        //PICKAXE MINEABLE BLOCKS
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        ;

        //HOE MINEABLE
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
        ;

        //LEAVES
        getOrCreateTagBuilder(BlockTags.LEAVES)
        ;

        //SAPLINGS
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
        ;

        //CROPS
        getOrCreateTagBuilder(BlockTags.CROPS)
        ;

        //BAR CHAIRS
        getOrCreateTagBuilder(ModBlockTags.BAR_CHAIRS)
        ;

        //BEACH CHAIRS
        getOrCreateTagBuilder(ModBlockTags.BEACH_CHAIRS)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_ACACIA_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_DARK_OAK_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_OAK_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_BIRCH_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_SPRUCE_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_CHERRY_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_MANGROVE_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_JUNGLE_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_WARPED_RED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_CRIMSON_RED)
        ;
        //SEATS
        getOrCreateTagBuilder(ModBlockTags.SEATS)
                .forceAddTag(ModBlockTags.BAR_CHAIRS)
                .forceAddTag(ModBlockTags.BEACH_CHAIRS)
        ;
    }
}