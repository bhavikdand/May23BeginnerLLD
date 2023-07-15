package com.scaler.lld.projects.parking_lot.models;

import java.util.Date;
import java.util.List;

public class Bill {
    private BaseModel baseModel;
    private double amount;
    Date entryTime;
    Date exitTime;
    Vehicle vehicle;
    List<Payment> payments;

    public Bill(BaseModel baseModel, double amount, Date entryTime, Date exitTime, Vehicle vehicle) {
        this.baseModel = baseModel;
        this.amount = amount;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "baseModel=" + baseModel +
                ", amount=" + amount +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", vehicle=" + vehicle +
                ", payments=" + payments +
                '}';
    }
}
