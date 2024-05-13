package de.htw.berlin.vorlesung.tictactoe;

public class TicTacToe {

    //public static final int EMPTY = 0;
    //public static final int X = 1;
    //public static final int O = 2;
    State[][] field;

    public TicTacToe() {
        field = new State[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                field[row][column] = State.EMPTY;
            }
        }
    }

    void makeMove(int row, int column, State player) {
        if (field[row][column] == State.EMPTY) {
            field[row][column] = player;
        }
    }

}
