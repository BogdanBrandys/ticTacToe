package com.kodilla.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfPlayers {
    public int numberOfPlayers() {
        System.out.println("Choose Number of Players: ");
        System.out.println("One Player (Press '1')");
        System.out.println("Two Players (Press '2')");
        int number;
        Scanner input = new Scanner(System.in);
        do{
        try {
            number = input.nextInt();
            if (number >= 1 && number <= 2) {
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
