package net.jephon.augmentatives.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OIL_ITEM = registerItem("oil_item",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Augmentatives.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(OIL_ITEM);

        entries.add(ModBlocks.BUILDING_TAR_OIL_BLOCK);
        entries.add(ModBlocks.BUILDING_TAR_TAR_BLOCK);
    }

    public static void registerModItems() {
        Augmentatives.LOGGER.info("Registering Mod Items for " + Augmentatives.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
