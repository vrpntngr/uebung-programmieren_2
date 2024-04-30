package de.htw.berlin.aufgaben.wuerfelspiel1;

import java.util.Scanner;

public class Spielablauf {
    Scanner scanner = new Scanner(System.in);
    private Spielende[] spielende;

    public void anzahlSpielende() {
        System.out.println("Mit wie vielen Menschen spielt ihr?");
        int anzahl = 0;
        boolean istEingabeUngueltig = true;
        while (istEingabeUngueltig) {
            try {
                anzahl = scanner.nextInt();
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
            if (istAugenzahlSechs(augenzahl)) {
                zugAktiv = false;
                zwischenpunkte = 0;
            } else {
                zwischenpunkte += augenzahl;

            }
        }
        spielende.addPunkte(zwischenpunkte);
    }
}
