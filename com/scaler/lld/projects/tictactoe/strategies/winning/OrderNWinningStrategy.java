package com.scaler.lld.projects.tictactoe.strategies.winning;

import com.scaler.lld.projects.tictactoe.models.Board;
import com.scaler.lld.projects.tictactoe.models.Cell;
import com.scaler.lld.projects.tictactoe.models.CellState;
import com.scaler.lld.projects.tictactoe.models.Move;

import java.util.List;

public class OrderNWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkIfWon(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        List<Cell> cells = board.getCells().get(row);
        int count = 0;
        for(Cell cell: cells){
            if(cell.getCellState() == CellState.OCCUPIED &&
                    cell.getPlayer().getSymbol() == move.getPlayer().getSymbol()){
                count++;
            } else {
                break;
            }
        }
        if(count == cells.size()){
            return true;
        }


        count = 0;
        for(int j=0; j<cells.size(); j++){
            Cell cell = board.getCells().get(row).get(j);
            if(cell.getCellState() == CellState.OCCUPIED &&
                    cell.getPlayer().getSymbol() == move.getPlayer().getSymbol()){
                count++;
            } else {
                break;
            }
        }

        if(count == cells.size()){
            return true;
        }

        count = 0;
        if(row == col){
            // diagonal
            for(int i=0; i<board.getCells().size(); i++){
                Cell cell = board.getCells().get(i).get(i);
                if(cell.getCellState() == CellState.OCCUPIED &&
                        cell.getPlayer().getSymbol() == move.getPlayer().getSymbol()){
                    count++;
                } else {
                    break;
                }
            }
        }
        if(count == cells.size()){
            return true;
        }

        return false;
    }
}
