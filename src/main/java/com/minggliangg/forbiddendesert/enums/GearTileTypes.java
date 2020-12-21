package com.minggliangg.forbiddendesert.enums;

public enum GearTileTypes {
    gearSampleType("Gear Sample Type");

    private final String name;

    GearTileTypes(String name) {
        this.name = name;
    }

    public String part() {
        return name;
    }
}
