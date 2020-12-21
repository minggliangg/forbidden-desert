package com.minggliangg.forbiddendesert;


import com.minggliangg.forbiddendesert.model.Archeologist;
import com.minggliangg.forbiddendesert.model.CharacterInterface;
import com.minggliangg.forbiddendesert.model.Climber;
import com.minggliangg.forbiddendesert.model.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForbiddenDesertApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForbiddenDesertApplication.class, args);
        Game myGame = new Game();
        CharacterInterface myCharacter1 = new Archeologist("James");
        CharacterInterface myCharacter2 = new Climber("John");
        myGame.addPlayer(myCharacter1);
        myGame.addPlayer(myCharacter2);
        myGame.sunBeatsDown();
        myGame.status();



    }
}
