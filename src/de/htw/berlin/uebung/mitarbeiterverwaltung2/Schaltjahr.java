package de.htw.berlin.uebung.mitarbeiterverwaltung2;

public class Schaltjahr {

    public static void main(String[] args) {
        // Ein Schaltjahr ist definiert als ein Jahr, das durch 4 teilbar ist,
        // aber ansonsten nicht durch 100 teilbar ist,
        // außer es ist auch durch 400 teilbar.

        System.out.println("2001 ist ein Schaltjahr? " + istSchaltjahr(2001));
        System.out.println("1996 ist ein Schaltjahr? " + istSchaltjahr(1996));
        System.out.println("1900 ist ein Schaltjahr? " + istSchaltjahr(1900));
        System.out.println("2000 ist ein Schaltjahr? " + istSchaltjahr(2000));

        // 2001 ein typisches Normaljahr
        // 1996 ein typisches Schaltjahr
        // 1900 ein atypisches Normaljahr und
        // 2000 ein atypisches Schaltjahr
    }

    public static boolean istSchaltjahr(int jahr) {
        return jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0;
    }

}
