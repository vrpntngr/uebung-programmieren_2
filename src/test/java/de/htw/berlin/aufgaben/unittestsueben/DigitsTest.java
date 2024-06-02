package de.htw.berlin.aufgaben.unittestsueben;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    private static Digits digits;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        digits = new Digits();
    }

    @Test
    public void shareDigitBeideWerteNichtImWerteBereich() {
        // testen das eine Exception fliegt
        assertThrows(Exception.class, () -> digits.shareDigit(1, 1));
        // besser auf die speziele Exception testen
        assertThrows(IllegalArgumentException.class, () -> digits.shareDigit(1, 1));
    }

    @Test
    public void shareDigitBeideWerteNichtImWerteBereichObereGrenze() {
        assertThrows(IllegalArgumentException.class, () -> digits.shareDigit(100, 100));
    }

    @Test
    public void shareDigitErsterWertNichtImWerteBereich() {
        assertThrows(IllegalArgumentException.class, () -> digits.shareDigit(1, 11));
    }

    @Test
    public void shareDigitZweiterWertNichtImWerteBereich() {
        assertThrows(IllegalArgumentException.class, () -> digits.shareDigit(11, 1));
    }

    @Test
    public void shareDigitErsterWertNichtImWerteBereichObereGrenze() {
        assertThrows(IllegalArgumentException.class, () -> digits.shareDigit(10, 100));
    }

    @Test
    public void shareDigitZweiterWertNichtImWerteBereichObereGrenze() {
        assertThrows(IllegalArgumentException.class, () -> digits.shareDigit(100, 10));
    }

    @Test
    public void shareDigitBeideWerteUntereGrenze() {
        assertTrue(digits.shareDigit(10, 10));
    }

    @Test
    public void shareDigitBeideWerteObereGerenze() {
        assertTrue(digits.shareDigit(99, 99));
    }

    @Test
    public void shareDigitKeineUebereinstimmung() {
        assertFalse(digits.shareDigit(12, 34));
    }

    @Test
    public void shareDigitEineUebereinstimmungZweiteZiffern() {
        assertTrue(digits.shareDigit(12, 42));
    }

    @Test
    public void shareDigitEineUebereinstimmungErsteZiffern() {
        assertTrue(digits.shareDigit(12, 14));
    }

    @Test
    public void shareDigitEineUebereinstimmungErsteZweiteZiffern() {
        assertTrue(digits.shareDigit(12, 41));
    }

    @Test
    public void shareDigitEineUebereinstimmungZweiteErsteZiffern() {
        assertTrue(digits.shareDigit(21, 14));
    }

    @Test
    public void shareDigitBeidStimmenUeberein() {
        assertTrue(digits.shareDigit(12, 21));
    }

    @Test
    public void isIn1() {
        assertTrue(digits.isIn1To10(1, false));
    }

    @Test
    public void isIn5() {
        assertTrue(digits.isIn1To10(5, false));
    }

    @Test
    public void isIn10() {
        assertTrue(digits.isIn1To10(10, false));
    }

    @Test
    public void falseIsIn0() {
        assertFalse(digits.isIn1To10(0, false));
    }

    @Test
    public void falseIsInMinus1() {
        assertFalse(digits.isIn1To10(-1, false));
    }

    @Test
    public void falseIsIn11() {
        assertFalse(digits.isIn1To10(11, false));
    }

    @Test
    public void isIn1OutsideMode() {
        assertTrue(digits.isIn1To10(1, true));
    }

    @Test
    public void isIn10OutsideMode() {
        assertTrue(digits.isIn1To10(10, true));
    }

    @Test
    public void isInMinus10OutsideMode() {
        assertTrue(digits.isIn1To10(-10, true));
    }

    @Test
    public void isIn20OutsideMode() {
        assertTrue(digits.isIn1To10(20, true));
    }

    @Test
    public void falseIsIn2utsideMode() {
        assertFalse(digits.isIn1To10(2, true));
    }

    @Test
    public void falseIsIn9OutsideMode() {
        assertFalse(digits.isIn1To10(9, true));
    }

    @Test
    public void falseIsIn5OutsideMode() {
        assertFalse(digits.isIn1To10(5, true));
    }
}