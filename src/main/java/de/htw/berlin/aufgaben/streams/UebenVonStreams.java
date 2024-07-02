package de.htw.berlin.aufgaben.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UebenVonStreams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> numbersWithNegativ = Arrays.asList(1, 2, -1, 3, -5, 4, -2, 5, 6);
        List<String> words = Arrays.asList("Apfel", "Banane", "Organe");
        List<Person> people = Arrays.asList(new Person("Alice", 22), new Person("Bob", 17), new Person("Charlie", 23));

        // 1
        // Erzeugen Sie eine Liste mit Integers Main und übergeben Sie dieser Ihrer Methode. Die Methode gibt eine neue Liste zurück in der die Werte jeweils mit 2 multipliziert wurden.
        mitZweiMultiplizieren(numbers);
        // 2
        // Erzeugen Sie eine Liste mit Strings und nutzen Sie die Stream API um eine Liste zu erzeugen in der jeweils ein Sternchen * an die Strings angehängt wurde.
        einSternAnhaengen(words);
        // 3
        // Erzeugen Sie eine Liste mit Strings und nutzen Sie die Stream API um eine Liste zu erzeugen in der nur Strings mit mindestens 6 Zeichen enthalten sind.
        filterWoerterMitWenigerAls6Buchstaben(words);
        // 4
        //Erzeugen Sie eine Liste mit Integers und nutzen Sie die Stream API um eine Liste nur mit den geraden Integers zurückzugeben.
        filterGeradeZahlen(numbers);
        // 5 
        //Erzeugen Sie eine Liste mit positiven und negativen Integer und nutzen Sie die Stream API um nur die negativen Integers in einer Liste zurückzugeben.
        filterNegativeZahlen(numbersWithNegativ);
        // 6
        summeDerGeradenZahlen(numbers);
        // 7
        oddSquares(numbers);
        // 8
        getNamesFromAdults(people, "A");
        // 9
        groupedAndCountByAge(people);
    }

    private static List<Integer> filterNegativeZahlen(List<Integer> numbersWithNegativ) {
        List<Integer> result = numbersWithNegativ.stream().filter(n -> n < 0).toList();
        System.out.println(result);
        return result;
    }

    private static List<Integer> filterGeradeZahlen(List<Integer> numbers) {
        List<Integer> result = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
        return result;
    }

    private static List<String> filterWoerterMitWenigerAls6Buchstaben(List<String> words) {
        List<String> result = words.stream().filter(word -> word.length() >= 6).toList();
        System.out.println(result);
        return result;
    }

    private static List<String> einSternAnhaengen(List<String> words) {
        List<String> result = words.stream().map(w -> w + "*").toList();
        System.out.println(result);
        return result;
    }

    private static List<Integer> mitZweiMultiplizieren(List<Integer> numbers) {
        List<Integer> result = numbers.stream().map(n -> n * 2).toList();
        System.out.println(result);
        return result;
    }

    private static Map<Integer, Long> groupedAndCountByAge(List<Person> people) {
        Map<Integer, Long> groupByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println("Personen gruppiert nach Alter: " + groupByAge);
        return groupByAge;
    }


    public static Integer summeDerGeradenZahlen(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Summe der geraden Zahlen: " + sum);
        return sum;
    }

    public static List<Integer> oddSquares(List<Integer> numbers) {
        List<Integer> oddSquares = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Quadrate der ungeraden Zahlen: " + oddSquares);
        return oddSquares;
    }

    public static List<String> getNamesFromAdults(List<Person> people, String startLetter) {
        List<String> names = people.stream()
                .filter(p -> p.getAge() > 18)
                .filter(p -> p.getName().startsWith(startLetter))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Gefilterte Namen: " + names);
        return names;
    }

    private static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
