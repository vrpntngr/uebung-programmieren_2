package de.htw.berlin.uebung.tests.gruppe1;

public class Phone {

    public boolean answer(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning == false && isMom == false && isAsleep == false) {
            return true;
        }
        if (isMorning == true && isMom == true && isAsleep == false) {
            return true;
        }
        if (isMorning == false && isMom == true && isAsleep == false) {
            return true;
        }
        return false;
    }
}
