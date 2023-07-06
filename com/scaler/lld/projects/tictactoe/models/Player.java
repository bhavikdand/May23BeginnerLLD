package com.scaler.lld.projects.tictactoe.models;

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
}
