package com.scaler.lld.projects.tictactoe.strategies.bot;

import com.scaler.lld.projects.tictactoe.models.Board;
import com.scaler.lld.projects.tictactoe.models.Move;
import com.scaler.lld.projects.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
