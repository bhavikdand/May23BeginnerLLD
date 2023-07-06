package com.scaler.lld.design_patterns.observer;

public class AnalyticsServiceOrderEventHandler implements OrderPlacedEventHandler{

    public AnalyticsServiceOrderEventHandler() {
        Amazon.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Triggering Analytics service");
    }


}
