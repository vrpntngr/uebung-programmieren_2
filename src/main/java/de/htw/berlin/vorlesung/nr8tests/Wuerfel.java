package de.htw.berlin.vorlesung.nr8tests;

import java.util.Random;

public class Wuerfel {
    private final Random random;

    public Wuerfel(Random random) {
        this.random = random;
    }

    int wuerfeln() {
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Wuerfel w = new Wuerfel(new Random());
        System.out.println(w.wuerfeln());
        System.out.println(w.wuerfeln());
        System.out.println(w.wuerfeln());
    }
}
