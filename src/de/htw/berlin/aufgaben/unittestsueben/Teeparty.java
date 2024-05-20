package de.htw.berlin.aufgaben.unittestsueben;


import static de.htw.berlin.aufgaben.unittestsueben.Teeparty.Stimmung.*;

public class Teeparty {

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public Stimmung getTeePartyStimmung(int tee, int kuchen) {
        if (tee < 5 || kuchen < 5) {
            return BAD;
        }
        if (tee * 2 <= kuchen || kuchen * 2 <= tee) {
            return GREAT;
        }
        return GOOD;
    }

    public enum Stimmung {
        BAD, GOOD, GREAT
    }
}




