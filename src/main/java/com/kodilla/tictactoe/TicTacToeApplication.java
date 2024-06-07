package com.kodilla.tictactoe;
import java.util.Scanner;

public class TicTacToeApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe!");
		Player player1;
		Player player2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, Enter the first Player name: ");
		String name1 = scanner.nextLine();
		player1 = new Player(name1, 1);
		System.out.println("Please, Enter the second Player name: ");
		String name2 = scanner.nextLine();
		player2 = new Player(name2, 2);
		// game1
		TwoPlayersMode twoPlayersMode1 = new TwoPlayersMode();
		System.out.println(twoPlayersMode1.GameEngine(player1, player2));
		}
	}
