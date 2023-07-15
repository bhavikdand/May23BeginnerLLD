package com.scaler.lld.projects.parking_lot.repositories;

import com.scaler.lld.projects.parking_lot.models.PriceType;
import com.scaler.lld.projects.parking_lot.models.Slab;
import com.scaler.lld.projects.parking_lot.models.VehicleType;

import java.util.*;

public class SlabRepository {

    private Map<Integer, Slab> map;

    public SlabRepository(Map<Integer, Slab> map) {
        this.map = map;
    }

    public SlabRepository() {
    }

    public List<Slab> getSlabsByVehicleAndPriceType(VehicleType vehicleType, PriceType priceType){
        List<Slab> list = new ArrayList<>();
        for (Map.Entry<Integer, Slab> entry : map.entrySet()) {
            Slab slab = entry.getValue();
            if(slab.getVehicleType().equals(vehicleType) && slab.getPriceType().equals(priceType)){
                list.add(slab);
            }
        }
        //Sort the list
        //TODO read up about Comparable and Comparator
        Collections.sort(list, new Comparator<Slab>() {
            @Override
            public int compare(Slab o1, Slab o2) {
                return o1.getStartHour() - o2.getStartHour();
            }
        });
        return list;
    }
}
