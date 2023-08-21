package com.patterns.factory.grafik.zellenanzeiger;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.patterns.factory.kartenseite.*;

public class ZellenAnzeigerMusterB extends ZellenAnzeiger{

    public Rectangle erstelleZelle(Kartenseite kartenseite) {
        Rectangle zelle = new Rectangle(10, 20); // Größe der Zelle

        if (kartenseite instanceof Wand) {
            zelle.setStroke(Color.RED); // Rahmenfarbe für Wand
        } else if (kartenseite instanceof Eingang) {
            if (((Eingang) kartenseite).getIstOffen()) {
                zelle.setStroke(Color.TRANSPARENT); // Offene Tür (kein Rahmen)
            } else {
                zelle.setStroke(Color.BLACK); // Geschlossene Tür (Rahmen)
            }
        }

        zelle.setFill(Color.WHITE); // Hintergrundfarbe der Zelle
        return zelle;
    }
}