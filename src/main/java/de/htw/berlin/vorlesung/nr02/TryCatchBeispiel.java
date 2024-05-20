package de.htw.berlin.vorlesung.nr02;

public class TryCatchBeispiel {
    public static void main(String[] args) {
        System.out.println(teilen(5, 2));
        System.out.println(teilen(5, 0));
    }


    public static double teilen(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Durch null darf nicht geteilt werden");
            return 0;
        }
    }
}
