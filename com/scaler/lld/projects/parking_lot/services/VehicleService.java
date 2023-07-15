package com.scaler.lld.projects.parking_lot.services;

import com.scaler.lld.projects.parking_lot.models.Vehicle;
import com.scaler.lld.projects.parking_lot.models.VehicleType;
import com.scaler.lld.projects.parking_lot.repositories.VehicleRepository;

public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicleByNumber(String vehicleNumber){
        return vehicleRepository.getVehicleByNumber(vehicleNumber);
    }

    public Vehicle insertVehicle(String vehicleNumber, VehicleType vehicleType){
        return vehicleRepository.insertVehicle(vehicleNumber, vehicleType);
    }

    public Vehicle insertIfNotExists(String vehicleNumber, VehicleType vehicleType){
        Vehicle vehicleByNumber = getVehicleByNumber(vehicleNumber);
        if(vehicleByNumber == null){
            return insertVehicle(vehicleNumber, vehicleType);
        }
        return vehicleByNumber;
    }
}
