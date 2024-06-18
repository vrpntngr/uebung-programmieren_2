package de.htw.berlin.uebung.gameOfLife.gruppe1.gameOfLife;

public enum Zelle {

    LEBENDIG('*'), TOT('.');

    char symbol;

    Zelle(char c) {
        this.symbol = c;
    }

    public Zelle simuliereNaechsteGeneration(int anzahlLebendeNachbarn) {
        if (anzahlLebendeNachbarn < 0) {
            throw new IllegalArgumentException("Nur positive Zahlen erlaubt.");
        }
        if (Zelle.LEBENDIG == this) {
            // lebende Zellen
            if (anzahlLebendeNachbarn < 2) {
                return Zelle.TOT;
            } else if (anzahlLebendeNachbarn == 2 || anzahlLebendeNachbarn == 3) {
                return Zelle.LEBENDIG;
            } else { // Anzahl lebende Nachbarn > 3
                return Zelle.TOT;
            }
        } else {
            // tote Zelle
            if (anzahlLebendeNachbarn == 3) { // es müssen 3 lebende Nachbarn sein damit eine Zelle zum Leben erwacht und nicht zwei
                return Zelle.LEBENDIG;
            } else {
                return Zelle.TOT;
            }
        }
    }
}
