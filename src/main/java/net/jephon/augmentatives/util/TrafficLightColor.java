package net.jephon.augmentatives.util;

import net.minecraft.state.property.Property;
import net.minecraft.util.StringIdentifiable;

public enum TrafficLightColor implements StringIdentifiable {
    RED("red"),
    YELLOW("yellow"),
    GREEN("green");

    private final String name;

    private TrafficLightColor(String name) {
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

