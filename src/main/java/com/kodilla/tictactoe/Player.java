package com.kodilla.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private String playerName;
    private int playerId;
    private int numberOfWinMatches;
    private List givenList = List.of(00, 01, 02, 10, 11, 12, 20, 21, 22);
    List<Integer> listOfMovement = new ArrayList<Integer>();

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

    public List<Integer> getListOfMovement() {
        return listOfMovement;
    }

    //settery
    public void setNumberOfWinMatches(int numberOfWinMatches) {
        this.numberOfWinMatches += numberOfWinMatches;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setListOfMovement(int move) {
        this.listOfMovement.add(move);
    }

    public int makeMoveSmallBoard() {
            Random rand = new Random();
            int index = rand.nextInt(givenList.size());
            int element = (int) givenList.get(index);
            return element;
    }
    public int makeMoveBigBoard() {
        Random rand = new Random();
        int index = rand.nextInt(100);
            return index;
        }
    }
