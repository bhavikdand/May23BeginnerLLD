package com.scaler.lld.projects.parking_lot.strategies.spot_assignment;

import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.models.*;
import com.scaler.lld.projects.parking_lot.repositories.ParkingLotRepository;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    //TODO get parking details from service
    private ParkingLotRepository repository;

    public NearestSpotAssignmentStrategy(ParkingLotRepository repository) {
        this.repository = repository;
    }

    @Override
    public Spot assignSpot(Vehicle vehicle, Gate gate) throws NoParkingSpotsFoundForVehicle, ParkingLotDoesntExists {
        ParkingLot parkingLot = repository.getParkingLotByGateId(gate.getBaseModel().getId());
        // TODO read and implement template pattern
        if(parkingLot != null){
            Spot availableSpot = getAvailableSpot(parkingLot, vehicle.getVehicleType());
            availableSpot.allocateSpot(vehicle);
            return availableSpot;
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
