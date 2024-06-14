package com.kodilla.tictactoe;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Nested
    @DisplayName("Tests for method checkMovesTable - Win Scenarios")
    class TestsForDifferentWinScenarios {
        @Test
        public void testWinScenariosRow() {
            //Given
            Player player1 = new Player("Bogdan", 1);
            CheckIfItsWinner checkIfItsWinner = new CheckIfItsWinner();
            Board board = new Board();
            //When
            char[][] testArr = {{' ', ' ', ' '}, {'X', 'X', 'X'}, {' ', ' ', ' '}};
            board.setTwoD_board(testArr);
            //Then
            boolean expected = true;
            boolean actual = checkIfItsWinner.checkRows(player1, board);
            assertEquals(expected, actual);
        }

        @Test
        public void testWinScenariosColumn() {
            //Given
            Player player1 = new Player("Bogdan", 1);
            CheckIfItsWinner checkIfItsWinner = new CheckIfItsWinner();
            Board board = new Board();
            //When
            char[][] testArr = {{'X', ' ', ' '}, {'X', ' ', ' '}, {'X', ' ', ' '}};
            board.setTwoD_board(testArr);
            //Then
            boolean expected = true;
            boolean actual = checkIfItsWinner.checkCol(player1, board);
            assertEquals(expected, actual);
        }

        @Test
        public void testWinScenariosDiag() {
            //Given
            Player player1 = new Player("Bogdan", 1);
            CheckIfItsWinner checkIfItsWinner = new CheckIfItsWinner();
            Board board = new Board();
            //When
            char[][] testArr = {{' ', 'O', 'X'}, {' ', 'X', ' '}, {'X', ' ', 'O'}};
            board.setTwoD_board(testArr);
            //Then
            boolean expected = true;
            boolean actual = checkIfItsWinner.checkDiag(player1, board);
            assertEquals(expected, actual);
        }
        @Test
        public void testWinScenariosDiagReverse() {
            //Given
            Player player1 = new Player("Bogdan", 1);
            CheckIfItsWinner10 checkIfItsWinner = new CheckIfItsWinner10();
            Board10 board = new Board10();
            //When
            char[][] testArr = {{' ', ' ', ' ', ' ', ' ', 'X',' ',' ',' ', ' '},
                                {' ', ' ', ' ', ' ', ' ', ' ','X',' ',' ', ' '},
                                {' ', ' ', ' ', ' ', ' ', ' ',' ','X',' ', ' '},
                                {' ', ' ', ' ', ' ', ' ', ' ',' ',' ',' ', ' '},
                                {'X', ' ', ' ', ' ', ' ', ' ',' ',' ',' ', 'X'},
                                {' ', 'X', ' ', ' ', ' ', ' ',' ',' ',' ', ' '},
                                {' ', ' ', 'X', ' ', ' ', ' ',' ',' ',' ', ' '},
                                {' ', ' ', ' ', 'X', ' ', ' ',' ',' ',' ', ' '},
                                {' ', ' ', ' ', ' ', 'X', ' ',' ',' ',' ', ' '},
                                {' ', ' ', ' ', ' ', ' ', ' ',' ',' ',' ', ' '}};
            board.setTwoD_board(testArr);
            //Then
            boolean expected = true;
            boolean actual = checkIfItsWinner.checkDiagReverse(player1, board);
            assertEquals(expected, actual);
        }
        /*
        @Nested
        @DisplayName("Tests for method checkMovesTable - Tie Scenario")
        class TestsForTieScenario {
            @Test
            public void testTieScenariosRow() {

            }
        }

        @Nested
        @DisplayName("Tests for class Board - Exception test")
        class TestForException {
            @Test
            public void testException() throws FieldIsOccupiedException {
                //Given
                Player player1 = new Player("Tom", 1);
                Player player2 = new Player("Bob", 1);
                Board board = new Board();
                char[][] emptyArr = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
                board.setTwoD_board(emptyArr);
                //When
                board.setTwoD_board(5, player1);
                //Then
                assertThrows(FieldIsOccupiedException.class, () -> board.setTwoD_board(5, player2));
            }
        }*/
    }
}
