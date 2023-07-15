package com.scaler.lld.projects.parking_lot.strategies.pricing_strategy;

import com.scaler.lld.projects.parking_lot.models.VehicleType;

import java.util.Date;

public interface PricingStrategy {

    public double calculateAmount(VehicleType vehicleType, Date entryTime, Date exitTime);
}
