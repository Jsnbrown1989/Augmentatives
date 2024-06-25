package net.jephon.augmentatives.util;

import net.minecraft.util.StringIdentifiable;

public enum OpenPosition implements StringIdentifiable {
    OPEN("open"),
    CLOSED("closed");

    private final String name;

    private OpenPosition(String name) {
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

