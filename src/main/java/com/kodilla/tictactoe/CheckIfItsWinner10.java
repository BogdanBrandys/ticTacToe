package com.kodilla.tictactoe;

public class CheckIfItsWinner10 {

    public boolean checkRows(Player player, Board10 board) {
        char sign;
        int numberOfSigns = 0;
        char[][] board10 = board.getTwoD_board();
        if (player.getPlayerId() == 1) {
            sign = 'X';
        } else {
            sign = 'O';
        }
        //checking rows
        for (int i = 0; i < board10.length; i++) {
            numberOfSigns = 0;
            for (int j = 0; j < board10.length; j++) {
                if (board10[i][j] == sign) {
                    numberOfSigns++;
                    if (numberOfSigns == 5) {
                        return true;
                    }
                } else {
                    numberOfSigns = 0;
                }
            }
        }
        return false;
    }
    //checking columns
    public boolean checkCol(Player player, Board10 board) {
        char sign;
        int numberOfSigns = 0;
        char[][] board10 = board.getTwoD_board();
        if (player.getPlayerId() == 1) {
            sign = 'X';
        } else {
            sign = 'O';
        }
        for (int j = 0; j < board10[0].length; j++) {
            for (int i = 0; i < board10.length; i++) {
                if ((board10[i][j]) == sign) {
                    numberOfSigns++;
                    if (numberOfSigns == 5) {
                        return true;
                    }
                } else {
                    numberOfSigns = 0;
                }
            }
        }
        return false;
    }

    public boolean checkDiag(Player player, Board10 board) {
        char sign;
        int numberOfSigns = 0;
        char[][] board10 = board.getTwoD_board();
        if (player.getPlayerId() == 1) {
            sign = 'X';
        } else {
            sign = 'O';
        }
        int length = board10.length;
        for (int k = 0; k <= length - 1; k++) {
            numberOfSigns = 0;
            int i = k;
            int j = 0;
            while (i >= 0) { //upper border
                if (board10[i][j] == sign) {
                    numberOfSigns++;
                } else {
                    numberOfSigns = 0;
                }
                i = i - 1;
                j = j + 1;
                if (numberOfSigns == 5) {
                    return true;
                }
            }
        }
        for (int k = 1; k <= length-1; k++){
            numberOfSigns = 0;
            int i = length - 1;
            int j = k;
            while (j <= length - 1){
                if (board10[i][j] == sign) {
                    numberOfSigns++;
                } else {
                    numberOfSigns = 0;
                }
                i = i - 1;
                j = j + 1;
                if (numberOfSigns == 5) {
                    return true;
                }
            }
        } return false;
    }
    public boolean checkDiagReverse(Player player, Board10 board) {
        char sign;
        int numberOfSigns = 0;
        char[][] board10 = board.getTwoD_board();
        if (player.getPlayerId() == 1) {
            sign = 'X';
        } else {
            sign = 'O';
        }
        int length = board10.length;
        for (int k = 0; k <= length - 1; k++) {
            numberOfSigns = 0;
            int i = k;
            int j = length - 1;
            while (i >= 0) { //upper border
                if (board10[i][j] == sign) {
                    numberOfSigns++;
                } else {
                    numberOfSigns = 0;
                }
                i = i - 1;
                j = j - 1;
                if (numberOfSigns == 5) {
                    return true;
                }
            }
        }
        for (int k = 8; k >= 1; k--) {
            int i = length - 1;
            int j = k;
            while (j >= 0) {
                if (board10[i][j] == sign) {
                    numberOfSigns++;
                } else {
                    numberOfSigns = 0;
                }
                i = i - 1;
                j = j - 1;
                if (numberOfSigns == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}

