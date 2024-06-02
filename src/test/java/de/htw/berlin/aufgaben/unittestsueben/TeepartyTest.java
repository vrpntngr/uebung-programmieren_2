package de.htw.berlin.aufgaben.unittestsueben;

import de.htw.berlin.aufgaben.unittestsueben.Teeparty.Stimmung;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static de.htw.berlin.aufgaben.unittestsueben.Teeparty.Stimmung.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TeepartyTest {

    private static Teeparty party;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        party = new Teeparty();
    }

    @Test
    public void stimmungIsBadWennTee4undKuchen4() {
        Stimmung result = party.getTeePartyStimmung(4, 4);
        assertEquals(BAD, result);
    }

    @Test
    public void stimmungIsBadWennTee4undKuchen6() {
        Stimmung result = party.getTeePartyStimmung(4, 6);
        assertEquals(BAD, result);
    }

    @Test
    public void stimmungIsBadWennTee6undKuchen4() {
        Stimmung result = party.getTeePartyStimmung(6, 4);
        assertEquals(BAD, result);
    }

    @Test
    public void stimmungIsGoodWennTee5undKuchen5() {
        Stimmung result = party.getTeePartyStimmung(5, 5);
        assertEquals(GOOD, result);
    }

    @Test
    public void stimmungIsGoodWennTee15undKuchen10() {
        Stimmung result = party.getTeePartyStimmung(15, 10);
        assertEquals(GOOD, result);
    }

    @Test
    public void stimmungIsGoodWennTee100undKuchen110() {
        Stimmung result = party.getTeePartyStimmung(100, 110);
        assertEquals(GOOD, result);
    }

    @Test
    public void stimmungIsGreatWennTee5undKuchen10() {
        Stimmung result = party.getTeePartyStimmung(5, 10);
        assertEquals(GREAT, result);
    }

    @Test
    public void stimmungIsGreatWennTee10undKuchen5() {
        Stimmung result = party.getTeePartyStimmung(10, 5);
        assertEquals(GREAT, result);
    }

    //    if (tee * 2 <= kuchen || kuchen * 2 <= tee) {
    //    return GREAT;
    //}
    //    return GOOD;

}