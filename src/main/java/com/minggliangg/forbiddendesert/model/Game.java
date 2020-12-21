package com.minggliangg.forbiddendesert.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<CharacterInterface> players = new ArrayList<>();

    public void addPlayer(CharacterInterface character) {
        players.add(character);
    }

    public void sunBeatsDown() {
        for (CharacterInterface player : players) {
            player.sunBeatsDown();
        }
    }

    public void status() {
        for (CharacterInterface player : players) {
            System.out.println(player.getName() + ", with the role of " + player.role() + " has " + player.getWaterLevel() + " units of water left.");
        }
    }
}
