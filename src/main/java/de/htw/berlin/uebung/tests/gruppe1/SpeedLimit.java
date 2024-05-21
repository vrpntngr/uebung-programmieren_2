package de.htw.berlin.uebung.tests.gruppe1;

public class SpeedLimit {

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int birthdayBonus = 0;
        if (isBirthday) {
            birthdayBonus = 5;
        }
        if (speed <= 60 + birthdayBonus) {
            return 0;
        }
        if (speed <= 80 + birthdayBonus) {
            return 1;
        }
        return 2;
    }

}
