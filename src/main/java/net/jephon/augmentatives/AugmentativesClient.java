package net.jephon.augmentatives;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.entity.SeatEntity;
import net.jephon.augmentatives.util.ModSit;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class AugmentativesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModSit.SEAT, EmptyRenderer::new);

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
