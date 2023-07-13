package com.scaler.lld.projects.parking_lot.models;

public class Spot {
    private BaseModel baseModel;
    private String spotName;
    private SpotStatus status;
    private Vehicle vehicle;
    private VehicleType supportedVehicleType;

    public Spot(BaseModel baseModel, String spotName, VehicleType supportedVehicleType) {
        this.baseModel = baseModel;
        this.spotName = spotName;
        this.status = SpotStatus.UNOCCUPIED;
        this.supportedVehicleType = supportedVehicleType;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public String getSpotName() {
        return spotName;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    @Override
    public String toString() {
        return "Spot{" +
                "baseModel=" + baseModel +
                ", spotName='" + spotName + '\'' +
                ", status=" + status +
                ", vehicle=" + vehicle +
                ", supportedVehicleType=" + supportedVehicleType +
                '}';
    }
}
