package de.htw.berlin.vorlesung.nr05collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Student> unsortiert = new HashSet<>();
        TreeSet<Student> sortiert = new TreeSet<>();
        Student s = new Student(19, "Curie", "Marie", 1);
        unsortiert.add(s);
        sortiert.add(s);
        s = new Student(17, "Merian", "Marie-Sybilla", 3);
        unsortiert.add(s);
        sortiert.add(s);
        s = new Student(9, "Merian", "Marie-Sybilla", 3);
        unsortiert.add(s);
        sortiert.add(s);
        s = new Student(15, "Merian", "Marie-Sybilla", 3);
        unsortiert.add(s);
        sortiert.add(s);
        s = new Student(17, "Merian", "Marie-Sybilla 2", 3);
        unsortiert.add(s);
        sortiert.add(s);


        System.out.println(unsortiert);
        System.out.println(sortiert);
        //System.out.println(marie.toString());
    }

}
