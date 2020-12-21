package com.minggliangg.forbiddendesert.model.gameboard;

import com.minggliangg.forbiddendesert.enums.GameTileTypes;
import com.minggliangg.forbiddendesert.enums.GearTileTypes;
import lombok.Getter;

public class GearTile extends GameTile {
    @Getter
    private final GearTileTypes gearTileTypes;

    public GearTile(GearTileTypes gearTileTypes) {
        super(GameTileTypes.gear);
        this.gearTileTypes = gearTileTypes;
    }

}
