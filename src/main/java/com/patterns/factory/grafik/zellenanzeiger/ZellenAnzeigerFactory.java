package com.patterns.factory.grafik.zellenanzeiger;
public class ZellenAnzeigerFactory {

    public static ZellenAnzeiger erstelleZellenAnzeiger(String typ) {
        if (typ.equalsIgnoreCase("MUSTER_A")) {
            return new ZellenAnzeigerMusterA();
        } else if (typ.equalsIgnoreCase("MUSTER_B")) {
            return new ZellenAnzeigerMusterB();
        } else {
            throw new IllegalArgumentException("Ungültiger Typ für ZellenAnzeiger");
        }
    }
}
