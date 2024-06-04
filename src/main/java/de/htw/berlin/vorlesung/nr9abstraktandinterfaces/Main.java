package de.htw.berlin.vorlesung.nr9abstraktandinterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kreis kreis = new Kreis(1.5);
        System.out.println(kreis);
        Rechteck rechteck = new Rechteck(2, 4);
        Rechteck rechteck2 = new Rechteck(2, 5);
        Shape[] shapes = new Shape[2];
        shapes[0] = kreis;
        shapes[1] = rechteck;

        int i = rechteck.compareTo(rechteck2);
        System.out.println(i);

        System.out.println("____ Rechtecke sortieren ______");
        Rechteck[] rechteckArray = new Rechteck[6];
        rechteckArray[0] = new Rechteck(9, 13);
        rechteckArray[1] = new Rechteck(4, 17);
        rechteckArray[2] = new Rechteck(12, 5);
        rechteckArray[3] = new Rechteck(8, 9);
        rechteckArray[4] = new Rechteck(10, 11);
        rechteckArray[5] = new Rechteck(5, 15);

        System.out.println("Ausgabe unsortiert");
        for (Rechteck r : rechteckArray) {
            System.out.println(r);
        }

        sortierte(rechteckArray);

        System.out.println("Ausgabe sortiert");
        for (Rechteck r : rechteckArray) {
            System.out.println(r);
        }

        List test;
        test = new ArrayList();
        test = new LinkedList();
        ArrayList list = new ArrayList();
        // funktioniert nicht
        //list = new LinkedList<>();
    }

    private static void sortierte(Comparable[] unsorted) {
        for (int bubble = 1; bubble < unsorted.length; bubble++) {
            for (int i = 0; i < unsorted.length - bubble; i++) {
                if (unsorted[i].compareTo(unsorted[i + 1]) > 0) {
                    Comparable temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                }
            }
        }
    }
}
