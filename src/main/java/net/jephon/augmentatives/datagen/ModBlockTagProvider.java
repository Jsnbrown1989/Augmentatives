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

        // Modded Climbable
        getOrCreateTagBuilder(ModBlockTags.CLIMBABLE)
                .add(ModBlocks.OUTSIDE_MANHOLE_COVER)
                .add(ModBlocks.OUTSIDE_MANHOLE_TUNNEL)
        ;

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

        //COUNTERS WITH GLASS DOORS
        getOrCreateTagBuilder(ModBlockTags.COUNTER_GLASS_DOORS)
        ;

        //COUNTERS WITH WOOD DOORS
        getOrCreateTagBuilder(ModBlockTags.COUNTER_DOORS)
        ;

        //COUNTERS WITH WOOD DRAWERS
        getOrCreateTagBuilder(ModBlockTags.COUNTER_DRAWERS)
        ;

        //BAR CHAIRS
        getOrCreateTagBuilder(ModBlockTags.BAR_CHAIRS)
        ;

        //BEACH CHAIRS
        getOrCreateTagBuilder(ModBlockTags.BEACH_CHAIRS)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_ACACIA)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_DARK_OAK)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_OAK)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_BIRCH)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_SPRUCE)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_CHERRY)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_MANGROVE)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_JUNGLE)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_WARPED)
                .add(ModBlocks.OUTSIDE_BEACHCHAIR_CRIMSON)
        ;

        //Manholes
        getOrCreateTagBuilder(ModBlockTags.MANHOLES)
                .add(ModBlocks.OUTSIDE_MANHOLE_COVER)
                .add(ModBlocks.OUTSIDE_MANHOLE_TUNNEL)
        ;

        //Tintables
        getOrCreateTagBuilder(ModBlockTags.TINTABLE)
                .add(ModBlocks.OAK_HEDGE)
                .add(ModBlocks.BIRCH_HEDGE)
                .add(ModBlocks.JUNGLE_HEDGE)
                .add(ModBlocks.ACACIA_HEDGE)
                .add(ModBlocks.AZALEA_HEDGE)
                .add(ModBlocks.DARK_OAK_HEDGE)
                .add(ModBlocks.MANGROVE_HEDGE)
                .add(ModBlocks.SPRUCE_HEDGE)
                .add(ModBlocks.OAK_PLANTER)
                .add(ModBlocks.BIRCH_PLANTER)
                .add(ModBlocks.JUNGLE_PLANTER)
                .add(ModBlocks.ACACIA_PLANTER)
                .add(ModBlocks.AZALEA_PLANTER)
                .add(ModBlocks.DARK_OAK_PLANTER)
                .add(ModBlocks.MANGROVE_PLANTER)
                .add(ModBlocks.SPRUCE_PLANTER)
        ;

        //GUARDRAILS
        getOrCreateTagBuilder(ModBlockTags.GUARDRAILS)
        ;
        //SEATS
        getOrCreateTagBuilder(ModBlockTags.SEATS)
                .forceAddTag(ModBlockTags.BAR_CHAIRS)
                .forceAddTag(ModBlockTags.BEACH_CHAIRS)
        ;
        //COUNTERS
        getOrCreateTagBuilder(ModBlockTags.COUNTERS)
                .forceAddTag(ModBlockTags.COUNTER_GLASS_DOORS)
                .forceAddTag(ModBlockTags.COUNTER_DOORS)
                .forceAddTag(ModBlockTags.COUNTER_DRAWERS)
        ;

    }
}