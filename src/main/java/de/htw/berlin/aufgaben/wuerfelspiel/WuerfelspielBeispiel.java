package de.htw.berlin.aufgaben.wuerfelspiel;

import java.util.Scanner;

public class WuerfelspielBeispiel {

    private final Scanner scanner;
    private final WuerfelBeispiel wuerfel;

    public WuerfelspielBeispiel() {
        this.scanner = new Scanner(System.in);
        this.wuerfel = new WuerfelBeispiel();
    }

    public void spielen() {
        SpielerBeispiel[] spieler = spielerAnlegen();

        boolean gewonnen = false;
        SpielerBeispiel gewinner = null;
        while (!gewonnen) {
            runde(spieler);
            for (SpielerBeispiel s : spieler) {
                if (s.getPunktestand() >= 20) {
                    gewonnen = true;
                    gewinner = s;
                }
            }
        }
        System.out.println("Spieler " + gewinner.getName() + " hat mit " + gewinner.getPunktestand() + " gewonnen.");
    }

    private void runde(SpielerBeispiel[] spieler) {
        for (SpielerBeispiel s : spieler) {
            versuch(s);
            if (s.getPunktestand() >= 20) {
                return;
            }
        }
    }

    private void versuch(SpielerBeispiel spieler) {
        System.out.println("Spieler " + spieler.getName() + " ist an der Reihe");
        boolean versuchIstAktiv = true;
        int punktestand = 0;
        while (versuchIstAktiv) {
            int wurf = wuerfel.wuerfeln();
            System.out.println(wurf + " gewürfelt.");
            punktestand += wurf;

            if (wurf == 6) {
                versuchIstAktiv = false;
                punktestand = 0;
            } else {
                versuchIstAktiv = versuchBeendenAbfragen(punktestand, versuchIstAktiv);
            }
        }
        spieler.addPunkte(punktestand);
        System.out.println("Spieler " + spieler.getName() + " hat den Versuch mit " + punktestand +
                " Punkten beendet und hat insgesamt " + spieler.getPunktestand() + " Punkte.");
    }

    private boolean versuchBeendenAbfragen(int punktestand, boolean versuchIstAktiv) {
        boolean gueltigeEingabe = false;
        while (!gueltigeEingabe) {
            System.out.println("Willst du die " + punktestand + " aus diesem Versuch behalten und den Versuch beenden? j/n");
            String eingabe = scanner.nextLine();
            if (eingabe.equals("j")) {
                versuchIstAktiv = false;
                gueltigeEingabe = true;
            } else if (eingabe.equals("n")) {
                gueltigeEingabe = true;
            } else {
                System.out.println("Ungültige Eingabe: " + eingabe);
            }
        }
        return versuchIstAktiv;
    }

    private SpielerBeispiel[] spielerAnlegen() {
        int anzahlSpieler = getAnzahlSpieler();
        SpielerBeispiel[] spieler = new SpielerBeispiel[anzahlSpieler];
        for (int i = 0; i < anzahlSpieler; i++) {
            System.out.println("Gibt den Spielrname von Spieler " + (i + 1) + " ein:");
            String name = scanner.nextLine();
            spieler[i] = new SpielerBeispiel(name);
        }
        return spieler;
    }

    private int getAnzahlSpieler() {
        int anzahlSpieler = 0;
        boolean gueltigeEingabe = false;
        while (!gueltigeEingabe) {
            System.out.println("Gibt die Anzahl Spieler ein:");
            String anzahl = scanner.nextLine();
            try {
                anzahlSpieler = Integer.parseInt(anzahl);
                gueltigeEingabe = true;
            } catch (NumberFormatException e) {
                System.out.println("Die Eingabe ist keine gültige Zahl.");
            }
        }
        return anzahlSpieler;
    }
}
