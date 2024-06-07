package com.kodilla.tictactoe;

public class Player {
    private String playerName;
    private int playerId;
    private int numberOfWinMatches;

    public Player(String playerName, int playerId) {
        this.playerName = playerName;
        this.playerId = playerId;
    }
    //gettery
    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfWinMatches() {
        return numberOfWinMatches;
    }

    public int getPlayerId() {
        return playerId;
    }

    //settery
    public void setNumberOfWinMatches(int numberOfWinMatches) {
        this.numberOfWinMatches += numberOfWinMatches;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
