package de.htw.berlin.aufgaben.unittestsueben;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static de.htw.berlin.aufgaben.unittestsueben.Lotterie.Value.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LotterieTest {

    private static Lotterie lotterie;

    @BeforeAll
    static void setUp() {
        lotterie = new Lotterie();
    }

    @Test
    public void greenLotterieReturns20WhenAEqualsBAndC() {
        int result = lotterie.greenTicket(10, 10, 10);
        assertEquals(20, result);
    }

    @Test
    public void greenLotterieReturns10WhenAEqualsB() {
        int result = lotterie.greenTicket(15, 15, 0);
        assertEquals(10, result);
    }


    @Test
    public void greenLotterieReturns10WhenAEqualsC() {
        int result = lotterie.greenTicket(1, 15, 1);
        assertEquals(10, result);
    }


    @Test
    public void greenLotterieReturns10WhenBEqualsC() {
        int result = lotterie.greenTicket(15, 20, 20);
        assertEquals(10, result);
    }

    @Test
    public void greenLotterieReturns0WhenABCAreDifferent() {
        int result = lotterie.greenTicket(1, 2, 3);
        assertNotEquals(10, result);
    }

    @Test
    public void greenLotterieReturns0WhenABCAreDifferent2() {
        int result = lotterie.greenTicket(11, 50, 30);
        assertNotEquals(10, result);
    }

    @Test
    public void redTicketReturns10WhenABCAreTwo() {
        int result = lotterie.redTicket(TWO, TWO, TWO);
        assertEquals(10, result);
    }

    @Test
    public void redTicketReturns5WhenABCAreOne() {
        int result = lotterie.redTicket(ONE, ONE, ONE);
        assertEquals(5, result);
    }

    @Test
    public void redTicketReturns5WhenABCAreZero() {
        int result = lotterie.redTicket(ZERO, ZERO, ZERO);
        assertEquals(5, result);
    }

    @Test
    public void redTicketReturns5WhenAllAreZERO() {
        int result = lotterie.redTicket(ZERO, ZERO, ZERO);
        assertEquals(5, result);
    }

    @Test
    public void redTicketReturns5WhenAllAreONE() {
        int result = lotterie.redTicket(ONE, ONE, ONE);
        assertEquals(5, result);
    }

    @Test
    public void redTicketReturns1WhenOnlyAIsZero() {
        int result = lotterie.redTicket(ZERO, ONE, TWO);
        assertEquals(1, result);
    }

    @Test
    public void redTicketReturns1WhenOnlyAIsONE() {
        int result = lotterie.redTicket(ONE, TWO, TWO);
        assertEquals(1, result);
    }

    @Test
    public void redTicketReturns1WhenOnlyAIsTwo() {
        int result = lotterie.redTicket(TWO, ONE, ZERO);
        assertEquals(1, result);
    }

    @Test
    public void redTicketReturns0WhenOneOneTwo() {
        int result = lotterie.redTicket(ONE, ONE, TWO);
        assertEquals(0, result);
    }

    @Test
    public void redTicketReturns0WhenTwoTwoOne() {
        int result = lotterie.redTicket(TWO, TWO, ONE);
        assertEquals(0, result);
    }


}