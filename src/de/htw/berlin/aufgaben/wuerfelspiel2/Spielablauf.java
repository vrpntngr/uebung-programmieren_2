package de.htw.berlin.aufgaben.wuerfelspiel2;

import java.util.Scanner;

public class Spielablauf {
    // Der Scanner ist hier eine globale Variable, wir benutzen ihn also in mehreren Methoden
    private final Scanner scanner;
    private Spieler[] spielerarray;

    public void spielerErstellen() {
        int spieleranzahl = anzahlSpieler();
        spielerarray = new Spieler[spieleranzahl];
        for (int i = 0; i < spieleranzahl; i++) {
            Spieler s = new Spieler("Spieler" + i + 1);
            spielerarray[i] = s;
        }

    }

    private int anzahlSpieler() {
        System.out.println("Bitte geben Sie einen Anzahl Spieler");
        boolean isEingabeFalse = true;
        int spieleranzahl = 0;
        while (isEingabeFalse) {
            try {
                spieleranzahl = scanner.nextInt();
                // Die Nextint methode verarbeitet nicht das Zeilenende, deshalb fuege ich den scanner.nextline zur fehlerprevention ein
                scanner.nextLine();
                //Hier wissen wir schon, dass die Eingabe richtig war. Also:
                isEingabeFalse = false;
            } catch (Exception e) {
                System.out.println("Bitte geben Sie eine Zahl ein!");
            }
        }
        return spieleranzahl;
    }

    public Spielablauf() {
// System in heisst er liest was im terminal eingegeben wird
        this.scanner = new Scanner(System.in);

    }
}
