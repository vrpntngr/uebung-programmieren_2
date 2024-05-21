package de.htw.berlin.uebung.tests.gruppe1;

public class Phone {

    public boolean answer(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        }
        if (isMom == true) {
            return true;
        }
        if (isMorning == false) {
            return true;
        }
        return false;
    }
}
