package com.kodilla.tictactoe;

public class Board {
    char[][] twoD_board= new char[3][3];

    public void setTwoD_board(char[][] twoD_board) {
        this.twoD_board = twoD_board;
    }

    public void setTwoD_board(int field, Player player) throws FieldIsOccupiedException {
        char sign;
        char empty = ' ';
        if (player.getPlayerId() == 2) {
            sign = 'O';
        }
        else{
            sign = 'X';
        }
        switch (field) {
            case 7:
                if (this.twoD_board[0][0] == empty) {
                    this.twoD_board[0][0] = sign;
                    break;
                }
                else {
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 8:
                if (this.twoD_board[0][1] == empty) {
                    this.twoD_board[0][1] = sign;
                    break;
                }
                else {
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 9:
                if (this.twoD_board[0][2] == empty) {
                    this.twoD_board[0][2] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 4:
                if (this.twoD_board[1][0] == empty) {
                    this.twoD_board[1][0] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 5:
                if (this.twoD_board[1][1] == empty) {
                    this.twoD_board[1][1] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 6:
                if (this.twoD_board[1][2] == empty) {
                    this.twoD_board[1][2] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 1:
                if (this.twoD_board[2][0] == empty) {
                    this.twoD_board[2][0] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
            }
            case 2:
                if (this.twoD_board[2][1] == empty) {
                    this.twoD_board[2][1] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
            case 3:
                if (this.twoD_board[2][2] == empty) {
                    this.twoD_board[2][2] = sign;
                    break;
                }
                else{
                    System.out.println("Choose another field!");
                    throw new FieldIsOccupiedException("Field is Occupied");
                }
        }
    }
        public void printBoard(){
            System.out.println("|" + twoD_board[0][0] + "|" + twoD_board[0][1]  + "|" + twoD_board[0][2] + "|" );
            System.out.println("|" + twoD_board[1][0] + "|" + twoD_board[1][1]  + "|" + twoD_board[1][2] + "|" );
            System.out.println("|" + twoD_board[2][0] + "|" + twoD_board[2][1]  + "|" + twoD_board[2][2] + "|" );
        }

}

