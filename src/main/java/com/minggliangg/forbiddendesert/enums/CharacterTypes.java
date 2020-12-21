package com.minggliangg.forbiddendesert.enums;

public enum CharacterTypes {
    archeologist("Archeologist"), climber("Climber"), explorer("Explorer"),
    meteorologist("Meteorologist"), navigator("Navigator"), waterCarrier("Water Carrier");

    private final String name;

    CharacterTypes(String name) {
        this.name = name;
    }

    public String role(){
        return name;
    }
}
