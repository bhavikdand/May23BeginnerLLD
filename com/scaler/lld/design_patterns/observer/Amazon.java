package com.scaler.lld.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static Amazon INSTANCE = null;
    private Amazon(){

    }

    public static Amazon getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Amazon();
        }
        return INSTANCE;
    }
    List<OrderPlacedEventHandler> handlers = new ArrayList<>();

    public void register(OrderPlacedEventHandler handler){
        handlers.add(handler);
    }

    public void unregister(OrderPlacedEventHandler handler){
        handlers.remove(handler);
    }

    public void placeOrder(){
        for (OrderPlacedEventHandler handler : handlers) {
            handler.handle();
        }
    }
}
