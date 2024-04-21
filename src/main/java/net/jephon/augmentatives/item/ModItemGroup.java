package net.jephon.augmentatives.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SLUDGE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "sludge_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oil_block_group"))
                    .icon(() -> new ItemStack(ModItems.SLUDGE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SLUDGE);
                        entries.add(ModItems.ROASTED_SPIDER_EYE);
                        entries.add(ModBlocks.BUILDING_TAR_OIL_BLOCK);
                        entries.add(ModBlocks.BUILDING_TAR_TAR_BLOCK);
                    }).build());

    public static void registerItemGroups() {

    }
}