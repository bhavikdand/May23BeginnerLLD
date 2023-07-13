package com.scaler.lld.projects.parking_lot.services;

import com.scaler.lld.projects.parking_lot.models.Gate;
import com.scaler.lld.projects.parking_lot.repositories.GateRepository;

public class GateService {

    private GateRepository gateRepository;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Gate getGateBytId(int gateId){
        return gateRepository.getGateById(gateId);
    }
}
