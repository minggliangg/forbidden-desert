package com.minggliangg.forbiddendesert.model.gameboard;

import com.minggliangg.forbiddendesert.enums.FlyingMachineParts;
import com.minggliangg.forbiddendesert.enums.GameTileTypes;
import com.minggliangg.forbiddendesert.model.CharacterInterface;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

abstract class GameTile implements GameTileInterface {
    @Getter
    private boolean isFlipped = false;
    @Getter
    @Setter
    private int sandPile = 0;
    private final GameTileTypes gameTileType;
    @Getter
    @Setter
    private FlyingMachineParts flyingMachinePart;

    private List<CharacterInterface> characters;

    public GameTile(GameTileTypes gameTileType) {
        this.gameTileType = gameTileType;
    }

    @Override
    public boolean isPassable() {
        return sandPile < 2;
    }

    @Override
    public void flip() {
        isFlipped = true;
    }

    @Override
    public GameTileTypes tileType() {
        return gameTileType;
    }

    @Override
    public void setCharacters(List<CharacterInterface> characters) {
        this.characters = characters;
    }

    @Override
    public List<CharacterInterface> getCharacters() {
        return characters;
    }

}
