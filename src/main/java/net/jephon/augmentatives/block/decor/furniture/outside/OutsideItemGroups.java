package net.jephon.augmentatives.block.decor.furniture.outside;

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

public class OutsideItemGroups {
    public static final ItemGroup OUTSIDE_BEACHCHAIR_DARK_OAK_RED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "outside_beachchair_dark_oak_red"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.exteriorAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OUTSIDE_BEACHCHAIR_DARK_OAK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_OAK);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_MANGROVE);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_CRIMSON);
                        entries.add(ModBlocks.OUTSIDE_BEACHCHAIR_WARPED);
                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
