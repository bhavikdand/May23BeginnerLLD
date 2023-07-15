package com.scaler.lld.projects.parking_lot.models;

public class BasePrice {
    private BaseModel baseModel;
    private VehicleType vehicleType;
    private double amount;
    private PriceType priceType;

    public BasePrice(BaseModel baseModel, VehicleType vehicleType, double amount, PriceType priceType) {
        this.baseModel = baseModel;
        this.vehicleType = vehicleType;
        this.amount = amount;
        this.priceType = priceType;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public double getAmount() {
        return amount;
    }

    public PriceType getPriceType() {
        return priceType;
    }
}
