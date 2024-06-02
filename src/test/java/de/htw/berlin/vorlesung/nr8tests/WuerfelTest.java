package de.htw.berlin.vorlesung.nr8tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WuerfelTest {
    @Test
    public void testWuerfel() {
        Random random = Mockito.mock(Random.class);
        Mockito.when(random.nextInt(Mockito.anyInt())).thenReturn(4);
        Wuerfel wuerfel = new Wuerfel(random);

        int result = wuerfel.wuerfeln();

        assertEquals(5, result);
        Mockito.verify(random, Mockito.times(1)).nextInt(Mockito.anyInt());
        Mockito.verify(random, Mockito.only()).nextInt(Mockito.anyInt());

    }
}