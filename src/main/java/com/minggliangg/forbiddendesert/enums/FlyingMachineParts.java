package com.minggliangg.forbiddendesert.enums;

public enum FlyingMachineParts {
    propeller("Propeller"), engine("Engine"),
    solarCrystal("Solar Crystal"), navigationDeck("Navigation Deck");

    private final String name;

    FlyingMachineParts(String name) {
        this.name = name;
    }

    public String part() {
        return name;
    }
}
