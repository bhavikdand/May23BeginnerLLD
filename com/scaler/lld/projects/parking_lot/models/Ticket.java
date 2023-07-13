package com.scaler.lld.projects.parking_lot.models;

import java.util.Date;

public class Ticket {
    private BaseModel baseModel;
    private String vehicleNumber;
    private Spot assignedSpot;
    private Date entryTime;

    public Ticket(BaseModel baseModel, String vehicleNumber, Spot assignedSpot, Date entryTime) {
        this.baseModel = baseModel;
        this.vehicleNumber = vehicleNumber;
        this.assignedSpot = assignedSpot;
        this.entryTime = entryTime;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Spot getAssignedSpot() {
        return assignedSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "baseModel=" + baseModel +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", assignedSpot=" + assignedSpot +
                ", entryTime=" + entryTime +
                '}';
    }
}
