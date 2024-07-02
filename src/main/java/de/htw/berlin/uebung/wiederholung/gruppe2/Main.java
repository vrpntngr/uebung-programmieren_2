package de.htw.berlin.uebung.wiederholung.gruppe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Anna", 123, 2.3),
                new Student("Berta", 234, 1.7),
                new Student("Charlie", 345, 1.0));


        Student s1 = new Student("Anna", 123, 2.3);
        Student s2 = new Student("Berta", 234, 1.7);
        Student s3 = new Student("Charlie", 345, 1.0);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(new Student("Tina", 123, 1.7));
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        //Collections.sort(students);
        //students = students.stream().sorted().toList();
        students.sort(Student::compareTo);
        System.out.println(students);

        Wochentag[] values = Wochentag.values();

        for (Wochentag wochentag : values) {
            System.out.println(wochentag.name() + " ist ein Arbeitstag? " + wochentag.isArbeitstag());
        }

        Arrays.stream(values).forEach(wochentag -> System.out.println(wochentag.name() + " ist ein Arbeitstag? " + wochentag.isArbeitstag()));
    }


}
