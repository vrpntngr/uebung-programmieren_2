package de.htw.berlin.uebung.fizzbuzz.gruppe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    public void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.blah(6);
        assertEquals(8, result);
    }

    @Test
    public void testFibonacci2() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.blah(5);
        assertEquals(5, result);
    }

    @Test
    public void testFibonacci3() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.blah(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacci4() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.blah(1);
        assertEquals(1, result);

    }

    @Test
    public void testFibonacci5() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.blah(2);
        assertEquals(1, result);
    }
}