package de.htw.berlin.aufgaben.veranstaltungsplaner.loesung;

import java.util.Objects;

public class Teilnehmer {
    private final String vorname;
    private final String nachname;
    private final int geburtsjahr;

    public Teilnehmer(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teilnehmer that = (Teilnehmer) o;
        return geburtsjahr == that.geburtsjahr && Objects.equals(vorname, that.vorname) && Objects.equals(nachname, that.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, geburtsjahr);
    }

    @Override
    public String toString() {
        return "Teilnehmer{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                '}';
    }
}
