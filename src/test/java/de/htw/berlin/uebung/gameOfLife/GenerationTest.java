package de.htw.berlin.uebung.gameOfLife;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerationTest {
    private Set<Koordinate> lebendigeZellen;

    @BeforeEach
    void setUp() {
        lebendigeZellen = new HashSet();
    }

    @Test
    public void initialisiereGeneration() {
        lebendigeZellen.add(new Koordinate(1, 1));
        Generation testgeneration = new Generation(3, lebendigeZellen);
        assertEquals(Zelle.LEBENDIG, testgeneration.generation[1][1]); //testet, ob Zelle(1,1) richtig mit LEBENDIG belegt ist
    }

    @Test
    public void zaehleAnzahlNachbarn() {
        lebendigeZellen.add(new Koordinate(0, 1));
        lebendigeZellen.add(new Koordinate(1, 1));
        lebendigeZellen.add(new Koordinate(1, 2));
        Generation testgeneration = new Generation(3, lebendigeZellen);
        int result = testgeneration.anzahlLebenderNachbar(1, 1);
        assertEquals(2, result);
    }

    @Test
    public void simuliereNaechsteGeneration() {
        lebendigeZellen.add(new Koordinate(0, 1));
        lebendigeZellen.add(new Koordinate(1, 1));
        lebendigeZellen.add(new Koordinate(1, 2));
        Generation testgeneration = new Generation(3, lebendigeZellen);
        testgeneration.simuliereNaechsteGeneration();
        // so nicht ideal : assertEquals(Zelle.TOT, testgeneration.generation[0][0]);
        Set<Koordinate> result = getKoordinatenLebendigerZellen(testgeneration.generation);
        Set<Koordinate> expected = new HashSet<>();
        expected.add(new Koordinate(0, 1));
        expected.add(new Koordinate(1, 1));
        expected.add(new Koordinate(1, 2));
        expected.add(new Koordinate(0, 2));
        assertEquals(expected, result);
    }

    private Set<Koordinate> getKoordinatenLebendigerZellen(Zelle[][] testgeneration) {
        Set<Koordinate> lebendigeZellen = new HashSet();
        for (int zeile = 0; zeile < testgeneration.length; zeile++) {
            for (int spalte = 0; spalte < testgeneration.length; spalte++) {
                if (testgeneration[zeile][spalte] == Zelle.LEBENDIG) {
                    Koordinate koordinate = new Koordinate(zeile, spalte);
                    lebendigeZellen.add(koordinate);
                }
            }
        }
        return lebendigeZellen;
    }

}