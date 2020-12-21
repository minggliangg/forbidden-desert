package com.minggliangg.forbiddendesert.model.characters;

import com.minggliangg.forbiddendesert.enums.CharacterTypes;
import lombok.Getter;
import lombok.Setter;

public class Explorer implements CharacterInterface {
    @Getter
    private final String name;
    @Getter
    private final CharacterTypes characterType;
    @Getter
    @Setter
    private int waterLevel;

    public Explorer(String name) {
        this.name = name;
        characterType = CharacterTypes.explorer;
        waterLevel = 4;
    }

    @Override
    public String role() {
        return characterType.role();
    }

    @Override
    public String abilityDescription() {
        return "The Explorer can move, remove sand, and may use Dune Blasters diagonally.";
    }

    @Override
    public boolean sunBeatsDown() {
        waterLevel -= 1;
        return waterLevel < 0;
    }

}
