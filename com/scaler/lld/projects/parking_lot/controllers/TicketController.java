package com.scaler.lld.projects.parking_lot.controllers;

import com.scaler.lld.projects.parking_lot.dtos.GenerateTicketRequestDTO;
import com.scaler.lld.projects.parking_lot.exceptions.GateNotFoundException;
import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.models.Ticket;
import com.scaler.lld.projects.parking_lot.services.TicketService;

public class TicketController {


    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(GenerateTicketRequestDTO requestDTO) throws ParkingLotDoesntExists, NoParkingSpotsFoundForVehicle, GateNotFoundException {
        return ticketService.generateTicket(requestDTO.getVehicleNumber(), requestDTO.getVehicleType(), requestDTO.getGateId());
    }
}
