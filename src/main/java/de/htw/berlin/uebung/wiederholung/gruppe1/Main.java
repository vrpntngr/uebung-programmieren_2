package de.htw.berlin.uebung.wiederholung.gruppe1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("aya", 2345, 2.3);
        Student s2 = new Student("bea", 2346, 3.3);
        Student s3 = new Student("ito", 2347, 2.7);
        Student s4 = new Student("lucky", 2348, 1.0);
        Student s5 = new Student("nea", 2349, 1.0);

        List<AbstractStudent> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s5);
        students.add(s4);

        students.add(new ExternalStudent("piri", 123, 1.0));


        System.out.println(students);
        students.sort(AbstractStudent::compareTo);
        System.out.println(students);


    }
}
