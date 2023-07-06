package com.scaler.lld.design_patterns.observer;

public class Client {

    public static void main(String[] args) {
        SellerServiceOrderPlacedEventHandler sellerServiceOrderPlacedEventHandler = new SellerServiceOrderPlacedEventHandler();
        UserServiceOrderPlacedEventHandler userServiceOrderPlacedEventHandler = new UserServiceOrderPlacedEventHandler();
        AnalyticsServiceOrderEventHandler analyticsServiceOrderEventHandler = new AnalyticsServiceOrderEventHandler();

        Amazon.getInstance().placeOrder();

        sellerServiceOrderPlacedEventHandler.unregister();
        System.out.println("====================");


        Amazon.getInstance().placeOrder();

    }
}
