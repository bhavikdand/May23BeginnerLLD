package com.scaler.lld.projects.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;

    public Board(int dimension){
        cells = new ArrayList<>();
        for(int i=0; i<dimension; i++){
            ArrayList<Cell> row = new ArrayList<>();
            for(int j=0; j<dimension; j++){
                row.add(new Cell(i, j, CellState.EMPTY));
            }
            cells.add(row);
        }
    }

    public void displayBoard(){
        for(int i=0; i<cells.size(); i++){
            System.out.print("|");
            for(int j=0; j<cells.size(); j++){
                Cell cell = cells.get(i).get(j);
                if(cell.getCellState().equals(CellState.EMPTY)){
                    System.out.print(" _ ");
                } else {
                    System.out.print(" " + cell.getPlayer().getSymbol() + " ");
                }
            }
            System.out.println("|");
        }
    }

    public Cell setPlayer(Player player, int row, int col) {
        Cell cell = cells.get(row).get(col);
        return cell.setPlayer(player);
    }

    public List<List<Cell>> getCells() {
        return cells;
    }
}
