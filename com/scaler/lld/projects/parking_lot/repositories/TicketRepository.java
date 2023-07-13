package com.scaler.lld.projects.parking_lot.repositories;

import com.scaler.lld.projects.parking_lot.models.BaseModel;
import com.scaler.lld.projects.parking_lot.models.Spot;
import com.scaler.lld.projects.parking_lot.models.Ticket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> map;
    private int idSequence = 1;

    public TicketRepository() {
        map = new HashMap<>();
    }

    public Ticket createTicket(String vehicleNumber, Spot assignedSpot, Date entryTime){
        BaseModel baseModel = new BaseModel(idSequence, new Date(), new Date());
        Ticket ticket = new Ticket(baseModel, vehicleNumber, assignedSpot, entryTime);
        map.put(idSequence, ticket);
        idSequence++;
        return ticket;
    }
}
