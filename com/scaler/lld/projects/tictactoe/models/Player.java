package com.scaler.lld.projects.tictactoe.models;

import java.util.Scanner;

public class Player {

    protected String name;
    protected Character symbol;

    public Player(String name, Character symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public Character getSymbol() {
        return symbol;
    }

    public Move makeMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println(getName() + "'s turn, give row and col");
        // Input row and col from user
        // For validations, we will need to check if we can make a move or not
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        Cell cell = board.setPlayer(this, row, col);
        Move move = new Move(this, cell);
        return move;
    }
}
