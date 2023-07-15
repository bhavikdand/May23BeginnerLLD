package com.scaler.lld.projects.parking_lot;

import com.scaler.lld.projects.parking_lot.controllers.TicketController;
import com.scaler.lld.projects.parking_lot.dtos.GenerateBillRequestDTO;
import com.scaler.lld.projects.parking_lot.dtos.GenerateTicketRequestDTO;
import com.scaler.lld.projects.parking_lot.exceptions.GateNotFoundException;
import com.scaler.lld.projects.parking_lot.exceptions.NoParkingSpotsFoundForVehicle;
import com.scaler.lld.projects.parking_lot.exceptions.ParkingLotDoesntExists;
import com.scaler.lld.projects.parking_lot.factories.PricingStrategyFactory;
import com.scaler.lld.projects.parking_lot.models.*;
import com.scaler.lld.projects.parking_lot.repositories.*;
import com.scaler.lld.projects.parking_lot.services.GateService;
import com.scaler.lld.projects.parking_lot.services.TicketService;
import com.scaler.lld.projects.parking_lot.services.VehicleService;
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

        BasePrice basePrice = new BasePrice(new BaseModel(1), VehicleType.CAR, 20, PriceType.WEEKEND);

        Map<Integer, BasePrice> basePriceMap = new HashMap<Integer, BasePrice>(){{
            put(basePrice.getBaseModel().getId(), basePrice);
        }};
        BasePriceRepository basePriceRepository  =new BasePriceRepository(basePriceMap);

        Slab slab1 = new Slab(new BaseModel(1), VehicleType.CAR, PriceType.WEEKEND, 0, 2, 1.2);
        Slab slab2 = new Slab(new BaseModel(2), VehicleType.CAR, PriceType.WEEKEND, 2, 6, 1.5);
        Slab slab3 = new Slab(new BaseModel(3), VehicleType.CAR, PriceType.WEEKEND, 6, -1, 2);
        Map<Integer, Slab> slabMap = new HashMap<Integer, Slab>(){{
            put(slab1.getBaseModel().getId(), slab1);
            put(slab2.getBaseModel().getId(), slab2);
            put(slab3.getBaseModel().getId(), slab3);
        }};
        SlabRepository slabRepository = new SlabRepository(slabMap);


        GateRepository gateRepository = new GateRepository(gateMap);
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(parkingLotMap);

        GateService gateService = new GateService(gateRepository);
        SpotAssignmentStrategy spotAssignmentStrategy = new NearestSpotAssignmentStrategy(parkingLotRepository);
        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService(vehicleRepository);

        PricingStrategyFactory pricingStrategyFactory = new PricingStrategyFactory(basePriceRepository, slabRepository);

        TicketService ticketService = new TicketService(spotAssignmentStrategy, gateService, ticketRepository, vehicleService, new BillRepository(), pricingStrategyFactory);
        TicketController controller = new TicketController(ticketService);
        GenerateTicketRequestDTO requestDTO = new GenerateTicketRequestDTO("123", VehicleType.CAR, 1);
        Ticket ticket = controller.generateTicket(requestDTO);
        System.out.println(ticket);

        Bill bill = controller.generateBill(new GenerateBillRequestDTO(ticket));
        System.out.println(bill);
    }
}
