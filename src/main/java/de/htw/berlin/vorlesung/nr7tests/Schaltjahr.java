package de.htw.berlin.vorlesung.nr7tests;

public class Schaltjahr {
    public static boolean istNormaljahr(int jahr) {
        //return !(jahr % 4 == 0 && jahr % 100 != 0 || jahr %400 == 0);
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            //if(jahr %400 == 0 || jahr % 4 == 0 && jahr % 100 != 0) {
            return false;
        }
        return true;
    }

    public static boolean istSchaltjahr(int jahr) {
        return !istNormaljahr(jahr);
    }

    // Ein Schaltjahr ist definiert als ein Jahr, das durch 4 teilbar ist,
    // aber ansonsten nicht durch 100 teilbar ist,
    // außer es ist auch durch 400 teilbar.

    // 2001 ein typisches Normaljahr
    // 1996 ein typisches Schaltjahr
    // 1900 ein atypisches Normaljahr und
    // 2000 ein atypisches Schaltjahr
}
