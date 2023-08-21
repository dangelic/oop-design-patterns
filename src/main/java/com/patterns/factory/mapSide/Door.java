package com.patterns.factory.mapSide;

public class Door implements MapSide {
    private boolean isOpen;

    public Door(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public void enter() {
        if (isOpen) {
            System.out.println("You enter an open entrance.");
        } else {
            System.out.println("Entrance locked.");
        }
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}