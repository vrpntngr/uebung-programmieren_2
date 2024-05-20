package de.htw.berlin.vorlesung.nr05collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListenBeispiel2 {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList();
        new ArrayList<String>();
        linkedList.add("A");
        linkedList.add("B");
        System.out.println(linkedList);
        LinkedList<String> integers = new LinkedList<>();
        integers.add("1");
        integers.add("2");
        linkedList.addAll(integers);
        System.out.println(linkedList);

        List<Integer> integerSet = new ArrayList<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1);
        System.out.println(integerSet);

    }
}
