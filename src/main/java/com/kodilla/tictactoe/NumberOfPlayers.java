package com.kodilla.tictactoe;

import java.util.Scanner;

public class NumberOfPlayers {
    public int numberOfPlayers() {
        System.out.println("Choose Game Mode: ");
        System.out.println("One Player (Press '1')");
        System.out.println("Two Players (Press '2')");
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            choice = input.nextInt();
        }
        while ((input.nextInt() < 1 && input.nextInt() > 2));
        return choice;
    }
}
