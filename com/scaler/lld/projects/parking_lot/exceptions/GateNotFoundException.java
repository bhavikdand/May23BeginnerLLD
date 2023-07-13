package com.scaler.lld.projects.parking_lot.exceptions;

public class GateNotFoundException extends Exception{

    public GateNotFoundException() {
        super("Gate not found");
    }
}
