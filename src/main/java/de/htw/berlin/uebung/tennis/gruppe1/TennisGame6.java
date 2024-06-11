package de.htw.berlin.uebung.tennis.gruppe1;

import de.htw.berlin.uebung.tennis.TennisGame;

public class TennisGame6 implements TennisGame {
    public static final int ZERO_TIE = 0;
    public static final int ONE_TIE = 1;
    public static final int TWO_TIE = 2;
    private final String player1Name;
    private final String player2Name;
    private int player1Score;
    private int player2Score;

    public TennisGame6(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return getScoreWhenTie();
        }
        if (player1Score >= 4 || player2Score >= 4) {
            return getEndGameScore();
        }
        return getRegularScore();
    }

    private String getRegularScore() {
        String score1 = getScoreName(player1Score);
        String score2 = getScoreName(player2Score);
        return score1 + "-" + score2;
        //return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private String getScoreName(int playerScore) {
        return switch (playerScore) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };
    }

    private String getEndGameScore() {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage " + player1Name;
        }
        if (scoreDifference == -1) {
            return "Advantage " + player2Name;
        }
        //String winner = scoreDifference >= 2 ? player1Name : player2Name;
        String winner;
        if (scoreDifference >= 2) {
            winner = player1Name;
        } else {
            winner = player2Name;
        }
        return "Win for " + winner;
    }

    private String getScoreWhenTie() {
        return switch (player1Score) {
            case ZERO_TIE -> "Love-All";
            case ONE_TIE -> "Fifteen-All";
            case TWO_TIE -> "Thirty-All";
            default -> "Deuce";
        };
    }
}
