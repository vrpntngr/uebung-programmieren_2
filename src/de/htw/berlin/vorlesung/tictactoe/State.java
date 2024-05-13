package de.htw.berlin.vorlesung.tictactoe;

public enum State {
    EMPTY(0), X(1), O(2);

    private int wert;

    public int getWert() {
        return wert;
    }

    private State(int wert) {
        this.wert = wert;
    }
}
