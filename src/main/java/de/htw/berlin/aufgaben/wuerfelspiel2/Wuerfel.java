package de.htw.berlin.aufgaben.wuerfelspiel2;

import java.util.Random;

public class Wuerfel {
    // Wir haben random aus der methode entfernt, weil wir sonst jedes mal ein neues Objekt erzeugen. Das muss nicht sein, wir koennen das Objekt behalten
    //Wir haben eine globale Variable genutzt und einen Konstruktor fuer Random erzeugt.
    // Wir muessen Random nicht veraendern sobald es einmal erstellt wurde. Deshalb final
    // Random muss nicht nach aussen freigegeben werden, deshalb private. -- mehr Kontrolle
    private final Random r;

    public Wuerfel() {
        this.r = new Random();
    }

    public int wuerfeln() {
        // return (int) (Math.random() * 6) + 1;
        return r.nextInt(6) + 1;


    }
}
