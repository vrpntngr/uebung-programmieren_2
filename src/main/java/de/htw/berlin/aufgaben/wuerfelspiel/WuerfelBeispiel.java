package de.htw.berlin.aufgaben.wuerfelspiel;

import java.util.Random;

public class WuerfelBeispiel {

    Random rand;

    public WuerfelBeispiel() {
        this.rand = new Random();
    }

    public int wuerfeln() {
        return rand.nextInt(6) + 1;
    }
}
