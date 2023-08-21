package com.patterns.factory.kartenseite;

public class Raum {
    private Kartenseite norden, sueden, westen, osten;
    private int raumNummer;

    public Raum(int raumNummer) {
        this.raumNummer = raumNummer;
    }

    public void setSeite(Kartenseite norden, Kartenseite sueden, Kartenseite westen, Kartenseite osten) {
        this.norden = norden;
        this.sueden = sueden;
        this.westen = westen;
        this.osten = osten;
    }

    public int getRaumNummer() {
        return raumNummer;
    }

    public void eintreten() {
        System.out.println("Du betrittst Raum " + raumNummer);
    }

    public Kartenseite getNorden() {
        return norden;
    }

    public void setNorden(Kartenseite norden) {
        this.norden = norden;
    }

    public Kartenseite getSueden() {
        return sueden;
    }

    public void setSueden(Kartenseite sueden) {
        this.sueden = sueden;
    }

    public Kartenseite getWesten() {
        return westen;
    }

    public void setWesten(Kartenseite westen) {
        this.westen = westen;
    }

    public Kartenseite getOsten() {
        return osten;
    }

    public void setOsten(Kartenseite osten) {
        this.osten = osten;
    }

    public void setRaumNummer(int raumNummer) {
        this.raumNummer = raumNummer;
    }
}