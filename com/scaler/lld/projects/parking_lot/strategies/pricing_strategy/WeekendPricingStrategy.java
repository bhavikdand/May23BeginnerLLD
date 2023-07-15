package com.scaler.lld.projects.parking_lot.strategies.pricing_strategy;

import com.scaler.lld.projects.parking_lot.models.BasePrice;
import com.scaler.lld.projects.parking_lot.models.PriceType;
import com.scaler.lld.projects.parking_lot.models.Slab;
import com.scaler.lld.projects.parking_lot.models.VehicleType;
import com.scaler.lld.projects.parking_lot.repositories.BasePriceRepository;
import com.scaler.lld.projects.parking_lot.repositories.SlabRepository;
import com.scaler.lld.projects.parking_lot.utils.DateTimeUtils;

import java.util.Date;
import java.util.List;

public class WeekendPricingStrategy implements PricingStrategy{

    private BasePriceRepository basePriceRepository;
    private SlabRepository slabRepository;

    public WeekendPricingStrategy(BasePriceRepository basePriceRepository, SlabRepository slabRepository) {
        this.basePriceRepository = basePriceRepository;
        this.slabRepository = slabRepository;
    }

    @Override
    public double calculateAmount(VehicleType vehicleType, Date entryTime, Date exitTime) {
        BasePrice basePrice = basePriceRepository.getBasePriceByVehicleAndPriceType(vehicleType, PriceType.WEEKEND);
        List<Slab> slabs = slabRepository.getSlabsByVehicleAndPriceType(vehicleType, PriceType.WEEKEND);
        double amount = 0;
        int numberOfHoursSpent = DateTimeUtils.numberOfHoursSpent(entryTime, exitTime);
        for (Slab slab : slabs) {
            if(numberOfHoursSpent >  slab.getEndHour()){
                amount += (slab.getEndHour() - slab.getStartHour()) * slab.getMultiplier() * basePrice.getAmount();
            } else if(slab.getEndHour() == -1 || numberOfHoursSpent <= slab.getEndHour()) {
                amount += (numberOfHoursSpent - slab.getStartHour()) * slab.getMultiplier() * basePrice.getAmount();
                break;
            }
        }
        return amount;
    }
}
