package de.htw.berlin.aufgaben.wuerfelspiel1;

import java.util.Random;

public class Spielende {
    private int punktestand;
    private final Random random;

    //constructor
    public Spielende() {
        this.punktestand = 0;
        this.random = new Random();
    }

    public int wuerfeln() {
        int augenzahl = this.random.nextInt(6) + 1;
        return augenzahl;
    }

    public void addPunkte(int zwischenpunkte) {
        this.punktestand += zwischenpunkte;
    }

    public int getPunktestand() {
        return this.punktestand;
    }

}
