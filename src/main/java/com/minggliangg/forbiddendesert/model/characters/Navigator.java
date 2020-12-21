package com.minggliangg.forbiddendesert.model.characters;

import com.minggliangg.forbiddendesert.enums.CharacterTypes;
import lombok.Getter;
import lombok.Setter;

public class Navigator implements CharacterInterface {
    @Getter
    private final String name;
    @Getter
    private final CharacterTypes characterType;
    @Getter
    @Setter
    private int waterLevel;

    public Navigator(String name) {
        this.name = name;
        characterType = CharacterTypes.navigator;
        waterLevel = 4;
    }

    @Override
    public String role() {
        return characterType.role();
    }

    @Override
    public String abilityDescription() {
        return "The Navigator may move another player up to 3 unblocked tiles per action, including tunnels.\n" +
                "She can move the Explorer diagonally and can move the Climber through blocked tiles. When moved in this way, the Climber can also use his power to take along 1 other player—including the Navigator!";}

    @Override
    public boolean sunBeatsDown() {
        waterLevel -= 1;
        return waterLevel < 0;
    }

}
