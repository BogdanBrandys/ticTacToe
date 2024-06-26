package com.kodilla.tictactoe;

public class Board {
    char[][] twoD_board = new char[3][3];

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoD_board[i][j] = ' ';
            }
        }
    }

    public char[][] getTwoD_board() {
        return this.twoD_board;
    }

    public void setTwoD_board(int field, Player player) throws FieldIsOccupiedException{
        //coordinates
        int col;
        int row;
        if (field < 10) {
            row = 0;
            col = field;
        } else {
            col = field % 10;
            row = (field - col) / 10;
        }
        //changing sign
        char sign;
        if (player.getPlayerId() == 2) {
            sign = 'O';
        } else {
            sign = 'X';
        }
        if (twoD_board[row][col] == ' ') {
            twoD_board[row][col] = sign;
        } else {
            throw new FieldIsOccupiedException("Field is Occupied");
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + twoD_board[i][j]);
            }
            System.out.print(" | ");
            System.out.println();
        }
    }
    public boolean checkField (int field) {
        int col;
        int row;
        if (field < 10) {
            row = 0;
            col = field;
        } else {
            col = field % 10;
            row = (field - col) / 10;
        }
        return this.twoD_board[row][col] == ' ';
    }
    public void setTwoD_board(char[][] twoD_board) {
        this.twoD_board = twoD_board;
    }
}


