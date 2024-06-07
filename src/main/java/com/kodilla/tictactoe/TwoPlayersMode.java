package com.kodilla.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoPlayersMode {
    public String GameEngine (Player player1, Player player2) {
        String text = "";
        CheckIfItsWinner checkIfItsWinnerPlayer1 = new CheckIfItsWinner();
        CheckIfItsWinner checkIfItsWinnerPlayer2 = new CheckIfItsWinner();
        Scanner scanner = new Scanner(System.in);
        Board game1Board = new Board();
        char[][] emptyArr = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        game1Board.setTwoD_board(emptyArr);
        game1Board.printBoard();
        //Player 1
        boolean validate = false;
        int inputTemp;
        do {
        do {
            try {
                inputTemp = scanner.nextInt();
                if (inputTemp > 0 && inputTemp < 10) {
                    break; //valid input
                } else {
                    System.out.println("Please enter a number between 1 and 9");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a number");
                scanner.next();
                continue;
            }
        } while(true);
        do{
            try {
                game1Board.setTwoD_board(inputTemp, player1);
                validate = true;
            } catch (FieldIsOccupiedException e) {
                System.out.println("Exception: " + e.getMessage());
                scanner.next();
                continue;
            }
        } while (!validate);
        checkIfItsWinnerPlayer1.setMovesTable(inputTemp);
        game1Board.printBoard();

        validate = false;
        System.out.println("Player 2 Round: " + player2.getPlayerName());
            do {
                try {
                    inputTemp = scanner.nextInt();
                    if (inputTemp > 0 && inputTemp < 10) {
                        break; //valid input
                    } else {
                        System.out.println("Please enter a number between 1 and 9");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input. Please enter a number");
                    scanner.next();
                    continue;
                }
            } while(true);
            do{
                try {
                    game1Board.setTwoD_board(inputTemp, player2);
                    validate = true;
                } catch (FieldIsOccupiedException e) {
                    System.out.println("Exception: " + e.getMessage());
                    scanner.next();
                    continue;
                }
            } while (!validate);
            game1Board.printBoard();
            checkIfItsWinnerPlayer2.setMovesTable(inputTemp);
                if (checkIfItsWinnerPlayer1.checkMovesTable() && checkIfItsWinnerPlayer2.checkMovesTable()) {
                    text = "It's a Tie!";
                    break;
                }
                else if (checkIfItsWinnerPlayer1.checkMovesTable()) {
                    text = "Player 1 Wins! " + player1.getPlayerName();
                }
                else {
                    text = "Player 2 Wins! " + player2.getPlayerName();
                }
            }while(!checkIfItsWinnerPlayer1.checkMovesTable() && !checkIfItsWinnerPlayer2.checkMovesTable());
        return text;
        }
    }
