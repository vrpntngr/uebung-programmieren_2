package de.htw.berlin.uebung.tests.gruppe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedLimitTest {

    @Test
    public void speedIs60AndNoBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(60, false);

        assertEquals(0, actual);
    }

    @Test
    public void speedIs30AndNoBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(30, false);

        assertEquals(0, actual);
    }

    @Test
    public void speedIs61AndNoBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(61, false);

        assertEquals(1, actual);
    }

    @Test
    public void speedIs80AndNoBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(80, false);

        assertEquals(1, actual);
    }

    @Test
    public void speedIs90AndNoBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(90, false);

        assertEquals(2, actual);
    }

    @Test
    public void speedIs65AndBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(65, true);

        assertEquals(0, actual);
    }

    @Test
    public void speedIs30AndBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(30, true);

        assertEquals(0, actual);
    }

    @Test
    public void speedIs66AndBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(66, true);

        assertEquals(1, actual);
    }

    @Test
    public void speedIs85AndBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(85, true);

        assertEquals(1, actual);
    }

    @Test
    public void speedIs95AndBirthday() {
        SpeedLimit speedLimit = new SpeedLimit();

        int actual = speedLimit.caughtSpeeding(95, true);

        assertEquals(2, actual);
    }

}
