package com.scaler.lld.projects.tictactoe.controller;

import com.scaler.lld.projects.tictactoe.exceptions.InvalidGameConstructionException;
import com.scaler.lld.projects.tictactoe.models.Game;
import com.scaler.lld.projects.tictactoe.models.GameStatus;
import com.scaler.lld.projects.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public Game createGame(List<Player> players) throws InvalidGameConstructionException {
        Game game = Game.getBuilder()
                .setPlayers(players)
                .setGameStatus(GameStatus.IN_PROGRESS)
                .setMoves(new ArrayList<>())
                .setCurrPlayerIndex(0)
                .build();

        return game;
    }

    public void makeMove(Game game, Player player, int row, int col){
        game.makeMove(player, row, col);
    }

    //Break for 7 mins: 8:38 AM

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void undo(){

    }

    public void displayBoard(Game game){
        game.getBoard().displayBoard();
    }

    public Player getCurrentPlayer(Game game){
        return game.getCurrPlayer();
    }


}
