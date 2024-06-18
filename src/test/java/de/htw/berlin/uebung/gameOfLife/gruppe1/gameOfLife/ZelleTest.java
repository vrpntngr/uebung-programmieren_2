package de.htw.berlin.uebung.gameOfLife.gruppe1.gameOfLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ZelleTest {

    @Test
    void lebendigDreiNachbarnBleibtLebendig() {
        de.htw.berlin.uebung.gameOfLife.Zelle zelle = de.htw.berlin.uebung.gameOfLife.Zelle.LEBENDIG;
        de.htw.berlin.uebung.gameOfLife.Zelle result = zelle.simuliereNaechsteGeneration(3);
        assertEquals(de.htw.berlin.uebung.gameOfLife.Zelle.LEBENDIG, result);
    }

    @Test
    void negativeZahl() {
        Zelle zelle = Zelle.LEBENDIG;
        assertThrows(IllegalArgumentException.class, () -> zelle.simuliereNaechsteGeneration(-1));
    }
}