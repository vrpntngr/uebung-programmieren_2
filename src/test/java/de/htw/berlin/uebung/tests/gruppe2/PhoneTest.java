package de.htw.berlin.uebung.tests.gruppe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneTest {

    @Test
    public void notMorningNotMumAndNotAsleep() {
        Phone phone = new Phone();
        boolean result = phone.answer(false, false, false);
        assertTrue(result);
    }

    @Test
    public void notMorningNotMumAndAsleep() {
        Phone phone = new Phone();
        boolean result = phone.answer(false, false, true);
        assertFalse(result);
    }

    @Test
    public void MorningNotMumAndNotAsleep() {
        Phone phone = new Phone();
        boolean result = phone.answer(true, false, false);
        assertFalse(result);
    }

    @Test
    public void MorningMumAndNotAsleep() {
        Phone phone = new Phone();
        boolean result = phone.answer(true, true, false);
        assertTrue(result);
    }

    @Test
    public void notMorningMumAndNotAsleep() {
        Phone phone = new Phone();
        boolean result = phone.answer(false, true, false);
        assertTrue(result);
    }

    @Test
    public void MorningMumAndAsleep() {
        Phone phone = new Phone();
        boolean result = phone.answer(true, true, true);
        assertFalse(result);
    }

}