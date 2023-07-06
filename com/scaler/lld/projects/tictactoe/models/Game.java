package com.scaler.lld.projects.tictactoe.models;

import com.scaler.lld.projects.tictactoe.exceptions.InvalidGameConstructionException;
import com.scaler.lld.projects.tictactoe.strategies.winning.OrderNWinningStrategy;
import com.scaler.lld.projects.tictactoe.strategies.winning.WinningStrategy;

import java.util.Collections;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private GameStatus gameStatus;
    private int currPlayerIndex;
    private List<Move> moves;
    private WinningStrategy strategy;

    public Game(GameBuilder builder){
        this.players = builder.players;
        this.board = builder.board;
        this.gameStatus = builder.gameStatus;
        this.currPlayerIndex = builder.currPlayerIndex;
        this.moves = builder.moves;
        this.strategy = new OrderNWinningStrategy();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getCurrPlayer() {
        return this.players.get(currPlayerIndex);
    }

    public List<Move> getMoves() {
        return moves;
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public void makeMove(Player player, int row, int col) {
        //TODO handle scenario where player makes a move on a occupied cell
        //TODO handle draw scenario
        Cell cell = this.board.setPlayer(player, row, col);
        Move move = new Move(getCurrPlayer(), cell);
        moves.add(move);

        boolean playerHasWon = this.strategy.checkIfWon(this.board, move);
        if(playerHasWon){
            gameStatus = GameStatus.ENDED;
            return;
        }


        this.currPlayerIndex++;
        this.currPlayerIndex %= players.size();
    }

    public static class GameBuilder{
        private List<Player> players;
        private Board board;
        private GameStatus gameStatus;
        private int currPlayerIndex;
        private List<Move> moves;

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }


        public GameBuilder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }

        public GameBuilder setCurrPlayerIndex(int currPlayerIndex) {
            this.currPlayerIndex = currPlayerIndex;
            return this;
        }

        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Game build() throws InvalidGameConstructionException{
            if(this.players == null || this.players.size() <= 1){
                throw new InvalidGameConstructionException("Atleast 2 players required");
            }
            Collections.shuffle(this.players);
            this.board = new Board(this.players.size() + 1);
            return new Game(this);
        }
    }


}
