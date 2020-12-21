package com.minggliangg.forbiddendesert.model.characters;

import com.minggliangg.forbiddendesert.enums.CharacterTypes;
import lombok.Getter;
import lombok.Setter;

public class WaterCarrier implements CharacterInterface {
    @Getter
    private final String name;
    @Getter
    private final CharacterTypes characterType;
    @Getter
    @Setter
    private int waterLevel;

    public WaterCarrier(String name) {
        this.name = name;
        characterType = CharacterTypes.waterCarrier;
        waterLevel = 5;
    }

    @Override
    public String role() {
        return characterType.role();
    }

    @Override
    public String abilityDescription() {
        return "The Water Carrier can take 2 water from already excavated wells for 1 action. She may also give water to players on adjacent tiles for free at any time. The Water Carrier also starts with 5 (instead of 4) water.";
    }

    @Override
    public boolean sunBeatsDown() {
        waterLevel -= 1;
        return waterLevel < 0;
    }

}
