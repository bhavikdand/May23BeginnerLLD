package com.scaler.lld.projects.tictactoe.exceptions;

public class InvalidGameConstructionException extends Exception{

    public InvalidGameConstructionException() {
    }

    public InvalidGameConstructionException(String message) {
        super(message);
    }
}
