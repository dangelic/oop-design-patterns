package com.patterns.factory.grafic.cellStructor;
import com.patterns.factory.mapSide.MapSide;
import javafx.scene.shape.Rectangle;

public abstract class CellStructor {
    public abstract Rectangle createCell(MapSide mapSide);
}