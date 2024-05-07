package de.htw.berlin.vorlesung.collections.ausprobieren;

import java.util.ArrayList;
import java.util.Iterator;

public class BeispielListe {

    public static void main(String[] args) {
        new ArrayList<String>();
        ArrayList<String> list0 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println(list1);
        fillList(list1);
        System.out.println(list1);
        printList(list1);
        printListWithForEach(list1);

        ArrayList<String> list2 = new ArrayList<>();
        fillList(list2);
        System.out.println(list2);
        list2.remove("Wert 3");
        System.out.println(list2);
        list2.remove(6);
        System.out.println(list2);
        System.out.println(list1);
        list1.removeAll(list2);
        System.out.println(list1);
        list1.addAll(list1);
        System.out.println(list1);
    }

    private static void printList(ArrayList<String> list) {
        System.out.println("Liste Beginn");
        // use iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Ende");
    }

    public static void printListWithForEach(ArrayList<String> list) {
        System.out.println("Liste Beginn");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Ende");
    }

    private static void fillList(ArrayList<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add("Wert " + i);
        }
    }

}
