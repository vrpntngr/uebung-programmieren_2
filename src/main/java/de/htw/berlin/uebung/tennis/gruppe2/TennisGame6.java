package de.htw.berlin.uebung.tennis.gruppe2;

import de.htw.berlin.uebung.tennis.TennisGame;

public class TennisGame6 implements TennisGame {
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
            return getTieScore();
        }
        if (player1Score >= 4 || player2Score >= 4) {
            return getMatchpoint();
        }
        return getRegularScore();
    }

    private String getMatchpoint() {
        int difference = player1Score - player2Score;
        if (difference == 1) {
            return "Advantage " + player1Name;
        }
        if (difference == -1) {
            return "Advantage " + player2Name;
        }
        String winner = difference >= 2 ? player1Name : player2Name;
        return "Win for " + winner;
    }

    private String getRegularScore() {
        return String.format("%s-%s", getRegularScore(player1Score), getRegularScore(player2Score));
    }

    // kann gleichen Namen haben, weil überladen
    private String getRegularScore(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };
    }

    private String getTieScore() {
        return switch (player1Score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }
}

