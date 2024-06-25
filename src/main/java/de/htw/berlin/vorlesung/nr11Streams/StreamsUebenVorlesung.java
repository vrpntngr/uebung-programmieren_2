package de.htw.berlin.vorlesung.nr11Streams;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamsUebenVorlesung {
    public static void main(String[] args) {
        streamsErzeugen();
        listenVonListenZuEinerListe();
        fizzBuzz();
    }

    private static void fizzBuzz() {
        IntStream.range(1, 101).mapToObj(i -> {
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
        }).forEach(System.out::println);
    }

    private static void listenVonListenZuEinerListe() {
        List<Integer> liste1 = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 5, 7, 3, 2);
        List<Integer> liste2 = Arrays.asList(8, 6, 4, 2, 5, 8, 9);
        List<Integer> liste3 = Arrays.asList(16, 24, 56, 8, 9);

        List<List<Integer>> zahlen = Arrays.asList(liste1, liste2, liste3);

        List<Integer> list = zahlen.stream().flatMap(ausgedachterName -> ausgedachterName.stream()).toList();
        System.out.println();
        System.out.println(zahlen);
        System.out.println("Flat map Liste");
        System.out.println(list);

        List<Integer> sortierteListe = zahlen.stream().flatMap(subliste -> subliste.stream()).sorted().toList();
        System.out.println(sortierteListe);

        Set<Integer> sortierteSet = zahlen.stream().flatMap(subliste -> subliste.stream()).sorted().collect(Collectors.toSet());
        System.out.println(sortierteSet);
        System.out.println("Summe");
        System.out.println(liste1.stream().mapToInt(i -> Integer.valueOf(i)).sum());
        System.out.println(liste1.stream().reduce(0, (a, b) -> a + b));
        System.out.println(liste1.stream().reduce(10, (a, b) -> a + b));

        List<Integer> reduzierteListe = zahlen.stream().flatMap(subliste -> subliste.stream()).distinct().toList();
        System.out.println(reduzierteListe);
        List<Integer> sortierteListe2 = zahlen.stream().flatMap(subliste -> subliste.stream()).distinct().sorted().toList();
        System.out.println(sortierteListe2);

    }

    private static void streamsErzeugen() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> stringStream = Stream.of("Apfel", "Banane", "Orange");

        Person person = new Person("Mimosa", 12, "Berlin");
        Stream<Person> personStream = Stream.of(new Person("Anna", 20, "Berlin"), person);

        System.out.println("Integer Stream");
        IntStream.range(1, 11).forEach(i -> System.out.print(i + " "));
        System.out.println("Double Stream");
        DoubleStream.of(1.2, 1.3, 1.4).forEach(i -> System.out.print(i + " "));
        System.out.println("iterate");

        Stream.iterate(1, i -> i * 2).limit(10).forEach(i -> System.out.print(i + " "));
        System.out.println();

        IntStream.range(1, 11).filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
    }
}
