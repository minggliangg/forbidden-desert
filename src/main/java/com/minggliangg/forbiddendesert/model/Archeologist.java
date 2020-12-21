package com.minggliangg.forbiddendesert.model;

import com.minggliangg.forbiddendesert.CharacterTypes;
import lombok.Getter;
import lombok.Setter;

public class Archeologist implements CharacterInterface {
    @Getter
    private final String name;
    @Getter
    private final CharacterTypes characterType;
    @Getter
    @Setter
    private int waterLevel;

    public Archeologist(String name) {
        this.name = name;
        characterType = CharacterTypes.archeologist;
        waterLevel = 3;
    }

    @Override
    public String role() {
        return characterType.role();
    }

    @Override
    public String abilityDescription() {
        return "The Archeologist can remove 2 Sand markers from any single tile for 1 action.";
    }

    @Override
    public boolean sunBeatsDown() {
        waterLevel -= 1;
        return waterLevel < 0;
    }

}
