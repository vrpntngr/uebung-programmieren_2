package de.htw.berlin.uebung.fizzbuzz.gruppe1;

public class FizzBuzz {
    public String fizzbuzzPruefung(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }

    public void printFizzBuzz() {
        for (int count = 1; count <= 100; count++) {
            String result = fizzbuzzPruefung(count);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz();
    }
}
