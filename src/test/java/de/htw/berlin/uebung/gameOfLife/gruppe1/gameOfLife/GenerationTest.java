package de.htw.berlin.uebung.gameOfLife.gruppe1.gameOfLife;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GenerationTest {
    @Test
    void anzahlLebenderNachbarnAlleTot() {
        Generation generation = new Generation(3, false);
        int result = generation.anzahlLebenderNachbar(1, 1);
        assertEquals(0, result);
    }

    @Test
    void einLebenderNachabarn() {
        Generation generation = new Generation(3, false);
        generation.setCostumLebendeZellen(0, 1);
        generation.setCostumLebendeZellen(1, 1);
        int result = generation.anzahlLebenderNachbar(1, 1);
        assertEquals(1, result);
    }

    @Test
    void simuliereNaechsteGenerationAlleTot() {
        Generation generation = new Generation(3, false);
        generation.simuliereNaechsteGeneration();
        Set<Coordinate> livingCells = generation.getCoordinateOfAllLivingCells();
        assertTrue(livingCells.isEmpty());
    }

    @Test
    void simuliereNaechsteGenerationZweiLebendeZellen() {
        Generation generation = new Generation(3, false);
        generation.setCostumLebendeZellen(0, 0);
        generation.setCostumLebendeZellen(0, 1);
        generation.setCostumLebendeZellen(1, 1);
        generation.simuliereNaechsteGeneration();
        Set<Coordinate> livingCells = generation.getCoordinateOfAllLivingCells();
        Set<Coordinate> expected = new HashSet<>();
        expected.add(new Coordinate(0, 0));
        expected.add(new Coordinate(0, 1));
        expected.add(new Coordinate(1, 1));
        expected.add(new Coordinate(1, 0));
        assertEquals(expected, livingCells);
    }

}