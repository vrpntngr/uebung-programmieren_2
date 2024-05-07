package de.htw.berlin.aufgaben.wuerfelspiel1;

import java.util.Scanner;

public class Spielablauf {
    public static final int GEWINNPUNKTE = 20;
    Scanner scanner = new Scanner(System.in);
    private Spielende[] spielende;

    public void anzahlSpielende() {
        System.out.println("Mit wie vielen Menschen spielt ihr?");
        int anzahl = 0;
        boolean istEingabeUngueltig = true;
        while (istEingabeUngueltig) {
            try {
                anzahl = Integer.parseInt(scanner.nextLine());
                istEingabeUngueltig = false;
            } catch (Exception e) {
                System.out.println("Bitte eine Zahl eingeben");
            }
        }
        this.spielende = new Spielende[anzahl];
        for (int i = 0; i < anzahl; i++) {
            spielende[i] = new Spielende();
        }
    }

    public boolean istAugenzahlSechs(int augenzahl) {
        boolean bedingung = augenzahl == 6;
        return bedingung;
    }

    public void spielzug(Spielende spielende) {
        int augenzahl;
        int zwischenpunkte = 0;
        boolean zugAktiv = true;
        while (zugAktiv) {
            augenzahl = spielende.wuerfeln();
            System.out.println(augenzahl + " wurde gewuerfelt.");
            if (istAugenzahlSechs(augenzahl)) {
                zugAktiv = false;
                zwischenpunkte = 0;
                return;
            } else {
                zwischenpunkte += augenzahl;
            }
            System.out.println("Aktuelle Zwischenpunkte: " + zwischenpunkte);
            zugAktiv = abbruchentscheidung();
        }
        spielende.addPunkte(zwischenpunkte);
    }

    private boolean abbruchentscheidung() {
        System.out.println("Moechten Sie den Zug beenden?");
        boolean zugAktiv = true;
        boolean eingabeUngueltig = true;
        while (eingabeUngueltig) {
            String input = scanner.nextLine();
            if (input.equals("ja")) {
                zugAktiv = false;
                eingabeUngueltig = false;
            } else if (input.equals("nein")) {
                zugAktiv = true;
                eingabeUngueltig = false;
            } else {
                System.out.println("Bitte ja oder nein eingeben.");
            }
        }
        return zugAktiv;
    }

    public boolean gewonnen() {
        for (int index = 0; index < spielende.length; index++) {
            if (spielende[index].getPunktestand() >= GEWINNPUNKTE) {
                System.out.println("Spieler " + index + " hat gewonnen!");
                return true;
            }
        }
        return false;
    }

    public void spielen() {
        while (true) {
            for (int index = 0; index < spielende.length; index++) {
                System.out.println("Spieler " + index + " ist am Zug.");
                spielzug(spielende[index]);
                System.out.println("Spieler " + index + " hat " + spielende[index].getPunktestand() + " Punkte.");
                if (gewonnen()) {
                    return;
                }
            }
        }
    }

}
