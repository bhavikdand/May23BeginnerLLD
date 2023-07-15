package com.scaler.lld.projects.parking_lot.factories;

import com.scaler.lld.projects.parking_lot.repositories.BasePriceRepository;
import com.scaler.lld.projects.parking_lot.repositories.SlabRepository;
import com.scaler.lld.projects.parking_lot.strategies.pricing_strategy.PricingStrategy;
import com.scaler.lld.projects.parking_lot.strategies.pricing_strategy.WeekdayPricingStrategy;
import com.scaler.lld.projects.parking_lot.strategies.pricing_strategy.WeekendPricingStrategy;
import com.scaler.lld.projects.parking_lot.utils.DateTimeUtils;

import java.util.Calendar;
import java.util.Date;

public class PricingStrategyFactory {

    private BasePriceRepository basePriceRepository;
    private SlabRepository slabRepository;

    public PricingStrategyFactory(BasePriceRepository basePriceRepository, SlabRepository slabRepository) {
        this.basePriceRepository = basePriceRepository;
        this.slabRepository = slabRepository;
    }

    public PricingStrategy getPricingStrategy(Date endTime){
        return DateTimeUtils.isWeekend(endTime) ? new WeekendPricingStrategy(basePriceRepository, slabRepository): new WeekdayPricingStrategy();
    }


}
