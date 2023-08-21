package com.patterns.factory.grafic.cellStructor;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.patterns.factory.mapSide.*;

public class CellStructorDesignB extends CellStructor {

    public Rectangle createCell(MapSide mapSide) {
        Rectangle cell = new Rectangle(10, 20); // Size of cell

        if (mapSide instanceof Wall) {
            cell.setStroke(Color.RED); // Border color Wall
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