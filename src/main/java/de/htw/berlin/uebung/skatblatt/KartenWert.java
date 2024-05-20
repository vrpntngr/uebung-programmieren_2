package de.htw.berlin.uebung.skatblatt;

public enum KartenWert {
    SIEBEN(0), ACHT(0), NEUN(0), BUBE(2), DAME(3), KOENIG(4), ZEHN(10), ASS(11);

    private final int wert;

    KartenWert(int wert) {
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return "de.htw.uebung.skattblatt.KartenWert{" +
                "name=" + name() +
                ", wert=" + wert +
                '}';
    }
}
