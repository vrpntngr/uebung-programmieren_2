package de.htw.berlin.uebung.skattblatt;

public class Main {
    public static void main(String[] args) {

        // erzeuge Herz Dame
        Spielkarte herzDame = new Spielkarte(KartenWert.DAME, KartenFarbe.HERZ);
        System.out.println(herzDame);

        // erzeuge zufällige Karte
        Spielkarte zufaelligeKarte = new Spielkarte();
        System.out.println(zufaelligeKarte);

        // erzeuge 5 zufällige Karten und zähle die Punkte
        int punkte = 0;
        for (int i = 0; i < 5; i++) {
            Spielkarte karte = new Spielkarte();
            punkte += karte.getPunkte();
            System.out.println(karte);
        }
        System.out.println("Punkte: " + punkte);

    }
}