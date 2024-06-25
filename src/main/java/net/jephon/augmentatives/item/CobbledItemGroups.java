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

public class CobbledItemGroups {
    public static final ItemGroup COBBLED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "cobbled_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cobbledAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.COBBLED_SIGN_POKEMART)).entries((displayContext, entries) -> {
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Signs                                                         //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // PokeCenter
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.COBBLED_SIGN_POKECENTER);
                        entries.add(ModBlocks.COBBLED_SIGN_POKECENTER_HORIZONAL);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // PokeMart
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.COBBLED_SIGN_POKEMART);
                        entries.add(ModBlocks.COBBLED_SIGN_POKEMART_HORIZONAL);


                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Blocks                                                         //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Unown
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.COBBLED_UNOWN_GRANITE_A);
                        entries.add(ModBlocks.COBBLED_UNOWN_GRANITE_B);
                        entries.add(ModBlocks.COBBLED_UNOWN_GRANITE_C);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
