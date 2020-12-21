package com.minggliangg.forbiddendesert.model;

import com.minggliangg.forbiddendesert.enums.CharacterTypes;

public interface CharacterInterface {
    String getName();
    CharacterTypes getCharacterType();
    String role();
    int getWaterLevel();
    void setWaterLevel(int waterLevel);
    String abilityDescription();
    boolean sunBeatsDown();

}
