package de.htw.berlin.uebung.fizzbuzz.gruppe2;

public class FizzBuzz {

    public String fizzUndBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(i);
    }

    public void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(fizzUndBuzz(i));

        }
    }

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int i = 100;
        fizzBuzz.printFizzBuzz(i);
    }
}
