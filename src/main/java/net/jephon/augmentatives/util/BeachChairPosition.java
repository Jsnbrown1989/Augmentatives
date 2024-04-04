package net.jephon.augmentatives.util;

import net.minecraft.util.StringIdentifiable;

public enum BeachChairPosition implements StringIdentifiable {
    UP("up"),
    STANDARD("standard"),
    DOWN("down");

    private final String name;

    private BeachChairPosition(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}

