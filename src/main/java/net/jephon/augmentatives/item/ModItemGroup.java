package net.jephon.augmentatives.item;package net.kaupenjoe.mccourse.item;

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
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "oil_block_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group"))
                    .icon(() -> new ItemStack(ModItems.OIL_ITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OIL_ITEM);

                        entries.add(ModBlocks.BUILDING_TAR_OIL_BLOCK);
                        entries.add(ModBlocks.BUILDING_TAR_TAR_BLOCK);
                    }).build());

    public static void registerItemGroups() {

    }
}