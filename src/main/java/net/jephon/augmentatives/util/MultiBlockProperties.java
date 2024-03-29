package net.jephon.augmentatives.util;

import net.minecraft.state.property.EnumProperty;

public class MultiBlockProperties {

    public static final EnumProperty<MultiBlockUtil.MultiblockPart> MULTIBLOCK_PART;

    static {
        MULTIBLOCK_PART = EnumProperty.of("part", MultiBlockUtil.MultiblockPart.class);
    }
}