package com.minggliangg.forbiddendesert.model;

import com.minggliangg.forbiddendesert.enums.CharacterTypes;
import lombok.Getter;
import lombok.Setter;

public class Climber implements CharacterInterface {
    @Getter
    private final String name;
    @Getter
    private final CharacterTypes characterType;
    @Getter
    @Setter
    private int waterLevel;

    public Climber(String name) {
        this.name = name;
        characterType = CharacterTypes.climber;
        waterLevel = 3;
    }

    @Override
    public String role() {
        return characterType.role();
    }

    @Override
    public String abilityDescription() {
        return "The Climber can move to blocked tiles (tiles with 2 or more Sand markers on them). He may also take one other player with him whenever he moves. Pawns on the Climber’s tile are never buried and can leave the tile containing the Climber even if there are 2 or more Sand markers on it.";
    }

    @Override
    public boolean sunBeatsDown() {
        waterLevel -= 1;
        return waterLevel < 0;
    }




}
