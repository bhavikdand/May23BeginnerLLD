package com.scaler.lld.projects.parking_lot.models;

public class EntryGate extends Gate{

    public EntryGate(BaseModel baseModel, String gateName) {
        super(baseModel, gateName);
    }

    public Ticket generateTicket(){
        return null;
    }
}
