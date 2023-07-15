package com.scaler.lld.projects.parking_lot.services;

import com.scaler.lld.projects.parking_lot.exceptions.GateNotFoundException;
import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.factories.PricingStrategyFactory;
import com.scaler.lld.projects.parking_lot.models.*;
import com.scaler.lld.projects.parking_lot.repositories.BillRepository;
import com.scaler.lld.projects.parking_lot.repositories.GateRepository;
import com.scaler.lld.projects.parking_lot.repositories.TicketRepository;
import com.scaler.lld.projects.parking_lot.strategies.pricing_strategy.PricingStrategy;
import com.scaler.lld.projects.parking_lot.strategies.spot_assignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private SpotAssignmentStrategy spotAssignmentStrategy;
    private GateService gateService;
    private  TicketRepository ticketRepository;
    private VehicleService vehicleService;
    private BillRepository billRepository;
    private PricingStrategyFactory pricingStrategyFactory;

    public TicketService(SpotAssignmentStrategy spotAssignmentStrategy, GateService gateService, TicketRepository ticketRepository, VehicleService vehicleService, BillRepository billRepository, PricingStrategyFactory pricingStrategyFactory) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.gateService = gateService;
        this.ticketRepository = ticketRepository;
        this.vehicleService = vehicleService;
        this.billRepository = billRepository;
        this.pricingStrategyFactory = pricingStrategyFactory;
    }

    public Ticket generateTicket(String vehicleNumber,
                                 VehicleType vehicleType, int gateId) throws ParkingLotDoesntExists, NoParkingSpotsFoundForVehicle, GateNotFoundException {

        Gate gate = gateService.getGateBytId(gateId);

        if(gate == null){
            throw new GateNotFoundException();
        }

        Vehicle vehicle = vehicleService.insertIfNotExists(vehicleNumber, vehicleType);
        Spot spot;

        try {
           spot = spotAssignmentStrategy.assignSpot(vehicle, gate);
        } catch (Exception e) {
            throw e;
        }

        Date entryTime = new Date();
        Ticket ticket = ticketRepository.createTicket(vehicleNumber, spot, entryTime);
        System.out.println("Ticket: " + ticket);
        return ticket;
    }


    //TODO move this to BillService
    public Bill generateBill(Ticket ticket){
        Vehicle vehicle = vehicleService.getVehicleByNumber(ticket.getVehicleNumber());
        Date exitTime = new Date();
        /**
         * if today is weekday
         *      this.pricingStrategy = new WeekdayPricingStategy()
         *      pricingStrategy.calculateAmount()
         *  else if today is weekend:
         *      this.pricingStrategy = new WeekendPricingStategy()
         *      pricingStrategy.calculateAmount()
         *
         *  This type of implementation will lead to OCP and SRP violations, hence we are using
         *  factory to get object of pricing strategy
         */
        PricingStrategy pricingStrategy = pricingStrategyFactory.getPricingStrategy(exitTime);
        double amount = pricingStrategy.calculateAmount(vehicle.getVehicleType(), ticket.getEntryTime(), exitTime);
        return billRepository.createBill(ticket.getEntryTime(), exitTime, amount, vehicle);
    }

}
