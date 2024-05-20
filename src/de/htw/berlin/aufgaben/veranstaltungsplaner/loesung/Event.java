package de.htw.berlin.aufgaben.veranstaltungsplaner.loesung;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

class Event {
    private String name;
    private LocalDate date;
    private Set<Teilnehmer> teilnehmer;

    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
        this.teilnehmer = new HashSet<>();
    }

    public void addTeilnehmer(Teilnehmer teilnehmer) {
        this.teilnehmer.add(teilnehmer);
    }

    public void addTeilnehmer(Set<Teilnehmer> teilnehmer) {
        this.teilnehmer.addAll(teilnehmer);
    }

    public void removeTeilnehmer(Teilnehmer teilnehmer) {
        this.teilnehmer.remove(teilnehmer);
    }

    public void removeTeilnehmer(Set<Teilnehmer> teilnehmer) {
        this.teilnehmer.removeAll(teilnehmer);
    }

    @Override
    public String toString() {
        return "\nEvent{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", teilnehmer=" + teilnehmer +
                "}";
    }
}
