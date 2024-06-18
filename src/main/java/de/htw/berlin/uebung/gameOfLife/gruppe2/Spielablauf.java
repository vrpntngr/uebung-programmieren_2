package de.htw.berlin.uebung.gameOfLife.gruppe2;

public class Spielablauf {

    private Generation generation;

    public Spielablauf() {
        generation = new Generation(10);

    }

    public void simuliereGenerationen(int anzahlGenerationen) {
        generation.zeichnen(); // erste
        for (int i = 0; i < anzahlGenerationen; i++) {
            generation.simuliereNaechsteGeneration();
            System.out.println("");
            generation.zeichnen();
        }
    }
}
