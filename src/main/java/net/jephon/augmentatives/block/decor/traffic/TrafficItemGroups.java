package net.jephon.augmentatives.block.decor.traffic;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TrafficItemGroups {
    public static final ItemGroup OUTSIDE_SIGN_STOP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "outside_sign_stop"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.trafficAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OUTSIDE_SIGN_STOP)).entries((displayContext, entries) -> {

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
                        entries.add(ModBlocks.OUTSIDE_SIGN_STOP);
                        entries.add(ModBlocks.OUTSIDE_SIDEWALK);
                        entries.add(ModBlocks.OUTSIDE_SIDEWALK_SINGLE_WHITE);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
