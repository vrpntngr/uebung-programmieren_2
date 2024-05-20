package de.htw.berlin.vorlesung.nr04exceptions;

import java.io.IOException;

public class ExceptionsBeispiel {
    // TODO Beispiele

    public void blub() throws IOException {
        tutIrgendwas(1);
    }

    public void tutIrgendwas(int input) throws IOException {
        if (input == 0) {
            throw new IOException();

        }
    }

    public static void main(String[] args) {
        System.out.println(divided(5, 2));
        System.out.println(divided(5, 0));

        mehreExceptions();
    }

    private static void mehreExceptions() {
        String[] basen = {"2", "8", "10", "HI"};

        for (int i = 0; i <= 4; i++) {
            int base = 0;
            double result = 0;
            boolean ok = false;

            try {
                base = Integer.parseInt(basen[i]);
                ok = true;

            } catch (NumberFormatException e) {
                System.out.println("Keine Zahl: " + basen[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Außerhalb des Arrays.");
            } catch (Exception e) {
                System.out.println("Fehler");

            }
            if (ok) {
                for (int exponent = 0; exponent < 6; exponent++) {
                    result = Math.pow(base, exponent);
                    System.out.printf("%d ^ %d = %.0f %n", base, exponent, result);
                }
            }
        }
    }

    private static double divided(int divident, int divisor) {
        try {
            return divident / divisor;

        } catch (ArithmeticException e) {
            return 0;
        }
    }

}
