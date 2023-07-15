package com.scaler.lld.projects.parking_lot.models;

public class Vehicle {
    private BaseModel baseModel;
    private VehicleType vehicleType;
    private String vehicleNumber;

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Vehicle(BaseModel baseModel, VehicleType vehicleType, String vehicleNumber) {
        this.baseModel = baseModel;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }
}
