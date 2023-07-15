package com.scaler.lld.projects.parking_lot.repositories;

import com.scaler.lld.projects.parking_lot.models.BaseModel;
import com.scaler.lld.projects.parking_lot.models.Bill;
import com.scaler.lld.projects.parking_lot.models.Vehicle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BillRepository {

    private Map<Integer, Bill> map;

    public BillRepository(Map<Integer, Bill> map) {
        this.map = map;
    }

    public BillRepository() {
        map = new HashMap<>();
    }

    private static int idSequence = 1;

    public Bill createBill(Date entryTime, Date exitTime, double amount, Vehicle vehicle){
        BaseModel baseModel = new BaseModel(idSequence);
        Bill bill = new Bill(baseModel, amount, entryTime, exitTime, vehicle);
        map.put(idSequence, bill);
        idSequence++;
        return bill;
    }
}
