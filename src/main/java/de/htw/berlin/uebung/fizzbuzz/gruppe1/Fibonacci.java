package de.htw.berlin.uebung.fizzbuzz.gruppe1;

public class Fibonacci {
    public int fibValueAtIndex(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        //summand1 ist die vorletzte stelle des index
        //summand2 ist die letzte stelle des index
        int summand1 = 0;
        int summand2 = 1;
        int ergebnis = 0; //initialisierung damit der compiler nicht meckert
        for (int count = 2; count <= i; count++) {
            ergebnis = summand1 + summand2;
            summand1 = summand2;
            summand2 = ergebnis;
        }
        return ergebnis;
    }
}
