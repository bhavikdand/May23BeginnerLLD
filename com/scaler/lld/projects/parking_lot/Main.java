package com.scaler.lld.projects.parking_lot;

import com.scaler.lld.projects.parking_lot.controllers.TicketController;
import com.scaler.lld.projects.parking_lot.dtos.GenerateTicketRequestDTO;
import com.scaler.lld.projects.parking_lot.exceptions.GateNotFoundException;
import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.models.*;
import com.scaler.lld.projects.parking_lot.repositories.GateRepository;
import com.scaler.lld.projects.parking_lot.repositories.ParkingLotRepository;
import com.scaler.lld.projects.parking_lot.repositories.TicketRepository;
import com.scaler.lld.projects.parking_lot.services.GateService;
import com.scaler.lld.projects.parking_lot.services.TicketService;
import com.scaler.lld.projects.parking_lot.strategies.spot_assignment.NearestSpotAssignmentStrategy;
import com.scaler.lld.projects.parking_lot.strategies.spot_assignment.SpotAssignmentStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ParkingLotDoesntExists, NoParkingSpotsFoundForVehicle,
            GateNotFoundException {

        Spot spot1 = new Spot(new BaseModel(1), "A1", VehicleType.CAR);
        Spot spot2 = new Spot(new BaseModel(2), "A2", VehicleType.CAR);
        Spot spot3 = new Spot(new BaseModel(3), "A3", VehicleType.CAR);
        Spot spot4 = new Spot(new BaseModel(4), "A4", VehicleType.CAR);

        Floor floor1 = new Floor(new BaseModel(1), Arrays.asList(spot1, spot2), 1);
        Floor floor2 = new Floor(new BaseModel(2), Arrays.asList(spot3, spot4), 1);

        Gate gate1 = new Gate(new BaseModel(1), "G1");
        Gate gate2 = new Gate(new BaseModel(2), "G2");
        Map<Integer, Gate> gateMap = new HashMap<Integer, Gate>(){{
           put(gate1.getBaseModel().getId(), gate1);
           put(gate2.getBaseModel().getId(), gate2);
        }};

        ParkingLot parkingLot = new ParkingLot(new BaseModel(1),
                Arrays.asList(floor1,floor2), Arrays.asList(gate1, gate2));
        Map<Integer, ParkingLot> parkingLotMap = new HashMap<Integer, ParkingLot>(){{
            put(parkingLot.getBaseModel().getId(), parkingLot);
        }};


        GateRepository gateRepository = new GateRepository(gateMap);
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(parkingLotMap);

        GateService gateService = new GateService(gateRepository);
        SpotAssignmentStrategy spotAssignmentStrategy = new NearestSpotAssignmentStrategy(parkingLotRepository);


        TicketService ticketService = new TicketService(spotAssignmentStrategy, gateService, ticketRepository);
        TicketController controller = new TicketController(ticketService);
        GenerateTicketRequestDTO requestDTO = new GenerateTicketRequestDTO("123", VehicleType.CAR, 1);
        Ticket ticket = controller.generateTicket(requestDTO);
        System.out.println(ticket);
    }
}
