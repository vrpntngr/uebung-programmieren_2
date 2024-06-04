package de.htw.berlin.uebung.tennis.gruppe1;

import de.htw.berlin.uebung.tennis.TennisGame;

public class TennisGame3 implements TennisGame {
    
    private int pointsPlayer2;
    private int pointsPlayer1;
    private String player1Name;
    private String player2Name;
    final String[] namesOfPoints = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String scoreResult;
        if (noPlayerCouldWin()) {
            scoreResult = namesOfPoints[pointsPlayer1];
            if (isTie()) {
                return scoreResult + "-All";
            }
            return scoreResult + "-" + namesOfPoints[pointsPlayer2];
        } else {
            if (isTie()) {
                return "Deuce";
            }
            String playerWithMorePoints = getPlayerWithMorePoints();
            if (Math.abs(pointsPlayer1 - pointsPlayer2) == 1) {
                return "Advantage " + playerWithMorePoints;
            }
            return "Win for " + playerWithMorePoints;
        }
    }

    private String getPlayerWithMorePoints() {
        String playerWithMorePoints;
        if (pointsPlayer1 > pointsPlayer2) {
            playerWithMorePoints = player1Name;
        } else {
            playerWithMorePoints = player2Name;
        }
        return playerWithMorePoints;
    }

    private boolean isTie() {
        return pointsPlayer1 == pointsPlayer2;
    }

    private boolean noPlayerCouldWin() {
        return pointsPlayer1 < 4 && pointsPlayer2 < 4 && !(pointsPlayer1 == 3 && pointsPlayer2 == 3);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.pointsPlayer1 += 1;
        else
            this.pointsPlayer2 += 1;

    }

}
