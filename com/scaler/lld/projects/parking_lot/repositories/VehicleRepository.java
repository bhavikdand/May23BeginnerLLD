package com.scaler.lld.projects.parking_lot.repositories;

import com.scaler.lld.projects.parking_lot.models.BaseModel;
import com.scaler.lld.projects.parking_lot.models.Vehicle;
import com.scaler.lld.projects.parking_lot.models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {

    private Map<Integer, Vehicle> map;
    private static int idSequence = 1;

    public VehicleRepository(Map<Integer, Vehicle> map) {
        this.map = map;
    }

    public VehicleRepository() {
        map = new HashMap<>();
    }

    public Vehicle getVehicleByNumber(String vehicleNumber){
        for (Map.Entry<Integer, Vehicle> entry : map.entrySet()) {
            Vehicle vehicle = entry.getValue();
            if(vehicle.getVehicleNumber().equals(vehicleNumber)){
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle insertVehicle(String vehicleNumber, VehicleType vehicleType){
        BaseModel baseModel = new BaseModel(idSequence);
        Vehicle vehicle = new Vehicle(baseModel, vehicleType, vehicleNumber);
        map.put(idSequence, vehicle);
        idSequence++;
        return vehicle;
    }
}
