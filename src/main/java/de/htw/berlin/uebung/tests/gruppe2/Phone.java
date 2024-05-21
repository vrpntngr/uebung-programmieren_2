package de.htw.berlin.uebung.tests.gruppe2;

public class Phone {

    public boolean answer(boolean isMorning, boolean isMom, boolean isAsleep) {
        // wenn ich das so schreibe, hat es den gleichen Wert wie isAsleep == true, so ist es aber schoener ausgedrueckt
        if (isAsleep) {
            return false;
        }
        // das koennte man durch !isMom verschoenern
        if (isMorning == false && isMom == false) {
            return true;
        }

        if (isMorning == true && isMom == true) {
            return true;
        }
        if (isMorning == false && isMom == true) {
            return true;
        }
        return false;
    }
}
