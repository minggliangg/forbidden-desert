package com.minggliangg.forbiddendesert.enums;

public enum GameTileTypes {
    helicopterCrash("Helicopter Crash"), water("Water"), gear("Gear"),
    partLocationClue("Part Location Clue"), tunnel("Tunnel"),launchPad("Launch Pad");

    private final String name;

    GameTileTypes(String name) {
        this.name = name;
    }

    public String part() {
        return name;
    }
}
