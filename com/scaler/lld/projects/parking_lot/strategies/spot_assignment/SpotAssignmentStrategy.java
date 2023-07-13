package com.scaler.lld.projects.parking_lot.strategies.spot_assignment;

import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.models.Gate;
import com.scaler.lld.projects.parking_lot.models.Spot;
import com.scaler.lld.projects.parking_lot.models.VehicleType;

public interface SpotAssignmentStrategy {

    public Spot assignSpot(VehicleType vehicleType, Gate gate) throws NoParkingSpotsFoundForVehicle, ParkingLotDoesntExists;

}
