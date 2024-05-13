package de.htw.berlin.vorlesung.nr01tictactoe;

public class TicRacToeMain {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.makeMove(0, 0, State.X);
        ticTacToe.makeMove(0, 1, State.O);
    }

}
