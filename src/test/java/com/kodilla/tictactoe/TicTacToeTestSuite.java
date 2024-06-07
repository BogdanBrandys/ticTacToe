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
            CheckIfItsWinner testCheckIfItsWinner = new CheckIfItsWinner();
            //When
            testCheckIfItsWinner.setMovesTable(7);
            testCheckIfItsWinner.setMovesTable(8);
            testCheckIfItsWinner.setMovesTable(9);
            //Then
            boolean expected = true;
            boolean actual = testCheckIfItsWinner.checkMovesTable();
            assertEquals(expected, actual);
        }

        @Test
        public void testWinScenariosColumn() {
            //Given
            CheckIfItsWinner testCheckIfItsWinner = new CheckIfItsWinner();
            //When
            testCheckIfItsWinner.setMovesTable(7);
            testCheckIfItsWinner.setMovesTable(4);
            testCheckIfItsWinner.setMovesTable(1);
            //Then
            boolean expected = true;
            boolean actual = testCheckIfItsWinner.checkMovesTable();
            assertEquals(expected, actual);
        }

        @Test
        public void testWinScenariosSlash() {
            //Given
            CheckIfItsWinner testCheckIfItsWinner = new CheckIfItsWinner();
            //When
            testCheckIfItsWinner.setMovesTable(7);
            testCheckIfItsWinner.setMovesTable(5);
            testCheckIfItsWinner.setMovesTable(3);
            //Then
            boolean expected = true;
            boolean actual = testCheckIfItsWinner.checkMovesTable();
            assertEquals(expected, actual);
        }

        @Nested
        @DisplayName("Tests for method checkMovesTable - Tie Scenario")
        class TestsForTieScenario {
            @Test
            public void testTieScenariosRow() {
                //Given
                CheckIfItsWinner testCheckIfItsWinner1 = new CheckIfItsWinner();
                CheckIfItsWinner testCheckIfItsWinner2 = new CheckIfItsWinner();
                //When
                testCheckIfItsWinner1.setMovesTable(7);
                testCheckIfItsWinner1.setMovesTable(8);
                testCheckIfItsWinner1.setMovesTable(9);
                testCheckIfItsWinner2.setMovesTable(4);
                testCheckIfItsWinner2.setMovesTable(5);
                testCheckIfItsWinner2.setMovesTable(6);
                //Then
                boolean expected = true;
                boolean actual = testCheckIfItsWinner1.checkMovesTable() && testCheckIfItsWinner2.checkMovesTable();
                assertEquals(expected, actual);
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
        }
    }
}
