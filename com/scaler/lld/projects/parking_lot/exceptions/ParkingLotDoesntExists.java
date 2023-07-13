package com.scaler.lld.projects.parking_lot.exceptions;

public class ParkingLotDoesntExists extends Exception{
    public ParkingLotDoesntExists() {
        super("Parking lot doesn't exists!");
    }
}
