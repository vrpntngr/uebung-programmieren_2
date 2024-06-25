package de.htw.berlin.uebung.romannumerals.gruppe1;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumbers {
    Map<Integer, String> dezimalToRomanMap = new LinkedHashMap<>();

    public RomanNumbers() {
        dezimalToRomanMap.put(100, "C");
        dezimalToRomanMap.put(90, "XC");
        dezimalToRomanMap.put(50, "L");
        dezimalToRomanMap.put(10, "X");
        dezimalToRomanMap.put(9, "IX");
        dezimalToRomanMap.put(5, "V");
        dezimalToRomanMap.put(4, "IV");
        dezimalToRomanMap.put(1, "I");
    }

    public String convert(int dezimalZahl) {
        String result = "";
        for (Map.Entry<Integer, String> entry : dezimalToRomanMap.entrySet()) {
            while (dezimalZahl >= entry.getKey()) {
                result += entry.getValue();
                dezimalZahl -= entry.getKey();
            }
        }
        return result;
    }
}
