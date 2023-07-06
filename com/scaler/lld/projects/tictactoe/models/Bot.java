package com.scaler.lld.projects.tictactoe.models;

public class Bot extends Player{
    private BotLevel level;

    public Bot(String name, Character symbol, BotLevel level) {
        super(name, symbol);
        this.level = level;
    }
}
