package de.htw.berlin.aufgaben.wuerfelspiel2;

public class Spieler {
    // globale Variablen deklarieren
    private String name;
    private int punktestand;

    // Konstruktor erstellen. wenn man new benutzt, wird genau diese methode aufgerufen. das nennt sich dann konstruktor
    public Spieler(String name) {
        this.name = name;
        this.punktestand = 0;
    }

    public int getPunktestand() {
        return punktestand;
    }

    // aktualisiert den punktestand, in dem wir den zwischenpunktestand aus der methode versuch() dazu addieren
    public void addZwischenpunktestand(int zwischenpunktestand) {
        this.punktestand += zwischenpunktestand;
    }
}
