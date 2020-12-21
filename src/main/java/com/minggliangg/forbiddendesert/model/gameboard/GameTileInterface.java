package com.minggliangg.forbiddendesert.model.gameboard;

import com.minggliangg.forbiddendesert.enums.FlyingMachineParts;
import com.minggliangg.forbiddendesert.enums.GameTileTypes;
import com.minggliangg.forbiddendesert.model.CharacterInterface;

import java.util.List;

public interface GameTileInterface {
    boolean isPassable();
    void flip();
    GameTileTypes tileType();
    void setCharacters(List<CharacterInterface> characters);
    List<CharacterInterface>  getCharacters();
    void setFlyingMachinePart(FlyingMachineParts flyingMachinePart);
    FlyingMachineParts getFlyingMachinePart();
}
