package net.jephon.augmentatives.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Augmentatives.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Augmentatives.LOGGER.info("Registering Mod Items for " + Augmentatives.MOD_ID);
    }
}
