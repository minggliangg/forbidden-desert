package com.minggliangg.forbiddendesert.model;

import com.minggliangg.forbiddendesert.CharacterTypes;
import lombok.Getter;
import lombok.Setter;

public class Meteorologist implements CharacterInterface {
    @Getter
    private final String name;
    @Getter
    private final CharacterTypes characterType;
    @Getter
    @Setter
    private int waterLevel;

    public Meteorologist(String name) {
        this.name = name;
        characterType = CharacterTypes.meteorologist;
        waterLevel = 4;
    }

    @Override
    public String role() {
        return characterType.role();
    }

    @Override
    public String abilityDescription() {
        return "The Meteorologist may spend actions to draw fewer Storm cards (1 card per action) at the end of her turn. She may also choose to spend 1 action to look at the top Storm cards, equal to the Storm level, and may place one at the bottom of the deck.";
    }

    @Override
    public boolean sunBeatsDown() {
        waterLevel -= 1;
        return waterLevel < 0;
    }

}
