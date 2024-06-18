package de.htw.berlin.uebung.gameOfLife;

public class KoordinateOldSchool {
    public int zeile;
    public int spalte;

    public KoordinateOldSchool(int zeile, int spalte) {
        this.zeile = zeile;
        this.spalte = spalte;
    }

    public int zeile() {
        return zeile;
    }

    public int spalte() {
        return spalte;
    }
}
