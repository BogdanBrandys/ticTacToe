package com.kodilla.tictactoe;
import java.util.Scanner;

public class TicTacToeApplication {
	public static void main(String[] args) {
		GameRanking gameRanking = new GameRanking();
		gameRanking.HashMapFromTextFile();
		int playersNr;
		int boardSize;
		Player player1;
		Player player2;
		Tutorial tutorial = new Tutorial();
		tutorial.howToPlay();
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
				do {
					int iterator = 0;
					iterator++;
					System.out.println("Game no. " + iterator);
					System.out.println("Player 1 Score: " + player1.getNumberOfWinMatches());
					System.out.println("Player 2 Score: " + player2.getNumberOfWinMatches());
					TwoPlayersMode twoPlayersMode = new TwoPlayersMode();
					System.out.println(twoPlayersMode.GameEngine(player1, player2));
					if(player1.getNumberOfWinMatches() == 3 || player2.getNumberOfWinMatches() == 3){
						if(player1.getNumberOfWinMatches() == 3){
							System.out.println("Player 1 Wins!" + "Entering your name into ranking table");
							gameRanking.addPlayerToRanking(player1.getPlayerName(), (long)player1.getNumberOfWinMatches());
						} else if(player2.getNumberOfWinMatches() == 3){
							System.out.println("Player 2 Wins!" + "Entering your name into ranking table");
							gameRanking.addPlayerToRanking(player2.getPlayerName(), (long)player2.getNumberOfWinMatches());
						}
						break;
					}
				}while (player1.getNumberOfWinMatches() != 3 || player2.getNumberOfWinMatches() != 3);
			} else {
				do {
					int iterator = 0;
					iterator++;
					System.out.println("Game no. " + iterator);
					System.out.println("Player 1 Score: " + player1.getNumberOfWinMatches());
					System.out.println("Player 2 Score: " + player2.getNumberOfWinMatches());
					TwoPlayerModeBoard10 twoPlayerModeBoard10 = new TwoPlayerModeBoard10();
					System.out.println(twoPlayerModeBoard10.GameEngine10(player1, player2));
					if(player1.getNumberOfWinMatches() == 3 || player2.getNumberOfWinMatches() == 3){
						if(player1.getNumberOfWinMatches() == 3){
							System.out.println("Player 1 Wins!" + "Entering your name into ranking table");
							gameRanking.addPlayerToRanking(player1.getPlayerName(), (long)player1.getNumberOfWinMatches());
						} else if(player2.getNumberOfWinMatches() == 3){
							System.out.println("Player 2 Wins!" + "Entering your name into ranking table");
							gameRanking.addPlayerToRanking(player2.getPlayerName(), (long)player2.getNumberOfWinMatches());
						}
						break;
					}
				} while (player1.getNumberOfWinMatches() != 3 || player2.getNumberOfWinMatches() != 3);
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
				do {
					int iterator = 0;
					iterator++;
					System.out.println("Game no. " + iterator);
					System.out.println("Player 1 Score: " + player1.getNumberOfWinMatches());
					System.out.println("Player 2 Score: " + player2.getNumberOfWinMatches());
					OnePlayerMode onePlayerMode = new OnePlayerMode();
					System.out.println(onePlayerMode.GameEngine(player1, player2));
					if(player1.getNumberOfWinMatches() == 3 || player2.getNumberOfWinMatches() == 3){
						if(player1.getNumberOfWinMatches() == 3){
							System.out.println("Player 1 Wins! " + "Enter your name into ranking table");
							gameRanking.addPlayerToRanking(player1.getPlayerName(), (long)player1.getNumberOfWinMatches());
						} else if(player2.getNumberOfWinMatches() == 3){
							System.out.println("Computer Player Wins!");
						}
						break;
					}
				}while (true);
			} else {
				do {
					int iterator = 0;
					iterator++;
					System.out.println("Game no. " + iterator);
					System.out.println("Player 1 Score: " + player1.getNumberOfWinMatches());
					System.out.println("Player 2 Score: " + player2.getNumberOfWinMatches());
					OnePlayerModeBoard10 onePlayerModeBoard10 = new OnePlayerModeBoard10();
					System.out.println(onePlayerModeBoard10.GameEngine10(player1, player2));
					if(player1.getNumberOfWinMatches() == 3 || player2.getNumberOfWinMatches() == 3){
						if(player1.getNumberOfWinMatches() == 3){
							System.out.println("Player 1 Wins!" + "Enter your name into ranking table");
							gameRanking.addPlayerToRanking(player1.getPlayerName(), (long)player1.getNumberOfWinMatches());
						} else if(player2.getNumberOfWinMatches() == 3){
							System.out.println("Computer Player Wins!");
						}
						break;
					}
				}while (true);
			}
			gameRanking.saveMap();
			gameRanking.HashMapFromTextFile();
			gameRanking.loadMap();
		}
	}
}
