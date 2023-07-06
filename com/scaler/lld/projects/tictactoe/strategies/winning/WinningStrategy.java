package com.scaler.lld.projects.tictactoe.strategies.winning;

import com.scaler.lld.projects.tictactoe.models.Board;
import com.scaler.lld.projects.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkIfWon(Board board, Move move);
}
