package com.minggliangg.forbiddendesert.model.gameboard;

import com.minggliangg.forbiddendesert.enums.GameTileTypes;
import lombok.Getter;

public class WaterTile extends GameTile {
    @Getter
    boolean isMirage;

    public WaterTile( boolean isMirage) {
        super(GameTileTypes.water);
        this.isMirage=isMirage;
    }
}
