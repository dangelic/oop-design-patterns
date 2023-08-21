package com.patterns.factory.grafik.zellenanzeiger;


import com.patterns.factory.kartenseite.Kartenseite;
import javafx.scene.shape.Rectangle;

public abstract class ZellenAnzeiger {
    public abstract Rectangle erstelleZelle(Kartenseite kartenseite);
}