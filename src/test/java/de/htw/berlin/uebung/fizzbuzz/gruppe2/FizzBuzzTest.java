package de.htw.berlin.uebung.fizzbuzz.gruppe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void durchDreiTeilbar() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzUndBuzz(9);
        assertEquals("Fizz", result);
    }

    @Test
    public void durchFuenfTeilbar() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzUndBuzz(10);
        assertEquals("Buzz", result);

    }

    @Test
    public void durchDreiUndFuenfTeilbar() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzUndBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void fuerEingabeEinsWirdEinsZurueckgegeben() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzUndBuzz(1);
        assertEquals("1", result);
    }

}