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

public class UtilityItemGroups {
    public static final ItemGroup UTILITY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Augmentatives.MOD_ID, "utility_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.utilityAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OUTSIDE_BUCKET_PAINT)).entries((displayContext, entries) -> {

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Paint Bucket                                                  //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Paint Bucket
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_BUCKET_PAINT);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Traffic Signs and Lights                                      //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Lights
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_STREETLIGHT);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_LIGHT);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Signs
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_SIGN_SPEEDLIMIT);
                        entries.add(ModBlocks.OUTSIDE_SIGN_STOP);
                        entries.add(ModBlocks.OUTSIDE_SIGN_YIELD);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_BARREL);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFIC_CONE);
                        entries.add(ModBlocks.OUTSIDE_SIGN_TRAFFICLIGHTAHEAD);
                        entries.add(ModBlocks.OUTSIDE_SIGN_CAUTION);
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Manhole                                                       //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Manhole
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_MANHOLE_COVER);
                        entries.add(ModBlocks.OUTSIDE_MANHOLE_TUNNEL);

                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
