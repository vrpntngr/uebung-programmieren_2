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
}
