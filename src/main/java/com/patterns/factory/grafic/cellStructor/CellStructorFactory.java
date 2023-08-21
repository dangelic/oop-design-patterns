package com.patterns.factory.grafic.cellStructor;
public class CellStructorFactory {

    public static CellStructor createCellStructor(String typ) {
        if (typ.equalsIgnoreCase("DESIGN_A")) {
            return new CellStructorDesignA();
        } else if (typ.equalsIgnoreCase("DESIGN_B")) {
            return new CellStructorDesignB();
        } else {
            throw new IllegalArgumentException("Invalid CellStructor Factory Type!");
        }
    }
}
