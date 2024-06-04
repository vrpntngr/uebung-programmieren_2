package de.htw.berlin.vorlesung.nr9abstraktandinterfaces;

public class Rechteck extends Shape implements Comparable<Rechteck> {
    private final int weite;
    private final int hoehe;

    public Rechteck(int weite, int hoehe) {
        this.weite = weite;
        this.hoehe = hoehe;
    }

    @Override
    public double getUmfang() {
        return 2 * (this.hoehe + this.weite);
    }

    @Override
    public double getFlaeche() {
        return this.weite * this.hoehe;
    }

    // o steht standardmäig für other
    @Override
    public int compareTo(Rechteck other) {
        // um Rechtecke zu vergleichen nutzen wir die Fläche
        double differenz = this.getFlaeche() - other.getFlaeche();
        if (differenz < 0) {
            return -1;
        }
        if (differenz > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "weite=" + weite +
                ", hoehe=" + hoehe +
                ", flaeche=" + this.getFlaeche() +
                '}';
    }
}
