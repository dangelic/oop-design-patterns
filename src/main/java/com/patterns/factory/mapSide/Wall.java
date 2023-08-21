package com.patterns.factory.mapSide;

public class Wall implements MapSide {
    @Override
    public void enter() {
        System.out.println("You hit a wall.");
    }
}