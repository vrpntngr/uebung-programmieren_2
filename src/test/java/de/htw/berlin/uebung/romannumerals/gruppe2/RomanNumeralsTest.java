package de.htw.berlin.uebung.romannumerals.gruppe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    public void oneEqualsI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
    }

    @Test
    public void twoEqualsII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.convert(2));
    }

    @Test
    public void threeEqualsIII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III", romanNumerals.convert(3));
    }

    @Test
    public void fiveEqualsV() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V", romanNumerals.convert(5));
    }

    @Test
    public void sixEqualsVI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VI", romanNumerals.convert(6));
    }

    @Test
    public void tenEqualsX() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("X", romanNumerals.convert(10));
    }

    @Test
    public void twentyEqualsXX() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XX", romanNumerals.convert(20));
    }
}