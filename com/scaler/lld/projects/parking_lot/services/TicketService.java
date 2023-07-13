package com.scaler.lld.projects.parking_lot.services;

import com.scaler.lld.projects.parking_lot.exceptions.GateNotFoundException;
import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.models.Gate;
import com.scaler.lld.projects.parking_lot.models.Spot;
import com.scaler.lld.projects.parking_lot.models.Ticket;
import com.scaler.lld.projects.parking_lot.models.VehicleType;
import com.scaler.lld.projects.parking_lot.repositories.GateRepository;
import com.scaler.lld.projects.parking_lot.repositories.TicketRepository;
import com.scaler.lld.projects.parking_lot.strategies.spot_assignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private SpotAssignmentStrategy spotAssignmentStrategy;
    private GateService gateService;
    private  TicketRepository ticketRepository;

    public TicketService(SpotAssignmentStrategy spotAssignmentStrategy, GateService gateService, TicketRepository ticketRepository) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.gateService = gateService;
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(String vehicleNumber,
                                 VehicleType vehicleType, int gateId) throws ParkingLotDoesntExists, NoParkingSpotsFoundForVehicle, GateNotFoundException {

        Gate gate = gateService.getGateBytId(gateId);

        if(gate == null){
            throw new GateNotFoundException();
        }

        Spot spot;

        try {
           spot = spotAssignmentStrategy.assignSpot(vehicleType, gate);
        } catch (Exception e) {
            throw e;
        }

        //TODO Once spot is finalize, set a vehicle on it and mark it occupied

        Date entryTime = new Date();
        Ticket ticket = ticketRepository.createTicket(vehicleNumber, spot, entryTime);
        System.out.println("Ticket: " + ticket);
        return ticket;
    }
}
