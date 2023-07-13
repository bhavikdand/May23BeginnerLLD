package com.scaler.lld.projects.parking_lot.strategies.spot_assignment;

import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.models.*;
import com.scaler.lld.projects.parking_lot.repositories.ParkingLotRepository;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    private ParkingLotRepository repository;

    public NearestSpotAssignmentStrategy(ParkingLotRepository repository) {
        this.repository = repository;
    }

    @Override
    public Spot assignSpot(VehicleType vehicleType, Gate gate) throws NoParkingSpotsFoundForVehicle, ParkingLotDoesntExists {
        ParkingLot parkingLot = repository.getParkingLotByGateId(gate.getBaseModel().getId());
        if(parkingLot != null){
            return getAvailableSpot(parkingLot, vehicleType);
        }
        throw new ParkingLotDoesntExists();
    }

    private Spot getAvailableSpot(ParkingLot parkingLot, VehicleType vehicleType) throws NoParkingSpotsFoundForVehicle{
        for (Floor floor : parkingLot.getFloors()) {
            for (Spot spot : floor.getSpots()) {
                if(spot.getStatus().equals(SpotStatus.UNOCCUPIED) && spot.getSupportedVehicleType().equals(vehicleType)){
                    return spot;
                }
            }
        }
        throw new NoParkingSpotsFoundForVehicle("No parking spots available for " + vehicleType.name());
    }
}
