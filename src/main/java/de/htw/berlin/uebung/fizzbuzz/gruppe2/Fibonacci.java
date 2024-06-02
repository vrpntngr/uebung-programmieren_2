package de.htw.berlin.uebung.fizzbuzz.gruppe2;

public class Fibonacci {


    public int blah(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int count = 2; count <= i; count++) {
            c = a + b;
            //Variablen wechseln
            a = b;
            b = c;
        }
        return c;

    }
}
