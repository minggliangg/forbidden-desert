package com.minggliangg.forbiddendesert;

import com.minggliangg.forbiddendesert.model.CharacterInterface;
import com.minggliangg.forbiddendesert.model.Climber;
import com.minggliangg.forbiddendesert.model.gameboard.GameBoard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ForbiddenDesertApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForbiddenDesertApplication.class, args);

        // Sample code to test board layout
        // CharacterInterface myCharacter = new Climber("James");
        // List<CharacterInterface> characters = new ArrayList<>();
        // characters.add(myCharacter);
        // GameBoard gameBoard = new GameBoard();
        // gameBoard.setUp(characters);
        // gameBoard.layout();
        // myCharacter.sunBeatsDown();
//         System.out.println("End");
    }
}
