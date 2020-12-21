package com.minggliangg.forbiddendesert.enums;

public enum Direction {
    horizontal("Horizontal"), vertical("Vertical");

    private final String name;

    Direction(String name) {
        this.name = name;
    }

    public String part() {
        return name;
    }
}

