package de.htw.berlin.vorlesung.nr10StreamsAndLamda;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndLamda {

    public static void main(String[] args) {
        //colorsExample();
        //basicStreamExamples();
        personenBeispiel();
    }

    private static void personenBeispiel() {
        List<Person> people = Arrays.asList(new Person("Alice", 22), new Person("Bob", 17), new Person("Charlie", 23));

        List<Person> startWthA = people.stream().filter(p -> p.name.substring(0, 1).equals("A")).collect(Collectors.toList());
        startWthA.forEach(p -> System.out.println(p.name));
        System.out.println(startWthA);

        List<String> name = people.stream().filter(p -> p.name.substring(0, 1).equals("A")).map(p -> p.name).collect(Collectors.toList());
        System.out.println(name);
    }

    private static void basicStreamExamples() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbersUnsorted = Arrays.asList(21, 15, 16, 1, 4, 3);

        Stream<Integer> stream = numbers.stream();

        stream.forEach(n -> System.out.println(n));

        // Fehler, weil Stream schon konsumiert
        // stream.forEach(n -> System.out.println(n));

        // neuer Stream
        numbers.stream().forEach(n -> System.out.println(n));

        Stream<Integer> limit = numbers.stream().limit(4);
        System.out.println("Limit: " + limit);

        limit.forEach(n -> System.out.println(n));

        boolean evenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("evenNumber: " + evenNumber);

        List<Integer> limit3 = numbers.stream().limit(3).toList();
        Set<Integer> limit4 = numbers.stream().limit(3).collect(Collectors.toSet());
        numbers.stream().collect(Collectors.toSet());

        Optional<Integer> first = numbers.stream().findFirst();
        if (first.isPresent()) {
            Integer i = first.get();
            System.out.println(i);
        }
        System.out.println(limit3);

        numbers.stream().filter(n -> n % 2 == 0).findFirst();
        numbers.stream().filter(n -> n % 2 == 0).toList();
        numbers.stream().filter(n -> n % 2 == 0).findAny();

        List<Integer> list = numbers.stream().map(n -> n * 2).toList();
        System.out.println(list);

        List<Integer> list1 = numbers.stream().skip(2).toList();
        System.out.println(list1);

        System.out.println(numbersUnsorted);
        List<Integer> list2 = numbersUnsorted.stream().sorted().toList();
        System.out.println(list2);
    }

    public static void colorsExample() {
        List<String> allColors = List.of("red", "blue", "green", "yellow", "orange", "pink", "purple");

        for (String color : allColors) {
            System.out.println(color);
        }

        allColors.forEach(color -> System.out.println(color));

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.forEach(integer -> {
            integer += 5;
            System.out.println(integer);
        });
    }

    private static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
