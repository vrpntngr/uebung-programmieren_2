package de.htw.berlin.uebung.fizzbuzz.gruppe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void teilbarDurch3Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(); //fizzBuzz objekt erstellt
        String result = fizzBuzz.fizzbuzzPruefung(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void teilbarDurch5Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbuzzPruefung(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void teilbarDurch3Und5FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbuzzPruefung(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void nichtTeilbarDurch3Oder5N() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbuzzPruefung(4);
        assertEquals("4", result);
    }


}