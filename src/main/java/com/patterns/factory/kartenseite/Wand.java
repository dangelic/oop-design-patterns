package com.patterns.factory.kartenseite;

public class Wand implements Kartenseite {
    @Override
    public void eintreten() {
        System.out.println("Du stößt auf eine Wand.");
    }
}