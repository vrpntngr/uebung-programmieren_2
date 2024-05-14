package de.htw.berlin.uebung.mitarbeiterverwaltung1;

public class Schaltjahr {

    public static boolean istSchaltjahr(int jahr) {
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0 && jahr % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Ein Schaltjahr ist definiert als ein Jahr, das durch 4 teilbar ist,
        // aber ansonsten nicht durch 100 teilbar ist,
        // außer es ist auch durch 400 teilbar.

        // 2001 ein typisches Normaljahr
        System.out.println(istSchaltjahr(2001));
        // 1996 ein typisches Schaltjahr
        System.out.println(istSchaltjahr(1996));
        // 1900 ein atypisches Normaljahr und
        System.out.println(istSchaltjahr(1900));
        // 2000 ein atypisches Schaltjahr
        System.out.println(istSchaltjahr(2000));
    }

}
