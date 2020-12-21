package com.minggliangg.forbiddendesert.model.gameboard;

import com.minggliangg.forbiddendesert.enums.Direction;
import com.minggliangg.forbiddendesert.enums.FlyingMachineParts;
import com.minggliangg.forbiddendesert.enums.GearTileTypes;
import com.minggliangg.forbiddendesert.model.CharacterInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameBoard {
    private final GameTile[][] gameBoard = new GameTile[5][5];

    /**
     * Sets up the game board.
     * @param characters
     */
    public void setUp(List<CharacterInterface> characters) {
        // Populate tiles
        List<GameTile> allTiles = new ArrayList<>();
        GameTile launchPadTile = new LaunchPadTile();
        GameTile helicopterCrashTile = new HelicopterCrashTile();
        helicopterCrashTile.setCharacters(characters);
        allTiles.add(launchPadTile);
        allTiles.add(helicopterCrashTile);
        // Water tiles and tunnel tiles
        for (int i = 0; i < 3; i++) {
            GameTile waterTile = new WaterTile(i == 2);
            allTiles.add(waterTile);
            GameTile tunnelTile = new TunnelTile();
            allTiles.add(tunnelTile);
        }
        // Clue tiles
        for (FlyingMachineParts part : FlyingMachineParts.values()) {
            for (Direction direction : Direction.values()) {
                GameTile partLocationClueTile = new PartLocationClueTile(part, direction);
                allTiles.add(partLocationClueTile);
            }
        }
        // Gear tiles
        for (int i = 0; i < 12; i++) {
            GameTile gearTile = new GearTile(GearTileTypes.gearSampleType);
            allTiles.add(gearTile);
        }
        // Randomise the tiles
        Collections.shuffle(allTiles);

        // Load tiles onto game board
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (!(col == 2 & row == 2)) {
                    gameBoard[row][col] = allTiles.get(0);
                    allTiles.remove(0);
                }
            }
        }
    }

    /**
     * Outputs the tile type in the board layout
     */
    public void layout() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (gameBoard[row][col] != null) {
                    System.out.print(gameBoard[row][col].tileType() + " ");
                } else {
                    System.out.print("SandStorm ");
                }
            }
            System.out.print("\n");
        }
    }
}