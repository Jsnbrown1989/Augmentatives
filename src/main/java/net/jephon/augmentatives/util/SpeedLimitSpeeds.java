package net.jephon.augmentatives.util;

import net.minecraft.util.StringIdentifiable;

public enum SpeedLimitSpeeds implements StringIdentifiable {
    fifteen("15"),
    twentyfive("25"),
    thirtyfive("35"),
    fourtyfive("45"),
    fiftyfifve("55"),
    sixtyfive("65");

    private final String name;

    private SpeedLimitSpeeds(String name) {
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

