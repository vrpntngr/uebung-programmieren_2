package de.htw.berlin.aufgaben.wuerfelspiel2;

import java.util.Scanner;

public class Spielablauf {
    // Der Scanner ist hier eine globale Variable, wir benutzen ihn also in mehreren Methoden
    private final Scanner scanner;
    private Spieler[] spielerarray;
    private final Wuerfel wuerfel;

    public void spielen() {
        System.out.println("Willkommen zum Wuerfel-Spiel!");
        spielerErstellen();
        versuch(spielerarray[0]);
    }

    private void versuch(Spieler s) {
        //wir erstellen hier eine integer-variable, um den zwischenpunktestand zu speichern
        int zwischenpunktestand = 0;
        boolean versuchIstAktiv = true;

        // switch vereinfacht in diesem fall die if - else bedingungsabfrage
        // die in klammern stehende variable wird nach wert ueberprueft
        while (versuchIstAktiv) {
            // spieler wuerfelt solange versuchIstAktiv = true
            int augenzahl = wuerfel.wuerfeln();
            System.out.printf("%nEs wurde eine %d gewuerfelt.%n", augenzahl);
            switch (augenzahl) {
                // augenzahlen 1,2,3,4,5 werden in einem case zusammengefasst und gleich behandelt
                case 1, 2, 3, 4, 5:
                    zwischenpunktestand += augenzahl;
                    versuchIstAktiv = weiterSpielenAbfrage();
                    break;
                // wuerfeln wie eine 6 wird der zwischenpunktestand auf 0 gesetzt
                case 6:
                    zwischenpunktestand = 0;
                    versuchIstAktiv = false;
                    break;
            }
            System.out.printf("%nDer zwischenpunktestand betraegt: %d%n", zwischenpunktestand);
        }
        s.addZwischenpunktestand(zwischenpunktestand);
        System.out.printf("Versuch beendet. Punkte aus Versuch: %d. Punktestand: %d%n", zwischenpunktestand, s.getPunktestand());
    }

    private boolean weiterSpielenAbfrage() {
        System.out.println("j druecken um weiterzuspielen.");
        String eingabe = scanner.nextLine();
        if (eingabe.equalsIgnoreCase("j")) {
            return true;
        }
        return false;
    }

    private void spielerErstellen() {
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
                System.out.printf("%d Spieler nehmen teil.", spieleranzahl);
                isEingabeFalse = false;
            } catch (Exception e) {
                System.out.println("Bitte geben Sie eine Zahl ein!");
            }
        }
        return spieleranzahl;
    }

    public Spielablauf() {
        this.wuerfel = new Wuerfel();
// System in heisst er liest was im terminal eingegeben wird
        this.scanner = new Scanner(System.in);

    }
}
