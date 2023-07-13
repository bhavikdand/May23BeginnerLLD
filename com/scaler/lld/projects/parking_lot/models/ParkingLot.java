package com.scaler.lld.projects.parking_lot.models;

import java.util.List;

public class ParkingLot  {
    private BaseModel baseModel;
    List<Floor> floors;
    List<Gate> entryGates;
    List<ExitGate> exitGates;

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }

    public ParkingLot(BaseModel baseModel, List<Floor> floors, List<Gate> entryGates) {
        this.baseModel = baseModel;
        this.floors = floors;
        this.entryGates = entryGates;
    }
}
