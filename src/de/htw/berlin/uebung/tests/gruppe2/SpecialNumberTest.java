package de.htw.berlin.uebung.tests.gruppe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpecialNumberTest {

    @Test
    public void twentyTwoisSpecial() {
        boolean actual = SpecialNumber.isSpecial(22);
        assertTrue(actual);
    }

    @Test
    public void thirtyThreeisSpecial() {
        boolean actual = SpecialNumber.isSpecial(33);
        assertTrue(actual);
    }

    @Test
    public void hundertTenIsSpecial() {
        boolean actual = SpecialNumber.isSpecial(110);
        assertTrue(actual);
    }

    @Test
    public void fortyFiveIsSpecial() {
        boolean actual = SpecialNumber.isSpecial(45);
        assertTrue(actual);
    }

    @Test
    public void eightyNineIsSpecial() {
        boolean actual = SpecialNumber.isSpecial(89);
        assertTrue(actual);
    }

    @Test
    public void oneIsNotSpecial() {
        boolean actual = SpecialNumber.isSpecial(5);
        assertFalse(actual);
    }

    @Test
    public void tenIsNotSpecial() {
        boolean actual = SpecialNumber.isSpecial(10);
        assertFalse(actual);
    }

    @Test
    public void thirteenIsNotSpecial() {
        boolean actual = SpecialNumber.isSpecial(13);
        assertFalse(actual);
    }

    @Test
    public void twentyOneIsNotSpecial() {
        boolean actual = SpecialNumber.isSpecial(21);
        assertFalse(actual);
    }

    @Test
    public void twentyFourIsNotSpecial() {
        boolean actual = SpecialNumber.isSpecial(24);
        assertFalse(actual);
    }

}