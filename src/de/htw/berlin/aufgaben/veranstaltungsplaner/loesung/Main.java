package de.htw.berlin.aufgaben.veranstaltungsplaner.loesung;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Teilnehmer t1 = new Teilnehmer("Anna", "Musterfrau", 2000);
        Teilnehmer t2 = new Teilnehmer("Mimosa", "Schmidt", 1990);
        Teilnehmer t3 = new Teilnehmer("Poppy", "Schmidt", 1995);
        Teilnehmer t4 = t3;

        Event konzert = new Event("Konzert", LocalDate.of(2024, 5, 10));
        eventManager.addEvent(konzert);
        konzert.addTeilnehmer(t1);
        konzert.addTeilnehmer(t2);

        Event lesung = new Event("Lesung", LocalDate.of(2024, 6, 20));
        eventManager.addEvent(lesung);
        lesung.addTeilnehmer(t1);
        lesung.addTeilnehmer(t2);
        lesung.addTeilnehmer(t3);
        lesung.addTeilnehmer(t4);

        System.out.println(eventManager);

        HashSet<Teilnehmer> teilnehmer = new HashSet<>();
        teilnehmer.add(t1);
        teilnehmer.add(t4);
        lesung.removeTeilnehmer(teilnehmer);

        System.out.println(eventManager);

    }

}
