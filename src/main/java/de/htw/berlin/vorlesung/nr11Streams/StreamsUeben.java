package de.htw.berlin.vorlesung.nr11Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsUeben {

    public static void main(String[] args) {
        streamsErzeugen();
        listeVonListenZuEinerListe();
        personenStreams();
        fizzBuzz();
    }

    private static void streamsErzeugen() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(System.out::println);
        Stream.of("Apfel", "Banane", "Orange");
        //Stream.of(new Person("Anna", 20, "Berlin"));
        IntStream.range(1, 11).forEach(System.out::println);
        LongStream.range(1L, 11L);
        DoubleStream.of(1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9);

        Stream.iterate(1, i -> i * 2).limit(5).forEach(System.out::println);

        // alle geraden Zahlen zwischen 0 und 10
        list = IntStream.range(0, 11).filter(i -> i % 2 == 0).mapToObj(i -> Integer.valueOf(i)).toList();
        System.out.println(list);
        list = Stream.iterate(0, i -> i + 2).limit(6).toList();
        System.out.println(list);
    }

    public static void listeVonListenZuEinerListe() {
        List<Integer> liste1 = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 9);
        List<Integer> liste2 = Arrays.asList(8, 7, 6, 3, 4, 5);
        List<Integer> liste3 = Arrays.asList(16, 17, 18, 13, 14, 15);

        List<List<Integer>> zahlen = Arrays.asList(liste1, liste2, liste3);

        // alle Werte direkt in einer Liste
        List<Integer> list = zahlen.stream().flatMap(subliste -> subliste.stream()).toList();
        System.out.println(list);

        // alle Werte sortiert in einer liste
        list = zahlen.stream().flatMap(subliste -> subliste.stream()).sorted().toList();
        System.out.println(list);

        // die Summe aller Werte
        int sum = zahlen.stream().flatMap(subliste -> subliste.stream()).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        sum = zahlen.stream().flatMap(List::stream).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // Min
        OptionalInt min = zahlen.stream().flatMap(subliste -> subliste.stream()).mapToInt(Integer::intValue).min();
        if (min.isPresent()) {
            System.out.println(min.getAsInt());
        }

        // Max
        OptionalInt max = zahlen.stream().flatMap(subliste -> subliste.stream()).mapToInt(Integer::intValue).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }

        // doppelte Elemente aussortieren = deduplizieren
        list = liste1.stream().distinct().toList();
        System.out.println(liste1);
        System.out.println(list);

        // Wieviele gerade Zahlen sind enthalten
        long count = liste2.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);
    }

    public static void personenStreams() {
//        List<Person> personen = Arrays.asList(
//                new Person("Anna", 20, "Berlin"),
//                new Person("Lina", 25, "Hamburg"),
//                new Person("Laura", 24, "München"),
//                new Person("Zora", 24, "Berlin"),
//                new Person("Tina", 21, "München"),
//                new Person("Marie", 23, "Berlin")
//        );
//        System.out.println(personen);
//
//        // sortieren Standard
//        List<Person> list = personen.stream().sorted().toList();
//        System.out.println(list);
//
//        // sortieren Nach Anfangsbuchstaben
//        list = personen.stream().sorted((p1, p2) -> p1.name().compareTo(p2.name())).toList();
//        System.out.println(list);
//        list = personen.stream().sorted(Comparator.comparing(Person::name)).toList();
//
//        // Sind alle Personen aus Berlin?
//        boolean match = personen.stream().allMatch(p -> p.wohnort().equals("Berlin"));
//        System.out.println("alle aus Berlin: " + match);
//
//        // Ist jemand aus Berlin?
//        match = personen.stream().anyMatch(p -> p.wohnort().equals("Berlin"));
//        System.out.println("eine aus Berlin: " + match);
//
//        // Ist niemand aus Köln
//        match = personen.stream().noneMatch(p -> p.wohnort().equals("Köln"));
//        System.out.println("keiner aus Köln : " + match);
//
//        Map<String, List<Person>> collect = personen.stream().collect(Collectors.groupingBy(p -> p.wohnort()));
//        System.out.println(collect);
    }

    public static void fizzBuzz() {
        IntStream.range(1, 101).mapToObj(i -> {
            if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
            if (i % 5 == 0) return "Buzz";
            if (i % 3 == 0) return "Fizz";
            return String.valueOf(i);
        }).forEach(i -> System.out.println(i));
    }
}
