package com.patterns.factory.grafic;

import com.patterns.factory.grafic.cellStructor.CellStructor;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import com.patterns.factory.mapSide.*;
import com.patterns.factory.grafic.cellStructor.CellStructorFactory;

import java.util.Random;

public class MazeFX {

    String designType;

    public MazeFX(String designType) {
        this.designType = designType;
    }

    public Scene createLabyrinthScene() {
        int rows = 100;
        int cols = 100;

        Room[][] roomArray = new Room[rows][cols];
        Random random = new Random();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Room room = new Room(row * cols + col + 1);
                if (random.nextBoolean()) {
                    room.setNorth(new Wall());
                } else {
                    room.setNorth(new Door(true));
                }
                // Similar logic for other directions
                roomArray[row][col] = room;
            }
        }

        GridPane gridPane = createGridPane(rows, cols, roomArray);

        return new Scene(gridPane);
    }

    private GridPane createGridPane(int rows, int cols, Room[][] roomArray) {
        GridPane gridPane = new GridPane();

        CellStructor cellStructor = CellStructorFactory.createCellStructor(designType);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Room room = roomArray[row][col];
                gridPane.add(cellStructor.createCell(room.getNorth()), col, row);
            }
        }

        return gridPane;
    }
}