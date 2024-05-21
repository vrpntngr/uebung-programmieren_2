package de.htw.berlin.uebung.tests.gruppe2;

public class SpecialNumber {
    // wenn ich nur %11 rausgefunden haette, aber nicht 45, 89, etc als zusammenhang erkenne, dann bekomme ich auch (wenige) punkte, wenn ich einfach die Zahlen hinzufuege, damit der Test gruen wird
    public static boolean isSpecial(int n) {
        int rest = n % 11;
        return rest == 0 || rest == 1;
    }
}
