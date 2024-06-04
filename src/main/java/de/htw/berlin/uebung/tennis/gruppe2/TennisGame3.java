package de.htw.berlin.uebung.tennis.gruppe2;

import de.htw.berlin.uebung.tennis.TennisGame;

public class TennisGame3 implements TennisGame {
    private int pointsPlayer2;
    private int pointsPlayer1;
    private String player1Name;
    private String player2Name;
    private final String[] translatePointsInTennis = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String scorePlayer1;
        String scorePlayer2;
        if (keinSpielerkannJetztGewinnen()) {
            scorePlayer1 = translatePointsInTennis[pointsPlayer1];
            scorePlayer2 = translatePointsInTennis[pointsPlayer2];
            if (pointsPlayer1 == pointsPlayer2) {
                return scorePlayer1 + "-All";
            }
            return scorePlayer1 + "-" + scorePlayer2;
        } else {
            if (pointsPlayer1 == pointsPlayer2) {
                return "Deuce";
            }
            String advantagePlayer = pointsPlayer1 > pointsPlayer2 ?
                    player1Name :
                    player2Name;
            int scoreDifference = pointsPlayer1 - pointsPlayer2;
            int squaredScoreDifference = scoreDifference * scoreDifference;
            // return (squaredScoreDifference == 1) ?
            // return ((pointsPlayer1 - pointsPlayer2)*(pointsPlayer1 - pointsPlayer2) == 1) ?
            // return (pointsPlayer1 - pointsPlayer2 == 1 || pointsPlayer1 - pointsPlayer2 == -1) ?
            return (Math.abs(pointsPlayer1 - pointsPlayer2) == 1) ?
                    "Advantage " + advantagePlayer :
                    "Win for " + advantagePlayer;
        }
    }

    private boolean keinSpielerkannJetztGewinnen() {
        return pointsPlayer1 < 4 && pointsPlayer2 < 4 && !(pointsPlayer1 + pointsPlayer2 == 6);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            this.pointsPlayer1 += 1;
        } else {
            this.pointsPlayer2 += 1;
        }
    }
}
