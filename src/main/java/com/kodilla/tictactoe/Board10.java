package com.kodilla.tictactoe;

import java.lang.reflect.Field;

public class Board10 {
    char[][] twoD_board = new char[10][10];

    public void clearBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                twoD_board[i][j] = ' ';
            }
        }
    }

    public char[][] getTwoD_board() {
        return twoD_board;
    }

    public void setTwoD_board(int field, Player player) throws FieldIsOccupiedException {
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
        this.twoD_board[row][col] = sign;

    }

    public void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
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
        if (twoD_board[row][col] == ' ') {
            return true;
        }
        return false;
    }
    public void setTwoD_board(char[][] twoD_board) {
        this.twoD_board = twoD_board;
    }
}
