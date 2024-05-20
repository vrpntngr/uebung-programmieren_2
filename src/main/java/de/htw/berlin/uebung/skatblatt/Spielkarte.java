package de.htw.berlin.uebung.skatblatt;

import java.util.Random;

public class Spielkarte {
    private final KartenWert wert;
    private final KartenFarbe farbe;
    private final Random zufallsWert = new Random();

    public Spielkarte(KartenWert wert, KartenFarbe farbe) {
        this.wert = wert;
        this.farbe = farbe;
    }

    public Spielkarte() {
        this.farbe = zufallsKartenfarbeAusfuehrlich();
        this.wert = zufallsKartenWert();
    }

    public int getPunkte() {
        return wert.getWert();
    }

    private KartenWert zufallsKartenWert() {
        return KartenWert.values()[zufallsWert.nextInt(KartenWert.values().length)];
    }

    private KartenFarbe zufallsKartenFarbeEinzeiler() {
        return KartenFarbe.values()[zufallsWert.nextInt(KartenFarbe.values().length)];
    }

    private KartenFarbe zufallsKartenfarbeAusfuehrlich() {
        KartenFarbe[] valuesFarbe = KartenFarbe.values();
        int anzahlVonFarben = valuesFarbe.length;
        int index = zufallsWert.nextInt(anzahlVonFarben);
        return valuesFarbe[index];
    }

    @Override
    public String toString() {
        return "de.htw.uebung.skattblatt.Spielkarte{" +
                "wert=" + wert +
                ", farbe=" + farbe +
                '}';
    }
}
