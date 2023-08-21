package com.patterns.factory.grafik;

import com.patterns.factory.grafik.zellenanzeiger.ZellenAnzeiger;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import com.patterns.factory.kartenseite.*;
import com.patterns.factory.grafik.zellenanzeiger.ZellenAnzeigerFactory;

import java.util.Random;

public class LabyrinthFX {

    String musterTyp;

    public LabyrinthFX(String musterTyp) {
        this.musterTyp = musterTyp;
    }

    public Scene createLabyrinthScene() {
        int rows = 100;
        int cols = 100;

        Raum[][] raumArray = new Raum[rows][cols];
        Random random = new Random();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Raum raum = new Raum(row * cols + col + 1);
                if (random.nextBoolean()) {
                    raum.setNorden(new Wand());
                } else {
                    raum.setNorden(new Eingang(true));
                }
                // Ähnliche Logik für sueden, westen und osten
                raumArray[row][col] = raum;
            }
        }

        GridPane gridPane = createGridPane(rows, cols, raumArray);

        return new Scene(gridPane);
    }

    private GridPane createGridPane(int rows, int cols, Raum[][] raumArray) {
        GridPane gridPane = new GridPane();

        ZellenAnzeiger zellenAnzeiger = ZellenAnzeigerFactory.erstelleZellenAnzeiger(musterTyp);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Raum raum = raumArray[row][col];
                gridPane.add(zellenAnzeiger.erstelleZelle(raum.getNorden()), col, row);
            }
        }

        return gridPane;
    }
}