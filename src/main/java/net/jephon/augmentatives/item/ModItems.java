package net.jephon.augmentatives.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jephon.augmentatives.Augmentatives;
import net.jephon.augmentatives.block.ModBlocks;
import net.jephon.augmentatives.entity.ModBoats;
import net.jephon.augmentatives.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new MusicDiscItem(7, ModSounds.BAR_BRAWL, new FabricItemSettings().maxCount(1), 122));

    public static final Item CHESTNUT_SIGN = registerItem("chestnut_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN));
    public static final Item HANGING_CHESTNUT_SIGN = registerItem("chestnut_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_CHESTNUT_SIGN, ModBlocks.WALL_HANGING_CHESTNUT_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item CHESTNUT_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHESTNUT_BOAT_ID, ModBoats.CHESTNUT_BOAT_KEY, false);
    public static final Item CHESTNUT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHESTNUT_CHEST_BOAT_ID, ModBoats.CHESTNUT_BOAT_KEY, true);



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Augmentatives.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Augmentatives.LOGGER.info("Registering Mod Items for " + Augmentatives.MOD_ID);
    }
}
