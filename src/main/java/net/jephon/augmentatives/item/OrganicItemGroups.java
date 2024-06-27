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

public class OrganicItemGroups {
    public static final ItemGroup ORGANICS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Augmentatives.MOD_ID, "organics_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.organicsAugmentatives"))
                    .icon(() -> new ItemStack(ModBlocks.OAK_HEDGE)).entries((displayContext, entries) -> {
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
                        //                                                                                                             //
                        //                                               Plants                                                        //
                        //                                                                                                             //
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Pillars
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_PILLAR_OAK);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_PILLAR_MANGROVE);
                
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Wood Stacks
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_OAK);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_MANGROVE);

                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_OAK);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_WOODSTACK_STRIPPED_MANGROVE);
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Hedges
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OAK_HEDGE);
                        entries.add(ModBlocks.DARK_OAK_HEDGE);
                        entries.add(ModBlocks.BIRCH_HEDGE);
                        entries.add(ModBlocks.SPRUCE_HEDGE);
                        entries.add(ModBlocks.ACACIA_HEDGE);
                        entries.add(ModBlocks.JUNGLE_HEDGE);
                        entries.add(ModBlocks.CHERRY_HEDGE);
                        entries.add(ModBlocks.MANGROVE_HEDGE);
                        entries.add(ModBlocks.AZALEA_HEDGE);
                        entries.add(ModBlocks.FLOWERING_AZALEA_HEDGE);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Planters
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OAK_PLANTER);
                        entries.add(ModBlocks.DARK_OAK_PLANTER);
                        entries.add(ModBlocks.BIRCH_PLANTER);
                        entries.add(ModBlocks.SPRUCE_PLANTER);
                        entries.add(ModBlocks.ACACIA_PLANTER);
                        entries.add(ModBlocks.JUNGLE_PLANTER);
                        entries.add(ModBlocks.CHERRY_PLANTER);
                        entries.add(ModBlocks.MANGROVE_PLANTER);
                        entries.add(ModBlocks.AZALEA_PLANTER);
                        entries.add(ModBlocks.FLOWERING_AZALEA_PLANTER);

                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Log Fence
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_FENCE_OAK);
                        entries.add(ModBlocks.OUTSIDE_FENCE_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_FENCE_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_FENCE_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_FENCE_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_FENCE_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_FENCE_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_FENCE_MANGROVE);
                        
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_OAK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_MANGROVE);

                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_OAK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_DARK_OAK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_BIRCH);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_SPRUCE);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_ACACIA);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_JUNGLE);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_CHERRY);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_MANGROVE);

                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_OAK_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_DARK_OAK_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_BIRCH_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_SPRUCE_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_ACACIA_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_JUNGLE_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_CHERRY_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_MANGROVE_THICK);

                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_OAK_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_DARK_OAK_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_BIRCH_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_SPRUCE_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_ACACIA_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_JUNGLE_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_CHERRY_THICK);
                        entries.add(ModBlocks.OUTSIDE_LOGFENCE_STRIPPED_MANGROVE_THICK);
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        // Statues
                        // =-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                        entries.add(ModBlocks.OUTSIDE_STATUE_POKEBALL);
                        entries.add(ModBlocks.OUTSIDE_STATUE_RHYDON);
                        
                    }).build());
    public static void registerItemGroups() {
        Augmentatives.LOGGER.info("Registering Item Groups for " + Augmentatives.MOD_ID);
    }
}
