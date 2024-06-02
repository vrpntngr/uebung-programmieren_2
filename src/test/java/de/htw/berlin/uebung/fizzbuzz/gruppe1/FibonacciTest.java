package de.htw.berlin.uebung.fizzbuzz.gruppe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    public void index3Gleich2() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibValueAtIndex(3);
        assertEquals(2, result);
    }

    @Test
    public void index4Gleich3() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibValueAtIndex(4);
        assertEquals(3, result);
    }

    @Test
    public void index0Gleich0() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibValueAtIndex(0);
        assertEquals(0, result);
    }

    @Test
    public void index1Gleich1() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibValueAtIndex(1);
        assertEquals(1, result);
    }

    @Test
    public void index2Gleich1() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibValueAtIndex(2);
        assertEquals(1, result);
    }

    @Test
    public void index10Gleich55() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibValueAtIndex(10);
        assertEquals(55, result);
    }
}