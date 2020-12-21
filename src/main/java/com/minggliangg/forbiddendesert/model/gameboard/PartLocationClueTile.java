package com.minggliangg.forbiddendesert.model.gameboard;

import com.minggliangg.forbiddendesert.enums.Direction;
import com.minggliangg.forbiddendesert.enums.FlyingMachineParts;
import com.minggliangg.forbiddendesert.enums.GameTileTypes;
import lombok.Getter;

public class PartLocationClueTile extends GameTile {
    @Getter
    private final FlyingMachineParts flyingMachineParts;
    @Getter
    private final Direction direction;

    public PartLocationClueTile(FlyingMachineParts flyingMachineParts,Direction direction) {
        super(GameTileTypes.partLocationClue);
        this.flyingMachineParts=flyingMachineParts;
        this.direction = direction;
    }
}
