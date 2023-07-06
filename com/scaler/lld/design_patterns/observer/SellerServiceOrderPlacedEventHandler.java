package com.scaler.lld.design_patterns.observer;

public class SellerServiceOrderPlacedEventHandler implements OrderPlacedEventHandler{

    public SellerServiceOrderPlacedEventHandler() {
        Amazon.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Triggering seller service");
    }

    public void unregister(){
        System.out.println("Unregistering seller service order handler");
        Amazon.getInstance().unregister(this);
    }
}
