package de.htw.berlin.vorlesung.nr7tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SchaltjahrTest {
    // 2001 ein typisches Normaljahr
    @Test
    public void einTypischesNormalJahr2001() {
        boolean result = Schaltjahr.istNormaljahr(2001);

        assertTrue(result);
    }

    // 1996 ein typisches Schaltjahr
    @Test
    public void einTypischesSchaltjahr1996() {
        boolean result = Schaltjahr.istNormaljahr(1996);

        assertFalse(result);
    }

    // 1900 ein atypisches Normaljahr und
    @Test
    public void einAtypischesNormalJahr1900() {
        boolean result = Schaltjahr.istNormaljahr(1900);
        assertTrue(result);
    }

    // 2000 ein atypisches Schaltjahr
    @Test
    public void einAtypischesSchaltjahr2000() {
        boolean result = Schaltjahr.istNormaljahr(2000);
        assertFalse(result);
    }
}