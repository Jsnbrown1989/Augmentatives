package net.jephon.augmentatives;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.entity.SeatEntity;
import net.jephon.augmentatives.util.ModSit;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class AugmentativesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModSit.SEAT, EmptyRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_BUCKET_PAINT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_ANDESITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_GRANITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_DIORITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_TUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_ACACIA_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_JUNGLE_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_OAK_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_BIRCH_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_DARK_OAK_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_SPRUCE_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CHERRY_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_MANGROVE_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_WARPED_DEEPSLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_COUNTER_GLASS_DOORS_CRIMSON_DEEPSLATE, RenderLayer.getTranslucent());


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUILDING_TAR_TAR_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUILDING_TAR_OIL_BLOCK, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_SIGN_TRAFFIC_LIGHT, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_OAK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_BIRCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_SPRUCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_JUNGLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_ACACIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_DARK_OAK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_CHERRY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OUTSIDE_WOODSTACK_MANGROVE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_HEDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERING_AZALEA_HEDGE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERING_AZALEA_PLANTER, RenderLayer.getCutout());


        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        },
                ModBlocks.OAK_HEDGE,
                ModBlocks.BIRCH_HEDGE,
                ModBlocks.JUNGLE_HEDGE,
                ModBlocks.ACACIA_HEDGE,
                ModBlocks.DARK_OAK_HEDGE,
                ModBlocks.MANGROVE_HEDGE,
                ModBlocks.SPRUCE_HEDGE,
                ModBlocks.OAK_PLANTER,
                ModBlocks.BIRCH_PLANTER,
                ModBlocks.JUNGLE_PLANTER,
                ModBlocks.ACACIA_PLANTER,
                ModBlocks.DARK_OAK_PLANTER,
                ModBlocks.MANGROVE_PLANTER,
                ModBlocks.SPRUCE_PLANTER);
    }

    private static class EmptyRenderer extends EntityRenderer<SeatEntity> {
        protected EmptyRenderer(EntityRendererFactory.Context ctx) {
            super(ctx);
        }
        @Override
        public boolean shouldRender(SeatEntity entity, Frustum frustum, double d, double e, double f) {
            return false;
        }
        @Override
        public Identifier getTexture(SeatEntity entity) {
            return null;
        }
    }
}
