package com.exercise.cleancode;

import java.util.ArrayList;
import java.util.List;

public class chapter0 {
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;


    //代码模糊度
    List<int[]> theList;

    public List<int[]> getItem(){
        List<int[]> list1 = new ArrayList<>();
        for (int[] x :theList){
            if (x[0] == 4){
                list1.add(x);
            }
        }
        return list1;

    }
    List<int[]> gameBoard;

    int STAUTU_VALUES = 0;
    int FLAGGED = 4;


    public List<int[]> getFlaggedCells(){
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell:gameBoard){
            if (cell[STAUTU_VALUES] == FLAGGED){
                flaggedCells.add(cell);

            }
        }
        return flaggedCells;
    }


    //
//    Cell gameBoardOther = new Cell(gameBoard);
    public List<Cell> getgetFlaggedCells(){
        List<Cell> flaggedCells = new ArrayList<Cell>();
        Cell[] gameBoardOther = new Cell[0];
        for (Cell cell:gameBoardOther){
            if (cell.isFlagged()){
                flaggedCells.add(cell);
            }

        }
        return flaggedCells;
    }
}


class Cell{
    private int[] cell;

    Cell(int[] cell) {
        this.cell = cell;
    }

    public int[] getCell() {
        return cell;
    }

    public void setCell(int[] cell) {
        this.cell = cell;
    }

    public boolean isFlagged(){
        return true;
    }
}
