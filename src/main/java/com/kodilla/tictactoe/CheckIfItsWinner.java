package com.kodilla.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class CheckIfItsWinner {
    List<Integer> firstRow = new ArrayList<Integer>();
    List<Integer> secondRow = new ArrayList<Integer>();
    List<Integer> thirdRow = new ArrayList<Integer>();
    List<Integer> firstColumn = new ArrayList<Integer>();
    List<Integer> secondColumn = new ArrayList<Integer>();
    List<Integer> thirdColumn = new ArrayList<Integer>();
    List<Integer> firstSlash = new ArrayList<Integer>();
    List<Integer> secondSlash = new ArrayList<Integer>();


    public void setMovesTable(int input) {
        //adding inputs
        switch (input) {
            case 7:
                firstRow.add(input);
                firstColumn.add(input);
                firstSlash.add(input);
                break;
            case 8:
                firstRow.add(input);
                secondColumn.add(input);
                break;
            case 9:
                firstRow.add(input);
                thirdColumn.add(input);
                secondSlash.add(input);
                break;
            case 4:
                secondRow.add(input);
                firstColumn.add(input);
                break;
            case 5:
                secondRow.add(input);
                secondColumn.add(input);
                firstSlash.add(input);
                secondSlash.add(input);
                break;
            case 6:
                secondRow.add(input);
                thirdColumn.add(input);
                break;
            case 1:
                thirdRow.add(input);
                firstColumn.add(input);
                secondSlash.add(input);
                break;
            case 2:
                thirdRow.add(input);
                secondColumn.add(input);
                break;
            case 3:
                thirdRow.add(input);
                thirdColumn.add(input);
                firstSlash.add(input);
                break;
        }
    }

    public boolean checkMovesTable() {
        if(firstRow.size() == 3 || secondRow.size() == 3 || thirdRow.size() == 3 || firstColumn.size() == 3 || secondColumn.size() == 3 || thirdColumn.size() == 3 || firstSlash.size() == 3 || secondSlash.size() == 3){
            return true;
        }
        return false;
    }
}
