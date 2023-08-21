package com.patterns.factory.grafic.cellStructor;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.patterns.factory.mapSide.*;

public class CellStructorDesignA extends CellStructor {

    public Rectangle createCell(MapSide mapSide) {
        Rectangle cell = new Rectangle(50, 50); // Size of cell

        if (mapSide instanceof Wall) {
            cell.setStroke(Color.BLUEVIOLET); // Border color Wall
        } else if (mapSide instanceof Door) {
            if (((Door) mapSide).getIsOpen()) {
                cell.setStroke(Color.TRANSPARENT); // Open door (no border)
            } else {
                cell.setStroke(Color.BLACK); // Closed Door (border)
            }
        }

        cell.setFill(Color.WHITE); // Background color of cell
        return cell;
    }
}