package com.patterns.factory.kartenseite;

public class Eingang implements Kartenseite {
    private boolean istOffen;

    public Eingang(boolean istOffen) {
        this.istOffen = istOffen;
    }

    @Override
    public void eintreten() {
        if (istOffen) {
            System.out.println("Du trittst durch den offenen Eingang.");
        } else {
            System.out.println("Der Eingang ist verschlossen.");
        }
    }

    public boolean getIstOffen() {
        return istOffen;
    }

    public void setIstOffen(boolean istOffen) {
        this.istOffen = istOffen;
    }
}