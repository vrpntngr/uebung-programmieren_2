package de.htw.berlin.aufgaben.wuerfelspiel;

public class SpielerBeispiel {

    private final String name;
    private int punktestand;

    public SpielerBeispiel(String name) {
        this.name = name;
        this.punktestand = 0;
    }

    public String getName() {
        return name;
    }

    public int getPunktestand() {
        return punktestand;
    }

    public void addPunkte(int punktestand) {
        this.punktestand += punktestand;
    }
}
