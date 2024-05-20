package de.htw.berlin.vorlesung.nr05collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Beispiel {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        String s1 = "erster";
        String s2 = "zweiter";
        String s3 = "dritter";
        String s4 = "erster";

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println("Liste");
        System.out.println(list);
        System.out.println("Set");
        System.out.println(set);

        set.add("A");
        set.add("12");
        set.add("asddfghj");

        System.out.println("Set");
        System.out.println(set);

        Iterator<String> iterator = list.iterator();
        System.out.println("Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("for each");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("for schleife ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
