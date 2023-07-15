package com.scaler.lld.projects.parking_lot.models;

public class Slab {
    private BaseModel baseModel;
    private VehicleType vehicleType;
    private PriceType priceType;
    private int startHour;
    private int endHour;
    private double multiplier;

    public Slab(BaseModel baseModel, VehicleType vehicleType, PriceType priceType, int startHour, int endHour, double multiplier) {
        this.baseModel = baseModel;
        this.vehicleType = vehicleType;
        this.priceType = priceType;
        this.startHour = startHour;
        this.endHour = endHour;
        this.multiplier = multiplier;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public PriceType getPriceType() {
        return priceType;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
