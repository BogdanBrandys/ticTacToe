package com.kodilla.tictactoe;
import java.util.Scanner;

public class TicTacToeApplication {
	public static void main(String[] args) {
		int playersNr;
		int boardSize;
		Player player1;
		Player player2;
		System.out.println("Welcome to TicTacToe!");
		NumberOfPlayers numberOfPlayers = new NumberOfPlayers();
		playersNr = numberOfPlayers.numberOfPlayers();
		GameMode gameMode = new GameMode();
		boardSize = gameMode.chooseGameMode();
		//two players
		if (playersNr == 2) {
			String name1;
			String name2;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please, Enter the first Player name (max 8 characters): ");
			do{
				try{
					name1 = scanner.nextLine();
					if(name1.length()>0 && name1.length()<9){
						break;
					} else{
						System.out.println("Please enter a valid name (max 8 characters): ");
					}
				} catch(Exception e){
					System.out.println("Please enter a valid name (max 8 characters): ");
				}
			}while(true);
			player1 = new Player(name1, 1);
			System.out.println("Please, Enter the second Player name (max 8 characters): ");
			do{
				try{
					name2 = scanner.nextLine();
					if(name2.length()>0 && name2.length()<9){
						break;
					} else{
						System.out.println("Please enter a valid name (max 8 characters): ");
					}
				} catch(Exception e){
					System.out.println("Please enter a valid name (max 8 characters): ");
				}
			}while(true);
			player2 = new Player(name2, 2);
			// game
			if (boardSize == 1) {
				TwoPlayersMode twoPlayersMode = new TwoPlayersMode();
				System.out.println(twoPlayersMode.GameEngine(player1, player2));
			} else {
				TwoPlayerModeBoard10 twoPlayerModeBoard10 = new TwoPlayerModeBoard10();
				System.out.println(twoPlayerModeBoard10.GameEngine10(player1, player2));
			}
			// game with computer
		} else {
			String name1;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please, Enter the first Player name: (max 8 characters):");
			do{
				try{
					name1 = scanner.nextLine();
					if(name1.length()>0 && name1.length()<9){
						break;
					} else{
						System.out.println("Please enter a valid name (max 8 characters): ");
					}
				} catch(Exception e){
					System.out.println("Please enter a valid name (max 8 characters): ");
				}
			}while(true);
			player1 = new Player(name1, 1);
			player2 = new Player("Computer", 2);
			// game
			if (boardSize == 1) {
				OnePlayerMode onePlayerMode = new OnePlayerMode();
				System.out.println(onePlayerMode.GameEngine(player1, player2));
			} else {
				OnePlayerModeBoard10 onePlayerModeBoard10 = new OnePlayerModeBoard10();
				System.out.println(onePlayerModeBoard10.GameEngine10(player1, player2));
			}
		}
	}
}
