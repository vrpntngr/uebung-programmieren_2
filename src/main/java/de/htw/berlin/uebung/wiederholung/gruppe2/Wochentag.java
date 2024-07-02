package de.htw.berlin.uebung.wiederholung.gruppe2;

public enum Wochentag {
    MONTAG("Arbeitstag", 1), DIENSTAG("Arbeitstag", 2), MITTWOCH("Arbeitstag", 3),
    DONNERSTAG("Arbeitstag", 4), FREITAG("Arbeitstag", 5), SAMSTAG("Wochenende", 6),
    SONNTAG("Wochenende", 7);

    private String typ;
    private int tag;

    Wochentag(String typ, int tag) {
        this.typ = typ;
        this.tag = tag;
    }

    public boolean isArbeitstag() {
        return this.typ.equals("Arbeitstag");
    }

    public int getTag() {
        return tag;
    }
}
