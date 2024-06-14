package com.kodilla.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnePlayerMode {
    public String GameEngine(Player player1, Player player2) {
        Board boardGame = new Board();
        CheckIfItsWinner checkIfItsWinner = new CheckIfItsWinner();
        Scanner scanner = new Scanner(System.in);
        //game1
        boardGame.clearBoard();
        int input = 0;
        do {
            System.out.println("Player 1 Turn: " + player1.getPlayerName());
            do {
                try {
                    do {
                        try {
                            input = scanner.nextInt();
                            if (input == 00 || input == 01 || input == 02
                                    || input == 10 || input == 11 || input == 12
                                    || input == 20 || input == 21 || input == 22) {
                                break;
                            } else {
                                System.out.println("Please enter correct coordinates");
                                continue;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter two digits");
                            scanner.next();
                            continue;
                        }
                    } while (input != 00 && input != 01 && input != 02
                            && input != 10 && input != 11 && input != 12
                            && input != 20 && input != 21 && input != 22);
                    if (boardGame.checkField(input)) {
                        boardGame.setTwoD_board(input, player1);
                        break;
                    } else {
                        System.out.println("Field is Occupied. Try another one");
                    }
                } catch (FieldIsOccupiedException e) {
                    System.out.println("Exception: " + e.getMessage());
                    scanner.next();
                }
            } while (true);
            boardGame.printBoard();
            System.out.println("Player 2 Turn: " + player2.getPlayerName());
            do {
                int field = player2.makeMoveSmallBoard();
                if(boardGame.checkField(field)){
                try {
                    boardGame.setTwoD_board(field, player2);
                    break;
                }catch (FieldIsOccupiedException e){
                     System.out.println(e.getMessage());
                     scanner.next();
                    }
                }
              } while (true);
                    boardGame.printBoard();
                    // checking winner
                    if ((checkIfItsWinner.checkRows(player1, boardGame) && checkIfItsWinner.checkRows(player2, boardGame)) ||
                            (checkIfItsWinner.checkCol(player1, boardGame) && checkIfItsWinner.checkCol(player2, boardGame)) ||
                            (checkIfItsWinner.checkDiag(player1, boardGame) && checkIfItsWinner.checkDiag(player2, boardGame)) ||
                            (checkIfItsWinner.checkDiagReverse(player1, boardGame) && checkIfItsWinner.checkDiagReverse(player2, boardGame))) {
                        return "It's a Tie!";
                    } else if ((checkIfItsWinner.checkRows(player1, boardGame)) ||
                            (checkIfItsWinner.checkCol(player1, boardGame)) ||
                            (checkIfItsWinner.checkDiag(player1, boardGame)) ||
                            (checkIfItsWinner.checkDiagReverse(player1, boardGame))) {
                        return "The winner is: " + player1.getPlayerName();
                    } else if ((checkIfItsWinner.checkRows(player2, boardGame)) ||
                            (checkIfItsWinner.checkCol(player2, boardGame)) ||
                            (checkIfItsWinner.checkDiag(player2, boardGame)) ||
                            (checkIfItsWinner.checkDiagReverse(player2, boardGame))) {
                        return "The winner is: " + player2.getPlayerName();
                    }
            } while (!checkIfItsWinner.checkDiagReverse(player1, boardGame) && !checkIfItsWinner.checkDiagReverse(player2, boardGame))
                    ;
                return "There is no winner";
            }
        }