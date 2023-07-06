package com.scaler.lld.design_patterns.observer;

public class UserServiceOrderPlacedEventHandler implements OrderPlacedEventHandler {
    public UserServiceOrderPlacedEventHandler() {
        Amazon.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Triggering user service");
    }

    public void unregister(){
        System.out.println("Unregistering user service order handler");
        Amazon.getInstance().unregister(this);
    }
}
