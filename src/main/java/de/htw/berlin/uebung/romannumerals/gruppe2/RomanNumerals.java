package de.htw.berlin.uebung.romannumerals.gruppe2;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {


    public String convert(int decimal) {
        Map<Integer, String> romanNumerals = new LinkedHashMap<>();
        romanNumerals.put(50, "L");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");
        String romanNumeral = "";
        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            while (decimal >= entry.getKey()) { //while ermoeglicht uns, immer 10 von decimal abzuziehen
                // und fuer jedes Mal ein X zu schreiben, bis keine 10 mehr uebrig ist
                romanNumeral += entry.getValue();
                decimal -= entry.getKey();
            }
        }
//        while(decimal >= 10) { //while ermoeglicht uns, immer 10 von decimal abzuziehen
//            // und fuer jedes Mal ein X zu schreiben, bis keine 10 mehr uebrig ist
//                romanNumeral += "X";
//                decimal -= 10;
//        }
//        while(decimal >= 5) {
//            romanNumeral += "V";
//            decimal -= 5;
//        }
//        for(int i=0; i<decimal; i++) {
//            romanNumeral += "I";
//        }
        return romanNumeral;

    }

}
