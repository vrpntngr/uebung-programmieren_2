package de.htw.berlin.vorlesung.nr9abstraktandinterfaces;

public class Kreis extends Shape implements Comparable<Kreis> {
    private final double d;
    private final double r;

    public Kreis(double d) {
        this.d = d;
        this.r = d / 2;
    }

    @Override
    public double getUmfang() {
        return Math.PI * d;
    }

    @Override
    public double getFlaeche() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public int compareTo(Kreis o) {
        double differenz = this.getFlaeche() - o.getFlaeche();
        if (differenz < 0) {
            return -1;
        }
        if (differenz > 0) {
            return 1;
        }
        return 0;
    }
}
