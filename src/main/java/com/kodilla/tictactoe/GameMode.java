package com.kodilla.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMode {
    public int chooseGameMode() {
        System.out.println("Choose size of the board: ");
        System.out.println("3x3 (Press '1')");
        System.out.println("10x10 (Press '2')");
        int number;
        Scanner input = new Scanner(System.in);
        do{
            try {
                number = input.nextInt();
                if (number > 0 && number < 3) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 2");
                    continue;
                }
            } catch (final InputMismatchException e) {
                System.out.println("You have entered an invalid input. Try again.");
                input.next();
                continue;
            }
        } while(true);
        return number;
    }
}
